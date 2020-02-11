package com.thd.common.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.ws.rs.core.MediaType;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import static java.lang.Integer.parseInt;

public class SauceDispenseUtil {
	private static final Logger log = LogManager.getLogger(SauceDispenseUtil.class);
	
	public static void main(String[]a) {
		SauceDispenseUtil util = new SauceDispenseUtil();
		util.execute();
	}
	
	public void execute() {
		Integer remainingTests;
		Integer totalTests;
		Integer current = 0;
		long sleepTime = 10000;
		
		Reflections reflections = new Reflections("", new SubTypesScanner(false));
		Set<Class<?>> allClasses = reflections.getSubTypesOf(Object.class);
		
		Iterator<Class<?>> iterator = allClasses.iterator();
		while (iterator.hasNext()) {
			Class<?> c = iterator.next();
		    if (!c.getName().endsWith("IT")) {
		        iterator.remove();
		    }
		}
		totalTests = allClasses.size();
		if(totalTests <= 0) {
			log.error("No tests generated from feature files");
			return;
		} 
		
		try {
			SauceDispenseRequest request = new SauceDispenseRequest();
			if ("Sauce".equals(PropertyUtil.getProp().getProperty("DistributedMode"))) {
				request.setBuildId(GlobalAttributes.getBuildID());
				request.setReminingTests(allClasses.size());
				request.setConcurrency(new Integer(PropertyUtil.getProp().getProperty("execution.concurrency")));

				while(true){
					current = getConcurrency(request);
					log.debug("Available VM's   :: " + current);
					if(current > 0){
						log.info("Initial sauce poll is breaking here ....... ");
						break;
					}
					Thread.sleep(sleepTime);
					log.info("I am waiting to start");
				}
			} else {
				current = new Integer(PropertyUtil.getProp().getProperty("execution.concurrency"));
			}
			
			
			ThreadPoolExecutor executorPool = new ThreadPoolExecutor(current, current, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(totalTests));
			for (Class<?> testcase : allClasses) {
				executorPool.execute(new JunitRunner(testcase));
				Thread.sleep(50);				
			}
			while("Sauce".equals(PropertyUtil.getProp().getProperty("DistributedMode"))) {
				Thread.sleep(sleepTime);
				remainingTests = totalTests - (int)executorPool.getCompletedTaskCount();// change logic here
				log.info("SauceRunner: Test Cases not completed : "+remainingTests);
				if(remainingTests <= 0) {
					break;
				}
				request.setReminingTests(remainingTests);
				current = getConcurrency(request);
				executorPool.setCorePoolSize(current);
				executorPool.setMaximumPoolSize(current);
			}
			executorPool.shutdown();
			while (!executorPool.isTerminated()) {
			}
			log.info("All terminated" + current);
		} catch(Exception e) {
			log.error(e);
		}
		aggregateResults("target/cucumber_reports");
		aggregateXmlResults("target/cucumber_reports");
		
	}
	
	private static Integer getConcurrency(SauceDispenseRequest request) {
		
		String mediaType = MediaType.APPLICATION_JSON;
		Gson gson = new Gson();
		Client client = Client.create();
		try {
			String sauceDispenseUrl = PropertyUtil.getProp().getProperty("SauceDispenseUrl");
			WebResource resource = client.resource(sauceDispenseUrl);
			WebResource.Builder builder = resource.accept(mediaType);
			builder.type(mediaType);
			log.info(gson.toJson(request));
			ClientResponse res = builder.post(ClientResponse.class,gson.toJson(request));
			if(res.getStatus() == HttpStatus.SC_OK) {
				String responseData =  res.getEntity(String.class);
				SauceDispenseResponse response = gson.fromJson(responseData, SauceDispenseResponse.class);
				return response.getPoolSize();
			} 
		} catch (Exception ex) {
			log.error(ex);
		}
		return 0;
	}

	public void aggregateResults(String path) {
		StringBuilder finalJsonStr = new StringBuilder("[");

		final File folder = new File(path + "/results");
		for (final File file : folder.listFiles()) {
			if (file.getAbsolutePath().endsWith(".json")) {
				try (FileInputStream fis = new FileInputStream(file);
					 InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8)) {
					JSONArray jsonArry = (JSONArray) new JSONParser().parse(isr);
					JSONObject result = (JSONObject) jsonArry.get(0);
					JSONArray elements = (JSONArray) result.get("elements");
					JSONObject element = (JSONObject) elements.get(elements.size() - 1);
					result.put("name", element.get("name"));
					result.put("uri", ((String) result.get("uri")).replace(".feature", (new Random()).nextInt(10000) + ".feature"));
					JSONArray featureTags = (JSONArray) result.get("tags");
					if (featureTags != null && featureTags.size() > 0) {
						featureTags.removeIf(i -> ((String) ((JSONObject) i).get("name")).matches("(@AS-).*|(@BS-).*|(@[a-z, 0-9]).*"));
					}
					JSONArray scenarioTags = (JSONArray) element.get("tags");
					if (scenarioTags != null && scenarioTags.size() > 0) {
						scenarioTags.removeIf(i -> ((String) ((JSONObject) i).get("name")).matches("(@AS-).*|(@BS-).*|(@[a-z, 0-9]).*"));
					}
					String json = jsonArry.toJSONString();
					json = json.substring(1, json.length() - 1);
					finalJsonStr.append(json).append(",");
				} catch (IOException | ParseException e) {
					log.error("Exception occurred: ", e);
				}
			}
		}
		finalJsonStr.deleteCharAt(finalJsonStr.length()-1);
		finalJsonStr.append("]");
		try (FileWriter file = new FileWriter(path +"/cucumber.json")) {

			file.write(finalJsonStr.toString());
			file.flush();

		} catch (IOException e) {
			log.error("IOException occurred: ", e);
		}
	}

	public void aggregateXmlResults(String path) {
		StringBuilder finalXmlString = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		String testCaseString = "";

		int totalFailures = 0;
		int totalSkipped = 0;
		int totalTests = 0;
		float totalTime = 0;

		final File folder = new File(path + "/results");
		for (final File file : folder.listFiles()) {
			if (file.getAbsolutePath().endsWith(".xml")) {
				try (FileInputStream fis = new FileInputStream(file);
					 InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8)) {

					DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
					DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
					Document doc = docBuilder.parse(new InputSource(isr));

					Node testSuiteNode = doc.getElementsByTagName("testsuite").item(0);

					totalFailures += parseInt(testSuiteNode.getAttributes().getNamedItem("failures").getNodeValue());
					totalSkipped += parseInt(testSuiteNode.getAttributes().getNamedItem("skipped").getNodeValue());
					totalTests += parseInt(testSuiteNode.getAttributes().getNamedItem("tests").getNodeValue());
					totalTime += Float.valueOf(testSuiteNode.getAttributes().getNamedItem("time").getNodeValue());

					TransformerFactory transformerFactory = TransformerFactory.newInstance();
					Transformer transformer = transformerFactory.newTransformer();
					DOMSource source = new DOMSource(doc);
					StringWriter outWriter = new StringWriter();
					StreamResult result = new StreamResult(outWriter);
					transformer.transform(source, result);
					String requestString = result.getWriter().toString();

					//log.info("Request String = " + requestString);

					String testCase = requestString.substring(requestString.indexOf("<testcase"), requestString.indexOf("</testsuite>"));

					testCaseString = testCaseString.concat(testCase);

				} catch (Exception e) {
					log.error("Exception occurred during result aggregation:", e);
				}
			}
		}

		finalXmlString = finalXmlString.append("<testsuite failures=\"" + totalFailures + "\" name=\"" + PropertyUtil.getProp().getProperty("app.name") + "\" skipped=\"" + totalSkipped + "\" tests=\"" + totalTests + "\" time=\"" + totalTime + "\">");
		finalXmlString = finalXmlString.append(testCaseString);
		finalXmlString = finalXmlString.append("</testsuite>");

		try (FileWriter file = new FileWriter(path +"/junit.xml")) {

			file.write(finalXmlString.toString());
			file.flush();

		} catch (IOException e) {
			log.error("IOException occurred: ", e);
		}
	}
	
	

}
