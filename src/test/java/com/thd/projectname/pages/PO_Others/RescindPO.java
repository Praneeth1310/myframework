package com.thd.projectname.pages.PO_Others;

import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
//import java.util.concurrent.TimeUnit;

import com.thd.projectname.pages.PO_HCM.Hire_withRequisition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;

import com.thd.base.BasePage;
import com.thd.base.Constants.Constants;
import com.thd.common.utils.WebActionsUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RescindPO extends BasePage {
    private static final Logger log = LogManager.getLogger(RescindPO.class);
    WorkdayCommon workdaycommon = new WorkdayCommon();
    String LNAMECREATEPREHIRE1;
    String FNAMECREATEPREHIRE1;

    //    --------------Web Elements-----------

    @FindBy(xpath = "//*[text()='Business Process' and @data-automation-id = 'relatedActionsItemLabel' ]")
    public WebElement businessProcess;

    @FindBy(xpath = "//*[text() = 'Rescind']")
    public WebElement RescindOption;

    @FindBy(xpath = "//*[@data-automation-id = 'textAreaField']")
    public WebElement commentArea;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement SubmitRescind;

    @FindBy(xpath = "//*[text()='Process Rescinded']")
    public WebElement rescindConfirmation;

    @FindBy(xpath = "//*[@data-automation-id= 'promptOption']")
    public WebElement EmpNameLink;

    //Hire rescind------------------------

    @FindBy(xpath = "//label[text()='Associate ID']//following::div[@data-automation-id='textView'][1]")
    private WebElement associateID;

    @FindBy(xpath = "//div[@data-automation-id='promptOption']")
    private WebElement chkAssociaet;

    @FindBy(xpath = "(//label[text()='Reason'])[1]//following::div[contains(text(),'Either cancel the payroll results or terminate the associate')]")
    private WebElement reasonRescind;

    @FindBy(xpath = "//*[text()='Submit']")
    private WebElement submitRescind;

    @FindBy(xpath = "//*[text()='Cancel']")
    private WebElement cancelRescind;

    @FindBy(xpath = "//span[@title='Done']")
    private WebElement btnDone;

    @FindBy(xpath = "//button[@title='Submit']")
    private WebElement btnSubmit;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_uic_okButton' and @title='OK']")
    private WebElement btnCancel;

    @FindBy(xpath = "//label[text()='Rescindable']//following::div[text()='No']")
    private WebElement checkRescind;
    //label[text()='Rescindable']//following::div[text()='No']

    @FindBy(xpath = "//label[text()='Because Of']")
    private WebElement becauseOf;
    //label[text()='Because Of']

    @FindBy(xpath = "//label[text()='Because Of']//following::span[contains(text(),'More')]")
    private WebElement checkMoreOption;

    @FindBy(xpath = "//span[@data-automation-id='workerProfileMenuItemLabel' and text()='Pay']")
    private WebElement payTab;

    @FindBy(xpath = "//span[text()='Payroll Result']//following::img[@data-automation-id='RELATED_TASK_charm'][1]")
    private WebElement currentPayrollResult;

    @FindBy(xpath = "//h2[text()='Actions']//following::div[text()='Pay Calculation']")
    private WebElement optionPayCalculation;

    @FindBy(xpath = "//h2[text()='Actions']//following::div[text()='Pay Calculation']//following::div[text()='Cancel']")
    private WebElement cancelPayCalculation;


    /*@FindBy(xpath = "//label[text()='Because Of']//following::img[@data-automation-id='RELATED_TASK_charm'][1]")
    private WebElement pendingTaskRescind;*/

    //label[text()='Because Of']//following::img[@data-automation-id='RELATED_TASK_charm'][1]


    //Absence rescind----------------------

    @FindBy(xpath = "//div[text()='Rescind']")
    public WebElement rescindButton;

    @FindBy(xpath = "//textarea[@data-automation-id='textAreaField' and @role='textbox']")
    public WebElement enterComment;

    @FindBy(xpath = "//div[@data-automation-id='textView' and text()='No']")
    public WebElement notRescindable;

    @FindBy(xpath = "//span[text()='View Associate History']//following::div[@data-automation-id='tabLabel' and text()='Time Off and Leave'][1]")
    public WebElement TimeOffandLeave;

    //Terminate rescind------------------

    @FindBy(xpath = "//label[text()='All of Workday']")
    private WebElement allOfWorkday;

    //Rescind Move Associates---------------------------------------------------------------------------------------------------


    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Because Of']")
    private WebElement becauseOfRescind;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Because Of']//following::img[1]")
    private WebElement becauseOfRescindImgTab;


    @FindBy(xpath = "//div[text()='Associate History']")
    private WebElement actionAssociateHistory;

    @FindBy(xpath = "//div[text()='Associate History']//following::div[text()='View Associate History']")
    private WebElement viewAssociateHistoryActions;

//    @FindBy(xpath = "//div[text()='Associate History']")
//    private WebElement actionAssociateHistory;

    @FindBy(xpath = "//span[text()='Associate History' and @data-automation-id='gridTitleLabel']//following::span[text()='Effective Date'][1]")
    private WebElement filterEffectiveDate;

    @FindBy(xpath = "//button[@title='Filter']")
    //@FindBy(xpath = "//span[text()='Associate']//following::button[@data-automation-id='wd-CommandButton_uic_filterButton' and @title='Filter']")
    private WebElement btnFilter;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Value']//following::input[@data-automation-id='dateWidgetInputBox']")
    private WebElement enterFilterEffectiveDate;

    @FindBy(xpath = "//div[text()='View Associate History by Category']")
    public WebElement viewAssocHisbyCat;

    @FindBy(xpath = "//div[text()='Associate History']")
    public WebElement associateHistoryLink;

    public void RescindNewHire(String empname) throws Exception {

        workdaycommon.setDriver(driverWrapper);//to Access workday common class file
        workdaycommon.setExtentTest(test);//to Access workday common class file

//        empname = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;

        // String empname = "TestTrenton TestTaue";
        workdaycommon.setEmployeename(empname);
        workdaycommon.searchbySearchBox(empname);
        workdaycommon.userWait(1000);
        allOfWorkday.click();
        workdaycommon.userWait(2000);
        WebElement associate_name = driver.findElement(By.xpath("(//*[text()='" + empname + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + empname + "')][1]"));
        // workdaycommon.scrolltoElement(associate_name);
        associate_name.click();
        String emp_ID = associateID.getText();
        log.info(emp_ID);
        workdaycommon.userWait(3000);
        workdaycommon.clickAction.click();
        log.info("clicked on Actions");
        workdaycommon.mousemove(workdaycommon.associateHistoryLink, workdaycommon.viewAssociateHistoryLink);
        log.info("view associate history");

        WebElement TransferDots = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and text()='Hire: " + empname + "']//following::img[1]"));
        workdaycommon.scrolltoElement(TransferDots);
        TransferDots.click();
        log.info("clicked on the three dots");
        rescindProcess(empname, emp_ID);
        workdaycommon.userWait(2000);

    }

    public void rescindProcess(String empname, String emp_ID) throws Exception {
        workdaycommon.userWait(2000);
        workdaycommon.mousemove(businessProcess, RescindOption);
        workdaycommon.userWait(2000);
        try {
            log.info("Checking for any pending tasks to be rescinded before Hire");
            if (checkRescind.isDisplayed()) {
                log.info("Entered into loop because status of rescindable is No");
                try {

                    while (becauseOf.isDisplayed()) {
                        try {
                            log.info("Checking for more option in Because Of ... ");
                            if (checkMoreOption.isDisplayed()) {
                                checkMoreOption.click();
                            }
                        } catch (NoSuchElementException e) {
                            log.info("More option is not present... ");
                        }
                        log.info("Counting the no of pending tasks to be done.......");
                        List<WebElement> labelPendingTasksRescindAction = driver.findElements(By.xpath("//label[text()='Because Of']//following::div[@data-automation-id='promptOption' and contains(@title,': " + empname + "')]"));
                        int count = labelPendingTasksRescindAction.size();
                        log.info("Count----->" + count);
                        WebElement pendingTaskRescind = driver.findElement(By.xpath("//label[text()='Because Of']//following::img[@data-automation-id='RELATED_TASK_charm'][" + count + "]"));
                        pendingTaskRescind.click();
                        workdaycommon.userWait(2000);
                        workdaycommon.mousemove(businessProcess, RescindOption);
                        workdaycommon.userWait(2000);
                        workdaycommon.scrolltoElement(commentArea);
                        commentArea.sendKeys("Testing ");
                        submitRescind.click();
                        workdaycommon.userWait(2000);
                        btnDone.click();
                        try {
                            if (btnSubmit.isDisplayed()) {
                                workdaycommon.userWait(2000);
                                btnSubmit.click();
                            }
                        } catch (NoSuchElementException e) {
                            log.info("Submit button is not present");
                        }
                    }
                } catch (NoSuchElementException e) {
                    log.info("No pending tasks to be rescinded before Hire");
                }
                workdaycommon.userWait(2000);
                try {
                    if (reasonRescind.isDisplayed()) {
                        workdaycommon.userWait(2000);
                        workdaycommon.startProxy(Constants.PayRoll_Admin);
                        workdaycommon.userWait(2000);
                        workdaycommon.searchbySearchBox(empname);
                        workdaycommon.userWait(1000);
                        workdaycommon.allOfWorkday.click();
                        workdaycommon.userWait(1000);
                        WebElement associate_name = driver.findElement(By.xpath("(//*[text()='" + empname + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + empname + "')][1]"));
                        // workdaycommon.scrolltoElement(associate_name);
                        associate_name.click();
                        workdaycommon.userWait(3000);

                        payTab.click();
                        workdaycommon.userWait(2000);
                        log.info("Pay Tab Selected.......");
                        currentPayrollResult.click();
                        workdaycommon.userWait(2000);
                        workdaycommon.mousemove(optionPayCalculation, cancelPayCalculation);
                        workdaycommon.userWait(1000);
                        btnCancel.click();
                        workdaycommon.userWait(1000);
                        btnDone.click();
                        workdaycommon.userWait(2000);


                        workdaycommon.startProxy(Constants.BP_Admin);
                        workdaycommon.userWait(2000);
                        workdaycommon.searchbySearchBox(empname);
                        workdaycommon.userWait(1000);
                        workdaycommon.allOfWorkday.click();
                        workdaycommon.userWait(1000);
                        WebElement associate_Name = driver.findElement(By.xpath("(//*[text()='" + empname + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + empname + "')][1]"));
                        // workdaycommon.scrolltoElement(associate_name);
                        associate_Name.click();
                        workdaycommon.userWait(2000);
                        workdaycommon.clickAction.click();
                        log.info("clicked on Actions");
                        workdaycommon.mousemove(workdaycommon.associateHistoryLink, workdaycommon.viewAssociateHistoryLink);
                        log.info("view associate history");

                        WebElement TransferDots = driver.findElement(By.xpath("(//div[@data-automation-id='promptOption' and text()='Hire: " + empname + "'])[1]//following::img[1]"));
                        TransferDots.click();
                        log.info("clicked on the three dots");
                        workdaycommon.userWait(2000);
                        workdaycommon.mousemove(businessProcess, RescindOption);
                    }
                } catch (NoSuchElementException e) {
                    log.info("Associate does not have payroll results");
                }
            }
        } catch (NoSuchElementException e) {
            log.info("Neither pending with some tasks to be rescinded before Hire nor the associate has payroll results to be cancelled before rescinding hire");
            /*workdaycommon.scrolltoElement(commentArea);
            commentArea.sendKeys("Testing ");
            submitRescind.click();
            workdaycommon.userWait(2000);
            btnDone.click();
            try{
            if(btnSubmit.isDisplayed()){
                workdaycommon.userWait(2000);
                btnSubmit.click();
            }
        }catch(NoSuchElementException e)
        {
            log.info("Submit button is not present");
        }*/
        }
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(commentArea);
        commentArea.sendKeys("Testing ");
        submitRescind.click();
        workdaycommon.userWait(2000);
        btnDone.click();
        try {
            if (btnSubmit.isDisplayed()) {
                workdaycommon.userWait(2000);
                btnSubmit.click();
            }
        } catch (NoSuchElementException e) {
            log.info("Submit button is not present");
        }

        try {
            log.info(" ... Validation ...");
            workdaycommon.userWait(2000);
            workdaycommon.searchbySearchBox(emp_ID);
            workdaycommon.userWait(1000);
            if (chkAssociaet.isDisplayed()) {
                log.error("Associate is not rescinded");
                test.fail("Hire Associate is NOT rescinded successfully");
            }
        } catch (Exception e) {
            log.info("Hire rescinded successfully");
            test.pass("Hire Associate is rescinded successfully");
        }
    }


    public void RescindJob(String employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        test.info("Starting Rescinding the job change");
        log.info("Starting Rescinding the job change");
//        workdaycommon.stopProxy();
//        log.info("Stop proxy");
        workdaycommon.userWait(3000);
        workdaycommon.simplestartProxy(Constants.BP_Admin);
        log.info("proxy to to the desired role is completed");
        workdaycommon.searchbySearchBox(employee);
        log.info("Search for the employee");
        workdaycommon.allOfWorkday.click();
        workdaycommon.userWait(3000);
//        WebActionsUtil.explicitWait(driver, EmpNameLink, "click");
        WebElement EmpNameLink = driver.findElement(By.xpath("(//*[contains(text(),'" + employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + employee + "')][1]"));
        EmpNameLink.click();
        WebActionsUtil.explicitWait(driver, workdaycommon.clickAction, "click");
        workdaycommon.clickAction.click();
        log.info("clicked on Actions");
        workdaycommon.mousemove(associateHistoryLink, viewAssocHisbyCat);
//        log.info("view associate history");
        workdaycommon.userWait(2000);
        workdaycommon.scroll();
//        WebActionsUtil.explicitWait(driver, viewAsstHstrByCatgry, "click");
//        viewAsstHstrByCatgry.click();
//        test.info("Clicked on View Associate History by Category button");
        log.info("Clicked on View Associate History by Category button");
        WebElement TransferDots = driver.findElement(By.xpath("(//*[contains(text(),'Transfer: " + employee + "')])[1]//following::*[1]"));
        workdaycommon.scrolltoElement(TransferDots);
        TransferDots.click();
        log.info("clicked on the three dots");
        workdaycommon.userWait(2000);
        workdaycommon.mousemove(businessProcess, RescindOption);
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(commentArea);
        commentArea.sendKeys("Test");
        test.info("entered Test as comments for rescind");
        log.info("entered Test as comments for rescind");
        WebActionsUtil.explicitWait(driver, SubmitRescind, "click");
        SubmitRescind.click();
        workdaycommon.userWait(2000);
        if (rescindConfirmation.isDisplayed()) {
            test.pass("Rescind  is successful");
        } else
            test.fail("Rescind failed");
    }

    public void RescindAbsence(String Emp) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.searchbySearchBox(Emp);
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(allOfWorkday);
        allOfWorkday.click();
        workdaycommon.userWait(2000);
//        WebElement empName = driver.findElement(By.xpath("(//*[text()='" + Emp + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Emp + "')][1]"));
        // WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='" + Emp + " (On Leave)']"));
        WebElement empName = driver.findElement(By.xpath("(//*[contains(text(),'" + Emp + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Emp + "')][1]"));
//        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(empName);
        empName.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(workdaycommon.associateHistoryLink, workdaycommon.viewAssociateHistorybyCategoryLink);
        log.info("rescind");
        log.info("Absence rescind for the employee " + Emp + " started ");
        test.pass("Absence rescind for the employee " + Emp + " started");
        workdaycommon.userWait(2000);
        TimeOffandLeave.click();
        WebElement Abscence = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Absence Request: " + Emp + " (On Leave)']"));
        workdaycommon.scrolltoElement(Abscence);
        WebElement Threedots = driver.findElement(By.xpath("//div[text()='Absence Request: " + Emp + " (On Leave)'][1]//following::*[1]"));
        Threedots.click();
        workdaycommon.mousemove(businessProcess, rescindButton);
        workdaycommon.userWait(2000);

        log.info("Checking for absence return action for the employee " + Emp);
        test.info("Checking for absence return action for the employee " + Emp);


        try {
            if (notRescindable.isDisplayed()) {
                log.info("Employee " + Emp + " has absence return action");
                test.pass("Employee " + Emp + " has absence return action");
                workdaycommon.becauseOf.click();
                workdaycommon.mousemove(businessProcess, rescindButton);
                commentSection();
                log.info("Absence Return rescinded successfully for the employee " + Emp);
                test.pass("Absence Return rescinded successfully for the employee " + Emp);
            }
        } catch (Exception e) {
            log.info("Employee " + Emp + " doesn't have absence return action");
            test.pass("Employee " + Emp + " doesn't have absence return action");
        }

        commentSection();

        log.info("Absence rescinded successfully for the employee " + Emp);
        test.pass("Absence rescinded successfully for the employee " + Emp);


    }


    public void commentSection() throws Exception {

        workdaycommon.scrolltoElement(enterComment);
        enterComment.click();
        enterComment.sendKeys("Test");
        workdaycommon.userWait(1000);
        workdaycommon.submitButton.click();
        workdaycommon.userWait(3000);
        workdaycommon.btnDone.click();
    }

    public void RescindTermination(String Emp) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.searchbySearchBox(Emp);
        workdaycommon.userWait(1000);
        try {
            // WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='" + Emp + " (On Leave)']"));
            WebElement Employeename = driver.findElement(By.xpath("(//*[contains(text(),'" + Emp + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Emp + "')][1]"));
            workdaycommon.userWait(1000);
            Employeename.click();
        } catch (Exception e) {
            allOfWorkday.click();
            WebElement Employeename = driver.findElement(By.xpath("(//*[contains(text(),'" + Emp + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Emp + "')][1]"));
            workdaycommon.userWait(1000);
            Employeename.click();
        }
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(workdaycommon.associateHistoryLink, workdaycommon.viewAssociateHistorybyCategoryLink);
        log.info("rescind");
        log.info("Termination rescind for the employee " + Emp + " started ");
        test.pass("Termination rescind for the employee " + Emp + " started");
        workdaycommon.userWait(2000);
        WebElement Terminate = driver.findElement(By.xpath("(//*[text()='Terminate: " + Emp + "'])[1]"));


        workdaycommon.scrolltoElement(Terminate);
        WebElement Threedots = driver.findElement(By.xpath("(//*[text()='Terminate: " + Emp + "'])[1]//following::*[contains(text(),'Successfully Completed')]//preceding::*[text()='Terminate: " + Emp + "']//following::img[1]"));
        Threedots.click();
        workdaycommon.mousemove(businessProcess, rescindButton);
        workdaycommon.userWait(2000);
        commentSection();
        log.info("entered comment section");
        log.info("Termination rescinded successfully for the employee " + Emp);
        test.pass("Termination rescinded successfully for the employee " + Emp);
    }


    public void Rescind_MoveWorkers(String EmployeeOne, String EmployeeTwo, String EmployeeThree, String EffectiveDate_MoveWorkers) throws Exception {

        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(2000);
        test.info("Rescind Move Associates Process started...");
        Rescind_Associate(EmployeeOne, EffectiveDate_MoveWorkers);
        workdaycommon.userWait(2000);
        log.info("Rescinded for associate..."+EmployeeOne);

        Rescind_Associate(EmployeeTwo, EffectiveDate_MoveWorkers);
        workdaycommon.userWait(2000);
        log.info("Rescinded for associate..."+EmployeeTwo);

        Rescind_Associate(EmployeeThree, EffectiveDate_MoveWorkers);
        log.info("Rescinded for associate..."+EmployeeThree);
        log.info("Rescinded for all associates...");
        test.info("Rescind Move Associates Process completed for all associates...");

    }

    public void Rescind_Associate(String Employee, String EffectiveDate_MoveWorkers) throws Exception {
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(2000);
        allOfWorkday.click();
        workdaycommon.userWait(5000);
        WebElement EmpName = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        WebActionsUtil.explicitWait(driver,EmpName,"click");
        EmpName.click();
        workdaycommon.userWait(2000);

        workdaycommon.clickAction.click();
        workdaycommon.userWait(1000);
        workdaycommon.mousemove(actionAssociateHistory, viewAssociateHistoryActions);
        workdaycommon.userWait(2000);
        filterEffectiveDate.click();
        workdaycommon.userWait(2000);
        //enterFilterEffectiveDate.click();
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date1 = simpleDateFormat.format(new Date());
        if (driverWrapper.isElementPresent(enterFilterEffectiveDate)) {
            //for (WebElement elem : driver.findElements(By.xpath("(//input[@data-automation-id='dateWidgetInputBox'])[2]"))) {
            for (WebElement elem : driver.findElements(By.xpath("//label[@data-automation-id='formLabel' and text()='Value']//following::input[@data-automation-id='dateWidgetInputBox']"))) {
                log.info("....entered into For loop...");
                elem.sendKeys(EffectiveDate_MoveWorkers);
            }
        }
        workdaycommon.userWait(2000);
        btnFilter.click();
        workdaycommon.userWait(3000);

        //WebElement moveAssociateRescind = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and text()='Move Associate (Supervisory): "+EmployeeOne+"']//following::img[1]"));
        WebElement moveAssociateRescind = driver.findElement(By.xpath("//span[text()='Business Process']//following::div[contains(text(),'Move Associate (Supervisory): " + Employee + "')][1]//following::img[1]"));
        moveAssociateRescind.click();
        rescindProcess_MoveAssociates();
        workdaycommon.userWait(2000);
        workdaycommon.gotoWorkdayHomepage();
        log.info("HomePage is clicked");
    }

    public void rescindProcess_MoveAssociates() throws Exception {
        log.info("Rescind Process started...");

        workdaycommon.userWait(2000);
        workdaycommon.mousemove(businessProcess, RescindOption);
        //RescindOption.click();
        log.info("rescind is clicked...");
        workdaycommon.userWait(2000);
        try {
            if (becauseOfRescind.isDisplayed()) {
                workdaycommon.userWait(1000);
                log.info("because of is present...");
                becauseOfRescindImgTab.click();
                log.info("three dots is clicked.......");
                workdaycommon.userWait(2000);
                workdaycommon.mousemove(businessProcess, RescindOption);
                //RescindOption.click();
                log.info("rescind is clicked...");
                workdaycommon.userWait(2000);
            }
        } catch (Exception e) {
            log.info("Not having any pending process to be rescinded");

        }
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(commentArea);
        commentArea.sendKeys("Testing ");
        submitRescind.click();
        workdaycommon.userWait(2000);
        btnDone.click();
        log.info("Done button is clicked");

        try{
            //this will work only when there is any pending process to be rescinded before rescinding MoveWorkers
            if(commentArea.isDisplayed())
            {
                workdaycommon.userWait(1000);
                workdaycommon.scrolltoElement(commentArea);
                commentArea.sendKeys("Testing ");
                submitRescind.click();
                workdaycommon.userWait(2000);
                log.info("Rescind Process is successful...");
                test.info("Rescind Process is successful...");
                btnDone.click();
                log.info("Done button is clicked");
            }
        }catch (Exception e)
        {
            log.info("....No process is  pending... ");
        }

    }
}





