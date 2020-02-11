package com.thd.common.utils;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class JunitRunner implements Runnable{
	private Class<?> testcase;
	
	public JunitRunner(Class<?> testcase) {
		this.testcase = testcase;
	}

	@Override
	public void run() {
		JUnitCore junit = new JUnitCore();
		for(int i=0; i<=PropertyUtil.getRetryCount() ; i++) {
			Result result = junit.run(testcase);
			if(result.wasSuccessful()) {
				break;
			}
		}
	}
}
