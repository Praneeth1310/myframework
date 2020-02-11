/**
 * @author Gopal Vegesna (gxv3499)
 */
package com.thd.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PropertyUtil {
	private static Properties prop = null;
	private static Integer retryCount = 0;

	private static final Logger log = LogManager.getLogger(PropertyUtil.class);

	/**
	 * Private constructor
	 */
	private PropertyUtil() {
	};

	/**
	 * Method that reads the values from all .properties file
	 */
	static {
		String appEnv = null;
		ClassLoader classLoader = PropertyUtil.class.getClassLoader();
		File runFile = new File(classLoader.getResource("run-config.properties").getFile());
		if (runFile.exists()) {
			prop = new Properties();
			try (FileInputStream fis = new FileInputStream(runFile);) {
				prop.load(fis);
				appEnv = System.getProperty("app.env");
				if (appEnv == null || appEnv.isEmpty()) {
					appEnv = prop.getProperty("app.env");
				}
			} catch (Exception e) {
				log.error("Cannot get property file {}", e);
			}
			File envFile = new File(classLoader.getResource("env-config/" + appEnv + ".properties").getFile());
			if (envFile.exists()) {
				try (FileInputStream envfis = new FileInputStream(envFile);) {
					prop.load(envfis);
				} catch (Exception e) {
					log.error("Environment File not found! {}", e);
				}
			}
			File testDataFile = new File(classLoader.getResource("data/static/test-data.properties").getFile());
			if (testDataFile.exists()) {
				try (FileInputStream testDatafis = new FileInputStream(testDataFile);) {
					prop.load(testDatafis);
				} catch (Exception e) {
					log.error("Test Data File File not found! {}", e);
				}
			}
			setRetry();
		}
	}

	public static Properties getProp() {
		return prop;
	}

	public static Integer getRetryCount() {
		return retryCount;
	}

	/**
	 * Method that reads the value of retry.count in run-config.properties
	 */
	private static void setRetry() {
		String countStr = System.getProperty("retry.count");
		if (countStr == null || countStr.isEmpty()) {
			countStr = prop.getProperty("retry.count");
		}
		if (countStr != null && (new Integer(countStr) > 0)) {
			retryCount = new Integer(countStr);
		}
	}
}
