package com.thd.common.utils;


import com.thd.base.Constants.Constants;
import com.thd.base.WebDriverWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Iterator;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class WebActionsUtil
{
    private static final Logger log = LogManager.getLogger(WebActionsUtil.class);
    @FindBy(xpath="//*[@id=\"mainWidgetContent\"]")
    private WebElement mainWidget;

    private WebActionsUtil()
    {
        throw new AssertionError();
    }

    /**
     * Description: Scroll until the specified element is visible on screen
     */
    public static void scrollIntoView(WebDriver driver, WebElement webElement)
    {
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            explicitWait(driver, webElement,"visible");
            executor.executeScript("arguments[0].scrollIntoView();", webElement);
        } catch (Exception e) {
            log.error("JavascriptExecutor ScrollIntoView failed: ", e);
        }
    }

    /**
     * Description: Scroll until the specified element is visible on screen
     */
    public static void scrollIntoView(WebDriver driver, By elementBy)
    {
        try {
            WebElement objElement = driver.findElement(elementBy);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].scrollIntoView();", objElement);
        } catch (Exception e) {
            log.error("JavascriptExecutor ScrollIntoView failed: ", e);
        }
    }

    /**
     * Description: Method to click an element using JavascriptExecutor
     */
    public static void jsClick(WebDriver driver, WebElement webElement)
    {
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", webElement);
        } catch (Exception e) {
            log.error("JavascriptExecutor Click failed: ", e);
        }
    }

   public static void singleClickUsingAction(WebDriver driver, WebElement webElement)
    {
        try {
            Actions actions = new Actions(driver);
            explicitWait(driver, webElement, "click");
            actions.moveToElement(webElement).click(webElement).build().perform();
        } catch (Exception e) {
            log.error("Single click action failed: ", e);
        }
    }


    public static void singleClickUsingActionAndBy(WebDriverWrapper webdriverwrapper, By wElement)
    {
        WebDriver driver = webdriverwrapper.getDriver();
        WebElement webelement  = driver.findElement(wElement);
        try {
            Actions actions = new Actions(driver);
            explicitWait(driver, webelement, "click");
            actions.moveToElement(webelement).click(webelement).build().perform();
        } catch (Exception e) {
            log.error("Single click action failed: ", e);
        }
    }

    public static void rightClickElement(WebDriverWrapper webdriverwrapper, WebElement wElement)
    {

        WebDriver driver = webdriverwrapper.getDriver();

            Actions actions = new Actions(driver);
            explicitWait(driver, wElement, "click");
            actions.contextClick(wElement).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();

    }



    public static Boolean singleClickUsingActionAndByForExceptionalCase(WebDriverWrapper webdriverwrapper, By wElement)
    {
        WebElement webelement  = webdriverwrapper.getDriver().findElement(wElement);
        boolean failed = false;
        try {
            Actions actions = new Actions(webdriverwrapper.getDriver());
            actions.moveToElement(webelement).click(webelement).build().perform();
            //Thread.sleep(500);
        } catch (Exception e) {
            failed = true ;
            log.error("Expected Click failure for Negative case: ", e);
        }finally{
            return failed;
        }
    }
    /**
     * Description: Method to double click on element using actions
     */
    public static void doubleClickUsingAction(WebDriver driver, WebElement webElement)
    {
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement);
            actions.click();
            actions.doubleClick(webElement).build().perform();
            //Thread.sleep(500);
        } catch (Exception e) {
            log.error("Double click action failed: ", e);
        }
    }

    public static void selectAndSendKeys(WebDriver driver, WebElement webElement, String keys)
    {
        log.entry();
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).click().sendKeys(Keys.CLEAR);
            for (String str : keys.split("")) {
                actions.sendKeys(str);
            }
            actions.build().perform();
            //Thread.sleep(500);
        } catch (Exception e) {
            log.error("Select and send keys action failed for ", webElement, e);
        }
        log.exit();
    }

    public static void selectAndSendKeysClear(WebDriver driver, WebElement webElement, String keys)
    {
        log.entry();
        try {
                Actions actions = new Actions(driver);
                actions.moveToElement(webElement).click();
                webElement.sendKeys(Keys.CONTROL + "a");
                webElement.sendKeys(Keys.DELETE);
                for (String str : keys.split("")) {
                    actions.sendKeys(str);
                }
                actions.build().perform();
               // Thread.sleep(500);
           } catch (Exception e) {
            log.error("Select and send keys action failed for ", webElement, e);
        }
        log.exit();
    }

    public static void selectAndSendKeysAndBy(WebDriver driver, By wElement, String keys)
    {
        WebElement webElement  = driver.findElement(wElement);

        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).click().sendKeys(Keys.CLEAR);
            for (String str : keys.split("")) {
                actions.sendKeys(str);
            }
            actions.build().perform();
           // Thread.sleep(500);
        } catch (Exception e) {
            log.error("Select and send keys action failed for ", webElement, e);
        }
    }

    /* Description :  Method to clean up the values already present in the rows
      This method is used before saving any punched values */

    public static void selectAndClearKeys(WebDriver driver, int rowNum){
        log.entry();
        Actions actions = new Actions(driver);
        try{
            log.info("Clearing the rows");
            for(int columnNum = 7; columnNum < 13; columnNum++){
                WebElement ele = driver.findElement(By.xpath("//*[@id='row"+ rowNum +"jqxGrid0']/div["+ columnNum +"]/div"));
                actions.moveToElement(ele).click().sendKeys(Keys.DELETE).perform();
            }
           // Thread.sleep(500);
            log.info("Cleared");
        }catch(Exception e){
            log.error("Failed clearing existing time punches - " + e);
        }
    }

    public static void selectAndClearKeysDynamic(WebDriver driver, By webelements) {
        log.entry();
        Actions actions = new Actions(driver);
        try {
              log.info("Clearing the rows");
            for(int rows = driver.findElements(webelements).size() - 1; rows>=0; rows--){
                WebElement ele = driver.findElement(By.xpath("//*[@id='row"+ rows +"jqxGrid0']/div[2]/div/div/div"));
                actions.moveToElement(ele);
                actions.click();
                actions.perform();
               // Thread.sleep(500);
            }
        } catch (Exception e) {
            log.error("Failed clearing existing time punches - " + e);
        }
        log.exit();
    }

    /**
     * Description: Method to highlight element
     */
    public static void elementHighlight(WebDriver driver, WebElement webElement)
    {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='3px solid red'", webElement);
        } catch (Exception e) {
            log.error("Exception encountered:  ", e);
            log.error("Check element: {}", webElement);
        }
    }

    /**
     * Description: Method to remove highlight
     */
    public static void removeHighlightElement(WebDriver driver, WebElement webElement)
    {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border=''", webElement);
        } catch (Exception e) {
            log.error("Exception encountered:  ", e);
            log.error("Check element: {}", webElement);
        }
    }

    /**
     * Description: Method to select value for dropdown list
     */
    private static void selectValue(WebElement webElement, String label)
    {
        log.info("Select by visible text: {}", label);
        Select actualSelect = new Select(webElement);
        actualSelect.selectByVisibleText(label);
    }

    /**
     * Description: Method to select and compare value for dropdown list
     */
    public static void selectOptionOnDropdown(String toSelect, WebElement element)
    {
        log.entry();
        String value;
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        Iterator<WebElement> optionsCount = options.iterator();

        log.info("Select : {}", toSelect);
        while (optionsCount.hasNext()) {
            value = optionsCount.next().getText().trim();
            if (value.equals(toSelect.trim())) {
                WebActionsUtil.selectValue(element, value);
                log.info("{} is selected", toSelect);
                log.exit();
                return;
            }
        }
        log.warn("Option to be selected is not available!");
        log.exit();
    }

    /**
     * Description: Method to select and compare value that contains specific text from drop down list
     *
     * @author aracelle.bonilla
     */
    public static void selectContainsOnDropdown(String toSelect, WebElement element)
    {
        log.entry();
        String value;
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        Iterator<WebElement> optionsCount = options.iterator();

        log.info("Select : {}", toSelect);
        while (optionsCount.hasNext()) {
            value = optionsCount.next().getText().trim();
            if (value.contains(toSelect.trim())) {
                WebActionsUtil.selectValue(element, value);
                log.info("{} is selected", toSelect);
                log.exit();
                return;
            }
        }
        log.warn("Option to be selected is not available!");
        log.exit();
    }

       /**
     * Performs 'mouseover' or 'mouseout' event
     */
    public static void mouseEvent(WebDriver driver, WebElement webElement, String mouseEvent)
    {
        log.entry();
        String code = "var fireOnThis = arguments[0];" + "var evObj = document.createEvent('MouseEvents');"
                + "evObj.initEvent( '" + mouseEvent + "', true, true );"
                + "fireOnThis.dispatchEvent(evObj);";
        try {
            if (null != webElement) {
                log.info("MouseEvent: [{}] on [{}]", mouseEvent, webElement);
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                ((RemoteWebDriver) executor).executeScript(code, webElement);
            }
        } catch (Exception e) {
            log.warn("Check element: ", webElement, e);
        }
        log.exit();
    }

    /**
     * Method to handle alert box
     */
    public static void handleAlert(WebDriver driver)
    {

        try {
            int alertCounter = 1;
            final int NUMBER_OF_ALERT = 3;
            do {
                Alert alert = driver.switchTo().alert();
                String message = alert.getText();
                log.debug("message: [{}]", message);
                if (alertCounter > NUMBER_OF_ALERT) {
                    Assert.assertThat("Verify if Windows Security Prompt is Displayed",
                            WebActionsUtil.isAlertPresent(driver), is(equalTo(false)));
                }
                alert.accept();
                log.info("Clicked okay to close alert pop-up");
                alertCounter++;
            }
            while (WebActionsUtil.isAlertPresent(driver));
        } catch (TimeoutException te) {
            log.warn("No alert present", te);
        } catch (Exception e) {
            log.error("Error handling alert {}", e);
        }
    }

    /**
     * Check if alert pop-up is present
     *
     * @return false if alert pop-up is not present
     */
    private static boolean isAlertPresent(WebDriver driver)
    {

        try {
            driver.switchTo().alert();
            log.info("Alert pop-up is displayed");
            return true;
        } catch (NoAlertPresentException e) {
            log.warn("No alert present", e);
            return false;
        }
    }

    public static void explicitWait(WebDriver driver, WebElement webElement, String action){
        try{
            if(action.equalsIgnoreCase("click")){
                (new WebDriverWait(driver, Constants.DEFAULT_TIMEOUT_EXPLICITWAIT))
                        .until(ExpectedConditions.elementToBeClickable(webElement));
            }else if(action.equalsIgnoreCase("visible")){
                (new WebDriverWait(driver, Constants.DEFAULT_TIMEOUT_EXPLICITWAIT))
                        .until(ExpectedConditions.visibilityOf(webElement));
            }
        }catch(Exception e){
            log.error("Explicit wait failed");
        }
    }

    public static void selectAndRightClick(WebDriver driver, WebElement wElement)
    {
       try {
            Actions actions = new Actions(driver);
            actions.moveToElement(wElement).contextClick();
            actions.build().perform();
           // Thread.sleep(5000);
        } catch (Exception e) {
            log.error("Select and right click action failed for ", wElement, e);
        }
    }
    public static void sendKeys(WebDriver driver, WebElement webElement, String keys){
        log.entry();
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).click();
            for (String str : keys.split("")) {
                actions.sendKeys(str);
            }
            actions.build().perform();
           // Thread.sleep(1000);
        } catch (Exception e) {
            log.error("Select and send keys action failed for ", webElement, e);
        }
        log.exit();
    }

    public static void clearAndSendKeys(WebDriver driver, WebElement webElement, String keys)
    {
        log.entry();
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(webElement).click().sendKeys(Keys.CLEAR);
            for (String str : keys.split("")) {
                actions.sendKeys(str);
            }
            actions.build().perform();
            //Thread.sleep(1000);
        } catch (Exception e) {
            log.error("Select and send keys action failed for ", webElement, e);
        }
        log.exit();
    }

}


