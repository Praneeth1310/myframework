package com.thd.projectname.pages.PO_SuccessionPlan;

import com.thd.base.BasePage;
import com.thd.base.Constants.Constants;
import com.thd.common.utils.WebActionsUtil;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

//import java.util.concurrent.TimeUnit;


public class SuccessionPlan extends BasePage {
    private static final Logger log = LogManager.getLogger(SuccessionPlan.class);
    WorkdayCommon workdaycommon = new WorkdayCommon();

    //   *****************************WebElements*******************************************


    //private Succession PLan---------------------------------------------------------------------------------------------


    @FindBy(xpath = "//div[@data-automation-id='promptOption' and text()='Create Succession Plan']")
    private WebElement linkCreateSuccessionPlan;

    @FindBy(xpath = "//label[text()='Position']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement positionCreateSuccessionPlan;

    //@FindBy(xpath = "//label[text()='Confirm']//following::input[@type='checkbox'][1]")
    //@FindBy(xpath = "//label[text()='Confirm']//following::div[@data-automation-id='checkboxPanel'][1]")
    //@FindBy(xpath = "//label[text()='Confirm']//following::div[@data-automation-id='checkbox'][1]")
    @FindBy(xpath = "//div[@data-automation-id='checkboxPanel']")
    private WebElement chkboxConfirmCreateSuccessionPlan;

    @FindBy(xpath = "//div[text()='Talent']")
    private WebElement actionsTalent;

    @FindBy(xpath = "//div[text()='Talent']//following::div[text()='Add to Succession Plan']")
    private WebElement talentAddToSuccessionPlan;

    @FindBy(xpath = "//span[text()='Candidate']//following::button[@title='Add Row']//following::div[@data-automation-id='responsiveMonikerInput'][1]")
    private WebElement candidateSuccessionPlan;

    @FindBy(xpath = "//button[@title='Manage Succession Plan']")
    private WebElement btnManageSuccessionPlan;

    @FindBy(xpath = "//span[text()='Candidate']//following::button[@data-automation-id='addRow'][1]")
    private WebElement addRowCandidate;

    @FindBy(xpath = "//span[text()='Candidate']//following::button[@title='Add Row']//following::div[@data-automation-id='responsiveMonikerInput'][1]//following::div[@data-automation-id='selectShowAll'][1]")
    private WebElement selectOneReadiness;

    @FindBy(xpath = " //span[text()='Candidate']//following::div[@data-automation-id='responsiveMonikerInput'][1]//following::div[@data-automation-id='checkboxPanel'][1]")
    private WebElement chkboxTopCandidate;

    @FindBy(xpath = "//div[text()='View Succession Plan for Position']")
    private WebElement linkSuccessionPlanforPosition;

    @FindBy(xpath = "//label[text()='Position']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement positionViewSuccessionPlan;

    @FindBy(xpath = "//button[@title='Succession Plan History']")
    private WebElement btnSuccessionPlanHistory;

    @FindBy(xpath = "//div[text()='Manage Succession Plan']")
    private WebElement linkManageSuccessionPlan;

    @FindBy(xpath = "//label[text()='Position']//following::span[@data-automation-id='promptIcon']")
    private WebElement positionManageSuccessionPlan;


    //common----------------------

    @FindBy(xpath = "//button[@title='OK']")
    private WebElement btnOK;

    @FindBy(xpath = "//button[@title='Submit']")
    private WebElement btnSubmit;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[@data-automation-id='textView'][1]")
    private WebElement validateMsg;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_uic_doneButton' and @title='Done']")
    private WebElement btnDone;

    @FindBy(xpath = "//div[@data-automation-id='saveButton' and @title='Save'][1]")
    private WebElement btnSaveDevItems;

    @FindBy(xpath = "//div[@data-automation-id='saveButton' and @title='Save Row 2'][1]")
    private WebElement btnSaveDevItemsMngr;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_uic_cancelButton' and @title='Cancel'][1]")
    private WebElement btnCancel;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_uic_genericYesButton' and @title='Discard'][1]")
    private WebElement btnDiscard;

    @FindBy(xpath = "//span[text()='Associate']//following::button[@title='Filter']")
    //@FindBy(xpath = "//span[text()='Associate']//following::button[@data-automation-id='wd-CommandButton_uic_filterButton' and @title='Filter']")
    private WebElement btnFilter;

    @FindBy(xpath = "//button[@title='Open']")
    private WebElement btnOpen;

    @FindBy(xpath = "//span[text()='Details and Process']")
    private WebElement detailsAndProcess;

    @FindBy(xpath = "//span[text()='Details and Process']//following::div[text()='Process'][1]")
    private WebElement tabProcess;

    @FindBy(xpath = "//span[text()='Job']")
    private WebElement menuJob;

    @FindBy(xpath = "//span[text()='More']")
    public WebElement tabMore;

    @FindBy(xpath = "//label[text()='All of Workday']")
    private WebElement allOfWorkday;

    @FindBy(xpath = "//div[text()='Talent']")
    public WebElement TalentAction;

    @FindBy(xpath = "//div[text()='Talent']//following::div[text()='Add to Succession Plan']")
    public WebElement addToSuccessionPlan;

    //---------------------------------------------------------------------------

    //-------------------------------Employee Position-----------------------------
    @FindBy(xpath = "//span[@data-automation-id='workerProfileMenuItemLabel'  and text()='Summary']")
    private WebElement summaryTab;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Position']//following::div[@data-automation-id='promptOption'][1]")
    private WebElement positionClick;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Position Restrictions']//following::div[@data-automation-id='promptOption'][1]")
    private WebElement positionSelect;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Job Posting Title']//following::div[@data-automation-id='textView'][1]")
    private WebElement getPosition;


    //-------------------------------------------------------------------------------------------

    @FindBy(xpath = "//*[@data-automation-id='searchBox']")
    public WebElement insidesearchboxcommon;

    String getPositionname = null;

    //function----------------------------------------------------------

    public void CreateSuccessionPlan(String Leader, String EmployeeOne, String EmployeeTwo, String Readiness) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.searchbySearchBox(Constants.SRCHCREATESUCCESSIONPLAN);
        WebActionsUtil.explicitWait(driver, linkCreateSuccessionPlan, "click");
        linkCreateSuccessionPlan.click();
        workdaycommon.userWait(3000);
        log.info("Create Succesion plan entered");
        positionCreateSuccessionPlan.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Leader, Keys.ENTER);
        workdaycommon.userWait(5000);
        log.info("Position Entered");
//        WebActionsUtil.explicitWait(driver,chkboxConfirmCreateSuccessionPlan,"click");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", chkboxConfirmCreateSuccessionPlan);

        // chkboxConfirmCreateSuccessionPlan.click();
        log.info("Checkbox is clicked");
        workdaycommon.userWait(3000);
        btnOK.click();

        workdaycommon.userWait(2000);
        //btnManageSuccessionPlan.click();  //uncomment if necessary
        btnDone.click();
        //AddSuccessors(Leader,Leader,Readiness);
        AddSuccessors(Leader, EmployeeOne, Readiness);
        workdaycommon.userWait(2000);
        AddSuccessors(Leader, EmployeeTwo, Readiness);
        //GetPosition(Leader);
    }


    public void AddSuccessors(String Leader, String Employee, String Readiness) throws Exception {
        workdaycommon.userWait(2000);
        workdaycommon.searchbySearchBox(Employee);
        WebElement EmpName = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'" +Employee+ "')]"));
        EmpName.click();
        workdaycommon.userWait(3000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(actionsTalent, talentAddToSuccessionPlan);
        workdaycommon.userWait(2000);
        positionCreateSuccessionPlan.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Leader, Keys.ENTER);
        workdaycommon.userWait(4000);
        btnOK.click();
        workdaycommon.userWait(2000);
        JavascriptExecutor jst= (JavascriptExecutor) driver;
        jst.executeScript("arguments[0].click () ", candidateSuccessionPlan);
        // candidateSuccessionPlan.click();
        workdaycommon.scroll();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Employee, Keys.ENTER);
        selectOneReadiness.click();
        workdaycommon.userWait(2000);
        WebElement readiness = driver.findElement(By.xpath("//span[text()='Candidate']//following::div[@data-automation-id='responsiveMonikerInput'][1]//following::div[@data-automation-id='selectShowAll'][1]//following::div[@title='" + Readiness + "']"));
        readiness.click();
        workdaycommon.userWait(2000);
        chkboxTopCandidate.click();
        workdaycommon.userWait(2000);
        btnSubmit.click();
        workdaycommon.userWait(2000);
        detailsAndProcess.click();
        workdaycommon.userWait(2000);
        String overallStatus = validateMsg.getText();
        log.info("---------overallStatus------>" + overallStatus);
        if (overallStatus.equals("Successfully Completed")) {
            workdaycommon.userWait(1000);
            workdaycommon.scrolltoElement(tabProcess);
            WebActionsUtil.explicitWait(driver, tabProcess, "click");
            tabProcess.click();
            log.info("Process tab is clicked");
            workdaycommon.scrollDOWN_height();
            try {
                log.info("Checking for Awaiting Action..... ");
                if (workdaycommon.awaitingaction.isDisplayed()) {
                    log.info("Create Succession plan is not completed successfully");
                    test.fail("Create Succession plan is not complete successfully");
                    driver.quit();
                }

            } catch (Exception e) {
                log.info("BP:Create Succession plan , Candidate " + Employee + " is added");
                test.pass("Create Succession plan is successfully completed");
                test.info("BP:Create Succession plan , Candidate " + Employee + " is added");
            }
        } else {
            log.info("Create Succession plan is not completed successfully........Current Status: " + overallStatus);
            test.fail("Create Succession plan is not completed successfully.......Current Status: " + overallStatus);
            driver.quit();

        }
    }


    public void ViewSuccessionPlan(String Leader) throws Exception {
        //boolean result = false;
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);

        workdaycommon.searchbySearchBox(Constants.SRCHVIEWSUCCESSIONPLAN);
        workdaycommon.userWait(2000);
        linkSuccessionPlanforPosition.click();
        workdaycommon.userWait(2000);

        //String Position = "SRPTMG - MANAGER, PRO OPERATIONS CAN";
        WebActionsUtil.explicitWait(driver, positionViewSuccessionPlan, "click");
        positionViewSuccessionPlan.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(getPositionname, Keys.ENTER);
        //insidesearchboxcommon.sendKeys(Position, Keys.ENTER);
        workdaycommon.userWait(9000);
        //WebElement clickPosition= driver.findElement(By.xpath("//div[@data-automation-id='selectedItem' and contains(@title,'"+Position+"')]"));
//        WebElement clickPosition= driver.findElement(By.xpath("//div[@data-automation-id='selectedItem' and contains(@title,'"+getPositionname+"')]"));
//        workdaycommon.userWait(2000);
//        log.info("clicking position");
//        WebActionsUtil.explicitWait(driver,clickPosition,"click");
//        log.info("clicked on position name");
//        clickPosition.click();
//        //  workdaycommon.selectfromduplicates(getPositionname);
//        workdaycommon.userWait(4000);
        btnOK.click();
        workdaycommon.userWait(2000);
        try {
            btnSuccessionPlanHistory.click();
            workdaycommon.userWait(2000);
        } catch (NoSuchElementException e) {
            log.info("No Successors are added in this Succession Plan");
        }
        try {
            log.info("Inside try block");
            WebElement SuccessionPlan_JobProfile = driver.findElement(By.xpath("//label[@data-automation-id='rowCountLabel']//preceding::div[contains(text(),'" + Leader + "')][1]"));
            if (SuccessionPlan_JobProfile.isDisplayed()) {
                log.info("Inside if condition");
                log.info("Leader appears in the Succession Plan");
                test.fail("Leader appear in the Succession Plan");
                driver.quit();
            }
        } catch (Exception e) {
            log.info("Inside catch block");
            WebElement SuccessionPlan_Position = driver.findElement(By.xpath("//label[@data-automation-id='rowCountLabel']//preceding::div[contains(text(),'" + getPositionname + "')][1]"));
            // WebElement SuccessionPlan_Position = driver.findElement(By.xpath("//label[text()='Succession Plan']//following::div[text()='Sales Associate IV - "+Position+"'][1]"));
            if (SuccessionPlan_Position.isDisplayed()) {
                log.info("Inside if condition of catch block");
                log.info("Leader does not appear in the Succession Plan ");
                test.pass("Leader does not appear in the Succession Plan");
            }
        }
    }

    public void ManageSuccessionPlan(String Leader, String employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);

        workdaycommon.searchbySearchBox(Constants.SRCHMANAGESUCCESSIONPLAN);
        WebActionsUtil.explicitWait(driver, linkManageSuccessionPlan, "click");
        linkManageSuccessionPlan.click();
        workdaycommon.userWait(2000);

        WebActionsUtil.explicitWait(driver, positionManageSuccessionPlan, "click");
        positionManageSuccessionPlan.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Leader, Keys.ENTER);
        workdaycommon.userWait(4000);
        btnOK.click();
        workdaycommon.userWait(2000);
        workdaycommon.scrollDOWN_height();

        try {
            log.info("Inside try block");
            WebElement OnLeave_successor = driver.findElement(By.xpath("//*[@data-automation-id='rowCountLabel']//following::*[contains(text(),'" + employee + " (On Leave)')]"));
            if (OnLeave_successor.isDisplayed()) {
                log.info("Inside if condition");
                log.info("Successor with leave appears in the Succession Plan");
                test.pass("Successor with leave appears in the Succession Plan");

            }
        } catch (Exception e) {
            log.info("Inside if condition of catch block");
            log.info("Successor with leave does not appear in the Succession Plan ");
            test.fail("Successor with leave does not appear in the Succession Plan");
            driver.quit();

        }
    }

    public void GetPosition(String Employee) throws Exception {
        log.info("The employee name is : " + Employee);
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(2000);
        workdaycommon.searchbySearchBox(Employee);
        try {
            WebElement EmpName = driver.findElement(By.xpath("(//*[text()='" + Employee + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
            //WebElement EmpName = driver.findElement(By.xpath("//*[@data-automation-id='promptOption'"));
            WebActionsUtil.explicitWait(driver, EmpName, "click");
            EmpName.click();
        } catch (Exception e) {
            allOfWorkday.click();
            WebElement EmpName = driver.findElement(By.xpath("(//*[text()='" + Employee + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
            //WebElement EmpName = driver.findElement(By.xpath("//*[@data-automation-id='promptOption'"));
            WebActionsUtil.explicitWait(driver, EmpName, "click");
            EmpName.click();
        }
        workdaycommon.userWait(2000);
        try {
            summaryTab.click();
            workdaycommon.userWait(3000);
            positionClick.click();
            workdaycommon.userWait(2000);
            WebActionsUtil.explicitWait(driver, positionSelect, "click");
            positionSelect.click();
            workdaycommon.userWait(2000);
            getPositionname = getPosition.getText();
            log.info("Position--->" + getPositionname);
        } catch (NoSuchElementException e) {
            log.error("Not able to get the position due to No Element Exception");
        }


    }

    public void Check_Create_Succession_Plan_By_Manager(String Employee) throws Exception {
        log.info("The employee name is : " + Employee);
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(2000);
        workdaycommon.searchbySearchBox(Employee);

        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        workdaycommon.allOfWorkday.click();
        workdaycommon.userWait(3000);
        WebElement SrchEmployeename = driver.findElement(By.xpath("(//*[text()='" + Employee + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(SrchEmployeename);
        workdaycommon.userWait(3000);
        SrchEmployeename.click();
        workdaycommon.userWait(3000);

        workdaycommon.clickAction.click();
        try{
            workdaycommon.mousemove(TalentAction,addToSuccessionPlan);
            String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
            ((JavascriptExecutor) driver).executeScript(mouseOverScript, TalentAction);
            Thread.sleep(3000);
//            WebActionsUtil.explicitWait(driver,addToSuccessionPlan,"visible");
            ((JavascriptExecutor) driver).executeScript(mouseOverScript, addToSuccessionPlan);
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToSuccessionPlan);

               log.info("Manager can perform Create/ Add to Succession Plan here");
               log.info("Manager should not able to perform Create/ Add to Succession Plan as per this scenario");
               test.fail("Manager can perform Create/ Add to Succession Plan");
               test.info("As per this scenario, manager should not able to perform Create/ Add to Succession Plan");
        }catch(Exception e){
            log.info("Manager does not have access to perform Create/ Add to Succession Plan");
            test.pass("Manager does not have access to perform Create/ Add to Succession Plan");
        }
    }

}
