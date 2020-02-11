package com.thd.base;

import com.google.common.base.Function;
import com.thd.base.Constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.*;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class WebDriverWrapper
{
    private static final Logger log = LogManager.getLogger(WebDriverWrapper.class);

    private WebDriver driver;

    private ExtentHtmlReporter htmlReporter;
    private ExtentReports extent;
    private ExtentTest test;

    public WebDriverWrapper(WebDriver driver)
    {
        this.driver = driver;
    }

    public ExtentHtmlReporter getExtentHtmlReporter(ExtentHtmlReporter htmlReporter){
        return htmlReporter;
    }

    public ExtentReports getExtentReports(ExtentReports extent){
        return extent;
    }

    public ExtentTest getExtentTest(ExtentTest extentTest){
        return extentTest;
    }

    /**
     * Description: Get Driver
     */
    public WebDriver getDriver()
    {
        return driver;
    }

    /**
     * Description: Load a new web page in the current browser window
     */
    public void get(String url)
    {
        try {
            driver.manage().timeouts().pageLoadTimeout(Constants.DEFAULT_WAIT_FOR_PAGE, TimeUnit.SECONDS);
            driver.get(url);
        } catch (TimeoutException e) {
            Assert.fail(
                    "Page Load Timeout occurred after " + Constants.DEFAULT_WAIT_FOR_PAGE + " seconds waiting time: "
                            + e);
        } catch (UnreachableBrowserException e) {
            Assert.fail("Unreachable Browser Exception occurred: " + e);
        } catch (Exception e) {
            Assert.fail("Exception: " + e);
        }
    }

    /**
     * Description: Switch to a specified frame 'WebElement'
     */
    public void switchToFrame(WebElement frameElement)
    {
        log.entry();
        log.info("Switch to default content.");
        driver.switchTo().defaultContent();
        log.info("Switch to frame: {}", frameElement);
        driver.switchTo().frame(frameElement);
        log.info("Successfully Switched to frame: {}", frameElement);
        log.exit();
    }

    /**
     * Description: Switch to a specified frame 'WebElement'
     */
    public void switchToFrame(By frameElementBy)
    {
        log.entry();
        log.info("Switch to default content.");
        driver.switchTo().defaultContent();
        log.info("Switch to frame: {}", frameElementBy);
        driver.switchTo().frame(driver.findElement(frameElementBy));
        log.info("Successfully Switched to frame: {}", frameElementBy);
        log.exit();
    }

    /**
     * Description: Method to check if Element is displayed on page
     *
     * @return boolean
     */
    public boolean isElementPresent(WebElement webElement)
    {
        try {
            driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_FOR_ELEMENT, TimeUnit.SECONDS);
            if (webElement.isDisplayed()) {
                return true;
            }
        } catch (NoSuchElementException | StaleElementReferenceException e) {
            log.error(Constants.ELEMENT_NOT_FOUND, e);
        } catch (Exception e) {
            log.error(Constants.GENERIC_EXCEPTION_OCCURRED, e);
        } finally {
            driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_TIMEOUT_IMPLICITWAIT, TimeUnit.SECONDS);
        }
        return false;
    }

    /**
     * Description: Method to check if Element is displayed on page
     *
     * @return boolean
     */
    public boolean isElementPresent(By elementBy)
    {
        try {
            driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_FOR_ELEMENT, TimeUnit.SECONDS);
            if (driver.findElements(elementBy).size() > 0) {
                return true;
            }
        } catch (NoSuchElementException | StaleElementReferenceException e) {
            log.error(Constants.ELEMENT_NOT_FOUND, e);
        } catch (Exception e) {
            log.error(Constants.GENERIC_EXCEPTION_OCCURRED, e);
        } finally {
            driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_TIMEOUT_IMPLICITWAIT, TimeUnit.SECONDS);
        }
        return false;
    }

    /**
     * Description: Method to check if Element is displayed on page
     *
     * @return boolean
     */
    public WebElement getElementOnPage(By elementBy)
    {

        Wait<WebDriver> wait =
                new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(30, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);

        WebElement element = null;
        try {
            element = wait.until(new Function<WebDriver, WebElement>()
            {
                @Override
                public WebElement apply(WebDriver driver)
                {
                    return driver.findElement(elementBy);
                }
            });
        } catch (TimeoutException e) {
            throw new NoSuchElementException(Constants.TIMEOUT_EXCEPTION, e);
        }
        return element;
    }

    /**
     * Description: Method to check if Element is displayed on page
     *
     * @return boolean
     */
    public List<WebElement> getElementsOnPage(By elementBy)
    {

        Wait<WebDriver> wait =
                new FluentWait<WebDriver>(driver).withTimeout(15, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);

        List<WebElement> elements = null;
        try {
            elements = wait.until(new Function<WebDriver, List<WebElement>>()
            {
                @Override
                public List<WebElement> apply(WebDriver driver)
                {
                    return driver.findElements(elementBy);
                }
            });
        } catch (TimeoutException e) {
            throw new NoSuchElementException(Constants.TIMEOUT_EXCEPTION, e);
        }
        return elements;
    }

    /**
     * Description: Method to check if Element is displayed on page
     *
     * @return boolean
     */
    public Boolean webElementsCondition(Function<WebDriver, Boolean> condition)
    {
        Boolean conditionSatisfied = false;

        Wait<WebDriver> wait =
                new FluentWait<WebDriver>(driver).withTimeout(15, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);
        try {
            conditionSatisfied = wait.until(condition);
        } catch (TimeoutException e) {
            log.info("Given condition not satified due to TimeoutException");
        }
        return conditionSatisfied;
    }

    /**
     * Description: Method to check if Element is NOT displayed on page
     *
     * @return boolean
     */
    public boolean isElementNotPresent(WebElement webElement)
    {
        try {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            return !webElement.isDisplayed();
        } catch (NoSuchElementException | StaleElementReferenceException expected) {
            // Technically not an error so simply log as information
            log.info(Constants.ELEMENT_NOT_FOUND, expected);
        } catch (Exception e) {
            log.error(Constants.GENERIC_EXCEPTION_OCCURRED, e);
        } finally {
            driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_TIMEOUT_IMPLICITWAIT, TimeUnit.SECONDS);
        }
        return false;
    }

    public boolean isElementNotDisplayed(WebElement webElement)
    {
        try {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            return !webElement.isDisplayed();
        } catch (Exception e) {
            log.error(Constants.GENERIC_EXCEPTION_OCCURRED, e);
        }
        return false;
    }

    /**
     * Description: Method to check if Element is NOT displayed on page
     *
     * @return boolean
     */
    public boolean isElementNotPresent(By elementBy)
    {
        try {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            return !(driver.findElements(elementBy).size() > 0);
        } catch (Exception e) {
            // Technically not an error so simply log as information
            log.error(Constants.GENERIC_EXCEPTION_OCCURRED, e);
        } finally {
            driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_TIMEOUT_IMPLICITWAIT, TimeUnit.SECONDS);
        }
        return false;
    }

    /**
     * Description: Method to wait for page to get loaded
     */
    public void waitForPageLoaded()
    {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>()
        {
            public Boolean apply(WebDriver webdriver)
            {
                return ((JavascriptExecutor) webdriver).executeScript("return document.readyState")
                        .equals(Constants.TEXT_COMPLETE);
            }
        };

        try {
            WebDriverWait wait = new WebDriverWait(driver, Constants.DEFAULT_WAIT_FOR_PAGE);
            wait.until(expectation);
        } catch (Exception e) {
            // Technically not an error so simply log as information
            log.info("document.readyState status not completed after {} seconds: ", Constants.DEFAULT_WAIT_FOR_PAGE, e);
        }
    }

    /**
     * Description: Method to wait for page to get loaded
     */
    public void waitForPageLoadedWithPageElements(List<By> byPathWebElemets)
    {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>()
        {
            public Boolean apply(WebDriver webdriver)
            {
                Boolean pageReadyState = ((JavascriptExecutor) webdriver).
                        executeScript("return document.readyState").equals(Constants.TEXT_COMPLETE);
                for (By pageElements : byPathWebElemets) {
                    pageReadyState = pageReadyState && (getElementOnPage(pageElements) != null);
                }
                return pageReadyState;
            }
        };

        try {
            WebDriverWait wait = new WebDriverWait(driver, Constants.DEFAULT_WAIT_FOR_PAGE);
            wait.until(expectation);
        } catch (Exception e) {
            // Technically not an error so simply log as information
            log.info("document.readyState status not completed after {} seconds: ", Constants.DEFAULT_WAIT_FOR_PAGE, e);
        }
    }

    /**
     * Description: Check and wait until a specific element is located using ExpectedConditions.visibilityOf(element)
     *
     * @return boolean
     */
    public boolean isElementVisible(WebElement webElement)
    {
        return isElementVisibleWithTimeout(webElement,30);
    }

    /**
     * Description: Check and wait until a specific element is located using ExpectedConditions.visibilityOf(element)
     *
     * @return boolean
     */
    public boolean isElementVisibleWithTimeout(WebElement webElement, int timeout)
    {

        log.info("Timeout set in seconds: " + timeout);
        boolean isVisible = false;

        Wait<WebDriver> wait =
                new FluentWait<WebDriver>(driver).withTimeout(timeout, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
                        .ignoring(NoSuchElementException.class);
        try {
            isVisible = wait.until(new Function<WebDriver, Boolean>()
            {
                @Override
                public Boolean apply(WebDriver driver)
                {
                    return webElement.isDisplayed();
                }
            });
        } catch (TimeoutException e) {
            log.info("Given condition not satified due to TimeoutException");
        }
        return isVisible;
    }

    /**
     * Description: Switch focus to pop-up window
     */
    public void switchToWindow(String currentWindow)
    {
        log.entry();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(currentWindow)) {
                driver.switchTo().window(windowHandle);
                log.info("Successfully switched to window: {}", driver.getTitle());
            }
        }
        log.exit();
    }

    /**
     * Description: Wait for the invisibility of the element.
     */
    public void waitInvisibilityOfElement(WebElement element)
    {
        log.entry();
        driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_FOR_ELEMENT, TimeUnit.SECONDS);
        long endTime = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(Constants.DEFAULT_TIMEOUT_IMPLICITWAIT);
        log.debug("EndTime:[{}]", endTime);
        while (System.currentTimeMillis() < endTime) {
            log.debug("Currenttime:[{}]", System.currentTimeMillis());
            try {
                if (!element.isDisplayed()) {
                    log.debug("STOP !!!");
                }
            } catch (NoSuchElementException | StaleElementReferenceException expected) {
                // Technically not an error so simply log as information
                log.debug("Element is no longer shown: ", expected);
                return;
            } finally {
                driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_TIMEOUT_IMPLICITWAIT, TimeUnit.SECONDS);
                log.exit();
            }
        }
        if (System.currentTimeMillis() >= endTime) {
            log.warn("Element is still shown after {} seconds waiting time", Constants.DEFAULT_TIMEOUT_IMPLICITWAIT);
        }
        log.exit();
    }

    /**
     * Description: Method to handle alert box
     */
    public Alert handleAlert()
    {
        log.entry();
        try {
            Date startDate = new Date();
            Date endDate;
            int maxTimeOut = 3;
            int numSeconds;
            do {
                endDate = new Date();
                numSeconds = (int) ((endDate.getTime() - startDate.getTime()) / 1000);
            } while (numSeconds <= maxTimeOut);
            return driver.switchTo().alert();
        } catch (NoAlertPresentException e) {
            log.error("Alert is not present.", e);
        } catch (Exception ex) {
            log.info("Exception occured during alert handle: ", ex);
        }
        log.exit();
        return null;
    }

    /**
     * Description: Wait until a specific element is located using ExpectedConditions.visibilityOf(element)
     *
     * @return WebElement
     */
    public WebElement waitToBeVisible(WebElement webElement)
    {
        try {
            log.info(Constants.CHECK_IF_ELEMENT_IS_VISIBLE);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            WebDriverWait wait = new WebDriverWait(driver, Constants.DEFAULT_TIMEOUT_IMPLICITWAIT);
            return wait.until(ExpectedConditions.visibilityOf(webElement));
        } catch (Exception e) {
            log.error(Constants.ELEMENT_NOT_FOUND, e);
        } finally {
            driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_TIMEOUT_IMPLICITWAIT, TimeUnit.SECONDS);
        }
        return null;
    }

    /**
     * Description: Wait until a specific element is located using ExpectedConditions.visibilityOfElementLocated(element)
     *
     * @return WebElement
     */
    public WebElement waitToBeVisible(By locator)
    {
        try {
            log.info(Constants.CHECK_IF_ELEMENT_IS_VISIBLE);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            WebDriverWait wait = new WebDriverWait(driver, Constants.DEFAULT_TIMEOUT_IMPLICITWAIT);
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            log.error(Constants.ELEMENT_NOT_FOUND, e);
        } finally {
            driver.manage().timeouts().implicitlyWait(Constants.DEFAULT_TIMEOUT_IMPLICITWAIT, TimeUnit.SECONDS);
        }
        return null;
    }

    /**
     * Description: Wait until the current page's URL changes to whatever you specify.
     *
     * @param url The URL you want to wait for.
     */
    public void waitForUrl(final String url)
    {
        try {
            (new WebDriverWait(driver, Constants.DEFAULT_WAIT_FOR_PAGE)).until(new ExpectedCondition<Boolean>()
            {
                public Boolean apply(WebDriver d)
                {
                    log.debug("Current URL: {} | URL to wait: {}", d.getCurrentUrl(), url);
                    return d.getCurrentUrl().contains(url);
                }
            });
        } catch (TimeoutException e) {
            Assert.fail("Timeout Exception encountered while waiting for URL [" + url + "]: " + e);
        } catch (WebDriverException e) {
            log.warn("Web Driver Exception encountered: ", e);
        }
    }
}
