package com.thd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public abstract class BasePage
{
    protected WebDriver driver;
    protected WebDriverWrapper driverWrapper;

    protected ExtentHtmlReporter htmlReporter;
    protected ExtentReports extent;
    protected ExtentTest test;

    protected BasePage()
    {
    }
    public void setDriver(WebDriverWrapper driverWrapper)
    {
        this.driverWrapper = driverWrapper;
        this.driver = driverWrapper.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void setReporter(ExtentHtmlReporter htmlReporter )
    {
        this.htmlReporter = htmlReporter;
    }
    public void setExtentReporter(ExtentReports extent )
    {
        this.extent = extent;
    }
    public void setExtentTest(ExtentTest test )
    {
        this.test = test;
    }
}