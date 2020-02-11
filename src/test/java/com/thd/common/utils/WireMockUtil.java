package com.thd.common.utils;

import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * The WireMock class serves as a a wrapper around some of WireMocks features.
 * It creates a simple way to interact with a WireMock server with minimal code.
 * 
 * @author dxs5997
 *
 */
public class WireMockUtil {

	private static final Logger log = LogManager.getLogger(WireMockUtil.class);
	
	private static ArrayList<String> idList = new ArrayList<>();
	private static final int POST_MAPPING_SUCCESS = 201;
	private static final int DELETE_MAPPING_SUCCESS = 200;
	private static String serverURL = PropertyUtil.getProp().getProperty("wiremock.server");

	/**
	 * This method will test to see if a connection can be established with the
	 * given URL
	 * 
	 * @return A boolean to return whether or not the server was reachable
	 */
	public static boolean isServerUp() {
		return isServerUp(serverURL, 3000);
	}

	/**
	 * This method will test to see if a connection can be established with the
	 * given URL
	 * 
	 * @param url
	 *            The URL that you want to test
	 * @param timeout
	 *            The maximum time allowed before failure in Milliseconds
	 * @return A boolean to return whether or not the server was reachable
	 */
	public static boolean isServerUp(String url, int timeout) {
		try {
			URL siteURL = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) siteURL.openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(timeout);
			connection.connect();
			return true;
		} catch (IOException e) {
			log.error("Unable to connect to server {}", e);
			return false; // Either timeout or unreachable or failed DNS lookup.
		}
	}

	

	/**
	 * This method will generate a random UUID to be used by a mapping object
	 * 
	 * @return A string representation of the UUID generated
	 */
	private static String generateRandomID() {

		String uuid = UUID.randomUUID().toString();
		idList.add(uuid);
		return uuid;
	}

	/**
	 * This method will load a given mapping file onto the WireMock server
	 * @return Returns a boolean to indicate a successful upload
	 * @throws IOException
	 *             Exception that happens when reading the file
	 * @throws WireMockException
	 *             Exception that occurs if the WireMock server doesn't return a
	 *             success code
	 */
	@SuppressWarnings("unchecked")
	public static String loadMapping(JSONObject mapping) throws IOException, WireMockException {
		String uuid = generateRandomID();
		String url = serverURL + "/__admin/mappings";
		URL address = new URL(url);

		if( mapping.get("id") == null || mapping.get("id").toString().isEmpty()){
			mapping.put("id", uuid);
		}

		HttpURLConnection con = (HttpURLConnection) address.openConnection();
		con.setRequestMethod("POST");
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(mapping.toString());
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();

		if (responseCode != POST_MAPPING_SUCCESS) {
			// server rejected file
			idList.remove(uuid);
			throw new WireMockException("WireMock Server returned " + responseCode + " status code");
		}
		log.debug("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuilder response = new StringBuilder();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		log.debug(response.toString());

		return uuid;
	}

	public static boolean checkMappingExist(String mappingId) throws IOException, WireMockException {
		String url = serverURL + "/__admin/mappings/"+mappingId;
		URL address = new URL(url);

		HttpURLConnection con = (HttpURLConnection) address.openConnection();
		con.setRequestMethod("GET");
		int responseCode = con.getResponseCode();
		if (responseCode == HttpStatus.SC_OK) {
			log.debug("Mapping already exists : for ID " + mappingId);
			return true;
		}

		log.debug("Mapping not found : for ID " + mappingId);
		return false;
	}
	

	/**
	 * This method removes all of the mappings added by this WireMock object
	 */
	public void removeAllMappings() {
		idList.clear();
	}

	/**
	 * This method removes mappings from the WireMock server by Id
	 * 
	 * @param id
	 *            The id of the mapping that you want to remove from the
	 *            WireMock server
	 * @throws IOException - Exception to be thrown
	 * @throws WireMockException - Exception to be thrown
	 */
	public static void removeMapping(String id) throws IOException, WireMockException {

		String url = serverURL + "/__admin/mappings/" + id;
		URL address = new URL(url);
		HttpURLConnection con = (HttpURLConnection) address.openConnection();
		con.setRequestMethod("DELETE");
		int responseCode = con.getResponseCode();
		if (responseCode != DELETE_MAPPING_SUCCESS) {
			// server rejected file
			throw new WireMockException("Cannot remove mapping with id: " + id);
		}

		idList.remove(id);
		log.debug("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuilder response = new StringBuilder();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		log.debug(response.toString());

    }
	
	public static void removeMappings(List<String> ids) {
		for(String id : ids) {
			try {
				removeMapping(id);
			} catch (Exception e) {
				log.error("Unable to delete mapping {}", e);
				log.error("Wire mock delete mapping failed :" + id);
			} 
		}
	}

	
	public static List<String> getAddedMappingIds() {
		return idList;
	}

}
