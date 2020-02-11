package com.thd.projectname.pages.PO_Talent;

import com.thd.common.utils.WebActionsUtil;
import com.thd.base.BasePage;
import com.thd.base.Constants.Constants;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class WD_Talent extends BasePage {
    private static final Logger log = LogManager.getLogger(WD_Talent.class);
    WorkdayCommon workdaycommon = new WorkdayCommon();

    int count= 0;
    String getnamestr1 = null;
    String getnamestr2 = null;


    //Web Elements --------------Start Performance Review----------------------------------------------------------------------
    @FindBy(xpath = "//*[@data-automation-id='promptOption']")
    public WebElement linkStartPerfReview;

    @FindBy(xpath = "//label[text()='Employee']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement empnameStartPerfReview;

    @FindBy(xpath = "//label[text()='All of Workday']")
    public WebElement allOfWorkday;

    @FindBy(xpath = "//label[text()='Review Template']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement reviewtemplateStartPerfReview;

    @FindBy(xpath = "//label[text()='Period Start Date']//following::input[@data-automation-id='dateWidgetInputBox'][1]")
    public WebElement reviewstartdateStartPerfReview;

    @FindBy(xpath = "//label[text()='Period End Date']//following::input[@data-automation-id='dateWidgetInputBox'][1]")
    public WebElement reviewenddateStartPerfReview;


    @FindBy(xpath = "//label[text()='Review Template']//following::div[@data-automation-id='promptOption'][1]")
    public WebElement reviewtemplateSelectByTypeStartPerfReview;

    //    @FindBy(xpath = "//following::span[text()='By Type']//following::div[@data-automation-id='promptOption' and text()='Annual Review']")
    @FindBy(xpath = "//div[@data-automation-id='promptOption' and text()='Annual Review']")
    public WebElement reviewtemplateAnnualReviewStartPerfReview;


    @FindBy(xpath = "//div[@data-automation-id='promptOption' and contains(text(),' (Annual)')]")
    public WebElement reviewtemplateAnnualReviewSelectStartPerfReview;


//    @FindBy(xpath = "//div[@data-automation-id='promptOption' and contains(text(),'CAN')]")
//    public WebElement reviewtemplateAnnualReviewSelectStartPerfReview;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement btnsubmitStartPerfReview;

    @FindBy(xpath = "//span[@title='Done']")
    public WebElement donePerfReview;

    @FindBy(xpath = "//label[text()='All of Workday']")
    public WebElement allOfWorkdayStartPerfReview;

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

    @FindBy(xpath = "//span [@data-automation-id='promptTitle']")
    public WebElement NoMatchesFound;

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

    @FindBy(xpath = "//span[text()='More']//following::div[text()='Manager History'][1]")
    public WebElement mngrHistoryPerfReview;

    @FindBy(xpath = "//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]")
    public WebElement mngrNameePerfReview;

    @FindBy(xpath = "//div[@data-automation-id='closeButton']")
    public WebElement closeButtonPerfReview;


    @FindBy(xpath = "//div[@title='Key Deliverables']//following::div[@title='Edit Goal']")
    public WebElement goalEdit1PerfReview;

    @FindBy(xpath = "//div[@title='Edit Competency Row 1']")
    public WebElement vbbEdit1PerfReview;

    @FindBy(xpath = "//div[@title='Edit Competency Row 2']")
    public WebElement vbbEdit2PerfReview;

    @FindBy(xpath = "//div[@title='Edit Competency Row 3']")
    public WebElement vbbEdit3PerfReview;

    @FindBy(xpath = "//div[@title='Edit Competency Row 4']")
    public WebElement vbbEdit4PerfReview;

    @FindBy(xpath = "//div[@title='Edit Competency Row 5']")
    public WebElement vbbEdit5PerfReview;

    @FindBy(xpath = "//div[@title='Edit Competency Row 6']")
    public WebElement vbbEdit6PerfReview;

    @FindBy(xpath = "//div[@title='Edit Competency Row 7']")
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

    @FindBy(xpath = "//div[text()='Associate History']")
    public WebElement workerHisProCompHire;

    @FindBy(xpath = "//div[text()='View Associate History']")
    public WebElement viewWorkerHisProCompHire;

    @FindBy(xpath = "(//div[text()='Manager History'])[3]")
    public WebElement MoremngrHistoryPerfReview;


    @FindBy(xpath = "//label[text()='Overall Status']//following::div[2]")
    public WebElement overallStatusStartPerfReview;

    @FindBy(xpath = "//*[text()='Overall Status']//following::div[text()='Process'][1]")
    public WebElement processTabStartPerfReview;

//    @FindBy(xpath = "//label[text()='Review Template']//following::*[@data-automation-id='promptIcon'][2]")

    @FindBy(xpath = "//label[text()='Disciplinary Action Reasons']//following::*[@data-automation-id='promptIcon'][1]")

    public WebElement disActionReason;

    @FindBy(xpath = "(//*[@data-automation-id='dateWidgetInputBox'])[1]")
    public WebElement StartDate;


    @FindBy(xpath = "(//*[@data-automation-id='dateWidgetInputBox'])[2]")
    public WebElement EndDate;

    @FindBy(xpath = "//label[text()='Status']//following::span[@data-automation-id='promptSearchButton'][1]")
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


    @FindBy(xpath = "//div[text()='Talent']")
    public WebElement TalentAction;

    @FindBy(xpath = "//div[text()='Start Disciplinary Action']")
    public WebElement StartDisciplinaryAction;

    @FindBy(xpath = "//label[text()='All of Workday']")
    public WebElement allOfWorkdayProCompHire;

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

    //    //div[@title='Edit Discussion Item Row 1' and @data-automation-id='actionImage']
//    //div[@title='Edit Question Row 1' and @data-automation-id='actionImage']
    @FindBy(xpath = "//div[@title='Edit Question Row 1' and @data-automation-id='actionImage']")
    public WebElement editdiscussiononeInbox;

    @FindBy(xpath = "//label[text()='Answer']//following::div[@data-automation-id='richTextContent']")
    public WebElement responseInbox;
//    //label[text()='Response']//following::div[@data-automation-id='richTextContent']


    //    //div[@title='Edit Discussion Item Row 2' and @data-automation-id='actionImage']
    @FindBy(xpath = "//div[@title='Edit Question Row 2' and @data-automation-id='actionImage']")
    public WebElement editdiscussiontwoInbox;

    //    //div[@title='Edit Discussion Item Row 3' and @data-automation-id='actionImage']
    @FindBy(xpath = "//div[@title='Edit Question Row 3' and @data-automation-id='actionImage']")
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

    @FindBy(xpath = "//label[text()='Status']//following::span[@data-automation-id='promptSearchButton'][1]")
    public WebElement statusIconStartDevPlan;

    @FindBy(xpath = "//div[@data-automation-label='Acknowledge Receipt']")
    public WebElement ackReceiptStartDevPlan;

    @FindBy(xpath = "//div[@title='Save' and @data-automation-id='saveButton']")
    public WebElement SaveAckReceipt;

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

//    @FindBy(xpath = "//div[text()='Development Plans' and @data-automation-id='tabLabel']")
    @FindBy(xpath = "//span[text()='More']//following::div[text()='Development Plans']")
    public WebElement developmentplanActions;

    @FindBy(xpath = "(//div[text()='Development Plans' and @data-automation-id='tabLabel'])[1]")
    public WebElement subTabDevelopmentplanActions;


//    @FindBy(xpath = "//button[@title='View']")
    @FindBy(xpath = "(//button[@title='View'])[8]")//Sandbox Preview Tenant
    public WebElement buttonView;


    @FindBy(xpath = "//div[text()='Process Successfully Completed']")
    public WebElement validateProcess;

    // @FindBy(xpath = "//span[text()='View Printable Employee Review']")
    @FindBy(xpath = "//span[text()='View Printable Associate Review']")
    public WebElement validateViewReview;

//Start_Talent_Review----------------------------------------

    @FindBy(xpath = "//button[@title='OK']")
    public WebElement btnokStarttalntReview;


    @FindBy(xpath = "//button[@title='Done']")
    public WebElement btnDoneStarttalntReview;

    @FindBy(xpath = "//*[@data-automation-label='Start Talent Review for Associate']")
    public WebElement linkStarttalntReview;
    @FindBy(xpath = "//*[@data-automation-id='searchBox']")
    public WebElement insidesearchboxcommon;

//    @FindBy(xpath = "//span [@data-automation-id='promptTitle']")
//    public WebElement NoMatchesFound;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement inboxbuttonSubmit;

    @FindBy(xpath = "//*[@data-automation-id='uic_summaryEditorButton']")
    public WebElement summaryEditorButton;

    @FindBy(xpath = " //label[text()='Associate']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement empnameStarttalntReview;

    @FindBy(xpath = "//label[text()='Talent Review Template']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement reviewtemplateStarttalntReview;

    @FindBy(xpath = "//*[@title='Add Work Experience']")
    public WebElement AddWorkExperience;

    //-Manage Goals------------------------------------------------------------------------------------------------------------------------------------
    @FindBy(xpath = "//*[@data-automation-id='workerProfileMenuItemWrapper']//div[@title='Overview']")
    public WebElement tabOverview;

    @FindBy(xpath = "//span[text()='More']//following::div[text()='Support Roles']")
    public WebElement supportrolesEmpProfile;


    @FindBy(xpath = "//div[@data-automation-id='promptOption' and @title='Talent Partner']")
    public WebElement Labeltalentpartner;

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and @title='Talent Partner']//following::*[@data-automation-id='promptOption'][1]")
    public WebElement nametalentpartner;

    @FindBy(xpath = "//div[text()='Add Goal To Employees']")
    public WebElement addGoalstoEmployee;

    @FindBy(xpath = "//div[text()='My Goals']")
    public WebElement MyGoals;

    @FindBy(xpath = "//div[text()='Edit Goals']")
    public WebElement editGoals;

    @FindBy(xpath = "//button[@title='Add']")
    public WebElement ADD_addGoalstoEmployee;

    @FindBy(xpath = "//*[text()='Goal']//following::*[@data-automation-id='richTextContent'][1]")
    public WebElement goal_addGoalstoEmployee;

    @FindBy(xpath = "//*[text()='Description']//following::*[@data-automation-id='richTextContent'][1]")
    public WebElement description_addGoalstoEmployee;

    @FindBy(xpath = "//*[text()='Category']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement category_addGoalstoEmployee;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement submit_addGoalstoEmployee;

    @FindBy(xpath = "//*[@data-automation-id='fieldSetLegendLabel']")
    public WebElement tabDetailsandProcess_addGoalstoEmployee;

    @FindBy(xpath = "//*[@data-automation-id='dateWidgetContainer']")
    public WebElement duedate_addGoalstoEmployee;

    @FindBy(xpath = "(//*[text()='Overall Process'])[1]//following::*[@data-automation-id='promptOption'][1]")
    public WebElement eventlink_addgoalsemp;

    @FindBy(xpath = "//*[@data-automation-id='selectWidget']")
    public WebElement status_editgoal;

    @FindBy(xpath = "(//*[@data-automation-id='dateWidgetContainer'])[1]")
    public WebElement completedate_editgoal;

    @FindBy(xpath = "//label[text()='Goal']//following::p[1]")
    public WebElement labelGoalName;

    //    xpaths for the three dots selection
    @FindBy(xpath = "//div[@data-automation-id='relatedActionsItemLabel' and text()='Security Profile']")
    private WebElement securityProfile;

//    @FindBy(xpath = "//div[text()='Start Proxy']")
    @FindBy(xpath = "//div[text()='Security Profile']//following::div[text()='Start Proxy']")
    private WebElement startProxyFromAssociateName;

    @FindBy(xpath = "//*[@data-automation-id='wd-CommandButton_uic_okButton']")
    private WebElement btnOK;


    //-------------------------------------------------------------------------------------------------------------------


    public void Start_Development_Plan(String Employeename, String Plan_Start_Date, String Plan_End_Date, String Response, String Development_item, String Status_Manager, String Template_Review) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.searchbySearchBox(Employeename);
        workdaycommon.allOfWorkday.click();
        workdaycommon.userWait(2000);
        WebElement empname = driver.findElement(By.xpath("(//*[text()='" + Employeename + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employeename + "')][1]"));
        System.out.println("Employee Name : "+Employeename);
        empname.click();
        workdaycommon.userWait(1000);
        jobEmpProfile.click();
        workdaycommon.userWait(1000);
        tabmoreEmpProfile.click();
        workdaycommon.userWait(1000);
        managerhistoryEmpProfile.click();
        workdaycommon.userWait(1000);
        String managerName = managernameEmpProfile.getText();
//        managernameEmpProfile.click();
        log.info("Proxing to : " + managerName);

        WebElement Threedots = driver.findElement(By.xpath("//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]//following::img[1]"));
        Threedots.click();
        workdaycommon.scrolltoElement(securityProfile);
        workdaycommon.mousemove(securityProfile,startProxyFromAssociateName);
        workdaycommon.userWait(1000);
//        startProxyFromAssociateName.click();
        btnOK.click();
        workdaycommon.userWait(2000);
        log.info(".......Proxy successful.......");


        workdaycommon.gotoWorkdayHomepage();
        log.info("Plan will be between " + Plan_Start_Date + "," + Plan_End_Date);
        test.info("Manager Initiated Start Development Plan: " + managerName);
        workdaycommon.userWait(2000);
        workdaycommon.searchbySearchBox(Employeename);
        workdaycommon.userWait(1000);
        WebElement empName = driver.findElement(By.xpath("//div[contains(text(),'" + Employeename + "')]"));
        empName.click();
        workdaycommon.userWait(1000);

        workdaycommon.clickAction.click();
        workdaycommon.mousemove(TalentAction, StartDevelopmentPlanAction);
//        workdaycommon.userWait(2000);
//        empStartDevelopPlanforEmp.clear();
//        log.info("Clearing employee name");
//        insidesearchboxcommon.sendKeys(Employeename,Keys.ENTER);
//        log.info("test employee search done");
        workdaycommon.userWait(3000);
        reviewtemplateStartDevelopPlanforEmp.click();
        log.info("Clicked on review template");
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Template_Review, Keys.ENTER);
        workdaycommon.userWait(4000);


        //periodstartdateStartDevelopPlanforEmp.click();
        if (driverWrapper.isElementPresent(periodstartdateStartDevelopPlanforEmp)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(Plan_Start_Date);
                workdaycommon.userWait(2000);
            }
        }
        // periodenddateStartDevelopPlanforEmp.click();
        if (driverWrapper.isElementPresent(periodenddateStartDevelopPlanforEmp)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[2]"))) {
                elem.sendKeys(Plan_End_Date);
                workdaycommon.userWait(2000);
            }
        }
        log.info("About to click Submit Button for Start Development process");
        workdaycommon.userWait(2000);
        workdaycommon.inboxbuttonSubmit.click();
        log.info("Clicked Submit Button for Start Development process");
        detailsandprocessStartDevelopPlanforEmp.click();

        if (workdaycommon.labelawaitingaction.isDisplayed()) {
            workdaycommon.userWait(2000);
            List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
            int count = labelAwaitingaction.size();
            log.info(" Awaiting Actions Label Count----->" + count);
            for (int i = 1; i <= count; i++) {
                String proxyname = workdaycommon.awaitingAction(i);
                // Proxying to the person
                log.info("Now proxying to : " + proxyname);
                workdaycommon.StartProxy_employee(proxyname);
                workdaycommon.userWait(2000);
                workdaycommon.gotoWorkdayHomepage();
                workdaycommon.userWait(4000);
                WebActionsUtil.explicitWait(driver, workdaycommon.inboxWD, "click");
                workdaycommon.inboxWD.click();
                workdaycommon.userWait(2000);
                WebElement inboxrow = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'" + Employeename + "')]"));
                workdaycommon.scrolltoElement(inboxrow);
                inboxrow.click();
                workdaycommon.userWait(3000);

                //Dont forget to cancel the plan by proxying to Anna Moorthy -> actions -> VWH ->plan link (...) -> Business process -> Cancel
                gotoSummaryEditorInbox.click();
                workdaycommon.userWait(3000);
                workdaycommon.scrolltoElement(editdiscussiononeInbox);
                workdaycommon.userWait(2000);
                editdiscussiononeInbox.click();
                workdaycommon.userWait(2000);
                workdaycommon.scroll();
                workdaycommon.userWait(2000);
                responseInbox.sendKeys(Response, Keys.TAB);
                workdaycommon.scrolltoElement(editdiscussiontwoInbox);
                workdaycommon.userWait(2000);
                editdiscussiontwoInbox.click();
                workdaycommon.userWait(2000);
                responseInbox.sendKeys(Response, Keys.TAB);
                workdaycommon.userWait(2000);
                workdaycommon.scrolltoElement(editdiscussionthreeInbox);
                workdaycommon.userWait(2000);
                editdiscussionthreeInbox.click();
                log.info("Clicked on the third question edit button");
                workdaycommon.userWait(2000);
                responseInbox.sendKeys(Response, Keys.TAB);
                workdaycommon.userWait(4000);
                workdaycommon.scrolltoElement(btnaddProcessUpdate);
                btnaddProcessUpdate.click();
                workdaycommon.userWait(3000);
                developmentitemProcessUpdateInbox.sendKeys(Development_item, Keys.TAB);
                workdaycommon.userWait(2000);
                workdaycommon.scrolltoElement(statusProcessUpdateInbox);
                statusProcessUpdateInbox.click();
                workdaycommon.userWait(2000);
                insidesearchboxcommon.sendKeys(Status_Manager, Keys.ENTER);
                workdaycommon.userWait(3000);
                submitInbox.click();
                workdaycommon.userWait(3000);
                doneInbox.click();
                test.info("Details entered for Development item--->" + Development_item + "***" + "Manager Status---> " + Status_Manager);
            }
        }
        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.userWait(2000);
        workdaycommon.startProxy(managerName);
        workdaycommon.userWait(1000);
        //workdaycommon.Perfrom_employeeActions(Employeename, workerhistoryActions, viewworkerhistoryActions);
        workdaycommon.userWait(2000);
        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.userWait(5000);
        WebActionsUtil.explicitWait(driver, workdaycommon.inboxWD, "click");
        workdaycommon.inboxWD.click();
        workdaycommon.userWait(2000);
        WebElement inboxrow = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'" + Employeename + "')]"));
        workdaycommon.scrolltoElement(inboxrow);
        inboxrow.click();
        workdaycommon.userWait(3000);
        gotoSummaryEditorInbox.click();
        workdaycommon.userWait(2000);
        editdiscussiononeInbox.click();
        workdaycommon.userWait(3000);
        responseInbox.sendKeys(Response, Keys.ENTER);
        workdaycommon.scrolltoElement(editdiscussiontwoInbox);
        workdaycommon.userWait(3000);
        editdiscussiontwoInbox.click();
        workdaycommon.userWait(3000);
        responseInbox.sendKeys(Response, Keys.ENTER);
        workdaycommon.userWait(3000);
        editdiscussionthreeInbox.click();
        workdaycommon.userWait(3000);
        responseInbox.sendKeys(Response, Keys.ENTER);
        workdaycommon.userWait(3000);
        log.info("Response entered....");
        workdaycommon.scrolltoElement(btneditProcessUpdate);
        workdaycommon.userWait(3000);
        log.info("Response entered....");
        btneditProcessUpdate.click();
        log.info("Response entered....");
        workdaycommon.userWait(3000);
        //developmentitemProcessUpdateInbox.sendKeys(Development_item,Keys.ENTER);
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(statusmanagerProcessUpdateInbox);
        log.info("Response entered....");
        //statusmanagerProcessUpdateInbox.click();
        workdaycommon.userWait(1000);
        //insidesearchboxcommon.sendKeys(Status_Manager, Keys.ENTER);
        workdaycommon.userWait(1000);
        submitInbox.click();
        test.info("Discussion details entered Successfully in manager Mail box");
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(detailsandprocessInbox);
        detailsandprocessInbox.click();
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(processtab);
        processtab.click();
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(approvername);
        workdaycommon.userWait(3000);
        String aprname = approvername.getText();
        log.info("Aprover name :" + aprname);
        StringBuilder hrPartnerName = new StringBuilder(aprname);
        log.info("Before replacing the Aprover name :" + hrPartnerName);
        // Eliminating characters after ( and removing space before (
        hrPartnerName.delete(hrPartnerName.indexOf("(") - 1, hrPartnerName.length());
        log.info("After replacing the Aprover name :" + hrPartnerName);
        workdaycommon.startProxy(hrPartnerName.toString());
        workdaycommon.userWait(3000);
        workdaycommon.inboxOperation(Employeename);
        log.info("inbox op emp completed");
        workdaycommon.userWait(3000);
//        workdaycommon.startProxy(managerName);
//        log.info("Manager Proxy Completed..");
//        workdaycommon.userWait(2000);
//        workdaycommon.inboxOperation(Employeename);
//        log.info("Clicked on Inbox...");
//        workdaycommon.userWait(2000);
        workdaycommon.StartProxy_employee(Employeename);
        log.info("Employee proxy completed");
        workdaycommon.inboxOperationPerformance(Employeename);
        log.info("Inbox Operation performance completed");
        workdaycommon.userWait(7000);
        WebActionsUtil.explicitWait(driver, editAck, "click");
        workdaycommon.scrolltoElement(editAck);
        editAck.click();
        workdaycommon.userWait(3000);
        //WebActionsUtil.explicitWait(driver, statusAck, "click");
        //statusAck.click();
        // insidesearchboxcommon.sendKeys(Status_Acknowledgement,Keys.ENTER);
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(statusIconStartDevPlan);
        statusIconStartDevPlan.click();
        workdaycommon.userWait(1000);
        ackReceiptStartDevPlan.click();
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(txtEditorStartDevPlan);
        txtEditorStartDevPlan.click();
        txtEditorStartDevPlan.sendKeys("Testing",Keys.ENTER);
        workdaycommon.userWait(1000);
        SaveAckReceipt.click();
//        workdaycommon.scrolltoElement(ackReceiptStartDevPlan);
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(submitInbox);
        submitInbox.click();
        log.info("Clicked on Submit button...");
        test.info("Acknowledgement details entered Successfully");
        workdaycommon.scrolltoElement(detailsandprocessInbox);
        workdaycommon.userWait(3000);
        detailsandprocessInbox.click();

    }

    public void validation(String Employeename, String Plan_Start_Date, String Plan_End_Date, String Template_Review) throws Exception {
        try {
            btnCurrentUser.click();
            workdaycommon.userWait(3000);
            log.info("validation started....");
            workdaycommon.scrolltoElement( linkCurrentUserItem);
            linkCurrentUserItem.click();
            workdaycommon.userWait(3000);
            workdaycommon.scrolltoElement(jobEmpProfile);
            jobEmpProfile.click();
            workdaycommon.userWait(1000);
            workdaycommon.more_dropdownbox(managerhistoryEmpProfile);
            workdaycommon.userWait(1000);
            String managerName = managernameEmpProfile.getText();
            log.info("Manager Name---->" + managerName);
            workdaycommon.userWait(5000);

            WebElement Threedots = driver.findElement(By.xpath("//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]//following::img[1]"));
            Threedots.click();

            workdaycommon.scrolltoElement(securityProfile);
            workdaycommon.mousemove(securityProfile,startProxyFromAssociateName);
            workdaycommon.userWait(1000);
//            startProxyFromAssociateName.click();
            btnOK.click();
            workdaycommon.userWait(3000);
            log.info(".......Proxy successful.......");

            workdaycommon.userWait(2000);
            workdaycommon.gotoWorkdayHomepage();
            workdaycommon.searchbySearchBox(Employeename);
            workdaycommon.allOfWorkday.click();
            workdaycommon.userWait(4000);
            WebElement namelink = driver.findElement(By.xpath("//*[contains(text(),'"+Employeename+"')]//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption' and contains(text(),'"+Employeename+"')][1]"));
            namelink.click();
            workdaycommon.userWait(2000);
            workdaycommon.scroll();
            workdaycommon.scroll();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(performanceActions);
            performanceActions.click();
            workdaycommon.userWait(2000);

            try {
                if (workdaycommon.tabmoreEmpProfile.isDisplayed()) {
                    log.info("More Option Available...");
                    workdaycommon.more_dropdownbox(MoremngrHistoryPerfReview);
                    workdaycommon.scrolltoElement(developmentplanActions);
                    developmentplanActions.click();
                    workdaycommon.userWait(2000);
                }
            } catch (NoSuchElementException e) {
                log.info("More Option Not Available...");
                subTabDevelopmentplanActions.click();
                workdaycommon.userWait(1000);
            }


            workdaycommon.userWait(2000);
            buttonView.click();

            //String viewReview = "View Printable Employee Review";
            String viewReview = "View Printable Associate Review";
            String Review_Template = "Performance and Development Check-In CAN (On Going)";
            String managerPlan = Review_Template + ": " + Employeename + " - Manager Plan";
            log.info("Manager plan: "+managerPlan);
            String review_DateOLD = Plan_Start_Date + " - " + Plan_End_Date;
            String review_Date = review_DateOLD.trim();
            log.info("review date: "+review_Date);
            log.info("Review_Template");

            WebElement validateManagerPlan = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'" + Review_Template + ": " + Employeename + " - Manager Plan')]"));
            log.info("printing validate manager plan : "+validateManagerPlan.getText());
            WebElement validateManagerName = driver.findElement(By.xpath("//label[text()='Evaluated By']//following::div[text()='" + managerName + "']"));
            log.info("Validate Manager Name: "+validateManagerName.getText());
            WebElement validateReviewDate = driver.findElement(By.xpath("//div[text()='Review Period']//following::div[@data-automation-id='textView'][1]"));
            log.info("Validate Review Date: "+validateReviewDate.getText());
            log.info("Validate View Review: "+validateViewReview.getText());
            log.info("Manager: "+managerName);


//                    if ((viewReview.equals(validateViewReview.getText())) && (managerPlan.equals(validateManagerPlan.getText())) && (managerName.equals(validateManagerName.getText())) && (review_Date.equals(validateReviewDate.getText()))) {

//            log.info("Start Development Plan is created successfully");
//            test.pass("Start Development Plan is created successfully");
//            test.info("Employee Name---> " + Employeename + "***" + "Review_Template---> " + Review_Template + "***" + "Review_Date---> " + review_Date);
//}
//            else {
//                log.error("Failed to create Start Development Plan");
//                test.fail("Failed to create Start Development Plan");
//            }


            if (viewReview.equals(validateViewReview.getText())){
                log.info("Matched");

                if (managerPlan.equals(validateManagerPlan.getText())){
                    log.info("Manager Plan Matched");

                    if (managerName.equals(validateManagerName.getText())){
                        log.info("Manager Name Matched");

                        if (review_Date.equals(validateReviewDate.getText())){
                            log.info("Date Matched");
                            log.info("Start Development Plan is created successfully");
                            test.pass("Start Development Plan is created successfully");
                            test.info("Employee Name---> " + Employeename + "***" + "Review_Template---> " + Review_Template + "***" + "Review_Date---> " + review_Date);
                        }
                        else {
                            log.error("Failed to create Start Development Plan");
                            test.fail("Failed to create Start Development Plan");
                        }

                    }
                }
            }




        } catch (Exception e) {
            test.fail("Error Occurred in: " + e.getMessage());
            log.error("Error occurred: " + e.getMessage());
        }
    }


    public void Start_Perfomance_Review(String Empname, String reviewtemplate, String reviewStartDate, String reviewEndDate, String Manager_Rating, String Overall_Rating) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(2000);

        workdaycommon.searchbySearchBox(Empname);
        workdaycommon.userWait(1000);

        WebElement SrchEmployeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='" + Empname + "']"));
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(SrchEmployeename);
        workdaycommon.userWait(3000);
        SrchEmployeename.click();
        workdaycommon.userWait(3000);

        jobPerfReview.click();
        workdaycommon.userWait(1000);

        // mngrHistoryPerfReview.click();
        // workdaycommon.userWait(1000);


        try {
            if (workdaycommon.tabmoreEmpProfile.isDisplayed()) {
                log.info("More Option Available...");
                workdaycommon.more_dropdownbox(MoremngrHistoryPerfReview);
                workdaycommon.userWait(3000);
            }
        } catch (Exception e) {
            log.info("More Option Not Available...");
            mngrHistoryPerfReview.click();
            workdaycommon.userWait(1000);
        }

        String MngrName = mngrNameePerfReview.getText();
        log.info("Manager Name---->" + MngrName);



        workdaycommon.userWait(6000);
        workdaycommon.clickAction.click();
        log.info("Clicked on the Actions button");
        workdaycommon.mousemove(TalentAction, StartPerformancePerfReview);
        log.info("Mouse move to Start performance Review");
        workdaycommon.userWait(3000);


    /* //
    workdaycommon.searchbySearchBox(Constants.SRCHSTARTPERFREVIEW);
    linkStartPerfReview.click();
    empnameStartPerfReview.click();
    workdaycommon.userWait(1000);
    insidesearchboxcommon.sendKeys(Empname,Keys.ENTER);
    workdaycommon.userWait(2000);
    workdaycommon.selectfromduplicates(Empname);
    workdaycommon.userWait(1000);
    *///

      /*   reviewtemplateStartPerfReview.click();
        log.info("clicked on review template");
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(reviewtemplate, Keys.ENTER);
        workdaycommon.userWait(2000);

       if (driverWrapper.isElementPresent(reviewstartdateStartPerfReview)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(reviewStartDate);//change it to date1
            }
        }

        if (driverWrapper.isElementPresent(reviewenddateStartPerfReview)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(reviewEndDate);//change it to date1
            }
        }*/

        reviewtemplateStartPerfReview.click();
        workdaycommon.userWait(1000);
        reviewtemplateSelectByTypeStartPerfReview.click();
        workdaycommon.userWait(1000);
        reviewtemplateAnnualReviewStartPerfReview.click();
        workdaycommon.userWait(1000);
        reviewtemplateAnnualReviewSelectStartPerfReview.click();


        btnsubmitStartPerfReview.click();

        workdaycommon.userWait(2000);
        donePerfReview.click();

        log.info("Start proxy for Employee....");
        workdaycommon.userWait(2000);
        workdaycommon.StartProxy_employee(Empname);
        workdaycommon.userWait(2000);
        workdaycommon.inboxOperationPerformance(Empname);
        workdaycommon.userWait(2000);

        summaryEditorPerfReview.click();
        workdaycommon.userWait(2000);

        submitInboxPerfReview.click();
        workdaycommon.userWait(2000);


        log.info("Start proxy with Manager....");
        workdaycommon.StartProxy_employee(MngrName);
        workdaycommon.userWait(4000);

        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.inboxWD.click();
        workdaycommon.userWait(3000);
        WebElement inboxrow2 = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'CAN (Annual): " + Empname + "')]"));
        workdaycommon.scrolltoElement(inboxrow2);
        inboxrow2.click();
        workdaycommon.userWait(3000);

        try {
            closeButtonPerfReview.click();
            workdaycommon.userWait(2000);
        } catch (Exception e) {
            log.info("No need to CLose.......");
            workdaycommon.userWait(2000);
        }

        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(summaryEditorPerfReview);
        summaryEditorPerfReview.click();
        workdaycommon.userWait(4000);
        log.info("Clicked on Summary Editor...");


        try {

            workdaycommon.scrolltoElement(goalEdit1PerfReview);
            goalEdit1PerfReview.click();
            workdaycommon.userWait(3000);
            workdaycommon.scrolltoElement(mngrRating1PerfReview);
            workdaycommon.userWait(3000);
            mngrRating1PerfReview.click();
            workdaycommon.userWait(3000);
            mngrRating1ValPerfReview.click();
            workdaycommon.userWait(1000);
            log.info("Goal Deliverables......");
        } catch (Exception e) {
            log.info("Goal Deliverables is not present.....");
            workdaycommon.userWait(1000);
        }


        workdaycommon.scrolltoElement(vbbEdit1PerfReview);
        vbbEdit1PerfReview.click();
        workdaycommon.userWait(2000);
        mngrRatingPerfReview.click();
        workdaycommon.userWait(3000);
        mngrRatingValPerfReview.click();
        workdaycommon.userWait(2000);

        workdaycommon.scrolltoElement(vbbEdit2PerfReview);
        vbbEdit2PerfReview.click();
        workdaycommon.userWait(2000);
        mngrRatingPerfReview.click();
        workdaycommon.userWait(2000);
        mngrRatingValPerfReview.click();
        workdaycommon.userWait(1000);

        workdaycommon.scrolltoElement(vbbEdit3PerfReview);
        vbbEdit3PerfReview.click();
        workdaycommon.userWait(2000);
        mngrRatingPerfReview.click();
        workdaycommon.userWait(2000);
        mngrRatingValPerfReview.click();
        workdaycommon.userWait(1000);


        workdaycommon.scrolltoElement(vbbEdit4PerfReview);
        vbbEdit4PerfReview.click();
        workdaycommon.userWait(2000);
        mngrRatingPerfReview.click();
        workdaycommon.userWait(2000);
        mngrRatingValPerfReview.click();
        workdaycommon.userWait(1000);

        workdaycommon.scrolltoElement(vbbEdit5PerfReview);
        vbbEdit5PerfReview.click();
        workdaycommon.userWait(2000);
        mngrRatingPerfReview.click();
        workdaycommon.userWait(2000);
        mngrRatingValPerfReview.click();
        workdaycommon.userWait(1000);

        workdaycommon.scrolltoElement(vbbEdit6PerfReview);
        vbbEdit6PerfReview.click();
        workdaycommon.userWait(2000);
        mngrRatingPerfReview.click();
        workdaycommon.userWait(2000);
        mngrRatingValPerfReview.click();
        workdaycommon.userWait(1000);

        workdaycommon.scrolltoElement(vbbEdit7PerfReview);
        vbbEdit7PerfReview.click();
        workdaycommon.userWait(2000);
        mngrRatingPerfReview.click();
        workdaycommon.userWait(2000);
        mngrRatingValPerfReview.click();
        workdaycommon.userWait(1000);

        workdaycommon.scrolltoElement(overallEditPerfReview);
        overallEditPerfReview.click();
        workdaycommon.userWait(2000);
        mngrRatingPerfReview.click();
        workdaycommon.userWait(2000);
        overallRatingValPerfReview.click();
        workdaycommon.userWait(1000);

        workdaycommon.scrolltoElement(submitInboxPerfReview);
        submitInboxPerfReview.click();
        workdaycommon.userWait(2000);
        log.info("Clicked on Submit button....");
        donePerfReview.click();
        workdaycommon.userWait(2000);
        log.info("Clicked on Done button....");


        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.userWait(1000);
        workdaycommon.inboxWD.click();
        workdaycommon.userWait(2000);
        workdaycommon.inboxWD.click();//clicking 2nd time for loading new mail
        workdaycommon.userWait(3000);
        WebElement inboxrow11 = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'CAN (Annual): "+Empname+"')]"));
        workdaycommon.scrolltoElement(inboxrow11);
        workdaycommon.userWait(1000);
        inboxrow11.click();
        workdaycommon.userWait(3000);
        try{
            if(toDoPerfReview.isDisplayed())
            {
                log.info("TODO button Present");
                workdaycommon.scrolltoElement(toDoPerfReview);
                workdaycommon.userWait(1000);
                toDoPerfReview.click();
                workdaycommon.userWait(2000);
                log.info("TODO button clicked....");
            }
            else
                {
                    log.info("TODO button is not present");
                }
        }
        catch (Exception e)
        {
            log.info("TODO button is not present");
        }

        submitInboxPerfReview.click();
        workdaycommon.userWait(2000);

        donePerfReview.click();
        workdaycommon.userWait(3000);


        log.info("Again Start proxy with Employee....");

    /*
    workdaycommon.startProxy(Empname);
    workdaycommon.userWait(4000);
    workdaycommon.gotoWorkdayHomepage();
    workdaycommon.userWait(2000);
    */

        log.info("Start proxy for Employee....");
        workdaycommon.userWait(2000);
        workdaycommon.StartProxy_employee(Empname);
        workdaycommon.userWait(2000);
        workdaycommon.inboxWD.click();
        workdaycommon.userWait(3000);
        WebElement inboxrow1 = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'CAN (Annual): "+Empname+"')]"));
        workdaycommon.scrolltoElement(inboxrow1);
        inboxrow1.click();
        workdaycommon.userWait(3000);
        log.info("Clicked inbox");

        workdaycommon.scrolltoElement(ackEditPerfReview);
        ackEditPerfReview.click();
        workdaycommon.userWait(2000);

        txtEditorPerfReview.click();
        workdaycommon.userWait(1000);

        statusIconPerfReview.click();
        workdaycommon.userWait(2000);

        ackReceiptPerfReview.click();
        workdaycommon.userWait(2000);

        submitInboxPerfReview.click();
        workdaycommon.userWait(3000);
        donePerfReview.click();
        workdaycommon.userWait(3000);
        log.info("Validation Started....");

        workdaycommon.searchbySearchBox(Empname);
        workdaycommon.userWait(1000);
        allOfWorkdayStartPerfReview.click();
        workdaycommon.userWait(9000);
        WebElement Employeename_PR = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'CAN (Annual): "+Empname+"')]"));
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(Employeename_PR);
        workdaycommon.userWait(1000);
        Employeename_PR.click();
        workdaycommon.userWait(1000);


       /* //workdaycommon.StartProxy_employee(Empname);
        workdaycommon.Perfrom_employeeActions(Empname, workerHisProCompHire, viewWorkerHisProCompHire);
        workdaycommon.userWait(5000);


        WebElement EmpHire = driver.findElement(By.xpath("(//div[@data-automation-id='promptOption' and contains(text(),'Salaried(Annual): "+Empname+"')]"));
        EmpHire.click(); */
        workdaycommon.userWait(5000);
        workdaycommon.scroll();
        workdaycommon.scrollDOWN_height();
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
                    workdaycommon.startProxy(proxyperson.toString());
                    workdaycommon.userWait(4000);
                    workdaycommon.gotoWorkdayHomepage();
                    workdaycommon.userWait(3000);
                    workdaycommon.inboxWD.click();
                    workdaycommon.userWait(2000);
                    WebElement inboxTextTerminate1 = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Salaried(Annual): "+Empname+"')]"));
                    workdaycommon.scrolltoElement(inboxTextTerminate1);
                    inboxTextTerminate1.click();
                    workdaycommon.userWait(2000);
                    submitInboxPerfReview.click();
                    workdaycommon.userWait(1000);
                    donePerfReview.click();
                    workdaycommon.userWait(2000);
                    log.info(" Approvals done Successfully.......");
                }
                log.info(".......Process Completed with all Approvals.........");
                workdaycommon.gotoWorkdayHomepage();
                Validation_PerformanceReview(Empname, MngrName);
            }
        } catch (Exception e) {
            log.info("Running in Catch Block.........");
            workdaycommon.gotoWorkdayHomepage();
            Validation_PerformanceReview(Empname, MngrName);
        }


    }


    public void Validation_PerformanceReview(String Empname, String MngrName) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.searchbySearchBox(Empname);
        workdaycommon.userWait(1000);
        allOfWorkdayStartPerfReview.click();
        workdaycommon.userWait(9000);
        WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Salaried(Annual): "+Empname+"')]"));
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(Employeename);
        workdaycommon.userWait(1000);
        Employeename.click();
        workdaycommon.userWait(1000);
        String overallStatus = overallStatusStartPerfReview.getText();
        log.info("---------overallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);

        workdaycommon.scroll();
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (statusStartPerfReview.isDisplayed()) {
                    log.info("Start Performance Review not Completed Successfully........");
                    test.fail("Start Performance Review not Completed Successfully........");
                }
            } catch (Exception e) {
                test.pass("Start Performance Review Completed Successfully for Employee name :" + Empname + " By Manager Name" + MngrName);
                log.info("Start Performance Review Completed Successfully........");
                String newLine = System.getProperty("line.separator");
                // test.info("Start Performance Review:  "+newLine+ "Employee Name : "+Empname +newLine);
            }
        } else {
            log.info("Start Performance Review not Completed Successfully........Current Status: " + overallStatus);
            test.fail("Start Performance Review not Completed Successfully.......Current Status: " + overallStatus);

        }
    }



    public void Check_Start_Perfomance_Review(String Employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);

        workdaycommon.userWait(2000);


        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);

        allOfWorkdayProCompHire.click();
        workdaycommon.userWait(3000);
        WebElement SrchEmployeename = driver.findElement(By.xpath("(//*[text()='" + Employee + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(SrchEmployeename);
        workdaycommon.userWait(3000);
        SrchEmployeename.click();
        workdaycommon.userWait(3000);


        try {

            if (workdaycommon.tabmoreEmpProfile.isDisplayed()) {
                log.info("More Option Available...");
                workdaycommon.userWait(3000);
            }
        } catch (Exception e) {
            log.info("More Option Not Available...");
            workdaycommon.userWait(1000);
        }


        workdaycommon.userWait(1000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(TalentAction, StartPerformancePerfReview);
        workdaycommon.userWait(3000);


        reviewtemplateStartPerfReview.click();
        workdaycommon.userWait(1000);
        reviewtemplateSelectByTypeStartPerfReview.click();
        workdaycommon.userWait(1000);
        reviewtemplateAnnualReviewStartPerfReview.click();
        workdaycommon.userWait(1000);

        if(count==0)
        {
            getnamestr1=reviewtemplateAnnualReviewSelectStartPerfReview.getText();

            log.info("Merit Cycle is: " + getnamestr1);
            test.info("Merit Cycle is: " + getnamestr1);

            count++;
        }

        else
        {
            getnamestr2=reviewtemplateAnnualReviewSelectStartPerfReview.getText();

            log.info("Merit Cycle is: " + getnamestr2);
            test.info("Merit Cycle is: " + getnamestr2);

            if(getnamestr1.equals(getnamestr2))
            {

                log.info("Merit Cycle of an associate remains unchanged");
                test.pass("Merit Cycle of an associate remains unchanged");

            }

            else{

                log.info("Merit Cycle of an associate is changed");
                test.fail("Merit Cycle of an associate is changed");

            }
            count=0;
        }

//        String MeritCycle =reviewtemplateAnnualReviewSelectStartPerfReview.getText();
//        log.info("Merit Cycle is: " + MeritCycle);
//        test.info("Merit Cycle is: " + MeritCycle);

    }


    public void Check_Start_Perfomance_Review_By_Manager(String Employee) throws Exception {


        /// //Note: Here In Manager's  proxy, it'll chk whether manager can perform Start Perfm review.... Cz Manager does not have access to perform start Performance review for associate
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(2000);

        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        allOfWorkdayProCompHire.click();
        workdaycommon.userWait(3000);
        WebElement SrchEmployeename = driver.findElement(By.xpath("(//*[text()='" + Employee + "']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(SrchEmployeename);
        workdaycommon.userWait(1000);
        SrchEmployeename.click();
        workdaycommon.userWait(3000);

        workdaycommon.clickAction.click();
        try{
//            workdaycommon.mousemove(TalentAction,StartPerformancePerfReview);
//            workdaycommon.userWait(1000);

            String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
            ((JavascriptExecutor) driver).executeScript(mouseOverScript, TalentAction);
            Thread.sleep(3000);
//            WebActionsUtil.explicitWait(driver,StartPerformancePerfReview,"visible");
            ((JavascriptExecutor) driver).executeScript(mouseOverScript, StartPerformancePerfReview);
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", StartPerformancePerfReview);

            log.info("Manager has access to perform Start Performance review");
            log.info("Manager should not able to perform Start Performance review as per this scenario");
            test.fail("Manager has access to perform Start Performance review");
            test.info("As per this scenario, manager should not able to perform Start Performance review ");
        }
        catch(Exception e){
            log.info("Manager does not have access to perform Start Performance review as expected in this scenario");
            test.pass("Manager does not have access to perform Start Performance review as expected in this scenario");
        }



    }




    public void Start_Talent_Review(String Empname, String reviewtemplate) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.searchbySearchBox(Constants.SRCHSTARTTALNTREVIEW);
        linkStarttalntReview.click();
        empnameStarttalntReview.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Empname, Keys.ENTER);
        workdaycommon.userWait(9000);
        // workdaycommon.selectfromduplicates(Empname);
        //  workdaycommon.userWait(9000);

        test.info("Entered " + Empname + "in the Start Talent Review screen");
        log.info("Entered " + Empname + "in the Start Talent Review screen");
        reviewtemplateStarttalntReview.click();
        workdaycommon.userWait(5000);
        insidesearchboxcommon.sendKeys(reviewtemplate, Keys.ENTER);
        test.info("Review Template selected for " + Empname + "");
        log.info("Review Template selected for " + Empname + "");
        workdaycommon.userWait(5000);
        btnokStarttalntReview.click();
        workdaycommon.userWait(3000);
        btnDoneStarttalntReview.click();
        test.info("Start Talent Review has been Initiated for " + Empname + "");
        log.info("Start Talent Review has been Initiated for " + Empname + "");

    }

    public void UpdateTalentProfile(String Empname, String WorkExperience, String Experiencelevel) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);

        workdaycommon.StartProxy_employee(Empname);
        workdaycommon.inboxOperation1(Empname);
        workdaycommon.userWait(3000);
        summaryEditorButton.click();
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(AddWorkExperience);
        workdaycommon.userWait(5000);
        AddWorkExperience.click();
        insidesearchboxcommon.sendKeys(WorkExperience, Keys.TAB);
        workdaycommon.userWait(5000);
        insidesearchboxcommon.sendKeys(Experiencelevel, Keys.TAB);
        test.info("Entered the details " + Empname + "");
        log.info("Entered the details " + Empname + "");
        workdaycommon.userWait(3000);
        inboxbuttonSubmit.click();
        test.pass("Start Talent Review has been Completed for " + Empname + "");
        log.info("Start Talent Review has been Completed for " + Empname + "");

    }

    public void AddGoalstoEmployee(String employee, String category, String Goalname, String status) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        test.info("Adding Goal(s) to the Employee : " + employee);
        log.info("Adding Goal(s) to the Employee : " + employee);
//        workdaycommon.stopProxy();
//        workdaycommon.simplestartProxy(employee); //uncomment when needed
        workdaycommon.StartProxy_employee(employee);
        log.info("employee proxy successfull");
        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.selfImgBtn.click();
        workdaycommon.userWait(2000);
        workdaycommon.viewprofileSelf.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.userWait(1000);
        workdaycommon.mousemove(TalentAction, editGoals);
        workdaycommon.userWait(3000);
        ADD_addGoalstoEmployee.click();


        goal_addGoalstoEmployee.sendKeys(Goalname);
        description_addGoalstoEmployee.sendKeys(Constants.DESCRIPTIONMANAGEGOALS);
        log.info("step 1");

        workdaycommon.scrolltoElement(duedate_addGoalstoEmployee);
        workdaycommon.userWait(1000);
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        // System.out.println(date);
        Calendar future = Calendar.getInstance();
        future.add(Calendar.DATE, 4);
        Date yestdate = future.getTime();
        String futuredate = simpleDateFormat.format(yestdate);

//        workdaycommon.scrolltoElement(duedate_addGoalstoEmployee);
        log.info("Goals tab ");
        if (driverWrapper.isElementPresent(duedate_addGoalstoEmployee)) {
            for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                elem.sendKeys(futuredate);
                elem.sendKeys(Keys.TAB);
                elem.sendKeys(Keys.TAB);
            }
        }
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(category_addGoalstoEmployee);
        category_addGoalstoEmployee.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(category, Keys.TAB);
        workdaycommon.userWait(2000);


        workdaycommon.scrolltoElement(status_editgoal);
        status_editgoal.click();
        status_editgoal.sendKeys(status, Keys.ENTER);
        workdaycommon.userWait(3000);

        submit_addGoalstoEmployee.click();
        workdaycommon.userWait(3000);
        tabDetailsandProcess_addGoalstoEmployee.click();
        workdaycommon.userWait(3000);
        eventlink_addgoalsemp.click();
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(workdaycommon.processtab);
        workdaycommon.processtab.click();
        workdaycommon.userWait(5000);

        String overallStatus = workdaycommon.overallStatus.getText();
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (workdaycommon.awaitingaction.isDisplayed()) {
                    log.info(" Pending with Awaiting action........");
                    test.fail(" Pending with Awaiting action........");
                }
            } catch (Exception e) {
                test.pass("Goal added Successfully");
                test.info("BP:  Manage Goal(s)- Add Goals , Associate name: " + employee + ", Goal added: " + Goalname + ", Category: " + category);
                log.info("Goal added Successfully");
            }
        } else {
            log.info("Goal not added Successfully..........Current Status: " + overallStatus);
            test.fail("Goal not added Successfully..........Current Status: " + overallStatus);
        }
    }


    public void ViewGoals(String employee, String Goalname, String editGoalname) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        // workdaycommon.searchbySearchBox(employee);
        workdaycommon.simplestartProxy(employee);

//        workdaycommon.StartProxy_employee(employee);
        test.info("starting view goals");
        log.info("starting view goals");
        workdaycommon.gotoWorkdayHomepage();
        test.info("Moved to home screen");
        log.info("Moved to home screen Log");
        workdaycommon.selfImgBtn.click();
        workdaycommon.userWait(2000);
        workdaycommon.viewprofileSelf.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.userWait(1000);
        workdaycommon.mousemove(TalentAction, MyGoals);
        log.info("Clicked on Talent  then My goals");
        workdaycommon.userWait(2000);
        WebElement row_goal;
        try {
            log.info("Entered Try block");
//            row_goal = driver.findElement(By.xpath("//*[@data-automation-id='multiViewPrimaryHeader']"));
            row_goal = driver.findElement(By.xpath("//*[@data-automation-id='multiViewPrimaryHeader' and contains(text(),'" + Goalname + "')]"));
            if (row_goal.isDisplayed()) {
//                workdaycommon.scrolltoElement(row_goal);
                row_goal.click();
//                workdaycommon.scrolltoElement(labelGoalName);
                if (labelGoalName.getText().equals(Goalname)) {
                    test.pass("Goal updated successfully. User is able to view the goals successfully and the goal is: " + Goalname);
                } else {
                    test.fail("Goal not Updated successfully");
                }
            }
        } catch (Exception e) {
            log.info("Entered Catch block");
            row_goal = driver.findElement(By.xpath("//div[@data-automation-id='multiViewPrimaryHeader' and contains(text(),'"+editGoalname+"')]"));
            workdaycommon.scrolltoElement(row_goal);
            row_goal.click();
            log.info("----------------------------" + labelGoalName.getText());
            log.info("----------------------------" + editGoalname);
//            workdaycommon.scrolltoElement(labelGoalName);
            if(labelGoalName.getText().equals(editGoalname)) {
                test.pass("Goal Updated successfully, User can view the goals");
            } else {
                test.fail("Goal not Updated successfully");
            }
        }
    }

    public void EditGoal(String employee, String Goalname, String editgoal, String status) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        test.info("Editing Goal(s) of employee : " + employee);
//          workdaycommon.StartProxy_employee(employee);
        workdaycommon.userWait(5000);
        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.userWait(2000);
        workdaycommon.selfImgBtn.click();
        workdaycommon.userWait(2000);
        workdaycommon.viewprofileSelf.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.userWait(1000);
        workdaycommon.mousemove(TalentAction, editGoals);
        workdaycommon.userWait(3000);
        workdaycommon.userWait(2000);
        WebElement row_goal = driver.findElement(By.xpath("//*[@data-automation-id='multiViewPrimaryHeader' and contains(text(),'" + Goalname + "')]"));
        workdaycommon.scrolltoElement(row_goal);
        row_goal.click();
        workdaycommon.userWait(3000);
        goal_addGoalstoEmployee.clear();
        workdaycommon.userWait(2000);
        log.info("Clearing the previous goal entered");
        goal_addGoalstoEmployee.sendKeys(editgoal);
        log.info("Entered new goal");
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(status_editgoal);
        status_editgoal.click();
        status_editgoal.sendKeys(status, Keys.ENTER);
        workdaycommon.userWait(3000);
   /* String pattern = "MM/dd/YYYY";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    String date = simpleDateFormat.format(new Date());
    workdaycommon.scrolltoElement(completedate_editgoal);
    if (driverWrapper.isElementPresent(completedate_editgoal)) {
        log.info("job details page");
        for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
            elem.sendKeys(date);
            elem.sendKeys(Keys.TAB);
            elem.sendKeys(Keys.TAB);
        }
    } */
        submit_addGoalstoEmployee.click();
        workdaycommon.userWait(5000);
        workdaycommon.scrolltoElement(tabDetailsandProcess_addGoalstoEmployee);
        tabDetailsandProcess_addGoalstoEmployee.click();
        workdaycommon.userWait(3000);

        eventlink_addgoalsemp.click();
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(workdaycommon.processtab);
        workdaycommon.processtab.click();
        workdaycommon.userWait(3000);
        String overallStatus = workdaycommon.overallStatus.getText();
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (workdaycommon.awaitingaction.isDisplayed()) {
                    log.info(" Pending with Awaiting action........");
                    test.fail(" Pending with Awaiting action........");
                }
            } catch (Exception e) {
                test.pass("Goal Edited Successfully");
                test.info("BP:  Manage Goal(s)- Edit Goals , Associate name: " + employee + ", New Goal editted: " + editgoal);
                log.info("Goal Edited Successfully");
            }
        } else {
            log.info("Goal not edited Successfully..........Current Status: " + overallStatus);
            test.fail("Goal not edited Successfully..........Current Status: " + overallStatus);
        }


    }



    public void Start_Disciplinary_Action(String Empname, String Review_Template, String Disciplinary_Action_Reasons, String Period_Start_Date, String Period_End_Date) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(2000);
        test.info("Starting Disciplinary action for an employee : " + Empname);
        workdaycommon.searchbySearchBox(Empname);
        workdaycommon.userWait(1000);
        allOfWorkdayProCompHire.click();
        log.info("All of Workday clicked");
        workdaycommon.userWait(1000);
//        WebElement SrchEmployeename = driver.findElement(By.xpath("//div[contains(text(),'" + Empname + "')]//following::div[text()='Associate']//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Empname + "')][1]"));
        WebElement SrchEmployeename = driver.findElement(By.xpath("(//*[contains(text(),'" + Empname + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Empname + "')][1]"));
//        workdaycommon.userWait(3000);
        log.info("step_1");
        workdaycommon.scrolltoElement(SrchEmployeename);
        workdaycommon.userWait(1000);
        SrchEmployeename.click();
        workdaycommon.userWait(3000);

        jobPerfReview.click();
        workdaycommon.userWait(1000);

        workdaycommon.more_dropdownbox(mngrHistoryPerfReview);
        workdaycommon.userWait(1000);

        String MngrName = mngrNameePerfReview.getText();
        log.info("Manager Name---->" + MngrName);
        workdaycommon.userWait(5000);

//        WebElement Threedots = driver.findElement(By.xpath("//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]//following::img[1]"));
//        Threedots.click();
//        workdaycommon.scrolltoElement(securityProfile);
        try{
//
            /*String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
            ((JavascriptExecutor) driver).executeScript(mouseOverScript, securityProfile);
            Thread.sleep(3000);
//            WebActionsUtil.explicitWait(driver,startProxyFromAssociateName,"visible");
            ((JavascriptExecutor) driver).executeScript(mouseOverScript, startProxyFromAssociateName);
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", startProxyFromAssociateName);
//            startProxyFromAssociateName.click();
            btnOK.click();
            workdaycommon.userWait(3000);
            log.info(".......Proxy successful.......");*/
            workdaycommon.startProxy(MngrName);
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            log.info("Already in Manager's proxy");
        }

        workdaycommon.userWait(5000);
        workdaycommon.searchbySearchBox(Empname);
        workdaycommon.userWait(2000);
        allOfWorkdayProCompHire.click();
        workdaycommon.userWait(3000);
        WebElement emp = driver.findElement(By.xpath("(//*[contains(text(),'" + Empname + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Empname + "')][1]"));
        workdaycommon.scrolltoElement(emp);
        emp.click();


        workdaycommon.userWait(3000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(TalentAction, StartDisciplinaryAction);
        workdaycommon.userWait(3000);
        reviewtemplateStartPerfReview.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(Review_Template, Keys.ENTER);
        workdaycommon.userWait(2000);
        disActionReason.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(Disciplinary_Action_Reasons, Keys.ENTER);
        workdaycommon.userWait(2000);
        StartDate.sendKeys(Period_Start_Date, Keys.ENTER);
        workdaycommon.userWait(2000);
        EndDate.sendKeys(Period_End_Date, Keys.ENTER);
        workdaycommon.userWait(3000);

        btnsubmitStartPerfReview.click();

        workdaycommon.userWait(5000);
        donePerfReview.click();

        //log.info("Start proxy with Manager....");
        //workdaycommon.StartProxy_employee(MngrName);
        workdaycommon.userWait(4000);

        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.inboxWD.click();
        workdaycommon.userWait(2000);
        log.info("Manager Inbox");
//        WebElement inboxrow2 = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Manager Evaluation: Discipline Notice: " + Empname + "')]"));
        WebElement inboxrow2 = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Manager Evaluation: " + Review_Template + ": " + Empname + "')]"));
        workdaycommon.scrolltoElement(inboxrow2);
        inboxrow2.click();
        workdaycommon.userWait(3000);

        try {
            closeButtonPerfReview.click();
            workdaycommon.userWait(2000);
        } catch (Exception e) {
            log.info("No need to CLose.......");
            workdaycommon.userWait(2000);
        }

        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(summaryEditorPerfReview);
        summaryEditorPerfReview.click();
        workdaycommon.userWait(4000);
        log.info("Clicked on Summary Editor...");
        workdaycommon.scrolltoElement(submitInboxPerfReview);
        submitInboxPerfReview.click();
        workdaycommon.userWait(2000);

        donePerfReview.click();
        workdaycommon.userWait(5000);
        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.inboxWD.click();
        workdaycommon.userWait(3000);
        WebElement inboxrow_second = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Manager Evaluation: " + Review_Template + ": " + Empname + "')]"));
        inboxrow_second.click();
        workdaycommon.scrolltoElement(submitInboxPerfReview);
        submitInboxPerfReview.click();

        workdaycommon.userWait(3000);
        log.info("Manager Evaluation complete");


        log.info(" Start proxy with Employee....");

        workdaycommon.startProxy(Empname);
        workdaycommon.userWait(4000);

        workdaycommon.gotoWorkdayHomepage();
        workdaycommon.userWait(2000);
        workdaycommon.inboxWD.click();
        workdaycommon.userWait(3000);
        WebElement inboxrow1 = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Manager Evaluation: " + Review_Template + ": " + Empname + "')]"));
        workdaycommon.scrolltoElement(inboxrow1);
        inboxrow1.click();
        workdaycommon.userWait(3000);
        log.info("Clicked inbox");

        WebActionsUtil.explicitWait(driver, ackEditPerfReview, "click");
        workdaycommon.scrolltoElement(ackEditPerfReview);
        ackEditPerfReview.click();
        log.info("Edit option inbox");
        workdaycommon.userWait(2000);
        promptSearch.click();
        workdaycommon.userWait(2000);
        ackReceiptPerfReview.click();

        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(submitInboxPerfReview);

        submitInboxPerfReview.click();
        donePerfReview.click();

        log.info("Employee Acknowledgement Completed");
        test.pass("Start Disciplinary Action completed Successfully for an Employee: " + Empname + "");

    }

    public void Check_Start_Perfomance_Review_Regular(String Employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);

        workdaycommon.userWait(2000);


        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(allOfWorkday);
        workdaycommon.userWait(2000);
        allOfWorkday.click();
        WebElement SrchEmployeename = driver.findElement(By.xpath("//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(SrchEmployeename);
        workdaycommon.userWait(1000);
        SrchEmployeename.click();
        workdaycommon.userWait(3000);


        try {
            if (workdaycommon.tabmoreEmpProfile.isDisplayed()) {
                log.info("More Option Available...");
                workdaycommon.userWait(3000);
            }
        } catch (Exception e) {
            log.info("More Option Not Available...");
            workdaycommon.userWait(1000);
        }


        workdaycommon.userWait(1000);
        workdaycommon.clickAction.click();
        workdaycommon.mousemove(TalentAction, StartPerformancePerfReview);
        workdaycommon.userWait(3000);
        reviewtemplateStartPerfReview.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys("Salaried(Annual)");
        workdaycommon.userWait(1000);
        inboxbuttonSubmit.click();
        workdaycommon.userWait(1000);

        test.info("Entered the details " + Employee + "");
        log.info("Entered the details " + Employee + "");
        driver.close();



    }


    public void Check_Start_Perfomance_Review_Intern(String Employee) throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);

            workdaycommon.userWait(2000);
            workdaycommon.searchbySearchBox(Employee);
            workdaycommon.userWait(1000);
            allOfWorkday.click();
            WebElement SrchEmployeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='" + Employee + "']"));
            workdaycommon.userWait(2000);

            workdaycommon.scrolltoElement(SrchEmployeename);
            workdaycommon.userWait(2000);
            SrchEmployeename.click();
            workdaycommon.userWait(2000);

            workdaycommon.clickAction.click();
            workdaycommon.mousemove(TalentAction, StartPerformancePerfReview);
            workdaycommon.userWait(3000);
            reviewtemplateStartPerfReview.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys("Annual Review - Salaried");
            workdaycommon.userWait(2000);
            insidesearchboxcommon.sendKeys(Keys.ENTER);
            workdaycommon.userWait(4000);
            workdaycommon.userWait(4000);
            String match = NoMatchesFound.getText();
            workdaycommon.userWait(4000);
            log.info(match);
            if (match.equals("No matches found")) {
                log.info("Manager can not initiate Performance review for Intern");
                test.info("Manager can not initiate Performance review for Intern");

            } else {
                log.info("Manager is able to initiate Performance review for Intern");
                test.fail("Manager is able to initiate Performance review for Intern");

            }
        }
        catch (Exception ex){
            throw ex;
        }
    }
}
