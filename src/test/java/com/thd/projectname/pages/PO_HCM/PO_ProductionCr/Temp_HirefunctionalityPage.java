package com.thd.projectname.pages.PO_HCM.PO_ProductionCr;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;
import java.lang.*;
//import java.util.concurrent.TimeUnit;

import com.thd.common.utils.Excelutil;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.FindBy;

import com.thd.base.BasePage;
import com.thd.base.Constants.Constants;
import com.thd.common.utils.PageActionsUtil;
import com.thd.common.utils.WebActionsUtil;

public class Temp_HirefunctionalityPage extends BasePage {
    private static final Logger log = LogManager.getLogger(Temp_HirefunctionalityPage.class);
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

//************************WebElements************************************************

    // Create Pre-hire functionality  -----------------------------------------

    // Add address-------------------------------------

    @FindBy(xpath = "//div[text()='Address']//following::button[@data-automation-id='panelSetAddButton'][1]")
    private WebElement addressaddPreHire;


// Add work address-------------------------------------

    @FindBy(xpath = "(//div[text()='Address Line 1'])[2]//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement workaddressline1PreHire;

    @FindBy(xpath = "(//div[text()='Address Line 2'])[2]//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement workaddressline2PreHire;

    @FindBy(xpath = "(//label[text()='City'])[2]//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement workcityPreHire;

    @FindBy(xpath = "//*[@data-automation-id='promptOption' and @title='SAI - Sales Associate I']")
    private WebElement jobProfileSelection;


    @FindBy(xpath = "//div[@data-automation-id='helptext-click-target']")
    private WebElement changeJobUpArrow;


    @FindBy(xpath = "(//label[text()='Province or Territory'])[2]//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement workprovincePreHire;

    @FindBy(xpath = "(//label[text()='Postal Code'])[2]//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement workpostalcodePreHire;

    @FindBy(xpath = "(//label[text()='Type'])[2]//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement worktypePreHire;


    @FindBy(xpath = "//label[text()='Percent Change']//following::input[1]")
    private WebElement percentChange;


// Add home address -------------------------------------

//@FindBy(xpath = "//label[text()='Country']//following::span[@data-automation-id='promptIcon'][4]")
//public WebElement homecountryPreHire;


    @FindBy(xpath = "//div[text()='Address Line 1'][1]//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement homeaddressline1PreHire;


    @FindBy(xpath = "//div[text()='Address Line 2'][1]//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement homeaddressline2PreHire;


    @FindBy(xpath = "//label[text()='City'][1]//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement homecityPreHire;

    @FindBy(xpath = "//label[text()='Province or Territory'][1]//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement homeprovincePreHire;

    @FindBy(xpath = "//label[text()='State'][1]//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement homestatePreHire;

    @FindBy(xpath = "//label[text()='Postal Code'][1]//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement homepostalcodePreHire;

    @FindBy(xpath = "//label[text()='Type'][1]//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement hometypePreHire;


    @FindBy(xpath = "//*[@data-automation-id='promptOption' and @title='Create Pre-Hire']")
    private WebElement createprehireLink;

    @FindBy(xpath = "(//*[@data-automation-id='checkboxPanel'])[1]")
    private WebElement AllowdupnamechbxcreateprehireLink;

    @FindBy(xpath = "(//label[text()='First Name']//following::*[@data-automation-id='textInputBox'])[1]")
    private WebElement FNameCreatePreHire;

    @FindBy(xpath = "(//*[@data-automation-id='textInputBox'])[3]")
    private WebElement LNameCreatePreHire;

    @FindBy(xpath = "(//*[@data-automation-id='tabLabel'])[3]")
    private WebElement Conductinfo;

    @FindBy(xpath = "//*[@aria-label='Add Email']")
    private WebElement emailCreatePreHire;

    @FindBy(xpath = "//label[text()='Email Address']//following::input[@data-automation-id='textInputBox']")
    private WebElement enteremailCreatePreHire;

    @FindBy(xpath = "(//*[@data-automation-id='promptIcon'])[6]/div")
    private WebElement typeemailCreatePreHire;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    private WebElement typeemailCreatePreHireSearchbox;

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_okButton']")
    private WebElement okButtonCreatePreHire;

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_doneButton']")
    private WebElement doneButtonCreatePreHire;

    // Hire Employee functionality  --------------------------------

    @FindBy(xpath = "//*[@data-automation-id='promptOption' and @title='Hire Associate']")
    private WebElement hireemployeeLink;

    @FindBy(xpath = "//label[text()='Existing Pre-Hire']")
    private WebElement radioHireEmployee;

    @FindBy(xpath = "//label[text()='Supervisory Organization']//following::*[@data-automation-id='promptIcon'][1]")
    private WebElement suporgHireEmployee;

    @FindBy(xpath = "//label[text()='Supervisory Organization']//following::*[@data-automation-id='promptIcon'][2]")
    private WebElement nameHireEmployee;

    @FindBy(xpath = "(//*[@data-automation-id='searchBox']")
    private WebElement nameHireEmployeeSearchBox;

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_okButton']")
    private WebElement okbuttonHireEmployee;

    @FindBy(xpath = "//*[@data-automation-id='dateWidgetInputBox']")
    private WebElement hiredateHireEmployee;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Reason']//following::input[1]")
    private WebElement reasonHireEmployee;

    @FindBy(xpath = "//label[text()='Position']//following::*[@data-automation-id='promptIcon'][1]")
    private WebElement positionHireEmployee;

    //@FindBy(xpath = "(//label[@data-automation-id='formLabel'])[4]//following::input[1]")  //label[@data-automation-id='formLabel' and text()='Associate Type']//following::input[1]
    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Associate Type']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement empTypeHireEmployee;

    //@FindBy(xpath = "(//label[@data-automation-id='formLabel'])[5]//following::input[1]")
    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Job Profile']//following::input[1]")
    private WebElement jobprofileHireEmployee;

    //@FindBy(xpath = "(//label[@data-automation-id='formLabel'])[6]//following::input[1]")
    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Time Type']//following::input[1]")
    private WebElement timetypeHireEmployee;

    //@FindBy(xpath = "(//label[@data-automation-id='formLabel'])[7]//following::input[1]")
    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Location']//following::input[1]")
    private WebElement locationHireEmployee;

    @FindBy(xpath = "//*[@data-automation-id='formLabel' and text()='Pay Rate Type']//following::*[@data-automation-id='icon'][4]")
    private WebElement payRateHireEmployee;

    @FindBy(xpath = "//*[@data-automation-id='promptOption' and text()='All']")
    private WebElement payratetype_All;//

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and text()='Hourly']")
    private WebElement payratetype_Hourly;

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and text()='Salary']")
    private WebElement payratetype_Salary;

    @FindBy(xpath = "//span[@data-automation-id='fieldSetLegendLabel' and text()='Additional Information']")
    private WebElement clickAdditionalInfo;

    @FindBy(xpath = "//label[text()='Default Weekly Hours']//following::input[@data-automation-id='numericInput'][1]")
    private WebElement defaultWeeklyHours;

    @FindBy(xpath = "//label[text()='Scheduled Weekly Hours']//following::input[@data-automation-id='numericInput'][1]")
    private WebElement scheduledWeeklyHours;


    @FindBy(xpath = "//label[text()='Pay Rate Type']//following::button[@title='Submit']")
    private WebElement submitbtnHireEmployee;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_uic_doneButton' and @title='Done']")
    private WebElement donebtnHireEmployee;

    @FindBy(xpath = "(//*[@class='wd-icon-workday wd-icon'])[1]//following::*[@class='wd-icon-inbox-large wd-icon'][1]")
    private WebElement inboxWD;

    @FindBy(xpath = "//*[text()='Proposed IDs']//following::button[@data-automation-id='addRow'][1]")
    private WebElement addrowmailbox;

    @FindBy(xpath = "//button[@title='Approve']")
    private WebElement btnApprove;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Employee ID']//following::div[2]")
    private WebElement employeeID;

    // View Pre Hire names---------------------------------------
    @FindBy(xpath = "//*[@data-automation-id='promptOption' and @title='Pre-Hire Names']")
    private WebElement prehirenamesLink;

    @FindBy(xpath = "//label[text()='Pre-Hire']//following::*[@data-automation-id='promptIcon']")
    private WebElement prehirenamesTextbox;

    @FindBy(xpath = "//*[@data-automation-id='formLabel' and text()='Pre-Hire']//following::button[@title='OK']")
    private WebElement okbtnPreHireNames;

    @FindBy(xpath = "//*[@title='Pre-Hire Names'][1]")
    private WebElement tagPrehirenames;

    //Create Position ----------------------------------------------------------------------

    @FindBy(xpath = "(//*[@data-automation-id='promptOption'])[1]")
    private WebElement createPositionLink;

    @FindBy(xpath = "//*[@data-automation-id='formLabel']//following::input[1]")
    private WebElement nameOrganizations;//data-automation-id="promptIcon"

    @FindBy(xpath = "//*[@data-automation-id='promptIcon']")
    private WebElement nameOrganization;//data-automation-id="promptIcon"

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_okButton']")
    private WebElement clickOkButton;

    @FindBy(xpath = "//label[text()='Job Posting Title']//following::input[@data-automation-id='textInputBox']")
    private WebElement jobTitle;//*[@data-automation-id='textInputBox]

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Number of Positions']//following::input[@data-automation-id='numericInput']")
    private WebElement NumvofPositions;//*[@data-automation-id='textInputBox]

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Availability Date']//following::*[@data-automation-id='dateTimeWidget'][1]")
    private WebElement avldateCreatePositions;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Earliest Hire Date']//following::*[@data-automation-id='dateTimeWidget'][1]")
    private WebElement earliesthiredateCreatePosition;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='No Job Restrictions']//following::*[@data-automation-id='checkboxPanel'][1]")
    private WebElement jobRestrictionsCheckBox;

    @FindBy(xpath = "//Button[@title='Submit']")
    private WebElement submitbuttonCreatePosition;

    @FindBy(xpath = "//button[@title='Done']")
    private WebElement donebuttonCreatePosition;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Job Family']//following::*[@data-automation-id='promptIcon'][1]")
    private WebElement jobfamilyCreateposition;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Job Profile']//following::*[@data-automation-id='promptIcon'][1]")
    private WebElement jobprofileCreateposition;

    @FindBy(xpath = "//label[text()='Location']//following::*[@data-automation-id='promptIcon'][1]")
    private WebElement locationCreateposition;

    @FindBy(xpath = "//label[text()='Time Type']//following::*[@data-automation-id='promptIcon'][1]")
    private WebElement timetypeCreateposition;

    @FindBy(xpath = "//label[text()='Associate Type']//following::*[@data-automation-id='promptIcon'][1]")
    private WebElement workertypeCreateposition;

    @FindBy(xpath = "//label[text()='Time Type']")
    private WebElement lbltimetypeCreateposition;

    @FindBy(xpath = "//label[text()='Associate Type']")
    private WebElement labelworkertypeCreateposition;

    @FindBy(xpath = "//*[text()='Process Successfully Completed']")
    private WebElement validationCreateposition;


    @FindBy(xpath = "(//label[text()='Time Type']//following::*[@data-automation-id='icon'])[2]")
    private WebElement timetypeeCreateposition;

    @FindBy(xpath = "(//label[text()='Associate Type']//following::*[@data-automation-id='icon'])[4]")
    private WebElement associateTypeeCreateposition;


    @FindBy(xpath = "(//*[@data-automation-id='dateWidgetInputBox'])[1]")
    private WebElement avaibaleDate;

    @FindBy(xpath = "//*[@data-automation-id='inbox_row_title' and contains(text(),empname)]")
    private WebElement inboxMail;

    @FindBy(xpath = "//*[@data-automation-id='inbox_row_title' and contains(text(),empname)]//following::button[@title='Submit']")
    private WebElement inboxSubmit;

    @FindBy(xpath = "//*[@data-automation-id='inbox_row_title' and contains(text(),empname)]//following::input[1]")
    private WebElement countryEmail;

    @FindBy(xpath = "//*[@data-automation-id='inbox_row_title' and contains(text(),empname)]//following::input[2]")
    private WebElement SSNEmail;

    @FindBy(xpath = "//*[@data-automation-id='inbox_row_title' and contains(text(),empname)]//following::input[3]")
    private WebElement ssnNumber;

    //Workday View Hired employee----------------------------------------
    @FindBy(xpath = "//*[@data-automation-id='wd-SearchResultTitle']//preceding::*[@data-automation-id='menuItem'][1]")
    private WebElement allofworkdaylabel;

    @FindBy(xpath = "(//*[@data-automation-id='promptOption'])[1]")
    private WebElement empnameviewhire;

    // Workday Close Position-------------------------------------------------------------------------------------

    @FindBy(xpath = "//div[text()='Close Position']")
    private WebElement linkClosePosition;

    @FindBy(xpath = "//*[@data-automation-id='promptIcon']")
    private WebElement position;//label[text()='Position']//following::input[1]

    @FindBy(xpath = "//button[@title='OK']")
    private WebElement btnokClosePosition;

    @FindBy(xpath = "//label[text()='Close Reason']//following::input[1]")
    private WebElement reasonClosePosition;

    @FindBy(xpath = "//*[@data-automation-id='dateWidgetContainer']")
    private WebElement closedateClosePosition;

    @FindBy(xpath = "//*[@title='Submit']")
    private WebElement btnsubmitClosePosition;

    @FindBy(xpath = "//*[@title='Details and Process' and @data-automation-id='fieldSetLegendLabel']")
    private WebElement tabdetailsClosePosition;

    @FindBy(xpath = "//div[text()='The field Position is required and must have a value.']")
    private WebElement validationstepClosePosition;

    //----------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//*[@data-automation-id='searchBox']")
    private WebElement insidesearchboxcommon;


    //xpath------Home Contact Change---------

    @FindBy(xpath = "//div[text()='Personal Data']")
    private WebElement PersonalDateHCC;

    @FindBy(xpath = "//div[text()='Change My Home Contact Information']")
    private WebElement ChangeMyAddrHCC;

    @FindBy(xpath = "//div[@title='Edit Address']")
    private WebElement EditAddrHCC;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Effective Date']//following::*[@data-automation-id='dateTimeWidget'][1]")
    private WebElement avldateHCC;

    @FindBy(xpath = "(//label[text()='Address Line 1']//following::input[@data-automation-id='textInputBox'])[1]")
    private WebElement AddrLine1HCC;

    @FindBy(xpath = "(//label[text()='City']//following::input[@data-automation-id='textInputBox'])[1]")
    private WebElement cityHCC;

    @FindBy(xpath = "(//label[text()='Postal Code']//following::input[@data-automation-id='textInputBox'])[1]")
    private WebElement PostalHCC;

    @FindBy(xpath = "//label[text()='Province or Territory']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement ProvinceHCC;

    @FindBy(xpath = "//label[text()='State']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement StateHCC;

    @FindBy(xpath = "//*[text()='Phone']")
    private WebElement PhoneHCC;

    @FindBy(xpath = "//*[text()='Phone']//following::button[@data-automation-id='wd-ActiveList-addButton'][1]")
    private WebElement phnAddHCC;

    @FindBy(xpath = "//div[@data-automation-id='selectSelectedOption'and text()='select one']")
    private WebElement phnDeviceHCC;

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and text()='Mobile']")
    private WebElement MobileHCC;

    @FindBy(xpath = "//*[text()='Email']")
    private WebElement EmailHCC;

    @FindBy(xpath = "//*[text()='Email']//following::button[@data-automation-id='wd-ActiveList-addButton'][1]")
    private WebElement EmailAddHCC;

    @FindBy(xpath = "//label[text()='Email Address']//following::*[@data-automation-id='textInputBox'][1]")
    private WebElement EmailIdHCC;

    @FindBy(xpath = "//span[@title='Submit']")
    private WebElement SubmitHCC;

    @FindBy(xpath = " //span[@title='To Do']")
    private WebElement ToBeHCC;


    //WorkContactInformation------------------------------------------------------------------------------------------

    @FindBy(xpath = "//h3[text()='Address']//following::button[@title='Add'][1]")
    private WebElement btnAdd;

    @FindBy(xpath = "//div[text()='Change Work Contact Information']")
    private WebElement ChangeMyWCC;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Effective Date']//following::*[@data-automation-id='dateTimeWidget'][1]")
    private WebElement avldateWCC;

    @FindBy(xpath = "//label[text()='Country']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement CountryWCC;

    @FindBy(xpath = "//label[text()='Visibility']//following::div[@data-automation-id='selectWidget'][1]")
    private WebElement visibilityWCC;

    @FindBy(xpath = "//label[text()='Visibility']//following::div[@data-automation-id='promptOption' and text()='Private'][1]")
    private WebElement visibilityPrivate;

    @FindBy(xpath = "//label[text()='Visibility']//following::div[@data-automation-id='promptOption' and text()='Public'][1]")
    private WebElement visibilityPublic;

    @FindBy(xpath = "//label[text()='State']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement stateWCC;

    @FindBy(xpath = "//h3[text()='Email']//following::div[@title='Edit Email']")
    private WebElement editEmailWCC;

    @FindBy(xpath = "//h3[text()='Phone']//following::div[@title='Edit Phone']")
    private WebElement editPhoneWCC;

    @FindBy(xpath = "(//div[text()='Personal Data'])[1]")
    private WebElement subtabPersonalData;

    //View Contact Information------------------------------------------------------------------------------------

    @FindBy(xpath = "//div[text()='View Contact Information']")
    private WebElement ViewContactInfo;

    @FindBy(xpath = "//h2[text()='Work Contact Information']")
    private WebElement workContactInfo;

    @FindBy(xpath = "//h2[text()='Work Contact Information']//following::span[text()='Addresses']//following::div[text()='Work']//preceding::div[@data-automation-id='textView'][1]")
    private WebElement chkWorkContactAddress;

    @FindBy(xpath = "//h2[text()='Work Contact Information']//following::span[text()='Phones']")
    private WebElement headerPhones;

    @FindBy(xpath = "//span[text()='Phones']//following::div[@data-automation-id='promptOption'][1]")
    private WebElement chkPhoneNumber;

    @FindBy(xpath = "//h2[text()='Work Contact Information']//following::span[text()='Email Addresses']")
    private WebElement headerEmailAddress;

    @FindBy(xpath = "//span[text()='Email Addresses']//following::div[contains(text(),'Work')][1]//preceding::span[2]")
    private WebElement chkEmailAddress;
    //span[text()='Email Addresses']//following::div[contains(text(),'Work')][1]//preceding::div[@data-automation-id='promptOption'][1]


    //Emergency Contact Change -------------------------------------------------------------------------

    @FindBy(xpath = "//div[text()='Change Emergency Contacts']")
    private WebElement ChangeEmergencyCont;

    @FindBy(xpath = "//div[@title='Edit Legal Name']")
    private WebElement editLegalName;

    @FindBy(xpath = "//label[text()='Country']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement countryLegalName;

    @FindBy(xpath = "//label[text()='First Name']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement firstNameEmrCont;

    @FindBy(xpath = "//label[text()='Last Name']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement lastNameEmrCont;

    @FindBy(xpath = "//h3[text()='Relationship']//following::div[@data-automation-id='actionImage'][1]")
    private WebElement editRelationEmrgCont;

    @FindBy(xpath = "//label[text()='Relationship']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement relationEmrgCont;

    @FindBy(xpath = "//h3[text()='Primary Phone']//following::div[@data-automation-id='actionImage'][1]")
    private WebElement editPrimaryPhone;

    @FindBy(xpath = "//label[text()='Phone Device']//following::div[@data-automation-id='selectWidget']")
    private WebElement optionPhoneDevice;

    @FindBy(xpath = "//label[text()='Phone Device']//following::div[@data-automation-id='promptOption' and text()='Mobile']")
    private WebElement phoneDeviceMobile;

    @FindBy(xpath = "//label[text()='Phone Number']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement enterPhoneNumber;

    @FindBy(xpath = "//label[text()='Country Phone Code']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement countryPhoneCode;

    @FindBy(xpath = "//h3[text()='Primary Email']//following::div[@data-automation-id='actionImage'][1]")
    private WebElement editPrimaryEmail;

    @FindBy(xpath = "//label[text()='Address']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement enterPrimaryEMail;

    @FindBy(xpath = "//label[text()='Type']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement optionHomeType;

    //View Emergency Contacts---------------------------------------------------------------------

    @FindBy(xpath = "//div[text()='View Emergency Contacts']")
    private WebElement ViewEmergencyCont;

    @FindBy(xpath = "//span[text()='Emergency Contact']//following::div[@data-automation-id='promptOption'][1]")
    private WebElement checkContName;

    @FindBy(xpath = "//span[text()='Emergency Contact']//following::div[@data-automation-id='promptOption'][3]")
    private WebElement checkContPhNumber;


    //change job -------------------------------------------------------------------------

    @FindBy(xpath = "//*[@data-automation-id='promptOption' and text()='Change Job']")
    private WebElement linkchangeJob;

    @FindBy(xpath = "//*[@data-automation-id='promptIcon']")
    private WebElement workernameChangeJob;

    @FindBy(xpath = "//*[@data-automation-id='promptOption']")
    private WebElement selectoptionChangeJob;

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_okButton']")
    private WebElement btnOKChangeJob;

    @FindBy(xpath = "//*[@aria-label='Edit Start Details']")
    private WebElement editStartDetailsChangeJob;

    @FindBy(xpath = "//div[text()='When do you want this change to take effect?']//following::div[@data-automation-id='dateWidgetContainer'][1]")
    private WebElement dateToChangeEffect;

    @FindBy(xpath = "//div[text()='Why are you making this change?']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement makechangeChangeJob;


    @FindBy(xpath = "//div[text()='Which team will this person be on after this change?']//following::span[@data-automation-id='promptIcon'][1]")
    // @FindBy(xpath = "//div[text()='Which team will this person be on after this change?']//following::input[@data-automation-id='searchBox'][1]")
    private WebElement teamchangeChangeJob;

    @FindBy(xpath = "//div[text()='Which team will this person be on after this change?']//following::input[@data-automation-id='searchBox'][1]")
    private WebElement enterteamChangeJob;


    @FindBy(xpath = "//div[text()='Where will this person be located after this change?']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement changelocationChangeJob;

    @FindBy(xpath = "//div[text()='Where will this person be located after this change?']//following::input[@data-automation-id='searchBox'][1]")
    private WebElement enterlocationChangeJob;

    @FindBy(xpath = "//button[@title='Start']")
    private WebElement btnstartChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Position']")
    private WebElement editpositionChangeJob;

    @FindBy(xpath = "//label[text()='Position']//following::input[@data-automation-id='searchBox'][1]")
    private WebElement enterpositionChangeJob;

    @FindBy(xpath = "//label[text()='Close the current position?']//following::div[@data-automation-id='checkbox']")
    private WebElement closeposChangeJob;

    // @FindBy(xpath = "//*[@aria-label='Edit Job Profile']") //old one
    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Job Profile']")
    private WebElement editjobprofileChangeJob;

    @FindBy(xpath = "//label[text()='Job Profile']//following::input[@data-automation-id='searchBox'][1]")
    private WebElement enterjobprofileChangeJob;

    @FindBy(xpath = "//button[@title='Next' and @data-automation-id='wd-CommandButton_next']")
    private WebElement btnnextChangeJob;

    @FindBy(xpath = "//label[text()='Location']//following::input[@data-automation-id='searchBox'][1]")
    private WebElement locationdetailsChangeJob;//*[@data-automation-id='formLabel']//following::input[1]

    @FindBy(xpath = "//h4[text()='Location Details']//following::div[@data-automation-id='actionImage' and @title='Edit Location Details']")
    private WebElement editlocationdetailsChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Company']")
    private WebElement editCompanyChangeJob;

    @FindBy(xpath = "//label[text()='Company']//following::input[@data-automation-id='searchBox'][1]")
    private WebElement enterCompanyChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Cost Center']")
    private WebElement editCostcenterChangeJob;

    @FindBy(xpath = "//label[text()='Cost Center']//following::input[@data-automation-id='searchBox'][1]")
    private WebElement enterCostcenterChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Business Unit']")
    private WebElement editBusinessUnitChangeJob;

    @FindBy(xpath = "//label[text()='Business Unit']//following::input[@data-automation-id='searchBox'][1]")
    private WebElement enterBusinessUnitChangeJob;

    @FindBy(xpath = "//div[text()='Department']//following::div[@data-automation-id='actionImage' and contains(@title,'Edit Other Row')][1]")
    private WebElement editDepartmentChangeJob;

    //  @FindBy(xpath = "//div[text()='Department']//following::div[@data-automation-id='promptSearchButton'][1]")
    @FindBy(xpath = "//div[text()='Department']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement DepartmentChangeJob;//div[text()='Department']//following::span[@data-automation-id='promptIcon'][1]

    @FindBy(xpath = "//div[text()='Department']//following::input[@data-automation-id='searchBox'][1]")
    private WebElement enterDepartmentChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage']")
    private WebElement editadmindetailsChangeJob;

    @FindBy(xpath = "//label[text()='Associate Type']//following::input[1]")
    public WebElement employeetypeChangeJob;

    @FindBy(xpath = "//label[text()='Time Type']//following::input[1]")
    private WebElement timetypeChangeJob;

    @FindBy(xpath = "//h4[text()='Salary']")
    private WebElement headerSalaryChangeJob;

    @FindBy(xpath = "//h4[text()='Hourly']")
    private WebElement headerHourlyChangeJob;

    @FindBy(xpath = "//h4[text()='Salary']//following::div[@title='Edit Salary']")
    private WebElement editsalaryChangeJob;

    @FindBy(xpath = "//label[text()='Amount']//following::input[@data-automation-id='numericInput'][1]")
    private WebElement amountChangeJob;

    @FindBy(xpath = "//label[text()='Currency']//following::input[1]")
    private WebElement currencyChangeJob;

    @FindBy(xpath = "//label[text()='Frequency']//following::input[1]")
    private WebElement frequencyChangeJob;

    @FindBy(xpath = "//h4[text()='Hourly']//following::div[contains(@title,'Edit Hourly') and @data-automation-id='actionImage']")
    private WebElement edithourlyChangeJob;

    @FindBy(xpath = "//button[@title='Submit']")
    private WebElement btnsubmitChangeJob;

    //span[text()='Details and Process']

    @FindBy(xpath = "//button[@title='Done']")
    private WebElement btndoneChangeJob;

    @FindBy(xpath = "//span[text()='Details and Process']")
    private WebElement linkdetailsChangeJob;

    @FindBy(xpath = "//div[text()='Process'][1]")
    private WebElement processTabChangeJob;


    @FindBy(xpath = "//label[text()='Overall Process']//following::*[@data-automation-id='promptOption']")
    private WebElement validationstepChangeJob;

    //JOB Change common--------------------
    @FindBy(xpath = "//label[text()='All of Workday']")
    private WebElement allOfWorkday;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[text()='Process'][1]")
    private WebElement processtabJobChange;

    @FindBy(xpath = " //span[@title='Done']")
    private WebElement btndoneJC;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[2]")
    private WebElement overallStatusJobChange;

    @FindBy(xpath = "//*[text()='Awaiting Action']")
    private WebElement checkAwaitingAction;

//Job Change for Location-----------------------------------------------------------------------------------------------------

// Job Location----------------------------------------

    @FindBy(xpath = "//div[text()='Job Change']")
    private WebElement JobchangeLocChangeJob;

    @FindBy(xpath = "//div[text()='Change Location']")
    private WebElement LocationChangeJob;

    @FindBy(xpath = "//label[text()='I certify that the information provided in this return is accurate and complete.']//following::div[@data-automation-id='checkboxPanel']")
    private WebElement CertifyCheckbox;

    // Propose Compensation Hire-----------------------------------
    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    private WebElement compValProCompHire;

    @FindBy(xpath = "//div[@title='Edit Business Unit']")
    private WebElement bUEditProCompHire;

    @FindBy(xpath = "//div[@title='Edit Other Row 1']")
    //@FindBy(xpath = "//div[text()='Department']//following::div[ @data-automation-id='actionImage'][1]")
    private WebElement deptEditProCompHire;

    @FindBy(xpath = "(//div[@data-automation-id='icon'])[5]")
    private WebElement deptValEditProCompHire;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[2]")
    private WebElement overallStatusProCompHire;

    @FindBy(xpath = "//*[text()='Awaiting Action']")
    private WebElement statusProCompHire;

    @FindBy(xpath = "//div[@title='Edit Cost Center']")
    private WebElement costEditProCompHire;

    @FindBy(xpath = "//div[@title='Edit Company']")
    private WebElement compEditProCompHire;

    @FindBy(xpath = "//*[text()='Open']")
    private WebElement openProCompHire;

    @FindBy(xpath = "//span[@title='Open']")
    private WebElement openbutProCompHire;


    @FindBy(xpath = "//div[@data-automation-id='popUpDialog']")
    private WebElement helpAvaiProCompHire;

    @FindBy(xpath = "//div[@data-automation-id='closeButton']")
    private WebElement helpcloseProCompHire;


    @FindBy(xpath = "//span[@data-automation-id='inbox_toggle_button']")
    private WebElement inboxMaxProCompHire;

    @FindBy(xpath = "//div[@title='Edit Salary']")
    private WebElement editSalaryProCompHire;

    @FindBy(xpath = " //div[@title='Edit Hourly']")
    private WebElement edithourProCompHire;


    @FindBy(xpath = "//input[@data-automation-id='numericInput']")
    private WebElement amountProCompHire;

    @FindBy(xpath = "//span[@title='Submit']")
    private WebElement submitProCompHire;

    @FindBy(xpath = "//span[text()='Country']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement countryClickProCompHire;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    private WebElement countryProCompHire;

    @FindBy(xpath = "//span[text()='National ID Type']//following::span[@data-automation-id='promptIcon'][2]")
    private WebElement nationalIDProCompHire;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    private WebElement nationalValIDProCompHire;

    @FindBy(xpath = "//span[text()='Add/Edit ID']//following::input[@data-automation-id='textInputBox']")
    private WebElement addEditIDProCompHire;

    @FindBy(xpath = "//span[@title='Approve']")
    private WebElement approveProCompHire;

    @FindBy(xpath = " //span[@title='Done']")
    private WebElement doneProCompHire;

    @FindBy(xpath = "//div[text()='Associate History']")
    private WebElement workerHisProCompHire;

    @FindBy(xpath = "//div[text()='View Associate History']")
    private WebElement viewWorkerHisProCompHire;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[text()='Process'][1]")
    private WebElement processProCompHire;

    @FindBy(xpath = "//div[text()='Awaiting Action']//following::div[@data-automation-id='promptOption']")
    private WebElement awaitingActProCompHire;

    @FindBy(xpath = "//label[text()='All of Workday']")
    private WebElement allOfWorkdayProCompHire;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    private WebElement countryTxtProCompHire;

    @FindBy(xpath = "//label[text()='Country']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement countryoptsrchProCompHire;

    @FindBy(xpath = "//div[text()='Security Profile']")
    private WebElement securityprofileActions;

    @FindBy(xpath = "//div[text()='Start Proxy']")
    private WebElement startproxyActions;

    //Onboarding -----------------------------------------------------------


    @FindBy(xpath = "//label[text()='Proposed Pay Group']//following::*[@data-automation-id='icon'][4]")
    private WebElement payGrpPromtOnboarding;

    @FindBy(xpath = "//*[@data-automation-id='globalSearchInput']//preceding::img//following::*[@class='wd-icon-inbox-large wd-icon'][1]")
    private WebElement inboxOnboarding;

    @FindBy(xpath = "//div[@title='Edit Gender']")
    private WebElement editGenderOnboarding;

    @FindBy(xpath = "//div[@data-automation-id='selectSelectedOption']")
    private WebElement genderOptionOnboarding;

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and @title='Male']")
    private WebElement genderValOnboarding;

    @FindBy(xpath = "//div[@title='Edit Date of Birth']")
    private WebElement editDOBOnboarding;

    @FindBy(xpath = "//span[@title='Submit']")
    private WebElement submitOnboarding;

    @FindBy(xpath = "//div[@title='Edit Legal Name']")
    private WebElement legalEditOnboarding;

    @FindBy(xpath = "//div[@title='Edit Relationship']")
    private WebElement relationshipEditOnboarding;

    @FindBy(xpath = "//button[@title='Add Primary Phone']")
    private WebElement mobileEditOnboarding;

    @FindBy(xpath = "(//input[@data-automation-id='textInputBox'])[1]")
    private WebElement mobileValOnboarding;

    @FindBy(xpath = "//label[text()='Country Phone Code']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement countryCode;

    @FindBy(xpath = "//div[@data-automation-id='selectSelectedOption']")
    private WebElement mobileDevOnboarding;

    @FindBy(xpath = "//button[@title='Add Primary Email']")
    private WebElement EmailEditOnboarding;

    @FindBy(xpath = "//button[@title='Add Primary Phone']")
    private WebElement phnEditOnboarding;

    @FindBy(xpath = "(//label[text()='Address']//following::*[@data-automation-id='textInputBox'])[1]")
    private WebElement phnEditmailOnboarding;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    private WebElement relationshipValOnboarding;

    @FindBy(xpath = "//*[text()='Primary Email']//following::span[@title='Add'][1]")
    private WebElement primaryAddOnboarding;

    @FindBy(xpath = "//input[@data-automation-id='textInputBox']")
    private WebElement emailTextOnboarding;

    @FindBy(xpath = "//*[text()='Primary Phone']//following::span[@title='Add'][1]")
    private WebElement primaryPhoneOnboarding;

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and @title='Mobile']")
    private WebElement phnDeviceOnboarding;

    @FindBy(xpath = "//label[text()='Phone Number']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement phnNbrTextOnboarding;

    @FindBy(xpath = "//span[@title='Save for Later']//preceding::span[@title='Submit']")
    private WebElement inboxSubmitOnboarding;

    @FindBy(xpath = "//span[@data-automation-id='radioBtn'][1]")
    private WebElement actTypecheckingOnboarding;

    @FindBy(xpath = "//span[@data-automation-id='radioBtn'][1]")
    private WebElement actTypeSaveOnboarding;

    @FindBy(xpath = "//label[text()='Bank Name']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement bankNameOnboarding;

    @FindBy(xpath = "//label[text()='Institution Number']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement institutionNbrOnboarding;

    @FindBy(xpath = "//label[text()='Routing Transit Number']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement routingTransitNbrOnboarding;

    @FindBy(xpath = "//label[text()='Bank Identification Code']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement bankIdentificationCodeOnboarding;

    @FindBy(xpath = "//label[text()='Account Number']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement actNbrOnboarding;

    @FindBy(xpath = "//label[text()='Branch ID']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement branchIDOnboarding;

    @FindBy(xpath = "//span[@title='OK']")
    private WebElement okOnboarding;

    @FindBy(xpath = "//span[@title='Details and Process']")
    private WebElement detailsTabOnboarding;

    @FindBy(xpath = "(//div[text()='Details']//following::div[text()='Process'])[1]")
    private WebElement processOnboarding;

    @FindBy(xpath = "//div[@data-automation-id='gridFullscreenIconButton']")
    private WebElement inboxFullScreenOnboarding;

    @FindBy(xpath = "(//div[@data-automation-id='checkboxPanel'])[3]")
    private WebElement provinceCheckboxOnboarding;

    @FindBy(xpath = "(//div[@data-automation-id='checkboxPanel'])[4]")
    private WebElement federalCheckboxOnboarding;

    @FindBy(xpath = "//button[@data-automation-id='asyncNotificationCloseButton']")
    private WebElement inboxcloseAppOnboarding;

    @FindBy(xpath = "(//div[@data-automation-id='checkboxPanel'])[3]")
    private WebElement provinceOnboarding;

    @FindBy(xpath = "(//div[@data-automation-id='checkboxPanel'])[4]")
    private WebElement fedralOnboarding;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    private WebElement NoRadioOnboarding;

    @FindBy(xpath = "(//h3[text()='Select a veteran status']//following::div[@data-automation-id='icon'])[4]")
    private WebElement veteranOnboarding;

    @FindBy(xpath = "//div[@title='Edit Race/Ethnicity']")
    private WebElement EditRaceOnboarding;

    // @FindBy(xpath = "(//label[text()='Race/Ethnicity']//following::div[@data-automation-id='icon'])[4]")
    @FindBy(xpath = "//div[@data-automation-id='promptSearchButton']")
    private WebElement RaceOnboarding;

    @FindBy(xpath = "(//label[text()='Marital Status']//following::div[@data-automation-id='icon'])[4]")
    private WebElement MaritalOnboarding;

    @FindBy(xpath = "(//label[text()='Routing Transit Number']//following::input[@data-automation-id='textInputBox'])[1]")
    private WebElement RoutingOnboarding;

    @FindBy(xpath = "(//div[@data-automation-id='checkboxPanel'])[2]")
    private WebElement chanOnboarding;

    @FindBy(xpath = "(//span[@data-automation-id='promptIcon'])[1]")
    private WebElement SinOnboarding;

    @FindBy(xpath = "//span[@title='OK']")
    private WebElement OkOnboarding;

    @FindBy(xpath = "//label[text()='Marital Status']")
    private WebElement MStatusOnboarding;

    @FindBy(xpath = "//span[@data-automation-id='workerProfileMenuItemLabel' and text()='Job']")
    private WebElement tabJob;

    @FindBy(xpath = "//span[text()='More']//following::div[@data-automation-id='popupOption' and text()='Manager History']")
    private WebElement subTabManagerHistory;

    //    xpaths for the three dots selection
    @FindBy(xpath = "(//div[@data-automation-id='relatedActionsItemLabel' and text()='Security Profile'])")
    private WebElement securityProfile;

    @FindBy(xpath = "//*[text()='Start Proxy']")
    private WebElement startProxyFromAssociateName;

    //------------------------------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//label[text()='Associate ID']//following::div[@data-automation-id='textView'][1]")
    private WebElement associateID;


    //------------------------------------------------------------------------------------------------------------------------------------------------
    String associate_ID = null;
    String empname1 = null;

    public WorkdayCommon getWorkdayCommonObj() {
        return workdaycommon;
    }


    public Temp_HirefunctionalityPage() throws IOException {
    }

//******************************BP Specific functions**********************************************

    String Positionglobal = null;

    public void CreatePosname() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hhmmss");
        String time = dateFormat.format(now);
        String Position = Constants.POSITIONCREATEPOSHIREEMP;
        Positionglobal = Position.concat(time);
    }

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

        /* //uncomment when needed
        jobfamilyCreateposition.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(JobFamily, Keys.ENTER);
        workdaycommon.scrolltoElement(jobprofileCreateposition);
        workdaycommon.userWait(4000);
        jobprofileCreateposition.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(JobProfile, Keys.ENTER);
        workdaycommon.scrolltoElement(locationCreateposition);
        workdaycommon.userWait(3000);
        locationCreateposition.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Location);
        workdaycommon.userWait(2000);
        log.info("Location selected......");
        workdaycommon.scrolltoElement(lbltimetypeCreateposition);
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
  */
        submitbuttonCreatePosition.click();
        WebActionsUtil.explicitWait(driver, validationCreateposition, "click");
        if (validationCreateposition.isDisplayed()) {
            test.pass("The requested position(s) is/are created successfully");
            donebuttonCreatePosition.click();
        } else
            test.fail("Failed while creating a position");

    }

    public void createPrehire(String Country, String Home_addressline1, String Home_addressline2, String Home_city, String Home_province, String Home_postalcode, String Home_type, String Work_addressline1, String Work_type) throws Exception {
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
                homeaddressline1PreHire.sendKeys(Home_addressline1, Keys.ENTER);

                workdaycommon.userWait(2000);
                homeaddressline2PreHire.sendKeys(Home_addressline2, Keys.ENTER);

                workdaycommon.userWait(2000);
                homecityPreHire.sendKeys(Home_city, Keys.ENTER);


                if (Country == "Canada") {

                    log.info("Canada data");
                    workdaycommon.userWait(2000);
                    homeprovincePreHire.click();
                    workdaycommon.userWait(1000);
                    insidesearchboxcommon.sendKeys(Home_province, Keys.ENTER);
                } else {
                    log.info("US data");
                    workdaycommon.userWait(2000);
                    homestatePreHire.click();
                    workdaycommon.userWait(1000);
                    insidesearchboxcommon.sendKeys("NH", Keys.ENTER);
                }

                workdaycommon.userWait(2000);
                homepostalcodePreHire.sendKeys(Home_postalcode, Keys.ENTER);

                workdaycommon.userWait(2000);
                hometypePreHire.click();
                workdaycommon.userWait(1000);
                insidesearchboxcommon.sendKeys(Home_type, Keys.ENTER);

          /*      //address 2

                workdaycommon.scrolltoElement(addressaddPreHire);
                workdaycommon.userWait(3000);
                addressaddPreHire.click();

                workdaycommon.userWait(3000);
                //workaddressline1PreHire.sendKeys("BuildingNo:9987",Keys.ENTER);
                workaddressline1PreHire.sendKeys(Work_addressline1,Keys.ENTER);

                workdaycommon.userWait(3000);
                workaddressline2PreHire.sendKeys("CarioStreet",Keys.ENTER);
                // workaddressline2PreHire.sendKeys(Work_addressline2,Keys.ENTER);

                workdaycommon.userWait(3000);
                //workcityPreHire.sendKeys("Toronto",Keys.ENTER);
                workcityPreHire.sendKeys(Home_city,Keys.ENTER);

                workdaycommon.scrolltoElement(workprovincePreHire);
                workdaycommon.userWait(3000);
                workprovincePreHire.click();
                workdaycommon.userWait(1000);
                //insidesearchboxcommon.sendKeys("Alberta",Keys.ENTER);
                insidesearchboxcommon.sendKeys(Home_province,Keys.ENTER);

                workdaycommon.userWait(3000);
                //workpostalcodePreHire.sendKeys("100002",Keys.ENTER);
                workpostalcodePreHire.sendKeys(Home_postalcode,Keys.ENTER);

                workdaycommon.userWait(3000);
                worktypePreHire.click();
                workdaycommon.userWait(1000);
                //insidesearchboxcommon.sendKeys("Work",Keys.ENTER);
                insidesearchboxcommon.sendKeys(Work_type,Keys.ENTER);
                workdaycommon.userWait(4000);
*/
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


    public void viewPreHirenames() throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            log.entry();
            String empname = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
            workdaycommon.searchbySearchBox(Constants.SRCHPREHIRENAMES);
            log.debug("Click on Pre-Hire names link .......");
            prehirenamesLink.click();
            driverWrapper.waitForPageLoaded();
            log.info("Entering Pre hire names in textbox......");
           /* prehirenamesTextbox.clear();
            prehirenamesTextbox.sendKeys(empname,Keys.ENTER);*/
            prehirenamesTextbox.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(empname, Keys.ENTER);
            okbtnPreHireNames.click();
            workdaycommon.userWait(5000);
            workdaycommon.takescreenshotUI("View_Pre-Hire", this.FNAMECREATEPREHIRE1);
            log.debug("Pre Hire Names Listed........");
            try {
                if (tagPrehirenames.isDisplayed()) {
                    test.pass("Created Pre-Hire is successfully displayed in pre-hire names");
                }
            } catch (java.util.NoSuchElementException e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Failed creating Pre-Hire");
            }

        } catch (Exception e) {
            workdaycommon.takescreenshotUI("Exception", this.FNAMECREATEPREHIRE1);
            log.error("Exception/Issue occurred:" + e.getMessage());
            test.fail(e.getMessage());
        }
    }

    public void Hire(String POSITION1, String SUPORG, String Country, String GovID) throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            log.entry();
            //String empname = Constants.FNAMECREATEPREHIRE + " " + Constants.LNAMECREATEPREHIRE;
            String empname = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
            workdaycommon.searchbySearchBox(Constants.SRCHHIREEMP);
            log.debug("Click on Hire Employee Link");
            hireemployeeLink.click();
            driverWrapper.waitForPageLoaded();
            log.info("Entering Supervisory Organization for hire employee........");
            /*suporgHireEmployee.clear();
            suporgHireEmployee.sendKeys(SUPORG,Keys.ENTER);*/
            workdaycommon.userWait(3000);
            suporgHireEmployee.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(SUPORG, Keys.ENTER);
            workdaycommon.userWait(5000);
            // radioHireEmployee.click();
            log.info("Entering Pre hire name........");
            nameHireEmployee.click();
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys(empname, Keys.ENTER);
            log.info("The employee name is : " + empname);
            workdaycommon.userWait(2000);
            okbuttonHireEmployee.click();
            workdaycommon.userWait(3000);
            log.info("Entering Hire employee details........");
            String pattern = "MM/dd/YYYY";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(new Date());
            // log.info(date);
            if (driverWrapper.isElementPresent(hiredateHireEmployee)) {
                log.info("job details page");
                for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                    elem.sendKeys(date);
                    elem.sendKeys(Keys.TAB);
                    elem.sendKeys(Keys.TAB);
                }
            }
//            positionHireEmployee.click();
//            userWait(1000);
//
//            insidesearchboxcommon.sendKeys(POSITION1,Keys.ENTER);
            workdaycommon.userWait(5000);
//            positionHireEmployee.clear();
//            insidesearchboxcommon.sendKeys(POSITION1, Keys.ENTER);
            insidesearchboxcommon.sendKeys(POSITION1);
            workdaycommon.userWait(5000);
            insidesearchboxcommon.sendKeys(Keys.TAB);
            workdaycommon.userWait(4000);

            empTypeHireEmployee.clear();
            empTypeHireEmployee.sendKeys(Constants.EMPTYPEHIREEMP, Keys.ENTER);
            workdaycommon.userWait(4000);
            // This Details are auto-populated when Position details are entered hence commented below code
           /* jobprofileHireEmployee.clear();
            jobprofileHireEmployee.sendKeys(Constants.JOBPROFILEHIREEMP,Keys.TAB);
//            userWait(5000);
            Thread.sleep(4000);

            timetypeHireEmployee.clear();
            timetypeHireEmployee.sendKeys(Constants.TIMETYPEHIREEMP, Keys.ENTER);
//            userWait(5000);
            Thread.sleep(4000);
            locationHireEmployee.clear();
            //locationHireEmployee.sendKeys(Constants.LOCATIONHIREEMP, Keys.ENTER);
            locationHireEmployee.sendKeys(SUPORG, Keys.ENTER);
//            userWait(5000);*/

            workdaycommon.userWait(5000);
            submitbtnHireEmployee.click();
            driverWrapper.waitForPageLoaded();
            workdaycommon.userWait(5000);
            workdaycommon.takescreenshotUI("Employee_hire_complete", FNAMECREATEPREHIRE1);

            workdaycommon.scroll();

            donebtnHireEmployee.click();
            log.debug("Hire Employee done.......");
            inboxWD.click();
            workdaycommon.userWait(2000);
            inboxMail.click();
            inboxSubmit.click();
            log.debug("Organizational assignments submitted to Hired employee........");
            workdaycommon.userWait(5000);
            //Approve from email
            workdaycommon.homepageWD.click();
            workdaycommon.userWait(2000);
            inboxWD.click();

            inboxMail.click();
            addrowmailbox.click();
            log.info("Entering Government ID details.......");

            countryEmail.clear();
            countryEmail.sendKeys(Country, Keys.ENTER);
            workdaycommon.userWait(3000);
            SSNEmail.clear();
            SSNEmail.sendKeys(GovID);
            workdaycommon.userWait(5000);
            ssnNumber.clear();
            ssnNumber.sendKeys(this.SSNNO, Keys.TAB);
            workdaycommon.userWait(3000);
            //driver.findElement(By.xpath("//*[@data-automation-id='inbox_row_title' and contains(text(),empname)]//following::button[@title='Approve']")).click();
            btnApprove.click();
            workdaycommon.userWait(3000);
            log.debug("Government ID updated, Hire completed and approved successfully.......");
            log.exit();
        } catch (Exception e) {
            workdaycommon.takescreenshotUI("Exception", this.FNAMECREATEPREHIRE1);
            log.error("Exception/Issue occurred:" + e.getMessage());
            test.fail(e.getMessage());
        }
    }

    public void viewHiredEmployee() throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            log.entry();
            locationHireEmployee.clear();
            String empname = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
            workdaycommon.userWait(3000);
            workdaycommon.searchbySearchBox(empname);
            WebActionsUtil.explicitWait(driver, allofworkdaylabel, "click");
            allofworkdaylabel.click();
            workdaycommon.userWait(2000);
            //driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and @title=empname]")).click();
            empnameviewhire.click();
            workdaycommon.userWait(7000);
            workdaycommon.takescreenshotUI("View_HireEmployee", this.FNAMECREATEPREHIRE1);
            if (employeeID.isDisplayed()) {
                String name = employeeID.getText();
                test.pass("Employee: " + this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1 + " is Hired Successfully. The Employee ID is :" + name);
            } else
                test.fail("Unable to view hired employee");

        } catch (Exception e) {
            workdaycommon.takescreenshotUI("Exception", this.FNAMECREATEPREHIRE1);
            log.error("Exception/Issue occurred:" + e.getMessage());
            test.fail(e.getMessage());
        }
    }

    public void ClosePosition(String POSITION1) {
        try {
            workdaycommon.setDriver(driverWrapper);
            log.entry();
            workdaycommon.searchbySearchBox(Constants.SRCHCLOSEPOSITION);
            linkClosePosition.click();
            log.info("Navigating to Close position page");
            WebActionsUtil.explicitWait(driver, position, "click");
            position.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(POSITION1, Keys.ENTER);
            workdaycommon.selectfromduplicates(POSITION1);
            log.info("Entering the Position to be closed");
            btnokClosePosition.click();
            workdaycommon.userWait(2000);
            //reasonClosePosition.click();
            reasonClosePosition.sendKeys(" No longer needed", Keys.TAB);
            workdaycommon.userWait(2000);
            log.info("Entering the reason for closing the position");
            String pattern = "MM/dd/YYYY";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date1 = simpleDateFormat.format(new Date());
            //log.info(date1);
            if (driverWrapper.isElementPresent(closedateClosePosition)) {
                for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                    elem.sendKeys(date1);
                    elem.sendKeys(Keys.TAB);
                    elem.sendKeys(Keys.TAB);
                }
            }
            btnsubmitClosePosition.click();
            workdaycommon.userWait(4000);
            test.pass("The requested position " + POSITION1 + " closed successfully");
            log.info("The requested position " + POSITION1 + " closed successfully");
            //tabdetailsClosePosition.click();
            //   if (successClosePosition.isDisplayed()) {
            //------validating Position has closed---------------------
     /*   workdaycommon.searchbySearchBox(Constants.SRCHCLOSEPOSITION);
        linkClosePosition.click();
        WebActionsUtil.explicitWait(driver, position, "click");
        position.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(POSITION1);
        btnokClosePosition.click();
        String errmsg = "The field Position is required and must have a value.";
        if (validationstepClosePosition.getText().equals(errmsg)) {
            test.pass("The requested position " + POSITION1 + " closed successfully");
            log.info("The requested position " + POSITION1 + " closed successfully");
        } else
            test.fail("Failed closing the Position");
        log.info("Failed closing the Position");
    } */
        } catch (Exception e) {
            test.fail("Exception/Issue Occurred: " + e.getMessage());
            log.error("Exception/Issue Occurred: " + e.getMessage());
        }
    }


    public void Hire_HireAssociate(String Reason, String SUPORG, String WorkerType, String JobProfile, String TimeType, String Location, String PayRateType, String HireDate) throws Exception {

        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
            log.entry();
            log.info("Starting with Hire Employee-->" + FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1);

            String empname = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
            // String empname = FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1;
            //String empname = "TestSafiya TestScipio";
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
            JavascriptExecutor jst = (JavascriptExecutor) driver;

            insidesearchboxcommon.sendKeys(Reason, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clickreason = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + Reason + "')]"));
            workdaycommon.scrolltoElement(clickreason);
            WebActionsUtil.explicitWait(driver, clickreason, "click");
            clickreason.click();


            workdaycommon.scrolltoElement(positionHireEmployee);
            jst.executeScript("arguments[0].click () ", positionHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Positionglobal, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clickposition = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + Positionglobal + "')]"));
            workdaycommon.scrolltoElement(clickposition);
            WebActionsUtil.explicitWait(driver, clickposition, "click");
            clickposition.click();


            workdaycommon.scrolltoElement(empTypeHireEmployee);
            jst.executeScript("arguments[0].click () ", empTypeHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(WorkerType, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clickworkertype = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + WorkerType + "')]"));
            workdaycommon.scrolltoElement(clickworkertype);
            WebActionsUtil.explicitWait(driver, clickworkertype, "click");
            clickworkertype.click();


            workdaycommon.scrolltoElement(jobprofileHireEmployee);
            jst.executeScript("arguments[0].click () ", jobprofileHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(JobProfile, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clickjobprofile = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + JobProfile + "')]"));
            workdaycommon.scrolltoElement(clickjobprofile);
            WebActionsUtil.explicitWait(driver, clickjobprofile, "click");
            clickjobprofile.click();


            workdaycommon.scrolltoElement(timetypeHireEmployee);
            jst.executeScript("arguments[0].click () ", timetypeHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(TimeType, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clicktimetype = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + TimeType + "')]"));
            workdaycommon.scrolltoElement(clicktimetype);
            WebActionsUtil.explicitWait(driver, clicktimetype, "click");
            clicktimetype.click();


            workdaycommon.scrolltoElement(locationHireEmployee);
            jst.executeScript("arguments[0].click () ", locationHireEmployee);
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Location, Keys.ENTER);
            workdaycommon.userWait(2000);
            WebElement clicklocation = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + Location + "')]"));
            workdaycommon.scrolltoElement(clicklocation);
            WebActionsUtil.explicitWait(driver, clicklocation, "click");
            clicklocation.click();


            workdaycommon.scrolltoElement(payRateHireEmployee);
            if (PayRateType.contains("Hourly")) {
                log.info("PayRateType -> " + PayRateType);
                payRateHireEmployee.click();
                try {
                    executor.executeScript("arguments[0].click();", payratetype_All);
                } catch (Exception e) {
                    log.info("The ALL subtype in payrate type is not available");
                }
                executor.executeScript("arguments[0].click();", payratetype_Hourly);
                workdaycommon.userWait(2000);
            } else if (PayRateType.contains("Salary")) {
                log.info("PayRateType -> " + PayRateType);
                payRateHireEmployee.click();
                try {
                    executor.executeScript("arguments[0].click();", payratetype_All);
                } catch (Exception e) {
                    log.info("The ALL subtype in payrate type is not available");
                }
                workdaycommon.scrolltoElement(payratetype_Salary);
                executor.executeScript("arguments[0].click();", payratetype_Salary);
                workdaycommon.userWait(2000);
            }

            if (TimeType.equals("Part time")) {
                workdaycommon.scrolltoElement(clickAdditionalInfo);
                clickAdditionalInfo.click();
                workdaycommon.userWait(1000);
                workdaycommon.scrolltoElement(defaultWeeklyHours);
                defaultWeeklyHours.clear();
                workdaycommon.userWait(3000);
                defaultWeeklyHours.sendKeys("20", Keys.TAB);
                workdaycommon.userWait(2000);
                scheduledWeeklyHours.clear();
                workdaycommon.userWait(3000);
                scheduledWeeklyHours.sendKeys("20", Keys.ENTER);
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

    public void Hire_OrganizationAssignments(String Company, String CostCenter, String BusinessUnit, String Department) throws Exception {

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
            compValProCompHire.sendKeys(Company, Keys.ENTER);
            workdaycommon.userWait(1000);
            //Cost center
            workdaycommon.scrolltoElement(costEditProCompHire);
            WebActionsUtil.explicitWait(driver, costEditProCompHire, "click");
            costEditProCompHire.click();
            workdaycommon.userWait(2000);
            compValProCompHire.sendKeys(CostCenter, Keys.ENTER);
            workdaycommon.userWait(1000);
            //Business Unit
            workdaycommon.scrolltoElement(bUEditProCompHire);
            WebActionsUtil.explicitWait(driver, bUEditProCompHire, "click");
            bUEditProCompHire.click();
            workdaycommon.userWait(2000);
            compValProCompHire.sendKeys(BusinessUnit, Keys.ENTER);
            workdaycommon.userWait(3000);
            //Department
            workdaycommon.scrolltoElement(deptEditProCompHire);
            WebActionsUtil.explicitWait(driver, deptEditProCompHire, "click");
            deptEditProCompHire.click();
            workdaycommon.userWait(2000);
            deptValEditProCompHire.click();
            workdaycommon.userWait(2000);
            compValProCompHire.sendKeys(Department, Keys.ENTER);
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

    public void Hire_EditID(String Country, String GovID, String SSNNumber) throws Exception {

        try {
            workdaycommon.setDriver(driverWrapper);
            log.entry();
            log.info("Starting with Hire Employee-->" + FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1);

            String empname = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
            // String empname = FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1;

            log.info("Propose Empname--->" + empname);

            log.info("...Enter Edit ID....");
            //Edit IDs
            openProCompHire.click();
            workdaycommon.userWait(4000);
            addrowmailbox.click();
            log.info("Entering Government ID details......." + Country);
            log.info("Entering Government ID details......." + GovID);
            log.info("Entering Government ID details......." + SSNNumber);
            WebActionsUtil.explicitWait(driver, countryClickProCompHire, "click");
            countryClickProCompHire.click();
            workdaycommon.userWait(2000);
            countryProCompHire.sendKeys(Country, Keys.TAB);
            workdaycommon.userWait(2000);
            nationalValIDProCompHire.sendKeys(GovID, Keys.TAB);
            workdaycommon.userWait(2000);
            addEditIDProCompHire.sendKeys(SSNNumber, Keys.ENTER);
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

    public void Hire_ProposeCompensation(String Amount, String Country) throws Exception {

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
            amountProCompHire.sendKeys(Amount, Keys.ENTER);
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


    public void ProposeCompHire(String Reason, String POSITION1, String SSNNumber, String SUPORG, String Country, String GovID, String Company, String CostCenter) throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            log.entry();
            log.info("Starting with Hire Employee-->" + FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1);

            String empname = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
            // String empname = FNAMECREATEPREHIRE1 + " " + LNAMECREATEPREHIRE1;

            log.info("Propose Empname--->" + empname);


            workdaycommon.searchbySearchBox(Constants.SRCHHIREEMP);
            log.debug("Click on Hire Employee Link");
            hireemployeeLink.click();
            driverWrapper.waitForPageLoaded();
            log.info("Entering Supervisory Organization for hire employee........");
            workdaycommon.userWait(3000);
            suporgHireEmployee.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(SUPORG, Keys.ENTER);
            workdaycommon.userWait(3000);
            workdaycommon.selectfromduplicates(SUPORG);
            workdaycommon.userWait(3000);
            log.info("Entering Pre hire name........" + empname);
            nameHireEmployee.click();
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys(empname, Keys.ENTER);
            workdaycommon.selectfromduplicates(empname);
            log.info("The employee name is : " + empname);
            workdaycommon.userWait(2000);
            okbuttonHireEmployee.click();
            workdaycommon.userWait(3000);
            log.info("Entering Hire employee details........");
            String pattern = "MM/dd/YYYY";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(new Date());
            // log.info(date);
            if (driverWrapper.isElementPresent(hiredateHireEmployee)) {
                log.info("job details page");
                for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                    elem.sendKeys(date);
                    elem.sendKeys(Keys.TAB);
//                    elem.sendKeys(Keys.TAB);
                }
            }
            insidesearchboxcommon.sendKeys(Reason, Keys.TAB);
            workdaycommon.userWait(5000);

            insidesearchboxcommon.sendKeys(POSITION1, Keys.ENTER);
            workdaycommon.selectfromduplicates(POSITION1);
            insidesearchboxcommon.sendKeys(Keys.TAB);
            workdaycommon.userWait(5000);
            empTypeHireEmployee.clear();
            workdaycommon.userWait(4000);
            empTypeHireEmployee.sendKeys(Constants.EMPTYPEHIREEMP, Keys.ENTER);
            workdaycommon.userWait(5000);
// This code can be used when required - These are other fields in the same page
            /*
            insidesearchboxcommon.sendKeys(POSITION1,Keys.ENTER);
            workdaycommon.selectfromduplicates(POSITION1);
            workdaycommon.userWait(5000);
            insidesearchboxcommon.sendKeys(Keys.TAB);
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys(Constants.EMPTYPEHIREEMP,Keys.TAB);
                workdaycommon.scrolltoElement(reason1HireEmployee);
                reason1HireEmployee.click();
                workdaycommon.userWait(1000);
                String Reason = "New Hire";
                insidesearchboxcommon.sendKeys(Reason,Keys.ENTER);
                workdaycommon.userWait(7000);
                workdaycommon.selectfromduplicates(Reason);
                workdaycommon.userWait(2000);
                workdaycommon.scrolltoElement(empTypeHireEmployee);
                empTypeHireEmployee.click();
                workdaycommon.userWait(1000);
                insidesearchboxcommon.sendKeys(Constants.EMPTYPEHIREEMP, Keys.ENTER);
                workdaycommon.userWait(9000);
                */

            empTypeHireEmployee.click();
            workdaycommon.userWait(5000);
            insidesearchboxcommon.sendKeys(Constants.EMPTYPEHIREEMP, Keys.ENTER);
            workdaycommon.userWait(5000);
            insidesearchboxcommon.sendKeys(Keys.TAB);
            workdaycommon.userWait(9000);
            //  insidesearchboxcommon.sendKeys(Keys.TAB);

            // jobprofileHireEmployee.click();
            workdaycommon.scrolltoElement(jobprofileHireEmployee);
            workdaycommon.userWait(5000);

            if (SUPORG.contains("Canada")) {
                log.info("Canada Region.....");
                insidesearchboxcommon.sendKeys("SAIII", Keys.ENTER);
                workdaycommon.userWait(5000);
                insidesearchboxcommon.sendKeys(Keys.TAB);
                workdaycommon.userWait(1000);
            } else {
                insidesearchboxcommon.sendKeys("HQASPE", Keys.ENTER);
                // insidesearchboxcommon.sendKeys("IBGWHA", Keys.ENTER);
                workdaycommon.userWait(5000);
                insidesearchboxcommon.sendKeys(Keys.TAB);
                workdaycommon.userWait(1000);
            }

            // timetypeHireEmployee.clear();
            workdaycommon.scrolltoElement(timetypeHireEmployee);
            workdaycommon.userWait(1000);
            //timetypeHireEmployee.click();
            workdaycommon.userWait(3000);
            timetypeHireEmployee.sendKeys("Full time", Keys.ENTER);
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys(Keys.TAB);
            workdaycommon.userWait(1000);


            workdaycommon.scrolltoElement(locationHireEmployee);
            workdaycommon.userWait(5000);
            if (SUPORG.contains("Canada")) {
                log.info("Canada Region.....");
                insidesearchboxcommon.sendKeys("7152", Keys.ENTER);
                workdaycommon.userWait(5000);
            } else {
                log.info("US Region.....");
                insidesearchboxcommon.sendKeys("0914", Keys.ENTER);
                // insidesearchboxcommon.sendKeys("4836", Keys.ENTER);
                workdaycommon.userWait(5000);


            }

            insidesearchboxcommon.sendKeys(Keys.TAB);
            workdaycommon.userWait(2000);
            insidesearchboxcommon.sendKeys(Keys.TAB);
            workdaycommon.userWait(3000);

            //WebActionsUtil.clearAndSendKeys(driver,payRateHireEmployee,"Salary");
            //insidesearchboxcommon.sendKeys(Keys.TAB);
            //workdaycommon.userWait(1000);
            //insidesearchboxcommon.sendKeys(Keys.TAB);

      /*  payRateHireEmployee.click();
        workdaycommon.userWait(1000);
        payIconHireEmployee.click();
        workdaycommon.userWait(2000);
        */
            workdaycommon.scrolltoElement(payRateHireEmployee);
            workdaycommon.userWait(2000);
            insidesearchboxcommon.sendKeys("Salary", Keys.ENTER);
            //insidesearchboxcommon.sendKeys("Hourly", Keys.ENTER);
            workdaycommon.userWait(2000);

            //WebElement payvalue = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @data-automation-label='Salary']"));
            WebElement payvalue = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @data-automation-label='Hourly']"));
            payvalue.click();
            workdaycommon.userWait(2000);

            workdaycommon.scrolltoElement(submitbtnHireEmployee);
            workdaycommon.userWait(9000);
            submitbtnHireEmployee.click();
            workdaycommon.userWait(9000);
            driverWrapper.waitForPageLoaded();
            workdaycommon.userWait(5000);
            workdaycommon.takescreenshotUI("Employee_hire_complete", FNAMECREATEPREHIRE1);
            workdaycommon.scroll();

            //Change Organization
            openProCompHire.click();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(compEditProCompHire);
            compEditProCompHire.click();
            workdaycommon.userWait(5000);
            compValProCompHire.sendKeys(Company, Keys.ENTER);
            workdaycommon.userWait(5000);
            workdaycommon.scrolltoElement(costEditProCompHire);
            costEditProCompHire.click();
            workdaycommon.userWait(5000);
            compValProCompHire.sendKeys(CostCenter, Keys.ENTER);
            workdaycommon.userWait(5000);

            //Business Unit

            workdaycommon.scrolltoElement(bUEditProCompHire);
            bUEditProCompHire.click();
            //Canada
            workdaycommon.userWait(5000);
            compValProCompHire.sendKeys("Canada Associates", Keys.ENTER);
            workdaycommon.userWait(5000);
            //USA
            // workdaycommon.userWait(5000);
            //compValProCompHire.sendKeys("Home Decorators Associate", Keys.ENTER);
            // compValProCompHire.sendKeys("Canada Interline Outside Sales Associate", Keys.ENTER);

            //Department
            workdaycommon.scrolltoElement(deptEditProCompHire);
            deptEditProCompHire.click();
            workdaycommon.userWait(5000);
            deptValEditProCompHire.click();
            workdaycommon.userWait(5000);
            compValProCompHire.sendKeys("24 PAINT", Keys.ENTER);
            // compValProCompHire.sendKeys("368", Keys.ENTER);
            workdaycommon.userWait(7000);
            submitProCompHire.click();
            driverWrapper.waitForPageLoaded();
            workdaycommon.userWait(2000);


            //Edit IDs
            openProCompHire.click();
            workdaycommon.userWait(5000);
            addrowmailbox.click();
            workdaycommon.userWait(9000);
            log.info("Entering Government ID details......." + Country);
            log.info("Entering Government ID details......." + GovID);
            log.info("Entering Government ID details......." + SSNNumber);
            countryClickProCompHire.click();
            workdaycommon.userWait(3000);
            countryProCompHire.sendKeys(Country, Keys.TAB);
            workdaycommon.userWait(5000);
            nationalValIDProCompHire.sendKeys(GovID, Keys.TAB);
            workdaycommon.userWait(5000);
            addEditIDProCompHire.sendKeys(SSNNumber, Keys.ENTER);
            workdaycommon.userWait(5000);
            approveProCompHire.click();
            workdaycommon.userWait(3000);
            try {

                approveProCompHire.click();
                workdaycommon.userWait(3000);
            } catch (NoSuchElementException e) {
                log.info("Execution is in catch block.....Approve button clicked already");
            }

            //String empname1 ="Autojerry Autojon";


            log.info("openProCompHire Started....");
            workdaycommon.inboxWD.click();
            workdaycommon.userWait(2000);
            //WebElement inboxTextTerminate11 = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Propose Compensation Hire: " + empname + "')]"));
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
            workdaycommon.userWait(5000);

            try {
                workdaycommon.scrolltoElement(editSalaryProCompHire);
                workdaycommon.userWait(5000);
                editSalaryProCompHire.click();
                workdaycommon.userWait(5000);
            } catch (Exception e1) {
                log.info("Entered Hourly.....");
                workdaycommon.scrolltoElement(edithourProCompHire);
                workdaycommon.userWait(5000);
                edithourProCompHire.click();
                workdaycommon.userWait(5000);
            }
            String Amt = "13.00";
            amountProCompHire.sendKeys(Keys.BACK_SPACE);
            amountProCompHire.sendKeys(Keys.BACK_SPACE);
            amountProCompHire.sendKeys(Keys.BACK_SPACE);
            amountProCompHire.sendKeys(Keys.BACK_SPACE);
            amountProCompHire.sendKeys(Amt, Keys.ENTER);
            workdaycommon.userWait(3000);
            submitProCompHire.click();
            workdaycommon.userWait(3000);
            doneProCompHire.click();
            workdaycommon.userWait(3000);

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
            workdaycommon.userWait(5000);
            workdaycommon.scroll();
            log.info("Clicked on Employee....");
            try {
                if (workdaycommon.labelawaitingaction.isDisplayed()) {
                    log.info("Awaiting Action Counting Started.......");
                    List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
                    int count = labelAwaitingaction.size();
                    log.info("Count----->" + count);
                    for (int i = 1; i <= count; i++) {
                        log.info("Awaiting Action____1......." + i);
                        String Approver_name = workdaycommon.awaitingAction(i);
                        StringBuilder proxyperson = new StringBuilder(Approver_name);
                        proxyperson.delete(Approver_name.length() - 1, Approver_name.length());
                        workdaycommon.userWait(3000);
                        workdaycommon.StartProxy_employee(proxyperson.toString());
                        //workdaycommon.startProxy(proxyperson.toString());
                        workdaycommon.userWait(4000);
                        workdaycommon.gotoWorkdayHomepage();
                        workdaycommon.userWait(3000);
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
                        log.info("Approval done Successfully.......");
                    }
                    log.info(".......Process Completed with Approval.........");
                    workdaycommon.gotoWorkdayHomepage();
                    AwaitingAction_ProposeCompHire(empname, Country);
                }
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


    public void Onboarding(String Country, String FNemergencyConctOnBoard, String LNemergencyConctOnBoard, String RelationShpOnB, String MailIdONB, String MobileOnbard, String JobProfile, String DOB) throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
            String empname1 = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
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
                        workdaycommon.mousemove(securityProfile, startProxyFromAssociateName);
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
//                    workdaycommon.StartProxy_employee(proxyperson.toString());
//                    workdaycommon.startProxy(proxyperson.toString());

                    workdaycommon.userWait(4000);
                    WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
                    Threedots.click();
                    workdaycommon.scrolltoElement(securityProfile);
                    workdaycommon.mousemove(securityProfile, startProxyFromAssociateName);
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

                    if (Country.equalsIgnoreCase("Canada")) {
                        log.info("Mail Approval for Canada Region.....");
                        PersonalInformation(Country, DOB);
                        paymentElection();
                        changePhoto();
                        provinceHolding();
                        completeFederal(Country);
                        changeEmergencyContact(FNemergencyConctOnBoard, LNemergencyConctOnBoard, RelationShpOnB, MailIdONB, MobileOnbard);
                    } else {
                        log.info("Mail Approval for US Region.....");
                        LocalHolding();
                        PersonalInformation(Country, DOB);
                        changePhoto();
                        provinceHolding();
                        completeFederal(Country);
                        changeEmergencyContact(FNemergencyConctOnBoard, LNemergencyConctOnBoard, RelationShpOnB, MailIdONB, MobileOnbard);
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
        pickassociateId();
        sendemployee(associate_ID);
    }

    public void sendemployee(String empname) {
        Random random = new Random();
        int value = random.nextInt(10000);
        System.out.println(value);
        HashMap<Integer, String> hmapemp = new HashMap<>();
        hmapemp.put(value, empname);
        workdaycommon.sethashmap(hmapemp);
        workdaycommon.setrandomnumber(value);
    }


    public void pickassociateId() throws Exception {
        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.selfImgBtn.click();
        workdaycommon.userWait(2000);
        workdaycommon.viewprofileSelf.click();
        workdaycommon.userWait(2000);
        associate_ID = associateID.getText();
        log.info("The Employee Id" + associate_ID);
        test.info("The Employee Id is: " + associate_ID);
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
            insidesearchboxcommon.sendKeys("2 = NOT A PROTECTED", Keys.ENTER);
            workdaycommon.userWait(2000);
            submitOnboarding.click();
            workdaycommon.userWait(4000);
        } catch (Exception e) {
            log.info("Inbox1 : veteranStatus is not available");
        }

    }


    public void PersonalInformation(String Country, String DOB) throws Exception {
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
//            String date = "01/01/1990";
            if (driverWrapper.isElementPresent(hiredateHireEmployee)) {
                System.out.println("job details page");
                for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                    elem.sendKeys(DOB);
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


            if (Country.equalsIgnoreCase("Canada")) {

                insidesearchboxcommon.sendKeys("ENGLISH", Keys.ENTER);
                workdaycommon.userWait(3000);
            } else {
                log.info("US Region...");
                insidesearchboxcommon.sendKeys("Asian", Keys.ENTER);
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
            bankNameOnboarding.sendKeys("Royal bank of Canada");
            workdaycommon.userWait(2000);
            log.info("Clicked on PaymentElectionContact.....");

//--------The fllowing code is changed/commented as it was
            //  not required migrating from P2 to sandbox----------------
            workdaycommon.scrolltoElement(institutionNbrOnboarding);
            institutionNbrOnboarding.sendKeys("789");
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(branchIDOnboarding);
            branchIDOnboarding.sendKeys("78521");
            workdaycommon.userWait(2000);
//--------------------------------------------------------------

            //--------The fllowing code is changed/commented as it was
//        not required migrating from sandbox to HD3----------------
//            workdaycommon.scrolltoElement(routingTransitNbrOnboarding);
//            routingTransitNbrOnboarding.sendKeys("021000021");
//            workdaycommon.userWait(2000);
//            log.info("Clicked on PaymentElectionContact.....");

            //--------The fllowing code is changed/commented as it was
//        not required migrating from P2 to sandbox----------------
//            workdaycommon.scrolltoElement(bankIdentificationCodeOnboarding);
//            bankIdentificationCodeOnboarding.sendKeys("00078521");
//            workdaycommon.userWait(2000);
//            log.info("Clicked on PaymentElectionContact.....");

            workdaycommon.scrolltoElement(actNbrOnboarding);
            actNbrOnboarding.sendKeys("7853258426");
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
            bankNameOnboarding.sendKeys("Bank of America");
            workdaycommon.userWait(2000);
            log.info("Clicked on PaymentElectionContact.....");
            //  workdaycommon.scrolltoElement(institutionNbrOnboarding);
            workdaycommon.scrolltoElement(RoutingOnboarding);
            RoutingOnboarding.sendKeys("091000022");
            workdaycommon.userWait(2000);

            log.info("Clicked on PaymentElectionContact.....");
            workdaycommon.scrolltoElement(actNbrOnboarding);
            actNbrOnboarding.sendKeys("987564213012");
            workdaycommon.userWait(2000);
            log.info("Clicked on PaymentElectionContact.....");
            //   workdaycommon.scrolltoElement(branchIDOnboarding);
            //  branchIDOnboarding.sendKeys("78521");
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
            //workdaycommon.scrolltoElement(SinOnboarding);
            SinOnboarding.click();
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys("Single", Keys.ENTER);
            workdaycommon.userWait(3000);


            workdaycommon.scrolltoElement(MaritalOnboarding);
            MaritalOnboarding.click();
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys("Single", Keys.ENTER);
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

            if (Country.equalsIgnoreCase("Canada")) {

                log.info("Marital Status Not Available for Canada");
            } else {
                String maritalStatus = "Single";
                workdaycommon.scrolltoElement(MaritalOnboarding);
                MaritalOnboarding.click();
                workdaycommon.userWait(3000);
                insidesearchboxcommon.sendKeys("Single", Keys.ENTER);
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
            FNameCreatePreHire.sendKeys(FNemergencyConctOnBoard, Keys.ENTER);
            workdaycommon.userWait(2000);
            LNameCreatePreHire.clear();
            workdaycommon.userWait(2000);
            // LNameCreatePreHire.sendKeys("ballla");
            LNameCreatePreHire.sendKeys(LNemergencyConctOnBoard, Keys.ENTER);
            log.info("Entering RelationShip.........");
            workdaycommon.scrolltoElement(relationshipEditOnboarding);
            relationshipEditOnboarding.click();
            workdaycommon.userWait(3000);
            // relationshipValOnboarding.sendKeys("Immediate Family Member", Keys.ENTER);
            relationshipValOnboarding.sendKeys(RelationShpOnB, Keys.ENTER);
            workdaycommon.userWait(3000);
            workdaycommon.scrolltoElement(phnEditOnboarding);
            EmailEditOnboarding.click();
            //phnEditmailOnboarding.sendKeys("john_ballla@homedepot.com", Keys.ENTER);
            phnEditmailOnboarding.sendKeys(MailIdONB, Keys.ENTER);
            workdaycommon.userWait(4000);
            workdaycommon.scrolltoElement(mobileEditOnboarding);
            phnEditOnboarding.click();
            workdaycommon.userWait(1000);
            mobileDevOnboarding.click();
            workdaycommon.userWait(2000);
            WebElement mobileDevOnboarding11 = driver.findElement(By.xpath("//div[@title='Mobile']"));
            mobileDevOnboarding11.click();
            workdaycommon.userWait(3000);
            mobileValOnboarding.sendKeys(MobileOnbard, Keys.ENTER);
            workdaycommon.userWait(4000);
            submitOnboarding.click();
            workdaycommon.userWait(9000);
        } catch (Exception e1) {
            log.info("Inbox3 : Change Emergency Contact mail Box is not available");
        }
    }

    public void HomeAddressChange(String Emp_ID, String Employee, String Address1, String Postal, String City, String StateOrProvince, String Country, String effectivedate,String MobileOnbard) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        //workdaycommon.startProxy(Emp_ID);
        workdaycommon.startProxy(Employee);
        workdaycommon.userWait(3000);
        log.info("Home Contact Change Started....");
        test.pass("Home Contact Change Started....");
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
                 elem.sendKeys(effectivedate);
//                elem.sendKeys(date); // Enter today's current date
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

        log.info("Country: "+Country+"");
        workdaycommon.userWait(3000);
        try{
            if(Country.equals("Canada")){
                WebActionsUtil.explicitWait(driver, ProvinceHCC, "click");
                ProvinceHCC.click();
                workdaycommon.userWait(2000);
                insidesearchboxcommon.sendKeys(StateOrProvince, Keys.ENTER);
//        ProvinceHCC.sendKeys(Province, Keys.ENTER);
                log.info("Changed Province");
                workdaycommon.userWait(1000);
            }

        }catch(Exception e){
            WebActionsUtil.explicitWait(driver, StateHCC, "click");
            StateHCC.click();
            workdaycommon.userWait(2000);
            insidesearchboxcommon.sendKeys(StateOrProvince, Keys.ENTER);
            log.info("Changed State");
        }


        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(PostalHCC);
        WebActionsUtil.explicitWait(driver, PostalHCC, "click");
        PostalHCC.click();
        workdaycommon.userWait(2000);
        PostalHCC.clear();
        workdaycommon.userWait(3000);
        PostalHCC.sendKeys(Postal);

        workdaycommon.userWait(4000);
        workdaycommon.scrolltoElement(PhoneHCC);
        phnAddHCC.click();
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(phnDeviceHCC);
        phnDeviceHCC.click();
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(phnDeviceHCC);
        MobileHCC.click();
        workdaycommon.userWait(3000);
        mobileValOnboarding.sendKeys(MobileOnbard, Keys.ENTER);
        workdaycommon.userWait(3000);


        String[] name = Employee.split(" ");// Splitted the PayPeriod into StartDate and EndDate
        String first = name[0];
        String last = name[1];

        log.info("After splitting...");
        log.info("First name:"+ first);
        log.info("Last name:" + last);
        String emp_mail=first+"_"+last+"@homedepot.com";



        workdaycommon.scrolltoElement(EmailHCC);
        workdaycommon.userWait(4000);
        workdaycommon.scrolltoElement(EmailAddHCC);
        EmailAddHCC.click();
        EmailIdHCC.sendKeys(emp_mail, Keys.ENTER);
        workdaycommon.userWait(4000);

        //WebActionsUtil.explicitWait(driver, SubmitHCC, "click");
        //SubmitHCC.click();
        workdaycommon.userWait(3000);
        SubmitHCC.click();
        log.info("Submit button one clicked");
        workdaycommon.userWait(3000);
        try {
            ToBeHCC.click();
            log.info("To do button clicked");
            workdaycommon.userWait(3000);
            SubmitHCC.click();
            log.info("Submit button clicked");
            workdaycommon.userWait(3000);
            detailsTabOnboarding.click();
        } catch (NoSuchElementException e) {
//            SubmitHCC.click();
            log.info("To Do button is not available");
            detailsTabOnboarding.click();
        }
//        workdaycommon.btnDone.click();
//        log.info("Done button Clicked");
//        workdaycommon.userWait(2000);
//        workdaycommon.clickAction.click();
//        workdaycommon.mousemove(workdaycommon.associateHistoryLink, workdaycommon.viewAssociateHistoryLink);
//        workdaycommon.userWait(2000);
//        WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Home Contact Change: " + Employee + "')][1]"));
//        WebActionsUtil.explicitWait(driver, Employeename, "click");
//        Employeename.click();



        workdaycommon.userWait(3000);
        processProCompHire.click();
        workdaycommon.userWait(3000);
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
                if(Country.equals("Canada")){
                    test.pass("Home Contact change Completed Successfully - Employee name :" + Employee + " , " + "Province: " + StateOrProvince);
                    log.info("Home Contact change Completed Successfully - Employee name :" + Employee + "," + "Province: " + StateOrProvince);
                }else{
                    test.pass("Home Contact change Completed Successfully - Employee name :" + Employee + " , " + "State: " + StateOrProvince);
                    log.info("Home Contact change Completed Successfully - Employee name :" + Employee + "," + "State: " + StateOrProvince);
                }


            }
        } else {
            log.info("The Overall process is not completed.......Current Status: " + overallStatus);
            test.fail("The Overall process is not completed.......Current Status: " + overallStatus);
            driver.quit();
        }
    }

    //    WorkAddressChange
    public void WorkAddressChange(String EffectiveDate, String Employee, String Country, String Address1, String Postal, String City, String Province, String State, String MobileOnbard) throws Exception {


        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);

        log.info("Work Contact Change Started....");
        test.pass("Work Contact Change Started....");
//            workdaycommon.startProxy(Employee);
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(2000);

        try{
            WebElement namelink = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
            WebActionsUtil.explicitWait(driver, namelink, "click");
            namelink.click();

        }catch(Exception e){
            workdaycommon.userWait(2000);
            workdaycommon.allOfWorkday.click();
            workdaycommon.userWait(1000);
            WebElement namelink = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
            WebActionsUtil.explicitWait(driver, namelink, "click");
            namelink.click();
        }

//            workdaycommon.selfImgBtn.click();
//            workdaycommon.userWait(3000);
//            workdaycommon.viewprofileSelf.click();
//            workdaycommon.userWait(5000);

        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(PersonalDateHCC, ChangeMyWCC);
        workdaycommon.userWait(3000);
        try {
            if (EditAddrHCC.isDisplayed()) {
//                log.info("Edit Address is not present");
                workdaycommon.scrolltoElement(EditAddrHCC);
                log.info("Clicking on Edit Address");
                EditAddrHCC.click();
                workdaycommon.userWait(1000);
            }
        } catch (Exception e) {
            workdaycommon.scrolltoElement(btnAdd);
            log.info("Clicking on Add button");
            btnAdd.click();
            workdaycommon.userWait(1000);
        }

        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(avldateWCC);
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        if (driverWrapper.isElementPresent(avldateWCC)) {
            for (WebElement elem : driver.findElements(By.xpath("(//input[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                //Use the below line for using random/customized dates
                // elem.sendKeys(effectivedate);
                elem.sendKeys(EffectiveDate); // Enter today's current date
            }
        }

        WebActionsUtil.explicitWait(driver, CountryWCC, "click");
        workdaycommon.scrolltoElement(CountryWCC);
        CountryWCC.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(Country);
        workdaycommon.userWait(1000);

        WebActionsUtil.explicitWait(driver, AddrLine1HCC, "click");
        workdaycommon.scrolltoElement(AddrLine1HCC);
        AddrLine1HCC.click();
        workdaycommon.userWait(1000);
        AddrLine1HCC.clear();
        workdaycommon.userWait(1000);
        AddrLine1HCC.sendKeys(Address1);
        workdaycommon.userWait(2000);

        WebActionsUtil.explicitWait(driver, cityHCC, "click");
        workdaycommon.scrolltoElement(cityHCC);
        cityHCC.sendKeys(City, Keys.ENTER);


        log.info("Inside Try block");
        if (Country.equals("Canada")) {
            log.info("Changing Province");
            workdaycommon.userWait(2000);
            WebActionsUtil.explicitWait(driver, ProvinceHCC, "click");
            ProvinceHCC.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(Province, Keys.ENTER);
//        ProvinceHCC.sendKeys(Province, Keys.ENTER);
            log.info("Changed Province");
        }
        else if (Country.equals("United States Of America")) {
            log.info("Changing State");
            workdaycommon.userWait(2000);
            JavascriptExecutor jstCreateNwPos = (JavascriptExecutor) driver;
            workdaycommon.scrolltoElement(stateWCC);
            jstCreateNwPos.executeScript("arguments[0].click () ", stateWCC);
            workdaycommon.userWait(1000);
//            stateWCC.click();

            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(State, Keys.ENTER);
            workdaycommon.userWait(2000);
        }

        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(PostalHCC);
        WebActionsUtil.explicitWait(driver, PostalHCC, "click");
        PostalHCC.click();
        workdaycommon.userWait(2000);
        PostalHCC.clear();
        workdaycommon.userWait(3000);
        PostalHCC.sendKeys(Postal);

  /*
  //uncomment this when needed ...
    WebActionsUtil.explicitWait(driver, visibilityWCC, "click");
    workdaycommon.scrolltoElement(visibilityWCC);
    visibilityWCC.click();
    workdaycommon.userWait(1000);
    if(VisibilityOption.equals("Public"))
    {
        visibilityPublic.click();
        workdaycommon.userWait(1000);
    }
    else {
        visibilityPrivate.click();
        workdaycommon.userWait(1000);
    }*/

        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(PhoneHCC);


        try {
            workdaycommon.userWait(2000);
            if (editPhoneWCC.isDisplayed()) {
//                log.info("Edit button is not present");
                editPhoneWCC.click();
                workdaycommon.userWait(2000);
                log.info("Edit button is clicked");
            }
        } catch (NoSuchElementException e) {
            workdaycommon.userWait(2000);
            phnAddHCC.click();
            log.info("Add button is clicked");
        }

//    phnAddHCC.click();
        workdaycommon.userWait(2000);
        phnDeviceHCC.click();
        workdaycommon.userWait(1000);
        MobileHCC.click();
        workdaycommon.userWait(2000);
        countryCode.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(Country, Keys.ENTER);
        workdaycommon.userWait(2000);
        mobileValOnboarding.clear();
        workdaycommon.userWait(1000);
        mobileValOnboarding.sendKeys(MobileOnbard, Keys.ENTER);
        workdaycommon.userWait(1000);


        String[] name = Employee.split(" ");// Splitted the EmployeeName into FirstName and LastName
        String first = name[0];
        String last = name[1];

        log.info("After splitting...");
        log.info("First name:" + first);
        log.info("Last name:" + last);
        String emp_mail = first + "_" + last + "@homedepot.com";

        workdaycommon.scrolltoElement(EmailHCC);
        workdaycommon.userWait(2000);
        try {
            workdaycommon.userWait(2000);
            if (editEmailWCC.isDisplayed()) {
//                log.info("Edit button is present");
                editEmailWCC.click();
                workdaycommon.userWait(2000);
                log.info("Edit button is clicked");
            }
        } catch (Exception e) {
            workdaycommon.userWait(2000);
            EmailAddHCC.click();
            log.info("Add button is clicked");
        }

        EmailIdHCC.clear();
        workdaycommon.userWait(1000);
        EmailIdHCC.sendKeys(emp_mail, Keys.ENTER);
        workdaycommon.userWait(2000);

        //WebActionsUtil.explicitWait(driver, SubmitHCC, "click");
        //SubmitHCC.click();
        workdaycommon.userWait(3000);
        try {
            ToBeHCC.click();
            workdaycommon.userWait(3000);
            SubmitHCC.click();
        } catch (NoSuchElementException e) {
            WebActionsUtil.explicitWait(driver, SubmitHCC, "click");
            SubmitHCC.click();
            log.info("To Do button is not available");
        }
        workdaycommon.userWait(2000);
        workdaycommon.btnDone.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(workdaycommon.associateHistoryLink, workdaycommon.viewAssociateHisByCategoryLink);
        workdaycommon.userWait(2000);
        subtabPersonalData.click();
        workdaycommon.userWait(2000);
        WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Work Contact Change: " + Employee + "')][1]"));
        WebActionsUtil.explicitWait(driver, Employeename, "click");
        Employeename.click();
        workdaycommon.userWait(3000);
        WebActionsUtil.explicitWait(driver, processProCompHire, "click");
        processProCompHire.click();
        workdaycommon.userWait(3000);
        String overallStatus = overallStatusProCompHire.getText();
        log.info("---------overallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);
        workdaycommon.scroll();
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (statusProCompHire.isDisplayed()) {
                    log.info("Work Contact change not Completed Successfully");
                    test.fail("Work Contact change not Completed Successfully");
                    driver.quit();
                }
            } catch (Exception e) {
                test.pass("Work Contact change Completed Successfully - Employee name :" + Employee + " , " + "Province: " + Province);
                log.info("Work Contact change Completed Successfully - Employee name :" + Employee + "," + "Province: " + Province);
            }
        } else {
            log.info("The Overall process is not completed.......Current Status: " + overallStatus);
            test.fail("The Overall process is not completed.......Current Status: " + overallStatus);
            driver.quit();
        }
    }


    public void ViewContactInformation(String Employee) throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);

            log.info("View Contact Information Started for " + Employee);
            test.pass("View Contact Information Started for " + Employee);
//            workdaycommon.startProxy(Employee);
            workdaycommon.searchbySearchBox(Employee);
            workdaycommon.userWait(2000);

            try{
                WebElement namelink = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
                WebActionsUtil.explicitWait(driver, namelink, "click");
                namelink.click();
            }catch(Exception e){
                workdaycommon.userWait(2000);
                workdaycommon.allOfWorkday.click();
                workdaycommon.userWait(1000);
                WebElement namelink = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
                WebActionsUtil.explicitWait(driver, namelink, "click");
                namelink.click();
            }

//            workdaycommon.selfImgBtn.click();
//            workdaycommon.userWait(3000);
//            workdaycommon.viewprofileSelf.click();
//            workdaycommon.userWait(5000);

            workdaycommon.userWait(2000);
            workdaycommon.clickAction.click();
            workdaycommon.mousemove(PersonalDateHCC, ViewContactInfo);
            workdaycommon.userWait(3000);

            workdaycommon.scrolltoElement(workContactInfo);
            workContactInfo.click();
            workdaycommon.userWait(2000);
            log.info("Work address from application: " + chkWorkContactAddress.getText());
            test.info("Work address: " + chkWorkContactAddress.getText());


            workdaycommon.scrolltoElement(headerPhones);
            headerPhones.click();

            try {
                String phoneNumber = chkPhoneNumber.getText();
                log.info(phoneNumber);
                StringBuilder phnNumber = new StringBuilder(phoneNumber);
                phnNumber.delete(0, 4);//deleting the first 4 position of phone number
                String number = phnNumber.toString();

                String[] Num = number.split(" ");// Splitted the phoneNumber into firsthalf and secondhalf
                String firstNum = Num[0];
                String secondNum = Num[1];
                StringBuilder FirstHalf = new StringBuilder(firstNum);
                FirstHalf.delete(firstNum.length() - 1, firstNum.length());
                String FirstNumber = FirstHalf.toString();

                String ContctNum = FirstNumber + secondNum;
                log.info("Work Phone number from Application: " + ContctNum);
                test.info("Work Phone number : " + ContctNum);
            }catch(Exception e)
            {
                //this is used when phone number has brackets in it
                String phoneNumber = chkPhoneNumber.getText();
                log.info(phoneNumber);
                StringBuilder phnNumber = new StringBuilder(phoneNumber);
                phnNumber.delete(0, 4);//deleting the first 4 position of phone number
                String number = phnNumber.toString();
                log.info("Phone number from Application: " + number);
                test.info("Work Phone number : " + number);
            }

            workdaycommon.scrolltoElement(headerEmailAddress);
            headerEmailAddress.click();
            workdaycommon.userWait(2000);
            log.info("Work Email address from application: " + chkEmailAddress.getText());
            test.info("Work Email address: " + chkEmailAddress.getText());


            test.pass("View Contact Information is completed successfully");
            log.info("View Contact Information is completed successfully");
        }
        catch(Exception e)
        {
            test.fail("View Contact Information is not completed successfully");
            log.info("View Contact Information is not completed successfully");
        }
    }


    public void EmergencyContactChange(String Employee, String Country, String FirstName, String LastName, String Relationship, String PhoneNumber) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);

        log.info("Change Emergency Contact Started for " + Employee);
        test.pass("Change Emergency Contact Started for " + Employee);
//            workdaycommon.startProxy(Employee);
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(2000);
        try{
            WebElement namelink = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
            WebActionsUtil.explicitWait(driver, namelink, "click");
            namelink.click();
        }catch(Exception e){
            workdaycommon.userWait(2000);
            workdaycommon.allOfWorkday.click();
            workdaycommon.userWait(1000);
            WebElement namelink = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
            WebActionsUtil.explicitWait(driver, namelink, "click");
            namelink.click();
        }

//            workdaycommon.selfImgBtn.click();
//            workdaycommon.userWait(3000);
//            workdaycommon.viewprofileSelf.click();
//            workdaycommon.userWait(5000);

        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(PersonalDateHCC, ChangeEmergencyCont);
        workdaycommon.userWait(3000);

        workdaycommon.scrolltoElement(editLegalName);
        workdaycommon.userWait(2000);
        editLegalName.click();
        workdaycommon.userWait(2000);
        log.info("Country");
        countryLegalName.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(Country, Keys.ENTER);
        workdaycommon.userWait(2000);

        log.info("First Name");
        workdaycommon.scrolltoElement(firstNameEmrCont);
        firstNameEmrCont.clear();
        workdaycommon.userWait(1000);
        firstNameEmrCont.sendKeys(FirstName, Keys.ENTER);
        workdaycommon.userWait(2000);

        log.info("Last Name");
        workdaycommon.scrolltoElement(lastNameEmrCont);
        lastNameEmrCont.clear();
        workdaycommon.userWait(1000);
        lastNameEmrCont.sendKeys(LastName, Keys.ENTER);
        workdaycommon.userWait(2000);

        log.info("Relationship");
        workdaycommon.scrolltoElement(editRelationEmrgCont);
        editRelationEmrgCont.click();
        workdaycommon.userWait(1000);
        relationEmrgCont.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(Relationship, Keys.ENTER);
        workdaycommon.userWait(2000);

        log.info("Primary Phone");
        workdaycommon.scrolltoElement(editPrimaryPhone);
        editPrimaryPhone.click();
        workdaycommon.userWait(1000);
        optionPhoneDevice.click();
        workdaycommon.userWait(1000);
        phoneDeviceMobile.click();
        workdaycommon.userWait(2000);

        countryPhoneCode.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(Country, Keys.ENTER);
        workdaycommon.userWait(2000);

        enterPhoneNumber.clear();
        enterPhoneNumber.sendKeys(PhoneNumber, Keys.ENTER);
        workdaycommon.userWait(2000);
        optionHomeType.click();
        insidesearchboxcommon.sendKeys("Home", Keys.ENTER);
        workdaycommon.userWait(2000);
        WebElement clickPhnNumber = driver.findElement(By.xpath("//label[text()='Type']//following::p[text()='Home']"));
        workdaycommon.userWait(2000);
        WebActionsUtil.explicitWait(driver, clickPhnNumber, "click");
        clickPhnNumber.click();
        workdaycommon.userWait(2000);

        log.info("Primary Email");
        workdaycommon.scrolltoElement(editPrimaryEmail);
        editPrimaryEmail.click();
        workdaycommon.userWait(1000);
        enterPrimaryEMail.clear();
        enterPrimaryEMail.sendKeys(FirstName + "@gmail.com", Keys.ENTER);
        workdaycommon.userWait(2000);

        optionHomeType.click();
        insidesearchboxcommon.sendKeys("Home", Keys.ENTER);
        workdaycommon.userWait(2000);
        WebElement clickEmailType = driver.findElement(By.xpath("//label[text()='Type']//following::p[text()='Home']"));
        workdaycommon.userWait(2000);
        WebActionsUtil.explicitWait(driver, clickEmailType, "click");
        clickEmailType.click();
        workdaycommon.userWait(2000);

        WebActionsUtil.explicitWait(driver, SubmitHCC, "click");
        SubmitHCC.click();
        workdaycommon.userWait(2000);

        workdaycommon.btnDone.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(workdaycommon.associateHistoryLink, workdaycommon.viewAssociateHistoryLink);
        workdaycommon.userWait(2000);
        WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Change Emergency Contacts: " + Employee + "')][1]"));
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
                    log.info("Change Emergency Contact  not Completed Successfully");
                    test.fail("Change Emergency Contact not Completed Successfully");
                    driver.quit();
                }
            } catch (Exception e) {
                test.pass("Change Emergency Contact Completed Successfully - Employee name :" + Employee);
                log.info("Change Emergency Contact Completed Successfully - Employee name :" + Employee);
            }
        } else {
            log.info("The Overall process is not completed.......Current Status: " + overallStatus);
            test.fail("The Overall process is not completed.......Current Status: " + overallStatus);
            driver.quit();
        }
    }

    public void ViewEmergencyContacts(String Employee) throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);

            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);

            log.info("View Emergency Contact Started for " + Employee);
            test.pass("View Emergency Contact Started for " + Employee);
//            workdaycommon.startProxy(Employee);
            workdaycommon.searchbySearchBox(Employee);
            workdaycommon.userWait(2000);

            try{
                WebElement namelink = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
                WebActionsUtil.explicitWait(driver, namelink, "click");
                namelink.click();

            }catch(Exception e){
                workdaycommon.userWait(2000);
                workdaycommon.allOfWorkday.click();
                workdaycommon.userWait(1000);
                WebElement namelink = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
                WebActionsUtil.explicitWait(driver, namelink, "click");
                namelink.click();
            }


//            workdaycommon.selfImgBtn.click();
//            workdaycommon.userWait(3000);
//            workdaycommon.viewprofileSelf.click();
//            workdaycommon.userWait(5000);

            workdaycommon.userWait(2000);
            workdaycommon.clickAction.click();
            workdaycommon.mousemove(PersonalDateHCC, ViewEmergencyCont);
            workdaycommon.userWait(3000);
            log.info("Emergency contact name from Application: " + checkContName.getText());
            test.info("Emergency contact name: " + checkContName.getText());

            try {
                String phoneNumber = checkContPhNumber.getText();
                log.info(phoneNumber);
                StringBuilder phnNumber = new StringBuilder(phoneNumber);
                phnNumber.delete(0, 4);//deleting the first 4 position of phone number
                String number = phnNumber.toString();

                String[] Num = number.split(" ");// Splitted the phoneNumber into firsthalf and secondhalf
                String firstNum = Num[0];
                String secondNum = Num[1];
                StringBuilder FirstHalf = new StringBuilder(firstNum);
                FirstHalf.delete(firstNum.length() - 1, firstNum.length());
                String FirstNumber = FirstHalf.toString();

                String EmergencyContctNum = FirstNumber + secondNum;
                log.info("Emergency Contact Phone number from Application: " + EmergencyContctNum);
                test.info("Emergency Contact Phone number: " + EmergencyContctNum);
            } catch (Exception e) {
                //this is used when phone number has brackets in it
                String phoneNumber = checkContPhNumber.getText();
                log.info(phoneNumber);
                StringBuilder phnNumber = new StringBuilder(phoneNumber);
                phnNumber.delete(0, 4);//deleting the first 4 position of phone number
                String number = phnNumber.toString();
                log.info("Phone number from Application: " + number);
                test.info("Emergency Contact Phone number: " + number);
            }

            test.pass("View Emergency Contact is completed successfully");
            log.info("View Emergency Contact is completed successfully");
        } catch (Exception e) {
            test.fail("View Emergency Contact is not completed successfully");
            log.info("View Emergency Contact is not completed successfully");

        }
    }


    public void Onboarding_Manager_Confirmation(String empname1) throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
//            String empname1 = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
//            workdaycommon.setEmployeename(empname1);
            log.info("Onboarding - Manager Confirmation Started...." + empname1);
            workdaycommon.searchbySearchBox(empname1);
            workdaycommon.userWait(2000);
            allOfWorkdayProCompHire.click();
            workdaycommon.userWait(3000);
            //WebElement namelink = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + empname1 + "')]"));
            WebElement namelink = driver.findElement(By.xpath("(//*[contains(text(),'" + empname1 + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + empname1 + "')][1]"));
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
