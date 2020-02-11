package com.thd.Trash;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.*;
import java.lang.*;
//import java.util.concurrent.TimeUnit;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import com.thd.common.utils.Excelutil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import com.thd.base.BasePage;
import com.thd.base.Constants.Constants;
import com.thd.common.utils.WebActionsUtil;

public class E2E_T170 extends BasePage {
    private static final Logger log = LogManager.getLogger(E2E_T170.class);
    WorkdayCommon workdaycommon = new WorkdayCommon();
    Excelutil util = new Excelutil();
    String SSNNO = util.SSNGenerator();

    String reqName = null;


//************************WebElements************************************************

    // Create Pre-hire functionality  -----------------------------------------

    // Add address-------------------------------------

    @FindBy(xpath = "//div[text()='Address']//following::button[@data-automation-id='panelSetAddButton'][1]")
    public WebElement addressaddPreHire;


// Add work address-------------------------------------

    @FindBy(xpath = "(//div[text()='Address Line 1'])[2]//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement workaddressline1PreHire;

    @FindBy(xpath = "(//div[text()='Address Line 2'])[2]//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement workaddressline2PreHire;

    @FindBy(xpath = "(//label[text()='City'])[2]//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement workcityPreHire;

    @FindBy(xpath = "//*[@data-automation-id='promptOption' and @title='SAI - Sales Associate I']")
    public WebElement jobProfileSelection;


    @FindBy(xpath = "//div[@data-automation-id='helptext-click-target']")
    public WebElement changeJobUpArrow;


    @FindBy(xpath = "(//label[text()='Province or Territory'])[2]//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement workprovincePreHire;

    @FindBy(xpath = "(//label[text()='Postal Code'])[2]//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement workpostalcodePreHire;

    @FindBy(xpath = "(//label[text()='Type'])[2]//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement worktypePreHire;


    @FindBy(xpath = "//label[text()='Percent Change']//following::input[1]")
    public WebElement percentChange;


// Add home address -------------------------------------

//@FindBy(xpath = "//label[text()='Country']//following::span[@data-automation-id='promptIcon'][4]")
//public WebElement homecountryPreHire;


    @FindBy(xpath = "//div[text()='Address Line 1'][1]//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement homeaddressline1PreHire;


    @FindBy(xpath = "//div[text()='Address Line 2'][1]//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement homeaddressline2PreHire;


    @FindBy(xpath = "//label[text()='City'][1]//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement homecityPreHire;

    @FindBy(xpath = "//label[text()='Province or Territory'][1]//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement homeprovincePreHire;

// @FindBy(xpath = "//label[text()='State'][1]//following::span[@data-automation-id='promptIcon'][1]")
// public WebElement homestatePreHire;

    @FindBy(xpath = "//label[text()='Postal Code'][1]//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement homepostalcodePreHire;

    @FindBy(xpath = "//label[text()='Type'][1]//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement hometypePreHire;


    @FindBy(xpath = "//*[@data-automation-id='promptOption' and @title='Create Pre-Hire']")
    public WebElement createprehireLink;

    @FindBy(xpath = "(//*[@data-automation-id='checkboxPanel'])[1]")
    public WebElement AllowdupnamechbxcreateprehireLink;

    @FindBy(xpath = "(//label[text()='First Name']//following::*[@data-automation-id='textInputBox'])[1]")
    public WebElement FNameCreatePreHire;

    @FindBy(xpath = "(//*[@data-automation-id='textInputBox'])[3]")
    public WebElement LNameCreatePreHire;

    @FindBy(xpath = "(//*[@data-automation-id='tabLabel'])[3]")
    public WebElement Conductinfo;

    @FindBy(xpath = "//*[@aria-label='Add Email']")
    public WebElement emailCreatePreHire;

    @FindBy(xpath = "//label[text()='Email Address']//following::input[@data-automation-id='textInputBox']")
    public WebElement enteremailCreatePreHire;

    @FindBy(xpath = "(//*[@data-automation-id='promptIcon'])[6]/div")
    public WebElement typeemailCreatePreHire;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    public WebElement typeemailCreatePreHireSearchbox;

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_okButton']")
    public WebElement okButtonCreatePreHire;

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_doneButton']")
    public WebElement doneButtonCreatePreHire;

    // Hire Employee functionality  --------------------------------

    @FindBy(xpath = "//*[@data-automation-id='promptOption' and @title='Hire Associate']")
    public WebElement hireemployeeLink;

    @FindBy(xpath = "//label[text()='Existing Pre-Hire']//preceding::*[1]")
    public WebElement radioHireEmployee;

    @FindBy(xpath = "//label[text()='Supervisory Organization']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement suporgHireEmployee;

    @FindBy(xpath = "//label[text()='Supervisory Organization']//following::*[@data-automation-id='promptIcon'][2]")
    public WebElement nameHireEmployee;

    @FindBy(xpath = "(//*[@data-automation-id='searchBox']")
    public WebElement nameHireEmployeeSearchBox;

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_okButton']")
    public WebElement okbuttonHireEmployee;

    @FindBy(xpath = "//*[@data-automation-id='dateWidgetInputBox']")
    public WebElement hiredateHireEmployee;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Reason']//following::input[1]")
    public WebElement reasonHireEmployee;

    @FindBy(xpath = "//label[text()='Position']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement positionHireEmployee;

    @FindBy(xpath = "(//label[@data-automation-id='formLabel'])[4]//following::input[1]")
    public WebElement empTypeHireEmployee;

    @FindBy(xpath = "//div[@data-automation-label='Hire Employee']")
    public WebElement Reasonhireemp;

    @FindBy(xpath = "//div[@data-automation-label='Hire Employee > Rehire']")
    public WebElement Rehirereason;

    @FindBy(xpath = "(//label[@data-automation-id='formLabel'])[5]//following::input[1]")
    public WebElement jobprofileHireEmployee;

    @FindBy(xpath = "(//label[@data-automation-id='formLabel'])[6]//following::input[1]")
    public WebElement timetypeHireEmployee;

    @FindBy(xpath = "(//label[@data-automation-id='formLabel'])[7]//following::input[1]")
    public WebElement locationHireEmployee;

    @FindBy(xpath = "(//label[@data-automation-id='formLabel'])[9]//following::input[1]")
    public WebElement payRateHireEmployee;

    @FindBy(xpath = "//label[text()='Pay Rate Type']//following::button[@title='Submit']")
    public WebElement submitbtnHireEmployee;

    @FindBy(xpath = "//div[text()='Department']//following::div[@data-automation-id='actionImage'][1]")
    public WebElement departmentRehire;


    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_uic_doneButton' and @title='Done']")
    public WebElement donebtnHireEmployee;

    @FindBy(xpath = "(//*[@class='wd-icon-workday wd-icon'])[1]//following::*[@class='wd-icon-inbox-large wd-icon'][1]")
    public WebElement inboxWD;

    @FindBy(xpath = "//*[text()='Proposed IDs']//following::button[@data-automation-id='addRow'][1]")
    public WebElement addrowmailbox;

    @FindBy(xpath = "//button[@title='Approve']")
    public WebElement btnApprove;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Employee ID']//following::div[2]")
    public WebElement employeeID;

    // View Pre Hire names---------------------------------------
    @FindBy(xpath = "//*[@data-automation-id='promptOption' and @title='Pre-Hire Names']")
    public WebElement prehirenamesLink;

    @FindBy(xpath = "//label[text()='Pre-Hire']//following::*[@data-automation-id='promptIcon']")
    public WebElement prehirenamesTextbox;

    @FindBy(xpath = "//*[@data-automation-id='formLabel' and text()='Pre-Hire']//following::button[@title='OK']")
    public WebElement okbtnPreHireNames;

    @FindBy(xpath = "//*[@title='Pre-Hire Names'][1]")
    public WebElement tagPrehirenames;

    //Create Position ----------------------------------------------------------------------

    @FindBy(xpath = "(//*[@data-automation-id='promptOption'])[1]")
    public WebElement createPositionLink;

    @FindBy(xpath = "//*[@data-automation-id='formLabel']//following::input[1]")
    public WebElement nameOrganizations;//data-automation-id="promptIcon"

    @FindBy(xpath = "//*[@data-automation-id='promptIcon']")
    public WebElement nameOrganization;//data-automation-id="promptIcon"

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_okButton']")
    public WebElement clickOkButton;

    @FindBy(xpath = "//label[text()='Job Posting Title']//following::input[@data-automation-id='textInputBox']")
    public WebElement jobTitle;//*[@data-automation-id='textInputBox]

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Number of Positions']//following::input[@data-automation-id='numericInput']")
    public WebElement NumvofPositions;//*[@data-automation-id='textInputBox]

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Availability Date']//following::*[@data-automation-id='dateTimeWidget'][1]")
    public WebElement avldateCreatePositions;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Earliest Hire Date']//following::*[@data-automation-id='dateTimeWidget'][1]")
    public WebElement earliesthiredateCreatePosition;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='No Job Restrictions']//following::*[@data-automation-id='checkboxPanel'][1]")
    public WebElement jobRestrictionsCheckBox;

    @FindBy(xpath = "//Button[@title='Submit']")
    public WebElement submitbuttonCreatePosition;

    @FindBy(xpath = "//button[@title='Done']")
    public WebElement donebuttonCreatePosition;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Job Family']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement jobfamilyCreateposition;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Job Profile']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement jobprofileCreateposition;

    @FindBy(xpath = "//label[text()='Location']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement locationCreateposition;

    @FindBy(xpath = "//label[text()='Time Type']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement timetypeCreateposition;

    @FindBy(xpath = "//label[text()='Associate Type']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement workertypeCreateposition;

    @FindBy(xpath = "//label[text()='Time Type']")
    public WebElement lbltimetypeCreateposition;

    @FindBy(xpath = "//label[text()='Associate Type']")
    public WebElement labelworkertypeCreateposition;

    @FindBy(xpath = "//*[text()='Process Successfully Completed']")
    public WebElement validationCreateposition;

    @FindBy(xpath = "//label[text()='Associate Type']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement associateTypeeCreateposition;

    @FindBy(xpath = "//label[text()='Time Type']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement timetypeeCreateposition;

    @FindBy(xpath = "(//*[@data-automation-id='dateWidgetInputBox'])[1]")
    public WebElement avaibaleDate;

    @FindBy(xpath = "//*[@data-automation-id='inbox_row_title' and contains(text(),empname)]")
    public WebElement inboxMail;

    @FindBy(xpath = "//*[@data-automation-id='inbox_row_title' and contains(text(),empname)]//following::button[@title='Submit']")
    public WebElement inboxSubmit;

    @FindBy(xpath = "//*[@data-automation-id='inbox_row_title' and contains(text(),empname)]//following::input[1]")
    public WebElement countryEmail;

    @FindBy(xpath = "//*[@data-automation-id='inbox_row_title' and contains(text(),empname)]//following::input[2]")
    public WebElement SSNEmail;

    @FindBy(xpath = "//*[@data-automation-id='inbox_row_title' and contains(text(),empname)]//following::input[3]")
    public WebElement ssnNumber;

    //Workday View Hired employee----------------------------------------
    @FindBy(xpath = "//*[@data-automation-id='wd-SearchResultTitle']//preceding::*[@data-automation-id='menuItem'][1]")
    public WebElement allofworkdaylabel;

    @FindBy(xpath = "(//*[@data-automation-id='promptOption'])[1]")
    public WebElement empnameviewhire;

    // Workday Close Position-------------------------------------------------------------------------------------

    @FindBy(xpath = "//div[text()='Close Position']")
    public WebElement linkClosePosition;

    @FindBy(xpath = "//*[@data-automation-id='promptIcon']")
    public WebElement position;//label[text()='Position']//following::input[1]

    @FindBy(xpath = "//button[@title='OK']")
    public WebElement btnokClosePosition;

    @FindBy(xpath = "//label[text()='Close Reason']//following::input[1]")
    public WebElement reasonClosePosition;

    @FindBy(xpath = "//*[@data-automation-id='dateWidgetContainer']")
    public WebElement closedateClosePosition;

    @FindBy(xpath = "//*[@title='Submit']")
    public WebElement btnsubmitClosePosition;

    @FindBy(xpath = "//*[@title='Details and Process' and @data-automation-id='fieldSetLegendLabel']")
    public WebElement tabdetailsClosePosition;

    @FindBy(xpath = "//div[text()='The field Position is required and must have a value.']")
    public WebElement validationstepClosePosition;

    //----------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//*[@data-automation-id='searchBox']")
//    @FindBy(xpath = "//label[text()='Existing Pre-Hire']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement insidesearchboxcommon;

    @FindBy(xpath = "//Button[@title='Submit']")
    public WebElement submit;

    @FindBy(xpath = "//button[@title='To Do'][1]")
    public WebElement btnToDo;

    @FindBy(xpath = "//*[@data-automation-id='RELATED_TASK_charm']")
    public WebElement threedots;

    //Create Job requisition ---------------------------------------------------
    @FindBy(xpath = "//div[@title='Create Job Requisition']")
    public WebElement linkCreateJobReq;

    @FindBy(xpath = "//label[text()='Supervisory Organization']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement suporgCreateJobReq;

    @FindBy(xpath = "//label[text()='For Existing Position']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement positionCreateJobReq;

    @FindBy(xpath = "//label[text()='Create New Position']//preceding::*[1]")
    public WebElement createNewPositionCreateJobReq;

    @FindBy(xpath = "//div[@data-automation-id='selectWidget']")
    public WebElement workertypeCreateJobReq;

    @FindBy(xpath = "//*[@title='OK']")
    public WebElement btnokCreateJobReq;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Recruiting Details']")
    public WebElement editrecruitmentdetailsCreateJobReq;

    @FindBy(xpath = "//div[@data-automation-id='promptSearchButton']")
    public WebElement reasonCreateJobReq;

    @FindBy(xpath = "(//div[@data-automation-id='dateWidgetContainer'])[1]")
    public WebElement recruitstartdateCreateJobReq;

    @FindBy(xpath = "(//div[@data-automation-id='dateWidgetContainer'])[2]")
    public WebElement targethiredateCreateJobReq;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_next' and @title='Next']")
    public WebElement btnnxtCreateJobReq;//button[@data-automation-id='wd-CommandButton_next']

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

    @FindBy(xpath = "//label[text()='Company']//following::input[@data-automation-id='searchBox']")
    public WebElement companyCreateJobReq;

    @FindBy(xpath = "//div[@title='Edit Cost Center']")
    public WebElement editcostcenterCreateJobReq;

    @FindBy(xpath = "//label[text()='Cost Center']//following::input[@data-automation-id='searchBox']")
    public WebElement costcenterCreateJobReq;

    @FindBy(xpath = "//div[@title='Edit Other Row 1']")
    public WebElement deptEditProCompHire;

    @FindBy(xpath = "//div[text()='Department']//following::span[@data-automation-id='promptIcon']")
    public WebElement deptValEditProCompHire;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    public WebElement compValProCompHire;//span[@data-automation-id='promptIcon']

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement btnsubmitCreateJobReq;

    @FindBy(xpath = "//span[text()='View Details']")
    public WebElement viewdetailsCreateJobReq;

    @FindBy(xpath = "//*[text()='You have submitted']")
    public WebElement tag1validationCreateJobReq;

    @FindBy(xpath = "//button[@title='Done']")
    public WebElement btndoneCreateJobReq;

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

    @FindBy(xpath = "//div[@data-automation-id='promptSearchButton']")
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

    // Rehire
    @FindBy(xpath = "//*[@data-automation-id='dateTimeWidget']")
    public WebElement dateChangePersonalInfo;

    @FindBy(xpath = "//*[text()='Open']")
    public WebElement openProCompHire;

    @FindBy(xpath = "//span[@title='Approve']")
    public WebElement approveProCompHire;

    @FindBy(xpath = "//button[@title='Done']")
    public WebElement done;

    @FindBy(xpath = "(//div[@data-automation-id='relatedActionsItemLabel' and text()='Security Profile'])")
    public WebElement securityProfile;

    @FindBy(xpath = "//*[text()='Start Proxy']")
    public WebElement startProxyFromAssociateName;

    @FindBy(xpath = "//span[@title='OK']")
    public WebElement ok;

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_okButton']")
    public WebElement btnOKChangeJob;

    @FindBy(xpath = "//div[text()='Associate History']")
    public WebElement AssocHis;

    @FindBy(xpath = "//div[text()='View Associate History']")
    public WebElement viewAssocHis;

    @FindBy(xpath = "//div[text()='View Associate History by Category']")
    public WebElement viewAssocHisbyCat;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[text()='Process'][1]")
    public WebElement processRehire;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[2]")
    public WebElement overallStatusRehire;

    @FindBy(xpath = "//*[text()='Awaiting Action']")
    public WebElement statusRehire;

    @FindBy(xpath = "(//*[contains(@data-automation-id,'wd-InboxRow-')])[1]")
    public WebElement inboxrow;

    @FindBy(xpath = "//div[text()='Process']")
    public WebElement clickProcess;

    @FindBy(xpath = "//*[@data-automation-id='textView' and text()='Awaiting Action']//following::*[@data-automation-id='promptOption'][1]")
    public WebElement awaitingaprovername;

    //Rehire Onboarding

    @FindBy(xpath = "//*[@data-automation-id='globalSearchInput']//preceding::img//following::*[@class='wd-icon-inbox-large wd-icon'][1]")
    public WebElement inboxOnboarding;

    @FindBy(xpath = "//span[@title='Submit']")
    public WebElement submitOnboarding;

    @FindBy(xpath = "(//div[@data-automation-id='checkboxPanel'])[3]")
    public WebElement provinceCheckboxOnboarding;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement NoRadioOnboarding;

    @FindBy(xpath = "(//label[text()='Routing Number']//following::input[@data-automation-id='textInputBox'])[1]")
    public WebElement RoutingOnboarding;

    @FindBy(xpath = "//span[@data-automation-id='radioBtn'][1]")
    public WebElement actTypecheckingOnboarding;

    @FindBy(xpath = "//span[@data-automation-id='radioBtn'][1]")
    public WebElement actTypeSaveOnboarding;

    @FindBy(xpath = "//label[text()='Bank Name']//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement bankNameOnboarding;

    @FindBy(xpath = "//label[text()='Institution Number']//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement institutionNbrOnboarding;

    @FindBy(xpath = "//label[text()='Routing Transit Number']//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement routingTransitNbrOnboarding;

    @FindBy(xpath = "//label[text()='Bank Identification Code']//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement bankIdentificationCodeOnboarding;

    @FindBy(xpath = "//label[text()='Account Number']//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement actNbrOnboarding;

    @FindBy(xpath = "//label[text()='Branch ID']//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement branchIDOnboarding;

    @FindBy(xpath = "//span[@title='OK']")
    public WebElement okOnboarding;


    public WorkdayCommon getWorkdayCommonObj() {
        return workdaycommon;
    }


    public E2E_T170() throws IOException {
    }

//******************************BP Specific functions**********************************************

    public void createPosition(String SUPORG, String Location, String JobFamily, String JobProfile, String TimeType, String WorkerType, String AvailabilityDate, String EarliestHireDate) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.searchbySearchBox(Constants.SRCHBOXCREATEPOSITION);
        CreatePosname();
        WebActionsUtil.explicitWait(driver, createPositionLink, "click");
        createPositionLink.click();
        nameOrganization.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(SUPORG, Keys.ENTER);
        workdaycommon.userWait(2000);
        clickOkButton.click();
        workdaycommon.userWait(3500);
        jobTitle.clear();
        jobTitle.sendKeys("WD DATA 106-6", Keys.ENTER);
        workdaycommon.userWait(2000);
        NumvofPositions.clear();
        workdaycommon.userWait(2000);
        NumvofPositions.sendKeys(Constants.NUMBOFPOSITIONS, Keys.ENTER);
        workdaycommon.scrolltoElement(avldateCreatePositions);

        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date1 = simpleDateFormat.format(new Date());

        Calendar yesterday = Calendar.getInstance();
        yesterday.add(Calendar.DATE, -1);
        Date yestdate = yesterday.getTime();
        String yesterdaydate = simpleDateFormat.format(yestdate);

        //log.info(date1);
        if (driverWrapper.isElementPresent(avldateCreatePositions)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(AvailabilityDate);
                elem.sendKeys(Keys.TAB);
                elem.sendKeys(Keys.TAB);
            }
        }
        workdaycommon.userWait(3000);
        if (driverWrapper.isElementPresent(earliesthiredateCreatePosition)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[2]"))) {
                elem.sendKeys(EarliestHireDate);
                elem.sendKeys(Keys.TAB);
                elem.sendKeys(Keys.TAB);
            }
        }
        workdaycommon.userWait(3000);
        jobRestrictionsCheckBox.click();
        workdaycommon.userWait(2000);

         //uncomment when needed
//        jobfamilyCreateposition.click();
//        workdaycommon.userWait(1000);
//        insidesearchboxcommon.sendKeys(JobFamily, Keys.ENTER);
        workdaycommon.scrolltoElement(jobprofileCreateposition);
        workdaycommon.userWait(4000);
        jobprofileCreateposition.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(JobProfile, Keys.ENTER);
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(locationCreateposition);
        workdaycommon.userWait(3000);
        locationCreateposition.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Location, Keys.ENTER);
        workdaycommon.userWait(2000);
        log.info("Location selected......");
        workdaycommon.scrolltoElement(lbltimetypeCreateposition);
        lbltimetypeCreateposition.click();
        workdaycommon.userWait(1000);
        timetypeCreateposition.click();
        workdaycommon.userWait(2000);
        String Timetype1 = TimeType.trim();
        log.info("Timetype1---" + Timetype1);
        WebElement timetypeeValCreateposition = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'" + Timetype1 + "')]"));
        timetypeeValCreateposition.click();
        workdaycommon.userWait(2000);
        log.info("Time Type selected......");
        workdaycommon.scrolltoElement(associateTypeeCreateposition);
        labelworkertypeCreateposition.click();
        workdaycommon.userWait(1000);
        associateTypeeCreateposition.click();
        workdaycommon.userWait(1000);
        WebElement associateTypeeValCreateposition = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @data-automation-label='" + WorkerType + "']"));
        associateTypeeValCreateposition.click();
        workdaycommon.userWait(2000);
        log.info("WorkerType selected......");
        workdaycommon.userWait(7000);

        submitbuttonCreatePosition.click();
        WebActionsUtil.explicitWait(driver, validationCreateposition, "click");
        if (validationCreateposition.isDisplayed()) {
            test.pass("The requested position(s) is/are created successfully");
            donebuttonCreatePosition.click();
        } else
            test.fail("Failed while creating a position");

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


    public void CreateJobRequisition (String SUPORG,String JobProfile) {
        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
//            CreatePosname();
            log.info("The Position name is: "+Positionglobal);
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


            //createNewPositionCreateJobReq.click();
            workdaycommon.userWait(2000);

            // Select selectworkertype = new Select(workertypeCreateJobReq);
            // selectworkertype.selectByVisibleText("Contingent Worker");

            WebActionsUtil.explicitWait(driver,workertypeCreateJobReq,"click");
            workdaycommon.scrolltoElement(workertypeCreateJobReq);
            workertypeCreateJobReq.click();
            workdaycommon.userWait(1000);
            workertypeCreateJobReq.sendKeys(Constants.WORKERTYPEJOBREQHIREEMP);
            workdaycommon.userWait(2000);
            btnokCreateJobReq.click();
            workdaycommon.userWait(1000);

            editrecruitmentdetailsCreateJobReq.click();
            workdaycommon.userWait(1000);
            reasonCreateJobReq.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Constants.REASONJOBREQHIREEMP, Keys.ENTER);
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
                    elem.sendKeys(Constants.RECRUITSTARTDATEJOBREQHIREEMP);
                    elem.sendKeys(Keys.TAB);
                    elem.sendKeys(Keys.TAB);
                }
            }
            workdaycommon.userWait(2000);
            if (driverWrapper.isElementPresent(targethiredateCreateJobReq)) {
                for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[2]"))) {
                    elem.sendKeys(Constants.TARGETHIREDATEJOBREQHIREEMP);
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
            jobposttitleCreateJobReq.sendKeys("WD DATA 103-5:", Keys.ENTER);
            workdaycommon.userWait(2000);

            workdaycommon.scrolltoElement(jobprofileCreateJobReq);
            jobprofileCreateJobReq.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(JobProfile, Keys.ENTER);
            workdaycommon.userWait(2000);

            workdaycommon.scrolltoElement(workersubtypeCreateJobReq);
            workersubtypeCreateJobReq.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Constants.EMPSUBTYPEJOBREQHIREEMP, Keys.ENTER);
            workdaycommon.userWait(2000);

            workdaycommon.scrolltoElement(workertimetypeCreateJobReq);
            workertimetypeCreateJobReq.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Constants.TIMETYPEJOBREQHIREEMP, Keys.ENTER);
            workdaycommon.userWait(2000);

            workdaycommon.scrolltoElement(primaryLocationCreateJobReq);
            primaryLocationCreateJobReq.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Constants.PRIMARYLOCJOBREQHIREEMP, Keys.ENTER);
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
            btnnxtCreateJobReq.click();
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
            reqName=Reqname.toString();
            log.info("the Req name :" + reqName);

            workdaycommon.scrolltoElement(clickProcessCreateJobReq);
            clickProcessCreateJobReq.click();

            workdaycommon.userWait(2000);

            //uncomment when awaiting action is coming
//            workdaycommon.scrolltoElement(awaitingaprovernameCreateJobReq);
//            //Getting Approver name
//            StringBuilder aprovername = new StringBuilder(awaitingaprovernameCreateJobReq.getText());
//            log.info("Before replacing the Aprover name :" + aprovername);
//            aprovername.delete(aprovername.length() - 20, aprovername.length());
//            log.info("After replacing the Aprover name :" + aprovername);
//
//            //----------------Changed xpath to select three dots from second proxy person as the first person doesn't have start proxy in the actions
////            WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
//            WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]//following::img[2]"));
//            Threedots.click();
//            workdaycommon.scrolltoElement(securityProfile);
//            workdaycommon.mousemove(securityProfile,startProxyFromAssociateName);
//            workdaycommon.userWait(1000);
//            startProxyFromAssociateName.click();
//            btnOKChangeJob.click();
//            workdaycommon.userWait(3000);
//            log.info(".......Proxy successful.......");
//
//            workdaycommon.inboxWD.click();
//            workdaycommon.userWait(2000);
//            inboxrowCreateJobReq.click();
//            workdaycommon.scrolltoElement(inboxbtnapproveCreateJobReq);
//            inboxbtnapproveCreateJobReq.click();
//            workdaycommon.userWait(5000);
//            viewdetailsCreateJobReq.click();//clicking View details from Popup




//            if (validateCreateJobReq.isDisplayed()) {
            if (driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(@title,'Job Requisition: " + Reqname + "')]")).isDisplayed()) {
                test.pass("Job requisition created successfully for " + Positionglobal);
                log.info("Job requisition created successfully for " + Positionglobal);
//                    workdaycommon.scrolltoElement(inboxbtndoneCreateJobReq);
//                    inboxbtndoneCreateJobReq.click(); //uncomment when awaiting action is coming
                workdaycommon.gotoWorkdayHomepage();
            } else {
                test.pass("Failed creating Job requisition for " + Positionglobal);
                log.info("Failed creating Job requisition for " + Positionglobal);
            }
//            }
        } catch (Exception e) {
            test.fail("Exception/Issue Occured: " + e.getMessage());
            log.error("Exception/Issue Occured: " + e.getMessage());
        }
    }


    public void Re_HireAssociate(String empname ,String SUPORG, String RehireReason, String POSITION1, String RWorkerType, String JobProfile, String TimeType, String Location, String PayRateType ) throws Exception {

        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
            log.entry();
            log.info("Starting with Hire Employee-->" + empname);
            log.info("Propose Empname--->" + empname);
            workdaycommon.searchbySearchBox(Constants.SRCHHIREEMP);
            log.debug("Click on Hire Employee Link");
            hireemployeeLink.click();
            driverWrapper.waitForPageLoaded();
            log.info("Entering Supervisory Organization for hire employee........");
            WebActionsUtil.explicitWait(driver, suporgHireEmployee, "click");
            suporgHireEmployee.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(SUPORG, Keys.ENTER);
            workdaycommon.userWait(2000);

            WebElement clickSupOrg = driver.findElement(By.xpath("//label[text()='Supervisory Organization']//following::p[@data-automation-id='promptOption'][1]"));
            clickSupOrg.click();

            log.info("Entering Pre hire name........" + empname);
//            WebActionsUtil.explicitWait(driver, nameHireEmployee, "click");
            radioHireEmployee.click();
            workdaycommon.userWait(2000);
            nameHireEmployee.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(empname, Keys.ENTER);
            log.info("The employee name is : " + empname);
            workdaycommon.userWait(2000);
            okbuttonHireEmployee.click();
            workdaycommon.userWait(3000);
            log.info("Entering Hire employee details........");
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            String pattern = "MM/dd/YYYY";
            //for Future's date
            Calendar future = Calendar.getInstance();
            future.add(Calendar.DATE, -3);
            Date futuredate = future.getTime();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(futuredate);
            // log.info(date);
            if (driverWrapper.isElementPresent(hiredateHireEmployee)) {
                log.info("job details page");
                for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                    elem.sendKeys("12/15/2019");
                    elem.sendKeys(Keys.TAB);
//                    elem.sendKeys(Keys.TAB);
                }
            }
            JavascriptExecutor jst = (JavascriptExecutor) driver;
            insidesearchboxcommon.click();
            insidesearchboxcommon.sendKeys(RehireReason, Keys.ENTER);
            workdaycommon.userWait(2000);
//          Reasonhireemp.click();
            Rehirereason.click();
//            insidesearchboxcommon.sendKeys(Keys.TAB);
            workdaycommon.scrolltoElement(positionHireEmployee);
            jst.executeScript("arguments[0].click () ", positionHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(POSITION1, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clickposition = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + POSITION1 + "')]"));
            workdaycommon.scrolltoElement(clickposition);
            WebActionsUtil.explicitWait(driver, clickposition, "click");
//            clickposition.click();
            workdaycommon.scrolltoElement(associateTypeeCreateposition);
            associateTypeeCreateposition.click();
            workdaycommon.userWait(2000);
            insidesearchboxcommon.sendKeys("Regular Associate", Keys.ENTER);
            workdaycommon.scrolltoElement(submitbtnHireEmployee);
            WebActionsUtil.explicitWait(driver, submitbtnHireEmployee, "click");
            submitbtnHireEmployee.click();
            workdaycommon.userWait(4000);
//            workdaycommon.scroll();
            openProCompHire.click();
            workdaycommon.userWait(4000);

            workdaycommon.scroll();
            workdaycommon.userWait(1000);
            departmentRehire.click();
            workdaycommon.userWait(2000);
            deptValEditProCompHire.click();
            workdaycommon.userWait(2000);
            compValProCompHire.sendKeys(Constants.USADEPARTMENTHIREEMP, Keys.ENTER);
            workdaycommon.userWait(2000);
            submit.click();

//            workdaycommon.scrolltoElement(submit);
//            workdaycommon.userWait(2000);
            openProCompHire.click();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(approveProCompHire);
            approveProCompHire.click();
            workdaycommon.userWait(5000);
            openProCompHire.click();
            workdaycommon.userWait(2000);
//            workdaycommon.userWait(3000);
//            workdaycommon.scrolltoElement(submit);
            workdaycommon.userWait(2000);
            submit.click();
            workdaycommon.userWait(1000);
//            btnToDo.click();
//            workdaycommon.userWait(2000);
            workdaycommon.btnDone.click();
            log.info("Employee Re-Hired is Done");


//***************************Uncomment the below for canada ************************
//            log.info("Checking for Awaiting Action ");
//            workdaycommon.searchbySearchBox(empname);
//            workdaycommon.userWait(1000);
//            workdaycommon.allOfWorkday.click();
//            workdaycommon.userWait(1000);
//            WebElement Employeenamee = driver.findElement(By.xpath("//*[@data-automation-id='promptOption']//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption'][1]"));
//            Employeenamee.click();
//            workdaycommon.userWait(2000);
//            workdaycommon.clickAction.click();
//            workdaycommon.userWait(1000);
//            workdaycommon.mousemove(AssocHis, viewAssocHisbyCat);
//            workdaycommon.userWait(1000);
//            WebElement RehireEmployee = driver.findElement(By.xpath(" //div[contains(text(),'Rehire')]//preceding::div[text()='Successfully Completed']//preceding::div[text()='Hire: " + empname + "']"));
//            RehireEmployee.click();
//            workdaycommon.userWait(2000);
//            workdaycommon.scrolltoElement(clickProcess);
//            clickProcess.click();
//            workdaycommon.userWait(2000);
//            workdaycommon.scrolltoElement(awaitingaprovername);
//
////Getting Approver name
//            StringBuilder aprovername = new StringBuilder(awaitingaprovername.getText());
//            log.info("Before replacing the Aprover name :" + aprovername);
//            aprovername.delete(aprovername.length() - 20, aprovername.length());
//            log.info("After replacing the Aprover name :" + aprovername);
//
//            WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
//            Threedots.click();
//            workdaycommon.scrolltoElement(securityProfile);
//            workdaycommon.mousemove(securityProfile, startProxyFromAssociateName);
//            workdaycommon.userWait(1000);
//            startProxyFromAssociateName.click();
//            btnOKChangeJob.click();
//            workdaycommon.userWait(3000);
//            log.info(".......Proxy successful.......");
//
//            workdaycommon.inboxWD.click();
//            workdaycommon.userWait(2000);
//            inboxrow.click();
//            workdaycommon.userWait(1000);
//            workdaycommon.scrolltoElement(submit);
//            submit.click();
//            log.info("Awaiting action is Submitted Successfully");
//
//            log.info("Checking for Awaiting Action and Status....");
//            workdaycommon.searchbySearchBox(empname);
//            workdaycommon.userWait(1000);
//            workdaycommon.allOfWorkday.click();
//            workdaycommon.userWait(1000);
//            WebElement Employeename = driver.findElement(By.xpath("//*[@data-automation-id='promptOption']//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption'][1]"));
//            Employeename.click();
//            workdaycommon.userWait(2000);
//            workdaycommon.clickAction.click();
//            workdaycommon.userWait(1000);
//            workdaycommon.mousemove(AssocHis, viewAssocHis);
//            workdaycommon.userWait(1000);
//            driver.findElement(By.xpath("//div[@title='Hire: " + empname + "']")).click();
//            workdaycommon.userWait(2000);
//            processRehire.click();
//            workdaycommon.userWait(5000);
//            workdaycommon.scroll();
//            String overallStatus = overallStatusRehire.getText();
//            log.info("---------Final OverallStatus------>" + overallStatus);
//            workdaycommon.userWait(1000);
//            workdaycommon.scroll();
//            //  workdaycommon.setEmployeename(empname1);
//            log.info("Setting Employee name---->" + empname);
//            if (overallStatus.equals("Successfully Completed")) {
//                try {
//                    if (statusRehire.isDisplayed()) {
//                        log.info(" Re-Hired Process not Completed Successfully :" + overallStatus);
//                        test.fail(" Re-Hired Process not Completed Successfully :" + overallStatus);
//                    }
//                } catch (Exception e) {
//                    test.pass(" Re-Hired Process Completed Successfully : " + empname);
//                    log.info(" Re-Hired Process Completed Successfully: " + empname);
//                }
//            } else {
//                log.info("The Overall process is not completed.......Current Status: " + overallStatus);
//                test.fail("The Overall process is not completed.......Current Status: " + overallStatus);
//            }
//
//        } catch (Exception e) {
//            log.error("Exception/Issue occurred:" + e.getMessage());
//            test.fail(e.getMessage());
//        }
//    }
//********************************************************************************************************************


            log.info("Checking for Awaiting Action and Status....");
            workdaycommon.searchbySearchBox(empname);
            workdaycommon.userWait(1000);
            workdaycommon.allOfWorkday.click();
            workdaycommon.userWait(1000);
            WebElement Employeenamee = driver.findElement(By.xpath("//*[@data-automation-id='promptOption']//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption'][1]"));
            Employeenamee.click();
            workdaycommon.userWait(2000);
            workdaycommon.clickAction.click();
            workdaycommon.userWait(1000);
            workdaycommon.mousemove(AssocHis, viewAssocHisbyCat);
            workdaycommon.userWait(1000);
            WebElement RehireEmployee = driver.findElement(By.xpath(" //div[contains(text(),'Rehire')]//preceding::div[text()='Successfully Completed']//preceding::div[text()='Hire: " + empname + "']"));
            RehireEmployee.click();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(clickProcess);
            clickProcess.click();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(awaitingaprovername);

//Getting Approver name
            StringBuilder aprovername = new StringBuilder(awaitingaprovername.getText());
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
            inboxrow.click();
            workdaycommon.userWait(1000);
            workdaycommon.scrolltoElement(submit);
            submit.click();
            log.info("Awaiting action is Submitted Successfully");


            //Re-Hire Onboarding
            workdaycommon.StartProxy_employee(empname);
            workdaycommon.userWait(2000);
            log.info(".......Proxy successful.......");
            log.info("...Onboarding is started.....");
            workdaycommon.userWait(4000);
            workdaycommon.gotoWorkdayHomepage();
            workdaycommon.userWait(3000);
            inboxOnboarding.click();
            workdaycommon.userWait(2000);
            log.info("Mail Approval for US Region.....");
            LocalHolding();
            PersonalInformation();
            changePhoto();
            provinceHolding();
            completeFederal();
            changeEmergencyContact();
            disabilitySelfIden();
            USpaymentElection();
            log.info("Mail Approval Completed.....");
        } catch (Exception e) {
            log.info("Running in Onboarding Catch Block.........");
            workdaycommon.gotoWorkdayHomepage();
            AwaitingAction_Onboarding(empname);
        }
    }
            public void AwaitingAction_Onboarding (String empname) throws Exception {
                log.info("AwaitingAction_Onboarding Starts....");
                workdaycommon.setDriver(driverWrapper);
                workdaycommon.setExtentTest(test);
                workdaycommon.searchbySearchBox(empname);
                workdaycommon.userWait(9000);
                workdaycommon.allOfWorkday.click();
                workdaycommon.userWait(9000);
                WebElement Employename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Hire: " + empname + "')]"));
                workdaycommon.userWait(3000);
                workdaycommon.scrolltoElement(Employename);
                workdaycommon.userWait(1000);
                Employename.click();
                workdaycommon.userWait(1000);
                workdaycommon.clickAction.click();
                workdaycommon.userWait(1000);
                workdaycommon.mousemove(AssocHis, viewAssocHisbyCat);
                workdaycommon.userWait(1000);
                WebElement RehireEmploye = driver.findElement(By.xpath(" //div[contains(text(),'Rehire')]//preceding::div[text()='Successfully Completed']//preceding::div[text()='Hire: " + empname + "']"));
                RehireEmploye.click();
                workdaycommon.userWait(2000);
                processRehire.click();
                workdaycommon.userWait(2000);
                workdaycommon.scroll();
                String overallStatus = overallStatusRehire.getText();
                log.info("---------overallStatus------>" + overallStatus);
                workdaycommon.userWait(1000);
                workdaycommon.scroll();
                if (overallStatus.equals("Successfully Completed")) {
                    try {
                        if (statusRehire.isDisplayed()) {
                            log.info(" Re-Hire Process not Completed Successfully :" + overallStatus);
                            test.fail(" Re-Hire Process not Completed Successfully :" + overallStatus);
                        }
                    } catch (Exception e) {
                        test.pass(" Re-Hire Process Completed Successfully : " + empname);
                        log.info(" Re-Hire Process Completed Successfully: " + empname);
                    }
                } else {
                    log.info("The Overall process is not completed.......Current Status: " + overallStatus);
                    test.fail("The Overall process is not completed.......Current Status: " + overallStatus);
                }

            }



    public void LocalHolding() throws Exception {

        try {
            log.info("Inbox 6 : Checking for Province Holding mail Box......");
            workdaycommon.userWait(2000);
            WebElement inboxProvince = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Complete State and Local Withholding Elections')]"));
            workdaycommon.scrolltoElement(inboxProvince);
            inboxProvince.click();
            workdaycommon.userWait(2000);

            workdaycommon.scrolltoElement(submitOnboarding);
            workdaycommon.userWait(2000);
            submitOnboarding.click();

        } catch (Exception e1) {
            log.info("Inbox5 : Province Holding..in Mail Box... is not available");
        }
    }

    public void PersonalInformation() throws Exception {
        try {
            log.info("Checking for personal Information mail Box......");
            workdaycommon.userWait(2000);
            WebElement inboxPersonalInfo = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Personal Information:')]"));
            workdaycommon.scrolltoElement(inboxPersonalInfo);
            inboxPersonalInfo.click();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(submitOnboarding);
            workdaycommon.userWait(2000);
            submitOnboarding.click();
        } catch (Exception e1) {
            log.info("Inbox1 : personal Information is not available");
        }
    }

    public void changePhoto() throws Exception {


        try {
            log.info("Inbox 5 :Change My Photo..in Mail Box.....");
            workdaycommon.userWait(2000);
            WebElement ChangePhoto = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Change My Photo')]"));
            workdaycommon.scrolltoElement(ChangePhoto);
            ChangePhoto.click();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(submitOnboarding);
            submitOnboarding.click();
            workdaycommon.userWait(3000);
        } catch (Exception e1) {
            log.info("Inbox5 : Change My Photo..in Mail Box... is not available");
        }
    }

    public void provinceHolding() throws Exception {

        try {
            log.info("Inbox 6 : Checking for Province Holding mail Box......");
            workdaycommon.userWait(2000);
            WebElement inboxProvince = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Complete Province Withholding Elections')]"));
//            WebElement inboxProvince = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Province Tax Election For Onboarding')]"));
            workdaycommon.scrolltoElement(inboxProvince);
            inboxProvince.click();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(provinceCheckboxOnboarding);
            workdaycommon.userWait(4000);
            provinceCheckboxOnboarding.click();
            workdaycommon.userWait(3000);
            submitOnboarding.click();
            workdaycommon.userWait(3000);
        } catch (Exception e1) {
            log.info("Inbox5 : Province Holding..in Mail Box... is not available");
        }
    }

    public void completeFederal() throws Exception {
        try {
            log.info("Inbox 7 :Checking for complete federal mail Box......");
            workdaycommon.userWait(2000);
            WebElement inboxfederal = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Complete Federal withholding elections')]"));
//            WebElement inboxfederal = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Federal Tax Election For Onboarding')]"));
            workdaycommon.scrolltoElement(inboxfederal);
            inboxfederal.click();
            workdaycommon.userWait(2000);
            submitOnboarding.click();
            workdaycommon.userWait(3000);
        } catch (Exception e1) {
            log.info("Inbox7: complete federal in Mail Box... is not available");
        }
    }

    public void changeEmergencyContact() throws Exception {


        try {
            log.info("Inbox 3 : Change Emergency Contact mail Box....");
            WebElement inboxEmergencyContact = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Change Emergency Contacts')]"));
            workdaycommon.scrolltoElement(inboxEmergencyContact);
            inboxEmergencyContact.click();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(submitOnboarding);
            submitOnboarding.click();
            workdaycommon.userWait(3000);
        } catch (Exception e1) {
            log.info("Inbox3 : Change Emergency Contact mail Box is not available");
        }
    }

    public void disabilitySelfIden() throws Exception {
        try {


            log.info("disabilitySelfIden started....");
            workdaycommon.userWait(2000);
            WebElement inboxdisability = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Disability Self-Identification')]"));
            workdaycommon.scrolltoElement(inboxdisability);
            inboxdisability.click();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(NoRadioOnboarding);
            NoRadioOnboarding.click();
            workdaycommon.userWait(2000);
            submitOnboarding.click();
            workdaycommon.userWait(4000);

        } catch (Exception e) {
            log.info("disabilitySelfIden is not available");
        }
    }

    public void USpaymentElection() throws Exception {
        try {
            log.info("Inbox 4: USpaymentElection Election mail Box.........");
            workdaycommon.userWait(2000);
            WebElement PaymentElectionContact = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Payment Election Enrollment Event')]"));
            workdaycommon.scrolltoElement(PaymentElectionContact);
            PaymentElectionContact.click();
            log.info("Clicked on PaymentElectionContact.....");
            workdaycommon.userWait(4000);
            workdaycommon.scrolltoElement(actTypecheckingOnboarding);
            workdaycommon.userWait(2000);
            actTypecheckingOnboarding.click();
            workdaycommon.userWait(2000);
            log.info("Clicked on PaymentElectionContact.....");
            workdaycommon.scrolltoElement(bankNameOnboarding);
            bankNameOnboarding.sendKeys(Constants.USABANKNAMEONB);
            workdaycommon.userWait(2000);
            log.info("Clicked on PaymentElectionContact.....");
            //  workdaycommon.scrolltoElement(institutionNbrOnboarding);
            workdaycommon.scrolltoElement(RoutingOnboarding);
            RoutingOnboarding.sendKeys(Constants.USABANKINSTNNUMBONB);
            workdaycommon.userWait(2000);

            log.info("Clicked on PaymentElectionContact.....");
            workdaycommon.scrolltoElement(actNbrOnboarding);
            actNbrOnboarding.sendKeys(Constants.USABANKACCNUMBERONB);
            workdaycommon.userWait(2000);
            log.info("Clicked on PaymentElectionContact.....");
//              workdaycommon.scrolltoElement(branchIDOnboarding);
//              branchIDOnboarding.sendKeys(Constants.USBANKBRANCHIDONB);
            workdaycommon.userWait(2000);
            okOnboarding.click();
            log.info("Clicked on PaymentElectionContact.....");
            workdaycommon.userWait(9000);
            submitOnboarding.click();
            workdaycommon.userWait(9000);
        } catch (Exception e1) {
            log.info("Inbox4 : Payment Election mail Box is not available");
        }
    }


//            Rehire_employeeCheck(empname);
//            try {
//                workdaycommon.scrolltoElement(workdaycommon.labelawaitingaction);
//                while (workdaycommon.labelawaitingaction.isDisplayed()) {
//                    workdaycommon.scrolltoElement(workdaycommon.labelawaitingaction);
////                ---Added New line of code to click on the three dots---
//                    WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
//                    Threedots.click();
//                    workdaycommon.scrolltoElement(securityProfile);
//                    workdaycommon.mousemove(securityProfile,startProxyFromAssociateName);
//                    workdaycommon.userWait(1000);
//                    startProxyFromAssociateName.click();
//                    btnOKChangeJob.click();
//                    workdaycommon.userWait(3000);
//                    log.info(".......Proxy successful.......");
////            -------------------End of code to add click on three dots---
//
//                    workdaycommon.inboxOperation(empname);
//                    workdaycommon.userWait(3000);
//                    submit.click();
//                    workdaycommon.userWait(3000);
//                    log.info("Approval/Submit completed Successfully.......");
////                    Rehire_employeeCheck(empname);
//
//                }
//            } catch (NoSuchElementException e) {
//                log.info("Running in Catch Block.........No Awaiting Action is Present");
//                test.info("No Awaiting Action is Present");
//                Rehire_Validation();
//
//            }
//
//        } catch (Exception e) {
//            log.error("Exception/Issue occurred:" + e.getMessage());
//            test.fail(e.getMessage());
//        }
//    }


//    public void Rehire_employeeCheck(String Empname) throws Exception {
//        workdaycommon.setDriver(driverWrapper);
//        workdaycommon.setExtentTest(test);
//        workdaycommon.gotoWorkdayHomepage();
//        workdaycommon.searchbySearchBox(Empname);
//        workdaycommon.userWait(3000);
//        allOfWorkdayTerminate.click();
//        workdaycommon.userWait(3000);
//        WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Hire: " + Empname));
//        workdaycommon.userWait(3000);
//        workdaycommon.scrolltoElement(Employeename);
//        workdaycommon.userWait(2000);
//        Employeename.click();
//        workdaycommon.scrolltoElement(processTabTerminate);
//        workdaycommon.userWait(1000);
//        processTabTerminate.click();
//        workdaycommon.userWait(1000);
//        workdaycommon.scroll();
//
//    }

    //    public void Rehire_Validation() {
//        String overallStatus = overallStatusTerminate.getText();
//        log.info("---------overallStatusTerminate------>" + overallStatus);
//        if (overallStatus.equals("Successfully Completed")) {
//            try {
//                if (statusTerminate.isDisplayed()) {
//                    log.info("Rehire not Completed Successfully........");
//                    test.fail("Rehire not Completed Successfully........");
//                }
//            } catch (Exception e) {
//                test.pass("Rehire Completed Successfully");
//                log.info("Rehire Completed Successfully........");
//            }
//        } else {
//            log.info("Rehire not Completed Successfully........Current Status: " + overallStatus);
//            test.fail("Rehire not Completed Successfully.......Current Status: " + overallStatus);
//        }
//    }
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
            workdaycommon.userWait(1000);
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
        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.searchbySearchBox(Empname);
        workdaycommon.userWait(3000);
        allOfWorkdayTerminate.click();
        workdaycommon.userWait(3000);
        WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Terminate: " + Empname + " (Terminated)']"));
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(Employeename);
        workdaycommon.userWait(2000);
        Employeename.click();
        workdaycommon.scrolltoElement(processTabTerminate);
        workdaycommon.userWait(1000);
        processTabTerminate.click();
        workdaycommon.userWait(1000);
        workdaycommon.scroll();

    }

    public void Terminate_Validation() {
        String overallStatus = overallStatusTerminate.getText();
        log.info("---------overallStatusTerminate------>" + overallStatus);
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (statusTerminate.isDisplayed()) {
                    log.info("Termination not Completed Successfully........");
                    test.fail("Termination not Completed Successfully........");
                }
            } catch (Exception e) {
                test.pass("Termination Completed Successfully");
                log.info("Termination Completed Successfully........");
            }
        } else {
            log.info("Termination not Completed Successfully........Current Status: " + overallStatus);
            test.fail("Termination not Completed Successfully.......Current Status: " + overallStatus);
        }
    }


}
