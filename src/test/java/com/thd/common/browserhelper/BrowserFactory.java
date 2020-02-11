package com.thd.common.browserhelper;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.thd.common.utils.GlobalAttributes;
import com.thd.common.utils.PropertyUtil;

import cucumber.api.Scenario;

public class BrowserFactory {
	
	private static final Logger log = LogManager.getLogger(BrowserFactory.class);
    public static final String URL = "https://" + PropertyUtil.getProp().getProperty("Sauce.user")
            + ":" + PropertyUtil.getProp().getProperty("Sauce.accesskey") + "@ondemand.saucelabs.com:443/wd/hub";

    private BrowserFactory() {
        super();
    }

    public static WebDriver getBrowser(Scenario scenario, boolean stopVideoCapture){
    	WebDriver driver = getWebDriver(scenario, stopVideoCapture);
    	driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        return driver;
    }
    
    private static WebDriver getWebDriver(Scenario scenario, boolean stopRecording) {
    	 String desiredBrowserName = PropertyUtil.getProp().getProperty("capabilities.browserName").toLowerCase();
         WebDriver driver = null;
         try{
         	if ("Local".equalsIgnoreCase(PropertyUtil.getProp().getProperty("DistributedMode"))) {
                 switch (desiredBrowserName) {
                     case "internet explorer":
                     	driver = IEBrowser.buildIEBrowser();
                         break;
                     case "chrome":
                     	driver = ChromeBrowser.buildChromeBrowser();
                         break;
                     case "chromeheadless":
                         driver = ChromeBrowser.buildChromeHeadless();
                         break;
                     case "firefox":
//                     	driver = FirefoxBrowser.buildFirefoxBrowser();
                         break;
                     default:
                         // work out what to do when a browser isn't needed
                         break;
                 }
             } else if ("Sauce".equalsIgnoreCase(PropertyUtil.getProp().getProperty("DistributedMode"))) {
                 DesiredCapabilities capabilities = new DesiredCapabilities();
                 capabilities.setCapability(CapabilityType.BROWSER_NAME, desiredBrowserName);
                 capabilities.setCapability(CapabilityType.VERSION, PropertyUtil.getProp().getProperty("capabilities.version"));
                 capabilities.setCapability(CapabilityType.PLATFORM, PropertyUtil.getProp().getProperty("capabilities.platform"));
                 capabilities.setCapability("name", scenario.getName());
                 capabilities.setCapability("build", GlobalAttributes.getBuildID());
                capabilities.setCapability("maxDuration",PropertyUtil.getProp().getProperty("capabilities.maxDuration"));
                System.out.println("**************************************************Stop Recording Value is"+ stopRecording);
                if(stopRecording){
                    capabilities.setCapability("record-screenshots",false);
                    capabilities.setCapability("record-video",false);
                }
                driver = new RemoteWebDriver(new java.net.URL(URL), capabilities);
                 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
             }
         } catch(Exception ex) {
         	log.error("Exception :: " + ex);
         }
         return driver;
    }
}
