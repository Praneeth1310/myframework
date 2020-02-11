package com.thd.common.utils;

import com.thd.base.WebDriverWrapper;
import com.thd.base.Constants.Constants;
import com.thd.base.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WorkDayUtil  {
    private static final Logger log = LogManager.getLogger(WorkDayUtil.class);

    //Workday Searchbox  --------------------------------------
    @FindBy(xpath = "//input[@data-automation-id='globalSearchInput']")
    public static WebElement searchBox;

    @FindBy(xpath = "(//*[@class='wd-icon-search wd-icon'])[1]")
    public static WebElement searchSymbol;
    
    //Start Proxy ------------------------------------------------
    @FindBy(xpath = "//*[@data-automation-id='promptOption']")
    public static WebElement startproxyLink;
  
    @FindBy(xpath = "//*[@data-automation-id='promptIcon']")
    public static WebElement namestartproxy;
    
    @FindBy(xpath = "//*[@data-automation-id='searchBox']")
    public static WebElement namesearchboxstartproxy;
    
    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_okButton']")
    public static WebElement okbuttonStartProxy;
    
    //Stop Proxy
    @FindBy(xpath = "//div[@title='Stop Proxy']")
    public static WebElement stopproxyLink;
    
    @FindBy(xpath="//button[@data-automation-id='wd-CommandButton_uic_okButton']")
    public static WebElement okbtnStopProxy;

    //Workday homepage --------------------------------------------------
    @FindBy(xpath = "(//*[@class='wd-icon-projectname wd-icon'])[1]")
    public static WebElement homepageWD;
    
    
    public  static void searchbySearchBox(String enterData, WebDriverWrapper driverWrapper) {
    	searchBox.clear();
    	searchBox.sendKeys(enterData);
    	searchSymbol.click();
    	driverWrapper.waitForPageLoaded();
    }
    
    public static void gotoWorkdayHomepage(WebDriverWrapper driverWrapper) {
    	homepageWD.click();
    	driverWrapper.waitForPageLoaded();
    	searchBox.clear();
    }
    
    
    public static void startProxy(WebDriverWrapper driverWrapper) throws InterruptedException {
    	searchbySearchBox(Constants.SRCHBOXSTPROXY, driverWrapper);
    	startproxyLink.click();
    	Thread.sleep(3000);
    	namestartproxy.click();
    	Thread.sleep(1000);
    	namesearchboxstartproxy.sendKeys(Constants.NAMESTARTPROXY);
    	okbuttonStartProxy.click();
    	Thread.sleep(5000);
    	searchBox.clear();
    }
    
    public static void stopProxy(WebDriverWrapper driverWrapper) {
    	searchbySearchBox(Constants.SRCHBOXSTOPPROXY,driverWrapper);
    	stopproxyLink.click();
    	okbtnStopProxy.click();
    }
}

    

