package com.thd.projectname.stepdefs;

import com.thd.common.browserhelper.BrowserFactory;
import com.thd.common.utils.*;
import com.thd.base.WebDriverWrapper;
import cucumber.api.Scenario;
import cucumber.api.java8.En;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScenarioHooks implements En
{
    private static final Logger log = LogManager.getLogger(ScenarioHooks.class);

    private WebDriver driver;

    private WebDriverWrapper driverWrapper;

    public String sessionId;

    private long startTime;

    private static boolean initialized = false;

    private static String executionEnv = PropertyUtil.getProp().getProperty("DistributedMode");

    private String tag= "@Synthetic_automation_E2E_T258";
    //private String tag1= "@login2";

    private ExtentHtmlReporter htmlReporter;

    private  ExtentReports extent;

    private ExtentTest test;

    private String stopRecording = "@stoprecording";
    private boolean stopCaptureVideo ;

    public ScenarioHooks()
    {
        Before((new String[]{ stopRecording }), (Scenario scenario) -> {
            stopCaptureVideo = true;
        });
        /**
         * Delete all cookies at the start of each scenario to avoid shared
         * state between tests
         */
        Before((new String[]{ tag }), (Scenario scenario) -> {
            if (!initialized) {
                try {
                    Date now = new Date();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("hhmmss");
                    String time = dateFormat.format(now);
                    System.out.println(time);
                    String extentreportsname = time +".html";
                    System.out.println(extentreportsname);

                    String dir = System.getProperty("user.dir");
                    String replaceString = dir.replace("\\","\\\\");
                    System.out.println("current dir = " + replaceString);
                    htmlReporter = new ExtentHtmlReporter(replaceString + "\\target\\" + extentreportsname);
//                    htmlReporter = new ExtentHtmlReporter("C:\\Users\\RXM8315\\workspace\\WD_2Nov\\target\\Reports\\extent.html");
                    extent = new ExtentReports();
                    extent.attachReporter(htmlReporter);

                    extent.setSystemInfo("Browser", "Chrome");
                    extent.setSystemInfo("Environment", "Production P2 tenant");
                    extent.setSystemInfo("Release", "E2E TESTING");
                    extent.setSystemInfo("Developed By", "Sai Praneeth Naraharisetti");

                    htmlReporter.config().setChartVisibilityOnOpen(true);
                    htmlReporter.config().setDocumentTitle("Automation Testing Report");
                    //  htmlReporter.config().setReportName(reportname);
                    htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
                    htmlReporter.config().setTheme(Theme.DARK);
                    htmlReporter.config().setCSS("td{width:auto; word-break:normal; white-space:normal;}");

                    driver = BrowserFactory.getBrowser(scenario ,stopCaptureVideo);
                    driverWrapper = new WebDriverWrapper(driver);
                    driver.manage().deleteAllCookies();
                    driver.manage().window().maximize();
                    if (executionEnv.equalsIgnoreCase("Sauce")) {
                        sessionId = (((RemoteWebDriver) driver).getSessionId()).toString();
                    }
                    startTime = System.currentTimeMillis();
                    // loadPages();
                    initialized = true;
                } catch (Throwable e) {
                    log.error("WebDriver initialization failed :: " + e);
                }
            }
        });

        // print starting XX before every scenario
        Before((Scenario scenario) -> {
            System.out.println("Scenario : " +scenario.toString());
            test= extent.createTest(scenario.getName());

            log.info("Starting scenario: " + scenario.getName());



        });

        // print ending XX after every scenario
        After((Scenario scenario) -> {
            log.info("Ending scenario: " + scenario.getName());
            extent.flush();
        });

        /**
         * Embed a screenshot in test report if test is marked as failed
         */

        After((new String[]{ tag }), (Scenario scenario) -> {
            driver.quit();
            initialized = false;
            if (executionEnv.equalsIgnoreCase("Sauce")) {
                try {
                    SauceUtil.updateResults(sessionId, !scenario.isFailed());
                    String jenkinsJob = System.getProperty("jenkins.job");
                    if (null != jenkinsJob && jenkinsJob.equals("true")
                            && PropertyUtil.getProp().getProperty("test.results.enabled").equals("true"))
                    {
                        TestResultsRequest request = new TestResultsRequest();
                        request.setApp(PropertyUtil.getProp().getProperty("app.name"));
                        request.setBuildID(GlobalAttributes.getBuildID());
                        request.setEnv(PropertyUtil.getProp().getProperty("app.env"));
                        request.setExecutionTime((int) ((System.currentTimeMillis() - startTime) / 1000));
                        request.setSauceSession(sessionId);
                        request.setStatus(!scenario.isFailed());
                        request.setTestName(scenario.getName());
                        TestResultsUtil.updateTestResults(request);
                    }
                } catch (Exception e) {
                    log.error("SauceLab update failed :: " + e);
                }
            }
        });
    }

    public WebDriver getDriver()
    {
        return driver;
    }

    public WebDriverWrapper getDriverWrapper()
    {
        return driverWrapper;
    }

    public WebDriverWrapper getDriverWrapper(boolean stopRecording)
    {
        return driverWrapper;
    }

    public ExtentHtmlReporter getExtentHtmlReporter( ){
        return htmlReporter;
    }

    public ExtentReports getExtentReports(){
        return extent;
    }

    public ExtentTest getExtentTest( ){
        return test;
    }

}
