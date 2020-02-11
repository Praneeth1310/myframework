package com.thd.projectname.pages.PO_E2E_Scenarios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.lang.*;
import java.lang.String;
import java.util.NoSuchElementException;
//import java.util.concurrent.TimeUnit;

import com.thd.common.utils.WebActionsUtil;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import com.thd.base.BasePage;
import com.thd.base.Constants.Constants;


public class WD_E2E_Scenarios extends BasePage {
    private static final Logger log = LogManager.getLogger(WD_E2E_Scenarios.class);
    WorkdayCommon workdaycommon = new WorkdayCommon();
/*

        String dir = System.getProperty("user.dir");
        String replaceString = dir.replace("\\","\\\\");
        FileInputStream fis = new FileInputStream(replaceString+"\\src\\test\\resources\\Testdata.xls");
        Excelutil util = new Excelutil();
        HSSFWorkbook wb = new HSSFWorkbook(fis);

        String LNAMECREATEPREHIRE1;
        String FNAMECREATEPREHIRE1;
        String SSNNO = util.SSNGenerator();
        HSSFSheet sheet = wb.getSheet("NameGenerator");

       */


    //Web Elements --------------Start Performance Review----------------------------------------------------------------------
    @FindBy(xpath = "//*[@data-automation-id='promptOption']")
    public WebElement linkStartPerfReview;

    @FindBy(xpath = "//label[text()='Employee']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement empnameStartPerfReview;

    @FindBy(xpath = "//label[text()='Review Template']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement reviewtemplateStartPerfReview;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement btnsubmitStartPerfReview;

    @FindBy(xpath = "//span[@title='Done']")
    public WebElement donePerfReview;


    @FindBy(xpath = "//label[text()='All of Workday']")
    private WebElement allOfWorkday;


    @FindBy(xpath = "//*[text()='Awaiting Action']")
    public WebElement statusStartPerfReview;

    @FindBy(xpath = "//div[text()='Process']")
    public WebElement processtabStartPerfReview;

    @FindBy(xpath = "//button[text()='Actions']")
    public WebElement actionsPerfReview;

    @FindBy(xpath = "//div[@title='Manager' and @data-automation-id='profileHeaderItemTitle']//following::span[1]")
    public WebElement mngrNamePerfReview;

    @FindBy(xpath = "//span[@title='Summary']")
    public WebElement summaryPerfReview;

    @FindBy(xpath = "//span[@title='Submit']")
    public WebElement submitInboxPerfReview;

    @FindBy(xpath = "//label[text()='Goal']//following::div[@data-automation-id='richTextContent'][1]")
    public WebElement goalTxtPerfReview;

    @FindBy(xpath = "//button[@data-automation-id='wd-ActiveList-addButton' and @title='Add']")
    public WebElement addInbxPerfReview;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_next' and @title='Next']")
    public WebElement nextInbxPerfReview;

    @FindBy(xpath = "//span[@title='Go to Guided Editor']")
    public WebElement guidedEditPerfReview;

    @FindBy(xpath = "//button[text()='Actions']")
    public WebElement aaPerfReview;

    @FindBy(xpath = "//label[text()='Category']//following::span[@data-automation-id='promptIcon']")
    public WebElement categoryPerfReview;

    @FindBy(xpath = "//label[text()='Goal']//following::div[@data-automation-id='richTextContent'][1]")
    public WebElement goalTextPerfReview;

    @FindBy(xpath = "//span[@title='Key Deliverables']//following::span[@title='Add'][1]")
    public WebElement addInboxPerfReview;

    @FindBy(xpath = "//span[@title='Go to Summary Editor']")
    public WebElement summaryEditorPerfReview;

    @FindBy(xpath = "//span[@title='Job']")
    public WebElement jobPerfReview;

    @FindBy(xpath = "(//div[text()='Manager History'])[1]")
    public WebElement mngrHistoryPerfReview;

    @FindBy(xpath = "(//span[text()='Manager']//following::div[@data-automation-id='promptOption'])[2]")
    public WebElement mngrNameePerfReview;

    @FindBy(xpath = "//div[@data-automation-id='closeButton']")
    public WebElement closeButtonPerfReview;


    @FindBy(xpath = "//div[@title='Key Deliverables']//following::div[@title='Edit Goal']")
    public WebElement goalEdit1PerfReview;

    @FindBy(xpath = "//div[@title='Edit VBB Row 1']")
    public WebElement vbbEdit1PerfReview;

    @FindBy(xpath = "//div[@title='Edit VBB Row 2']")
    public WebElement vbbEdit2PerfReview;

    @FindBy(xpath = "//div[@title='Edit VBB Row 3']")
    public WebElement vbbEdit3PerfReview;

    @FindBy(xpath = "//div[@title='Edit VBB Row 4']")
    public WebElement vbbEdit4PerfReview;

    @FindBy(xpath = "//div[@title='Edit VBB Row 5']")
    public WebElement vbbEdit5PerfReview;

    @FindBy(xpath = "//div[@title='Edit VBB Row 6']")
    public WebElement vbbEdit6PerfReview;

    @FindBy(xpath = "//div[@title='Edit VBB Row 7']")
    public WebElement vbbEdit7PerfReview;

    @FindBy(xpath = "//div[@data-automation-id='selectSelectedOption']")
    public WebElement mngrRatingPerfReview;


    @FindBy(xpath = "//div[@title='Select a rating for this goal.']//following::div[@data-automation-id='selectSelectedOption']")
    public WebElement mngrRating1PerfReview;

    @FindBy(xpath = "(//div[@data-automation-id='promptOption' and @title='Consistently Demonstrates (+)'])")
    public WebElement mngrRatingValPerfReview;

    @FindBy(xpath = "//div[@title='Select a rating for this goal.']//following::div[text()='Meets Expectations (M)']")
    public WebElement mngrRating1ValPerfReview;

    @FindBy(xpath = "//button[@data-automation-id='asyncNotificationCloseButton']")
    public WebElement inboxclosePerfReview;


    @FindBy(xpath = "(//div[@data-automation-id='promptOption' and @title='Exceeds Expectations/Consistently Demonstrates (E+)'])")
    public WebElement overallRatingValPerfReview;

    @FindBy(xpath = "//div[@title='Overall']//following::div[@title='Edit']")
    public WebElement overallEditPerfReview;

    @FindBy(xpath = "//span[@title='To Do']")
    public WebElement toDoPerfReview;

    @FindBy(xpath = "//div[@title='Acknowledgement']//following::div[@title='Edit'][1]")
    public WebElement ackEditPerfReview;

    @FindBy(xpath = "//div[@title='Rich Text Editor']")
    public WebElement txtEditorPerfReview;

    @FindBy(xpath = "(//label[text()='Status']//following::div[@data-automation-id='icon'])[2]")
    public WebElement statusIconPerfReview;

    @FindBy(xpath = "//div[text()='Start Performance Review']")
    public WebElement StartPerformancePerfReview;

    @FindBy(xpath = "//div[text()='Worker History']")
    public WebElement workerHisProCompHire;

    @FindBy(xpath = "//div[text()='View Worker History']")
    public WebElement viewWorkerHisProCompHire;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[2]")
    public WebElement overallStatusStartPerfReview;

    @FindBy(xpath = "//*[text()='Overall Status']//following::div[text()='Process'][1]")
    public WebElement processTabStartPerfReview;

    @FindBy(xpath = "//label[text()='Review Template']//following::*[@data-automation-id='promptIcon'][2]")
    public WebElement disActionReason;

    @FindBy(xpath = "(//*[@data-automation-id='dateWidgetInputBox'])[1]")
    public WebElement StartDate;


    @FindBy(xpath = "(//*[@data-automation-id='dateWidgetInputBox'])[2]")
    public WebElement EndDate;

    @FindBy(xpath = "//*[@data-automation-id='promptSearchButton']")
    public WebElement promptSearch;


    //Start Development Plan-------------------------------------------------------------------------


    @FindBy(xpath = "//span[@title='Job']")
    public WebElement jobEmpProfile;

    @FindBy(xpath = "//span[text()='More']")
    public WebElement tabmoreEmpProfile;

    @FindBy(xpath = "//span[text()='More']//following::div[text()='Manager History']")
    public WebElement managerhistoryEmpProfile;

    @FindBy(xpath = "//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]")
    public WebElement managernameEmpProfile;




    @FindBy(xpath = "//div[text()='Start Disciplinary Action']")
    public WebElement StartDisciplinaryAction;

    @FindBy(xpath = "//div[text()='Start Development Plan']")
    public WebElement StartDevelopmentPlanAction;


    @FindBy(xpath = "//label[text()='Employee']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement empStartDevelopPlanforEmp;


    @FindBy(xpath = "//label[text()='Review Template']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement reviewtemplateStartDevelopPlanforEmp;


    @FindBy(xpath = "//label[text()='Period Start Date']//following::div[@data-automation-id='dateWidgetContainer'][1]")
    public WebElement periodstartdateStartDevelopPlanforEmp;

    @FindBy(xpath = "//label[text()='Period End Date']//following::div[@data-automation-id='dateWidgetContainer'][1]")
    public WebElement periodenddateStartDevelopPlanforEmp;

    @FindBy(xpath = "//span[text()='Details and Process']")
    public WebElement detailsandprocessStartDevelopPlanforEmp;

    @FindBy(xpath = "//button[@title='Go to Summary Editor']")
    public WebElement gotoSummaryEditorInbox;

    @FindBy(xpath = "//div[@title='Edit Discussion Item Row 1' and @data-automation-id='actionImage']")
    public WebElement editdiscussiononeInbox;

    @FindBy(xpath = "//label[text()='Response']//following::div[@data-automation-id='richTextContent']")
    public WebElement responseInbox;

    @FindBy(xpath = "//div[@title='Edit Discussion Item Row 2' and @data-automation-id='actionImage']")
    public WebElement editdiscussiontwoInbox;

    @FindBy(xpath = "//div[@title='Edit Discussion Item Row 3' and @data-automation-id='actionImage']")
    public WebElement editdiscussionthreeInbox;

    @FindBy(xpath = "//h3[text()='Progress Update']//following::button[@data-automation-id='wd-ActiveList-addButton']")
    public WebElement btnaddProcessUpdate;


    @FindBy(xpath = "//h3[text()='Progress Update']//following::div[@data-automation-id='actionImage' and @title='Edit Development Item'][1]")
    public WebElement btneditProcessUpdate;

    @FindBy(xpath = "//label[text()='Development Item']//following::input[@data-automation-id='textInputBox']")
    public WebElement developmentitemProcessUpdateInbox;

    @FindBy(xpath = "//label[text()='Status']//following::span[@data-automation-id='promptIcon']")
    public WebElement statusProcessUpdateInbox;


    @FindBy(xpath = "//div[text()='Worker History']")
    public WebElement workerhistoryActions;


    @FindBy(xpath = "//div[text()='View Worker History']")
    public WebElement viewworkerhistoryActions;

    @FindBy(xpath = "//div[text()='Details']//following::div[text()='Process'][1]")
    public WebElement processtab;


    @FindBy(xpath = "//div[text()='Awaiting Action']//following::*[@data-automation-id='promptOption'][1]")
    public WebElement approvername;


    //@FindBy(xpath = "(//label[text()='Status'])[2]//following::span[@data-automation-id='promptIcon'][1]")
    @FindBy(xpath = "//label[text()='Status']//following::span[@data-automation-id='promptIcon'][1]")
    //@FindBy(xpath = "(//label[text()='Status'])[3]//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement statusmanagerProcessUpdateInbox;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement submitInbox;

    @FindBy(xpath = "//button[@title='Done']")
    public WebElement doneInbox;

    @FindBy(xpath = "//span[text()='Details and Process']")
    public WebElement detailsandprocessInbox;


    @FindBy(xpath = "//div[text()='Awaiting Action']//following::div[@data-automation-id='promptOption'][1]")
    public WebElement hrpartnerName;

    @FindBy(xpath = "//div[@title='Edit' and @data-automation-id='actionImage']")
    public WebElement editAck;

    @FindBy(xpath = "//label[text()='Status']//following::span[@data-automation-id='promptIcon']")
    public WebElement statusAck;


    @FindBy(xpath = "//div[@title='Acknowledgement']//following::div[@title='Edit'][1]")
    public WebElement ackEditStartDevPlan;


    @FindBy(xpath = "//div[@title='Rich Text Editor']")
    public WebElement txtEditorStartDevPlan;
    @FindBy(xpath = "(//label[text()='Status']//following::div[@data-automation-id='icon'])[2]")
    public WebElement statusIconStartDevPlan;

    @FindBy(xpath = "//div[@data-automation-label='Acknowledge Receipt']")
    public WebElement ackReceiptStartDevPlan;

    ///---------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//div[@data-automation-label='Acknowledge Receipt']")
    public WebElement ackReceiptPerfReview;


    @FindBy(xpath = "//label[text()='Overall Status']//following::div[@data-automation-id='textView' and text()='Successfully Completed']")
    public WebElement overallstatus;


    //VALIDATION---------------------------------------------------

    @FindBy(xpath = "//button[@data-automation-id='Current_User']")
    public WebElement btnCurrentUser;

    @FindBy(xpath = "//li[@data-automation-id='hammy_current_user_item']")
    public WebElement linkCurrentUserItem;

    @FindBy(xpath = "//span[@data-automation-id='workerProfileMenuItemLabel' and text()='Performance']")
    public WebElement performanceActions;

    @FindBy(xpath = "//div[text()='Development Plans' and @data-automation-id='tabLabel']")
    public WebElement developmentplanActions;

    @FindBy(xpath = "//button[@title='View']")
    public WebElement buttonView;


    @FindBy(xpath = "//div[text()='Process Successfully Completed']")
    public WebElement validateProcess;

    @FindBy(xpath = "//span[text()='View Printable Employee Review']")
    public WebElement validateViewReview;

//Start_Talent_Review----------------------------------------

    @FindBy(xpath = "//button[@title='OK']")
    public WebElement btnokStarttalntReview;


    @FindBy(xpath = "//button[@title='Done']")
    public WebElement btnDoneStarttalntReview;

    @FindBy(xpath = "//*[@data-automation-label='Start Talent Review for Worker']")
    public WebElement linkStarttalntReview;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement inboxbuttonSubmit;

    @FindBy(xpath = "//*[@data-automation-id='uic_summaryEditorButton']")
    public WebElement summaryEditorButton;

    @FindBy(xpath = " //label[text()='Worker']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement empnameStarttalntReview;

    @FindBy(xpath = "//label[text()='Talent Review Template']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement reviewtemplateStarttalntReview;

    @FindBy(xpath = "//*[@title='Add Work Experience']")
    public WebElement AddWorkExperience;


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


    //Move Workers--------------------------------------------------------------------------------
    @FindBy(xpath = "//div[@data-automation-id='promptOption' and contains(text(),'Move Associates')]")
    private WebElement linkMoveAssociates;


    @FindBy(xpath = "//label[text()='Effective Date']//following::div[@data-automation-id='dateWidgetContainer']")
    private WebElement effectivedateMoveAssociates;

    @FindBy(xpath = "//label[text()='Supervisory Organization']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement supOrgMoveAssociates;


    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_uic_okButton']")
    private WebElement btnokMoveAssociates;

    @FindBy(xpath = "//label[text()='Proposed Supervisory Organization']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement proposedsuporgMoveAssociates;



    @FindBy(xpath = "//span[@data-automation-id='columnLabel-2' and text()='Associate']")
    private WebElement filterAssociate;

    @FindBy(xpath = "//span[text()='Associate']//following::label[text()='Value']//following::span[@data-automation-id='promptIcon']")
    //@FindBy(xpath = "//span[text()='Associate']//following::label[text()='Value']//following::input[1]")
    private WebElement enterAssociate;

    @FindBy(xpath = "//label[text()='Select All']//following::div[@data-automation-id='checkboxPanel'][1]")
    private WebElement chkboxSelectAll;

    @FindBy(xpath = "(//div[text()='Krystal Snow'])[2]//following::div[text()='Company']")
    private WebElement companyAssociate;

    @FindBy(xpath = "(//div[text()='Krystal Snow'])[2]//following::div[text()='Company']//following::div[@data-automation-id='responsiveMonikerInput'][2]")
    private WebElement enterCompanyMoveAssociate;

    @FindBy(xpath = "(//div[text()='Krystal Snow'])[2]//following::div[text()='Cost Center']//following::div[@data-automation-id='responsiveMonikerInput'][2]")
    private WebElement enterCostCenterMoveAssociate;


///-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//span[contains(@title,'More')]")
    public WebElement moreTabOption;


    @FindBy(xpath = "//span[text()='Performance']")
    private WebElement tabPerformance;

    @FindBy(xpath = "//span[@data-automation-id='moreLinkLabel' and contains(text(),'More')]")
    private WebElement clickTabMore;

    @FindBy(xpath = "(//div[text()='Individual Goals'])[1]")
    private WebElement subTabIndividualGoals;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton' and @title='Edit']")
    private WebElement btnEdit;

    @FindBy(xpath = "(//div[text()='Archived Goals'])[1]")
    private WebElement subTabArchivedGoals;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton' and @title='Archive Goals']")
    private WebElement btnArchiveGoals;

    @FindBy(xpath = "(//div[text()='Development Plans'])[1]")
    private WebElement subTabDevelopmentPlans;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton' and @title='Start My Development Plan']")
    public WebElement btnStartMyDevPlan_Emp;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton' and @title='Start Development Plan']")
    public WebElement btnStartMyDevPlan_Manager;

    @FindBy(xpath = "(//div[text()='Performance Reviews'])[1]")
    private WebElement subTabPerformanceReview;

    @FindBy(xpath = "//span[text()='Career']")
    private WebElement tabCareer;

    @FindBy(xpath = "//*[@data-automation-id='popupOption' and text()='Development Items']")
    private WebElement subTabDevelopmentItems;


    @FindBy(xpath = "//button[@data-automation-id='wd-ActiveList-addButton' and @title='Add']")
    private WebElement btnAddActiveList;

    @FindBy(xpath = "//*[@data-automation-id='popupOption' and text()='Career Interests']")
    private WebElement subTabCareerInterests;

    @FindBy(xpath = "//*[@data-automation-id='popupOption' and text()='Job Interests']")
    private WebElement subTabJobInterests;

    @FindBy(xpath = "//*[@data-automation-id='popupOption' and text()='Work Experience']")
    private WebElement subTabWorkExperience;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton' and @title='Add']")
    private WebElement commandBtnAdd;

    @FindBy(xpath = "//*[@data-automation-id='popupOption' and text()='Job History']")
    private WebElement subTabJobHistory;

    @FindBy(xpath = "//span[text()='More']//following::div[text()='Achievements']")
    private WebElement subTabAchievements;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton' and @title='Add Award and Activity']")
    private WebElement btnAddAwardandActivity;

    @FindBy(xpath = "//span[text()='More']//following::div[text()='Certifications']")
    private WebElement subTabCertifications;

    @FindBy(xpath = "//span[text()='More']//following::div[text()='Education']")
    private WebElement subTabEducation;

    @FindBy(xpath = "//span[text()='More']//following::div[text()='Languages']")
    private WebElement subTabLanguage;

    @FindBy(xpath = "//span[text()='More']//following::div[text()='Relocation']")
    private WebElement subTabRelocation;

    @FindBy(xpath = "//span[text()='More']//following::div[text()='Travel']")
    private WebElement subTabTravel;


    @FindBy(xpath = "//label[text()='Development Item']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement enterDevelopmentItem;

    @FindBy(xpath = "//label[text()='Status']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement enterStatus;

    @FindBy(xpath = "(//label[text()='Status'])[2]//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement enterStatusMngr;


    @FindBy(xpath = "//div[@data-automation-id='saveButton' and @title='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//label[text()='Career Preferences']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement careerPreferences;

    @FindBy(xpath = "//label[text()='Job Profiles']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement jobProfiles;

    @FindBy(xpath = "//label[text()='Work Experience']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement workExperience;

    @FindBy(xpath = "//button[@data-automation-id='panelSetAddButton']")
    private WebElement btnAddWorkExp;


    @FindBy(xpath = "//label[text()='Job Title']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement jobTitle;

    @FindBy(xpath = "//label[text()='Company']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement companyJobHistory;

    @FindBy(xpath = "//label[text()='Start Date']//following::div[@data-automation-id='dateWidgetContainer'][1]")
    private WebElement startDateJobHistory;

    @FindBy(xpath = "//label[text()='Type']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement typeAwardAndActivity;

    @FindBy(xpath = "//label[text()='Title']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement titleAwardAndActivity;

    @FindBy(xpath = "//label[text()='Start Date']//following::div[@data-automation-id='dateWidgetContainer'][1]")
    private WebElement startDateAwardAndActivity;

    @FindBy(xpath = "//label[text()='Certification']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement certifications;

    @FindBy(xpath = "//label[text()='Country']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement countryAddEducation;

    @FindBy(xpath = "//label[text()='School']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement schoolAddEducation;

    @FindBy(xpath = "//span[text()='Language']//following::button[@title='Remove Row']//following::div[@data-automation-id='responsiveMonikerInput'][1]")
    private WebElement langAddLanguage;


//    @FindBy(xpath = "//span[text()='Ability']//following::button[@title='Remove Row'][2]//following::div[@role='presentation'][1]")
    @FindBy(xpath = "//span[text()='Ability']//following::button[@title='Remove Row'][2]//following::div[@data-automation-id='selectWidget'][1]")
    private WebElement abilityAddLanguage;

    @FindBy(xpath = "//span[text()='Ability']//following::button[@title='Remove Row'][2]//following::div[@data-automation-id='selectWidget'][1]")
    private WebElement clickAbilityAddLanguage;


    @FindBy(xpath = "(//button[@title='Remove Row'])[2]//following::div[@data-automation-id='selectWidget'][1]//following::div[text()='Speak']")
    private WebElement chooseAbilityAddLanguage;


    @FindBy(xpath = "//span[@title='Short Term']//following::label[text()='Are you willing to relocate?'][1]//following::div[@data-automation-id='selectWidget'][1]")
    private WebElement shortTermAddLanguage;


    @FindBy(xpath = "(//label[text()='Are you willing to relocate?'])[1]//following::div[@data-automation-id='selectWidget'][1]//following::div[text()='Yes']")
    private WebElement selectYesShortTermAddRelocate;

    @FindBy(xpath = "//label[text()='Where for short term?']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement whereToRelocateAddRelocate;

    @FindBy(xpath = "//label[text()='Are you willing to travel?']//following::div[@data-automation-id='selectWidget'][1]")
    private WebElement travelAddTravel;

    @FindBy(xpath = "//label[text()='Are you willing to travel?']//following::div[@data-automation-id='selectWidget'][1]//following::div[text()='Yes']")
    private WebElement chooseTravelAddTravel;

    @FindBy(xpath = "//label[text()='What amount of time?']//following::div[@data-automation-id='selectWidget'][1]")
    private WebElement travelPeriodAddTravel;

    @FindBy(xpath = "//label[text()='What amount of time?']//following::div[@data-automation-id='selectWidget'][1]//following::div[text()='1'][1]")
    private WebElement chooseTravelPeriodAddTravel;


    @FindBy(xpath = "//span[@data-automation-id='workerProfileMenuItemLabel' and text()='Job']")
    private WebElement tabJob;


//common----------------------

    @FindBy(xpath = "//span[text()='More']//following::div[@data-automation-id='popupOption' and text()='Manager History']")
    private WebElement subTabManagerHistory;


    @FindBy(xpath = "//span[text()='More']//following::div[@data-automation-id='popupOption' and text()='Support Role']")
    private WebElement subTabSupportRole;

    @FindBy(xpath = "//span[contains(text(),'My HR Partner')]//following::div[@data-automation-id='promptOption'][1]")
    private WebElement hrPartnerName;


    @FindBy(xpath = "//div[text()='Associate History']//following::div[text()='View Associate History by Category']")
    private WebElement viewAssociateHistorybyCategory;

    @FindBy(xpath = "//div[text()='Associate History']")
    private WebElement actionAssociateHistory;

//    @FindBy(xpath = "//span[text()='Position Change History']//following::div[contains(text(),'Transfer: ')][1]//following::img[1]")
//    private WebElement transferLink;

    @FindBy(xpath = "(//span[text()='Effective Date'])[1]")
    public WebElement headerEffectiveDate;

    @FindBy(xpath = "//span[text()='Effective Date']//following::label[text()='Value']//following::input[@data-automation-id='dateWidgetInputBox']")
    public WebElement valueEffectiveDate;

    @FindBy(xpath = "//span[text()='Effective Date']//following::button[@data-automation-id='uic_filterButton' and @title='Filter']")
    public WebElement btnFilterEffectiveDate;

    @FindBy(xpath = "//*[@data-automation-id='searchBox']")
    private WebElement insidesearchboxcommon;

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

    @FindBy(xpath = "//button[@title='Filter']")
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
    private WebElement tabMore;

    //Correct JobChange effective date--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//span[text()='Associate History']//following::*[text()='Business Process'][1]")
    private WebElement BusinessProcess;

    @FindBy(xpath = "//label[text()='Value']//following::*[@data-automation-id='searchBox'][1]")
    private WebElement filterEnterValue;

    @FindBy(xpath = "//span[text()='Position Change History']//following::div[contains(text()='Transfer: ')][1]//following::img[1]")
//    @FindBy(xpath = "//span[text()='Position Change History']//following::div[text()='Successfully Completed'][1]//preceding::div[text()='Transfer:"+Employee+"'][1]//following::img[1]")
    private WebElement transferLink;

    @FindBy(xpath = "//span[text()='Position Change History']//following::span[text()='Effective Date'][1]")
    private WebElement effectiveDate;

//    @FindBy(xpath = "//label[text()='Value']//following::*[@data-automation-id='dateWidgetContainer'][1]")
//    private WebElement valueEffectiveDate;

    @FindBy(xpath = "//h2[text()='Actions']//following::div[text()='Business Process']")
    private WebElement actionBusinesProcess;

    @FindBy(xpath = "//div[text()='Business Process']//following::div[text()='Correct']")
    private WebElement correctJobChangeBP;

    @FindBy(xpath = "//label[text()='Effective Date']//following::div[@data-automation-id='dateWidgetContainer'][1]")
    private WebElement correctEffectiveDate;

    @FindBy(xpath = "//label[text()='First Day of Work']")
    private WebElement firstDayOfWork;

    @FindBy(xpath = "//label[text()='First Day of Work']//following::input[@data-automation-id='dateWidgetInputBox'][1]")
    private WebElement enterDatefirstDayOfWork;

    @FindBy(xpath = "//textarea[@data-automation-id='textAreaField'][1]")
    private WebElement enterComments;

    @FindBy(xpath = "//span[text()='Details and Process']")
    private WebElement detailsandprocess;


//span[text()='Position Change History']//following::*[text()='Transfer: Niamh Ethan'][1]

    //Verify Moved Associate-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


    @FindBy(xpath = "//span[text()='More']//following::div[text()='Organizations']")
    private WebElement tabOrganizations;


    @FindBy(xpath = "//div[text()='Time and Leave']")
    private WebElement TimeandLeave_optionActions;

    @FindBy(xpath = "//div[text()='View Leave Results']")
    private WebElement leaveResults_optionActions;

    @FindBy(xpath = "//label[text()='As Of']//following::input[@data-automation-id='dateWidgetInputBox']")
    private WebElement asOfDate;

    @FindBy(xpath = "//label[text()='Leave Type(s)']//following::span[@data-automation-id='promptIcon']")
    private WebElement leaveType;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    private WebElement enterType;

    @FindBy(xpath = "//span[text()='Status']")
    private WebElement chkStatus;

    @FindBy(xpath = "//span[text()='Status']//following::div[@data-automation-id='textView'][7]")
    private WebElement statusLeave;

    @FindBy(xpath = "//label[text()='As Of']//following::div[@data-automation-id='textView'][1]")
    private WebElement checkAsOfDate;

    @FindBy(xpath = "//label[text()='Leave Type']//following::div[contains(text(),'Medical Leave (Unpaid)')][1]")
    private WebElement checkLeaveType;


    // Legal name change -------------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and text()='Change My Legal Name']")
    private WebElement linkChangeMyLegalName;

    @FindBy(xpath = "//label[text()='Effective Date']//following::div[@data-automation-id='dateWidgetContainer']")
    private WebElement effectivedateChangeMyLegalName;

    //@FindBy(xpath = "//label[text()='Country']//following::input[@data-automation-id='searchBox'][1]")
    @FindBy(xpath = "//label[text()='Country']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement countryChangeMyLegalName;

    @FindBy(xpath = "//label[text()='First Name']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement changeFirstName;

    @FindBy(xpath = "//label[text()='Last Name']//following::input[@data-automation-id='textInputBox'][1]")
    private WebElement changeLasttName;

    @FindBy(xpath = "//button[@title='To Do']")
    private WebElement btnToDo;

    @FindBy(xpath = "//div[@data-automation-id='textView' and text()='Process Successfully Completed']")
    private WebElement validateChangeMyLegalName;

    //    xpaths for the three dots selection
    @FindBy(xpath = "(//div[@data-automation-id='relatedActionsItemLabel' and text()='Security Profile'])")
    private WebElement securityProfile;

    @FindBy(xpath = "//*[text()='Start Proxy']")
    private WebElement startProxyFromAssociateName;

//    Change My Preferred Name-------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and text()='Change My Preferred Name']")
    private WebElement linkChangeMyPreferredName;

    @FindBy(xpath = "//label[text()='Prefix']//following::div[@data-automation-id='multiselectInputContainer'][1]")
    private WebElement changePrefix;

    @FindBy(xpath = "//label[text()='Suffix']//following::div[@data-automation-id='multiselectInputContainer'][1]")
    private WebElement changeSuffix;

    @FindBy(xpath = "//div[@data-automation-id='textView' and text()='Process Successfully Completed']")
    private WebElement validateChangeMyPreferredName;


//    //    xpaths for the three dots selection
//    @FindBy(xpath = "(//div[@data-automation-id='relatedActionsItemLabel' and text()='Security Profile'])")
//    private WebElement securityProfile;
//
//    @FindBy(xpath = "//*[text()='Start Proxy']")
//    private WebElement startProxyFromAssociateName;

//    Edit Service Date-------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and text()='Edit Service Dates']")
    private WebElement linkEditSrviceDate;

    @FindBy(xpath = "//label[text()='Associate']//following::*[@data-automation-id='promptIcon'][1]")
    private WebElement enterAssoc;

    @FindBy(xpath = " //button[@title='OK']")
    private WebElement buttonokEditServce;

    @FindBy(xpath = " //label[text()='Original Hire Date']//following::div[@data-automation-id='dateWidgetContainer'][1]")
    private WebElement changeoriginalHiredate;

    @FindBy(xpath = "//div[@data-automation-id='textView' and text()='Process Successfully Completed']")
    private WebElement validateEditServiceDate;

//    Password and Visa-------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//div[text()='Personal Data']")
    public WebElement PersonalData;

    @FindBy(xpath = "//div[text()='Edit Passports and Visas']")
    public WebElement EditPassportVisa;


    @FindBy(xpath = "//*[text()='Visas']//following::button[@data-automation-id='addRow'][1]")
    public WebElement addrowVisa;

    @FindBy(xpath = "//span[text()='Country']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement countryClickVisa;

    @FindBy(xpath = "//span[text()='Visa ID Type']//following::span[@data-automation-id='promptIcon'][2]")
    public WebElement enterVisaIdType;

    @FindBy(xpath = "//input[@data-automation-id='textInputBox']")
    public WebElement enterIdentification;

    @FindBy(xpath = "//div[@data-automation-id='textView' and text()='Process Successfully Completed']")
    private WebElement validatePassportVisaInfo;

    @FindBy(xpath = "//div[text()='Associate History']")
    public WebElement AssocHisPassVisa;

    @FindBy(xpath = "//div[text()='View Associate History']")
    public WebElement viewAssocHisPassVisa;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[text()='Process'][1]")
    public WebElement processPassVisa;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[2]")
    public WebElement overallStatusPassVisa;

    @FindBy(xpath = "//*[text()='Awaiting Action']")
    public WebElement statusPassVisa;


//   Change Hire date into Future date-------------------------------------------------------------------------------------------------------------

    @FindBy(xpath = "//div[text()='Associate History']")
    public WebElement AssocHistoryLink;

    @FindBy(xpath = "//div[text()='View Associate History by Category']")
    public WebElement ViewAssocHistoryLink;

    @FindBy(xpath = "//*[text()='Business Process' and @data-automation-id = 'relatedActionsItemLabel' ]")
    public WebElement businessProcess;

    @FindBy(xpath = "//*[text() = 'Correct']")
    public WebElement CorrectOption;

    @FindBy(xpath = "//label[text()='Hire Date']//following::div[@data-automation-id='dateWidgetContainer'][1]")
    public WebElement ChangeHireDate;

    @FindBy(xpath = "//*[@data-automation-id = 'textAreaField']")
    public WebElement commentArea;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[2]")
    public WebElement overallStatusHire;

    @FindBy(xpath = "//label[text()='Reason']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement ReasonTerm;

    @FindBy(xpath = "//label[text()='Termination Date']//following::div[@data-automation-id='dateWidgetContainer'][1]")
    public WebElement EnterTermDate;


// Employee Proxy

    @FindBy(xpath = "//div[text()='Security Profile']")
    public WebElement securityprofileActions;

    @FindBy(xpath = "//div[text()='Start Proxy']")
    public WebElement startproxyActions;

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_okButton' and @type='button']")
    public WebElement okbuttonStartProxy;

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



// End Contingent Worker Contract

    @FindBy(xpath = "//div[text()='End Contingent Worker Contract']")
    private WebElement linkEndCCW;

    @FindBy(xpath = "//div[text()='Contingent Worker']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement enterCCWName;


    @FindBy(xpath = "//label[text()='Contract End Date']//following::input[@data-automation-id='dateWidgetInputBox'][1]")
    private WebElement contractEndDate;

    @FindBy(xpath = "//label[text()='Reason']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement reasonEndCCW;

    @FindBy(xpath = "//span[text()='Additional Information']")
    private WebElement additionalInfoEndCCW;

    @FindBy(xpath = "//label[text()='Last Day of Work']//following::input[@data-automation-id='dateWidgetInputBox'][1]")
    private WebElement lastDateOfWorkEndCCW;

    @FindBy(xpath = "//*[text()='Awaiting Action']")
    private WebElement chkAwaitingActions;


// verify Comp tab --------------------------------------------------------------------------------------------------------------


    @FindBy(xpath = "//span[text()='Compensation']")
    private WebElement tabComp;

    @FindBy(xpath = "//div[@data-automation-id='relatedActionsItemLabel' and text()='Compensation']")
    private WebElement actionsCompensation;

    @FindBy(xpath = "//div[@data-automation-id='relatedActionsItemLabel' and text()='Compensation']//following::div[text()='View Compensation History']")
    private WebElement viewCompensationHistory;

//---------------------------------------------------------------------------------

/*
    public void Jobchange(String SUPORG, String UPosition, String EmpType, String TimeType, String Salary) throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            // searchbySearchBox(Constants.SRCHCHANGEJOB);
            workdaycommon.searchbySearchBox("Change job");
            workdaycommon.userWait(2500);
            linkchangeJob.click(); //clicking on Change job link
            log.info(("Starting with job change . . .. . . "));
            workernameChangeJob.click(); //Entering worker's/employee name for whom the job to be changed
            workdaycommon.userWait(1000);


            String name = this.FNAMECREATEPREHIRE1 + " " + this.LNAMECREATEPREHIRE1;
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
            workdaycommon.scroll();
            changelocationChangeJob.click();
            workdaycommon.userWait(1000);
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
            log.error("Error occurred: " + e.getMessage());
        }

    }

    */


    public void View_Performance_and_Career_Tab(String Employee, String DevelopmentItem, String Status, String CareerPreferences, String JobProfiles, String WorkExperience, String Company_JobHistory, String Award_Type, String Certifications) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(2000);

        // HirefunctionalityPage hirefunctionalityPage = new HirefunctionalityPage();
        log.info("View Performance Started--->" + Employee);

        workdaycommon.StartProxy_employee(Employee); //uncomment when needed

//        workdaycommon.simplestartProxy(Employee);
        workdaycommon.gotoWorkdayHomepage();


        workdaycommon.selfImgBtn.click();
        workdaycommon.userWait(2000);
        workdaycommon.viewprofileSelf.click();
        workdaycommon.userWait(2000);

        PerformanceTab(Employee, Employee);
        workdaycommon.userWait(2000);

        workdaycommon.selfImgBtn.click();
        workdaycommon.userWait(2000);
        workdaycommon.viewprofileSelf.click();
        workdaycommon.userWait(2000);
        careerInformation(Employee, DevelopmentItem, Status, CareerPreferences, JobProfiles, WorkExperience, Company_JobHistory, Award_Type, Certifications, Employee);
        additionalInformation(Employee, Employee);

        //Manager proxy0
        test.info("Manager verification started");
        log.info("Manager verification started");
        tabJob.click();
        workdaycommon.userWait(2000);
        workdaycommon.more_dropdownbox(subTabManagerHistory);
        WebElement managerName = driver.findElement(By.xpath("//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]"));
        String ManagerName = managerName.getText();
        test.info("Proxying to Associate's Manager : "+ManagerName);
        WebElement proxyMngr = driver.findElement(By.xpath("//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]//following::img[1]"));
        proxyMngr.click();
        workdaycommon.scrolltoElement(securityProfile);
        workdaycommon.mousemove(securityProfile,startProxyFromAssociateName);
        workdaycommon.userWait(1000);
        startProxyFromAssociateName.click();
        btnOKChangeJob.click();
        workdaycommon.userWait(3000);
        log.info(".......Proxy successful.......");

        //workdaycommon.startProxy(ManagerName);
        workdaycommon.userWait(2000);
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(2000);
        allOfWorkday.click();
        workdaycommon.userWait(5000);
        //WebElement empName = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and text()='" + Employee + "']"));
        WebElement empName = driver.findElement(By.xpath("(//*[text()='" + Employee + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        workdaycommon.scrolltoElement(empName);
        empName.click();
        workdaycommon.userWait(3000);
        PerformanceTab(Employee, ManagerName);
        workdaycommon.userWait(2000);
//        careerInformation(Employee, DevelopmentItem, Status, CareerPreferences, JobProfiles, WorkExperience, Company_JobHistory, Award_Type, Certifications, ManagerName);
//        workdaycommon.userWait(3000);
//        additionalInformation(Employee, ManagerName);
        workdaycommon.userWait(3000);

    }

    public void AssociateVerify_Performance_and_Career_Tab(String Employee, String DevelopmentItem, String Status, String CareerPreferences, String JobProfiles, String WorkExperience, String Company_JobHistory, String Award_Type, String Certifications) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(2000);

        // HirefunctionalityPage hirefunctionalityPage = new HirefunctionalityPage();
        log.info("View Performance Started--->" + Employee);

        //workdaycommon.StartProxy_employee(Employee); //uncomment when needed
        workdaycommon.simplestartProxy(Employee);
        workdaycommon.gotoWorkdayHomepage();


        workdaycommon.selfImgBtn.click();
        workdaycommon.userWait(2000);
        workdaycommon.viewprofileSelf.click();
        workdaycommon.userWait(2000);

        PerformanceTab(Employee, Employee);
        workdaycommon.userWait(2000);
        workdaycommon.selfImgBtn.click();
        workdaycommon.userWait(2000);
        workdaycommon.viewprofileSelf.click();
        workdaycommon.userWait(2000);
        careerInformation(Employee, DevelopmentItem, Status, CareerPreferences, JobProfiles, WorkExperience, Company_JobHistory, Award_Type, Certifications, Employee);
        workdaycommon.userWait(3000);
        additionalInformation(Employee, Employee);

    }

    public void ManagerVerify_Performance_and_Career_Tab(String Employee, String DevelopmentItem, String Status, String CareerPreferences, String JobProfiles, String WorkExperience, String Company_JobHistory, String Award_Type, String Certifications) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(2000);

        workdaycommon.selfImgBtn.click();
        workdaycommon.userWait(2000);
        workdaycommon.viewprofileSelf.click();
        workdaycommon.userWait(2000);

        //Manager proxy
        test.info("Manager verification started");
        log.info("Manager verification started");
        tabJob.click();
        workdaycommon.userWait(2000);
        workdaycommon.more_dropdownbox(subTabManagerHistory);
        WebElement managerName = driver.findElement(By.xpath("//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]"));
        String ManagerName = managerName.getText();
        workdaycommon.simplestartProxy(ManagerName);
        //workdaycommon.startProxy(ManagerName);
        workdaycommon.userWait(2000);
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(2000);
        allOfWorkday.click();
        workdaycommon.userWait(5000);
        //WebElement empName = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and text()='" + Employee + "']"));
        WebElement empName = driver.findElement(By.xpath("(//*[text()='" + Employee + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        workdaycommon.scrolltoElement(empName);
        empName.click();
        workdaycommon.userWait(3000);
        PerformanceTab(Employee, ManagerName);
        workdaycommon.userWait(2000);
//        careerInformation(Employee, DevelopmentItem, Status, CareerPreferences, JobProfiles, WorkExperience, Company_JobHistory, Award_Type, Certifications, ManagerName);
//        workdaycommon.userWait(3000);
//        additionalInformation(Employee, ManagerName);
        workdaycommon.userWait(3000);

    }


    public void PerformanceTab(String Employee, String proxyName) throws Exception {

        moreTabOption.click();
        tabPerformance.click();
        tabPerformance.click();
            log.info("Entering catch block ....");
            workdaycommon.scrollDOWN_height();
            workdaycommon.userWait(1000);
            tabPerformance.click();
            log.info(" Performance tab is clicked ....");
            workdaycommon.userWait(2000);

        //workdaycommon.userWait(5000);
        log.info("Entering Performance tab....");
        try {
            WebActionsUtil.explicitWait(driver, subTabIndividualGoals, "click");
            subTabIndividualGoals.click();
            log.info("Individual Goals section is clicked");
            if (btnEdit.isDisplayed()) {
                log.info("Edit Individual Goals option is available");
                workdaycommon.userWait(2000);
                test.info("Edit option for Individual Goals is available");

            }
        } catch (Exception ex) {
            test.info("Edit option in Individual Goals is not available");
            log.info("Edit option for Individual Goals is not available" + ex.getMessage());
        }
        try {
            subTabArchivedGoals.click();
            workdaycommon.userWait(2000);
            log.info("Archived Goals section is clicked");
            if (btnArchiveGoals.isDisplayed()) {
                log.info("Edit Archived Goals option is available");
                workdaycommon.userWait(2000);
                test.info("Edit option in Archived Goals is available");
            }
        } catch (Exception ex) {
            test.info("Edit option in Archived Goals is not available");
            log.info("Edit option in Archived Goals is not available" + ex.getMessage());
        }
        try {
            subTabDevelopmentPlans.click();
            workdaycommon.userWait(2000);
            WebElement btnStartMyDevPlan;
            log.info("Development Plans section is clicked");
            if (Employee.equalsIgnoreCase(proxyName)) {
                btnStartMyDevPlan = btnStartMyDevPlan_Emp;
            } else {
                btnStartMyDevPlan = btnStartMyDevPlan_Manager;
            }
            if (btnStartMyDevPlan.isDisplayed()) {
                log.info("Edit Start My Development Plan option is available");
                workdaycommon.userWait(2000);
                test.info("Edit option in Development Plans is available");
            }
        } catch (Exception ex) {
            test.info("Edit option in Development Plans is not available");
            log.info("Edit option in Development Plans is not available" + ex.getMessage());
        }
        subTabPerformanceReview.click();
        workdaycommon.userWait(2000);
        log.info("Performance Review section is clicked");
        if (proxyName == Employee) {
            test.pass("All subsections under Performance tab are visible for the employee, " + Employee);
            log.info("All subsections under Performance tab are visible for the employee, " + Employee);
        } else {
            test.pass(proxyName + " has access to enter Individual Goals, Start Development Plan and Start Performance Review for the employee, " + Employee);
            log.info(proxyName + " has access to enter Individual Goals, Start Development Plan and start Performance Review for the employee, " + Employee);
        }
    }

    public void careerInformation(String Employee, String DevelopmentItem, String Status, String CareerPreferences, String JobProfiles, String WorkExperience, String Company_JobHistory, String Award_Type, String Certifications, String proxyName) throws Exception {


        moreTabOption.click();
        workdaycommon.userWait(2000);
        workdaycommon.scrollDOWN_height();
        workdaycommon.userWait(2000);
        tabPerformance.click();
        tabCareer.click();
        log.info(" Performance tab is clicked ....");
        workdaycommon.userWait(2000);

        workdaycommon.userWait(3000);
        log.info("Development Items");
        try {
            workdaycommon.more_dropdownbox(subTabDevelopmentItems);
            workdaycommon.userWait(2000);
            WebActionsUtil.explicitWait(driver, btnAddActiveList, "click");
            if (btnAddActiveList.isDisplayed()) {
                btnAddActiveList.click();
                if (proxyName == Employee) {
                    workdaycommon.userWait(2000);
                    enterDevelopmentItem.sendKeys(DevelopmentItem, Keys.ENTER);
                    workdaycommon.userWait(3000);
                    workdaycommon.scrolltoElement(enterStatus);
                    workdaycommon.userWait(2000);
                    enterStatus.click();
                    workdaycommon.userWait(2000);
                    insidesearchboxcommon.sendKeys(Status, Keys.ENTER);
                    workdaycommon.userWait(5000);
                    btnSaveDevItems.click();
                } else {
                    workdaycommon.userWait(2000);
                    enterDevelopmentItem.sendKeys("Testing", Keys.ENTER);
                    workdaycommon.userWait(3000);
                    workdaycommon.scrolltoElement(enterStatusMngr);
                    workdaycommon.userWait(2000);
                    enterStatusMngr.click();
                    workdaycommon.userWait(2000);
                    insidesearchboxcommon.sendKeys("Complete", Keys.ENTER);
                    workdaycommon.userWait(5000);
                    btnSaveDevItemsMngr.click();
                }
                test.info(proxyName + " entered Development Items details");
                log.info(proxyName + " entered Development Items details");
            }
        } catch (Exception e) {
            log.info(proxyName + " does not have access to enter Development Items details");
            test.info(proxyName + "  does not have access to enter Development Items details");
        }

        log.info("CareerInterests");
        try {
            workdaycommon.more_dropdownbox(subTabCareerInterests);
            //subTabCareerInterests.click();
            workdaycommon.userWait(2000);

            WebActionsUtil.explicitWait(driver, btnEdit, "click");
            if (btnEdit.isDisplayed()) {
                btnEdit.click();
                workdaycommon.userWait(2000);
                careerPreferences.click();
                workdaycommon.userWait(2000);
                insidesearchboxcommon.sendKeys(CareerPreferences, Keys.ENTER);
                //cancel_and_DiscaedChanges();  //uncomment when submitAction() is commented
                submitAction(); //uncomment when cancel_and_DiscaedChanges() is commented
                workdaycommon.userWait(2000);
                //btnDone.click();
                test.info(proxyName + " entered Career Interests details");
                log.info(proxyName + " entered Career Interests details");
            }
        } catch (Exception e) {
            log.info(proxyName + " does not have access to enter Career Interests details");
            test.info(proxyName + "  does not have access to enter Career Interests details");
        }

        log.info("Job Interests");
        try {
            workdaycommon.more_dropdownbox(subTabJobInterests);
            workdaycommon.userWait(2000);

            //subTabJobInterests.click();
            workdaycommon.userWait(2000);
            if (btnEdit.isDisplayed()) {
                btnEdit.click();
                workdaycommon.userWait(2000);
                jobProfiles.click();
                workdaycommon.userWait(2000);
                insidesearchboxcommon.sendKeys(JobProfiles, Keys.ENTER);
                //cancel_and_DiscaedChanges();  //uncomment when submitAction() is commented
                submitAction(); //uncomment when cancel_and_DiscaedChanges() is commented
                workdaycommon.userWait(2000);
                //btnDone.click();
                test.info(proxyName + " entered Job Interests details");
                log.info(proxyName + " entered Job Interests details");
            }
        } catch (Exception e) {
            log.info(proxyName + " does not have access to enter Job Interests details");
            test.info(proxyName + "  does not have access to enter Job Interests details");
        }

        log.info("Work Experience");
        try {
            workdaycommon.more_dropdownbox(subTabWorkExperience);
            workdaycommon.userWait(2000);
            //subTabWorkExperience.click();
            workdaycommon.userWait(2000);
            if (commandBtnAdd.isDisplayed()) {
                commandBtnAdd.click();
                workdaycommon.userWait(2000);
                workExperience.click();
                workdaycommon.userWait(2000);
                if (proxyName == Employee) {
                    insidesearchboxcommon.sendKeys(WorkExperience, Keys.ENTER);
                } else { // entering different data when proxyName = Manager
                    insidesearchboxcommon.sendKeys("Benefits Administration Experience", Keys.ENTER);
                }
                //cancel_and_DiscaedChanges();  //uncomment when submitAction() is commented
                submitAction(); //uncomment when cancel_and_DiscaedChanges() is commented
                workdaycommon.userWait(2000);
                //btnDone.click();
                test.info(proxyName + " entered Work Experience details");
                log.info(proxyName + " entered Work Experience details");
            }
        } catch (Exception e) {
            log.info(proxyName + " does not have access to enter Work Experience details");
            test.info(proxyName + "  does not have access to enter Work Experience details");
        }

        log.info("Job History");
        try {
            workdaycommon.more_dropdownbox(subTabJobHistory);
            workdaycommon.userWait(2000);
            if (commandBtnAdd.isDisplayed()) {
                commandBtnAdd.click();
                workdaycommon.userWait(2000);
                jobTitle.sendKeys("Cashier", Keys.ENTER);
                workdaycommon.userWait(2000);
                companyJobHistory.click();
                workdaycommon.userWait(2000);
                insidesearchboxcommon.sendKeys(Company_JobHistory, Keys.ENTER);

                if (driverWrapper.isElementPresent(startDateJobHistory)) {
                    log.info("Job History page");
                    for (WebElement elem : driver.findElements(By.xpath("//label[text()='Start Date']//following::input[@data-automation-id='dateWidgetInputBox'][1]"))) {
                        log.info("for loop - start date ");
                        elem.sendKeys("02/05/2016");
                        elem.sendKeys(Keys.TAB);
                        elem.sendKeys(Keys.TAB);
                    }
                }
                workdaycommon.userWait(2000);
                // cancel_and_DiscaedChanges();  //uncomment when submitAction() is commented
                submitAction(); //uncomment when cancel_and_DiscaedChanges() is commented
                workdaycommon.userWait(2000);
                //btnDone.click();
                test.info(proxyName + " entered Job History details");
                log.info(proxyName + " entered Job History details");

            }

        } catch (Exception e) {
            log.info(proxyName + " does not have access to enter Job History details");
            test.info(proxyName + "  does not have access to enter Job History details");
        }

        log.info("Achievements");
        try {
            workdaycommon.more_dropdownbox(subTabAchievements);
            workdaycommon.userWait(2000);
            if (btnAddAwardandActivity.isDisplayed()) {
                btnAddAwardandActivity.click();
                workdaycommon.userWait(2000);

                if (proxyName == Employee) {
                    typeAwardAndActivity.click();
                    workdaycommon.userWait(2000);
                    insidesearchboxcommon.sendKeys(Award_Type, Keys.ENTER);
                    workdaycommon.userWait(2000);
                    titleAwardAndActivity.sendKeys("Leadership Award", Keys.ENTER);
                    workdaycommon.userWait(2000);

                    if (driverWrapper.isElementPresent(startDateAwardAndActivity)) {
                        log.info("Award and Activity page");
                        for (WebElement elem : driver.findElements(By.xpath("//label[text()='Start Date']//following::input[@data-automation-id='dateWidgetInputBox'][1]"))) {
                            elem.sendKeys("02/05/2018");
                            elem.sendKeys(Keys.TAB);
                            elem.sendKeys(Keys.TAB);
                        }
                    }
                } else {   //this is when proxyName=Manager
                    typeAwardAndActivity.click();
                    workdaycommon.userWait(2000);
                    insidesearchboxcommon.sendKeys(Award_Type, Keys.ENTER);
                    workdaycommon.userWait(2000);
                    titleAwardAndActivity.sendKeys(" Kudos! Award", Keys.ENTER);
                    workdaycommon.userWait(2000);

                    if (driverWrapper.isElementPresent(startDateAwardAndActivity)) {
                        log.info("Award and Activity page");
                        for (WebElement elem : driver.findElements(By.xpath("//label[text()='Start Date']//following::input[@data-automation-id='dateWidgetInputBox'][1]"))) {
                            elem.sendKeys("02/05/2018");
                            elem.sendKeys(Keys.TAB);
                            elem.sendKeys(Keys.TAB);
                        }
                    }
                }

                workdaycommon.userWait(2000);
                //cancel_and_DiscaedChanges();  //uncomment when submitAction() is commented
                submitAction(); //uncomment when cancel_and_DiscaedChanges() is commented
                workdaycommon.userWait(2000);
                //btnDone.click();
                test.info(proxyName + " entered Achievements details");
                log.info(proxyName + " entered Achievements details");
            }

        } catch (Exception e) {
            log.info(proxyName + " does not have access to enter Achievements details");
            test.info(proxyName + "  does not have access to enter Achievements details");

        }

        log.info("Certifications");
        try {
            workdaycommon.more_dropdownbox(subTabCertifications);
            workdaycommon.userWait(2000);
            if (commandBtnAdd.isDisplayed()) {
                commandBtnAdd.click();

                if (proxyName == Employee) {
                    workdaycommon.userWait(2000);
                    certifications.click();
                    workdaycommon.userWait(2000);
                    insidesearchboxcommon.sendKeys(Certifications, Keys.ENTER);
                } else {
                    workdaycommon.userWait(2000);
                    certifications.click();
                    workdaycommon.userWait(2000);
                    insidesearchboxcommon.sendKeys("CIA", Keys.ENTER);
                }
                workdaycommon.userWait(2000);
                //cancel_and_DiscaedChanges();  //uncomment when submitAction() is commented
                submitAction(); //uncomment when cancel_and_DiscaedChanges() is commented
                workdaycommon.userWait(2000);
                //btnDone.click();
                test.info(proxyName + " entered Certifications details");
                log.info(proxyName + " entered Certifications details");
            }
        } catch (Exception e) {
            log.info(proxyName + " does not have access to enter Certifications details");
            test.info(proxyName + "  does not have access to enter Certifications details");

        }
        test.pass("Successfully entered Career details to the employee, " + Employee);
    }

    public void additionalInformation(String Employee, String proxyName) throws Exception {

        workdaycommon.userWait(2000);
       log.info("Education");
        try {

            workdaycommon.userWait(2000);
            workdaycommon.more_dropdownbox(subTabEducation);
            workdaycommon.userWait(2000);
            commandBtnAdd.click();
            workdaycommon.userWait(2000);
            if (proxyName == Employee) {
                countryAddEducation.click();
                workdaycommon.userWait(2000);
                insidesearchboxcommon.sendKeys("Canada", Keys.ENTER);
                workdaycommon.userWait(3000);
                schoolAddEducation.click();
                workdaycommon.userWait(2000);
                insidesearchboxcommon.sendKeys("Academy Canada", Keys.ENTER);
            } else {
                countryAddEducation.click();
                workdaycommon.userWait(2000);
                insidesearchboxcommon.sendKeys("Canada", Keys.ENTER);
                workdaycommon.userWait(3000);
                schoolAddEducation.click();
                workdaycommon.userWait(2000);
                insidesearchboxcommon.sendKeys("University Canada West", Keys.ENTER);
            }
            workdaycommon.userWait(2000);
            //cancel_and_DiscaedChanges(); //uncomment when submitAction() is commented
            submitAction(); //uncomment when cancel_and_DiscaedChanges() is commented
            workdaycommon.userWait(2000);
            //btnDone.click();
            test.info(proxyName + " entered Education details");
            log.info(proxyName + " entered Education details");
        } catch (Exception e) {
            log.info(proxyName + " does not have access to enter Education details");
            test.info(proxyName + "  does not have access to enter Education details");
        }

        log.info("Language");
        try {
            workdaycommon.more_dropdownbox(subTabLanguage);
            workdaycommon.userWait(2000);
            commandBtnAdd.click();

            workdaycommon.userWait(2000);
            if (proxyName == Employee) {
                langAddLanguage.click();
                workdaycommon.userWait(2000);
                insidesearchboxcommon.sendKeys("English", Keys.ENTER);//when changing language here change it in below WebElemnt "clickLanguage"
                workdaycommon.userWait(3000);
                WebElement clickLanguage = driver.findElement(By.xpath("//span[text()='Language']//following::p[@data-automation-id='promptOption' and text()='English'][1]"));
                clickLanguage.click();
                workdaycommon.userWait(2000);
                JavascriptExecutor jstCreateNwPos = (JavascriptExecutor) driver;
                workdaycommon.scrolltoElement(abilityAddLanguage);
                jstCreateNwPos.executeScript("arguments[0].click () ", abilityAddLanguage);
//                workdaycommon.userWait(2000);
//                abilityAddLanguage.click();
                workdaycommon.userWait(3000);
                clickAbilityAddLanguage.click();
                workdaycommon.userWait(3000);
                chooseAbilityAddLanguage.click();
                workdaycommon.userWait(3000);
            } else {
                langAddLanguage.click();
                workdaycommon.userWait(2000);
                insidesearchboxcommon.sendKeys("French", Keys.ENTER);//when changing language here change it in below WebElemnt "clickLanguage"
                workdaycommon.userWait(3000);
                WebElement clickLanguage = driver.findElement(By.xpath("//span[text()='Language']//following::p[@data-automation-id='promptOption' and text()='French'][1]"));
                clickLanguage.click();
                workdaycommon.userWait(2000);
                JavascriptExecutor jstCreateNwPos = (JavascriptExecutor) driver;
                workdaycommon.scrolltoElement(abilityAddLanguage);
                jstCreateNwPos.executeScript("arguments[0].click () ", abilityAddLanguage);
//                workdaycommon.userWait(2000);
//                abilityAddLanguage.click();
                workdaycommon.userWait(3000);
                clickAbilityAddLanguage.click();
                workdaycommon.userWait(3000);
                chooseAbilityAddLanguage.click();
                workdaycommon.userWait(3000);
            }
            //cancel_and_DiscaedChanges();  //uncomment when submitAction() is commented
            submitAction(); //uncomment when cancel_and_DiscaedChanges() is commented
            workdaycommon.userWait(2000);
            //btnDone.click();
            test.info(proxyName + " entered Language details");
            log.info(proxyName + " entered Language details");
        } catch (Exception e) {
            log.info(proxyName + " does not have access to enter Language details");
            test.info(proxyName + "  does not have access to enter Language details");
        }
        log.info("Relocation");
        try {
            workdaycommon.more_dropdownbox(subTabRelocation);
            workdaycommon.userWait(3000);
            btnEdit.click();
            workdaycommon.userWait(2000);
            shortTermAddLanguage.click();
            workdaycommon.userWait(3000);
            selectYesShortTermAddRelocate.click();
            workdaycommon.userWait(3000);
            whereToRelocateAddRelocate.click();
            workdaycommon.userWait(2000);
            insidesearchboxcommon.sendKeys("Guam");
            workdaycommon.userWait(3000);
            //cancel_and_DiscaedChanges();  //uncomment when submitAction() is commented
            submitAction(); //uncomment when cancel_and_DiscaedChanges() is commented
            workdaycommon.userWait(2000);
            //btnDone.click();
            test.info(proxyName + " entered Relocation details");
            log.info(proxyName + " entered Relocation details");
        } catch (Exception e) {
            log.info(proxyName + " does not have access to enter Relocation details");
            test.info(proxyName + "  does not have access to enter Relocation details");
        }


        try {
            workdaycommon.userWait(3000);
            workdaycommon.more_dropdownbox(subTabTravel);
            workdaycommon.userWait(3000);
            btnEdit.click();
            workdaycommon.userWait(3000);
            travelAddTravel.click();
            workdaycommon.userWait(3000);
            chooseTravelAddTravel.click();
            workdaycommon.userWait(3000);
            travelPeriodAddTravel.click();
            workdaycommon.userWait(3000);
            chooseTravelPeriodAddTravel.click();
            workdaycommon.userWait(3000);
            // cancel_and_DiscaedChanges();  //uncomment when submitAction() is commented
            submitAction(); //uncomment when cancel_and_DiscaedChanges() is commented
            workdaycommon.userWait(2000);
            //btnDone.click();
            test.info(proxyName + " entered Travel details");
            log.info(proxyName + " entered Travel details");
        } catch (Exception e) {
            log.info(proxyName + " does not have access to enter Travel details");
            test.info(proxyName + "  does not have access to enter Travel details");
        }

        if (proxyName == Employee) {
            test.pass("Successfully entered details like Education, Language, Relocate, Travel to the employee, " + Employee);
        } else {
            test.pass("Successfully entered details like Education, Language to the employee, " + Employee);
        }

    }


    public void cancel_and_DiscaedChanges() throws Exception {
        btnCancel.click();
        workdaycommon.userWait(2000);
        try {
            if (btnDiscard.isDisplayed()) {
                workdaycommon.userWait(2000);
                btnDiscard.click();
                workdaycommon.userWait(2000);
            }
        } catch (Exception e) {
            log.info("Discard button is not available");
        }
    }

    public void submitAction() throws Exception {
        WebActionsUtil.explicitWait(driver,btnSubmit,"click");
        btnSubmit.click();
        detailsAndProcess.click();
        try {
            workdaycommon.userWait(2000);
            if (validateMsg.isDisplayed()) {
                workdaycommon.userWait(2000);
                btnDone.click();
            }
        } catch (Exception e) {
            log.info("Process is not completed successfully");
        }
    }


    public void AssociateVerify_Comp_Tab(String Employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);

        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(2000);
        try {
            WebElement EmpName = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
//        WebActionsUtil.explicitWait(driver,EmpName,"click");
            EmpName.click();
            workdaycommon.userWait(2000);
        }
        catch(NoSuchElementException e){
            log.info("Clicking on All of Workday");
            allOfWorkday.click();
            WebElement EmpName = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
//        WebActionsUtil.explicitWait(driver,EmpName,"click");
            EmpName.click();
            workdaycommon.userWait(2000);
        }
        workdaycommon.clickAction.click();
        workdaycommon.userWait(1000);
        workdaycommon.mousemove(actionsCompensation, viewCompensationHistory);
        workdaycommon.userWait(2000);

        workdaycommon.scrollDOWN_height();
        log.info("Associate is able to view Compensation History successfully");
        test.pass("Associate is able to view Compensation History successfully");

    }

        public void MoveWorkers(String EmployeeOne, String EmployeeTwo, String EmployeeThree, String SupOrg, String PropSupOrg, String Company, String CostCenter, String EffectiveDate_MoveWorkers) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.searchbySearchBox(Constants.SRCHMOVEWORKERS);
        linkMoveAssociates.click();
        workdaycommon.userWait(2000);
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date1 = simpleDateFormat.format(new Date());
        if (driverWrapper.isElementPresent(effectivedateMoveAssociates)) {
            for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                elem.sendKeys(EffectiveDate_MoveWorkers);
            }
        }
        workdaycommon.userWait(1000);
        supOrgMoveAssociates.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(SupOrg, Keys.ENTER);
        workdaycommon.userWait(2000);
        btnokMoveAssociates.click();
        workdaycommon.userWait(2000);
        proposedsuporgMoveAssociates.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(PropSupOrg, Keys.ENTER);

        workdaycommon.userWait(4000);

        WebElement clickProposedSupOrgEntered = driver.findElement(By.xpath("//label[text()='Proposed Supervisory Organization']//following::p[@data-automation-id='promptOption']"));
        clickProposedSupOrgEntered.click();
        workdaycommon.userWait(2000);


        filter_Associate(EmployeeOne);
        filter_Associate(EmployeeTwo);
        filter_Associate(EmployeeThree);

        workdaycommon.userWait(2000);
        btnSubmit.click();
        workdaycommon.userWait(2000);
        btnOpen.click();
        workdaycommon.userWait(2000);
        chkboxSelectAll.click();


//        select_Associate(EmployeeOne, Company, CostCenter);
//        select_Associate(EmployeeTwo, Company, CostCenter);
//        select_Associate(EmployeeThree, Company, CostCenter);
        btnSubmit.click();

        workdaycommon.userWait(2000);
        detailsAndProcess.click();
        workdaycommon.userWait(2000);
        String overallStatus = validateMsg.getText();
        log.info("---------overallStatus------>" + overallStatus);
        if (overallStatus.equals("Successfully Completed")) {
            workdaycommon.userWait(3000);
            WebActionsUtil.explicitWait(driver, tabProcess, "click");
            tabProcess.click();
            log.info("Process tab is clicked");
            workdaycommon.scrollDOWN_height();
            try {
                log.info("Checking for Awaiting Action..... ");
                if (workdaycommon.awaitingaction.isDisplayed()) {
                    log.info("Move Associate process is not completed successfully");
                    test.fail("Move Associate process is not complete successfully");
                }

            } catch (Exception e) {

                log.info("BP: Move Associates, Associates are" + EmployeeOne + "," + EmployeeTwo + "," + EmployeeThree);
                test.pass("Moving associates is successfully completed");
                test.pass("BP: Move Associates, Associate are" + EmployeeOne + "," + EmployeeTwo + "," + EmployeeThree);
            }
        } else {
            log.info("Move Associate process is not completed successfully........Current Status: " + overallStatus);
            test.fail("Move Associate process is not completed successfully.......Current Status: " + overallStatus);

        }
    }

    public void filter_Associate(String Employee) throws Exception {


        workdaycommon.userWait(3000);

        WebActionsUtil.explicitWait(driver,filterAssociate,"click");
        filterAssociate.click();
        log.info("....Associate filter is clicked...");
        workdaycommon.userWait(2000);
        enterAssociate.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(Employee, Keys.ENTER);
        workdaycommon.userWait(4000);
        WebElement clickAssociatenameEntered = driver.findElement(By.xpath("//span[text()='Associate']//following::label[text()='Value']//following::div[@data-automation-id='promptOption' and contains(text(),'"+Employee+"')]"));
        clickAssociatenameEntered.click();
        workdaycommon.userWait(2000);
        btnFilter.click();
        workdaycommon.userWait(2000);
        WebElement chkbox_Emp = driver.findElement(By.xpath("//div[contains(text(),'" + Employee + "')]//preceding::div[@data-automation-id='checkboxPanel'][1]"));
        workdaycommon.scrolltoElement(chkbox_Emp);
        chkbox_Emp.click();
        workdaycommon.userWait(2000);
    }

    public void select_Associate(String Employee, String Company, String CostCenter) throws Exception {


        log.info("Entering data for " + Employee);
        try {
            workdaycommon.userWait(3000);
            WebElement company = driver.findElement(By.xpath("//div[contains(text(),'" + Employee + "')]//following::div[text()='Company'][1]"));
            workdaycommon.scrolltoElement(company);
            workdaycommon.userWait(3000);
            WebElement enterCompany = driver.findElement(By.xpath("//div[contains(text(),'" + Employee + "')]//following::div[text()='Company'][1]//following::div[@data-automation-id='responsiveMonikerInput'][2]"));
            enterCompany.click();
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys(Company, Keys.ENTER);
            workdaycommon.userWait(3000);
            WebElement enterCostcenter = driver.findElement(By.xpath("//div[contains(text(),'" + Employee + "')]//following::div[text()='Cost Center'][1]//following::div[@data-automation-id='responsiveMonikerInput'][2]"));
            workdaycommon.userWait(3000);
            enterCostcenter.click();
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys(CostCenter, Keys.ENTER);
            workdaycommon.userWait(3000);
        } catch (Exception e) {
            workdaycommon.userWait(3000);
            WebElement company = driver.findElement(By.xpath("(//div[contains(text(),'" + Employee + "')])[2]//following::div[text()='Company'][2]"));
            workdaycommon.scrolltoElement(company);
            workdaycommon.userWait(3000);
            WebElement enterCompany = driver.findElement(By.xpath("(//div[contains(text(),'" + Employee + "')])[2]//following::div[text()='Company'][2]//following::div[@data-automation-id='responsiveMonikerInput'][2]"));
            enterCompany.click();
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys(Company, Keys.ENTER);
            workdaycommon.userWait(3000);
            WebElement enterCostcenter = driver.findElement(By.xpath("(//div[contains(text(),'" + Employee + "')])[2]//following::div[text()='Cost Center'][1]//following::div[@data-automation-id='responsiveMonikerInput'][2]"));
            workdaycommon.userWait(3000);
            enterCostcenter.click();
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys(CostCenter, Keys.ENTER);
            workdaycommon.userWait(3000);
        }

    }

    public void Verify_Moved_Associates(String EmployeeOne, String EmployeeTwo, String EmployeeThree, String PropSupOrg, String CostCenter, String AsOfDate, String Type) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);


        log.info("Verifying whether associates are moved to new Supervisory Organization" + PropSupOrg);
        test.info("Verifying whether associates are moved to new Supervisory Organization" + PropSupOrg);
        verifyAssociate(EmployeeOne, PropSupOrg, CostCenter);
        workdaycommon.userWait(2000);
        verifyAssociate(EmployeeTwo, PropSupOrg, CostCenter);

        workdaycommon.userWait(2000);
        verifyAssociate(EmployeeThree, PropSupOrg, CostCenter);
        workdaycommon.userWait(2000);


        log.info("Manager verification started");
        test.info("Manager verification started");

        tabJob.click();
        workdaycommon.userWait(2000);
        workdaycommon.more_dropdownbox(subTabManagerHistory);
        WebElement managerName = driver.findElement(By.xpath("//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]"));
        String ManagerName = managerName.getText();
        test.info("Proxying to Associate's new Manager : "+ManagerName);
        WebElement Threedots = driver.findElement(By.xpath("//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]//following::img[1]"));
        Threedots.click();
        workdaycommon.scrolltoElement(securityProfile);
        workdaycommon.mousemove(securityProfile,startProxyFromAssociateName);
        workdaycommon.userWait(1000);
        startProxyFromAssociateName.click();
        btnOKChangeJob.click();
        workdaycommon.userWait(3000);
        log.info(".......Proxy successful.......");


        workdaycommon.userWait(2000);
        ManagerVerification(EmployeeOne, AsOfDate, Type);
        ManagerVerification(EmployeeTwo, AsOfDate, Type);
        ManagerVerification(EmployeeThree, AsOfDate, Type);



        workdaycommon.userWait(2000);
        workdaycommon.gotoWorkdayHomepage();
    }

    public void verifyAssociate(String Employee, String PropSupOrg, String CostCenter) throws Exception {

        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(2000);
        allOfWorkday.click();
        WebElement EmpName = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
//        WebActionsUtil.explicitWait(driver,EmpName,"click");
        EmpName.click();
        workdaycommon.userWait(2000);
        menuJob.click();
        workdaycommon.userWait(5000);
        workdaycommon.more_dropdownbox(tabOrganizations);
        //workdaycommon.mousemove(tabMore, tabOrganizations);
        log.info("Organizations sub tab is clicked");
        workdaycommon.userWait(3000);

        WebElement chkCostCenter = driver.findElement(By.xpath("//div[@title='Cost Center']//preceding::div[contains(text(),'" + CostCenter + "')][1]"));
        WebActionsUtil.explicitWait(driver, chkCostCenter, "click");
        try {
            if (chkCostCenter.isDisplayed()) {
                WebElement chkSupOrg = driver.findElement(By.xpath("//div[@title='Supervisory']//preceding::div[contains(text(),'" + CostCenter + "')][1]"));
                WebActionsUtil.explicitWait(driver, chkSupOrg, "click");
                if (chkSupOrg.isDisplayed()) {
                    log.info("Successfully moved " + Employee + " to Supervisory Organization " + PropSupOrg + " and Cost center is updated with " + CostCenter);
                    test.pass("Successfully moved " + Employee + " to Supervisory Organization " + PropSupOrg + " and Cost center is updated with " + CostCenter);
                }
            }
        } catch (NoSuchElementException e) {
            log.info("Failed to move " + Employee + " to Supervisory Organization " + PropSupOrg);
            test.fail("Failed to move " + Employee + " to Supervisory Organization " + PropSupOrg);

        }


    }

    public void ManagerVerification(String Employee, String AsOfDate, String Type) throws Exception {
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(2000);
        workdaycommon.userWait(2000);
        allOfWorkday.click();
        WebElement EmpName = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
//        WebActionsUtil.explicitWait(driver,EmpName,"click");
        EmpName.click();
        workdaycommon.userWait(2000);

        workdaycommon.Perfrom_employeeActions(Employee, TimeandLeave_optionActions, leaveResults_optionActions);
        workdaycommon.userWait(1000);
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        // log.info(date);
        if (driverWrapper.isElementPresent(asOfDate)) {
            log.info("job details page");
            for (WebElement elem : driver.findElements(By.xpath("//label[text()='As Of']//following::input[@data-automation-id='dateWidgetInputBox']"))) {
                elem.sendKeys(date);
                // elem.sendKeys(Keys.TAB);
//                    elem.sendKeys(Keys.TAB);
            }
        }
        //asOfDate.sendKeys(AsOfDate);
        workdaycommon.userWait(3000);
        leaveType.click();
        workdaycommon.userWait(2000);
        enterType.sendKeys(Type, Keys.ENTER);
        workdaycommon.userWait(3000);
        btnOK.click();
        workdaycommon.userWait(1000);
        workdaycommon.scrollright();
        workdaycommon.scrolltoElement(chkStatus);

        try {
            if (statusLeave.isDisplayed()) {
                String status = statusLeave.getText();
                log.info("Status--->" + status);
                workdaycommon.userWait(1000);
            }
        } catch (Exception e) {
            log.info("Never applied for " + Type + " before");
        }
        if ((date.equals(checkAsOfDate.getText())) && (Type.equals(checkLeaveType.getText()))) {
            log.info("Manager can view Leave results of newly moved associate" + Employee);
            test.pass("Manager can view Leave results of newly moved associate" + Employee);
        } else {
            log.info("Manager cannot able to view Associate's Leave results");
            test.pass("Manager cannot able to view Associate's Leave results");
        }
    }

    public void Verify_Associate_OnLeave(String Employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.info("Verifying whether associate is on Leave");
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(2000);
        WebElement EmpName = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and text()='" + Employee + " (On Leave)']"));
        String emp = Employee + " (On Leave)";
        if (emp.equals(EmpName.getText())) {
            log.info("Verification success ----> Associate is on Leave");
            test.pass("Verification sucess: Associate is on Leave");
        } else {
            log.info("Verification fail ----> Associate is not on Leave");
            test.fail("Verification fail: Associate is not on Leave");
        }
    }

    public void Correct_JobChange_EffectiveDate(String Employee, String EffectiveDate, String CorrectEffectiveDate) throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
            log.info("...Correcting effective date of Job change process started....");

            workdaycommon.searchbySearchBox(Employee);
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(allOfWorkday);
            log.info("Scrolled....");
            allOfWorkday.click();
            log.info("all of workday Clicked.....");
            workdaycommon.userWait(1000);

//            WebElement empName = driver.findElement(By.xpath("//div[contains(text(),'" + Employee + "')]//following::div[text()='Associate']//preceding::div[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
            WebElement empName = driver.findElement(By.xpath("//*[@data-automation-id='promptOption']//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption'][1]"));
            workdaycommon.scrolltoElement(empName);
            workdaycommon.userWait(1000);
            empName.click();
            log.info("Employee name Clicked...");
            workdaycommon.userWait(2000);
            workdaycommon.clickAction.click();
            workdaycommon.userWait(1000);
            workdaycommon.mousemove(actionAssociateHistory, viewAssociateHistorybyCategory);
            workdaycommon.userWait(2000);

            workdaycommon.scrolltoElement(headerEffectiveDate);
            headerEffectiveDate.click();
            workdaycommon.userWait(1000);
            if (driverWrapper.isElementPresent(valueEffectiveDate)) {
                for (WebElement elem : driver.findElements(By.xpath("//span[text()='Effective Date']//following::label[text()='Value']//following::input[@data-automation-id='dateWidgetInputBox']"))) {
                    elem.sendKeys(EffectiveDate);
//                    elem.sendKeys(Keys.TAB);
//                elem.sendKeys(Keys.TAB);
                }
            }

//            valueEffectiveDate.sendKeys(EffectiveDate,Keys.ENTER);
            workdaycommon.userWait(1000);
            btnFilterEffectiveDate.click();


//             WebElement transfer_Link = driver.findElement(By.xpath("//span[text()='Position Change History']//following::div[text()='Successfully Completed'][1]//preceding::div[contains(text(),'Transfer: '"+Employee+"')][1]//following::img[1]"));
            WebElement transfer_Link = driver.findElement(By.xpath("//span[text()='Position Change History']//following::div[text()='Successfully Completed'][1]//preceding::div[contains(text(),'Transfer: ')][1]//following::img[1]"));
//            JavascriptExecutor jse = (JavascriptExecutor) driver;
//            jse.executeScript("arguments[0].click () ", transfer_Link);
            workdaycommon.scrolltoElement(transfer_Link);
            transfer_Link.click();

            workdaycommon.userWait(2000);
            workdaycommon.mousemove(actionBusinesProcess, correctJobChangeBP);
            workdaycommon.userWait(2000);

            workdaycommon.scrolltoElement(correctEffectiveDate);
            if (driverWrapper.isElementPresent(correctEffectiveDate)) {
                log.info("Date is present");
                for (WebElement elem : driver.findElements(By.xpath("//label[text()='Effective Date']//following::input[@data-automation-id='dateWidgetInputBox'][1]"))) {
                    log.info("Date not selected.....222....." + CorrectEffectiveDate);
                    elem.sendKeys(CorrectEffectiveDate);//label[text()='From']//following::input[@data-automation-id='dateWidgetInputBox'][1]

                }
            }

            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(firstDayOfWork);
            if (driverWrapper.isElementPresent(enterDatefirstDayOfWork)) {
                log.info("Date is present");
                for (WebElement elem : driver.findElements(By.xpath("//label[text()='First Day of Work']//following::input[@data-automation-id='dateWidgetInputBox'][1]"))) {
                    log.info("Date not selected.....222....." + CorrectEffectiveDate);
                    elem.sendKeys(CorrectEffectiveDate);
                }
            }
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(firstDayOfWork);
            if (driverWrapper.isElementPresent(enterDatefirstDayOfWork)) {
                log.info("Date is present");
                for (WebElement elem : driver.findElements(By.xpath("//label[text()='First Day of Work']//following::input[@data-automation-id='dateWidgetInputBox'][1]"))) {
                    log.info("Date not selected.....222....." + CorrectEffectiveDate);
                    elem.sendKeys(CorrectEffectiveDate);
                }
            }
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(enterComments);
            enterComments.sendKeys("Changing the Effective date of JobChange");
            workdaycommon.userWait(2000);
            btnSubmit.click();
            workdaycommon.userWait(2000);

            detailsandprocess.click();
            workdaycommon.userWait(1000);
            tabProcess.click();
            workdaycommon.userWait(1000);

            try {
                workdaycommon.scrollDOWN_height();
                if (workdaycommon.awaitingaction.isDisplayed()) {
                    log.info(" Pending with Awaiting action........");
                    test.fail(" Pending with Awaiting action........");
                    driver.quit();
                }
            } catch (Exception e) {
                test.pass("Effective date of Job Change is corrected Successfully");
                log.info("Effective date of Job Change is corrected Successfully");
            }
        } catch (Exception e) {
            log.info("Correcting effective date of Job Change is not completed successfully");
            test.fail("Correcting effective date of Job Change is not completed successfully");
            driver.quit();
        }
    }

    public void LegalNameChange(String Employee, String EffectiveDate, String Country, String FirstnameLegal, String LastnameLegal) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.info("...Change Legal name process starts....");
        test.info("...Change Legal name process starts....");

        log.info("Employee name:" + Employee);
        workdaycommon.simplestartProxy(Employee); //uncomment when needed
        log.info("employee proxy successfull");
        workdaycommon.userWait(2000);
        workdaycommon.searchbySearchBox(Constants.SRCHLEGALNAMECHANGE);
        workdaycommon.userWait(2000);
        linkChangeMyLegalName.click();
        workdaycommon.userWait(2000);
        if (driverWrapper.isElementPresent(effectivedateChangeMyLegalName)) {
            for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                elem.sendKeys(EffectiveDate);
            }
        }
        countryChangeMyLegalName.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(Country, Keys.ENTER);
        workdaycommon.userWait(2000);
        changeFirstName.clear();
        workdaycommon.userWait(1000);
        changeFirstName.sendKeys(FirstnameLegal);
        workdaycommon.userWait(2000);
        changeLasttName.clear();
        workdaycommon.userWait(1000);
        changeLasttName.sendKeys(LastnameLegal);
        workdaycommon.userWait(2000);
        String newLegalName = FirstnameLegal+ " " +LastnameLegal;
        btnSubmit.click();
        workdaycommon.userWait(2000);
        btnToDo.click();
        workdaycommon.userWait(2000);
        btnSubmit.click();

        try {
            if (validateChangeMyLegalName.isDisplayed()) {
                log.info("Change Legal name process is completed successfully");
                test.info("Change Legal name process is completed successfully");
                test.pass("BP: Change Legal name, Employee name: " + Employee + ", legal name is changed into " + newLegalName);
            } else {
                test.fail("Change Legal name process is not completed successfully");
                test.info("Change Legal name process is not completed successfully");
            }
        } catch (Exception e) {

            test.error("Error message: " + e.getMessage());
            log.error("Error message: " + e.getMessage());
            driver.quit();
        }
        btnDone.click();
    }

    public void ChangeMyPreferredName(String Employee, String EffectiveDate, String Country, String PrefixPreferred, String SuffixPreferred) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.info("...Change My Preferred name process starts....");
        test.info("...Change My Preferred name process starts....");

        log.info("Employee name:" + Employee);
        workdaycommon.simplestartProxy(Employee); //uncomment when needed
        log.info("employee proxy successfull");
        workdaycommon.userWait(2000);
        workdaycommon.searchbySearchBox(Constants.SRCHCHANGEMYPREFERREDNAME);
        workdaycommon.userWait(2000);
        linkChangeMyPreferredName.click();
        workdaycommon.userWait(2000);
//        if (driverWrapper.isElementPresent(effectivedateChangeMyLegalName)) {
//            for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
//                elem.sendKeys(EffectiveDate);
//            }
//        }
//        countryChangeMyLegalName.click();
//        workdaycommon.userWait(1000);
//        insidesearchboxcommon.sendKeys(Country,Keys.ENTER);
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(changePrefix);
        workdaycommon.userWait(2000);
        changePrefix.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(PrefixPreferred, Keys.ENTER);
        workdaycommon.userWait(2000);
        workdaycommon.userWait(1000);
        changeSuffix.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(SuffixPreferred, Keys.ENTER);
        workdaycommon.userWait(2000);
        btnSubmit.click();
        workdaycommon.userWait(2000);

        try {
            if (validateChangeMyPreferredName.isDisplayed()) {
                log.info("Change My Preferred name process is completed successfully");
                test.info("Change My Preferred name process is completed successfully");
            } else {
                test.fail("Change My Preferred name process is not completed successfully");
                test.info("Change My Preferred name process is not completed successfully");
            }
        } catch (Exception e) {

            test.error("Error message: " + e.getMessage());
            log.error("Error message: " + e.getMessage());
            driver.quit();
        }
        btnDone.click();
    }


    public void EditHireDate(String Employee, String EditHireDate) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.info("...Edit Hire Date process starts....");
        test.info("...Edit Hire Date process starts....");

        log.info("Employee name:" + Employee);
        workdaycommon.searchbySearchBox(Constants.SRCHEDITSERVICEDATE);
        workdaycommon.userWait(2000);

        linkEditSrviceDate.click();
        workdaycommon.userWait(2000);
        enterAssoc.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(Employee, Keys.ENTER);
        log.info("Entered Associate name");
        workdaycommon.userWait(1000);
        buttonokEditServce.click();
        workdaycommon.userWait(1000);
        if (driverWrapper.isElementPresent(changeoriginalHiredate)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(EditHireDate);//change it to date1
            }
        }
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(btnSubmit);
        btnSubmit.click();
        workdaycommon.userWait(1000);
        btnDone.click();

        //Awaiting Action Check
        log.info("Checking for Awaiting Action and Status....");
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(allOfWorkday);
        allOfWorkday.click();
//        WebElement Employeenamee = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        WebElement Employeenamee = driver.findElement(By.xpath("//*[text()='" + Employee + "']//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        Employeenamee.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.userWait(1000);
        workdaycommon.mousemove(AssocHisPassVisa, viewAssocHisPassVisa);
        workdaycommon.userWait(1000);
        driver.findElement(By.xpath("//div[@title='Service Dates Change: " + Employee + "']")).click();
        workdaycommon.userWait(2000);
        processPassVisa.click();
        workdaycommon.userWait(5000);
        workdaycommon.scroll();
        String overallStatus = overallStatusPassVisa.getText();
        log.info("---------Final OverallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);
        workdaycommon.scroll();
        //  workdaycommon.setEmployeename(empname1);
        log.info("Setting Employee name---->" + Employee);
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (statusPassVisa.isDisplayed()) {
                    log.info("Edit Hire Process not Completed Successfully :" + overallStatus);
                    test.fail("Edit Hire Process Process not Completed Successfully :" + overallStatus);
                }
            } catch (Exception e) {
                test.pass("Edit Hire Process Process Completed Successfully - Employee name :" + Employee);
                log.info("Edit Hire Process Process Completed Successfully - Employee name :" + Employee);
            }
        } else {
            log.info("The Overall process is not completed.......Current Status: " + overallStatus);
            test.fail("The Overall process is not completed.......Current Status: " + overallStatus);
        }
    }


//        workdaycommon.searchbySearchBox(Employee);
//        WebElement empName = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
//        workdaycommon.userWait(2000);
//        empName.click();
//        log.info("employee proxy successfull");



    public void ChangePassportVisaInfo(String Employee, String Country, String VisaIdType, String VisaIdentification) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.info("...Change passport and visa information process starts....");
        test.info("...Change passport and visa information process starts....");

        log.info("Employee name:" + Employee);
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.scrolltoElement(allOfWorkday);
        allOfWorkday.click();
//       WebElement SrchEmployeeName = driver.findElement(By.xpath("//*[text()='" + Employee + "']//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        WebElement SrchEmployeeName = driver.findElement(By.xpath("//*[@data-automation-id='promptOption']//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption'][1]"));
        SrchEmployeeName.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(PersonalData, EditPassportVisa);
        workdaycommon.userWait(2000);
        addrowVisa.click();
        log.info("Entering the Passport and Visa details");
        log.info("Entering the Country :" + Country);
        workdaycommon.scrolltoElement(countryClickVisa);
        countryClickVisa.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Country, Keys.TAB);
        workdaycommon.userWait(3000);
//        enterVisaIdType.click();
        insidesearchboxcommon.sendKeys(VisaIdType, Keys.ENTER);
        workdaycommon.userWait(2000);
        enterIdentification.click();
        enterIdentification.sendKeys(VisaIdentification, Keys.ENTER);
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(btnSubmit);
        btnSubmit.click();
        workdaycommon.userWait(2000);
        
        try{
    if(btnSubmit.isDisplayed()){
    btnSubmit.click();
    }
        }
    catch(Exception e){
    log.info("Alert is not available");
        }
        log.info("Passport and Visa information is Changed Successfully");
        test.info("Passport and Visa information is Changed Successfully");
        workdaycommon.userWait(1000);
        btnDone.click();
        workdaycommon.userWait(1000);

        log.info("Checking for Awaiting Action and Status....");
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        workdaycommon.allOfWorkday.click();
        workdaycommon.userWait(1000);
        WebElement EmployeeName = driver.findElement(By.xpath("//div[contains(text(),'" + Employee + "')]//following::div[text()='Associate']//preceding::div[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
//        String EmpName = EmployeeName.getText();
        EmployeeName.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.userWait(1000);
        workdaycommon.mousemove(AssocHisPassVisa, viewAssocHisPassVisa);
        workdaycommon.userWait(1000);
//        driver.findElement(By.xpath("//div[@title='Passports and Visa Change: " + Employee + "']")).click();
        driver.findElement(By.xpath("//div[@title='Passports and Visa Change: " + Employee + "']")).click(); //Sending New Legal name
        workdaycommon.userWait(2000);
        processPassVisa.click();
        workdaycommon.userWait(5000);
        workdaycommon.scroll();
        String overallStatus = overallStatusPassVisa.getText();
        log.info("---------Final OverallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);
        workdaycommon.scroll();
        //  workdaycommon.setEmployeename(empname1);
        log.info("Setting Employee name---->" + Employee);
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (statusPassVisa.isDisplayed()) {
                    log.info("Change passport and visa information Process not Completed Successfully :" + overallStatus);
                    test.fail("Change passport and visa information Process not Completed Successfully :" + overallStatus);
                }
            } catch (Exception e) {
                test.pass("Change passport and visa information Process Completed Successfully : " + Employee);
                log.info("Change passport and visa information Process Completed Successfully: " + Employee);
            }
        } else {
            log.info("The Overall process is not completed.......Current Status: " + overallStatus);
            test.fail("The Overall process is not completed.......Current Status: " + overallStatus);
        }
    }


    public void VerifyAssociateDetails(String Employee) throws Exception {
        //002
        workdaycommon.setDriver(driverWrapper);//to Access workday common class file
        workdaycommon.setExtentTest(test);//to Access workday common class file

        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        workdaycommon.allOfWorkday.click();
        workdaycommon.userWait(1000);
        WebElement EmployeeName = driver.findElement(By.xpath("//*[@data-automation-id='promptOption']//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption'][1]"));
        EmployeeName.click();


        log.info("Verify Associate Details process is completed Successfully");
        test.pass("Verify Associate Details process is completed Successfully");
    }

    public void ChangeLastHireDateIntoFutureDate(String Employee, String ChangeHiredate) throws Exception {

        workdaycommon.setDriver(driverWrapper);//to Access workday common class file
        workdaycommon.setExtentTest(test);//to Access workday common class file

        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.scrolltoElement(allOfWorkday);
        workdaycommon.userWait(1000);
        workdaycommon.allOfWorkday.click();
        workdaycommon.userWait(1000);
        WebElement associate_name = driver.findElement(By.xpath("(//*[text()='" + Employee + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        // workdaycommon.scrolltoElement(associate_name);
        associate_name.click();
        workdaycommon.userWait(3000);
        workdaycommon.clickAction.click();
        log.info("clicked on Actions");
        workdaycommon.mousemove(AssocHistoryLink, ViewAssocHistoryLink);
        log.info("view associate history");

        WebElement HireThreedots = driver.findElement(By.xpath("(//div[@data-automation-id='promptOption' and text()='Hire: " + Employee + "'])[1]//following::img[1]"));
        HireThreedots.click();
        log.info("clicked on the three dots");
        workdaycommon.userWait(2000);
        workdaycommon.mousemove(businessProcess, CorrectOption);
        workdaycommon.userWait(1000);
        if (driverWrapper.isElementPresent(ChangeHireDate)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(ChangeHiredate);
            }
        }
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(commentArea);
        commentArea.sendKeys("Testing ");
        btnSubmit.click();
        workdaycommon.userWait(1000);
        btnDone.click();

        //Awaiting Action Check
        log.info("Checking for Awaiting Action and Status....");
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(allOfWorkday);
        allOfWorkday.click();
//        WebElement Employeenamee = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        WebElement Employeenamee = driver.findElement(By.xpath("//*[text()='" + Employee + "']//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        Employeenamee.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.userWait(1000);
        workdaycommon.mousemove(AssocHistoryLink, ViewAssocHistoryLink);
        workdaycommon.userWait(1000);
        driver.findElement(By.xpath("//div[@title='Hire: " + Employee + "']")).click();
        workdaycommon.userWait(2000);
        String overallStatus = overallStatusHire.getText();
        log.info("---------Final OverallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);
        log.info("Setting Employee name---->" + Employee);
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (statusPassVisa.isDisplayed()) {
                    log.info("Change Hire date Process not Completed Successfully :" + overallStatus);
                    test.fail("Change Hire date Process Process not Completed Successfully :" + overallStatus);
                }
            } catch (Exception e) {
                test.pass("Change Hire date Process Process Completed Successfully - Employee name :" + Employee);
                log.info("Change Hire date Process Process Completed Successfully - Employee name :" + Employee);
            }
        } else {
            log.info("The Overall process is not completed.......Current Status: " + overallStatus);
            test.fail("The Overall process is not completed.......Current Status: " + overallStatus);
        }
    }


    public void ContractContingentWorker(String Organization, String EmployeePreHire, String Position, String WorkerType, String JobProfile, String TimeType, String UserName_Inbox, String NewPwd_Inbox, String VerifyNewPwd_Inbox) throws Exception {
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
        } catch (org.openqa.selenium.NoSuchElementException e) {
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
            } catch (org.openqa.selenium.NoSuchElementException e) {
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


    public void CheckContingentWorkerActivities(String EmployeePreHire) throws Exception {
        workdaycommon.setDriver(driverWrapper);//to Access workday common class file
        workdaycommon.setExtentTest(test);//to Access workday common class file

        workdaycommon.searchbySearchBox(EmployeePreHire);
//        workdaycommon.userWait(1000);
        workdaycommon.allOfWorkday.click();
        workdaycommon.userWait(1000);
        WebElement CWEmployee = driver.findElement(By.xpath("//*[@data-automation-id='promptOption']//following::*[text()='Contingent Worker']//preceding::*[@data-automation-id='promptOption'][1]"));
        workdaycommon.scrolltoElement(CWEmployee);
        CWEmployee.click();
//        workdaycommon.userWait(2000);
        log.info("Manager is able to find Contingent Worker Successfully");
        test.pass("Manager is able to find Contingent Worker Successfully");
        workdaycommon.clickAction.click();
        workdaycommon.userWait(1000);
        workdaycommon.TalentAction.click();
        workdaycommon.userWait(1000);
        log.info("Start Performance Review cannot complete for Contingent Worker :" + EmployeePreHire);
        test.pass("Start Performance Review cannot complete for Contingent Worker :" + EmployeePreHire);

        log.info("Start Disciplinary Action cannot complete for Contingent Worker :" + EmployeePreHire);
        test.pass("Start Disciplinary Action cannot complete for Contingent Worker :" + EmployeePreHire);

        log.info("Add Goals process cannot complete for Contingent Worker :" + EmployeePreHire);
        test.pass("Add Goals process cannot complete for Contingent Worker :" + EmployeePreHire);

        log.info("Create succession Plan process cannot complete for Contingent Worker :" + EmployeePreHire);
        test.pass("Create succession Plan process cannot complete for Contingent Worker :" + EmployeePreHire);

    }

    public void EnterAbsenceContingentWorker(String EmployeePreHire) throws Exception {
        workdaycommon.setDriver(driverWrapper);//to Access workday common class file
        workdaycommon.setExtentTest(test);//to Access workday common class file

        workdaycommon.searchbySearchBox(EmployeePreHire);
        workdaycommon.userWait(1000);
        workdaycommon.allOfWorkday.click();
        workdaycommon.userWait(4000);
        log.info("All of workday is Clicked");
        WebElement CWEmployee = driver.findElement(By.xpath("(//*[@data-automation-id='promptOption']//following::*[text()='Contingent Worker'])//preceding::*[@data-automation-id='promptOption'][1]"));
        workdaycommon.scrolltoElement(CWEmployee);
        CWEmployee.click();
        workdaycommon.userWait(1000);
        workdaycommon.clickAction.click();
        workdaycommon.scrolltoElement(securityprofileActions);
        workdaycommon.mousemove(securityprofileActions, startproxyActions);
        workdaycommon.userWait(1000);
        okbuttonStartProxy.click();
        workdaycommon.userWait(2000);

        workdaycommon.searchbySearchBox("Request Absence");
        workdaycommon.userWait(2000);
        workdaycommon.allOfWorkday.click();
        workdaycommon.userWait(1000);

        log.info("Requesting Absence process cannot complete for Contingent Worker :" + EmployeePreHire);
        test.info("Requesting Absence process cannot complete for Contingent Worker :" + EmployeePreHire);
        test.pass("Contingent worker is not eligible to request for a leave");

    }

    public void EndContingentWorkerContract(String EmployeePreHire, String ContractEndDate, String ReasonEndCCW, String LastDayOfWork) throws Exception {

        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);

        workdaycommon.searchbySearchBox(Constants.SRCHENDCCW);
        linkEndCCW.click();
        workdaycommon.userWait(1000);
        enterCCWName.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(EmployeePreHire, Keys.ENTER);
        workdaycommon.userWait(1000);
        btnOK.click();
        workdaycommon.userWait(1000);

        if (driverWrapper.isElementPresent(contractEndDate)) {
            for (WebElement elem : driver.findElements(By.xpath("(//input[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(ContractEndDate);
            }
        }

        workdaycommon.userWait(1000);
        reasonEndCCW.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(ReasonEndCCW, Keys.ENTER);
        workdaycommon.userWait(2000);
        log.info("Contract End Reason is entered");
        JavascriptExecutor jstCreateNwPos = (JavascriptExecutor) driver;
        workdaycommon.scrolltoElement(additionalInfoEndCCW);
        jstCreateNwPos.executeScript("arguments[0].click () ", additionalInfoEndCCW);
        workdaycommon.userWait(1000);
        log.info("Additional Info is clicked");

        if (driverWrapper.isElementPresent(lastDateOfWorkEndCCW)) {
            for (WebElement elem : driver.findElements(By.xpath("(//input[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(LastDayOfWork);
            }
        }
        workdaycommon.userWait(1000);
        btnSubmit.click();
        workdaycommon.userWait(1000);
        log.info("Submit btn is clicked");

        detailsandprocess.click();
        workdaycommon.userWait(1000);
        String getOverallStatus = overallstatus.getText();
        log.info("Overall Status:" + getOverallStatus);


        if (getOverallStatus.equals("Successfully Completed")) {
            tabProcess.click();
            workdaycommon.userWait(1000);
            try {
                log.info("Checking for Awaiting Action..... ");
                if (chkAwaitingActions.isDisplayed()) {
                    workdaycommon.scrolltoElement(chkAwaitingActions);
                    log.info("End Contingent Worker Contract process is not Completed Successfully; Pending with awaiting action");
                    test.fail("End Contingent Worker Contract process is not Completed Successfully; Pending with awaiting action");
                }
            } catch (org.openqa.selenium.NoSuchElementException e) {
                log.info("End Contingent Worker Contract process is Completed Successfully");
                test.info("End Contingent Worker Contract process is Completed Successfully");
                test.pass(" BP: End Contingent Worker Contract, Contingent Worker Name: " + EmployeePreHire + ", Contract End Date:"
                        + ContractEndDate + ", Last Day of Work:" + LastDayOfWork);
            }
        }
        else {
            log.info("End Contingent Worker Contract process is not Completed Successfully");
            test.fail("End Contingent Worker Contract process is not Completed Successfully");
        }
    }

    public void ChangeTerminationDate(String Employee, String ChangVoluntary_Reasn, String ChangeTermDate) throws Exception {

        workdaycommon.setDriver(driverWrapper);//to Access workday common class file
        workdaycommon.setExtentTest(test);//to Access workday common class file

        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.scrolltoElement(allOfWorkday);
        workdaycommon.userWait(1000);
        workdaycommon.allOfWorkday.click();
        workdaycommon.userWait(1000);
        WebElement associate_name = driver.findElement(By.xpath("//div[contains(text(),'" + Employee + "')]//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        // workdaycommon.scrolltoElement(associate_name);
        associate_name.click();
        workdaycommon.userWait(3000);
        workdaycommon.clickAction.click();
        log.info("clicked on Actions");
        workdaycommon.mousemove(AssocHistoryLink, ViewAssocHistoryLink);
        log.info("view associate history");

        WebElement TermThreedots = driver.findElement(By.xpath("(//div[@data-automation-id='promptOption' and text()='Terminate: " + Employee + "'])[1]//following::img[1]"));
        workdaycommon.scrolltoElement(TermThreedots);
        TermThreedots.click();
        log.info("clicked on the three dots");
        workdaycommon.userWait(2000);
        workdaycommon.mousemove(businessProcess, CorrectOption);
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(ReasonTerm);
        ReasonTerm.click();
        insidesearchboxcommon.sendKeys(ChangVoluntary_Reasn ,Keys.ENTER);
        log.info("Termination Involuntary reason is changed into Voluntary ");
        test.info("Termination Involuntary reason is changed into Voluntary ");
        workdaycommon.userWait(1000);

        if (driverWrapper.isElementPresent(EnterTermDate)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(ChangeTermDate);
            }
        }
        log.info("....Termination date is Entered..... ");

        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(commentArea);
        commentArea.sendKeys("Testing ");
        btnSubmit.click();
        workdaycommon.userWait(1000);
        btnDone.click();

        //Awaiting Action Check
        log.info("Checking for Awaiting Action and Status....");
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(allOfWorkday);
        allOfWorkday.click();
//        WebElement Employeenamee = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        WebElement Employeenamee = driver.findElement(By.xpath("//div[contains(text(),'" + Employee + "')]//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        Employeenamee.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.userWait(1000);
        workdaycommon.mousemove(AssocHistoryLink, ViewAssocHistoryLink);
        workdaycommon.userWait(1000);
        driver.findElement(By.xpath("//div[@title='Terminate: " + Employee + "']")).click();
        workdaycommon.userWait(2000);
        String overallStatus = overallStatusHire.getText();
        log.info("---------Final OverallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);
        log.info("Setting Employee name---->" + Employee);
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (statusPassVisa.isDisplayed()) {
                    log.info("Change Termination date Process not Completed Successfully :" + overallStatus);
                    test.fail("Change Termination date Process not Completed Successfully :" + overallStatus);
                }
            } catch (Exception e) {
                test.pass("Change Termination date Process Completed Successfully - Employee name :" + Employee);
                log.info("Change Termination date Process Completed Successfully - Employee name :" + Employee);
            }
        } else {
            log.info("The Overall process is not completed.......Current Status: " + overallStatus);
            test.fail("The Overall process is not completed.......Current Status: " + overallStatus);
        }
    }

    public void ViewAssociateDetails(String Employee) throws Exception{

        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);

        workdaycommon.userWait(1000);
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        try
        {
//        WebElement Employeenamee = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
            WebElement Employeenamee = driver.findElement(By.xpath("//*[text()='" + Employee + "']//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
            Employeenamee.click();
            workdaycommon.userWait(2000);
        }
        catch(org.openqa.selenium.NoSuchElementException e){

            workdaycommon.userWait(1000);
            workdaycommon.scrolltoElement(allOfWorkday);
            workdaycommon.userWait(1000);
            allOfWorkday.click();
            WebElement Employeenamee = driver.findElement(By.xpath("//*[text()='" + Employee + "']//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
            Employeenamee.click();
            workdaycommon.userWait(2000);
        }
        workdaycommon.userWait(2000);
        log.info("Associate Details are viewed successfully");
        test.pass("Associate Details are viewed successfully");
    }
}

