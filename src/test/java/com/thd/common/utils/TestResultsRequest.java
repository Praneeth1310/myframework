/**
 * @author Gopal Vegesna (gxv3499)
 */
package com.thd.common.utils;

/**
 * Sauce dispense pojo to maintain client request details  
 */
public class TestResultsRequest {
	 private String testName;
	 private Integer executionTime;
	 private Boolean status;
	 private String sauceSession;
	 private String buildID;
	 private String app;
	 private String env;
	 
	 
	/**
	 * @return the testName
	 */
	public String getTestName() {
		return testName;
	}
	/**
	 * @param testName the testName to set
	 */
	public void setTestName(String testName) {
		this.testName = testName;
	}
	/**
	 * @return the executionTime
	 */
	public Integer getExecutionTime() {
		return executionTime;
	}
	/**
	 * @param executionTime the executionTime to set
	 */
	public void setExecutionTime(Integer executionTime) {
		this.executionTime = executionTime;
	}
	/**
	 * @return the status
	 */
	public Boolean getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Boolean status) {
		this.status = status;
	}
	/**
	 * @return the sauceSession
	 */
	public String getSauceSession() {
		return sauceSession;
	}
	/**
	 * @param sauceSession the sauceSession to set
	 */
	public void setSauceSession(String sauceSession) {
		this.sauceSession = sauceSession;
	}
	/**
	 * @return the buildID
	 */
	public String getBuildID() {
		return buildID;
	}
	/**
	 * @param buildID the buildID to set
	 */
	public void setBuildID(String buildID) {
		this.buildID = buildID;
	}
	/**
	 * @return the app
	 */
	public String getApp() {
		return app;
	}
	/**
	 * @param app the app to set
	 */
	public void setApp(String app) {
		this.app = app;
	}
	/**
	 * @return the env
	 */
	public String getEnv() {
		return env;
	}
	/**
	 * @param env the env to set
	 */
	public void setEnv(String env) {
		this.env = env;
	}
	
}
