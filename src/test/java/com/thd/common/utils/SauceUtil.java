package com.thd.common.utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.thd.base.Constants.Constants;
import org.json.JSONException;

import com.saucelabs.saucerest.SauceREST;

public class SauceUtil {

    private static SauceREST sauceRESTClient;

    private SauceUtil() {
        super();
    }

    private static SauceREST getSauceRestClient(){
        if (sauceRESTClient == null) {
            Encryptionutil encryptionutil = new Encryptionutil();
            String Sauceuser = PropertyUtil.getProp().getProperty("Sauce.user.encryption");
            String Sauceaccesskey = PropertyUtil.getProp().getProperty("Sauce.accesskey.encryption");
            System.out.println("The Encypted Sacuce username is: "+ Sauceuser);
            System.out.println("The Encypted Sacuce access key is: "+ Sauceaccesskey);
            String sauceuserdecrypt =  encryptionutil.decryptProcess(Sauceuser);
            String sauceaccesskeydecrypt =  encryptionutil.decryptProcess(Sauceaccesskey);

            sauceRESTClient = new SauceREST(sauceuserdecrypt,sauceaccesskeydecrypt);
        }
        return sauceRESTClient;
    }

    public static void updateResults(String sessionId, boolean testResults)
            throws JSONException, IOException {
        SauceREST client = getSauceRestClient();
        Map<String, Object> updates = new HashMap<>();
        updates.put("passed", testResults);
        client.updateJobInfo(sessionId, updates);
    }
}
