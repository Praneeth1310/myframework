package com.thd.Trash;

import com.thd.base.BasePage;
import com.thd.base.Constants.Constants;
import com.thd.common.utils.Excelutil;
import com.thd.common.utils.PageActionsUtil;
import com.thd.common.utils.WebActionsUtil;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

//import java.util.concurrent.TimeUnit;

public class HirefunctionalityPage_testdatacreator extends BasePage {
    private static final Logger log = LogManager.getLogger(HirefunctionalityPage_testdatacreator.class);
    WorkdayCommon workdaycommon = new WorkdayCommon();
    String dir = System.getProperty("user.dir");
    String replaceString = dir.replace("\\", "\\\\");
    FileInputStream fis = new FileInputStream(replaceString + "\\src\\test\\resources\\Testdata.xls");
    Excelutil util = new Excelutil();
    HSSFWorkbook wb = new HSSFWorkbook(fis);
    String LNAMECREATEPREHIRE1;
    String FNAMECREATEPREHIRE1;
    String SSNNO = util.SSNGenerator();
    HSSFSheet sheet = wb.getSheet("NameGenerator");
    int max=99999;
    int min=10000;


//************************WebElements************************************************

    // Create Pre-hire functionality  -----------------------------------------

    // Add address-------------------------------------
//    @FindBy(xpath = "//div[text()='Address']//following::button[@data-automation-id='panelSetAddButton'][1]")
    @FindBy(xpath = "//h2[text()='Address']//following::button[@data-automation-id='panelSetAddButton'][1]")
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

    @FindBy(xpath = "//label[text()='State'][1]//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement homestatePreHire;

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

    @FindBy(xpath = "//label[text()='Existing Pre-Hire']")
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

    //@FindBy(xpath = "(//label[@data-automation-id='formLabel'])[4]//following::input[1]")  //label[@data-automation-id='formLabel' and text()='Associate Type']//following::input[1]
    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Associate Type']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement empTypeHireEmployee;

    //@FindBy(xpath = "(//label[@data-automation-id='formLabel'])[5]//following::input[1]")
    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Job Profile']//following::input[1]")
    public WebElement jobprofileHireEmployee;

    //@FindBy(xpath = "(//label[@data-automation-id='formLabel'])[6]//following::input[1]")
    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Time Type']//following::input[1]")
    public WebElement timetypeHireEmployee;

    //@FindBy(xpath = "(//label[@data-automation-id='formLabel'])[7]//following::input[1]")
    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Location']//following::input[1]")
    public WebElement locationHireEmployee;

    @FindBy(xpath = "//*[@data-automation-id='formLabel' and text()='Pay Rate Type']//following::*[@data-automation-id='icon'][4]")
    public WebElement payRateHireEmployee;

    @FindBy(xpath = "//*[@data-automation-id='promptOption' and text()='All']")
    public WebElement payratetype_All;//

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and text()='Hourly']")
    public WebElement payratetype_Hourly;

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and text()='Salary']")
    public WebElement payratetype_Salary;

    @FindBy(xpath = "//label[text()='Pay Rate Type']//following::button[@title='Submit']")
    public WebElement submitbtnHireEmployee;

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


    @FindBy(xpath = "(//label[text()='Time Type']//following::*[@data-automation-id='icon'])[2]")
    public WebElement timetypeeCreateposition;

    @FindBy(xpath = "(//label[text()='Associate Type']//following::*[@data-automation-id='icon'])[4]")
    public WebElement associateTypeeCreateposition;


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
    public WebElement insidesearchboxcommon;


    //xpath------Home Contact Change---------

    @FindBy(xpath = "//div[text()='Personal Data']")
    public WebElement PersonalDateHCC;

    @FindBy(xpath = "//div[text()='Change My Home Contact Information']")
    public WebElement ChangeMyAddrHCC;

    @FindBy(xpath = "//div[@title='Edit Address']")
    public WebElement EditAddrHCC;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Effective Date']//following::*[@data-automation-id='dateTimeWidget'][1]")
    public WebElement avldateHCC;

    @FindBy(xpath = "(//label[text()='Address Line 1']//following::input[@data-automation-id='textInputBox'])[1]")
    public WebElement AddrLine1HCC;

    @FindBy(xpath = "(//label[text()='City']//following::input[@data-automation-id='textInputBox'])[1]")
    public WebElement cityHCC;

    @FindBy(xpath = "(//label[text()='Postal Code']//following::input[@data-automation-id='textInputBox'])[1]")
    public WebElement PostalHCC;

    @FindBy(xpath = "//label[text()='Province or Territory']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement ProvinceHCC;

    @FindBy(xpath = "//span[@title='Submit']")
    public WebElement SubmitHCC;

    @FindBy(xpath = " //span[@title='To Do']")
    public WebElement ToBeHCC;

    //change job -------------------------------------------------------------------------

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

    @FindBy(xpath = "//div[text()='When do you want this change to take effect?']//following::div[@data-automation-id='dateWidgetContainer'][1]")
    public WebElement dateToChangeEffect;

    @FindBy(xpath = "//div[text()='Why are you making this change?']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement makechangeChangeJob;


    @FindBy(xpath = "//div[text()='Which team will this person be on after this change?']//following::span[@data-automation-id='promptIcon'][1]")
    // @FindBy(xpath = "//div[text()='Which team will this person be on after this change?']//following::input[@data-automation-id='searchBox'][1]")
    public WebElement teamchangeChangeJob;

    @FindBy(xpath = "//div[text()='Which team will this person be on after this change?']//following::input[@data-automation-id='searchBox'][1]")
    public WebElement enterteamChangeJob;


    @FindBy(xpath = "//div[text()='Where will this person be located after this change?']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement changelocationChangeJob;

    @FindBy(xpath = "//div[text()='Where will this person be located after this change?']//following::input[@data-automation-id='searchBox'][1]")
    public WebElement enterlocationChangeJob;

    @FindBy(xpath = "//button[@title='Start']")
    public WebElement btnstartChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Position']")
    public WebElement editpositionChangeJob;

    @FindBy(xpath = "//label[text()='Position']//following::input[@data-automation-id='searchBox'][1]")
    public WebElement enterpositionChangeJob;

    @FindBy(xpath = "//label[text()='Close the current position?']//following::div[@data-automation-id='checkbox']")
    public WebElement closeposChangeJob;


    // @FindBy(xpath = "//*[@aria-label='Edit Job Profile']") //old one
    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Job Profile']")
    public WebElement editjobprofileChangeJob;

    @FindBy(xpath = "//label[text()='Job Profile']//following::input[@data-automation-id='searchBox'][1]")
    public WebElement enterjobprofileChangeJob;

    @FindBy(xpath = "//button[@title='Next' and @data-automation-id='wd-CommandButton_next']")
    public WebElement btnnextChangeJob;

    @FindBy(xpath = "//label[text()='Location']//following::input[@data-automation-id='searchBox'][1]")
    public WebElement locationdetailsChangeJob;//*[@data-automation-id='formLabel']//following::input[1]

    @FindBy(xpath = "//h4[text()='Location Details']//following::div[@data-automation-id='actionImage' and @title='Edit Location Details']")
    public WebElement editlocationdetailsChangeJob;


    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Company']")
    public WebElement editCompanyChangeJob;

    @FindBy(xpath = "//label[text()='Company']//following::input[@data-automation-id='searchBox'][1]")
    public WebElement enterCompanyChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Cost Center']")
    public WebElement editCostcenterChangeJob;

    @FindBy(xpath = "//label[text()='Cost Center']//following::input[@data-automation-id='searchBox'][1]")
    public WebElement enterCostcenterChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Business Unit']")
    public WebElement editBusinessUnitChangeJob;

    @FindBy(xpath = "//label[text()='Business Unit']//following::input[@data-automation-id='searchBox'][1]")
    public WebElement enterBusinessUnitChangeJob;


    @FindBy(xpath = "//div[text()='Department']//following::div[@data-automation-id='actionImage' and contains(@title,'Edit Other Row')][1]")
    public WebElement editDepartmentChangeJob;

    //  @FindBy(xpath = "//div[text()='Department']//following::div[@data-automation-id='promptSearchButton'][1]")
    @FindBy(xpath = "//div[text()='Department']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement DepartmentChangeJob;//div[text()='Department']//following::span[@data-automation-id='promptIcon'][1]


    @FindBy(xpath = "//div[text()='Department']//following::input[@data-automation-id='searchBox'][1]")
    public WebElement enterDepartmentChangeJob;


    @FindBy(xpath = "//div[@data-automation-id='actionImage']")
    public WebElement editadmindetailsChangeJob;

    @FindBy(xpath = "//label[text()='Associate Type']//following::input[1]")
    public WebElement employeetypeChangeJob;

    @FindBy(xpath = "//label[text()='Time Type']//following::input[1]")
    public WebElement timetypeChangeJob;


    @FindBy(xpath = "//h4[text()='Salary']")
    public WebElement headerSalaryChangeJob;

    @FindBy(xpath = "//h4[text()='Hourly']")
    public WebElement headerHourlyChangeJob;

    @FindBy(xpath = "//h4[text()='Salary']//following::div[@title='Edit Salary']")
    public WebElement editsalaryChangeJob;

    @FindBy(xpath = "//label[text()='Amount']//following::input[@data-automation-id='numericInput'][1]")
    public WebElement amountChangeJob;

    @FindBy(xpath = "//label[text()='Currency']//following::input[1]")
    public WebElement currencyChangeJob;

    @FindBy(xpath = "//label[text()='Frequency']//following::input[1]")
    public WebElement frequencyChangeJob;


    @FindBy(xpath = "//h4[text()='Hourly']//following::div[contains(@title,'Edit Hourly') and @data-automation-id='actionImage']")
    public WebElement edithourlyChangeJob;


    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement btnsubmitChangeJob;


    //span[text()='Details and Process']

    @FindBy(xpath = "//button[@title='Done']")
    public WebElement btndoneChangeJob;

    @FindBy(xpath = "//span[text()='Details and Process']")
    public WebElement linkdetailsChangeJob;

    @FindBy(xpath = "//div[text()='Process'][1]")
    public WebElement processTabChangeJob;


    @FindBy(xpath = "//label[text()='Overall Process']//following::*[@data-automation-id='promptOption']")
    public WebElement validationstepChangeJob;

    //JOB Change common--------------------
    @FindBy(xpath = "//label[text()='All of Workday']")
    public WebElement allOfWorkday;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[text()='Process'][1]")
    public WebElement processtabJobChange;

    @FindBy(xpath = " //span[@title='Done']")
    public WebElement btndoneJC;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[2]")
    public WebElement overallStatusJobChange;

    @FindBy(xpath = "//*[text()='Awaiting Action']")
    public WebElement checkAwaitingAction;

//Job Change for Location-----------------------------------------------------------------------------------------------------

// Job Location----------------------------------------

    @FindBy(xpath = "//div[text()='Job Change']")
    public WebElement JobchangeLocChangeJob;

    @FindBy(xpath = "//div[text()='Change Location']")
    public WebElement LocationChangeJob;

    @FindBy(xpath = "//label[text()='I certify that the information provided in this return is accurate and complete.']//following::div[@data-automation-id='checkboxPanel']")
    public WebElement CertifyCheckbox;

    // Propose Compensation Hire-----------------------------------
    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    public WebElement compValProCompHire;

    @FindBy(xpath = "//div[@title='Edit Business Unit']")
    public WebElement bUEditProCompHire;

    @FindBy(xpath = "//div[@title='Edit Other Row 1']")
    public WebElement deptEditProCompHire;

    @FindBy(xpath = "(//div[@data-automation-id='icon'])[5]")
    public WebElement deptValEditProCompHire;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[2]")
    public WebElement overallStatusProCompHire;

    @FindBy(xpath = "//*[text()='Awaiting Action']")
    public WebElement statusProCompHire;

    @FindBy(xpath = "//div[@title='Edit Cost Center']")
    public WebElement costEditProCompHire;

    @FindBy(xpath = "//div[@title='Edit Company']")
    public WebElement compEditProCompHire;

    @FindBy(xpath = "//*[text()='Open']")
    public WebElement openProCompHire;

    @FindBy(xpath = "//span[@title='Open']")
    public WebElement openbutProCompHire;


    @FindBy(xpath = "//div[@data-automation-id='popUpDialog']")
    public WebElement helpAvaiProCompHire;

    @FindBy(xpath = "//div[@data-automation-id='closeButton']")
    public WebElement helpcloseProCompHire;


    @FindBy(xpath = "//span[@data-automation-id='inbox_toggle_button']")
    public WebElement inboxMaxProCompHire;

    @FindBy(xpath = "//div[@title='Edit Salary']")
    public WebElement editSalaryProCompHire;

    @FindBy(xpath = " //div[@title='Edit Hourly']")
    public WebElement edithourProCompHire;


    @FindBy(xpath = "//input[@data-automation-id='numericInput']")
    public WebElement amountProCompHire;

    @FindBy(xpath = "//span[@title='Submit']")
    public WebElement submitProCompHire;

    @FindBy(xpath = "//span[text()='Country']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement countryClickProCompHire;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    public WebElement countryProCompHire;

    @FindBy(xpath = "//span[text()='National ID Type']//following::span[@data-automation-id='promptIcon'][2]")
    public WebElement nationalIDProCompHire;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    public WebElement nationalValIDProCompHire;

    @FindBy(xpath = "//span[text()='Add/Edit ID']//following::input[@data-automation-id='textInputBox']")
    public WebElement addEditIDProCompHire;

    @FindBy(xpath = "//span[@title='Approve']")
    public WebElement approveProCompHire;

    @FindBy(xpath = " //span[@title='Done']")
    public WebElement doneProCompHire;

    @FindBy(xpath = "//div[text()='Associate History']")
    public WebElement workerHisProCompHire;

    @FindBy(xpath = "//div[text()='View Associate History']")
    public WebElement viewWorkerHisProCompHire;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[text()='Process'][1]")
    public WebElement processProCompHire;

    @FindBy(xpath = "//div[text()='Awaiting Action']//following::div[@data-automation-id='promptOption']")
    public WebElement awaitingActProCompHire;

    @FindBy(xpath = "//label[text()='All of Workday']")
    public WebElement allOfWorkdayProCompHire;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    public WebElement countryTxtProCompHire;

    @FindBy(xpath = "//label[text()='Country']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement countryoptsrchProCompHire;

    @FindBy(xpath = "//div[text()='Security Profile']")
    public WebElement securityprofileActions;

    @FindBy(xpath = "//div[text()='Start Proxy']")
    public WebElement startproxyActions;

    //Onboarding -----------------------------------------------------------


    @FindBy(xpath = "//label[text()='Proposed Pay Group']//following::*[@data-automation-id='icon'][4]")
    public WebElement payGrpPromtOnboarding;

    @FindBy(xpath = "//*[@data-automation-id='globalSearchInput']//preceding::img//following::*[@class='wd-icon-inbox-large wd-icon'][1]")
    public WebElement inboxOnboarding;

    @FindBy(xpath = "//div[@title='Edit Gender']")
    public WebElement editGenderOnboarding;

    @FindBy(xpath = "//div[@data-automation-id='selectSelectedOption']")
    public WebElement genderOptionOnboarding;

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and @title='Male']")
    public WebElement genderValOnboarding;

    @FindBy(xpath = "//div[@title='Edit Date of Birth']")
    public WebElement editDOBOnboarding;

    @FindBy(xpath = "//span[@title='Submit']")
    public WebElement submitOnboarding;

    @FindBy(xpath = "//div[@title='Edit Legal Name']")
    public WebElement legalEditOnboarding;

    @FindBy(xpath = "//div[@title='Edit Relationship']")
    public WebElement relationshipEditOnboarding;


    @FindBy(xpath = "//button[@title='Add Primary Phone']")
    public WebElement mobileEditOnboarding;


    @FindBy(xpath = "(//input[@data-automation-id='textInputBox'])[1]")
    public WebElement mobileValOnboarding;

    @FindBy(xpath = "//div[@data-automation-id='selectSelectedOption']")
    public WebElement mobileDevOnboarding;

    @FindBy(xpath = "//button[@title='Add Primary Email']")
    public WebElement EmailEditOnboarding;

    @FindBy(xpath = "//button[@title='Add Primary Phone']")
    public WebElement phnEditOnboarding;

    @FindBy(xpath = "(//label[text()='Address']//following::*[@data-automation-id='textInputBox'])[1]")
    public WebElement phnEditmailOnboarding;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    public WebElement relationshipValOnboarding;

    @FindBy(xpath = "//*[text()='Primary Email']//following::span[@title='Add'][1]")
    public WebElement primaryAddOnboarding;

    @FindBy(xpath = "//input[@data-automation-id='textInputBox']")
    public WebElement emailTextOnboarding;

    @FindBy(xpath = "//*[text()='Primary Phone']//following::span[@title='Add'][1]")
    public WebElement primaryPhoneOnboarding;

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and @title='Mobile']")
    public WebElement phnDeviceOnboarding;

    @FindBy(xpath = "//label[text()='Phone Number']//following::input[@data-automation-id='textInputBox'][1]")
    public WebElement phnNbrTextOnboarding;

    @FindBy(xpath = "//span[@title='Save for Later']//preceding::span[@title='Submit']")
    public WebElement inboxSubmitOnboarding;

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

    @FindBy(xpath = "//span[@title='Details and Process']")
    public WebElement detailsTabOnboarding;

    @FindBy(xpath = "(//div[text()='Details']//following::div[text()='Process'])[1]")
    public WebElement processOnboarding;

    @FindBy(xpath = "//div[@data-automation-id='gridFullscreenIconButton']")
    public WebElement inboxFullScreenOnboarding;

    @FindBy(xpath = "(//div[@data-automation-id='checkboxPanel'])[3]")
    public WebElement provinceCheckboxOnboarding;

    @FindBy(xpath = "(//div[@data-automation-id='checkboxPanel'])[4]")
    public WebElement federalCheckboxOnboarding;

    @FindBy(xpath = "//button[@data-automation-id='asyncNotificationCloseButton']")
    public WebElement inboxcloseAppOnboarding;

    @FindBy(xpath = "(//div[@data-automation-id='checkboxPanel'])[3]")
    public WebElement provinceOnboarding;

    @FindBy(xpath = "(//div[@data-automation-id='checkboxPanel'])[4]")
    public WebElement fedralOnboarding;


    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement NoRadioOnboarding;

    @FindBy(xpath = "(//h3[text()='Select a veteran status']//following::div[@data-automation-id='icon'])[4]")
    public WebElement veteranOnboarding;

    @FindBy(xpath = "//div[@title='Edit Race/Ethnicity']")
    public WebElement EditRaceOnboarding;

    // @FindBy(xpath = "(//label[text()='Race/Ethnicity']//following::div[@data-automation-id='icon'])[4]")
    @FindBy(xpath = "//div[@data-automation-id='promptSearchButton']")
    public WebElement RaceOnboarding;


    @FindBy(xpath = "(//label[text()='Marital Status']//following::div[@data-automation-id='icon'])[4]")
    public WebElement MaritalOnboarding;

    @FindBy(xpath = "(//label[text()='Routing Transit Number']//following::input[@data-automation-id='textInputBox'])[1]")
    public WebElement RoutingOnboarding;


    @FindBy(xpath = "(//div[@data-automation-id='checkboxPanel'])[2]")
    public WebElement chanOnboarding;

    @FindBy(xpath = "(//span[@data-automation-id='promptIcon'])[1]")
    public WebElement SinOnboarding;

    @FindBy(xpath = "//span[@title='OK']")
    public WebElement OkOnboarding;

    @FindBy(xpath = "//label[text()='Marital Status']")
    public WebElement MStatusOnboarding;

    @FindBy(xpath = "//span[@data-automation-id='workerProfileMenuItemLabel' and text()='Job']")
    public WebElement tabJob;

    @FindBy(xpath = "//span[text()='More']//following::div[@data-automation-id='popupOption' and text()='Manager History']")
    public WebElement subTabManagerHistory;

    //    xpaths for the three dots selection
    @FindBy(xpath = "(//div[@data-automation-id='relatedActionsItemLabel' and text()='Security Profile'])")
    public WebElement securityProfile;

    @FindBy(xpath = "//*[text()='Start Proxy']")
    public WebElement startProxyFromAssociateName;

    //Rescind an Hire----------------------------------------------------------------------------------------------------


    @FindBy(xpath = "//div[@data-automation-id='relatedActionsItemLabel' and text()='Business Process']")
    public WebElement businessProcess;

    @FindBy(xpath = "//div[@data-automation-id='relatedActionsItemLabel' and text()='Rescind']")
    public WebElement RescindOption;

    @FindBy(xpath = "//*[@data-automation-id='textAreaField']")
    public WebElement commentArea;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitRescind;

    @FindBy(xpath = "//*[text()='Cancel']")
    public WebElement cancelRescind;

    @FindBy(xpath = " //span[@title='Done']")
    public WebElement btnDone;

    //------------------------------------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//label[text()='Associate ID']//following::div[@data-automation-id='textView'][1]")
    private WebElement associateID;

    //------------------------------------------------------------------------------------------------------------------------------------------------


    public WorkdayCommon getWorkdayCommonObj() {
        return workdaycommon;
    }

    String associate_ID = null;

    public HirefunctionalityPage_testdatacreator() throws IOException {
    }

//******************************BP Specific functions**********************************************

    String Positionglobal = null;

    public void CreatePosname()
    {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hhmmss");
        String time = dateFormat.format(now);
        String  Position = Constants.POSITIONCREATEPOSHIREEMP;
        Positionglobal= Position.concat(time);
    }



    public void TD_createPosition(String SUPORG) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        CreatePosname();
        log.info("The Position name is: "+Positionglobal);
        workdaycommon.searchbySearchBox(Constants.SRCHBOXCREATEPOSITION);
        WebActionsUtil.explicitWait(driver, createPositionLink, "click");
        createPositionLink.click();
        nameOrganization.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(SUPORG, Keys.ENTER);
        workdaycommon.userWait(2000);
        clickOkButton.click();
        workdaycommon.userWait(3500);
        jobTitle.clear();
        jobTitle.sendKeys(Positionglobal, Keys.ENTER);
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
                elem.sendKeys(Constants.AVAILABILITYDATEPOSITION);
                elem.sendKeys(Keys.TAB);
                elem.sendKeys(Keys.TAB);
            }
        }
        workdaycommon.userWait(3000);
        if (driverWrapper.isElementPresent(earliesthiredateCreatePosition)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[2]"))) {
                elem.sendKeys(Constants.EARLIESTDATEPOSITION);
                elem.sendKeys(Keys.TAB);
                elem.sendKeys(Keys.TAB);
            }
        }
        workdaycommon.userWait(3000);
        jobRestrictionsCheckBox.click();
        workdaycommon.userWait(2000);

        submitbuttonCreatePosition.click();
        WebActionsUtil.explicitWait(driver, validationCreateposition, "click");
        if (validationCreateposition.isDisplayed()) {
            test.pass("The requested position(s) is/are created successfully");
            log.info("The position created successfully.");
            donebuttonCreatePosition.click();
        } else
            test.fail("Failed while creating a position");

    }

    public void TD_createPrehire(String Country) throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            log.entry();
            workdaycommon.userWait(5000);

            workdaycommon.searchbySearchBox(Constants.SRCHCREATEPREHIRE);
            log.debug("Click on Create Pre-Hire Link");
            WebActionsUtil.explicitWait(driver, createprehireLink, "click");
            createprehireLink.click();
            driverWrapper.waitForPageLoaded();
            AllowdupnamechbxcreateprehireLink.click();
            driverWrapper.waitForPageLoaded();
            log.info("Entering pre hire details........");

            workdaycommon.userWait(3000);
            countryoptsrchProCompHire.click();
            workdaycommon.userWait(2000);
            countryTxtProCompHire.clear();
            countryTxtProCompHire.sendKeys(Country, Keys.ENTER);
            workdaycommon.userWait(3000);

            log.info("Reading data from excel Sheet........");
            ArrayList<String> FName = util.readxlFname(0, 1);
            ArrayList<String> LName = util.readxlLname(2, 3);
            for (int i = 0; i <= FName.size(); i++) {
                this.FNameCreatePreHire.sendKeys(FName.get(i));
                workdaycommon.userWait(3000);
                workdaycommon.scrolltoElement(LNameCreatePreHire);
                this.LNameCreatePreHire.sendKeys(LName.get(i));
                workdaycommon.userWait(3000);
                String fname = FName.get(i);
                this.FNAMECREATEPREHIRE1 = fname;
                log.info("Firt Name---> " + FNAMECREATEPREHIRE1);
                this.LNAMECREATEPREHIRE1 = LName.get(i);
                log.info("LastName------" + LNAMECREATEPREHIRE1);


                Conductinfo.click();
                workdaycommon.userWait(2000);
                workdaycommon.scroll();
                //Email
                String SkimmedFname = FNAMECREATEPREHIRE1.replaceAll("\\s", "");
                String workerEmail = SkimmedFname + "_" + LNAMECREATEPREHIRE1 + "@homedepot.com";
                log.info(workerEmail);
                workdaycommon.scrolltoElement(emailCreatePreHire);
                WebActionsUtil.explicitWait(driver, emailCreatePreHire, "click");
                PageActionsUtil.clickButton(driverWrapper, emailCreatePreHire);
                workdaycommon.userWait(1000);
                enteremailCreatePreHire.sendKeys(workerEmail, Keys.TAB);
                typeemailCreatePreHireSearchbox.sendKeys(Constants.EMAILTYPEECREATEPREHIRE);
                workdaycommon.userWait(2000);

                //address 1
                workdaycommon.userWait(3000);
                addressaddPreHire.click();

                workdaycommon.userWait(2000);
                homeaddressline1PreHire.sendKeys(Constants.HOMEADDR1PREHIRE, Keys.ENTER);

                workdaycommon.userWait(2000);
                homeaddressline2PreHire.sendKeys(Constants.HOMEADDR2PREHIRE, Keys.ENTER);

                workdaycommon.userWait(2000);
                homecityPreHire.sendKeys(Constants.HOMECITYPREHIRE, Keys.ENTER);

                if(Country.contains(Constants.COUNTRYCANADAHIRE))
                {

                    log.info("Canada data");
                    workdaycommon.userWait(2000);
                    homeprovincePreHire.click();
                    workdaycommon.userWait(1000);
                    insidesearchboxcommon.sendKeys(Constants.HOMEPROVINCEPREHIRE, Keys.ENTER);
                }
                else
                {
                    log.info("US data");
                    workdaycommon.userWait(2000);
                    homestatePreHire.click();
                    workdaycommon.userWait(1000);
                    insidesearchboxcommon.sendKeys(Constants.USAHOMESTATEPREHIRE, Keys.ENTER);
                }

                workdaycommon.userWait(2000);
                homepostalcodePreHire.sendKeys(Constants.HOMEPOSTALCODEPREHIRE, Keys.ENTER);

                workdaycommon.userWait(2000);
                hometypePreHire.click();
                workdaycommon.userWait(1000);
                insidesearchboxcommon.sendKeys(Constants.HOMETYPEPREHIRE, Keys.ENTER);

                PageActionsUtil.clickButton(driverWrapper, okButtonCreatePreHire);
                workdaycommon.userWait(3000);
                if (doneButtonCreatePreHire.isDisplayed()) {
                    test.pass("Pre-Hire Created Successfully");
                } else {
                    test.fail("Failed creating a pre hire");
                }
                driverWrapper.waitForPageLoaded();
                PageActionsUtil.clickButton(driverWrapper, doneButtonCreatePreHire);
                log.debug("Create Pre Hire Done........");
                log.exit();
            }
        } catch (Exception e) {
            workdaycommon.takescreenshotUI("Exception", FNAMECREATEPREHIRE1);
            log.error("Exception/Issue occurred:" + e.getMessage());
        }
    }



    public void TD_Hire_HireAssociate(String SUPORG, String JobProfile, String HireDate) throws Exception {

        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
            log.entry();
            log.info("Starting with Hire Employee-->" + FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1);

            String empname = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
           //  String empname = FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1;
           // String empname = "TestDiaya TestQuasam";
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
            log.info("SupOrg is "+SUPORG);
            workdaycommon.userWait(2000);

            log.info("Entering Pre hire name........" + empname);
            WebActionsUtil.explicitWait(driver, nameHireEmployee, "click");
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
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(new Date());
            // log.info(date);
            if (driverWrapper.isElementPresent(hiredateHireEmployee)) {
                log.info("job details page");
                for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                    elem.sendKeys(HireDate);
                    elem.sendKeys(Keys.TAB);
//                    elem.sendKeys(Keys.TAB);
                }
            }
            JavascriptExecutor jst= (JavascriptExecutor) driver;

            //insidesearchboxcommon.sendKeys(Reason, Keys.ENTER);
            insidesearchboxcommon.sendKeys(Constants.REASONHIREEMP, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clickreason = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'"+Constants.REASONHIREEMP+"')]"));
            workdaycommon.scrolltoElement(clickreason);
            WebActionsUtil.explicitWait(driver, clickreason, "click");
            clickreason.click();


            workdaycommon.scrolltoElement(positionHireEmployee);
            jst.executeScript("arguments[0].click () ", positionHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Positionglobal, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clickposition = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'"+Positionglobal+"')]"));
            workdaycommon.scrolltoElement(clickposition);
            //WebActionsUtil.explicitWait(driver, clickposition, "click");
            workdaycommon.userWait(2000);
            clickposition.click();


            workdaycommon.scrolltoElement(empTypeHireEmployee);
            jst.executeScript("arguments[0].click () ", empTypeHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Constants.EMPTYPEHIREEMP, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clickworkertype = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'"+Constants.EMPTYPEHIREEMP+"')]"));
            workdaycommon.scrolltoElement(clickworkertype);
            //WebActionsUtil.explicitWait(driver, clickworkertype, "click");
            workdaycommon.userWait(2000);
            clickworkertype.click();


            workdaycommon.scrolltoElement(jobprofileHireEmployee);
            jst.executeScript("arguments[0].click () ", jobprofileHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(JobProfile, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clickjobprofile = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'"+JobProfile+"')]"));
            workdaycommon.scrolltoElement(clickjobprofile);
            //WebActionsUtil.explicitWait(driver, clickjobprofile, "click");
            workdaycommon.userWait(2000);
            clickjobprofile.click();


            workdaycommon.scrolltoElement(timetypeHireEmployee);
            jst.executeScript("arguments[0].click () ", timetypeHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Constants.TIMETYPEHIREEMP, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clicktimetype = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'"+Constants.TIMETYPEHIREEMP+"')]"));
            workdaycommon.scrolltoElement(clicktimetype);
            //WebActionsUtil.explicitWait(driver, clicktimetype, "click");
            workdaycommon.userWait(2000);
            clicktimetype.click();


            workdaycommon.scrolltoElement(locationHireEmployee);
            jst.executeScript("arguments[0].click () ", locationHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Constants.LOCATIONHIREEMP, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clicklocation = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'"+Constants.LOCATIONHIREEMP+"')]"));
            workdaycommon.scrolltoElement(clicklocation);
            //WebActionsUtil.explicitWait(driver, clicklocation, "click");
            workdaycommon.userWait(2000);
            clicklocation.click();


            workdaycommon.scrolltoElement(payRateHireEmployee);
            if (Constants.PAYRATETYPEHIREEMP.contains("Hourly")) {
                log.info("PayRateType -> " + Constants.PAYRATETYPEHIREEMP);
                payRateHireEmployee.click();
                try
                { executor.executeScript("arguments[0].click();", payratetype_All);
                }
                catch (Exception e)
                { log.info("The ALL subtype in payrate type is not available");}
                executor.executeScript("arguments[0].click();", payratetype_Hourly);
                workdaycommon.userWait(2000);
            }
            else if (Constants.PAYRATETYPEHIREEMP.contains("Salary")) {
                log.info("PayRateType -> " + Constants.PAYRATETYPEHIREEMP);
                payRateHireEmployee.click();
                try
                { executor.executeScript("arguments[0].click();", payratetype_All);
                }
                catch (Exception e)
                { log.info("The ALL subtype in payrate type is not available");}
                workdaycommon.scrolltoElement(payratetype_Salary);
                executor.executeScript("arguments[0].click();", payratetype_Salary);
                workdaycommon.userWait(2000);
            }
            workdaycommon.scrolltoElement(submitbtnHireEmployee);
            WebActionsUtil.explicitWait(driver, submitbtnHireEmployee, "click");
            submitbtnHireEmployee.click();
            workdaycommon.userWait(4000);
            workdaycommon.scroll();
        } catch (Exception e) {
            log.error("Exception/Issue occurred:" + e.getMessage());
            test.fail(e.getMessage());
        }
    }

    public void TD_Hire_OrganizationAssignments() throws Exception {

        try {
            workdaycommon.setDriver(driverWrapper);
            log.entry();
            log.info("Starting with Hire Employee-->" + FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1);
            String empname = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
            // String empname = FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1;

            log.info("Propose Empname--->" + empname);
            //Change Organization
            openProCompHire.click();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(compEditProCompHire);
            compEditProCompHire.click();
            workdaycommon.userWait(2000);
            compValProCompHire.sendKeys(Constants.COMPANYHIREEMP, Keys.ENTER);
            workdaycommon.userWait(1000);
            //Cost center
            workdaycommon.scrolltoElement(costEditProCompHire);
            WebActionsUtil.explicitWait(driver, costEditProCompHire, "click");
            costEditProCompHire.click();
            workdaycommon.userWait(2000);
            compValProCompHire.sendKeys(Constants.COSTCENTERHIREEMP, Keys.ENTER);
            workdaycommon.userWait(1000);
            //Business Unit
            workdaycommon.scrolltoElement(bUEditProCompHire);
            WebActionsUtil.explicitWait(driver, bUEditProCompHire, "click");
            bUEditProCompHire.click();
            workdaycommon.userWait(2000);
            compValProCompHire.sendKeys(Constants.BUSINESSUNITHIREEMP, Keys.ENTER);
            workdaycommon.userWait(3000);
            //Department
            workdaycommon.scrolltoElement(deptEditProCompHire);
            WebActionsUtil.explicitWait(driver, deptEditProCompHire, "click");
            deptEditProCompHire.click();
            workdaycommon.userWait(2000);
            deptValEditProCompHire.click();
            workdaycommon.userWait(2000);
            compValProCompHire.sendKeys(Constants.DEPARTMENTHIREEMP, Keys.ENTER);
            workdaycommon.userWait(3000);
            //Submit
            submitProCompHire.click();
            driverWrapper.waitForPageLoaded();
            workdaycommon.userWait(2000);
        } catch (Exception e) {
            workdaycommon.takescreenshotUI("Exception", this.FNAMECREATEPREHIRE1);
            log.error("Exception/Issue occurred:" + e.getMessage());
            test.fail(e.getMessage());
        }
    }

    public void TD_Hire_EditID(String Country, String SSNumber) throws Exception {

        try {
            workdaycommon.setDriver(driverWrapper);
            log.entry();
            log.info("Starting with Hire Employee-->" + FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1);

            String empname = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
            // String empname = FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1;

            log.info("Propose Empname--->" + empname);

            Random random = new Random();
//            int value = random.nextInt(10000);
            int SIN = random.nextInt((max - min) + 1) + min;
            System.out.println(SIN);

            log.info("...Enter Edit ID....");
            //Edit IDs
            openProCompHire.click();
            workdaycommon.userWait(4000);
            addrowmailbox.click();
            log.info("Entering Government ID details......." + Country);
            log.info("Entering Government ID details......." + Constants.GOVIDHIREEMP);
            log.info("Entering Government ID details......."+Constants.SINHIREEMP+SIN);
            WebActionsUtil.explicitWait(driver, countryClickProCompHire, "click");
            countryClickProCompHire.click();
            workdaycommon.userWait(2000);
            countryProCompHire.sendKeys(Country, Keys.TAB);
            workdaycommon.userWait(2000);
            nationalValIDProCompHire.sendKeys(Constants.GOVIDHIREEMP, Keys.TAB);
            workdaycommon.userWait(2000);
            addEditIDProCompHire.sendKeys(Constants.SINHIREEMP+SIN, Keys.ENTER);
//            addEditIDProCompHire.sendKeys(SSNNumber, Keys.ENTER);
            workdaycommon.userWait(3000);
            approveProCompHire.click();
            workdaycommon.userWait(3000);
            try {
                approveProCompHire.click();
                workdaycommon.userWait(3000);
            } catch (NoSuchElementException e) {
                log.info("Execution is in catch block.....Approve button clicked already");
            }
        } catch (Exception e) {
            workdaycommon.takescreenshotUI("Exception", this.FNAMECREATEPREHIRE1);
            log.error("Exception/Issue occurred:" + e.getMessage());
            test.fail(e.getMessage());
        }
    }

    public void TD_Hire_ProposeCompensation(String Country) throws Exception {

        try {
            workdaycommon.setDriver(driverWrapper);
            log.entry();
            log.info("Starting with Hire Employee-->" + FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1);
            String empname = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
            workdaycommon.setEmployeename(empname);
            log.info("Propose Empname--->" + empname);
            log.info("openProCompHire Started....");
            workdaycommon.inboxWD.click();
            workdaycommon.userWait(2000);
            WebElement inboxTextTerminate11 = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Propose Compensation Hire: " + empname + "')]"));
            workdaycommon.scrolltoElement(inboxTextTerminate11);
            inboxTextTerminate11.click();
            workdaycommon.userWait(2000);
            //Help Available
            try {
                helpcloseProCompHire.click();
                workdaycommon.userWait(2000);
                log.info("Help is  Available.....");
            } catch (Exception e1) {
                log.info("Help is not Available.....");
            }
            inboxMaxProCompHire.click();
            workdaycommon.userWait(3000);
            try {
                workdaycommon.scrolltoElement(editSalaryProCompHire);
                WebActionsUtil.explicitWait(driver, editSalaryProCompHire, "click");
                workdaycommon.userWait(2000);
                editSalaryProCompHire.click();
                workdaycommon.userWait(3000);
            } catch (NoSuchElementException e1) {
                log.info("Entered Hourly.....");
                workdaycommon.scrolltoElement(edithourProCompHire);
                WebActionsUtil.explicitWait(driver, edithourProCompHire, "click");
                workdaycommon.userWait(2000);
                edithourProCompHire.click();
                workdaycommon.userWait(3000);
            }
            amountProCompHire.sendKeys(Keys.BACK_SPACE);
            amountProCompHire.sendKeys(Keys.BACK_SPACE);
            amountProCompHire.sendKeys(Keys.BACK_SPACE);
            amountProCompHire.sendKeys(Keys.BACK_SPACE);
            amountProCompHire.sendKeys(Constants.AMOUNTHIREEMP, Keys.ENTER);
            workdaycommon.userWait(2000);
            submitProCompHire.click();
            workdaycommon.userWait(2000);
            WebActionsUtil.explicitWait(driver, doneProCompHire, "click");
            doneProCompHire.click();
            workdaycommon.userWait(2000);

            log.info("Checking for Awaitng Action....");
            workdaycommon.searchbySearchBox(empname);
            workdaycommon.userWait(1000);
            workdaycommon.scrolltoElement(allOfWorkdayProCompHire);
            allOfWorkdayProCompHire.click();
            workdaycommon.userWait(1000);
            WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Propose Compensation Hire: " + empname + "')]"));
            workdaycommon.userWait(3000);
            workdaycommon.scrolltoElement(Employeename);
            workdaycommon.userWait(1000);
            Employeename.click();
            workdaycommon.userWait(3000);
            processProCompHire.click();
            workdaycommon.userWait(3000);
            workdaycommon.scroll();
            log.info("Clicked on Employee....");
            try {
                while (workdaycommon.labelawaitingaction.isDisplayed()) {
                    log.info("Awaiting Action Counting Started.......");
                    List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
                    int count = labelAwaitingaction.size();
                    log.info("Count----->" + count);
                    String Approver_name = workdaycommon.awaitingAction(1);
                    StringBuilder proxyperson = new StringBuilder(Approver_name);
                    proxyperson.delete(Approver_name.length() - 1, Approver_name.length());
                    workdaycommon.userWait(3000);
                    workdaycommon.StartProxy_employee(proxyperson.toString());
                    workdaycommon.userWait(2000);
                    workdaycommon.gotoWorkdayHomepage();
                    workdaycommon.userWait(2000);
                    workdaycommon.inboxWD.click();
                    workdaycommon.userWait(2000);
                    WebElement inboxTextTerminate1 = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Propose Compensation Hire: " + empname + "')]"));
                    workdaycommon.scrolltoElement(inboxTextTerminate1);
                    inboxTextTerminate1.click();
                    workdaycommon.userWait(2000);
                    submitProCompHire.click();
                    workdaycommon.userWait(1000);
                    doneProCompHire.click();
                    workdaycommon.userWait(2000);
                    log.info("Approval/Submission done Successfully.......");
                }
                log.info(".......Process Completed with Approval.........");
                workdaycommon.gotoWorkdayHomepage();
            } catch (Exception e) {
                log.info("Running in Catch Block.........");
                workdaycommon.gotoWorkdayHomepage();
                AwaitingAction_ProposeCompHire(empname, Country);
            }
        } catch (Exception e) {
            workdaycommon.takescreenshotUI("Exception", this.FNAMECREATEPREHIRE1);
            log.error("Exception/Issue occurred:" + e.getMessage());
            test.fail(e.getMessage());
        }
    }

    public void AwaitingAction_ProposeCompHire(String empname1, String Country) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.searchbySearchBox(empname1);
        workdaycommon.userWait(1000);
        allOfWorkdayProCompHire.click();
        workdaycommon.userWait(1000);
        WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Propose Compensation Hire: " + empname1 + "')]"));
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(Employeename);
        workdaycommon.userWait(1000);
        Employeename.click();
        workdaycommon.userWait(1000);
        processProCompHire.click();
        workdaycommon.userWait(2000);
        String overallStatus = overallStatusProCompHire.getText();
        log.info("---------overallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);
        workdaycommon.scroll();
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (statusProCompHire.isDisplayed()) {
                    log.info("Propose Compensation Hire not Completed Successfully");
                    test.fail("Propose Compensation Hire not Completed Successfully");
                }
            } catch (Exception e) {
                test.pass("Propose Compensation Hire Completed Successfully - Employee name :" + empname1 + " , " + "Country: " + Country);
                log.info("Propose Compensation Hire Completed Successfully - Employee name :" + empname1 + "," + "Country: " + Country);
            }
        } else {
            log.info("The Overall process is not completed.......Current Status: " + overallStatus);
            test.fail("The Overall process is not completed.......Current Status: " + overallStatus);
        }

        /*

        //Start Proxy with Employee.... If required need to add...
        workdaycommon.searchbySearchBox(empname1);
        workdaycommon.userWait(2000);
        allOfWorkdayProCompHire.click();
        workdaycommon.userWait(2000);
        WebElement namelink = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'"+empname1+"')]"));
        namelink.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.userWait(1000);
        workdaycommon.mousemove(securityprofileActions,startproxyActions);
        workdaycommon.userWait(1000);
        workdaycommon.okbuttonStartProxy.click();
        workdaycommon.userWait(3000);
        test.info("Successfully able to proxy to the employee, Employee Name:" +empname1);
*/
    }


    public void sendemployee(String empname)
    {
        Random random = new Random();
        int value = random.nextInt(10000);
        System.out.println(value);
        HashMap<Integer,String> hmapemp = new HashMap<>();
        hmapemp.put(value,empname);
        workdaycommon.sethashmap(hmapemp);
        workdaycommon.setrandomnumber(value);
    }


    public void pickassociateId() throws Exception
    {
        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.selfImgBtn.click();
        workdaycommon.userWait(2000);
        workdaycommon.viewprofileSelf.click();
        workdaycommon.userWait(2000);
         associate_ID=associateID.getText();
        log.info("The Employee Id"+associate_ID);
    }


    public void TD_Onboarding(String Country,String JobProfile) throws Exception {
        String empname1= null;
        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
            empname1 = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
            workdaycommon.setEmployeename(empname1);
            // String empname1 = "TestLeroy TestCooper";
            //workdaycommon.searchbySearchBox(Constants.SRCHHIREEMP);
            workdaycommon.userWait(3000);
            log.info("Onboarding Started...." + empname1);
            workdaycommon.searchbySearchBox(empname1);
            workdaycommon.userWait(2000);
            allOfWorkdayProCompHire.click();
            workdaycommon.userWait(3000);
            //WebElement namelink = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + empname1 + "')]"));
            WebElement namelink = driver.findElement(By.xpath("(//*[text()='" + empname1 + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + empname1 + "')][1]"));
            namelink.click();
            workdaycommon.userWait(2000);
            workdaycommon.clickAction.click();
            workdaycommon.userWait(1000);
            workdaycommon.mousemove(workerHisProCompHire, viewWorkerHisProCompHire);
            workdaycommon.userWait(2000);
            driver.findElement(By.xpath("//div[@title='Hire: " + empname1 + "']")).click();
            workdaycommon.userWait(2000);
            processProCompHire.click();
            workdaycommon.userWait(5000);
            workdaycommon.scroll();
            workdaycommon.userWait(9000);
            log.info("Checking for Awaiting Action for Manager Name....");
            try {
                if (workdaycommon.labelawaitingaction.isDisplayed()) {
                    workdaycommon.scrolltoElement(workdaycommon.labelawaitingaction);
                    log.info("Awaiting Action Counting Started....for manager name...");
                   List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
                    int count = labelAwaitingaction.size();
                    log.info("Count----->" + count);
                    for (int i = 1; i <= count; i++) {
                        log.info("Awaiting Action____1......." + i);
                        String Approver_name = workdaycommon.awaitingAction(i);
                        StringBuilder proxyperson = new StringBuilder(Approver_name);
                        proxyperson.delete(Approver_name.length() - 1, Approver_name.length());
                        test.info("Onboarding : Proxy person to Manager----" + proxyperson);
                         /*workdaycommon.userWait(3000);
                        workdaycommon.startProxy(proxyperson.toString());
*/
                        //workdaycommon.StartProxy_employee(proxyperson.toString());
                        workdaycommon.userWait(4000);
                        WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
                        Threedots.click();
                        workdaycommon.scrolltoElement(securityProfile);
                        workdaycommon.mousemove(securityProfile,startProxyFromAssociateName);
                        workdaycommon.userWait(1000);
                        startProxyFromAssociateName.click();
                        btnOKChangeJob.click();
                        workdaycommon.userWait(3000);
                        log.info(".......Proxy successful.......");

                        workdaycommon.gotoWorkdayHomepage();
                        workdaycommon.userWait(3000);
                        /*
                            try {
                                if (inboxcloseAppOnboarding.isDisplayed()) {
                                inboxcloseAppOnboarding.click();
                                workdaycommon.userWait(3000);
                            }}
                            catch(NoSuchElementException e)
                            {
                                log.info("close icon is NOT present in the inbox");
                            }
                        */
                        inboxOnboarding.click();
                        log.info("Clicking on Inbox Icon.....");
                        workdaycommon.userWait(9000);
                        WebElement inboxTextOnboarding = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Hire: " + empname1 + "')]"));
                        workdaycommon.scrolltoElement(inboxTextOnboarding);
                        inboxTextOnboarding.click();
                        log.info("Clicking on Inbox...Manager Name..");

                        workdaycommon.userWait(5000);
                        // inboxMaxProCompHire.click();
                        workdaycommon.userWait(5000);
                        try {

                            log.info("Clicking on Maximize.....");
                            payGrpPromtOnboarding.click();
                            workdaycommon.userWait(2000);
                            WebElement payGrpValCreateposition = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @data-automation-label='Canada Bi-weekly']"));
                            payGrpValCreateposition.click();
                            workdaycommon.userWait(2000);
                        } catch (Exception e) {
                            log.info("Running in catchs....");
                        }

                        inboxSubmitOnboarding.click();
                        log.info("Submission Completed....");

                    }
                }
            } catch (Exception e) {
                log.info("Running in Catch Block.........");
                workdaycommon.gotoWorkdayHomepage();
                AwaitingAction_Onboarding(empname1, Country);
            }
            workdaycommon.userWait(3000);
            log.info("Checking for Onboarding Awaiting Action Employee name.....");
            workdaycommon.scrolltoElement(detailsTabOnboarding);
            workdaycommon.userWait(2000);
            detailsTabOnboarding.click();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(processOnboarding);
            processOnboarding.click();
            workdaycommon.userWait(3000);
            //  workdaycommon.scrolltoElement(inboxFullScreenOnboarding);
            //  inboxFullScreenOnboarding.click();
            workdaycommon.userWait(3000);
            workdaycommon.scroll();
            log.info("Checking for onboarding Awaiting Action.....");
            workdaycommon.userWait(5000);
            try {
                if (workdaycommon.labelawaitingaction.isDisplayed()) {
                    log.info("*****Awaiting Action Counting Started.......");
                    List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
                    int count = labelAwaitingaction.size();
                    log.info("Count----->" + count);
                    int i = 1;
                    log.info("Awaiting Action____1......." + i);
                    String Approver_name = workdaycommon.awaitingAction(i);
                    StringBuilder proxyperson = new StringBuilder(Approver_name);
                    proxyperson.delete(Approver_name.length() - 1, Approver_name.length());
                    log.info("Proxy person------Employee------" + proxyperson);
                    workdaycommon.userWait(3000);
//                    String ProxyNameLink = proxyperson.toString();

                    //workdaycommon.StartProxy_employee(proxyperson.toString());
//                    workdaycommon.startProxy(proxyperson.toString());

                    workdaycommon.userWait(4000);
                    WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
                    Threedots.click();
                    workdaycommon.scrolltoElement(securityProfile);
                    workdaycommon.mousemove(securityProfile,startProxyFromAssociateName);
                    workdaycommon.userWait(1000);
                    startProxyFromAssociateName.click();
                    btnOKChangeJob.click();
                    workdaycommon.userWait(3000);
                    log.info(".......Proxy successful.......");

                    workdaycommon.userWait(4000);
                    workdaycommon.gotoWorkdayHomepage();
                    workdaycommon.userWait(3000);
                    inboxOnboarding.click();
                    workdaycommon.userWait(2000);

                    if (Country.equalsIgnoreCase(Constants.COUNTRYCANADAHIRE)) {
                        log.info("Mail Approval for Canada Region.....");
                        PersonalInformation(Country);
                        paymentElection();
                        changePhoto();
                        provinceHolding();
                        completeFederal(Country);
                        changeEmergencyContact(Constants.FNEMERGENCYCONTACTONB, Constants.LNEMERGENCYCONTACTONB, Constants.RELATIONSHPONB, Constants.MAILIDONB, Constants.MOBILEONB);
                    } else {
                        log.info("Mail Approval for US Region.....");
                        LocalHolding();
                        PersonalInformation(Country);
                        changePhoto();
                        provinceHolding();
                        completeFederal(Country);
                        changeEmergencyContact(Constants.FNEMERGENCYCONTACTONB, Constants.LNEMERGENCYCONTACTONB, Constants.RELATIONSHPONB, Constants.MAILIDONB, Constants.MOBILEONB);
                        disabilitySelfIden();
                        veteranStatus();
                        log.info("Mail Approval Completed.....");
                        USpaymentElection();
                    }
                }
            } catch (Exception e) {
                log.info("Running in Onboarding Catch Block.........");
                workdaycommon.gotoWorkdayHomepage();
                AwaitingAction_Onboarding(empname1, Country);
            }
            log.info("Checking for final Awaiting Action...." + empname1);
            workdaycommon.searchbySearchBox(empname1);
            workdaycommon.userWait(2000);
            allOfWorkdayProCompHire.click();
            workdaycommon.userWait(3000);
            WebElement namelinkk = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + empname1 + "')]"));
            namelinkk.click();
            workdaycommon.userWait(2000);
            workdaycommon.clickAction.click();
            workdaycommon.userWait(1000);
            workdaycommon.mousemove(workerHisProCompHire, viewWorkerHisProCompHire);
            workdaycommon.userWait(1000);
            driver.findElement(By.xpath("//div[@title='Hire: " + empname1 + "']")).click();
            workdaycommon.userWait(2000);
            processProCompHire.click();
            workdaycommon.userWait(5000);
            workdaycommon.scroll();
            String overallStatus = overallStatusProCompHire.getText();
            log.info("---------Final OverallStatus------>" + overallStatus);
            workdaycommon.userWait(1000);
            workdaycommon.scroll();
            //  workdaycommon.setEmployeename(empname1);
            log.info("Setting Employee name---->" + empname1);
            if (overallStatus.equals("Successfully Completed")) {
                try {
                    if (statusProCompHire.isDisplayed()) {
                        log.info("Onboarding Process not Completed Successfully :" + overallStatus);
                        test.fail("Onboarding Process not Completed Successfully :" + overallStatus);
                    }
                } catch (Exception e) {
                    test.pass("Onboarding Process Completed Successfully - Employee name :" + empname1 + " , " + "Country: " + Country);
                    log.info("Onboarding Process Completed Successfully - Employee name :" + empname1 + "," + "Country: " + Country);
                }
            } else {
                log.info("The Overall process is not completed.......Current Status: " + overallStatus);
                test.fail("The Overall process is not completed.......Current Status: " + overallStatus);
            }
        } catch (Exception e) {
            workdaycommon.takescreenshotUI("Exception", this.FNAMECREATEPREHIRE1);
            log.error("Exception/Issue occurred:" + e.getMessage());
            test.fail(e.getMessage());

        }
        sendemployee(empname1);
        /*pickassociateId();
        sendemployee(associate_ID);*/

    }

    public void AwaitingAction_Onboarding(String empname1, String Country) throws Exception {
        log.info("AwaitingAction_Onboarding Starts....");
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.searchbySearchBox(empname1);
        workdaycommon.userWait(9000);
        allOfWorkdayProCompHire.click();
        workdaycommon.userWait(9000);
        WebElement Employeenamee = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Hire: " + empname1 + "')]"));
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(Employeenamee);
        workdaycommon.userWait(1000);
        Employeenamee.click();
        workdaycommon.userWait(1000);
        processProCompHire.click();
        workdaycommon.userWait(2000);
        workdaycommon.scroll();
        String overallStatus = overallStatusProCompHire.getText();
        log.info("---------overallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);
        workdaycommon.scroll();
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (statusProCompHire.isDisplayed()) {
                    log.info("Onboarding Process not Completed Successfully");
                    test.fail("Onboarding Process not Completed Successfully");
                }
            } catch (Exception e) {
                test.pass("Onboarding Process Completed Successfully - Employee name :" + empname1 + " , " + "Country: " + Country);
                log.info("Onboarding Process Completed Successfully - Employee name :" + empname1 + "," + "Country: " + Country);
            }
        } else {
            log.info("The Overall process is not completed.......Current Status: " + overallStatus);
            test.fail("The Overall process is not completed.......Current Status: " + overallStatus);
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

    public void veteranStatus() throws Exception {
        try {
            log.info("veteranStatus started....");
            workdaycommon.userWait(2000);
            WebElement inboxveteranStatus = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Veteran Status Identification')]"));
            workdaycommon.scrolltoElement(inboxveteranStatus);
            inboxveteranStatus.click();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(veteranOnboarding);
            workdaycommon.userWait(2000);
            veteranOnboarding.click();
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys(Constants.USAVETERANSTATUSONB, Keys.ENTER);
            workdaycommon.userWait(2000);
            submitOnboarding.click();
            workdaycommon.userWait(4000);
        } catch (Exception e) {
            log.info("Inbox1 : veteranStatus is not available");
        }

    }


    public void PersonalInformation(String Country) throws Exception {
        try {
            log.info("Checking for personal Information mail Box......" + Country);
            workdaycommon.userWait(2000);
            WebElement inboxPersonalInfo = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Personal Information:')]"));
            workdaycommon.scrolltoElement(inboxPersonalInfo);
            inboxPersonalInfo.click();
            workdaycommon.userWait(2000);
            log.info("Clicking on Edit Gender");
            workdaycommon.scrolltoElement(editGenderOnboarding);
            editGenderOnboarding.click();
            workdaycommon.userWait(2000);
            genderOptionOnboarding.click();
            workdaycommon.userWait(2000);
            genderValOnboarding.click();
            workdaycommon.userWait(1000);
            log.info("Entering DOB........");
            workdaycommon.scrolltoElement(editDOBOnboarding);
            editDOBOnboarding.click();
            workdaycommon.userWait(2000);
            if (driverWrapper.isElementPresent(hiredateHireEmployee)) {
                log.info("job details page");
                for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                    elem.sendKeys(Constants.EMPDOBONB);
                    elem.sendKeys(Keys.TAB);
                    elem.sendKeys(Keys.TAB);
                }
            }
            workdaycommon.userWait(3000);

            EditRaceOnboarding.click();
            //insidesearchboxcommon.sendKeys(Keys.TAB);
            workdaycommon.userWait(3000);
            RaceOnboarding.click();
            workdaycommon.userWait(3000);


            if (Country.equalsIgnoreCase(Constants.COUNTRYCANADAHIRE)) {

                insidesearchboxcommon.sendKeys(Constants.CANADARACEONB, Keys.ENTER);
                workdaycommon.userWait(3000);
            } else {
                log.info("US Region...");
                insidesearchboxcommon.sendKeys(Constants.USARACEONB, Keys.ENTER);
                workdaycommon.userWait(3000);
            }


            submitOnboarding.click();
            workdaycommon.userWait(3000);
        } catch (Exception e1) {
            log.info("Inbox1 : personal Information is not available");
        }
    }


    public void paymentElection() throws Exception {
        try {
            log.info("Inbox 4: Payment Election mail Box.........");
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
            bankNameOnboarding.sendKeys(Constants.CANADABANKNAMEONB);
            workdaycommon.userWait(2000);
            log.info("Clicked on PaymentElectionContact.....");

//--------The fllowing code is changed/commented as it was
            //  not required migrating from P2 to sandbox----------------
            workdaycommon.scrolltoElement(institutionNbrOnboarding);
            institutionNbrOnboarding.sendKeys(Constants.CANADABANKINSTNNUMBONB);
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(branchIDOnboarding);
            branchIDOnboarding.sendKeys(Constants.CANADABANKBRANCHIDONB);
            workdaycommon.userWait(2000);
//--------------------------------------------------------------

            //--------The fllowing code is changed/commented as it was
//        not required migrating from sandbox to HD3----------------
//            workdaycommon.scrolltoElement(routingTransitNbrOnboarding);
//            routingTransitNbrOnboarding.sendKeys(Constants.ROUTINGTRANSITNUMBERONB);
//            workdaycommon.userWait(2000);
//            log.info("Clicked on PaymentElectionContact.....");

            //--------The fllowing code is changed/commented as it was
//        not required migrating from P2 to sandbox----------------
//            workdaycommon.scrolltoElement(bankIdentificationCodeOnboarding);
//            bankIdentificationCodeOnboarding.sendKeys(Constants.BANKIDNUMBERONB);
//            workdaycommon.userWait(2000);
//            log.info("Clicked on PaymentElectionContact.....");

            workdaycommon.scrolltoElement(actNbrOnboarding);
            actNbrOnboarding.sendKeys(Constants.CANADABANKACCNUMBERONB);
            workdaycommon.userWait(2000);
            log.info("Clicked on PaymentElectionContact.....");

            okOnboarding.click();
            log.info("Clicked on PaymentElectionContact.....");

            workdaycommon.userWait(5000);
            submitOnboarding.click();
            workdaycommon.userWait(3000);
        } catch (Exception e1) {
            log.info("Inbox4 : Payment Election mail Box is not available");
        }
    }



    public void USpaymentElection() throws Exception {
        try {
            log.info("Inbox 4: CanadapaymentElection Election mail Box.........");
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
            bankNameOnboarding.sendKeys(Constants.USBANKNAMEONB);
            workdaycommon.userWait(2000);
            log.info("Clicked on PaymentElectionContact.....");
            //  workdaycommon.scrolltoElement(institutionNbrOnboarding);
            workdaycommon.scrolltoElement(RoutingOnboarding);
            RoutingOnboarding.sendKeys(Constants.USBANKINSTNNUMBONB);
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

    public void changePhoto() throws Exception {


        try {
            log.info("Inbox 5 :Change My Photo..in Mail Box.....");
            workdaycommon.userWait(2000);
            WebElement ChangePhoto = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Change My Photo')]"));
            workdaycommon.scrolltoElement(ChangePhoto);
            ChangePhoto.click();
            workdaycommon.userWait(2000);
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

    public void LocalHolding() throws Exception {

        try {
            log.info("Inbox 6 : Checking for Province Holding mail Box......");
            workdaycommon.userWait(2000);
            WebElement inboxProvince = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Complete State and Local Withholding Elections')]"));
            workdaycommon.scrolltoElement(inboxProvince);
            inboxProvince.click();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(OkOnboarding);
            OkOnboarding.click();
            workdaycommon.userWait(2000);

            workdaycommon.scrolltoElement(MStatusOnboarding);
            MStatusOnboarding.click();

            workdaycommon.userWait(2000);
           // workdaycommon.scrolltoElement(SinOnboarding);
            SinOnboarding.click();
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys(Constants.USAMARITALSTATUSONB, Keys.ENTER);
            workdaycommon.userWait(3000);


            workdaycommon.scrolltoElement(MaritalOnboarding);
            MaritalOnboarding.click();
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys(Constants.USAMARITALSTATUSONB, Keys.ENTER);
            workdaycommon.userWait(3000);
            WebElement sing = driver.findElement(By.xpath("(//div[@data-automation-label='Single'])[2]"));
            sing.click();


            workdaycommon.scrolltoElement(chanOnboarding);
            workdaycommon.userWait(4000);
            chanOnboarding.click();
            workdaycommon.userWait(3000);
            submitOnboarding.click();
            workdaycommon.userWait(3000);
        } catch (Exception e1) {
            log.info("Inbox5 : Province Holding..in Mail Box... is not available");
        }


    }

    public void completeFederal(String Country) throws Exception {
        try {
            log.info("Inbox 7 :Checking for complete federal mail Box......");
            workdaycommon.userWait(2000);
            WebElement inboxfederal = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Complete Federal Withholding Elections')]"));
            workdaycommon.scrolltoElement(inboxfederal);
            inboxfederal.click();
            workdaycommon.userWait(2000);

            if (Country.equalsIgnoreCase(Constants.COUNTRYCANADAHIRE)) {

                log.info("Marital Status Not Available for Canada");
            } else {
                workdaycommon.scrolltoElement(MaritalOnboarding);
                MaritalOnboarding.click();
                workdaycommon.userWait(3000);
                insidesearchboxcommon.sendKeys(Constants.USAMARITALSTATUSONB, Keys.ENTER);
                workdaycommon.userWait(3000);
                WebElement sing = driver.findElement(By.xpath("(//div[@data-automation-label='Single'])[2]"));
                sing.click();
                workdaycommon.userWait(5000);
                log.info("Marital Status Not Available for USA");
            }


            workdaycommon.scrolltoElement(federalCheckboxOnboarding);
            workdaycommon.userWait(4000);
            federalCheckboxOnboarding.click();
            workdaycommon.userWait(5000);
            submitOnboarding.click();
            workdaycommon.userWait(5000);
        } catch (Exception e1) {
            log.info("Inbox7: complete federal in Mail Box... is not available");
        }


    }

    public void changeEmergencyContact(String FNemergencyConctOnBoard, String LNemergencyConctOnBoard, String RelationShpOnB, String MailIdONB, String MobileOnbard) throws Exception {


        try {
            log.info("Inbox 3 : Change Emergency Contact mail Box....");
            WebElement inboxEmergencyContact = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Change Emergency Contacts')]"));
            workdaycommon.scrolltoElement(inboxEmergencyContact);
            inboxEmergencyContact.click();
            workdaycommon.userWait(4000);
            workdaycommon.scrolltoElement(legalEditOnboarding);
            legalEditOnboarding.click();
            workdaycommon.userWait(4000);
            workdaycommon.scrolltoElement(FNameCreatePreHire);
            workdaycommon.userWait(2000);
            FNameCreatePreHire.clear();
            workdaycommon.userWait(2000);
            //FNameCreatePreHire.sendKeys("john");
            FNameCreatePreHire.sendKeys(Constants.FNEMERGENCYCONTACTONB, Keys.ENTER);
            workdaycommon.userWait(2000);
            LNameCreatePreHire.clear();
            workdaycommon.userWait(2000);
            // LNameCreatePreHire.sendKeys("ballla");
            LNameCreatePreHire.sendKeys(Constants.LNEMERGENCYCONTACTONB, Keys.ENTER);
            log.info("Entering RelationShip.........");
            workdaycommon.scrolltoElement(relationshipEditOnboarding);
            relationshipEditOnboarding.click();
            workdaycommon.userWait(3000);
            // relationshipValOnboarding.sendKeys("Immediate Family Member", Keys.ENTER);
            relationshipValOnboarding.sendKeys(Constants.RELATIONSHPONB, Keys.ENTER);
            workdaycommon.userWait(3000);
            workdaycommon.scrolltoElement(phnEditOnboarding);
            EmailEditOnboarding.click();
            //phnEditmailOnboarding.sendKeys("john_ballla@homedepot.com", Keys.ENTER);
            phnEditmailOnboarding.sendKeys(Constants.MAILIDONB, Keys.ENTER);
            workdaycommon.userWait(4000);
            workdaycommon.scrolltoElement(mobileEditOnboarding);
            phnEditOnboarding.click();
            workdaycommon.userWait(1000);
            mobileDevOnboarding.click();
            workdaycommon.userWait(2000);
            WebElement mobileDevOnboarding11 = driver.findElement(By.xpath("//div[@title='Mobile']"));
            mobileDevOnboarding11.click();
            workdaycommon.userWait(3000);
            mobileValOnboarding.sendKeys(Constants.MOBILEONB, Keys.ENTER);
            workdaycommon.userWait(4000);
            submitOnboarding.click();
            workdaycommon.userWait(9000);
        } catch (Exception e1) {
            log.info("Inbox3 : Change Emergency Contact mail Box is not available");
        }
    }

    public void HomeAddressChange(String Emp_ID, String Employee, String Address1, String Postal, String City, String Province, String Usage, String effectivedate) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.startProxy(Employee);
        workdaycommon.userWait(3000);
        log.info("Home Contact Change Started....");
        workdaycommon.selfImgBtn.click();
        workdaycommon.userWait(3000);
        workdaycommon.viewprofileSelf.click();
        workdaycommon.userWait(5000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(PersonalDateHCC, ChangeMyAddrHCC);
        workdaycommon.userWait(5000);
        EditAddrHCC.click();
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(avldateHCC);
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        if (driverWrapper.isElementPresent(avldateHCC)) {
            for (WebElement elem : driver.findElements(By.xpath("(//input[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                //Use the below line for using random/customized dates
                // elem.sendKeys(effectivedate);
                elem.sendKeys(date); // Enter today's current date
                elem.sendKeys(Keys.TAB);
                elem.sendKeys(Keys.TAB);
            }
        }
        WebActionsUtil.explicitWait(driver, AddrLine1HCC, "click");
        workdaycommon.scrolltoElement(AddrLine1HCC);
        AddrLine1HCC.click();
        workdaycommon.userWait(1000);
        AddrLine1HCC.clear();
        workdaycommon.userWait(1000);
        AddrLine1HCC.sendKeys(Address1);
        workdaycommon.userWait(3000);
        WebActionsUtil.explicitWait(driver, cityHCC, "click");
        workdaycommon.scrolltoElement(cityHCC);
        cityHCC.clear();
        workdaycommon.userWait(3000);
        cityHCC.sendKeys(City, Keys.ENTER);
        workdaycommon.userWait(3000);
        WebActionsUtil.explicitWait(driver, ProvinceHCC, "click");
        ProvinceHCC.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Province, Keys.ENTER);
//        ProvinceHCC.sendKeys(Province, Keys.ENTER);
        log.info("Changed Province");
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(PostalHCC);
        WebActionsUtil.explicitWait(driver, PostalHCC, "click");
        PostalHCC.click();
        workdaycommon.userWait(2000);
        PostalHCC.clear();
        workdaycommon.userWait(3000);
        PostalHCC.sendKeys(Postal);
        WebActionsUtil.explicitWait(driver, SubmitHCC, "click");
        SubmitHCC.click();
        workdaycommon.userWait(5000);
        try {
            ToBeHCC.click();
            workdaycommon.userWait(5000);
            SubmitHCC.click();
        } catch (NoSuchElementException e) {
            SubmitHCC.click();
            log.info("To Do button is not available");
        }
        workdaycommon.btnDone.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(workdaycommon.associateHistoryLink, workdaycommon.viewAssociateHistoryLink);
        workdaycommon.userWait(2000);
        WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Home Contact Change: " + Employee + "')][1]"));
        WebActionsUtil.explicitWait(driver, Employeename, "click");
        Employeename.click();
        workdaycommon.userWait(5000);
        processProCompHire.click();
        workdaycommon.userWait(5000);
        String overallStatus = overallStatusProCompHire.getText();
        log.info("---------overallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);
        workdaycommon.scroll();
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (statusProCompHire.isDisplayed()) {
                    log.info("Home Contact change not Completed Successfully");
                    test.fail("Home Contact change not Completed Successfully");
                    driver.quit();
                }
            } catch (Exception e) {
                test.pass("Home Contact change Completed Successfully - Employee name :" + Employee + " , " + "Province: " + Province);
                log.info("Home Contact change Completed Successfully - Employee name :" + Employee + "," + "Province: " + Province);
            }
        } else {
            log.info("The Overall process is not completed.......Current Status: " + overallStatus);
            test.fail("The Overall process is not completed.......Current Status: " + overallStatus);
            driver.quit();
        }
    }

    public void TD_Hire_Intern_HireAssociate(String SUPORG, String JobProfile, String HireDate) throws Exception {

        try {

            String Reason = "New Hire";
            String WorkerType = "Intern";
            String TimeType ="Full time";
            String   Location = "7052" ;
            String PayRateType = "Salary";

            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
            log.entry();
            log.info("Starting with Hire Employee-->" + FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1);

            String empname = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
            // String empname = FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1;
            //String empname = "TestSafiya TestWallace";
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

            log.info("Entering Pre hire name........" + empname);
            WebActionsUtil.explicitWait(driver, nameHireEmployee, "click");
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
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(new Date());
            // log.info(date);
            if (driverWrapper.isElementPresent(hiredateHireEmployee)) {
                log.info("job details page");
                for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                    elem.sendKeys(HireDate);
                    elem.sendKeys(Keys.TAB);
//                    elem.sendKeys(Keys.TAB);
                }
            }
            JavascriptExecutor jst= (JavascriptExecutor) driver;

            insidesearchboxcommon.sendKeys(Reason, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clickreason = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'"+Reason+"')]"));
            workdaycommon.scrolltoElement(clickreason);
            WebActionsUtil.explicitWait(driver, clickreason, "click");
            clickreason.click();


            workdaycommon.scrolltoElement(positionHireEmployee);
            jst.executeScript("arguments[0].click () ", positionHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Positionglobal, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clickposition = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'"+Positionglobal+"')]"));
            workdaycommon.scrolltoElement(clickposition);
            WebActionsUtil.explicitWait(driver, clickposition, "click");
            clickposition.click();


            workdaycommon.scrolltoElement(empTypeHireEmployee);
            jst.executeScript("arguments[0].click () ", empTypeHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(WorkerType, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clickworkertype = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'"+WorkerType+"')]"));
            workdaycommon.scrolltoElement(clickworkertype);
            WebActionsUtil.explicitWait(driver, clickworkertype, "click");
            clickworkertype.click();


            workdaycommon.scrolltoElement(jobprofileHireEmployee);
            jst.executeScript("arguments[0].click () ", jobprofileHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(JobProfile, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clickjobprofile = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'"+JobProfile+"')]"));
            workdaycommon.scrolltoElement(clickjobprofile);
            WebActionsUtil.explicitWait(driver, clickjobprofile, "click");
            clickjobprofile.click();


            workdaycommon.scrolltoElement(timetypeHireEmployee);
            jst.executeScript("arguments[0].click () ", timetypeHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(TimeType, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clicktimetype = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'"+TimeType+"')]"));
            workdaycommon.scrolltoElement(clicktimetype);
            WebActionsUtil.explicitWait(driver, clicktimetype, "click");
            clicktimetype.click();


            workdaycommon.scrolltoElement(locationHireEmployee);
            jst.executeScript("arguments[0].click () ", locationHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Location, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clicklocation = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'"+Location+"')]"));
            workdaycommon.scrolltoElement(clicklocation);
            WebActionsUtil.explicitWait(driver, clicklocation, "click");
            clicklocation.click();


            workdaycommon.scrolltoElement(payRateHireEmployee);
            if (PayRateType.contains("Hourly")) {
                log.info("PayRateType -> " + PayRateType);
                payRateHireEmployee.click();
                try
                { executor.executeScript("arguments[0].click();", payratetype_All);
                }
                catch (Exception e)
                { log.info("The ALL subtype in payrate type is not available");}
                executor.executeScript("arguments[0].click();", payratetype_Hourly);
                workdaycommon.userWait(2000);
            }
            else if (PayRateType.contains("Salary")) {
                log.info("PayRateType -> " + PayRateType);
                payRateHireEmployee.click();
                try
                { executor.executeScript("arguments[0].click();", payratetype_All);
                }
                catch (Exception e)
                { log.info("The ALL subtype in payrate type is not available");}
                workdaycommon.scrolltoElement(payratetype_Salary);
                executor.executeScript("arguments[0].click();", payratetype_Salary);
                workdaycommon.userWait(2000);
            }
            workdaycommon.scrolltoElement(submitbtnHireEmployee);
            WebActionsUtil.explicitWait(driver, submitbtnHireEmployee, "click");
            submitbtnHireEmployee.click();
            workdaycommon.userWait(4000);
            workdaycommon.scroll();
        } catch (Exception e) {
            log.error("Exception/Issue occurred:" + e.getMessage());
            test.fail(e.getMessage());
        }
    }



    public void Onboarding_Manager_Confirmation(String JobProfile) throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
            String empname1 = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
            workdaycommon.setEmployeename(empname1);
            log.info("Onboarding - Manager Confirmation Started...." + empname1);
            workdaycommon.searchbySearchBox(empname1);
            workdaycommon.userWait(2000);
            allOfWorkdayProCompHire.click();
            workdaycommon.userWait(3000);
            //WebElement namelink = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + empname1 + "')]"));
            WebElement namelink = driver.findElement(By.xpath("(//*[text()='" + empname1 + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + empname1 + "')][1]"));
            namelink.click();
            workdaycommon.userWait(2000);

            test.info("Manager verification started");
            log.info("Manager verification started");
            tabJob.click();
            workdaycommon.userWait(2000);
            workdaycommon.more_dropdownbox(subTabManagerHistory);
            WebElement managerName = driver.findElement(By.xpath("//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]"));
            String ManagerName = managerName.getText();
            workdaycommon.simplestartProxy(ManagerName);//Start proxy func without selectfromdupicates()
            workdaycommon.userWait(2000);

            workdaycommon.searchbySearchBox(empname1);
            workdaycommon.userWait(2000);
            allOfWorkdayProCompHire.click();
            workdaycommon.userWait(3000);
            //WebElement namelink = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + empname1 + "')]"));
            WebElement Empnamelink = driver.findElement(By.xpath("(//*[text()='" + empname1 + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + empname1 + "')][1]"));
            Empnamelink.click();
            workdaycommon.userWait(2000);
            workdaycommon.clickAction.click();
            workdaycommon.userWait(1000);
            workdaycommon.mousemove(workerHisProCompHire, viewWorkerHisProCompHire);
            workdaycommon.userWait(2000);
            driver.findElement(By.xpath("//div[@title='Hire: " + empname1 + "']")).click();
            workdaycommon.userWait(2000);
            processProCompHire.click();
            workdaycommon.userWait(5000);
            workdaycommon.scroll();
            workdaycommon.userWait(9000);
            log.info("Checking for Awaiting Action for Manager Name....");
            //awaiting action check
            try {
                if (workdaycommon.labelawaitingaction.isDisplayed()) {
                    log.info("Manager Confirmation - Onboarding is not completed successfully");
                    test.info("Manager Confirmation - Onboarding is not completed successfully");
                }

            } catch (Exception e) {
                log.info("Manager Confirmation - Onboarding completed successfully");
                test.info("Manager Confirmation - Onboarding completed successfully");

            }

        } catch (Exception e) {
            workdaycommon.takescreenshotUI("Exception", this.FNAMECREATEPREHIRE1);
            log.error("Exception/Issue occurred:" + e.getMessage());
            test.fail(e.getMessage());

        }
    }
}
