package com.thd.common.browserhelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.thd.common.utils.PropertyUtil;

import java.util.concurrent.TimeUnit;

class IEBrowser extends InternetExplorerDriver {

    private IEBrowser() {
        super();
    }
    
    public static WebDriver buildIEBrowser() {

        System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, PropertyUtil.getProp().getProperty("local.driver.location"));
        DesiredCapabilities capabilities = DesiredCapabilities
                .internetExplorer();
        capabilities
                .setCapability(
                        InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
                        true);
        capabilities.setCapability(
                CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,
                true);
        WebDriver browser = new InternetExplorerDriver(capabilities);
        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return browser;
    }

}
