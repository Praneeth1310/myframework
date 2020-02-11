package com.thd.common.utils;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URL;

/**
 * Created by jason on 3/23/17.
 */
public class FileMgmtUtil {

    private static final Logger log = LogManager.getLogger(FileMgmtUtil.class);

    private FileMgmtUtil() {
        super();
    }

    public static String jsonFileToString(String jsonFile){
        URL file = Resources.getResource(jsonFile);
        String jsonString = null;

        try {
            jsonString = Resources.toString(file, Charsets.UTF_8);
        } catch (Exception e) {
            log.error("Exception :"  + e);
        }
        return jsonString;
    }

}
