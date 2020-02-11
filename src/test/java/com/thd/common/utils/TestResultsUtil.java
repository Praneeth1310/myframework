package com.thd.common.utils;

import javax.ws.rs.core.MediaType;

import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestResultsUtil {
	private static final Logger log = LogManager.getLogger(SauceDispenseUtil.class);

	private TestResultsUtil() {
		super();
	}

	public static void updateTestResults(TestResultsRequest request) {
		String mediaType = MediaType.APPLICATION_JSON;
		Gson gson = new Gson();
		Client client = Client.create();
		try {
			String testResultsBaseUrl = PropertyUtil.getProp().getProperty("test.results.endpoint");
			WebResource resource = client.resource(testResultsBaseUrl + "testResults/save");
			WebResource.Builder builder = resource.accept(mediaType);
			builder.type(mediaType);
			log.info(gson.toJson(request));
			ClientResponse res = builder.post(ClientResponse.class,gson.toJson(request));
			if(res.getStatus() == HttpStatus.SC_OK) {
				log.info("Results updated sucessfully");
			} else {
				log.error("Results updated failed");
			}
		} catch (Exception ex) {
			log.error(ex);
		}
	
		
	}
}
