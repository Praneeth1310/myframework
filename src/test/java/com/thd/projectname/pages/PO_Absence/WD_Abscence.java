package com.thd.projectname.pages.PO_Absence;

import com.sun.corba.se.spi.orbutil.threadpool.Work;
import com.thd.base.BasePage;
import com.thd.common.utils.WebActionsUtil;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;


public class WD_Abscence extends BasePage {
    private static final Logger log = LogManager.getLogger(WD_Abscence.class);
    WorkdayCommon workdaycommon = new WorkdayCommon();

    //Web Elements ------------------------------------------------------------------------------------
//RequestAbsence------------------------------------------------------------

    @FindBy(xpath = "//div[text()='Time and Leave']")
    public WebElement TimeandLeave_optionActions;

    @FindBy(xpath = "//div[text()='Return Associate From Leave']")
    public WebElement Returnworkerfromleave_optionActions;

    @FindBy(xpath = "//div[text()='Enter Absence']")
    public WebElement EnterAbsence_optionActions;

    @FindBy(xpath = "//button[@title='Select Date Range']")
    public WebElement selectdaterangeRequestAbsence;

    @FindBy(xpath = "//span[text()='Select Date Range']//following::div[@data-automation-id='productTourStartIcon'][1]")
    public WebElement avoidpopup;

    @FindBy(xpath = "//label[text()='From']//following::*[@data-automation-id='dateWidgetContainer'][1]")
    public WebElement fromdaterangeRequestAbsence;

    @FindBy(xpath = "//label[text()='To']//following::div[@data-automation-id='dateWidgetContainer'][1]")
    public WebElement todaterangeRequestAbsence;

    @FindBy(xpath = "//*[@data-automation-id='promptIcon']")
    public WebElement typeclickAbsence;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    public WebElement typeAbsence;

    //    @FindBy(xpath = "//span[@title='Next']") -- P1
    @FindBy(xpath = "(//div[@data-automation-id='dropDownCommandButton'])[6]")
    public WebElement popupNextAbsence;

    @FindBy(xpath = "(//div[@data-automation-id='dropDownCommandButton'])[1]")
    public WebElement submitAbsence;


    //View Leave of Absence--------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//div[text()='View Leave Results']")
    public WebElement leaveResults_optionActions;

    @FindBy(xpath = "//label[text()='As Of']//following::input[@data-automation-id='dateWidgetInputBox']")
    public WebElement asOfDateAbsence;

    @FindBy(xpath = "//label[text()='Leave Type(s)']//following::span[@data-automation-id='promptIcon']")
    public WebElement leaveTypeAbsence;

    @FindBy(xpath = "//span[@title='OK']")
    public WebElement okAbsence;

    @FindBy(xpath = "//span[text()='Status']//following::div[@data-automation-id='textView'][7]")
    public WebElement statusAbsence;

    @FindBy(xpath = "//span[text()='First Day']//following::div[@data-automation-id='textView'][4]")
    public WebElement firstDayAbsence;

    @FindBy(xpath = "//span[text()='Estimated Last Day']//following::div[@data-automation-id='textView'][5]")
    public WebElement estimatedLastDayAbsence;

    @FindBy(xpath = "//span[text()='Type']//following::div[@data-automation-id='textView'][3]")
    public WebElement leaveTypeStatusAbsence;


    //-----------------------------------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "(//h1[text()='Help Available'])[2]")
    public WebElement helpPopupAbsence;

    @FindBy(xpath = "(//div[@data-automation-id='productTourStartIcon'])[1]")
    public WebElement closeAbsence;


    @FindBy(xpath = "(//*[text()='Process History'])[1]//following::*[@class='wd-icon-fullscreen wd-icon'][1]")
    public WebElement tableMaxAbsence;

    @FindBy(xpath = "//label[text()='I Agree']//following::div[@data-automation-id='checkboxPanel']")
    public WebElement chkboxAgreeAbsence;

    //Return from Abscence -------------------------------------------------------
    @FindBy(xpath = "//button[@title='OK']")
    public WebElement okRWFA;

    @FindBy(xpath = "//div[@data-automation-id='dateWidgetContainer']")
    public WebElement firstdaybackRWFA;

    @FindBy(xpath = "(//*[@data-automation-id='dateWidgetContainer'])[2]")
    public WebElement lastdayabscenceRWFA;

    @FindBy(xpath = "//*[text()='Select' and @data-automation-id='columnLabel-1']//following::*[@data-automation-id='checkbox']")
    public WebElement checkboxRWFA;
    ///////////////////////////////////////////////////////////////////////////////
    @FindBy(xpath = "//*[@data-automation-id='searchBox']")
    public WebElement insidesearchboxcommon;

    @FindBy(xpath = "//span[@title='Submit']")
    public WebElement submitabscenceRWFA;

    @FindBy(xpath = "//label[text()='All of Workday']")
    public WebElement allOfWorkdayabscenceRWFA;

    @FindBy(xpath = "//span[@title='Submit']")
    public WebElement submitProCompHire;

    @FindBy(xpath = " //span[@title='Done']")
    public WebElement doneabscenceRWFA;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[2]")
    public WebElement overallStatusabscenceRWFA;

    @FindBy(xpath = "//*[text()='Awaiting Action']")
    public WebElement statusabscenceRWFA;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[text()='Process'][1]")
    public WebElement processabscenceRWFA;

    @FindBy(xpath = "(//*[@data-automation-id='selectedItemList'])[2]")
    public WebElement leaveOfExtensionType;

    @FindBy(xpath = "(//div[@data-automation-id='relatedActionsItem'])[8]")
    public WebElement workerHistory;

//Correct Time off ----------------------------------------------------------------------------------------------------------------------------------

    //@FindBy(xpath = "(//span[@data-automation-id='workerProfileMenuItemLabel'])[7]")
    @FindBy(xpath = "//span[@data-automation-id='workerProfileMenuItemLabel' and @title='Time Off']")
    public WebElement menuTimeOff;

    @FindBy(xpath = "(//*[@data-automation-id='RELATED_TASK_charm'])[1]")
    public WebElement action;

    @FindBy(xpath = "(//*[@data-automation-id='relatedActionsItemLabel' and text()='Business Process'])")
    public WebElement businessProcess;

    @FindBy(xpath = "(//*[text()='Business Process'])//following::div[text()='Correct']")
    public WebElement correct;

    @FindBy(xpath = "//*[@data-automation-id='textAreaField']")
    public WebElement commentsTextBox;

    @FindBy(xpath = "(//div[@data-automation-id='textView'])[5]")
    public WebElement estimatedLastDayOfLeave;

    @FindBy(xpath = "(//input[@data-automation-id='dateWidgetInputBox'])[3]")
    public WebElement estimatedLastDayOfLeaveDate;

    @FindBy(xpath = "//div[@data-automation-id='promptOption']")
    public WebElement employeeSearch;

    @FindBy(xpath = "(//span[@data-automation-id='fieldSetLegendLabel'])[4]")
    public WebElement supportingDocuments;



    //-------------------------------------------------------------------------------------------------------------------/
    @FindBy(xpath = "//span[text()='Type']//following::div[@data-automation-id='promptOption' and @title='Intermittent FMLA'][1]")
    public WebElement intermittentFMLAType;

    @FindBy(xpath = "//*[@data-automation-id='promptOption' and text()='Intermittent or Reduced Schedule Leave']")
    public WebElement intermittentFMLAHours;

    @FindBy(xpath = "(//div[@data-automation-id='promptOption' and text()='Intermittent FMLA'])")
    public WebElement intermittentFMLA;

    @FindBy(xpath = "//span[@title='Edit Quantity per Day']")
    public WebElement quantityintermittentFMLA;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Update All Quantities']//following::input[@data-automation-id='numericInput'][1]")
    public WebElement quantityValueintermittentFMLA;

    @FindBy(xpath = "//span[@title='Done']")
    public WebElement doneintermittentFMLA;

    @FindBy(xpath = "//span[@data-automation-id='fieldSetLegendLabel' and text()='Details for: Intermittent FMLA']//following::span[@data-automation-id='promptIcon']")
    public WebElement detailsforintermittentFMLA;

    @FindBy(xpath = "(//div[@data-automation-id='relatedActionsItemLabel' and text()='Security Profile'])")
    public WebElement securityProfile;

    @FindBy(xpath = "//*[text()='Start Proxy']")
    public WebElement startProxyFromAssociateName;



    public void AbsenceRequest(String Employee, String FromDateRange, String ToDateRange, String Type) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(1000);
        workdaycommon.Perfrom_employeeActions(Employee, TimeandLeave_optionActions, EnterAbsence_optionActions);
        selectdaterangeRequestAbsence.click();
        workdaycommon.userWait(5000);
        //Closing the popup window

        try {
            if (helpPopupAbsence.isDisplayed()) {
                closeAbsence.click();
                log.info("Popup Window displayed");
                workdaycommon.userWait(2000);
            }
        } catch (Exception e) {
            log.info("Popup Window not present");
            workdaycommon.userWait(1000);
        }


        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(fromdaterangeRequestAbsence);
        if (driverWrapper.isElementPresent(fromdaterangeRequestAbsence)) {
            log.info("Date not selected.......11111...");
            for (WebElement elem : driver.findElements(By.xpath("//label[text()='From']//following::input[@data-automation-id='dateWidgetInputBox'][1]"))) {
                log.info("Date not selected.....222....." + FromDateRange);
                elem.sendKeys(FromDateRange);
                elem.sendKeys(Keys.TAB);

            }
        }

        if (driverWrapper.isElementPresent(todaterangeRequestAbsence)) {
            for (WebElement elem : driver.findElements(By.xpath("//label[text()='To']//following::input[@data-automation-id='dateWidgetInputBox']"))) {
                log.info("Date selecting for To Region....." + ToDateRange);
                elem.sendKeys(ToDateRange);

            }
        }
        WebActionsUtil.explicitWait(driver,typeclickAbsence,"click");
        workdaycommon.userWait(6000);
        typeclickAbsence.click();
        workdaycommon.userWait(1000);
        log.info("Searching upto process tab....");

        typeAbsence.sendKeys(Type, Keys.ENTER);
        workdaycommon.userWait(7000);
        log.info("Searching upto process tab....");

        popupNextAbsence.click();
        workdaycommon.userWait(1000);
        log.info("Searching upto popupNextAbsence tab....");

        workdaycommon.scrolltoElement(submitAbsence);
        workdaycommon.userWait(1000);
        submitAbsence.click();
        workdaycommon.userWait(3000);
        test.pass("Abscence submitted successfully for: " + Employee);
        log.info("Searching upto submitAbsence tab....");

        workdaycommon.userWait(5000);
        AbsenceRWFL(Employee);
        //AbsenceAwaitingActionCheck(Employee);
        log.info("Searching upto process tab....");
        try {
            while (workdaycommon.awaitingaction_first.isDisplayed()) {
                Absenceawaiting_action(Employee);
                log.info("Absenceawaiting_action is done....");
                AbsenceRWFL(Employee);
                int Awaitingacyion_counter=1;
                log.info("The number of approvals completed till now: "+Awaitingacyion_counter);
                Awaitingacyion_counter++;

            }
        } catch (Exception e) {
            log.info("Running in Final Catch Block for validating Abscence request status........." + e);
            AbsenceAwaitingActionCheck(Employee);
        }
    }


    public void AbsenceRWFL(String Employee) throws Exception {
        workdaycommon.userWait(5000);
        log.info("...Entering into AbsenceRWFL function...");
        log.info("Checking in Process tab...RL.");
        test.info("Proxy to BP admin for checking Pending approvals/submissions for the employee: " + Employee);
        // workdaycommon.startProxy(Constants.BP_Admin);
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
//        WebActionsUtil.explicitWait(driver, allOfWorkdayabscenceRWFA, "click");
        workdaycommon.scrolltoElement(allOfWorkdayabscenceRWFA);
        allOfWorkdayabscenceRWFA.click();
        workdaycommon.userWait(1000);
        WebElement EmployeenamerRL = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Absence Request: " + Employee + "')]"));
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(EmployeenamerRL);
        workdaycommon.userWait(1000);
        EmployeenamerRL.click();
        workdaycommon.userWait(3000);
        processabscenceRWFA.click();
        workdaycommon.userWait(3000);
        log.info("Clicked on Employee..RL..");
    }

    public void Absenceawaiting_action(String Employee) throws Exception {
        workdaycommon.scrolltoElement(workdaycommon.labelawaitingaction);
        if (workdaycommon.labelawaitingaction.isDisplayed()) {


//            ---Added New line of code to click on the three dots---
            WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
            Threedots.click();
            workdaycommon.scrolltoElement(securityProfile);
            workdaycommon.mousemove(securityProfile,startProxyFromAssociateName);
            workdaycommon.userWait(1000);
            startProxyFromAssociateName.click();
            okAbsence.click();
            workdaycommon.userWait(3000);
            log.info(".......Proxy successful.......");
//            -------------------End of code to add click on three dots---

//            log.info("...Entering into Absenceawaiting_action function...");
//            String Approver_name = workdaycommon.awaitingAction(1);
//            StringBuilder proxyperson = new StringBuilder(Approver_name);
//            test.info("Pending Submission/Approval with: " + Approver_name);
//            log.info("Pending Submission/Approval with: " + Approver_name);
//            workdaycommon.userWait(3000);
//           try {
//               if (workdaycommon.tagStartProxy.getText().contains(Approver_name)) {
//                   log.info("The tenant is already having a proxy to: " + Approver_name);
//               } else {
//                   workdaycommon.simplestartProxy(proxyperson.toString());
//                   workdaycommon.userWait(4000);
//               }
//           }
//    catch(Exception e)
//    {
//    log.info("The tenant is under no proxy");
//    }

            workdaycommon.gotoWorkdayHomepage();
            workdaycommon.userWait(3000);
            workdaycommon.inboxWD.click();
            workdaycommon.userWait(2000);
            try {

                WebElement inboxTextEnterAbsence = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Absence Request: " + Employee + "')]"));
                if (inboxTextEnterAbsence.isDisplayed()) {
                    WebActionsUtil.explicitWait(driver, inboxTextEnterAbsence, "click");
                    workdaycommon.scrolltoElement(inboxTextEnterAbsence);
                    inboxTextEnterAbsence.click();
                    log.info("...Inbox text is clicked....");
                    workdaycommon.userWait(2000);
                    try {
                        log.info("...Entering try block for clicking checkbox....");
                        if (chkboxAgreeAbsence.isDisplayed()) {
                            log.info("...clicking on checkbox....");
                            workdaycommon.userWait(2000);
                            workdaycommon.scrolltoElement(chkboxAgreeAbsence);
                            chkboxAgreeAbsence.click();
                            workdaycommon.userWait(2000);
                        }
                    } catch (Exception ex) {
                        log.info("...I Agree check box is not present for Canada Employee....");
                    }
                    log.info("Searching for Submissions or Approvals");
                    try {
                        if (workdaycommon.inboxbuttonApprove.isDisplayed()) {
                            workdaycommon.inboxbuttonApprove.click();
                            workdaycommon.userWait(2000);
                            workdaycommon.inboxbuttonSubmit.click();
                            workdaycommon.userWait(2000);
                            workdaycommon.scroll();
                            doneabscenceRWFA.click();
                            workdaycommon.userWait(2000);
                            log.info("Approve button available....");
                        }
                    } catch (Exception e) {
                        workdaycommon.inboxbuttonSubmit.click();
                        workdaycommon.userWait(2000);
                        workdaycommon.scroll();
                        doneabscenceRWFA.click();
                        workdaycommon.userWait(2000);
                        log.info("Only Submit button available....");
                    }
                    log.info("Submission/Approval done Successfully.......");
                    test.pass("Submission/Approval completed");
//                    by: " + Approver_name);
                }

            } catch (NoSuchElementException e) {
                log.info("No more mails to be submitted");
            }
        }
        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.userWait(1000);
    }


    public void AbsenceAwaitingActionCheck(String Employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.info("...Entering into AbsenceAwaitingActionCheck function...");
        workdaycommon.userWait(2000);
        String overallStatus = overallStatusabscenceRWFA.getText();
        log.info("---------overallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);
        workdaycommon.scroll();
        if (overallStatus.equals("Successfully Completed")) {
            test.pass("Absence Request Completed Successfully for Employee name :" + Employee);
            log.info("Absence Request Completed Successfully........");

        } else {
            log.info("Absence Request not Completed Successfully........");
            test.fail("Absence Request not Completed Successfully........");
            driver.quit();

        }

    }

    public void LeaveOfExtension(String Employee, String FromDateRange, String ToDateRange, String LOEType) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        workdaycommon.Perfrom_employeeActions(Employee, TimeandLeave_optionActions, EnterAbsence_optionActions);
        selectdaterangeRequestAbsence.click();
        try {
            if (helpPopupAbsence.isDisplayed()) {
                closeAbsence.click();
                log.info("Popup Window displayed");
                workdaycommon.userWait(2000);
            }
        } catch (Exception e) {
            log.info("Popup Window not present");
            workdaycommon.userWait(1000);
        }
//        workdaycommon.userWait(3000);
//        workdaycommon.scrolltoElement(fromdaterangeRequestAbsence);
        if (driverWrapper.isElementPresent(fromdaterangeRequestAbsence)) {
            log.info("Date selected.......11111...");
            for (WebElement elem : driver.findElements(By.xpath("//label[text()='From']//following::input[@data-automation-id='dateWidgetInputBox'][1]"))) {
                log.info("Date selected.....222....." + FromDateRange);
                workdaycommon.userWait(3000);
                elem.sendKeys(FromDateRange);
                workdaycommon.userWait(3000);
                elem.sendKeys(Keys.TAB);
            }
        }

        workdaycommon.userWait(1000);
        if (driverWrapper.isElementPresent(todaterangeRequestAbsence)) {
            for (WebElement elem : driver.findElements(By.xpath("//label[text()='To']//following::input[@data-automation-id='dateWidgetInputBox']"))) {
                log.info("Date selecting for To Region....." + ToDateRange);
                elem.sendKeys(ToDateRange);
            }
        }

        workdaycommon.userWait(5000);
        try {
            if (helpPopupAbsence.isDisplayed()) {
                closeAbsence.click();
                log.info("Popup Window displayed");
                workdaycommon.userWait(2000);
            }
        } catch (Exception e) {
            log.info("Popup Window not present");
            workdaycommon.userWait(1000);
        }



        typeclickAbsence.click();
        workdaycommon.userWait(2000);
        typeAbsence.sendKeys(LOEType, Keys.ENTER);
        workdaycommon.userWait(2000);
        popupNextAbsence.click();
        workdaycommon.userWait(2000);

        // leaveOfExtensionType.clear();
        //  workdaycommon.userWait(2000);
        //  leaveOfExtensionType.click();
        //  workdaycommon.userWait(2000);
        //  typeAbsence.sendKeys(LOEType, Keys.ENTER);
        //   workdaycommon.userWait(4000);
        submitAbsence.click();
        workdaycommon.userWait(5000);

        // int counter =0;
               /*
            for(int j=0; j<=counter; j++)
            log.info("Counter J--->" +j);
            log.info("Counter--->" +counter);
            {
                ExtLeaveawaiting_action(Employee);
                extensionLeaveProccesstab(Employee);
                if (workdaycommon.labelawaitingaction.isDisplayed())
                {
                    counter++;
                    log.info("Increased Counter--->" + counter);
                    if (counter < 0)
                    {
                        log.info("Increased Counter aaaaaa--->" + counter);
                        ExtLeaveawaiting_action(Employee);
                        extensionLeaveProccesstab(Employee);
                    }
                    log.info("stopped here 1--->" + counter);
                }
                log.info("stopped here 2--->" + counter);
            }
            log.info("stopped here 3--->" + counter);
            */


        extensionLeaveProccesstab(Employee);
        log.info("Searching upto process tab....");
        try {
            int k = 10;
            while (k > 1) {
                log.info("Increased Counter--->" + k);
                extensionLeaveProccesstab(Employee);
                ExtLeaveawaiting_action(Employee);
                ;
                k--;
                log.info("Increased Counter--->" + k);
            }
            log.info("stopped here 3--->" + k);
            extensionValidation(Employee, FromDateRange, ToDateRange, LOEType);
        } catch (Exception e) {
            log.info("Running in Catch Block.........");
            workdaycommon.gotoWorkdayHomepage();
            extensionValidation(Employee, FromDateRange, ToDateRange, LOEType);
        }
    }


    public void extensionLeaveProccesstab(String Employee) throws Exception {
        workdaycommon.userWait(5000);
        log.info("Checking in extensionLeaveProccesstab tab...RL.");
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(3000);
        WebActionsUtil.explicitWait(driver, allOfWorkdayabscenceRWFA, "click");
        workdaycommon.scrolltoElement(allOfWorkdayabscenceRWFA);
        allOfWorkdayabscenceRWFA.click();
        workdaycommon.userWait(3000);
        workdaycommon.userWait(3000);
        WebElement EmployeenamerEL = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Absence Request: " + Employee + "')]"));
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(EmployeenamerEL);
        workdaycommon.userWait(1000);
        EmployeenamerEL.click();
        workdaycommon.userWait(3000);
        processabscenceRWFA.click();
        workdaycommon.userWait(5000);
        workdaycommon.scroll();
        log.info("Clicked on extensionLeaveProccesstab..RL..");
    }

    public void ExtLeaveawaiting_action(String Employee) throws Exception {
        if (workdaycommon.labelawaitingaction.isDisplayed()) {
            log.info("Awaiting Action Counting Started......EXT.");
            List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
            int count = labelAwaitingaction.size();
            log.info("Count----->" + count);
            for (int i = 1; i <= count; i++) {
                log.info("Awaiting Action____1.......EXt" + i);

//            ---Added New line of code to click on the three dots---
                WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
                Threedots.click();
                workdaycommon.scrolltoElement(securityProfile);
                workdaycommon.mousemove(securityProfile,startProxyFromAssociateName);
                workdaycommon.userWait(1000);
                startProxyFromAssociateName.click();
                okAbsence.click();
                workdaycommon.userWait(3000);
                log.info(".......Proxy successful.......");


//                String Approver_name = workdaycommon.awaitingAction(i);
//                StringBuilder proxyperson = new StringBuilder(Approver_name);
//                proxyperson.delete(Approver_name.length() - 1, Approver_name.length());
//                workdaycommon.userWait(3000);
//                workdaycommon.startProxy(proxyperson.toString());

//                workdaycommon.userWait(5000);



                workdaycommon.gotoWorkdayHomepage();
                workdaycommon.userWait(3000);
                workdaycommon.inboxWD.click();
                workdaycommon.userWait(2000);
                log.info("Clicked on Inbox.....");
                WebElement inboxTextTerminate1 = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Absence Request: " + Employee + "')]"));
                workdaycommon.scrolltoElement(inboxTextTerminate1);
                inboxTextTerminate1.click();
                workdaycommon.userWait(2000);
                try {
                    if (workdaycommon.inboxbuttonApprove.isDisplayed()) {
                        workdaycommon.inboxbuttonApprove.click();
                        workdaycommon.userWait(2000);
                        //   workdaycommon.inboxbuttonSubmit.click();
                        //    workdaycommon.userWait(2000);
                        doneabscenceRWFA.click();
                        workdaycommon.userWait(2000);
                        log.info("Approve button available....");
                    }
                } catch (Exception e) {
                    workdaycommon.inboxbuttonSubmit.click();
                    workdaycommon.userWait(2000);
                    doneabscenceRWFA.click();
                    workdaycommon.userWait(2000);
                    log.info("Only Submit button available....");
                }
                log.info("Approval done Successfully.......");
            }
            log.info(".......Process Completed with Approval.........");
            workdaycommon.gotoWorkdayHomepage();
        }
    }

    public void extensionValidation(String Employee, String FromDateRange, String ToDateRange, String Type) throws Exception {

        workdaycommon.Perfrom_employeeActions(Employee, TimeandLeave_optionActions, leaveResults_optionActions);
        workdaycommon.userWait(1000);
        asOfDateAbsence.sendKeys(ToDateRange);
        workdaycommon.userWait(3000);
        leaveTypeAbsence.click();
        workdaycommon.userWait(2000);
        typeAbsence.sendKeys(Type, Keys.ENTER);
        workdaycommon.userWait(3000);
        okAbsence.click();
        workdaycommon.userWait(1000);

        workdaycommon.scrolltoElement(statusAbsence);
        String status = statusAbsence.getText();
        log.info("Status--->" + status);
        workdaycommon.userWait(1000);
        if (status.equals("Successfully Completed")) {
            workdaycommon.scrolltoElement(firstDayAbsence);
            String FirstDay = firstDayAbsence.getText();
            log.info("FirstDay--->" + FirstDay);
            log.info("Given FirstDay--->" + FromDateRange);
            workdaycommon.scrolltoElement(estimatedLastDayAbsence);
            String EstimatedLastDay = estimatedLastDayAbsence.getText();
            log.info("EstimatedLastDay--->" + EstimatedLastDay);
            log.info("Given EstimatedLastDay--->" + ToDateRange);
            workdaycommon.scrolltoElement(leaveTypeStatusAbsence);
            String LeaveType = leaveTypeStatusAbsence.getText();
            log.info("LeaveType--->" + LeaveType);
            log.info("Given LeaveType--->" + Type);
            if (FirstDay.equals(FromDateRange) && EstimatedLastDay.equals(ToDateRange) && LeaveType.equals(Type)) {
                test.pass("Leave Extension Request completed Successfully");
                log.info("Employee Name    --->" + Employee);
                log.info("FirstDay         --->" + FirstDay);
                log.info("EstimatedLastDay --->" + EstimatedLastDay);
                log.info("LeaveType        --->" + LeaveType);
                test.info("Employee Name--->" + Employee + "  ***  " + "FirstDay--->" + FirstDay + "  ***  " + "EstimatedLastDay--->" + EstimatedLastDay + "  ***  " + "LeaveType--->" + LeaveType);

            } else {
                test.fail("Leave Request not completed Successfully");
                log.info("Leave Request not completed Successfully");
            }
        } else {
            test.fail("Status Not completed Successfully..");
            log.info("Status Not completed Successfully..");
        }

    }

    public void returnfromLeave(String Employee, String returndate, String LastDayOfAbsence) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.Perfrom_employeeActions(Employee, TimeandLeave_optionActions, Returnworkerfromleave_optionActions);
        workdaycommon.userWait(3000);
        okRWFA.click();
        if (driverWrapper.isElementPresent(firstdaybackRWFA)) {
            for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                log.info("First Day back at work" + returndate);
                elem.sendKeys(returndate);
                elem.sendKeys(Keys.TAB);
            }
        }
        checkboxRWFA.click();
        workdaycommon.userWait(3000);
        checkboxRWFA.click();
        try {
            if (driverWrapper.isElementPresent(lastdayabscenceRWFA)) {
                workdaycommon.scrolltoElement(lastdayabscenceRWFA);
                workdaycommon.userWait(3000);
                //for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetContainer'])[2]")))
                for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[2]"))) {
                    log.info("Last Day of Abscence" + returndate);
                    //    jse.executeScript("arguments[0].value='admin';", elem);
                    log.info("Last Day of Abscence................");
                    elem.sendKeys(LastDayOfAbsence);
                    elem.sendKeys(Keys.TAB);
                }
            }
        } catch (IllegalArgumentException e) {
            log.info(" Issue Abscence" + e.getMessage());
        }
        submitabscenceRWFA.click();
        workdaycommon.userWait(5000);
        RWFL(Employee);
        log.info("Searching upto process tab....");
        try {
            int k = 10;
            while (k > 1) {
                log.info("Increased Counter--->" + k);
                RWFLawaiting_action(Employee);
                RWFL(Employee);
                k--;

            }
            log.info("stopped here 3--->" + k);
            AwaitingActionCheck(Employee);
        } catch (Exception e) {
            log.info("Running in Catch Block.........");
            workdaycommon.gotoWorkdayHomepage();
            AwaitingActionCheck(Employee);
        }
    }

    public void RWFL(String Employee) throws Exception {
        workdaycommon.userWait(5000);
        log.info("Checking in Process tab...RL.");
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        WebActionsUtil.explicitWait(driver, allOfWorkdayabscenceRWFA, "click");
        workdaycommon.scrolltoElement(allOfWorkdayabscenceRWFA);
        allOfWorkdayabscenceRWFA.click();
        workdaycommon.userWait(9000);
        workdaycommon.userWait(9000);
        WebElement EmployeenamerRL = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Absence Return for " + Employee + "')]"));
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(EmployeenamerRL);
        workdaycommon.userWait(1000);
        EmployeenamerRL.click();
        workdaycommon.userWait(3000);
        processabscenceRWFA.click();
        workdaycommon.userWait(5000);
        workdaycommon.scroll();
        log.info("Clicked on Employee..RL..");
    }

    public void RWFLawaiting_action(String Employee) throws Exception {
        if (workdaycommon.labelawaitingaction.isDisplayed()) {
            log.info("Awaiting Action Counting Started.......");
            List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
            int count = labelAwaitingaction.size();
            log.info("Count----->" + count);
            for (int i = 1; i <= count; i++) {
                log.info("Awaiting Action____1......." + i);

//            ---Added New line of code to click on the three dots---
                WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
                Threedots.click();
                workdaycommon.scrolltoElement(securityProfile);
                workdaycommon.mousemove(securityProfile,startProxyFromAssociateName);
                workdaycommon.userWait(1000);
                startProxyFromAssociateName.click();
                okAbsence.click();
                workdaycommon.userWait(3000);
                log.info(".......Proxy successful.......");
//            -------------------End of code to add click on three dots---

//                String Approver_name = workdaycommon.awaitingAction(i);
//                StringBuilder proxyperson = new StringBuilder(Approver_name);
//                proxyperson.delete(Approver_name.length() - 1, Approver_name.length());
//                workdaycommon.userWait(3000);
//                workdaycommon.startProxy(proxyperson.toString());
//                workdaycommon.userWait(4000);


                workdaycommon.gotoWorkdayHomepage();
                workdaycommon.userWait(3000);
                workdaycommon.inboxWD.click();
                workdaycommon.userWait(2000);
                WebElement inboxTextRWFA = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Absence Return for " + Employee + "')]"));
                workdaycommon.scrolltoElement(inboxTextRWFA);
                inboxTextRWFA.click();
                workdaycommon.userWait(2000);
                try {
                    if (workdaycommon.inboxbuttonApprove.isDisplayed()) {
                        workdaycommon.inboxbuttonApprove.click();
                        workdaycommon.userWait(2000);
                        workdaycommon.inboxbuttonSubmit.click();
                        workdaycommon.userWait(2000);
                        doneabscenceRWFA.click();
                        workdaycommon.userWait(2000);
                        log.info("Approve button available....");
                    }
                } catch (Exception e) {
                    workdaycommon.inboxbuttonSubmit.click();
                    workdaycommon.userWait(2000);
                    doneabscenceRWFA.click();
                    workdaycommon.userWait(2000);
                    log.info("Only Submit button available....");
                }
                log.info("Approval done Successfully.......");
            }
            log.info(".......Process Completed with Approval.........");
            workdaycommon.gotoWorkdayHomepage();
        }
    }

    public void AwaitingActionCheck(String Employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        WebActionsUtil.explicitWait(driver, allOfWorkdayabscenceRWFA, "click");
        allOfWorkdayabscenceRWFA.click();
        workdaycommon.userWait(1000);
        WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Absence Return for " + Employee + "')]"));
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(Employeename);
        workdaycommon.userWait(1000);
        Employeename.click();
        workdaycommon.userWait(1000);
        processabscenceRWFA.click();
        workdaycommon.userWait(2000);
        String overallStatus = overallStatusabscenceRWFA.getText();
        log.info("---------overallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);

        workdaycommon.scroll();
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (statusabscenceRWFA.isDisplayed()) {
                    log.info("Return Worker from leave not Completed Successfully........");
                    test.fail("Return Worker from leave not Completed Successfully........");
                }
            } catch (Exception e) {
                test.pass("Return Worker from leave Completed Successfully for Employee name :" + Employee);
                log.info("Return Worker from leave Completed Successfully........");
            }
        } else {
            log.info("Return worker From Leave not Completed Successfully........Current Status: " + overallStatus);
            test.fail("Return worker From Leave not Completed Successfully.......Current Status: " + overallStatus);

        }
    }


    public void ViewLeaveOfAbsence(String Employee, String AsOfDate, String Type) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.info("View Leave: From PO:" + Employee);
        workdaycommon.userWait(1000);
        workdaycommon.Perfrom_employeeActions(Employee, TimeandLeave_optionActions, leaveResults_optionActions);
        workdaycommon.userWait(1000);
        asOfDateAbsence.sendKeys(AsOfDate);
        workdaycommon.userWait(3000);
        leaveTypeAbsence.click();
        workdaycommon.userWait(2000);
        typeAbsence.sendKeys(Type, Keys.ENTER);
        workdaycommon.userWait(3000);
        okAbsence.click();
        workdaycommon.userWait(1000);
        workdaycommon.scrollright();
        workdaycommon.scrolltoElement(statusAbsence);

        String status = statusAbsence.getText();
        log.info("Status--->" + status);
        workdaycommon.userWait(1000);
        if (status.equals("Successfully Completed")) {
            workdaycommon.scrolltoElement(firstDayAbsence);
            String FirstDay = firstDayAbsence.getText();
            log.info("FirstDay--->" + FirstDay);
            log.info("Given FirstDay--->" + FirstDay);
            workdaycommon.scrolltoElement(estimatedLastDayAbsence);
            String EstimatedLastDay = estimatedLastDayAbsence.getText();
            log.info("EstimatedLastDay--->" + EstimatedLastDay);
            log.info("Given EstimatedLastDay--->" + AsOfDate);
            workdaycommon.scrolltoElement(leaveTypeStatusAbsence);
            String LeaveType = leaveTypeStatusAbsence.getText();
            log.info("LeaveType--->" + LeaveType);
            log.info("Given LeaveType--->" + Type);
//            if (EstimatedLastDay.equals(AsOfDate) && LeaveType.equals(Type)) {
//                test.pass("View Leave Of Absence completed Successfully");
//                log.info("Employee Name    --->" + Employee);
//                log.info("FirstDay         --->" + FirstDay);
//                log.info("EstimatedLastDay --->" + EstimatedLastDay);
//                log.info("LeaveType        --->" + LeaveType);
//                test.info("Employee Name--->" + Employee + "  ***  " + "FirstDay--->" + FirstDay + "  ***  " + "EstimatedLastDay--->" + EstimatedLastDay + "  ***  " + "LeaveType--->" + LeaveType);
//
//            } else {
//                test.fail("Leave Request not completed Successfully");
//                log.info("Leave Request not completed Successfully");
//            }
        } else {
            test.fail("Status Not completed Successfully..");
            log.info("Status Not completed Successfully..");

        }
        test.pass("View Leave of Absence completed successfully");
        log.info("View Leave of Absence completed successfully");
    }


    public void CorrectTimeOff(String Employee, String EstimatedLastDayOfAbsence, String Type) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        employeeSearch.click();
        workdaycommon.userWait(2000);
//        workdaycommon.Perfrom_employeeActions(Employee, TimeandLeave_optionActions, EnterAbsence_optionActions);
//        selectdaterangeRequestAbsence.click();
//        workdaycommon.userWait(1000);
//        if (driverWrapper.isElementPresent(todaterangeRequestAbsence)) {
//            for (WebElement elem : driver.findElements(By.xpath("//label[text()='To']//following::input[@data-automation-id='dateWidgetInputBox']"))) {
//                log.info("Date selecting for To Region....." + ToDateRange);
//                elem.sendKeys(ToDateRange);
//
//            }
//        }
//        workdaycommon.userWait(3000);
//        workdaycommon.scrolltoElement(fromdaterangeRequestAbsence);
//        if (driverWrapper.isElementPresent(fromdaterangeRequestAbsence)) {
//            log.info("Date not selected.......11111...");
//            for (WebElement elem : driver.findElements(By.xpath("//label[text()='From']//following::input[@data-automation-id='dateWidgetInputBox'][1]"))) {
//                log.info("Date not selected.....222....." + FromDateRange);
//                elem.sendKeys(FromDateRange);
//                elem.sendKeys(Keys.TAB);
//
//            }
//        }
//        workdaycommon.userWait(5000);
//        typeclickAbsence.click();
//        workdaycommon.userWait(1000);
//        typeAbsence.sendKeys(Type, Keys.ENTER);
//        workdaycommon.userWait(1000);
//        popupNextAbsence.click();
//        workdaycommon.userWait(1000);
//        leaveOfExtensionType.click();
//        workdaycommon.userWait(1000);
//        typeAbsence.sendKeys(LOEType, Keys.ENTER);
//        workdaycommon.userWait(1000);
//        submitAbsence.click();
//        workdaycommon.userWait(1000);
//          workdaycommon.searchbySearchBox(Employee);
//        workdaycommon.userWait(2000);
//        workdaycommon.inboxWD.click();
//        workdaycommon.userWait(2000);
//        workdaycommon.inboxbuttonApprove.click();
//        workdaycommon.userWait(2000);
//        workdaycommon.inboxbuttonDone.click();
//        workdaycommon.userWait(1000);
//        workdaycommon.Perfrom_employeeActions(Employee, TimeandLeave_optionActions, leaveResults_optionActions);
        workdaycommon.scroll();
        workdaycommon.userWait(2000);
        workdaycommon.scrollDOWN_height();
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(menuTimeOff);
        menuTimeOff.click();
        workdaycommon.userWait(3000);
        action.click();
        workdaycommon.userWait(3000);

        workdaycommon.mousemove(businessProcess,correct);

//        businessProcess.click();
//        workdaycommon.userWait(5000);
        estimatedLastDayOfLeaveDate.sendKeys(EstimatedLastDayOfAbsence);
        workdaycommon.userWait(5000);
        workdaycommon.scrolltoElement(supportingDocuments);
        workdaycommon.userWait(5000);
        commentsTextBox.sendKeys("test");
        workdaycommon.userWait(2000);
        workdaycommon.inboxbuttonSubmit.click();
        workdaycommon.userWait(1000);
        workdaycommon.inboxbuttonDone.click();
//        leaveTypeAbsence.click();
//        workdaycommon.userWait(2000);
//        typeAbsence.sendKeys(Type, Keys.ENTER);
//        workdaycommon.userWait(3000);
//        okAbsence.click();
//        workdaycommon.userWait(1000);
//        workdaycommon.scrolltoElement(statusAbsence);
//        String status = statusAbsence.getText();
//        log.info("Status--->" + status);
        workdaycommon.userWait(5000);
//        if (status.equals("Successfully Completed")) {
//            workdaycommon.scrolltoElement(firstDayAbsence);
//            String FirstDay = firstDayAbsence.getText();
//            log.info("FirstDay--->" + FirstDay);
//            log.info("Given FirstDay--->" + FirstDay);
//            workdaycommon.scrolltoElement(estimatedLastDayAbsence);
//            String EstimatedLastDay = estimatedLastDayAbsence.getText();
//            log.info("EstimatedLastDay--->" + EstimatedLastDay);
//            log.info("Given EstimatedLastDay--->" + AsOfDate);
//            workdaycommon.scrolltoElement(leaveTypeStatusAbsence);
//            String LeaveType = leaveTypeStatusAbsence.getText();
//            log.info("LeaveType--->" + LeaveType);
//            log.info("Given LeaveType--->" + Type);
        if (estimatedLastDayOfLeave.equals(estimatedLastDayOfLeave)) {
            test.pass("Absence Correction completed Successfully");
            log.info("Employee Name    --->" + Employee);
            log.info("EstimatedLastDayOfLeave --->" + EstimatedLastDayOfAbsence);
            // the below line is commented since leave type is not corrected in the code
            log.info("LeaveType        --->" + Type);
            test.info("Employee Name--->" + Employee + "  ***  " + "CorrectedLastDayOfLeave--->" + EstimatedLastDayOfAbsence + "  ***  " + "LeaveType--->" + Type);

        } else {
            test.fail("Absence Correction not completed Successfully");
            log.info("Absence Correction not completed Successfully");
        }
    }


    public void InitiateTimeOff(String Employee, String FromDateRange, String ToDateRange, String Type) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);

        employeeSearch.click();
        workdaycommon.userWait(3000);
        workdaycommon.Perfrom_employeeActions(Employee, TimeandLeave_optionActions, EnterAbsence_optionActions);
        workdaycommon.userWait(1000);
        selectdaterangeRequestAbsence.click();
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(fromdaterangeRequestAbsence);

        if (driverWrapper.isElementPresent(fromdaterangeRequestAbsence)) {
            log.info("Date not selected.......11111...");
            for (WebElement elem : driver.findElements(By.xpath("//label[text()='From']//following::input[@data-automation-id='dateWidgetInputBox'][1]"))) {
                log.info("Date not selected.....222....." + FromDateRange);
                elem.sendKeys(FromDateRange);
                elem.sendKeys(Keys.TAB);

            }
        }
        workdaycommon.userWait(3000);
        if (driverWrapper.isElementPresent(todaterangeRequestAbsence)) {
            for (WebElement elem : driver.findElements(By.xpath("//label[text()='To']//following::input[@data-automation-id='dateWidgetInputBox']"))) {
                log.info("Date selecting for To Region....." + ToDateRange);
                elem.sendKeys(ToDateRange);
            }
        }
        workdaycommon.userWait(2000);
        typeclickAbsence.click();
        workdaycommon.userWait(3000);
        intermittentFMLAHours.click();
        workdaycommon.userWait(3000);
        intermittentFMLA.click();
        workdaycommon.userWait(2000);
        popupNextAbsence.click();
        workdaycommon.scrolltoElement(quantityintermittentFMLA);
        workdaycommon.userWait(2000);
        quantityintermittentFMLA.click();
        workdaycommon.userWait(2000);
        quantityValueintermittentFMLA.click();
        workdaycommon.userWait(2000);
        quantityValueintermittentFMLA.sendKeys(Keys.BACK_SPACE);
//        quantityValueintermittentFMLA.clear();
        workdaycommon.userWait(2000);
        quantityValueintermittentFMLA.sendKeys("8",Keys.ENTER);
        doneintermittentFMLA.click();
        workdaycommon.scrolltoElement(detailsforintermittentFMLA);
        workdaycommon.userWait(2000);
        detailsforintermittentFMLA.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys("Self (iFMLA)",Keys.ENTER);
        workdaycommon.userWait(2000);
        workdaycommon.inboxbuttonSubmit.click();
        workdaycommon.userWait(2000);
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(2000);
        employeeSearch.click();
        workdaycommon.userWait(2000);
        menuTimeOff.click();
        workdaycommon.userWait(2000);
        try {

            WebElement checkType = driver.findElement(By.xpath("//span[text()='Type']//following::div[@data-automation-id='promptOption' and @title='" + Type + "'][1]"));
            if (Type.equals(checkType.getText())) {
                test.pass("Initiate Time Off completed Successfully");
                log.info("Initiate Time Off completed Successfully");
                log.info("Employee Name    --->" + Employee);
                log.info("Date --->" + FromDateRange);
                log.info("LeaveType        --->" + Type);
                test.info("Employee Name--->" + Employee + "  ***  " + "Date--->" + FromDateRange + "  ***  " + "LeaveType--->" + Type);

            } else {
                test.fail("Initiate Time Off not completed Successfully");
                log.info("Initiate Time Off not completed Successfully");
            }
        } catch (Exception e) {
            test.fail("Error Occurred in: " + e.getMessage());

        }
    }

    public void sample(String Sam) throws Exception {
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date1 = simpleDateFormat.parse(Sam);

        Calendar yesterday = Calendar.getInstance();
        //yesterday.add( -1);
        Date yestdate = yesterday.getTime();
        String yesterdaydate = simpleDateFormat.format(yestdate);
        log.info("The given date is :" + Sam);
        log.info("The New date is :" + yesterdaydate);
    }

}



