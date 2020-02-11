package com.thd.projectname.pages.PO_Others;

import com.aventstack.extentreports.ExtentTest;
import com.thd.base.BasePage;
import com.thd.base.Constants.Constants;
import com.thd.base.WebDriverWrapper;
import com.thd.common.utils.PageActionsUtil;
import com.thd.common.utils.WebActionsUtil;
import com.thd.projectname.pages.PO_HCM.Hire_withRequisition;
import com.thd.projectname.stepdefs.ScenarioHooks;
import com.thd.projectname.stepdefs.WD_SuccessionPlanStepdef;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.HashMap;


public class WorkdayCommon extends BasePage {
    private static final Logger log = LogManager.getLogger(WorkdayCommon.class);

    String associate_ID = null;

    //Workday Searchbox  --------------------------------------
    @FindBy(xpath = "//input[@data-automation-id='globalSearchInput']")
    public WebElement searchBox;

    //@FindBy(xpath = "(//*[@class='wd-icon-search wd-icon'])[1]")
    @FindBy(xpath = "//input[@data-automation-id='globalSearchInput']//following::*[@class='wd-icon-search wd-icon']")
    public WebElement searchSymbol;//input[@data-automation-id='globalSearchInput']//following::*[@class='wd-icon-search wd-icon']

    //   @FindBy(xpath = "(//*[@class='wd-icon-workday wd-icon'])[1]")  // For P1
    @FindBy(xpath = "//*[@data-automation-id='globalSearchInput']//preceding::img") //For P2
    public WebElement homepageWD;

    //Start Proxy ------------------------------------------------
    @FindBy(xpath = "//*[@data-automation-id='promptOption']")
    public WebElement startproxyLink;

    @FindBy(xpath = "//*[@data-automation-id='promptIcon']")
    public WebElement namestartproxy;

    @FindBy(xpath = "//*[@data-automation-id='searchBox']")
    public WebElement namesearchboxstartproxy;

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_okButton' and @type='button']")
    public WebElement okbuttonStartProxy;

    //@FindBy(xpath = "(//*[@class='wd-icon-workday wd-icon'])[1]//preceding::*[contains(text(),'On behalf of:')]")//P1
    @FindBy(xpath = "//*[@data-automation-id='globalSearchInput']//preceding::*[contains(text(),'On behalf of:')]")//P2
    public WebElement tagStartProxy;


    @FindBy(xpath = "//button[@data-automation-id='relatedActionsButton']")
    public WebElement clickAction;

    @FindBy(xpath = "//label[text()='All of Workday']")
    public WebElement allOfWorkday;


    @FindBy(xpath = "//div[text()='Security Profile']")
    public WebElement securityprofileActions;

    @FindBy(xpath = "//div[text()='Start Proxy']")
    public WebElement startproxyActions;

    //Inbox Web elements---------------------------------------------------

    @FindBy(xpath = "//button[@title='Approve']")
    public WebElement inboxbuttonApprove;

    @FindBy(xpath = "//span[@title='Submit']")
    public WebElement inboxbuttonSubmit;

    @FindBy(xpath = "//button[@title='Done']")
    public WebElement inboxbuttonDone;

    //@FindBy(xpath = "(//*[@class='wd-icon-workday wd-icon'])[1]//following::*[@class='wd-icon-inbox-large wd-icon'][1]") //p1
    @FindBy(xpath = "//*[@data-automation-id='globalSearchInput']//preceding::img//following::button[@data-automation-id='inbox_preview'][1]")//p2
    public WebElement inboxWD;


    //More dropdown list-----------------------------------------------------

    @FindBy(xpath = "//span[text()='More']")
    public WebElement tabmoreEmpProfile;


    //------------------------------------------------
    @FindBy(xpath = "//*[text()='Awaiting Action']")
    public WebElement labelawaitingaction;

    @FindBy(xpath = "(//*[text()='Awaiting Action'])[1]")
    public WebElement awaitingaction_first;

    @FindBy(xpath = "(//*[text()='Awaiting Action'])[1]//following::*[@data-automation-id='promptOption'][1]")
    public WebElement awaitingaction_first_name;


    @FindBy(xpath = "//label[text()='Overall Status']//following::div[2]")
    public WebElement overallStatus;

    @FindBy(xpath = "//div[text()='Awaiting Action']")
    public WebElement awaitingaction;

    @FindBy(xpath = "//div[text()='Process']")
    public WebElement processtab;

    //@FindBy(xpath = "(//*[@class='wd-icon-workday wd-icon'])[1]//following::img[1]//following::*[@data-automation-id='hammy_current_user_item']") //p1
    @FindBy(xpath = "//*[@data-automation-id='globalSearchInput']//following::img[1]//following::*[@data-automation-id='hammy_current_user_item']")
    public WebElement viewprofileSelf;

    // @FindBy(xpath = "(//*[@class='wd-icon-workday wd-icon'])[1]//following::img[1]")  // P1
    @FindBy(xpath = "//*[@data-automation-id='globalSearchInput']//following::img[1]")
    public WebElement selfImgBtn;

    //common WebElements-------------------------0------------------------

    @FindBy(xpath = "//div[text()='Talent']")
    public WebElement TalentAction;

    @FindBy(xpath = " //span[@title='Done']")
    public WebElement btnDone;

    @FindBy(xpath = "//div[text()='Associate History']")
    public WebElement associateHistoryLink;

    @FindBy(xpath = "//div[text()='View Associate History']")
    public WebElement viewAssociateHistoryLink;

    @FindBy(xpath = "//div[text()='View Associate History by Category']")
    public WebElement viewAssociateHisByCategoryLink;

    @FindBy(xpath = "//div[@data-automation-id='relatedActionsItemLabel' and text()='View Associate History by Category']")
    public WebElement viewAssociateHistorybyCategoryLink;

    @FindBy(xpath = "//label[text()='Associate ID']//following::div[@data-automation-id='textView'][1]")
    private WebElement associateID;





    //Stop proxy ------------------------------------------
    @FindBy(xpath = "//*[@data-automation-id='promptOption' and text()='Stop Proxy']")
    public WebElement stopproxyLink;




    @FindBy(xpath = "//label[text()='Because Of'][1]//following::div[@data-automation-id='promptOption'][1]//following ::*[1]")
    public WebElement becauseOf;

    @FindBy(xpath = "//span[@title='Submit']")
    public WebElement submitButton;


    public void gotoWorkdayHomepage() throws Exception {
        WebActionsUtil.explicitWait(driver, homepageWD, "click");
        WebActionsUtil.explicitWait(driver, searchBox, "visible");
        homepageWD.click();
        driverWrapper.waitForPageLoaded();
        userWait(2000);
        searchBox.clear();
    }

    public void stopProxy() throws Exception {
        userWait(2000);
        searchbySearchBox(Constants.SRCHBOXSTOPPROXY);
        WebActionsUtil.explicitWait(driver, stopproxyLink, "click");
        stopproxyLink.click();
        userWait(4000);
        scrolltoElement(okbuttonStartProxy);
        okbuttonStartProxy.click();
    }


    public void searchbySearchBox(String enterData) throws Exception {
        WebActionsUtil.explicitWait(driver, searchBox, "click");
        WebActionsUtil.explicitWait(driver, searchSymbol, "click");
        if (searchBox.isDisplayed() && searchBox.isEnabled()) {
            searchBox.clear();
            searchBox.sendKeys(enterData);
            log.info("Focus to Workday Searchbox");
            log.debug("Entering the following data for search in the searchbox : " + enterData);
            searchSymbol.click();
        userWait(5000);
            driverWrapper.waitForPageLoaded();
        } else {
            log.fatal("Can not proceed to :" + enterData);
        }
    }

    public void userWait(int waitseconds) throws Exception {
        Thread.sleep(waitseconds);
    }

    public void scrolltoElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scroll() {
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        } catch (Exception e) {
            log.error("JavascriptExecutor ScrollIntoView failed: ", e);
        }
    }

    public void scrollUP_height() {
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("scroll(0,-250);");
        } catch (Exception e) {
            log.error("JavascriptExecutor ScrollIntoView failed: ", e);
        }
    }


    public void scrollDOWN_height() {
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("scroll(0,500);");

        } catch (Exception e) {
            log.error("JavascriptExecutor ScrollIntoView failed: ", e);
        }
    }

    public void scrollright() {
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("scroll(750,0);");
        } catch (Exception e) {
            log.error("JavascriptExecutor ScrollIntoView failed: ", e);
        }
    }

    public void scrollleft() {
        try {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("scroll(-750,0);");
        } catch (Exception e) {
            log.error("JavascriptExecutor ScrollIntoView failed: ", e);
        }
    }


    public void selectfromduplicates(String name) throws Exception {
        try {
            userWait(5000);
            if (driver.findElement(By.xpath("//*[contains(text(),'" + name + "')]")).isDisplayed()) {
                log.info("The given value is already entered");
            }
        } catch (NoSuchElementException e) {
            log.info("The given value is now being entered");
            driver.findElement(By.xpath("(//*[contains(@data-automation-label,'" + name + "')])[1]")).click();
        }
    }

    public void takescreenshotUI(String filename, String name) throws Exception {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        String datestring = date.toString();
        //String path = Constants.PATH+datestring+"\\"+Constants.FNAMECREATEPREHIRE+"\\"+filename+".png";
        String path = Constants.PATH + datestring + "\\" + name + "\\" + filename + ".png";
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File(path));
    }


    public String awaitingAction(int numb_aprover) {
        String aprname = driver.findElement(By.xpath("(//*[text()='Awaiting Action'])[" + numb_aprover + "]//following::*[@data-automation-id='promptOption'][1]")).getText();
        StringBuilder Approvername = new StringBuilder(aprname);
        log.info("Before replacing the Aprover name :" + Approvername);
        // Eliminating characters after ( and removing space before (
        Approvername.delete(Approvername.indexOf("(") - 1, Approvername.length());
        log.info("After replacing the Aprover name :" + Approvername);
        return Approvername.toString();

    }

    public void mousemove(WebElement Element1, WebElement Element2) {
        try {
            String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
            ((JavascriptExecutor) driver).executeScript(mouseOverScript, Element1);
            Thread.sleep(3000);
            WebActionsUtil.explicitWait(driver,Element2,"visible");
            ((JavascriptExecutor) driver).executeScript(mouseOverScript, Element2);
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Element2);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void startProxy(String role) throws Exception {
        searchbySearchBox(Constants.SRCHBOXSTPROXY);
        WebActionsUtil.explicitWait(driver, startproxyLink, "click");
        startproxyLink.click();
        userWait(3000);
        namestartproxy.click();
        userWait(1000);

        if (role.contains("HR Partner")) {
            namesearchboxstartproxy.sendKeys(Constants.HR_PARTNER, Keys.ENTER);
            log.debug("Proxying to : " + Constants.HR_PARTNER);
            userWait(3000);
        } else if (role.contains("HR_Partner_0914")) {
            namesearchboxstartproxy.sendKeys(Constants.HR_PARTNER_0914, Keys.ENTER);
            log.debug("Proxying to : " + Constants.HR_PARTNER_0914);
            userWait(3000);
        } else if (role.contains("HCM Partner2")) {
            namesearchboxstartproxy.sendKeys(Constants.HR_PARTNER2, Keys.ENTER);
            log.debug("Proxying to : " + Constants.HR_PARTNER2);
            userWait(3000);
        } else if (role.contains("HR_Partner_7052")) {
            namesearchboxstartproxy.sendKeys(Constants.HR_PARTNER_7052, Keys.ENTER);
            log.debug("Proxying to : " + Constants.HR_PARTNER_7052);
            userWait(3000);
        } else if (role.contains("Absence_Admin_Canada")) {
            namesearchboxstartproxy.sendKeys(Constants.Absence_Admin_Canada, Keys.ENTER);
            log.debug("Proxying to : " + Constants.Absence_Admin_Canada);
            userWait(3000);
        } else if (role.contains("BP Admin")) {
            namesearchboxstartproxy.sendKeys(Constants.BP_Admin, Keys.ENTER);
            log.debug("Proxying to : " + Constants.BP_Admin);
            userWait(5000);
        } else if (role.contains("Absence Admin")) {
            namesearchboxstartproxy.sendKeys(Constants.Absence_Admin, Keys.ENTER);
            log.debug("Proxying to : " + Constants.Absence_Admin);
        } else if (role.contains("Comp Admin")) {
            namesearchboxstartproxy.sendKeys(Constants.Comp_Admin, Keys.ENTER);
            userWait(3000);
//            selectfromduplicates(Constants.Comp_Admin);
            log.debug("Proxying to : " + Constants.Comp_Admin);
        } else if (role.equalsIgnoreCase("Talent Admin")) {
            namesearchboxstartproxy.sendKeys(Constants.Talent_admin, Keys.ENTER);
            log.debug("Proxying to : " + Constants.Talent_admin);
            userWait(5000);
        } else if (role.equalsIgnoreCase("Talent Admin 7052")) {
            namesearchboxstartproxy.sendKeys(Constants.Talent_admin_7052, Keys.ENTER);
            log.debug("Proxying to : " + Constants.Talent_admin_7052);
            userWait(5000);
        } else if (role.equalsIgnoreCase("Talent Admin 0914")) {
            namesearchboxstartproxy.sendKeys(Constants.Talent_admin_0914, Keys.ENTER);
            log.debug("Proxying to : " + Constants.Talent_admin_0914);
            userWait(5000);
        } else if (role.contains("Succession Partner 7152")) {
            namesearchboxstartproxy.sendKeys(Constants.succession_partner_7152, Keys.ENTER);
            log.debug("Proxying to : " + Constants.succession_partner_7152);
            userWait(3000);
        }else if (role.contains("Manager_7052")) {
            namesearchboxstartproxy.sendKeys(Constants.Manager_7052, Keys.ENTER);
            log.debug("Proxying to : " + Constants.Manager_7052);
            userWait(3000);
        } else if (role.contains("Manager_0914")) {
            namesearchboxstartproxy.sendKeys(Constants.Manager_0914, Keys.ENTER);
            log.debug("Proxying to : " + Constants.Manager_0914);
            userWait(3000);
        } else if (role.contains("Manager_6351")) {
            namesearchboxstartproxy.sendKeys(Constants.Manager_6351, Keys.ENTER);
            log.debug("Proxying to : " + Constants.Manager_6351);
            userWait(3000); //
        } else if (role.contains("Manager")) {
            namesearchboxstartproxy.sendKeys(Constants.Manager_7152_DonaldCrete, Keys.ENTER);
            log.debug("Proxying to : " + Constants.Manager_7152_DonaldCrete);
            userWait(3000);
        }else if (role.contains("Succession partner for 7052")) {
                namesearchboxstartproxy.sendKeys(Constants.succession_partner_7052, Keys.ENTER);
                log.debug("Proxying to : " + Constants.succession_partner_7052);
                userWait(5000);
        } else if (role.contains("PayRoll Admin")) {
            namesearchboxstartproxy.sendKeys(Constants.PayRoll_Admin, Keys.ENTER);
            log.debug("Proxying to : " + Constants.PayRoll_Admin);
            userWait(3000);
        } else if (role.contains("SecurityPartner")) {
            namesearchboxstartproxy.sendKeys(Constants.Security_Partner, Keys.ENTER);
            log.debug("Proxying to : " + Constants.Security_Partner);
            userWait(3000);
        } else {
            namesearchboxstartproxy.sendKeys(role, Keys.ENTER);
            userWait(4000);
            //selectfromduplicates(role);
            userWait(3000);
            log.debug("Proxying to : " + role);
            //  userWait(9000);
            // selectfromduplicates(role);
        }


        userWait(3000);
        WebActionsUtil.explicitWait(driver, okbuttonStartProxy, "click");
        okbuttonStartProxy.click();
        userWait(5000);
        searchBox.clear();
        if (tagStartProxy.isDisplayed()) {
            if (role.contains("HR Partner")) {
                test.pass("Proxy successful to the required role, Proxy to:  " + role + ": " + Constants.HR_PARTNER);
                log.info("Proxy successful to the required role, Proxy to:  " + role + ": " + Constants.HR_PARTNER);
            } else if (role.contains("BP Admin")) {
                test.pass("Proxy successful to the required role, Proxy to:  " + role + ": " + Constants.BP_Admin);
                log.info("Proxy successful to the required role, Proxy to:  " + role + ": " + Constants.BP_Admin);
            } else if (role.contains("Comp Admin")) {
                test.pass("Proxy successful to the required role, Proxy to:  " + role + ": " + Constants.Comp_Admin);
                log.info("Proxy successful to the required role, Proxy to:  " + role + ": " + Constants.Comp_Admin);
            } else if (role.contains("Talent Admin")) {
                test.pass("Proxy successful to the required role, Proxy to:  " + role + ": " + Constants.Talent_admin);
                log.info("Proxy successful to the required role, Proxy to:  " + role + ": " + Constants.Talent_admin);
            } else if (role.contains("Talent Admin 7052")) {
                test.pass("Proxy successful to the required role, Proxy to:  " + role + ": " + Constants.Talent_admin_7052);
                log.info("Proxy successful to the required role, Proxy to:  " + role + ": " + Constants.Talent_admin_7052);
            } else if (role.contains("Absence Admin")) {
                test.pass("Proxy successful to the required role, Proxy to:  " + role + ": " + Constants.Absence_Admin);
                log.info("Proxy successful to the required role, Proxy to:  " + role + ": " + Constants.Absence_Admin);
            } else if (role.contains("SecurityPartner")) {
                test.pass("Proxy successful to the required role, Proxy to:  " + role + ": " + Constants.Security_Partner);
                log.info("Proxy successful to the required role, Proxy to:  " + role + ": " + Constants.Security_Partner);
            } else {
                test.pass("Proxy successful to the required role, Proxy to:  " + role);
                log.info("Proxy successful to the required role, Proxy to:  " + role);
            }
        } else {
            //test.fail("Could not Proxy to the required role");
            log.error("Could not Proxy to the required role");
        }
    }

    public void simplestartProxy(String role) throws Exception {
        searchbySearchBox(Constants.SRCHBOXSTPROXY);
        WebActionsUtil.explicitWait(driver, startproxyLink, "click");
        startproxyLink.click();
        userWait(3000);
        namestartproxy.click();
        userWait(2000);
        WebActionsUtil.explicitWait(driver, namesearchboxstartproxy, "click");
        namesearchboxstartproxy.sendKeys(role, Keys.ENTER);
        userWait(5000);
        log.debug("Proxying to : " + role);
        WebActionsUtil.explicitWait(driver, okbuttonStartProxy, "click");
        okbuttonStartProxy.click();
        userWait(3000);
        searchBox.clear();
    }

    public void inboxOperation(String Inboxrow_searchstring) throws Exception {
        gotoWorkdayHomepage();
        inboxWD.click();
        userWait(3000);
        WebElement inboxrow = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'" + Inboxrow_searchstring + "')]"));
        scrolltoElement(inboxrow);
        inboxrow.click();
        userWait(3000);
        try {
            if (inboxbuttonApprove.isDisplayed()) {
                log.info(" Approval button is available");
                inboxbuttonApprove.click();
                userWait(3000);
            }
        } catch (NoSuchElementException e) {
            log.info("No Approval button available");
        }

        try {
            if (inboxbuttonSubmit.isDisplayed()) {
                log.info(" Submit button is available");
                inboxbuttonSubmit.click();
                userWait(3000);
            }
        } catch (NoSuchElementException e) {
            log.info("No Submit button available");
        }
        inboxbuttonDone.click();
        userWait(3000);
        gotoWorkdayHomepage();
    }

    public void StartProxy_employee(String proxyname) throws Exception {
        searchbySearchBox(proxyname);
        userWait(2000);
        allOfWorkday.click();
        log.info("all of Workday is Clicked");
        userWait(2000);
//        WebElement namelink = driver.findElement(By.xpath("(//*[text()='" + proxyname + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + proxyname + "')][1]"));
        WebElement namelink = driver.findElement(By.xpath("//*[contains(text(),'" + proxyname + "')]//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + proxyname + "')][1]"));
        scrolltoElement(namelink);
//        WebActionsUtil.explicitWait(driver, namelink, "click");
        userWait(2000);
        namelink.click();
        userWait(3000);
        clickAction.click();
        userWait(1000);
        scrolltoElement(securityprofileActions);
        mousemove(securityprofileActions, startproxyActions);
        userWait(1000);
        okbuttonStartProxy.click();
        userWait(5000);
        searchBox.clear();
        if (tagStartProxy.isDisplayed()) {

            test.pass("Proxy successful to the required role, Proxy to:  " + proxyname);
            log.info("Proxy successful to the required role, Proxy to:  " + proxyname);
        } else {
            test.fail("Could not Proxy to the required role");
            log.error("Could not Proxy to the required role");
        }
    }


    public void Perfrom_employeeActions(String employee, WebElement element1, WebElement element2) throws Exception {
        startProxy(Constants.BP_Admin);
        searchbySearchBox(employee);
        userWait(2000);
        allOfWorkday.click();
        userWait(3000);
        log.info("Error happened here");
        WebElement namelink = driver.findElement(By.xpath("(//*[contains(text(),'" + employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + employee + "')][1]"));
        log.info("Error Passed here");
        WebActionsUtil.explicitWait(driver,namelink,"click");
        namelink.click();
        userWait(2000);
        clickAction.click();
        userWait(1000);
        mousemove(element1, element2);
        userWait(3000);
    }



    public void loading() throws Exception {
        JFrame wdframe = new JFrame("Awaiting Actions. . . . .");
        JPanel wdpanel = new JPanel();
        JProgressBar wdbar = new JProgressBar();
        wdbar.setMinimum(0);
        JButton goButton = new JButton("Go");
        Dimension prefSize = goButton.getPreferredSize();
        prefSize.width = 450;//some width
        wdbar.setPreferredSize(prefSize);
        // b.setMaximum();

        wdbar.setStringPainted(true);
        wdpanel.add(wdbar);
        wdpanel.setBackground(Color.LIGHT_GRAY);
        wdframe.add(wdpanel);
        wdframe.setBackground(Color.BLACK);
        wdframe.setSize(600, 75);
        wdframe.setLocationRelativeTo(null);
        wdframe.setVisible(true);

        int i = 0;
        while (i <= 100) {
            // set text accoring to the level to which the bar is filled
            if (i > 30 && i < 70)
                wdbar.setString("LOADING AWAITING/PENDING ACTIONS. . . . .Wait For Sometime");
            else if (i > 70)
                wdbar.setString("LOADING AWAITING/PENDING ACTIONS. . . . .Almost Finished Loading");
            else if (i >= 90)
                wdbar.setString("LOADING AWAITING/PENDING ACTIONS. . . . .Completed");
            else
                wdbar.setString("LOADING AWAITING/PENDING ACTIONS. . . . . Loading Started");

            // fill the menu bar
            wdbar.setValue(i + 5);

            // delay the thread
            Thread.sleep(500);
            i++;
        }
        wdframe.dispatchEvent(new WindowEvent(wdframe, WindowEvent.WINDOW_CLOSING));
    }

    public void pickassociateId() throws Exception
    {
        gotoWorkdayHomepage();
        selfImgBtn.click();
        userWait(2000);
        viewprofileSelf.click();
        userWait(2000);
        associate_ID=associateID.getText();
        log.info("The Employee Id"+associate_ID);
    }

    public void more_dropdownbox(WebElement subelem) throws Exception {
        userWait(1000);
        WebActionsUtil.explicitWait(driver,tabmoreEmpProfile,"click");
        tabmoreEmpProfile.click();
        userWait(2000);
        subelem.click();
        userWait(2000);
    }


    public void inboxOperationPerformance(String Inboxrow_searchstring) throws Exception {
        gotoWorkdayHomepage();
        inboxWD.click();
        userWait(3000);
        WebElement inboxrow = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'" + Inboxrow_searchstring + "')]"));
        scrolltoElement(inboxrow);
        inboxrow.click();
        userWait(3000);

    }

    public void inboxOperation1(String Inboxrow_searchstring) throws Exception {
        gotoWorkdayHomepage();
        inboxWD.click();
        userWait(3000);
        WebElement inboxrow = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'" + Inboxrow_searchstring + "')]"));
        scrolltoElement(inboxrow);
        inboxrow.click();
        userWait(3000);
//        inboxbuttonDone.click();
//        userWait(3000);
//        gotoWorkdayHomepage();
    }

    public String emp_name;

    public void setEmployeename(String Emp_Name1) {
        this.emp_name = Emp_Name1;
        log.info("Setting value - " + emp_name);
    }

    public String getEmployeename() {
        log.info("emp_name" + emp_name);
        return this.emp_name;
    }



    HashMap<Integer, String> hashmapobj = new HashMap<Integer, String>();
    int randomnub=0;

    public void sethashmap(HashMap map)
    {
        hashmapobj.putAll(map);
    }

    public void setrandomnumber(int randomnumber)
    {
        this.randomnub = randomnumber;
    }

    public String fetchemployee(String featureemp)
    {

        String empvalue = null;
        String empvalue_hire = hashmapobj.get(randomnub);

        log.info("Associate from feature file:"+featureemp);
        log.info("Associate from Hire :"+empvalue_hire);
        if (empvalue_hire == null)
        {
            empvalue = featureemp;
        }
        else
        {
            empvalue = empvalue_hire;
        }
        return empvalue;
    }


//    public ExtentTest getExtentTest( ){
//        ScenarioHooks hooks = new ScenarioHooks();
//        ExtentTest test = hooks.getExtentTest();
//        WorkdayCommon obj = new WD_SuccessionPlanStepdef();
//        return test;
//    }

//    public void setExtenttest(ExtentTest test)
//    {
//        this.test = test;
//    }

    public void Testresult(String stepnumber , String session) {
// String idnumber= null;
        if (session == null) {
            test.fail("Step Failed and the driver is closed");
        } else {
            test.pass("Step " + stepnumber + " Completed");
            log.info("Step " + stepnumber + " Completed");
        }
    }
        public void Driverclose() {
        driver.quit();
        log.info("Test Step has failed, Closing the Browser");
    }

}
