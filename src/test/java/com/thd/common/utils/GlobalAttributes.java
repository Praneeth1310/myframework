package com.thd.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GlobalAttributes {
	private static String buildID = null;

	private GlobalAttributes() {
		super();
	}

	public static String getBuildID() {
		String appName;
		if(buildID == null ||  buildID.isEmpty()) {
			SimpleDateFormat sdfDate = new SimpleDateFormat("MM-dd-yy-HHmmss");
		    Date now = new Date();
		    appName = System.getProperty("app.name");
			if(appName== null || appName.isEmpty()) {
				appName = PropertyUtil.getProp().getProperty("app.name");
			}
		    buildID = appName+"_"+sdfDate.format(now);
		    return buildID;
		} else {
			return buildID;
		}
	}
}
