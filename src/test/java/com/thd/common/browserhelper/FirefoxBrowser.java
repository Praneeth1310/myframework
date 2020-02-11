package com.thd.common.browserhelper;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.thd.common.utils.PropertyUtil;

import java.util.concurrent.TimeUnit;

public class FirefoxBrowser {/*extends FirefoxDriver {
    static String currentDir = System.getProperty("user.dir");
    private FirefoxBrowser(FirefoxProfile desiredProfile) {
        super(desiredProfile);
    }
    
    public static MarionetteDriver buildFirefoxBrowser() {
        FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
        System.setProperty("webdriver.gecko.driver", PropertyUtil.getProp().getProperty("local.driver.location"));
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        capabilities.setCapability("acceptSslCerts" , true);
        capabilities.setCapability(FirefoxDriver.PROFILE, profile);
        MarionetteDriver browser = new MarionetteDriver(capabilities);
        return browser;
    }*/

//    public static MarionetteDriver buildFirefoxBrowser() {
//        return null;
//    }
}
