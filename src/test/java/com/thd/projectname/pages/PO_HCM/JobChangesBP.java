package com.thd.projectname.pages.PO_HCM;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeUnit;

import com.thd.common.utils.WebActionsUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import com.thd.base.BasePage;
import com.thd.base.Constants.Constants;

import com.thd.projectname.pages.PO_Others.WorkdayCommon;


public class JobChangesBP extends BasePage {
    private static final Logger log = LogManager.getLogger(JobChangesBP.class);
    WorkdayCommon workdaycommon = new WorkdayCommon();


    String reqName = null;

    //   *****************************WebElements*******************************************

    //change job -------------------------------------------------------------------------

    //    xpaths for the three dots selection
    @FindBy(xpath = "(//div[@data-automation-id='relatedActionsItemLabel' and text()='Security Profile'])")
    public WebElement securityProfile;

    @FindBy(xpath = "//*[text()='Start Proxy']")
    public WebElement startProxyFromAssociateName;



//end of xpaths for three dots


    @FindBy(xpath = "//*[@data-automation-id='promptOption' and text()='Change Job']")
    public WebElement linkchangeJob;

    @FindBy(xpath = "//*[@data-automation-id='promptIcon']")
    public WebElement workernameChangeJob;

    @FindBy(xpath = "//*[@data-automation-id='promptOption']")
    public WebElement selectoptionChangeJob;

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_okButton']")
    public WebElement btnOKChangeJob;

    @FindBy(xpath = "//*[@aria-label='Edit Start Details']")
    public WebElement editStartDetailsChangeJob;

    @FindBy(xpath = "(//*[@class='wd-icon-calendar wd-icon'])[2]")
    public WebElement dateToChangeEffect;

    @FindBy(xpath = "(//*[@data-automation-id='promptIcon'])[1]")
    public WebElement makechangeChangeJob;

    @FindBy(xpath = "(//*[@data-automation-id='promptIcon'])[4]")
    public WebElement changelocationChangeJob;

    @FindBy(xpath = "//button[@title='Start']")
    public WebElement btnstartChangeJob;

    @FindBy(xpath = "//*[@aria-label='Edit Job Profile']")
    public WebElement editjobprofileChangeJob;

    @FindBy(xpath = "//button[@title='Next']")
    public WebElement btnnextChangeJob;

    @FindBy(xpath = "//label[text()='Location']//following::input[1]")
    public WebElement locationdetailsChangeJob;//*[@data-automation-id='formLabel']//following::input[1]

    @FindBy(xpath = "//*[@data-automation-id='actionImage']")
    public WebElement editlocationdetailsChangeJob;

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_next']")
    public WebElement btnnextLocationDetails;

    @FindBy(xpath = "//div[@data-automation-id='actionImage']")
    public WebElement editadmindetailsChangeJob;

    @FindBy(xpath = "//label[text()='Employee Type']//following::input[1]")
    public WebElement employeetypeChangeJob;

    @FindBy(xpath = "//label[text()='Time Type']//following::input[1]")
    public WebElement timetypeChangeJob;

    @FindBy(xpath = "//*[text()='Salary']//following::*[@title='Edit Salary']")
    public WebElement editsalaryChangeJob;

    @FindBy(xpath = "//input[@data-automation-id='numericInput']")
    public WebElement amountChangeJob;

    @FindBy(xpath = "//label[text()='Currency']//following::input[1]")
    public WebElement currencyChangeJob;

    @FindBy(xpath = "//label[text()='Frequency']//following::input[1]")
    public WebElement frequencyChangeJob;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement btnsubmitChangeJob;

    @FindBy(xpath = "//button[@title='Done']")
    public WebElement btndoneChangeJob;

    @FindBy(xpath = "//*[text()='Details and Process']")
    public WebElement linkdetailsChangeJob;

    @FindBy(xpath = "//label[text()='Overall Process']//following::*[@data-automation-id='promptOption']")
    public WebElement validationstepChangeJob;


    //Create Job requisition ---------------------------------------------------
    @FindBy(xpath = "//div[@title='Create Job Requisition']")
    public WebElement linkCreateJobReq;

    @FindBy(xpath = "//label[text()='Supervisory Organization']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement suporgCreateJobReq;

    @FindBy(xpath = "//label[text()='For Existing Position']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement positionCreateJobReq;

    @FindBy(xpath = "//label[text()='Create New Position']")
    public WebElement createNewPositionCreateJobReq;

    @FindBy(xpath = "//div[@data-automation-id='selectWidget']")
    public WebElement workertypeCreateJobReq;

    @FindBy(xpath = "//*[@title='OK']")
    public WebElement btnokCreateJobReq;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Number of Openings']//following::input[@data-automation-id='numericInput']")
    public WebElement NumvofJobOpenings;//*[@data-automation-id='textInputBox]

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Recruiting Details']")
    public WebElement editrecruitmentdetailsCreateJobReq;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Reason']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement reasonCreateJobReq;

    @FindBy(xpath = "(//div[@data-automation-id='dateWidgetContainer'])[1]")
    public WebElement recruitstartdateCreateJobReq;

    @FindBy(xpath = "(//div[@data-automation-id='dateWidgetContainer'])[2]")
    public WebElement targethiredateCreateJobReq;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_next' and @title='Next']")
    public WebElement btnnxtCreateJobReq;//button[@data-automation-id='wd-CommandButton_next']


    @FindBy(xpath = "//div[text()='Department']//following::div[@data-automation-id='actionImage'][1]")
    public WebElement deptEditProCompHire;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    public WebElement compValProCompHire;//span[@data-automation-id='promptIcon']


//    @FindBy(xpath = "//div[@title='Edit Other Row 1']")
//    public WebElement deptEditProCompHire;

    @FindBy(xpath = "//div[@title='Edit Job Details']")
    public WebElement editjobdetailsCreateJobReq;

    @FindBy(xpath = "//input[@data-automation-id='textInputBox']")
    public WebElement jobposttitleCreateJobReq;

    @FindBy(xpath = "//label[text()='Job Profile']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement jobprofileCreateJobReq;

    //label[text()='Worker Sub-Type']//following::span[@data-automation-id='promptIcon'][1]
    // @FindBy(xpath = "//label[text()='Worker Sub-Type']//following::span[@data-automation-id='promptIcon'][1]")

    @FindBy(xpath = "//label[text()='Associate Sub-Type']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement workersubtypeCreateJobReq;

    @FindBy(xpath = "//label[text()='Time Type']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement workertimetypeCreateJobReq;

    @FindBy(xpath = "//label[text()='Primary Location']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement primaryLocationCreateJobReq;

    @FindBy(xpath = "//label[text()='Primary Job Posting Location']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement primaryjobpostLocCreateJobReq;

    @FindBy(xpath = "//div[@title='Edit Company']")
    public WebElement editcompanydetailsCreateJobReq;

    //@FindBy(xpath = "//label[text()='Company']//following::input[@data-automation-id='searchBox']")
    @FindBy(xpath = "//label[text()='Company']//following::span[@data-automation-id='promptIcon']")
    public WebElement companyCreateJobReq;

    @FindBy(xpath = "//div[@title='Edit Cost Center']")
    public WebElement editcostcenterCreateJobReq;

    //    @FindBy(xpath = "//label[text()='Cost Center']//following::input[@data-automation-id='searchBox']")
    @FindBy(xpath = "//label[text()='Cost Center']//following::span[@data-automation-id='promptIcon']")
    public WebElement costcenterCreateJobReq;

    @FindBy(xpath = "//div[text()='Department']//following::span[@data-automation-id='promptIcon']")
    public WebElement deptValEditProCompHire;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_934$20_BPF_Button_Bar' and @title='Submit']")
    public WebElement btnsubmitCreateJobReq;

    @FindBy(xpath = "//*[text()='You have submitted']")
    public WebElement tag1validationCreateJobReq;

    @FindBy(xpath = "//button[@title='Done']")
    public WebElement btndoneCreateJobReq;

    @FindBy(xpath = "//span[text()='View Details']")
    public WebElement viewdetailsCreateJobReq;

    @FindBy(xpath = "//label[text()='Overall Process']//following::*[@data-automation-id='promptOption']")
    public WebElement jobreqnameCreateJobReq;

    @FindBy(xpath = "//span[text()='Details and Process']")
    public WebElement detailProcessCreateJobReq;

    @FindBy(xpath = "//div[text()='Process']")
    public WebElement clickProcessCreateJobReq;

    @FindBy(xpath = "//*[@data-automation-id='textView' and text()='Awaiting Action']//following::*[@data-automation-id='promptOption'][1]")
    public WebElement awaitingaprovernameCreateJobReq;

    @FindBy(xpath = "(//*[contains(@data-automation-id,'wd-InboxRow-')])[1]")
    public WebElement inboxrowCreateJobReq;

    @FindBy(xpath = "(//*[contains(@data-automation-id,'wd-InboxRow-')])[1]//following::button[@title='Approve']")
    public WebElement inboxbtnapproveCreateJobReq;

    @FindBy(xpath = "(//*[contains(@data-automation-id,'wd-InboxRow-')])[1]//following::button[@title='Done']")
    public WebElement inboxbtndoneCreateJobReq;

    @FindBy(xpath = "//span[text()='Success! Event approved']")
    public WebElement validateCreateJobReq;

    //Change My Personal Info ----------------------------------------------------------------------------------
    @FindBy(xpath = "  //div[text()='Change My Personal Information']")
    public WebElement linkChangeMyPersonalInfo;

    @FindBy(xpath = "//div[@title='Edit Gender']")
    public WebElement editgenderChangePersonalInfo;

    @FindBy(xpath = "//div[@data-automation-id='selectWidget']")
    public WebElement genderChangePersonalInfo;

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and text()='Male']")
    public WebElement genderMaleChangePersonalInfo;

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and text()='Female']")
    public WebElement genderFemaleChangePersonalInfo;

    @FindBy(xpath = "//div[@title='Edit Date of Birth']")
    public WebElement editdateChangePersonalInfo;

    @FindBy(xpath = "//*[@data-automation-id='dateTimeWidget']")
    public WebElement dateChangePersonalInfo;//div[@data-automation-id='dateWidgetContainer']

    @FindBy(xpath = "//div[@title='Edit Race/Ethnicity']")
    public WebElement editraceChangePersonalInfo;

    @FindBy(xpath = "//label[text()='Race/Ethnicity']//following::span[@data-automation-id='promptIcon']")
    public WebElement raceChangePersonalInfo;

    @FindBy(xpath = "//div[@data-automation-id='DELETE_charm']")
    public WebElement deleteRaceChangePersonalInfo;

    @FindBy(xpath = "//div[text()='Asian (Not Hispanic or Latino) (United States of America)']")
    public WebElement uncheckelemChangePersonalInfo;

    @FindBy(xpath = "//div[@title='Edit Citizenship Status']")
    public WebElement citizenshipstatusChangePersonalInfo;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement btnsubmitChangePersonalInfo;

    @FindBy(xpath = "//span[@title='You have submitted']")
    public WebElement validateChangePersonalInfo;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_uic_doneButton']")
    public WebElement btndonePersonalInfo;

    //Close Job requisition ---------------------------------------------------
    @FindBy(xpath = "//div[@title='Close Job Requisition']")
    public WebElement linkCloseJobReq;

    @FindBy(xpath = " //label[text()='Job Requisition']//following::span[@data-automation-id='promptIcon']")
    public WebElement srchCloseJobReq;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_uic_okButton']")
    public WebElement btnokCloseJobReq;

    @FindBy(xpath = "//label[text()='Reason']//following::span[@data-automation-id='promptIcon']")
    public WebElement reasonCloseJobReq;

    @FindBy(xpath = "//div[@data-automation-id='dateWidgetContainer']")
    public WebElement closedateCloseJobReq;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement btnsubmitCloseJobReq;

    @FindBy(xpath = "//span[text()='You have submitted']")
    public WebElement validateCloseJobReq;

    @FindBy(xpath = "//span[@title='Details and Process' and @role='button']")
    public WebElement checkvalidateCloseJobReq;

    @FindBy(xpath = "//label[text()='Job Requisition']//following::div[@data-automation-id='promptOption'][1]")
    public WebElement strvalidateCloseJobReq;

    @FindBy(xpath = "//button[@title='Done']")
    public WebElement btndoneCloseJobReq;

    @FindBy(xpath = "  //*[@data-automation-id='promptTitle']")
    public WebElement reqcloseconf;


//----------------Terminate Employee---------------

    @FindBy(xpath = "//input[@data-automation-id='globalSearchInput']")
    public WebElement searchBoxTerminate;

    @FindBy(xpath = "//div[@data-automation-id='promptOption']")
    public WebElement linkEmpTerminate;

    @FindBy(xpath = "//*[@data-automation-id='promptIcon']")
    public WebElement srchEmppTerminate;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    public WebElement srchEmpp1Terminate;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_uic_okButton']")
    public WebElement linkEmpOkTerminate;

    @FindBy(xpath = "//div[text()='1 Error']")
    public WebElement errorTerminate;

    @FindBy(xpath = "//span[@title='Details and Process']")
    public WebElement detailProcessTerminate;

    @FindBy(xpath = "//div[text()='Process']")
    public WebElement processtabTerminate;

    @FindBy(xpath = "//div[text()='Awaiting Action']")
    public WebElement statusTerminate;

    @FindBy(xpath = "//label[text()='Local Termination Reason']//following::span[@data-automation-id='promptIcon']")
    public WebElement localReasonTerminate;

    @FindBy(xpath = "//label[text()='All of Workday']")
    public WebElement allOfWorkdayTerminate;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[2]")
    public WebElement overallStatusTerminate;

    @FindBy(xpath = "//*[text()='Overall Status']//following::div[text()='Process'][1]")
    public WebElement processTabTerminate;

    @FindBy(xpath = "//div[@title='Edit Primary Reason']")
    public WebElement editPrimaryReasonTerminate;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    public WebElement srchPrimaryReasonTerminate;

    @FindBy(xpath = "//div[@data-automation-id='saveButton']")
    public WebElement savePrimaryReasonTerminate;

    @FindBy(xpath = "//div[@title='Details']")
    public WebElement detailsTerminate;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit']")
    public WebElement detailsEditTerminate;

    @FindBy(xpath = "//div[@title='Edit Close Position']")
    public WebElement editPositionTerminate;

    @FindBy(xpath = "//div[@title='Edit Eligible for Rehire']")
    public WebElement editEligibleTerminate;

    @FindBy(xpath = "//*[text()='Position Details']")
    public WebElement positionTerminate;

    @FindBy(xpath = "//div[@data-automation-id='checkboxPanel']")
    public WebElement closecheckboxTerminate;

    @FindBy(xpath = "//span[@title='Done']")
    public WebElement btdone;

    @FindBy(xpath = "//div[text()='Eligible for Rehire']//following::input[@data-automation-id='searchBox']")
    public WebElement srchiconEligibleTerminate;

    @FindBy(xpath = "//span[@title='Submit']")
    public WebElement submitTerminate;

    @FindBy(xpath = "//h2[text()='Reason']")
    public WebElement checkvalidateTerminate;

    @FindBy(xpath = "//*[text()='Awaiting Action']")
    public WebElement labelawaitingactionTerminateEmp;

    @FindBy(xpath = "//span[@title='Submit']")
    public WebElement inboxSubmitTerminate;

    @FindBy(xpath = "//span[@title='Done']")
    public WebElement inboxdoneTerminate;

    @FindBy(xpath = "//div[@title='Edit Last Date for Which Paid']")
    public WebElement editROETerminate;

    @FindBy(xpath = "//label[text()='Return Unknown']//following::div[@data-automation-id='checkboxPanel']")
    public WebElement ROEReturningTerminate;

    @FindBy(xpath = "//label[text()='Not Returning']//following::div[@data-automation-id='checkboxPanel'][1]")
    public WebElement ROENotReturningTerminate;

    @FindBy(xpath = "(//h1[text()='Help Available'])[2]")
    public WebElement helpPopupTerminate;

    @FindBy(xpath = "(//div[@data-automation-id='productTourStartIcon'])[1]")
    public WebElement closeTerminate;

    //----------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "(//div[@data-automation-id='tabLabel' and text()='Goals and Reviews'])[1]")
    public WebElement goaldAndReviews;

    @FindBy(xpath = "(//span[@data-automation-id='columnLabel-0' and text()='Disciplinary Action'])[1]")
    public WebElement desciplinaryActionCheck;

    // Contract CW-------------------------------------------------------------------------------------------------

    @FindBy(xpath = "  //div[@title='Contract Contingent Worker']")
    public WebElement linkContractCW;

    @FindBy(xpath = "  //label[text()='Supervisory Organization']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement suporgContractCW;

    @FindBy(xpath = " //label[@data-automation-label='Existing Pre-Hire']//following::span[@data-automation-id='promptIcon']")
    public WebElement prehireContractCW;

    @FindBy(xpath = "//button[@title='OK']")
    public WebElement btnokContractCW;

    @FindBy(xpath = "//label[text()='Contract Start Date']//following::div[@data-automation-id='dateTimeWidget'][1]")
    public WebElement startdateContractCW;//label[text()='Contract Start Date']//following::div[@data-automation-id='dateTimeWidget'][1]

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Reason']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement reasonContractCW;

    @FindBy(xpath = "//label[text()='Position']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement positionContractCW;

    @FindBy(xpath = "//label[text()='Contingent Worker Type']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement cwtypeContractCW;

    @FindBy(xpath = "//label[text()='Job Profile']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement jobprofileContractCW;

    @FindBy(xpath = "//label[text()='Time Type']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement timetypeContractCW;

    @FindBy(xpath = "//label[text()='Location']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement locationContractCW;

    @FindBy(xpath = "//label[text()='Supplier']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement supplierContractCW;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement btnsubmitContractCW;

    @FindBy(xpath = "//span[text()='Details and Process']")
    public WebElement detailsandprocessContractCW;

    @FindBy(xpath = "//div[text()='Details']//following::div[text()='Process'][1]")
    public WebElement processtabContractCW;

    @FindBy(xpath = "//label[text()='User Name']//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement usernameinboxContractCW;

    @FindBy(xpath = "//label[text()='New Password']//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement newpwdinboxContractCW;

    @FindBy(xpath = "//label[text()='Verify New Password']//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement verifynewpwdinboxContractCW;

    @FindBy(xpath = "//label[text()='Overall Process']//following::div[contains(text(),'Contract:')]")
    public WebElement chkoverallprocess;

    @FindBy(xpath = "//*[text()='Awaiting Action']")
    public WebElement validateawaitingactionContractCW;

    @FindBy(xpath = "//div[text()='Stop Proxy']")
    public WebElement linkStopProxy;

    @FindBy(xpath = "//span[@title='OK']")
    public WebElement stoproxyok;


    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_okButton']")
    public WebElement okbuttonStopProxy;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[@data-automation-id='textView'][1]")
    public WebElement overallStatusContractCW;

    @FindBy(xpath = "//span[text()='Status']//following::div[@data-automation-id='textView'][13]")
    public WebElement statusDataContractCW;


    @FindBy(xpath = "//span[text()='Process']//following::div[@data-automation-id='promptOption'][10]")
    public WebElement processDataContractCW;


    @FindBy(xpath = "//label[text()='Overall Process']//following::div[@data-automation-id='promptOption'][1]")
    public WebElement overAllProcessContractCW;


    @FindBy(xpath = "//label[text()='For']//following::div[@data-automation-id='promptOption'][1]")
    public WebElement forContractCW;



//----------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//*[@data-automation-id='searchBox']")
    public WebElement insidesearchboxcommon;

// ***************************************BP related functions******************************

    //Function for creating job change
    public void Jobchange(String Fname, String Lname, String SUPORG, String UPosition, String EmpType, String TimeType, String Salary) throws Exception {
        log.info("Helloooooooooooooooo");
        try {
            workdaycommon.setDriver(driverWrapper);
            // searchbySearchBox(Constants.SRCHCHANGEJOB);
            workdaycommon.searchbySearchBox("Change job");
            workdaycommon.userWait(2500);
            linkchangeJob.click(); //clicking on Change job link
            log.info(("Starting with job change . . .. . . "));
            workernameChangeJob.click(); //Entering worker's/employee name for whom the job to be changed
            workdaycommon.userWait(1000);
            String name = Fname + " " + Lname;
            insidesearchboxcommon.sendKeys(name, Keys.ENTER);
            workdaycommon.userWait(3000);
            workdaycommon.selectfromduplicates(name); // Selecting values from duplicates
            log.info("Entering Worker name");
            workdaycommon.userWait(2000);
            btnOKChangeJob.click();
            //Entering Start details
            log.info("Entering Job change start details");
            editStartDetailsChangeJob.click();
            String pattern = "MM/dd/YYYY";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date1 = simpleDateFormat.format(new Date());
            if (driverWrapper.isElementPresent(dateToChangeEffect)) {
                for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                    elem.sendKeys(date1);
                    elem.sendKeys(Keys.TAB);
                    elem.sendKeys(Keys.TAB);
                }
            }
            makechangeChangeJob.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Constants.JOBCHANGEREASONCHANGEJOB, Keys.ENTER);
            workdaycommon.userWait(3000);
            workdaycommon.scroll();
            changelocationChangeJob.click();
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys(SUPORG, Keys.ENTER);
            btnstartChangeJob.click();

            //Entering Job profile details
            log.info("Entering Job profile details");
            workdaycommon.scrolltoElement(editjobprofileChangeJob);
            editjobprofileChangeJob.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(UPosition);
            btnnextChangeJob.click();
            //Entering Location details
            log.info("Entering Location details");
            editlocationdetailsChangeJob.click();
            locationdetailsChangeJob.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(SUPORG, Keys.TAB);
            workdaycommon.userWait(3000);
            btnnextLocationDetails.click();
            //Entering administrative details
            log.info("Entering administrative details");
            workdaycommon.userWait(5000);
            editadmindetailsChangeJob.click();
            employeetypeChangeJob.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(EmpType, Keys.TAB);
            timetypeChangeJob.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(TimeType, Keys.TAB);
            workdaycommon.scrolltoElement(btnnextLocationDetails);
            btnnextLocationDetails.click();

            workdaycommon.userWait(3000);
            btnnextLocationDetails.click();
            // WebActionsUtil.handleAlert(driver);
            //Entering Salary details
            log.info("Entering Salary component");
            workdaycommon.scrolltoElement(editsalaryChangeJob);
            editsalaryChangeJob.click();
            //amountChangeJob.clear();
            amountChangeJob.sendKeys(Keys.BACK_SPACE);
            amountChangeJob.sendKeys(Keys.BACK_SPACE);
            amountChangeJob.sendKeys(Keys.BACK_SPACE);
            amountChangeJob.sendKeys(Keys.BACK_SPACE);
            amountChangeJob.sendKeys(String.valueOf(Salary), Keys.TAB);
            workdaycommon.userWait(3000);
            currencyChangeJob.click();
            insidesearchboxcommon.sendKeys(Constants.CURRENCYCHANGEJOB, Keys.TAB);
            workdaycommon.userWait(3000);
            frequencyChangeJob.click();
            insidesearchboxcommon.sendKeys(Constants.FREQUENCYCHANGEJOB, Keys.TAB);
            btnnextLocationDetails.click();
            workdaycommon.userWait(3000);
            workdaycommon.scroll();
            workdaycommon.userWait(3000);
            btnsubmitChangeJob.click();
            workdaycommon.userWait(3000);
            String validation = "Transfer: " + name;
            log.info("Original" + validation);
            linkdetailsChangeJob.click();
            log.info("The value from the validation step is : " + validationstepChangeJob.getText());
            if (validationstepChangeJob.getText().equals(validation)) {
                test.pass("Change job completed Successfully");
                log.info("Change job completed Successfully");
                btndoneChangeJob.click();
            } else
                test.fail("Failed in Changing the job for the given employee");
            log.error("Failed in Changing the job for the given employee");

        } catch (Exception e) {
            test.fail("Error Occurred in: " + e.getMessage());
            // log.error("Error occurred: " + e.getMessage());workersubtypeCreateJobReq
        }

    }

    String Positionglobal = null;

    public void CreatePosname()
    {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hhmmss");
        String time = dateFormat.format(now);
        String  Position = Constants.POSITIONCREATEPOSHIREEMP;
        Positionglobal= Position.concat(time);
    }


    public void CreateJobRequisition(String SUPORG, String WorkerType, String Reason, String Workersubtype, String JobProfile, String Company, String Costcenter, String PrimaryLocation) {
        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
            CreatePosname();
            log.info("The Position name is: " + Positionglobal);
            workdaycommon.searchbySearchBox(Constants.SRCHCREATEJOBREQ);
            linkCreateJobReq.click();
            workdaycommon.userWait(1000);
            suporgCreateJobReq.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(SUPORG, Keys.ENTER);
            workdaycommon.userWait(2000);
            log.info("Entering Supervisory Organization.....");
            // workdaycommon.selectfromduplicates(SUPORG);
            log.info("Entering Supervisory Organization.....");
            log.info("Entered Supervisory Organization.....");
            workdaycommon.userWait(3000);

//-----------------------uncomment the below lines to use the existing position for creating job requisition
//            positionCreateJobReq.click();
//            workdaycommon.userWait(1000);
//            insidesearchboxcommon.sendKeys(Position, Keys.ENTER);
//            workdaycommon.selectfromduplicates(Position);

            JavascriptExecutor jstCreateNwPos = (JavascriptExecutor) driver;
            workdaycommon.scrolltoElement(createNewPositionCreateJobReq);
            jstCreateNwPos.executeScript("arguments[0].click () ", createNewPositionCreateJobReq);
            workdaycommon.userWait(1000);

//          createNewPositionCreateJobReq.click();
            workdaycommon.userWait(2000);

            // Select selectworkertype = new Select(workertypeCreateJobReq);
            // selectworkertype.selectByVisibleText("Contingent Worker");

            WebActionsUtil.explicitWait(driver, workertypeCreateJobReq, "click");
            workdaycommon.scrolltoElement(workertypeCreateJobReq);
            workertypeCreateJobReq.click();
            workdaycommon.userWait(1000);
            workertypeCreateJobReq.sendKeys(WorkerType);
            workdaycommon.userWait(2000);
            btnokCreateJobReq.click();
            workdaycommon.userWait(1000);

            editrecruitmentdetailsCreateJobReq.click();
            workdaycommon.userWait(1000);
            NumvofJobOpenings.clear();
            workdaycommon.userWait(2000);
            NumvofJobOpenings.sendKeys(Constants.NUMBOFPOSITIONS, Keys.ENTER);

            workdaycommon.userWait(1000);
            reasonCreateJobReq.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Reason, Keys.ENTER);
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(recruitstartdateCreateJobReq);

            String pattern = "MM/dd/YYYY";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            //For Today's date'
            String datetoday = simpleDateFormat.format(new Date());
            //for Yesterday's date
            Calendar yesterday = Calendar.getInstance();
            yesterday.add(Calendar.DATE, -1);
            Date yestdate = yesterday.getTime();
            String yesterdaydate = simpleDateFormat.format(yestdate);

            if (driverWrapper.isElementPresent(recruitstartdateCreateJobReq)) {
                for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
         /* Entering yesterday date, so that this created job requisition can be used in
     automation script of close job requisition on same day with current date of executuon */
                    elem.sendKeys(yesterdaydate);
//                    elem.sendKeys("12/01/2019");
                    elem.sendKeys(Keys.TAB);
                    elem.sendKeys(Keys.TAB);
                }
            }
            workdaycommon.userWait(2000);
            if (driverWrapper.isElementPresent(targethiredateCreateJobReq)) {
                for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[2]"))) {
                    elem.sendKeys(datetoday);
//                    elem.sendKeys("10/02/2019");
                    elem.sendKeys(Keys.TAB);
                    elem.sendKeys(Keys.TAB);
                }
            }

            workdaycommon.userWait(2000);
            btnnxtCreateJobReq.click();


            log.info("Edit Job Started....");
            workdaycommon.userWait(1000);
            editjobdetailsCreateJobReq.click();
            workdaycommon.userWait(1000);

            jobposttitleCreateJobReq.clear();
            JavascriptExecutor jst = (JavascriptExecutor) driver;
            workdaycommon.scrolltoElement(jobposttitleCreateJobReq);
            jst.executeScript("arguments[0].click () ", jobposttitleCreateJobReq);
            workdaycommon.userWait(1000);
            jobposttitleCreateJobReq.sendKeys(Positionglobal, Keys.ENTER);
//            jobposttitleCreateJobReq.sendKeys(Position, Keys.ENTER);
            workdaycommon.userWait(2000);

            workdaycommon.scrolltoElement(jobprofileCreateJobReq);
            jobprofileCreateJobReq.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(JobProfile, Keys.ENTER);
            workdaycommon.userWait(2000);

            workdaycommon.scrolltoElement(workersubtypeCreateJobReq);
            workersubtypeCreateJobReq.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Workersubtype, Keys.ENTER);
            workdaycommon.userWait(2000);

            workdaycommon.scrolltoElement(workertimetypeCreateJobReq);
            workertimetypeCreateJobReq.click();
            workdaycommon.userWait(1000);
            //insidesearchboxcommon.sendKeys(WorkerTimetype, Keys.ENTER);
            insidesearchboxcommon.sendKeys("Full time", Keys.ENTER);
            workdaycommon.userWait(2000);


            primaryLocationCreateJobReq.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(PrimaryLocation, Keys.ENTER);
            workdaycommon.userWait(2000);

            btnnxtCreateJobReq.click();
            workdaycommon.userWait(2000);

            editcompanydetailsCreateJobReq.click();
            workdaycommon.userWait(2000);
            JavascriptExecutor jstCompany = (JavascriptExecutor) driver;
            workdaycommon.scrolltoElement(companyCreateJobReq);
            jstCompany.executeScript("arguments[0].click () ", companyCreateJobReq);
            workdaycommon.userWait(1000);
            //companyCreateJobReq.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Constants.COMPANYJOBREQHIREEMP, Keys.ENTER);
            workdaycommon.userWait(1000);

            workdaycommon.scrolltoElement(editcostcenterCreateJobReq);
            editcostcenterCreateJobReq.click();
            workdaycommon.userWait(1000);
            costcenterCreateJobReq.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Constants.COSTCENTERJOBREQHIREEMP, Keys.ENTER);
            workdaycommon.userWait(1000);

            workdaycommon.scrolltoElement(deptEditProCompHire);
            workdaycommon.userWait(2000);
//            WebActionsUtil.explicitWait(driver, deptEditProCompHire, "click");
            deptEditProCompHire.click();
            workdaycommon.userWait(2000);
            deptValEditProCompHire.click();
            workdaycommon.userWait(2000);
            compValProCompHire.sendKeys(Constants.DEPARTMENTHIREEMP, Keys.ENTER);
            workdaycommon.userWait(3000);
            btnnxtCreateJobReq.click();
            workdaycommon.userWait(1000);
            try {
                btnnxtCreateJobReq.click();
                log.info(" Next button is clicked ");
            }catch (Exception e)
            {
                log.info("....This next button will not come when doing a re-hire process...");
            }
            btnsubmitCreateJobReq.click();
            workdaycommon.userWait(1000);
            //  detailProcessCreateJobReq.click();
            viewdetailsCreateJobReq.click();//clicking View details from Popup

            workdaycommon.userWait(1000);

            //Getting Requisition name
            StringBuilder Reqname = new StringBuilder(jobreqnameCreateJobReq.getText());
            log.info("Before replacing the Req name :" + Reqname);
            Reqname.delete(0, 17);
            log.info("After replacing the Req name :" + Reqname);
            reqName = Reqname.toString();
            log.info("the Req name :" + reqName);

            workdaycommon.scrolltoElement(clickProcessCreateJobReq);
            clickProcessCreateJobReq.click();
            workdaycommon.userWait(2000);

            try {
                workdaycommon.scrolltoElement(awaitingaprovernameCreateJobReq);

                //Getting Approver name
                StringBuilder aprovername = new StringBuilder(awaitingaprovernameCreateJobReq.getText());
                log.info("Before replacing the Aprover name :" + aprovername);
                aprovername.delete(aprovername.length() - 20, aprovername.length());
                log.info("After replacing the Aprover name :" + aprovername);
                WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
                Threedots.click();
                workdaycommon.scrolltoElement(securityProfile);
                workdaycommon.mousemove(securityProfile, startProxyFromAssociateName);
                workdaycommon.userWait(1000);
                startProxyFromAssociateName.click();
                btnOKChangeJob.click();
                workdaycommon.userWait(3000);
                log.info(".......Proxy successful.......");
                workdaycommon.inboxWD.click();
                workdaycommon.userWait(2000);
                inboxrowCreateJobReq.click();
                workdaycommon.scrolltoElement(inboxbtnapproveCreateJobReq);
                inboxbtnapproveCreateJobReq.click();
                workdaycommon.userWait(5000);
            }
            catch(Exception e)
            {
                log.info("Awaiting action is not available");

            }
            try {
                viewdetailsCreateJobReq.click();//clicking View details from Popup
                log.info("viewdetails tab clicked");

            } catch (Exception e) {
                log.info("No viewdetails tab");
            }
            log.info("Job requisition created successfully");
            test.pass("Job requisition created successfully");


//            if (validateCreateJobReq.isDisplayed()) {
//                if (driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(@title,'Job Requisition: " + Reqname + "')]")).isDisplayed()) {
//                    test.pass("Job requisition created successfully for " + Positionglobal);
//                    log.info("Job requisition created successfully for " + Positionglobal);
////                    workdaycommon.scrolltoElement(inboxbtndoneCreateJobReq);
////                    inboxbtndoneCreateJobReq.click();
//                    workdaycommon.gotoWorkdayHomepage();
//                } else {
//                    test.pass("Failed creating Job requisition for " + Positionglobal);
//                    log.info("Failed creating Job requisition for " + Positionglobal);
//                }
//            }

        } catch (Exception e) {
            test.fail("Exception/Issue Occured: " + e.getMessage());
            log.error("Exception/Issue Occured: " + e.getMessage());
        }
    }


    public void ChangePersonalInfo(String Gender, String DOB, String Race) throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.searchbySearchBox(Constants.SRCHCHANGEMYPERSONALINFO);
            WebActionsUtil.explicitWait(driver, linkChangeMyPersonalInfo, "click");
            linkChangeMyPersonalInfo.click();
            WebActionsUtil.explicitWait(driver,editgenderChangePersonalInfo,"click");
            editgenderChangePersonalInfo.click();
            log.info("edit gender is clicked");
            //genderChangePersonalInfo.click();
            genderChangePersonalInfo.click();
            log.info("selecting gender");
            workdaycommon.userWait(1000);
            try
            {
                if(Gender.equals("Male"))
                {
                    JavascriptExecutor jstCreateNwPos = (JavascriptExecutor) driver;
                    workdaycommon.scrolltoElement(genderMaleChangePersonalInfo);
                    jstCreateNwPos.executeScript("arguments[0].click () ", genderMaleChangePersonalInfo);
                    workdaycommon.userWait(2000);
//                    workdaycommon.userWait(3000);
//                    genderMaleChangePersonalInfo.click();
                    log.info("gender is clicked");
                }
            }
            catch(Exception e)
            {
                JavascriptExecutor jstCreateNwPos = (JavascriptExecutor) driver;
                workdaycommon.scrolltoElement(genderFemaleChangePersonalInfo);
                jstCreateNwPos.executeScript("arguments[0].click () ", genderFemaleChangePersonalInfo);
                workdaycommon.userWait(2000);
//                genderFemaleChangePersonalInfo.click();
//                workdaycommon.userWait(3000);
                log.info("gender is clicked");
            }

            log.info("gender is done");
            workdaycommon.userWait(1000);
            WebActionsUtil.explicitWait(driver,editdateChangePersonalInfo,"click");
            editdateChangePersonalInfo.click();
            workdaycommon.scroll();
            String pattern = "MM/dd/YYYY";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date1 = simpleDateFormat.format(new Date());
            if (driverWrapper.isElementPresent(dateChangePersonalInfo)) {
                for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                    elem.sendKeys(DOB);
                    elem.sendKeys(Keys.TAB);
                    elem.sendKeys(Keys.TAB);
                }
            }
            workdaycommon.userWait(2000);
//            WebActionsUtil.explicitWait(driver,editraceChangePersonalInfo,"click");
            workdaycommon.scrolltoElement(editraceChangePersonalInfo);
            editraceChangePersonalInfo.click();
            workdaycommon.userWait(2000);
//Commenting the below two lines, as race is already populated, can uncomment and use when required.
//            titleRaceChangePersonalInfo.click();
//            log.info("clicked on title");
            raceChangePersonalInfo.click();
//            deleteRaceChangePersonalInfo.click();
//            raceChangePersonalInfo.click();
            insidesearchboxcommon.sendKeys(Race, Keys.ENTER);

            workdaycommon.userWait(1000);
            // commenting below line, can be used when required
            // citizenshipstatusChangePersonalInfo.click();
            btnsubmitChangePersonalInfo.click();
            if (validateChangePersonalInfo.isDisplayed()) {
                log.info("Personal info change is done successfully");
                test.pass("Personal info change is done successfully");
                btndonePersonalInfo.click();
            } else {
                log.info("Failed changing Personal info");
                test.fail("Failed changing Personal info");
            }
        } catch (Exception e) {
            test.fail("Exception/Issue occurred" + e.getMessage());
            log.error("Exception/Issue occurred" + e.getMessage());
        }
    }


    public void closeJobRequisition(String JobRequisite, String Reason) throws Exception {
        try {
            log.info("Came into the function ");
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.searchbySearchBox(Constants.SRCHCLOSEJOBREQ);
            linkCloseJobReq.click();
            srchCloseJobReq.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(JobRequisite, Keys.ENTER);
            btnokCloseJobReq.click();

            log.info("Entering Close Job Requisition....");
            workdaycommon.userWait(4000);
            reasonCloseJobReq.click();
            workdaycommon.userWait(2000);
            insidesearchboxcommon.sendKeys(Reason, Keys.ENTER);
            //closedateCloseJobReq.click();
            String pattern = "MM/dd/YYYY";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date1 = simpleDateFormat.format(new Date());
            if (driverWrapper.isElementPresent(closedateCloseJobReq)) {
                for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                    elem.sendKeys(date1);
                    elem.sendKeys(Keys.TAB);
                    elem.sendKeys(Keys.TAB);
                }
            }
            btnsubmitCloseJobReq.click();

            if (validateCloseJobReq.isDisplayed()) {

                String strdata = JobRequisite + " (Closed)";
                log.info(strdata);
                checkvalidateCloseJobReq.click();
                //String str1=strvalidateCloseJobReq.getText();
                //log.info(str1);
                if (strvalidateCloseJobReq.getText().equals(strdata)) {
                    log.info("Closing job requisition is done successfully for " + JobRequisite);
                    test.pass("Closing job requisition is done successfully for " + JobRequisite);
                    btndoneCloseJobReq.click();
                }

                //if(xyz.getText().equals(str))
            } else {
                log.info("Failed Closing job requisition for " + JobRequisite);
                test.fail("Failed Closing job requisition for " + JobRequisite);

            }
        } catch (Exception e) {
            test.fail("Exception/Issue occurred" + e.getMessage());
            log.error("Exception/Issue occurred" + e.getMessage());
        }
        linkCloseJobReq.click();
        srchCloseJobReq.click();
        workdaycommon.userWait(4000);
        insidesearchboxcommon.sendKeys(JobRequisite, Keys.ENTER);
        workdaycommon.userWait(4000);
        String confmsg = reqcloseconf.getText();

        if (confmsg.contains("No matches found")) {
            log.info("Requisition data not found for " + JobRequisite);
            test.pass("Closing job requisition is done successfully for " + JobRequisite);
        } else {
            log.info("Reuisition data Exists for " + JobRequisite);
            test.fail("Failed Closing job requisition for " + JobRequisite);
        }

    }

    public void TerminateEmp(String Empname, String TerminationType, String PrimaryReason, String EligibleReHire, String SearchWith, String localReason, String Termdate) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(1000);
        log.info("Terminate Employee Starts.....");
        searchBoxTerminate.sendKeys(SearchWith, Keys.ENTER);
        workdaycommon.userWait(3000);

        linkEmpTerminate.click();
        workdaycommon.userWait(1000);
        srchEmppTerminate.click();
        workdaycommon.userWait(1000);
        srchEmpp1Terminate.sendKeys(Empname, Keys.ENTER);
        // workdaycommon.selectfromduplicates(Empname);
        workdaycommon.userWait(5000);
        linkEmpOkTerminate.click();
        workdaycommon.userWait(7000);
        //   if(!errorTerminate.isDisplayed()) {
        // if (checkvalidateTerminate.isDisplayed()) {


        try {
            if (helpPopupTerminate.isDisplayed()) {
                closeTerminate.click();
                log.info("Popup Window displayed");
                workdaycommon.userWait(3000);
            }
        } catch (Exception e) {
            log.info("Popup Window not present");
            workdaycommon.userWait(1000);
        }


        log.info("-----Termination Screen Starts-------");
        WebActionsUtil.explicitWait(driver, editPrimaryReasonTerminate, "click");
        workdaycommon.scrolltoElement(editPrimaryReasonTerminate);
        editPrimaryReasonTerminate.click();
        workdaycommon.userWait(2000);
        srchPrimaryReasonTerminate.sendKeys(PrimaryReason, Keys.ENTER);
        workdaycommon.userWait(2000);
        driverWrapper.waitForPageLoaded();
        workdaycommon.userWait(1000);

        //Some time this option will display
        try {
            // if (localReasonTerminate.isDisplayed()) {
            log.info("-----localReasonTerminate Selected......" + localReason);
            log.info("Yet to select localReason ");
            workdaycommon.userWait(1000);
            localReasonTerminate.click();
            workdaycommon.userWait(1000);
            driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @data-automation-label='" + localReason + "']")).click();
            workdaycommon.userWait(2000);

            // localReasonTerminate.sendKeys(localReason, Keys.ENTER);
            workdaycommon.userWait(1000);
            log.info("-----localReasonTerminate Selected......" + localReason);
            //}
        } catch (NoSuchElementException e) {
            log.info("For US Associate localReasonTerminate not available .........");
            log.info("-----localReasonTerminate Not Present Selected......");
        }


        workdaycommon.userWait(3000);
        savePrimaryReasonTerminate.click();
        workdaycommon.userWait(1000);
        log.info("-----Details Screen Starts-------");
        workdaycommon.scrolltoElement(detailsTerminate);
        detailsTerminate.click();
        workdaycommon.userWait(1000);
        detailsEditTerminate.click();
        workdaycommon.userWait(2000);

        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        //For Today's date'
        String datetoday = simpleDateFormat.format(new Date());
        //for Future's date
        Calendar future = Calendar.getInstance();
        future.add(Calendar.DATE, 2);
        Date futuredate = future.getTime();
        String futuredate1 = simpleDateFormat.format(futuredate);
        log.info("The date after 2 days=====" + futuredate1);
        if (driverWrapper.isElementPresent(dateChangePersonalInfo)) {
            for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                log.info("-----Selecting Date-------");
                // elem.sendKeys(futuredate1);
                elem.sendKeys(Termdate);
                elem.sendKeys(Keys.TAB);
                elem.sendKeys(Keys.TAB);
            }
        }

        if (TerminationType.equalsIgnoreCase("Voluntary")) {
            log.info("Entering Voluntary details....");
            workdaycommon.userWait(1000);
            workdaycommon.scrolltoElement(editEligibleTerminate);
            editEligibleTerminate.click();
            workdaycommon.userWait(2000);
            srchiconEligibleTerminate.click();
            workdaycommon.userWait(2000);
            log.info("Yet to select yes ");
            driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @data-automation-label='" + EligibleReHire + "']")).click();
            workdaycommon.userWait(2000);

            try {
                //Entering ROE Details
                workdaycommon.userWait(1000);
                workdaycommon.scrolltoElement(editROETerminate);
                editROETerminate.click();
                workdaycommon.userWait(2000);
                ROEReturningTerminate.click();
            } catch (NoSuchElementException e) {
                log.info("For US Associate ROE details not available .........");
                log.info("-----ROE details Not Present Selected......");
            }

        } else {
            //Involuntary
            log.info("Entering Involuntary details....");
            workdaycommon.userWait(1000);
            workdaycommon.scrolltoElement(editEligibleTerminate);
            editEligibleTerminate.click();
            workdaycommon.userWait(2000);
            srchiconEligibleTerminate.click();
            workdaycommon.userWait(1000);
            log.info("Yet to select yes ");
            driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @data-automation-label='No']")).click();
            workdaycommon.userWait(2000);

            try {
                //Entering ROE Details
                workdaycommon.userWait(1000);
                workdaycommon.scrolltoElement(editROETerminate);
                editROETerminate.click();
                workdaycommon.userWait(2000);
                workdaycommon.scrolltoElement(ROEReturningTerminate);
                ROEReturningTerminate.click();
            } catch (NoSuchElementException e) {
                log.info("For US Associate ROE details not available .........");
                log.info("-----ROE details Not Present Selected......");
            }
        }

        try {
            if (positionTerminate.isDisplayed()) {
                workdaycommon.userWait(1000);
                workdaycommon.scrolltoElement(editPositionTerminate);
                editPositionTerminate.click();
                workdaycommon.userWait(1000);
                closecheckboxTerminate.click();
                btdone.click();
                workdaycommon.userWait(1000);
                btdone.click();
                workdaycommon.userWait(1000);
            }
        } catch (NoSuchElementException e) {
            log.info("Position Details not available");
        }


        submitTerminate.click();
        workdaycommon.userWait(4000);
        test.pass("Termination details Submitted Successfully for: " + Empname);


        log.info("----------Capturing Awaiting Action in Process Tab Starts---------");
//        detailProcessTerminate.click();
//        workdaycommon.scrolltoElement(processtabTerminate);
//        workdaycommon.userWait(1000);
//        processtabTerminate.click();
//        workdaycommon.loading();
        Terminate_employeeCheck(Empname);


        try {
            workdaycommon.scrolltoElement(workdaycommon.labelawaitingaction);
            while (workdaycommon.labelawaitingaction.isDisplayed()) {
                workdaycommon.scrolltoElement(workdaycommon.labelawaitingaction);
//                String Approver_name = workdaycommon.awaitingAction(1);
//                StringBuilder proxyperson = new StringBuilder(Approver_name);
//                log.info("Before deleting space" + proxyperson);
//                proxyperson.delete(Approver_name.length() - 1, Approver_name.length());
//                log.info("After deleting space" + proxyperson);
//                workdaycommon.userWait(3000);
//                workdaycommon.StartProxy_employee(proxyperson.toString());
//                workdaycommon.userWait(4000);

//                ---Added New line of code to click on the three dots---
                WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
                Threedots.click();
                workdaycommon.scrolltoElement(securityProfile);
                workdaycommon.mousemove(securityProfile,startProxyFromAssociateName);
                workdaycommon.userWait(1000);
                startProxyFromAssociateName.click();
                btnOKChangeJob.click();
                workdaycommon.userWait(3000);
                log.info(".......Proxy successful.......");
//            -------------------End of code to add click on three dots---

                workdaycommon.inboxOperation(Empname);
                workdaycommon.userWait(2000);
                log.info("Approval/Submit completed Successfully.......");
                Terminate_employeeCheck(Empname);

            }
        } catch (NoSuchElementException e) {
            log.info("Running in Catch Block.........No Awaiting Action is Present");
            test.info("No Awaiting Action is Present");
            Terminate_Validation();

        }
    }
    public void Terminate_employeeCheck(String Empname) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.startProxy("BP Admin");
        workdaycommon.userWait(2000);
        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.searchbySearchBox(Empname);
        workdaycommon.userWait(2000);
        allOfWorkdayTerminate.click();
        log.info("All of Workday is clicked.");
        workdaycommon.userWait(4000);
        WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Terminate: "+Empname+"')]"));
        workdaycommon.scrolltoElement(Employeename);
        Employeename.click();
        WebActionsUtil.explicitWait(driver, processTabTerminate, "click");
        workdaycommon.scrolltoElement(processTabTerminate);
        workdaycommon.userWait(1000);
        processTabTerminate.click();
        workdaycommon.userWait(2000);

    }

    public void Terminate_Validation() {
        String overallStatus = overallStatusTerminate.getText();
        log.info("---------overallStatusTerminate------>" + overallStatus);
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (statusTerminate.isDisplayed()) {
                    log.info("Termination not Completed Successfully........");
                    test.fail("Termination not Completed Successfully........");
                    driver.quit();
                }
            } catch (Exception e) {
                test.pass("Termination Completed Successfully");
                log.info("Termination Completed Successfully........");
            }
        } else {
            log.info("Termination not Completed Successfully........Current Status: " + overallStatus);
            test.fail("Termination not Completed Successfully.......Current Status: " + overallStatus);
            driver.quit();
        }
    }

    public void AssociateHistory(String Employee)throws Exception {

        workdaycommon.userWait(5000);
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(2000);
        allOfWorkdayTerminate.click();
        workdaycommon.userWait(3000);
        WebElement emp = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        workdaycommon.scrolltoElement(emp);
        emp.click();
        workdaycommon.userWait(3000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(workdaycommon.associateHistoryLink, workdaycommon.viewAssociateHistorybyCategoryLink);
        workdaycommon.userWait(3000);

    }


    public void ContractCW(String Organization, String EmployeePreHire, String Position, String WorkerType, String JobProfile, String TimeType, String UserName_Inbox, String NewPwd_Inbox, String VerifyNewPwd_Inbox) throws Exception {
        log.info("Entering into Contract CW");
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.searchbySearchBox(Constants.SRCHCONTRACTCW);
        workdaycommon.userWait(3000);
        linkContractCW.click();
        suporgContractCW.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Organization, Keys.TAB);
//        workdaycommon.selectfromduplicates(Organization);
        prehireContractCW.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.clear();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(EmployeePreHire, Keys.ENTER);
//        workdaycommon.selectfromduplicates(EmployeePreHire);
        workdaycommon.userWait(2000);
        btnokContractCW.click();
        workdaycommon.userWait(3000);
        //startdateContractCW.click();
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date1 = simpleDateFormat.format(new Date());
        if (driverWrapper.isElementPresent(startdateContractCW)) {
            for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                elem.sendKeys(date1);
                elem.sendKeys(Keys.TAB);
//                elem.sendKeys(Keys.TAB);
            }
        }
        workdaycommon.userWait(3000);
        reasonContractCW.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys("Initial Engagement", Keys.ENTER);
        workdaycommon.userWait(2000);
        positionContractCW.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Position, Keys.ENTER);
        workdaycommon.selectfromduplicates(Position);
        workdaycommon.userWait(3000);
        cwtypeContractCW.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(WorkerType, Keys.ENTER);
        workdaycommon.userWait(3000);
        jobprofileContractCW.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(JobProfile, Keys.ENTER);
        workdaycommon.userWait(3000);
        timetypeContractCW.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(TimeType, Keys.ENTER);
        workdaycommon.userWait(3000);
        locationContractCW.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys("7052", Keys.ENTER);

        /*workdaycommon.scrolltoElement(supplierContractCW);
        supplierContractCW.click();

        insidesearchboxcommon.sendKeys("");
        log.info("Entered supplier");
*/

        btnsubmitContractCW.click();
        detailsandprocessContractCW.click();
        processtabContractCW.click();
        workdaycommon.userWait(3000);
        try {
            if (workdaycommon.labelawaitingaction.isDisplayed()) {
                workdaycommon.scrolltoElement(workdaycommon.labelawaitingaction);
                workdaycommon.userWait(5000);
                List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
                int count = labelAwaitingaction.size();
                log.info(" Awaiting Actions Label Count----->" + count);
                for (int i = 1; i <= count; i++) {
                    String proxyname = workdaycommon.awaitingAction(i);
// Proxying to the person , as the respective person is not being able to proxy from Start proxy
                    workdaycommon.startProxy(proxyname);
                    //workdaycommon.inboxOperation(EmployeePreHire);
                    workdaycommon.gotoWorkdayHomepage();
                    workdaycommon.inboxWD.click();
                    workdaycommon.userWait(3000);
                    WebElement inboxrow = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'" + EmployeePreHire + "')]"));
                    workdaycommon.scrolltoElement(inboxrow);
                    inboxrow.click();
                    workdaycommon.userWait(3000);
                    usernameinboxContractCW.sendKeys(UserName_Inbox);
                    newpwdinboxContractCW.sendKeys(NewPwd_Inbox);
                    verifynewpwdinboxContractCW.sendKeys(VerifyNewPwd_Inbox);
                    workdaycommon.inboxbuttonSubmit.click();
                    log.info("details...1");
                }
            }
        } catch (NoSuchElementException e) {
            log.info("Running in the catch ...................No Awaiting is avaialble");
            test.info("No Awaiting is avaialble");
            detailsandprocessContractCW.click();
            log.info("details...1");

        }
        detailsandprocessContractCW.click();
        log.info("details...1");
        //data-automation-id='promptOption']
        String overallprocess = "Contract: " + EmployeePreHire + " [C]";
        String overallstatus = "Successfully Completed";
        //  WebElement clickcontract = driver.findElement(By.xpath("//label[text()='Overall Process']//following::*[contains(@title,'Contract: " + EmployeePreHire + "')]"));
        //  workdaycommon.scrolltoElement(clickcontract);
        //  clickcontract.click();

        WebElement chkoverallstatus = driver.findElement(By.xpath("//label[text()='Overall Status']//following::div[text()='Successfully Completed']"));
        //div[text()='Successfully Completed']
        workdaycommon.userWait(3000);
        // log.info(overallstatus);
        log.info(chkoverallstatus.getText());
        //  log.info(overallprocess);
        // log.info(chkoverallprocess.getText());

        log.info("-------------Check IF condition");
        //if ((overallprocess.equals(chkoverallprocess.getText())) && (overallstatus.equals(chkoverallstatus.getText()))) {
        if (overallstatus.equals(chkoverallstatus.getText())) {
            log.info("-------------Entering into process tab-------");
            processtabContractCW.click();
            log.info("Checking for Awaiting Action..... ");
            try {
                if (validateawaitingactionContractCW.isDisplayed()) {
                    test.fail("Contract Contengent worker cannot be created ; Pending with Awaiting Action ");
                    log.info("Contract Contengent worker cannot be created ; Pending with Awaiting Action ");
                }
            } catch (NoSuchElementException e) {
                test.pass("Contract contingent Worker is Created successfully");
                log.info("Contract contingent Worker is Created successfully");
                test.info(" BP : Contract Contingent Worker " + "," + "Organization :" + Organization + "  ,  "
                        + "  Employee Name : " + EmployeePreHire + "  ,  "
                        + "  Position : " + Position + "  ,  " + "  WorkerType : " + WorkerType);
            }
        } else {
            test.fail("Contract contingent Worker Creation is unsuccessful");
            log.info("Contract contingent Worker Creation is unsuccessful");
        }
        workdaycommon.searchbySearchBox("Stop proxy");
        linkStopProxy.click();
        workdaycommon.userWait(3000);
        stoproxyok.click();
        workdaycommon.userWait(3000);
        //okbuttonStopProxy.click();
        log.info("ContractCW-----ends");
    }


    public void ReviewDesciplinaryAction(String Employee)throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.info("Step-3");
//        workdaycommon.gotoWorkdayHomepage();
        log.info("Review Started");
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(2000);
        allOfWorkdayTerminate.click();
        workdaycommon.userWait(3000);
        WebElement emp = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        workdaycommon.scrolltoElement(emp);
        emp.click();
        workdaycommon.userWait(3000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(workdaycommon.associateHistoryLink, workdaycommon.viewAssociateHistorybyCategoryLink);
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(goaldAndReviews);
        goaldAndReviews.click();

        try{
            workdaycommon.scrolltoElement(desciplinaryActionCheck);
            test.pass("Able to review");
            log.info("Able to review");
        }
        catch(Exception e){
            test.fail("Can not able to review");
            log.info("Can not able to review");
        }


    }


}

