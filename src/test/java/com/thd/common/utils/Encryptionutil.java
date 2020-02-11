package com.thd.common.utils;
//import org.apache.commons.collections4.bag.SynchronizedSortedBag;

import com.homedepot.ta.aa.crypto.Crypto;
import com.thd.base.Constants.Constants;
import com.thd.projectname.pages.PO_Others.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Encryptionutil {
    private static final Logger log = LogManager.getLogger(HomePage.class);
    String decryptValue = null;

    public String decryptProcess(String encryptedValue)
    {
        try {
            log.info("The encrypted value is: " + encryptedValue);
            // decrypt data
            decryptValue = Crypto.decrypt(encryptedValue);

        } catch (Exception e) {
            log.error("Exception Occurred" + e.getMessage());
        }
        return decryptValue;
    }

}