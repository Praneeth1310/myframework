package com.thd.common.utils;

public class SauceDispenseRequest {
	    private String buildId;
	    private Integer reminingTests;
	    private Integer concurrency;
	    private String sauceAccountName;
		/**
		 * @return the buildId
		 */
		public String getBuildId() {
			return buildId;
		}
		/**
		 * @param buildId the buildId to set
		 */
		public void setBuildId(String buildId) {
			this.buildId = buildId;
		}
		/**
		 * @return the reminingTests
		 */
		public Integer getReminingTests() {
			return reminingTests;
		}
		/**
		 * @param reminingTests the reminingTests to set
		 */
		public void setReminingTests(Integer reminingTests) {
			this.reminingTests = reminingTests;
		}
		/**
		 * @return the concurrency
		 */
		public Integer getConcurrency() {
			return concurrency;
		}
		/**
		 * @param concurrency the concurrency to set
		 */
		public void setConcurrency(Integer concurrency) {
			this.concurrency = concurrency;
		}
		/**
		 * @return the sauceAccountName
		 */
		public String getSauceAccountName() {
			return sauceAccountName;
		}
		/**
		 * @param sauceAccountName the sauceAccountName to set
		 */
		public void setSauceAccountName(String sauceAccountName) {
			this.sauceAccountName = sauceAccountName;
		}
	    
}
