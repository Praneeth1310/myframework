package com.thd.common.utils;

import com.thd.base.WebDriverWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PageActionsUtil {
    private static final Logger log = LogManager.getLogger(PageActionsUtil.class);

    private PageActionsUtil() {
        throw new AssertionError();
    }

    /**
     * Description: Click a specified button
     */
    public static void clickButton(WebDriverWrapper driverWrapper, By targetFrame, WebElement buttonElement) {
        log.entry();
        driverWrapper.switchToFrame(targetFrame);
        clickButton(driverWrapper, buttonElement);
    }

    /**
     * Description: Click a specified button
     */
    public static void clickButton(WebDriverWrapper driverWrapper, WebElement buttonElement) {
        log.entry();
        try {
            (new WebDriverWait(driverWrapper.getDriver(), 20))
                    .until(ExpectedConditions.elementToBeClickable(buttonElement));
            buttonElement.click();
        } catch (Exception e) {
            log.error("Button is not present: ", e);
        }
        log.exit();
    }

     /**
     * Description: Click a specified WebElement
     */
    public static void clickWebElement(WebDriverWrapper driverWrapper, WebElement webElement) {
        log.entry();
        try {
            webElement.click();
        } catch (Exception e) {
            log.error("WebElement cannot be clicked ", e);
        }
        log.exit();
    }

    /**
     * Description: Click a specified button
     */
    public static void clickJSButton(WebDriverWrapper driverWrapper, By targetFrame, WebElement buttonElement) {
        log.entry();
        driverWrapper.switchToFrame(targetFrame);
        clickJSButton(driverWrapper, buttonElement);
    }

    /**
     * Description: Click a specified button
     */
    public static void clickJSButton(WebDriverWrapper driverWrapper, WebElement buttonElement) {
        log.entry();
        if (driverWrapper.isElementPresent(buttonElement)) {
            WebActionsUtil.jsClick(driverWrapper.getDriver(), buttonElement);
            log.info("Button is clicked.");
        } else {
            log.error("Unable to locate button");
        }
        log.exit();
    }

    /**
     * Description: Click a specified button
     */
    public static void triggerClickAction(WebDriverWrapper driverWrapper, WebElement buttonElement) {
        log.entry();
        WebActionsUtil.jsClick(driverWrapper.getDriver(), buttonElement);
        log.exit();
    }

    /**
     * Description: Click a specified button
     */
    public static void clickButton(WebDriverWrapper driverWrapper, By targetFrame, By buttonElement) {
        log.entry();
        driverWrapper.switchToFrame(targetFrame);
        clickButton(driverWrapper, driverWrapper.getDriver().findElement(buttonElement));
        log.exit();
    }

    /**
     * Description: Click on Details View button
     */
    public static void clickDetailsViewButton(WebDriverWrapper driverWrapper, WebElement detailsViewElement) {
        log.entry();
        if (driverWrapper.isElementPresent(detailsViewElement)) {
            log.info("Click on Details view");
            PageActionsUtil.clickJSButton(driverWrapper, detailsViewElement);
            log.info("Details view button is clicked.");
        } else {
            log.error("Details View button is not visible");
        }
        log.exit();
    }

    /**
     * Description: Verify that Page is displayed without switching to frame.
     *
     * @return boolean
     */
    public static boolean isPageDisplayed(WebDriverWrapper driverWrapper, WebElement targetElement, String pageName) {
        log.entry();
        log.info("Wait for page to load.");
        driverWrapper.waitForPageLoaded();
        if (driverWrapper.isElementVisible(targetElement)) {
            log.info("{} page is displayed.", pageName);
            return true;
        }
        log.error("{} is not present", pageName);
        log.exit();
        return false;
    }

    /**
     * Verify if details page is displayed without switching to frame.
     *
     * @return isPageDisplayed
     */
    public static boolean isDetailsPageDisplayed(WebDriverWrapper driverWrapper, WebElement targetElement,
                                                 WebElement detailsViewElement, String pageName) {
        log.entry();
        clickDetailsViewButton(driverWrapper, detailsViewElement);
        return isPageDisplayed(driverWrapper, targetElement, pageName);
    }

    /**
     * Verify if details page is displayed
     *
     * @return isPageDisplayed
     */
    public static boolean isDetailsPageDisplayed(WebDriverWrapper driverWrapper, By targetFrame,
                                                 WebElement targetElement,
                                                 WebElement detailsViewElement, String pageName) {
        log.entry();
        clickDetailsViewButton(driverWrapper, targetFrame, detailsViewElement);
        return isPageDisplayed(driverWrapper, targetFrame, targetElement, pageName);
    }

    /**
     * Description: Click on Details View button
     */
    public static void clickDetailsViewButton(WebDriverWrapper driverWrapper, By targetFrame,
                                              WebElement detailsViewElement) {
        log.entry();
        log.info("Switching to frame.");
        driverWrapper.switchToFrame(targetFrame);
        if (driverWrapper.isElementPresent(detailsViewElement)) {
            log.info("Click on Details view");
            PageActionsUtil.clickJSButton(driverWrapper, detailsViewElement);
            log.info("Details view button is clicked");
        } else {
            log.error("Details View button is not visible");
        }
        log.exit();
    }

    /**
     * Description: Verify that Page is displayed
     *
     * @return boolean
     */
    public static boolean isPageDisplayed(WebDriverWrapper driverWrapper, By targetFrame, WebElement targetElement,
                                          String pageName) {
        log.entry();
        driverWrapper.waitForPageLoaded();
        driverWrapper.switchToFrame(targetFrame);
        if (driverWrapper.isElementVisible(targetElement)) {
            log.info("{} page is displayed.", pageName);
            return true;
        }
        log.error("{} is not present", pageName);
        log.exit();
        return false;
    }

    /**
     * Description: Verify the exact value of the field.
     *
     * @return boolean
     */
    public static boolean isFieldValueExact(WebElement fieldName, String expected) {
        log.entry();
        log.info("Verify the field value");
        String actual = fieldName.getText();
        log.info("Expected {}", expected);
        log.info("Actual {}", actual);
        if (actual.equalsIgnoreCase(expected)) {
            log.info("{} matches the expected {} value.", actual, expected);
            return true;
        }
        log.info("{} value is NOT equal to the expected {} value.", actual, expected);
        log.exit();
        return false;
    }

    /**
     * Description: Verify the field if contains the specified value
     *
     * @return boolean
     */
    public static boolean isFieldValueContains(WebElement fieldName, String expected) {
        log.entry();
        String actual = fieldName.getText();
        log.info("Expected {}", expected);
        log.info("Actual {}", actual);
        if (actual.contains(expected)) {
            log.info("{} contains the expected value.", actual, expected);
            return true;
        }
        log.info("{} value does NOT contains the expected value.", actual, expected);
        log.exit();
        return false;
    }

    /**
     * Description: Verify the exact value of the field
     *
     * @return boolean
     */
    public static boolean isFieldValueExact(WebElement fieldName, String fieldLabel, String expected) {
        log.entry();
        String actual = fieldName.getText();
        if (actual.equalsIgnoreCase(expected)) {
            log.info("Field '{}' value [{}] matches the expected value [{}]", fieldLabel, actual, expected);
            return true;
        }
        log.info("Field '{}' value [{}] does NOT match the expected value [{}]", fieldLabel, actual, expected);
        log.exit();
        return false;
    }

    /**
     * Description: Click on Feed View button
     */
    public static void clickFeedViewButton(WebDriverWrapper driverWrapper, By targetFrame, WebElement feedViewElement) {
        log.entry();
        driverWrapper.switchToFrame(targetFrame);
        if (driverWrapper.isElementPresent(feedViewElement)) {
            log.info("Click on Feed view");
            feedViewElement.click();
            log.info("Feed view button is clicked");
        } else {
            log.error("Feed View button is not visible");
        }
        log.exit();
    }

    /**
     * Description: Verify if Feed View page is displayed.
     */
    public static boolean isFeedPageDisplayed(WebDriverWrapper driverWrapper, By targetFrame, WebElement targetElement,
                                              WebElement feedViewElement, String pageName) {
        log.entry();
        clickFeedViewButton(driverWrapper, targetFrame, feedViewElement);
        return isPageDisplayed(driverWrapper, targetFrame, targetElement, pageName);
    }

    /**
     * Description: Validate the fields in the given expected list and actual list
     *
     * @param expectedFieldList String
     * @param actualFieldList   WebElement
     * @return List
     */
    public static List<Boolean> validateTheFieldsInTheGivenList(List<String> expectedFieldList,
                                                                List<String> actualFieldList) {
        List<Boolean> comparisonResult = new ArrayList<>();
        // Sort the list
        List<String> expectedModifiableList = new ArrayList<String>(expectedFieldList);
        List<String> actualModifiableList = new ArrayList<String>(actualFieldList);
        Collections.sort(actualModifiableList, String.CASE_INSENSITIVE_ORDER);
        Collections.sort(expectedModifiableList, String.CASE_INSENSITIVE_ORDER);

        for (int i = 0; i < expectedFieldList.size(); i++) {
            String actualField = actualFieldList.get(i);
            String expectedField = expectedFieldList.get(i);
            log.debug("Expected field: {}", expectedField);
            log.debug("Actual Field: {}", actualField);
            if (actualField.equalsIgnoreCase(expectedField)) {
                log.info("Expected field {} is equal to the actual field {}", expectedField, actualField);
                comparisonResult.add(true);
            } else {
                log.error("Expected field {} is NOT equal to the actual field {}", expectedField, actualField);
                comparisonResult.add(false);
            }
        }
        return comparisonResult;
    }

    private static String getRowByPathForDay(int day)
    {
        return "//*[@id='row" + day + "jqxGrid0']/";
    }


}
