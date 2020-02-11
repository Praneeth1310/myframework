package com.thd.projectname.pages.PO_HCM;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
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


public class JobChanges_DifferentFlows extends BasePage {
    private static final Logger log = LogManager.getLogger(JobChanges_DifferentFlows.class);
    WorkdayCommon workdaycommon = new WorkdayCommon();

//--------------------------------------------------------------------------------------

    @FindBy(xpath = "//span[text()='More']//following::div[@data-automation-id='popupOption' and text()='Manager History']")
    private WebElement subTabManagerHistory;

    @FindBy(xpath = "//span[@data-automation-id='workerProfileMenuItemLabel' and text()='Job']")
    private WebElement tabJob;

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

    @FindBy(xpath = "//div[text()='Why are you making this change?']//following::input[@data-automation-id='searchBox']")
    public WebElement makechangesearchboxChangeJob;

    @FindBy(xpath = "//label[text()='Associate Type']//following::*[@data-automation-id='menuItem'][1]")
    public WebElement associatetypeChangeJob;


    @FindBy(xpath = "(//*[@data-automation-id='dateWidgetInputBox'])[1]")
    public WebElement DateChangeJob;


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

    @FindBy(xpath = "//h4[text()='Opening']//following::label[@data-automation-id='formLabel'][1]")
    public WebElement openingChangeJob;

    @FindBy(xpath = "//h4[text()='Opening']//following::div[@data-automation-id='actionImage'][1]")
    public WebElement editopeningChangeJob;

    @FindBy(xpath = "//h4[text()='Opening']//following::div[@data-automation-id='icon'][1]")
    public WebElement openingdropdownChangeJob;

    @FindBy(xpath = "//h4[text()='Opening']//following::div[@data-automation-id='promptOption' and contains(text(),'Close this headcount')]")
    public WebElement openingoptionChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Position']")
    public WebElement editpositionChangeJob;

    @FindBy(xpath = "//div[text()='Department']//following::div[@data-automation-id='actionImage'][1]")
    public WebElement deptEditProCompHire;

    @FindBy(xpath = "//div[text()='Department']//following::span[@data-automation-id='promptIcon']")
    public WebElement deptValEditProCompHire;

    @FindBy(xpath = "(//div[@data-automation-id='checkboxPanel'])[1]")
    public WebElement createnewpositionChangeJob;

    @FindBy(xpath = "(//div[@data-automation-id='checkboxPanel'])[2]")
    public WebElement closecurrentpositionChangeJob;

    @FindBy(xpath = "//div[@title='Edit Cost Center']")
    public WebElement costEditProCompHire;

    @FindBy(xpath = "//div[@title='Edit Company']")
    public WebElement compEditProCompHire;

    @FindBy(xpath = "//input[@data-automation-id='searchBox']")
    public WebElement compValProCompHire;

    @FindBy(xpath = "//div[@title='Edit Business Unit']")
    public WebElement bUEditProCompHire;

    @FindBy(xpath = "//span[@data-automation-id='promptIcon']")
    public WebElement clickToEnterInSearchBox;

    @FindBy(xpath = "//*[text()='Open']")
    public WebElement openProCompHire;

    //@FindBy(xpath = "//label[text()='Position']//following::input[@data-automation-id='searchBox'][1]")
//    @FindBy(xpath = "//label[text()='Position']//following::span[@data-automation-id='promptIcon'][1]")
    @FindBy(xpath = "//label[text()='Position']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement enterpositionChangeJob;

    @FindBy(xpath = "//label[text()='Close the current position?']//following::div[@data-automation-id='checkbox']")
    public WebElement closeposChangeJob;

    // @FindBy(xpath = "//*[@aria-label='Edit Job Profile']") //old one
    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Job Profile']")
    public WebElement editjobprofileChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Position']")
    public WebElement editposition_JC;

    @FindBy(xpath = "//*[contains(text(),'Do you want to create a new position')]//following::*[@data-automation-id='checkboxPanel'][1]")
    public WebElement createnewPositionCHKBOX_JC;

    @FindBy(xpath = "//*[contains(text(),'Close the current position')]//following::*[@data-automation-id='checkboxPanel'][1]")
    public WebElement closecurrentPositionCHKBOX_JC;

    @FindBy(xpath = "//div[@data-automation-id='helptext-click-target']")
    public WebElement changeJobUpArrow;

    //@FindBy(xpath = "//label[text()='Job Profile']//following::input[@data-automation-id='searchBox'][1]")
    @FindBy(xpath = "//label[text()='Job Profile']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement enterjobprofileChangeJob;

    @FindBy(xpath = "//button[@title='Next' and @data-automation-id='wd-CommandButton_next']")
    public WebElement btnnextChangeJob;

    //@FindBy(xpath = "//label[text()='Location']//following::input[@data-automation-id='searchBox'][1]")
    @FindBy(xpath = "//label[text()='Location']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement locationdetailsChangeJob;

    @FindBy(xpath = "//h3[text()='Location Details']//following::div[@data-automation-id='actionImage' and @title='Edit Location Details']")
    public WebElement editlocationdetailsChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Company']")
    public WebElement editCompanyChangeJob;

    //    @FindBy(xpath = "//label[text()='Company']//following::span[@data-automation-id='promptSearchButton'][1]")
    @FindBy(xpath = "//label[text()='Company']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement enterCompanyChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Cost Center']")
    public WebElement editButtonCostcenterChangeJob;

    //    @FindBy(xpath = "//label[text()='Cost Center']//following::span[@data-automation-id='promptSearchButton'][1]")
    @FindBy(xpath = "//label[text()='Cost Center']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement enterCostcenterChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Business Unit']")
    public WebElement editBusinessUnitChangeJob;

    @FindBy(xpath = "//label[text()='Business Unit']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement enterBusinessUnitChangeJob;

    @FindBy(xpath = "//div[text()='Department']//following::div[@data-automation-id='actionImage' and contains(@title,'Edit Other Row')][1]")
    public WebElement editDepartmentChangeJob;

//    @FindBy(xpath = "//div[text()='Department']//following::span[@data-automation-id='promptIcon'][1]")
//    public WebElement DepartmentChangeJob;

    //  @FindBy(xpath = "//div[text()='Department']//following::div[@data-automation-id='promptSearchButton'][1]")
    @FindBy(xpath = "//div[text()='Department']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement enterDepartmentChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage']")
    public WebElement editadmindetailsChangeJob;

//    @FindBy(xpath = "//label[text()='Associate Type']//following::*[@data-automation-id='promptIcon'][1]")
//    public WebElement associatetypeChangeJob;

    //    @FindBy(xpath = "//label[text()='Associate Type']//following::input[1]")
    @FindBy(xpath = "//label[text()='Associate Type']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement employeetypeChangeJob;

    @FindBy(xpath = "//label[text()='Time Type']//following::*[@data-automation-id='menuItem'][1]")
    public WebElement timetypeChangeJob;

    @FindBy(xpath = "//label[text()='Default Weekly Hours']//following::input[1]")
    public WebElement defaultweeklyhoursChangeJob;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Location Details']")
    public WebElement editlocationDetailsChangeJob;

    @FindBy(xpath = "//label[text()='Scheduled Weekly Hours']//following::input[@data-automation-id='numericInput']")
    public WebElement enterScheduledWeeklyHours;

    @FindBy(xpath = "//h3[text()='Salary']")
    public WebElement headerSalaryChangeJob;

    @FindBy(xpath = "//h3[text()='Hourly']")
    public WebElement headerHourlyChangeJob;

    @FindBy(xpath = "//h3[text()='Salary']//following::div[@title='Edit Salary']")
    public WebElement editsalaryChangeJob;

    @FindBy(xpath = "//label[text()='Amount']//following::input[@data-automation-id='numericInput'][1]")
    public WebElement amountChangeJob;

    @FindBy(xpath = "//label[text()='Currency']//following::input[1]")
    public WebElement currencyChangeJob;

    @FindBy(xpath = "//label[text()='Percent Change']//following::input[1]")
    public WebElement percentChange;

    @FindBy(xpath = "//label[text()='Frequency']//following::input[1]")
    public WebElement frequencyChangeJob;

    @FindBy(xpath = "//h3[text()='Hourly']//following::div[contains(@title,'Edit Hourly') and @data-automation-id='actionImage']")
    public WebElement edithourlyChangeJob;

    @FindBy(xpath = "//span[@title='Submit']")
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


    //-----------------Business Title Change---------------------

    @FindBy(xpath = "//div[@data-automation-id='relatedActionsItemLabel' and text()='Job Change']")
    public WebElement jobChange_ChangeBusinesstitle;

    @FindBy(xpath = "//div[@data-automation-id='relatedActionsItemLabel' and text()='Change Business Title']")
    public WebElement changeBusinesstitle;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Effective Date']")
    public WebElement effectiveDate;

    @FindBy(xpath = "//input[@data-automation-id='textInputBox']")
    public WebElement changeBusinessTitleTextBox;

    //JOB Change common--------------------
    @FindBy(xpath = "//label[text()='All of Workday']")
    public WebElement allOfWorkday;

    @FindBy(xpath = "//div[text()='Associate History']")
    public WebElement workerHistoryJC;

    @FindBy(xpath = "//div[text()='View Associate History by Category']")
    public WebElement viewWorkerHisByCategoryJC;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[text()='Process'][1]")
    public WebElement processJobChange;


    @FindBy(xpath = "//label[text()='Overall Status']//following::div[text()='Process'][1]")
    public WebElement processtabJobChange;

    @FindBy(xpath = "//span[@title='Done']")
    public WebElement btndoneJC;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[2]")
    public WebElement overallStatusJobChange;

    @FindBy(xpath = "//*[text()='Awaiting Action']")
    public WebElement checkAwaitingAction;

    @FindBy(xpath = "//label[text()='I Agree']//following::div[@data-automation-id='checkboxPanel']")
    public WebElement AgreeCheckbox;

    @FindBy(xpath = "//div[text()='Awaiting Action']//following::div[@data-automation-id='promptOption'][1]")
    public WebElement awaitingAction;

    @FindBy(xpath = "(//div[@data-automation-id='relatedActionsItemLabel' and text()='Security Profile'])")
    public WebElement securityProfile;

    @FindBy(xpath = "//*[text()='Start Proxy']")
    public WebElement startProxyFromAssociateName;

    @FindBy(xpath = "//div[text()='Job Change']")
    public WebElement JobchangeLocChangeJob;

    @FindBy(xpath = "//div[text()='Change Location']")
    public WebElement LocationChangeJob;

    @FindBy(xpath = "//label[text()='I certify that the information provided in this return is accurate and complete.']//following::div[@data-automation-id='checkboxPanel']")
//    @FindBy(xpath = "//label[text()='I certify that the information given on this form is correct and complete.']//following::div[@data-automation-id='checkboxPanel']")
        public WebElement CertifyCheckbox;

    @FindBy(xpath = "//div[@data-automation-id='textView' and text()='Process Successfully Completed']")
    public WebElement processSuccessfullyCompleteedChangeJob;

    @FindBy(xpath = "//span[text()='Details and Process']")
    public WebElement clickDetailsAndProcess;

    @FindBy(xpath = "//div[text()='Associate History']")
    public WebElement AssocHis;

    @FindBy(xpath = "//div[text()='View Associate History by Category']")
    public WebElement viewAssocHisByCat;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[text()='Process'][1]")
    public WebElement processTabWL;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[2]")
    public WebElement overallStatusWL;

    @FindBy(xpath = "//*[text()='Awaiting Action']")
    public WebElement statusWL;

//-------------------------------------------------------------------------------------------

    @FindBy(xpath = "//*[@data-automation-id='searchBox']")
    public WebElement insidesearchboxcommon;

    //---------------------------------------------------------------------------------------------------

    public void Jobchange(String Employee, String Pro_Suporg, String Location, String UPosition, String JC_JobProfile, String EmpType, String Amount, String CostCenter, String jobchangedate) throws Exception {
        //try {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.entry();
        log.info("Starting with Jobchange");
        test.info("Starting job change for the employee.");
        workdaycommon.searchbySearchBox("Change job");
        workdaycommon.userWait(2500);
        linkchangeJob.click(); //clicking on Change job link
        log.info(("Starting with job change . . .. . . "));
        workernameChangeJob.click(); //Entering worker's/employee name for whom the job to be changed
        workdaycommon.userWait(1000);
        // String name = this.FNAMECREATEPREHIRE1+ " " + this.LNAMECREATEPREHIRE1;
        // log.info("name--->" +name);
        insidesearchboxcommon.sendKeys(Employee, Keys.ENTER);
        workdaycommon.userWait(3000);
        //   workdaycommon.selectfromduplicates(Employee); // Selecting values from duplicates
        log.info("Entering Worker name");
        workdaycommon.userWait(3000);
        btnOKChangeJob.click();
        //Entering Start details
        log.info("Entering Job change start details");
        workdaycommon.scrolltoElement(editStartDetailsChangeJob);
        workdaycommon.userWait(3000);
        editStartDetailsChangeJob.click();
        workdaycommon.userWait(3000);
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date1 = simpleDateFormat.format(new Date());
        if (driverWrapper.isElementPresent(dateToChangeEffect)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(jobchangedate);//change it to date1
            }
        }
        WebActionsUtil.explicitWait(driver, makechangeChangeJob, "click");
        makechangeChangeJob.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Constants.JOBCHANGEREASONCHANGEJOB, Keys.ENTER);
        //workdaycommon.scroll();
        workdaycommon.userWait(3000);
        WebActionsUtil.explicitWait(driver, teamchangeChangeJob, "click");
        workdaycommon.scrolltoElement(teamchangeChangeJob);
        teamchangeChangeJob.click();
        workdaycommon.userWait(3000);
        enterteamChangeJob.click(); //uncoment only when needed
        insidesearchboxcommon.sendKeys(Pro_Suporg, Keys.ENTER);
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Keys.TAB);
        //workdaycommon.selectfromduplicates(SUPORG);
        workdaycommon.userWait(4000);
//          changelocationChangeJob.click();
        // workdaycommon.userWait(3000);
//        enterlocationChangeJob.click();
        insidesearchboxcommon.sendKeys(Location, Keys.ENTER);
        workdaycommon.userWait(2000);
        WebActionsUtil.explicitWait(driver, btnstartChangeJob, "click");
        btnstartChangeJob.click();
        workdaycommon.userWait(2000);
        btnnextChangeJob.click();
        //opening details
        try {
            if (openingChangeJob.isDisplayed()) {


                btnnextChangeJob.click();
            }
        }
        catch(Exception e)
        {
            log.info("Next button is not present");
        }


        //Entering Job profile details
        log.info("Entering Job profile details");
        workdaycommon.userWait(3000);
//        workdaycommon.scrolltoElement(changeJobUpArrow);
        changeJobUpArrow.click();
        log.info("clicked on the arrow");
        workdaycommon.userWait(3000);
//        workdaycommon.scrolltoElement(editpositionChangeJob);
//        workdaycommon.scroll();
//        workdaycommon.userWait(3000);
        WebElement element_position = driver.findElement(By.xpath("//div[@data-automation-id='actionImage' and @title='Edit Position']"));
        workdaycommon.scrolltoElement(element_position);
//        WebActionsUtil.explicitWait(driver,element_position,"click");
        JavascriptExecutor executor_position = (JavascriptExecutor) driver;
        executor_position.executeScript("arguments[0].click();", element_position);
        workdaycommon.userWait(3000);
//        WebActionsUtil.explicitWait(driver, enterpositionChangeJob, "click");
//        workdaycommon.scrolltoElement(enterpositionChangeJob);
        // editpositionChangeJob.click();
        log.info("Clicked on the edit position button");
        workdaycommon.userWait(3000);
//        enterpositionChangeJob.click();
//        log.info("Clicked on the edit position button");

        workdaycommon.userWait(3000);
        try {
            insidesearchboxcommon.sendKeys(UPosition,Keys.ENTER);
            workdaycommon.userWait(2000);
//            insidesearchboxcommon.sendKeys(Keys.ENTER);
//            workdaycommon.userWait(20000);
            log.info("Selected position");
//            workdaycommon.userWait(3000);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            log.info("Selecting position from duplicates");
            // workdaycommon.selectfromduplicates(UPosition);
            workdaycommon.userWait(3000);
        }

        try {
//            WebActionsUtil.explicitWait(driver, closeposChangeJob, "click");
            workdaycommon.scrolltoElement(closeposChangeJob);
            if (closeposChangeJob.isDisplayed()) {
                closeposChangeJob.click();
                workdaycommon.userWait(3000);
                log.info("Close tab is present");
            }
        } catch (org.openqa.selenium.NoSuchElementException e) {
            log.info("Close tab is not present");
        }

//        WebActionsUtil.explicitWait(driver, editjobprofileChangeJob, "click");
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(editjobprofileChangeJob);
        editjobprofileChangeJob.click();
        log.info("Clicked on Change job profile field");
        workdaycommon.userWait(3000);
        enterjobprofileChangeJob.click();
        log.info("Clicked on the list icon inside job profile field");
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(JC_JobProfile, Keys.ENTER);
        //workdaycommon.selectfromduplicates(JobProfile);
        log.info("Keyed in the job profile and clicked enter");
        //workdaycommon.userWait(3000);
        //jobProfileSelection.click();
        //log.info("selected teh new job profile");
        workdaycommon.userWait(2000);
        btnnextChangeJob.click();
        //Entering Location details
        log.info("Entering Location details");
        WebElement element_location = driver.findElement(By.xpath("//h3[text()='Location Details']//following::div[@data-automation-id='actionImage' and @title='Edit Location Details']"));
        JavascriptExecutor executor_location = (JavascriptExecutor) driver;
        executor_location.executeScript("arguments[0].click();", element_location);
//         workdaycommon.scrolltoElement(editlocationdetailsChangeJob);
//         editlocationdetailsChangeJob.click();
        workdaycommon.userWait(3000);
        locationdetailsChangeJob.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Location, Keys.TAB);
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
        workdaycommon.userWait(2000);
        //Entering administrative details


        workdaycommon.userWait(9000);
        log.info("Entering administrative details");
        workdaycommon.scrolltoElement(editadmindetailsChangeJob);
        workdaycommon.userWait(5000);
        editadmindetailsChangeJob.click();
        workdaycommon.userWait(3000);
        employeetypeChangeJob.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(EmpType, Keys.ENTER);
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(timetypeChangeJob);
        timetypeChangeJob.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys("Full Time", Keys.TAB);
        workdaycommon.userWait(1000);


        workdaycommon.scrolltoElement(btnnextChangeJob);
        btnnextChangeJob.click();
        log.info("Entering Organization Details");

        //If needed Uncomment it
        editCompanyChangeJob.click();
        workdaycommon.userWait(3000);
        enterCompanyChangeJob.click();
        workdaycommon.userWait(3000);
//        insidesearchboxcommon.sendKeys(Company,Keys.ENTER);
        insidesearchboxcommon.sendKeys("1019 HOME DEPOT CANADA, INC.",Keys.ENTER);
        workdaycommon.userWait(3000);

//        editCompanyChangeJob.click();
//        workdaycommon.userWait(9000);
//        enterCompanyChangeJob.click();
//        workdaycommon.userWait(3000);
//        insidesearchboxcommon.sendKeys(Company,Keys.ENTER);
//        workdaycommon.userWait(5000);

        workdaycommon.scrolltoElement(editButtonCostcenterChangeJob);
        editButtonCostcenterChangeJob.click();
        workdaycommon.userWait(2000);
//        editCostcenterChangeJob.click();
//        workdaycommon.userWait(2000);
        enterCostcenterChangeJob.click();

        workdaycommon.userWait(3000);
//        insidesearchboxcommon.clear();
        insidesearchboxcommon.sendKeys(CostCenter,Keys.ENTER);
        workdaycommon.userWait(3000);

//For US:Uncomment
//        workdaycommon.scrolltoElement(editBusinessUnitChangeJob);
//        editBusinessUnitChangeJob.click();
//        workdaycommon.userWait(3000);
//        enterBusinessUnitChangeJob.click();
//        workdaycommon.userWait(3000);
//        insidesearchboxcommon.sendKeys("SDS US SOUTHERN DIVISION STORE ASSOCIATE",Keys.ENTER);
//        workdaycommon.userWait(3000);


        workdaycommon.scrolltoElement(editDepartmentChangeJob);
        editDepartmentChangeJob.click();
        workdaycommon.userWait(2000);
        enterDepartmentChangeJob.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Constants.DEPARTMENTHIREEMP,Keys.ENTER);
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
        workdaycommon.userWait(2000);

        log.info("Enter Compensation Details");
        workdaycommon.userWait(4000);
        try {
            workdaycommon.scrolltoElement(headerSalaryChangeJob);
            log.info("Entering Salary component");
            if (editsalaryChangeJob.isDisplayed())
            {
                // WebActionsUtil.handleAlert(driver);
                //Entering Salary details
                log.info("Entering Salary component");
                editsalaryChangeJob.click();
                workdaycommon.userWait(3000);
                //amountChangeJob.clear();
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                workdaycommon.userWait(3000);
                amountChangeJob.sendKeys(Amount, Keys.TAB);
                workdaycommon.userWait(3000);

             /*   workdaycommon.scrolltoElement(currencyChangeJob);
                currencyChangeJob.click();
                //insidesearchboxcommon.sendKeys("CAD", Keys.TAB);
                insidesearchboxcommon.sendKeys("USD", Keys.TAB);
                log.info("Currency Entered"); */

                    /*
           { workdaycommon.scrolltoElement(frequencyChangeJob);
            frequencyChangeJob.click();
            insidesearchboxcommon.sendKeys(Constants.FREQUENCYCHANGEJOB, Keys.TAB);
            log.info("frequency Entered");
           workdaycommon.userWait(5000);
      }
*/
            }
        }
//           catch (java.util.NoSuchElementException e) {
        catch (Exception e) {

            log.info("Entering Hourly component");
            // workdaycommon.userWait(3000);
            workdaycommon.scrolltoElement(headerHourlyChangeJob);
            workdaycommon.userWait(4000);
            //log.info("Click on edit Hourly row");
            workdaycommon.scrolltoElement(edithourlyChangeJob);
            workdaycommon.userWait(3000);
            edithourlyChangeJob.click();
            log.info("Edit Hourly row Clicked");
            workdaycommon.userWait(4000);
            amountChangeJob.sendKeys(Keys.BACK_SPACE);
            log.info("Checking 1st back hit");
            amountChangeJob.sendKeys(Keys.BACK_SPACE);
            amountChangeJob.sendKeys(Keys.BACK_SPACE);
            amountChangeJob.sendKeys(Keys.BACK_SPACE);
            amountChangeJob.sendKeys(Keys.BACK_SPACE);
            amountChangeJob.sendKeys(Keys.BACK_SPACE);
            amountChangeJob.sendKeys(Keys.BACK_SPACE);
            amountChangeJob.sendKeys(Keys.BACK_SPACE);
            log.info("Checking 1ast back hit");
            workdaycommon.userWait(5000);
            amountChangeJob.sendKeys(String.valueOf(Amount), Keys.TAB);
            log.info("Checking send keys Tab amount job change");
            workdaycommon.userWait(2000);
            percentChange.sendKeys(Keys.TAB);
            log.info("Checking send keys Tab percent change");
            workdaycommon.scrolltoElement(currencyChangeJob);
            workdaycommon.userWait(3000);
            currencyChangeJob.click();
            log.info("Clicked on Currency");
            currencyChangeJob.clear();
            workdaycommon.userWait(2000);
            insidesearchboxcommon.sendKeys("CAD", Keys.TAB);
            //insidesearchboxcommon.sendKeys("USD", Keys.TAB);
            log.info("Currency Entered");
            workdaycommon.userWait(5000);


         /*//uncomment only when needed
            workdaycommon.scrolltoElement(frequencyChangeJob);
            frequencyChangeJob.click();
            insidesearchboxcommon.sendKeys(Constants.FREQUENCYCHANGEJOB, Keys.TAB);
            log.info("frequency Entered");
            workdaycommon.userWait(5000);
         */

        }
        btnnextChangeJob.click();
        log.info("Clicked on Next");
        workdaycommon.userWait(2000);
        // workdaycommon.scroll();
        workdaycommon.scrolltoElement(btnsubmitChangeJob);
        workdaycommon.userWait(1000);
        btnsubmitChangeJob.click();
        workdaycommon.userWait(4000);
        try {
            if (btnsubmitChangeJob.isDisplayed()) {
                btnsubmitChangeJob.click();
                workdaycommon.userWait(4000);
                log.info("Alert Available....");
            }
        } catch (Exception e) {
            log.info("Alert Not Available....");
        }

        //linkdetailsChangeJob.click();
        //   workdaycommon.userWait(3000);
        //   processTabChangeJob.click();
        workdaycommon.userWait(3000);
        processtabJC(Employee);
        log.info("Searching upto process tab....");
        try {
            int k = 10;
            while (k > 1) {
                log.info("Increased Counter--->" + k);
                JobChangeawaiting_action(Employee);
                System.out.println("A part of awaiting action is done.......");
                processtabJC(Employee);
                k--;

            }
            log.info("stopped here 3--->" + k);
            //   ValidateAwaitingActionCheck(Employee);
        } catch (Exception e) {
            System.out.println("Running in Catch Block.........");
            //workdaycommon.gotoWorkdayHomepage();
            ValidateAwaitingActionCheck(Employee);
        }
    }


    public void processtabJC(String Employee) throws Exception {
        workdaycommon.stopProxy();
        workdaycommon.startProxy(Constants.BP_Admin);
        workdaycommon.userWait(2000);
        log.info("Checking in Process tab...RL.");
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);

//        WebActionsUtil.explicitWait(driver, allOfWorkday, "click");
        workdaycommon.scrolltoElement(allOfWorkday);
        allOfWorkday.click();
        workdaycommon.userWait(3000);
        log.info("All of Workday is clicked...");
        workdaycommon.userWait(1000);
//        workdaycommon.scrollDOWN_height();
//        log.info("Scrolled Down");
//        workdaycommon.userWait(3000);
        WebElement EmployeenamerJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));
//        WebElement EmployeenamerJC = driver.findElement(By.xpath("(//div[text()='Change Job'])[1]//preceding::div[@data-automation-id='promptOption' and contains(text(),'"+Employee+"')][1]"));
//        workdaycommon.userWait(3000);
//        WebActionsUtil.explicitWait(driver, EmployeenamerJC, "click");
        workdaycommon.scrolltoElement(EmployeenamerJC);
//        workdaycommon.scroll();
        workdaycommon.userWait(1000);
        EmployeenamerJC.click();
        workdaycommon.userWait(3000);
        processtabJobChange.click();
        workdaycommon.userWait(3000);
        workdaycommon.scroll();
        log.info("Clicked on Employee..RL..");
    }

    public void JobChangeawaiting_action(String Employee) throws Exception {

        if (workdaycommon.labelawaitingaction.isDisplayed()) {
            log.info(".......Checking for any Awaiting Action .......");
            log.info("Awaiting Action Counting Started.......");
            List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
            int count = labelAwaitingaction.size();
            log.info("Count----->" + count);
            for (int i = 1; i <= count; i++) {
                log.info("Awaiting Action____1......." + i);
//                String Approver_name = workdaycommon.awaitingAction(i);
//                StringBuilder proxyperson = new StringBuilder(Approver_name);
//                //     proxyperson.delete(Approver_name.length() - 1, Approver_name.length());
//                workdaycommon.userWait(3000);
                log.info(".......Proxying started.......");
                //workdaycommon.simplestartProxy(proxyperson.toString());


                try {
                    WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
                    Threedots.click();
                    workdaycommon.scrolltoElement(securityProfile);
                    workdaycommon.mousemove(securityProfile, startProxyFromAssociateName);
                    workdaycommon.userWait(1000);
                    startProxyFromAssociateName.click();
                    btnOKChangeJob.click();
                    workdaycommon.userWait(2000);
                    log.info(".......Proxy successful.......");
                }catch(org.openqa.selenium.NoSuchElementException e) {
                    log.info("Proxying to the same person");
                }


                workdaycommon.userWait(4000);
                log.info("Clicking on Homepage of proxy employee......");
                workdaycommon.gotoWorkdayHomepage();
                workdaycommon.userWait(3000);
                log.info(" Started to perform inbox action in proxy person.......");
                workdaycommon.inboxWD.click();
                workdaycommon.userWait(2000);
                try {
                    WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Transfer: " + Employee + "')]"));
                    // WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));
                    workdaycommon.scrolltoElement(inboxTextJC);
                    inboxTextJC.click();
                    workdaycommon.userWait(2000);
                    log.info("Email Title has transfer");
                }
                catch(Exception e) {
                    log.info("Email Title doesn't has transfer");
                }

                try {
                    WebElement inboxWagesTextJC = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Wage Theft Prevention Notice Review: "+Employee+"')]"));
                    // WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));
                    workdaycommon.scrolltoElement(inboxWagesTextJC);
                    inboxWagesTextJC.click();
                    workdaycommon.userWait(2000);
                    log.info("Selected Wages Email");
                }
                catch(Exception e) {
                    log.info("Email Title is different");
                }

                try {
                    if (AgreeCheckbox.isDisplayed()) {
                        log.info("I Agree Checkbox available....");
                        workdaycommon.scrolltoElement(AgreeCheckbox);
                        AgreeCheckbox.click();
                        workdaycommon.userWait(2000);
                    }
                } catch (Exception ex) {
                    log.info("I Agree Checkbox not available....");
                }

                try {
                    if (workdaycommon.inboxbuttonApprove.isDisplayed()) {
                        workdaycommon.inboxbuttonApprove.click();
                        workdaycommon.userWait(2000);
                        workdaycommon.inboxbuttonSubmit.click();
                        workdaycommon.userWait(2000);
                        btndoneJC.click();
                        workdaycommon.userWait(2000);
                        log.info("Approve button available....");
                    }
                } catch (Exception e) {
                    workdaycommon.inboxbuttonSubmit.click();
                    workdaycommon.userWait(2000);
                    btndoneJC.click();
                    workdaycommon.userWait(2000);
                    log.info("Only Submit button available....");
                }
                log.info("Approval done Successfully.......");
            }
            log.info(".......Process Completed with Approval.........");
            workdaycommon.gotoWorkdayHomepage();
        }

    }

    public void ValidateAwaitingActionCheck(String Employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(2000);

        String overallStatus = overallStatusJobChange.getText();
        log.info("---------overallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);
        workdaycommon.scroll();
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (checkAwaitingAction.isDisplayed()) {
                    log.info("Job Change not Completed Successfully........");
                    test.fail("Job Change not Completed Successfully........");
                    driver.quit();
                }
            } catch (Exception e) {
                test.pass("Job Change Completed Successfully for Employee name :" + Employee);
                log.info("Job Change Completed Successfully........");
            }
        } else {
            log.info("Job Change not Completed Successfully........Current Status: " + overallStatus);
            test.fail("Job Change not Completed Successfully.......Current Status: " + overallStatus);
            driver.quit();
        }
    }


    public void JobchangeLocation(String Employee, String Location, String EffDateLocChange) throws Exception {
        //try {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.entry();
        log.info("Starting with Jobchange location");

        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.scrolltoElement(allOfWorkday);
        workdaycommon.userWait(1000);
        workdaycommon.allOfWorkday.click();
        workdaycommon.userWait(1000);
        WebElement EmpName = driver.findElement(By.xpath("(//*[text()='"+Employee+"']//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'"+Employee+"')][1]"));        EmpName.click();
        workdaycommon.scrolltoElement(EmpName);
        EmpName.click();
        workdaycommon.userWait(1000);
        workdaycommon.clickAction.click();
        workdaycommon.userWait(1000);
        workdaycommon.mousemove(JobchangeLocChangeJob, LocationChangeJob);
        workdaycommon.userWait(5000);

        //Entering Start details
        log.info("Entering Job change start details");
        workdaycommon.scrolltoElement(editStartDetailsChangeJob);
        workdaycommon.userWait(3000);
        editStartDetailsChangeJob.click();
        workdaycommon.userWait(3000);
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date1 = simpleDateFormat.format(new Date());
        if (driverWrapper.isElementPresent(dateToChangeEffect)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(EffDateLocChange);//change it to date1
            }
        }
        makechangeChangeJob.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Constants.JOBCHANGEREASONCHANGEJOB, Keys.ENTER);
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(teamchangeChangeJob);
        teamchangeChangeJob.click();
        workdaycommon.userWait(3000);
        enterteamChangeJob.click(); //uncoment only when needed
        insidesearchboxcommon.sendKeys(Location, Keys.ENTER);
        workdaycommon.userWait(7000);
        workdaycommon.scrolltoElement(btnstartChangeJob);
        btnstartChangeJob.click();
        workdaycommon.userWait(7000);
        log.info("Start button clicked...");

        workdaycommon.scrolltoElement(btnnextChangeJob);
        btnnextChangeJob.click();
        workdaycommon.userWait(5000);
        log.info("Clicked on Next 1");

        workdaycommon.scrolltoElement(btnnextChangeJob);
        btnnextChangeJob.click();
        workdaycommon.userWait(5000);
        log.info("Clicked on Next 2");

        workdaycommon.scrolltoElement(btnnextChangeJob);
        btnnextChangeJob.click();
        log.info("Clicked on Next 3");
        workdaycommon.userWait(3000);
        // workdaycommon.scroll();
        workdaycommon.scrolltoElement(btnsubmitChangeJob);
        workdaycommon.userWait(3000);
        btnsubmitChangeJob.click();
        workdaycommon.userWait(6000);
        log.info("Clicked on Next 4");
        try {
            if (btnsubmitChangeJob.isDisplayed()) {
                btnsubmitChangeJob.click();
                workdaycommon.userWait(6000);
                log.info("Alert Available....");
            }
        } catch (Exception e) {
            log.info("Alert Not Available....");
        }

        workdaycommon.userWait(5000);
        processtabJCLoc(Employee);
        log.info("Searching upto process tab....");
        try {
            int k = 10;
            while (k > 1) {
                log.info("Increased Counter--->" + k);
                JobChangeawaiting_actionLoc(Employee);
                log.info("A part of awaiting action is done.......");
                processtabJCLoc(Employee);
                k--;

            }
            log.info("stopped here 3--->" + k);
            ValidateAwaitingActionCheckLocation(Employee, Location);
        } catch (Exception e) {
            log.info("Running in Catch Block.........");
            //workdaycommon.gotoWorkdayHomepage();
            ValidateAwaitingActionCheckLocation(Employee, Location);
        }
    }

    public void processtabJCLoc(String Employee) throws Exception {
        workdaycommon.userWait(5000);
        log.info("Checking in Process tab...RL.");


        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        WebActionsUtil.explicitWait(driver,allOfWorkday,"click");
        workdaycommon.scrolltoElement(allOfWorkday);
        allOfWorkday.click();
        log.info("All of Workday is clicked");
        workdaycommon.userWait(1000);
//        allOfWorkday.click();
        log.info("All of Workday is clicked");
        workdaycommon.userWait(3000);

//        workdaycommon.scroll();
        workdaycommon.scrollDOWN_height();
        WebElement EmployeenamerJC = driver.findElement(By.xpath("(//div[text()='Change Job'])[1]//preceding::div[@data-automation-id='promptOption' and contains(text(),'"+Employee+"')][1]"));
        workdaycommon.userWait(2000);
        log.info("Clicking on link");
//        WebActionsUtil.explicitWait(driver,EmployeenamerJC,"click");
//        workdaycommon.scrolltoElement(EmployeenamerJC);
//        workdaycommon.userWait(3000);
//        EmployeenamerJC.click();

        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].scroll();", EmployeenamerJC);
        workdaycommon.userWait(1000);
        executor.executeScript("arguments[0].click();", EmployeenamerJC);
        workdaycommon.userWait(2000);
        log.info("Clicked on Job Change");
        workdaycommon.userWait(3000);
        processtabJobChange.click();
        workdaycommon.userWait(1000);
        workdaycommon.scroll();
        log.info("Clicked on Employee..RL..");
    }

    public void JobChangeawaiting_actionLoc(String Employee) throws Exception {

        if (workdaycommon.labelawaitingaction.isDisplayed()) {
            log.info(".......Checking for any Awaiting Action .......");
            List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
            int count = labelAwaitingaction.size();
            log.info("Count----->" + count);
            for (int i = 1; i <= count; i++) {
                log.info("Awaiting Action____1......." + i);
//                String Approver_name = workdaycommon.awaitingAction(i);
//                StringBuilder proxyperson = new StringBuilder(Approver_name);
//                proxyperson.delete(Approver_name.length() - 1, Approver_name.length());
//                workdaycommon.userWait(3000);
//                test.info("Pending Submission/Approval with: " + Approver_name);
                log.info(".......Proxying started.......");
//                workdaycommon.startProxy(proxyperson.toString());
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


                //test.info("Proxy successful to the required role, Proxy to: "+proxyperson);
                log.info("Clicking on Homepage of proxy employee......");
                workdaycommon.gotoWorkdayHomepage();
                workdaycommon.userWait(3000);
                log.info(" Started to perform inbox action in proxy person.......");
                workdaycommon.inboxWD.click();
                workdaycommon.userWait(2000);
                WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Transfer: " + Employee + "')]"));
                // WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));
                workdaycommon.scrolltoElement(inboxTextJC);
                inboxTextJC.click();
                workdaycommon.userWait(2000);

                try {
                    if (CertifyCheckbox.isDisplayed()) {
                        log.info("Checkbox  available....");
                        workdaycommon.scrolltoElement(CertifyCheckbox);
                        CertifyCheckbox.click();
                        workdaycommon.userWait(2000);
                    }
                } catch (Exception e) {
                    log.info("Checkbox not available....");
                }
                try {
                    if (workdaycommon.inboxbuttonApprove.isDisplayed()) {
                        workdaycommon.inboxbuttonApprove.click();
                        workdaycommon.userWait(2000);
                        workdaycommon.inboxbuttonSubmit.click();
                        workdaycommon.userWait(2000);
                        btndoneJC.click();
                        workdaycommon.userWait(2000);
                        log.info("Approve button available....");
                    }
                } catch (Exception e) {
                    workdaycommon.inboxbuttonSubmit.click();
                    workdaycommon.userWait(2000);
                    btndoneJC.click();
                    workdaycommon.userWait(2000);
                    log.info("Only Submit & Done button available....");
                }
                log.info("Approval done Successfully.......");

                test.info("Proxy to BP admin for checking Pending approvals/submissions for the employee: " + Constants.BP_Admin);
                workdaycommon.startProxy(Constants.BP_Admin);

            }
            log.info(".......Process Completed with Approval.........");
            workdaycommon.gotoWorkdayHomepage();

        }

    }

    public void ValidateAwaitingActionCheckLocation(String Employee, String Location) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(2000);
        String overallStatus = overallStatusJobChange.getText();
        log.info("---------overallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);

        workdaycommon.scroll();
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (checkAwaitingAction.isDisplayed()) {
                    log.info("Job Change for Location not Completed Successfully........");
                    test.fail("Job Change for Location not Completed Successfully........");
                }
            } catch (Exception e) {
                test.pass("Job Change for Location Completed Successfully for Employee name :" + Employee + ", Changed Location: " + Location);
                log.info("Job Change for Location Completed Successfully........");
            }
        } else {
            log.info("Job Change not Completed Successfully........Current Status: " + overallStatus);
            test.fail("Job Change not Completed Successfully.......Current Status: " + overallStatus);
        }
    }





    public void Jobchange_Jobprofile(String Employee, String JobProfile, String Amount, String EffectiveDate) throws Exception {
        //try {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.entry();
        log.info("Starting with Jobprofile change");
        test.info("Starting job profile change for the employee.");



        workdaycommon.searchbySearchBox("Change job");
        workdaycommon.userWait(2500);
        linkchangeJob.click(); //clicking on Change job link
        log.info(("Starting with job change . . .. . . "));
        workernameChangeJob.click(); //Entering worker's/employee name for whom the job to be changed
        workdaycommon.userWait(1000);

        // String name = this.FNAMECREATEPREHIRE1+ " " + this.LNAMECREATEPREHIRE1;
        // log.info("name--->" +name);

        insidesearchboxcommon.sendKeys(Employee, Keys.ENTER);
        workdaycommon.userWait(3000);
        //   workdaycommon.selectfromduplicates(Employee); // Selecting values from duplicates
        log.info("Entering Worker name");
        workdaycommon.userWait(3000);
        btnOKChangeJob.click();
        //Entering Start details
        log.info("Entering Job change start details");
        workdaycommon.scrolltoElement(editStartDetailsChangeJob);
        workdaycommon.userWait(3000);
        editStartDetailsChangeJob.click();
        workdaycommon.userWait(3000);
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date1 = simpleDateFormat.format(new Date());
        if (driverWrapper.isElementPresent(dateToChangeEffect)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(EffectiveDate);//change it to date1
            }
        }
        WebActionsUtil.explicitWait(driver, makechangeChangeJob, "click");
        makechangeChangeJob.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Constants.JOBCHANGEREASONCHANGEJOB, Keys.ENTER);
        //workdaycommon.scroll();
        workdaycommon.userWait(3000);
        workdaycommon.userWait(4000);
        WebActionsUtil.explicitWait(driver, btnstartChangeJob, "click");
        btnstartChangeJob.click();

        //Entering Job profile details
        log.info("Entering Job profile details");
        workdaycommon.userWait(3000);
        try {
            changeJobUpArrow.click();
            log.info("clicked on the arrow");
        } catch (NoSuchElementException e) {
            log.info("No arrow to Click");
        }

        WebActionsUtil.explicitWait(driver, editposition_JC, "click");
        workdaycommon.scrolltoElement(editposition_JC);
        editposition_JC.click();
        log.info("Clicked on edit position");
        workdaycommon.userWait(2000);

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", createnewPositionCHKBOX_JC);
        workdaycommon.userWait(2000);
        executor.executeScript("arguments[0].click();", closecurrentPositionCHKBOX_JC);
        workdaycommon.userWait(2000);

        WebActionsUtil.explicitWait(driver, editjobprofileChangeJob, "click");
        workdaycommon.scrolltoElement(editjobprofileChangeJob);
        editjobprofileChangeJob.click();
        log.info("Clicked on Change job profile field");
        workdaycommon.userWait(2000);
        enterjobprofileChangeJob.click();
        log.info("Clicked on the list icon inside job profile field");
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(JobProfile, Keys.ENTER);
        //workdaycommon.selectfromduplicates(JobProfile);
        log.info("Keyed in the job profile and clicked enter");
        workdaycommon.userWait(7000);
        btnnextChangeJob.click();
        log.info("job details page");
        workdaycommon.userWait(2000);
        btnnextChangeJob.click();
        log.info("location details page");
        workdaycommon.userWait(2000);
        btnnextChangeJob.click();
        log.info("administrative details page");
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(editDepartmentChangeJob);
        editDepartmentChangeJob.click();
        workdaycommon.userWait(2000);
//        DepartmentChangeJob.click();
//        workdaycommon.userWait(2000);
        enterDepartmentChangeJob.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Constants.DEPARTMENTHIREEMP,Keys.ENTER);
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
        log.info("organisation details page");
        workdaycommon.userWait(2000);

        log.info("Enter Compensation Details");
        workdaycommon.userWait(9000);
            try {
                workdaycommon.scrolltoElement(headerSalaryChangeJob);

//                if(editsalaryChangeJob.isDisplayed()) {
//                    // WebActionsUtil.handleAlert(driver);
//                    //Entering Salary details
                    log.info("Entering Salary component");
                    editsalaryChangeJob.click();
                    workdaycommon.userWait(3000);
                    //amountChangeJob.clear();
                    amountChangeJob.sendKeys(Keys.BACK_SPACE);
                    amountChangeJob.sendKeys(Keys.BACK_SPACE);
                    amountChangeJob.sendKeys(Keys.BACK_SPACE);
                    amountChangeJob.sendKeys(Keys.BACK_SPACE);
                    amountChangeJob.sendKeys(Keys.BACK_SPACE);
                    amountChangeJob.sendKeys(Keys.BACK_SPACE);
                    amountChangeJob.sendKeys(Keys.BACK_SPACE);
                    amountChangeJob.sendKeys(Keys.BACK_SPACE);
                    amountChangeJob.sendKeys(Keys.BACK_SPACE);
                    workdaycommon.userWait(5000);
                    amountChangeJob.sendKeys(Amount, Keys.ENTER);
                    workdaycommon.userWait(3000);

                    btnnextChangeJob.click();
                    log.info("compensation details page");
//                }
            }

           catch (Exception e) {
                log.info("The exception is "+e.getStackTrace());
                log.info("Entering Hourly component");
                // workdaycommon.userWait(3000);
                workdaycommon.scrolltoElement(headerHourlyChangeJob);
                workdaycommon.userWait(9000);
                log.info("Click on edit Hourly row");
                workdaycommon.scrolltoElement(edithourlyChangeJob);
                workdaycommon.userWait(3000);
                edithourlyChangeJob.click();
                log.info("Edit Hourly row Clicked");
                workdaycommon.userWait(9000);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                log.info("Checking 1st back hit");
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                amountChangeJob.sendKeys(Keys.BACK_SPACE);
                log.info("Checking 1ast back hit");
                workdaycommon.userWait(5000);
                amountChangeJob.sendKeys(String.valueOf(Amount), Keys.ENTER);
                log.info("Checking send keys Tab amount job change");

//                *****************************uncomment the following lines if needed************************
//                workdaycommon.userWait(2000);
//                percentChange.sendKeys(Keys.ENTER);
//                log.info("Checking send keys Tab percent change");
//                workdaycommon.scrolltoElement(currencyChangeJob);
//                workdaycommon.userWait(3000);
//                currencyChangeJob.click();
//                log.info("Clicked on Currency");
//                currencyChangeJob.clear();
//                workdaycommon.userWait(2000);
//                insidesearchboxcommon.sendKeys("CAD", Keys.TAB);
//                //insidesearchboxcommon.sendKeys("USD", Keys.TAB);
//                log.info("Currency Entered");
//                workdaycommon.userWait(5000);
//                                      ******************************************

                btnnextChangeJob.click();
                log.info("compensation details page");

            }

        try {
            workdaycommon.scrolltoElement(btnnextChangeJob);
            if (btnnextChangeJob.isDisplayed()) {
                btnnextChangeJob.click();
                log.info("Next Button Is Available....");
            }

        } catch (Exception e) {
            log.info("Next Button Is Not Available....");
        }

        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(btnsubmitChangeJob);
        workdaycommon.userWait(2000);
        btnsubmitChangeJob.click();

        workdaycommon.userWait(2000);
        try {
            if (btnsubmitChangeJob.isDisplayed()) {
                btnsubmitChangeJob.click();
                workdaycommon.userWait(6000);
                log.info("Alert Available....");
            }
        } catch (Exception e) {
            log.info("Alert Not Available....");
        }

        //linkdetailsChangeJob.click();
        //   workdaycommon.userWait(3000);
        //   processTabChangeJob.click();
        workdaycommon.userWait(5000);
        processtabJCProfile(Employee);
        log.info("Searching upto process tab....");
        try {
            int k = 10;
            while (k > 1) {
                log.info("Increased Counter--->" + k);
                JobProfileChangeawaiting_action(Employee);
                System.out.println("A part of awaiting action is done.......");
                processtabJCProfile(Employee);
                k--;

            }
            log.info("stopped here 3--->" + k);
            ValidateAwaitingActionCheckJCProfile(Employee);
        } catch (Exception e) {
            System.out.println("Running in Catch Block.........");
            //workdaycommon.gotoWorkdayHomepage();
            ValidateAwaitingActionCheckJCProfile(Employee);
        }
    }


    public void processtabJCProfile(String Employee) throws Exception {
        workdaycommon.stopProxy();
        workdaycommon.startProxy(Constants.BP_Admin);
        workdaycommon.userWait(5000);
        workdaycommon.gotoWorkdayHomepage();
        log.info("Checking in Process tab...RL.");
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(allOfWorkday);
        allOfWorkday.click();
        workdaycommon.userWait(2000);
//        allOfWorkday.click();
//        workdaycommon.userWait(9000);
//        workdaycommon.userWait(9000);
//        workdaycommon.userWait(9000);
        WebElement EmployeenamerJC = driver.findElement(By.xpath("(//div[text()='Change Job'])[1]//preceding::div[@data-automation-id='promptOption' and contains(text(),'"+Employee+"')][1]"));
//        WebElement EmployeenamerJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: " + Employee + "' and contains(text(),'Transfer: " + Employee + "')]"));
        workdaycommon.userWait(3000);
        WebActionsUtil.explicitWait(driver, EmployeenamerJC, "click");
        workdaycommon.scrolltoElement(EmployeenamerJC);
        workdaycommon.userWait(1000);
        EmployeenamerJC.click();
        workdaycommon.userWait(3000);
        processtabJobChange.click();
        workdaycommon.userWait(5000);
        workdaycommon.scroll();
        log.info("Clicked on Employee..RL..");
    }

    public void JobProfileChangeawaiting_action(String Employee) throws Exception {

        if (workdaycommon.labelawaitingaction.isDisplayed()) {
            workdaycommon.scrolltoElement(workdaycommon.labelawaitingaction);
            log.info(".......Checking for any Awaiting Action .......");
            log.info("Awaiting Action Counting Started.......");
            List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
            int count = labelAwaitingaction.size();
            log.info("Count----->" + count);
            for (int i = 1; i <= count; i++) {
                log.info("Awaiting Action____1......." + i);

//                String Approver_name = workdaycommon.awaitingAction(i);
//                StringBuilder proxyperson = new StringBuilder(Approver_name);
//                proxyperson.delete(Approver_name.length() - 1, Approver_name.length());
//                workdaycommon.startProxy(proxyperson.toString());
//                workdaycommon.userWait(4000);
//                log.info(".......Proxy successful.......");

//                workdaycommon.scrolltoElement(workdaycommon.homepageWD);
//                String Onbehalfof = driver.findElement(By.xpath("//span[contains(text(),'On behalf of: ')]")).getText();
//                log.info(Onbehalfof);
//                String[] Proxy = Onbehalfof.split(":");
//                String first = Proxy[0];
//                String name = Proxy[1];
//                log.info("Before splitting: " + first + "" + name);
//                StringBuilder ExistingProxy = new StringBuilder(name);
//                ExistingProxy.delete(0, 1);//Deleting space before name
//                String ProxyExists = ExistingProxy.toString();
//                log.info("Existing Proxy is " + ProxyExists);

//                workdaycommon.scrolltoElement(awaitingAction);
//                String NewProxy = driver.findElement(By.xpath("//div[text()='Awaiting Action']//following::div[@data-automation-id='promptOption'][1]")).getText();
//
//                log.info(ProxyExists);
//                log.info(NewProxy);
//                if (ProxyExists.equals(NewProxy)) {
//                    log.info(".......Proxy already exist.......");
//                }
//                else{
//                    WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
//                    workdaycommon.scrolltoElement(Threedots);
//                    Threedots.click();
//                    workdaycommon.scrolltoElement(securityProfile);
//                    workdaycommon.mousemove(securityProfile, startProxyFromAssociateName);
//                    workdaycommon.userWait(1000);
//                    startProxyFromAssociateName.click();
//                    btnOKChangeJob.click();
//                    workdaycommon.userWait(3000);
//                    log.info(".......Proxy successful.......");
//                }


                //                log.info(".......Proxy successful.......");

//                workdaycommon.scrolltoElement(workdaycommon.homepageWD);
//                String Onbehalfof = driver.findElement(By.xpath("//span[contains(text(),'On behalf of: ')]")).getText();
//                log.info(Onbehalfof);
//                String[] Proxy = Onbehalfof.split(":");
//                String first = Proxy[0];
//                String name = Proxy[1];
//                log.info("Before splitting: " + first + "" + name);
//                StringBuilder ExistingProxy = new StringBuilder(name);
//                ExistingProxy.delete(0, 1);//Deleting space before name
//                String ProxyExists = ExistingProxy.toString();
//                log.info("Existing Proxy is " + ProxyExists);
//
//                workdaycommon.scrolltoElement(awaitingAction);
//                String NewProxy = driver.findElement(By.xpath("//div[text()='Awaiting Action']//following::div[@data-automation-id='promptOption'][1]")).getText();
//
//                log.info(ProxyExists);
//                log.info(NewProxy);
//                if (ProxyExists.equals(NewProxy)) {
//                    log.info(".......Proxy already exist.......");
//                }
//                else {

                try {
                    WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
                    Threedots.click();
                    workdaycommon.scrolltoElement(securityProfile);
                    workdaycommon.mousemove(securityProfile, startProxyFromAssociateName);
                    workdaycommon.userWait(1000);
                    startProxyFromAssociateName.click();
                    btnOKChangeJob.click();
                    workdaycommon.userWait(2000);
                    log.info(".......Proxy successful.......");
                }catch(org.openqa.selenium.NoSuchElementException e) {
                    log.info("Proxying to the same person");
                }
// }
                log.info("Clicking on Homepage of proxy employee......");
                workdaycommon.gotoWorkdayHomepage();
                workdaycommon.userWait(3000);
                log.info(" Started to perform inbox action in proxy person.......");
                workdaycommon.inboxWD.click();
                workdaycommon.userWait(2000);
                try {
                    WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Transfer: " + Employee + "')]"));
                    // WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));
                    workdaycommon.scrolltoElement(inboxTextJC);
                    inboxTextJC.click();
                    workdaycommon.userWait(2000);
                    log.info("Email Title has transfer");
                }
                catch(Exception e) {
                    log.info("Email Title doesn't has transfer");
                }

                try {
                    WebElement inboxWagesTextJC = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Wage Theft Prevention Notice Review: "+Employee+"')]"));
                    // WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));
                    workdaycommon.scrolltoElement(inboxWagesTextJC);
                    inboxWagesTextJC.click();
                    workdaycommon.userWait(2000);
                    log.info("Selected Wages Email");
                }
                catch(Exception e) {
                    log.info("Email Title is different");
                }

                try {
                    if (AgreeCheckbox.isDisplayed()) {
                        log.info("I Agree Checkbox available....");
                        workdaycommon.scrolltoElement(AgreeCheckbox);
                        AgreeCheckbox.click();
                        workdaycommon.userWait(2000);
                    }
                } catch (Exception ex) {
                    log.info("I Agree Checkbox not available....");
                }

                try {
                    if (workdaycommon.inboxbuttonApprove.isDisplayed()) {
                        workdaycommon.inboxbuttonApprove.click();
                        workdaycommon.userWait(2000);
                        workdaycommon.inboxbuttonSubmit.click();
                        workdaycommon.userWait(2000);
                        btndoneJC.click();
                        workdaycommon.userWait(2000);
                        log.info("Approve button available....");
                    }
                } catch (Exception e) {
                    workdaycommon.inboxbuttonSubmit.click();
                    workdaycommon.userWait(2000);
                    btndoneJC.click();
                    workdaycommon.userWait(2000);
                    log.info("Only Submit button available....");
                }
                log.info("Approval done Successfully.......");
            }
            log.info(".......Process Completed with Approval.........");
            workdaycommon.gotoWorkdayHomepage();
        }

    }

    public void ValidateAwaitingActionCheckJCProfile(String Employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
/*      workdaycommon.searchbySearchBox(Employee);
      workdaycommon.userWait(1000);
      allOfWorkday.click();
      workdaycommon.userWait(1000);
    //  WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Transfer: "+Employee+"')]"));
      WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));

      workdaycommon.userWait(3000);
      workdaycommon.scrolltoElement(Employeename);
      workdaycommon.userWait(1000);
      Employeename.click();
      workdaycommon.userWait(1000);
      processtabJobChange.click();
 */
        workdaycommon.userWait(2000);
        String overallStatus = overallStatusJobChange.getText();
        log.info("---------overallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);

        workdaycommon.scroll();
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (checkAwaitingAction.isDisplayed()) {
                    log.info("Job Change not Completed Successfully........");
                    test.fail("Job Change not Completed Successfully........");
                    driver.quit();
                }
            } catch (Exception e) {
                test.pass("Job Change Completed Successfully for Employee name :" + Employee);
                log.info("Job Change Completed Successfully........");
            }
        } else {
            log.info("Job Change not Completed Successfully........Current Status: " + overallStatus);
            test.fail("Job Change not Completed Successfully.......Current Status: " + overallStatus);
            driver.quit();

        }
    }


    public void Jobchange_Timetype(String Employee,String jobchangedate, String TimeType,String WorkHours) throws Exception {
        //try {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.entry();
        log.info("Starting with Jobchange");
        test.info("Starting job change for the employee.");
        workdaycommon.searchbySearchBox("Change job");
        workdaycommon.userWait(2500);
        linkchangeJob.click(); //clicking on Change job link
        log.info(("Starting with job change . . .. . . "));
        workernameChangeJob.click(); //Entering worker's/employee name for whom the job to be changed
        workdaycommon.userWait(1000);

        // String name = this.FNAMECREATEPREHIRE1+ " " + this.LNAMECREATEPREHIRE1;
        // log.info("name--->" +name);

        insidesearchboxcommon.sendKeys(Employee, Keys.ENTER);
        workdaycommon.userWait(3000);
        //   workdaycommon.selectfromduplicates(Employee); // Selecting values from duplicates
        log.info("Entering Worker name");
        workdaycommon.userWait(3000);
        btnOKChangeJob.click();
        //Entering Start details
        log.info("Entering Job change start details");
        workdaycommon.scrolltoElement(editStartDetailsChangeJob);
        workdaycommon.userWait(3000);
        editStartDetailsChangeJob.click();
        workdaycommon.userWait(3000);
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date1 = simpleDateFormat.format(new Date());
        if (driverWrapper.isElementPresent(dateToChangeEffect)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(jobchangedate);//change it to date1
            }
        }
        WebActionsUtil.explicitWait(driver, makechangeChangeJob, "click");
        makechangeChangeJob.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Constants.JOBCHANGEREASONCHANGEJOB, Keys.ENTER);
        //workdaycommon.scroll();
        workdaycommon.userWait(3000);
        WebActionsUtil.explicitWait(driver, btnstartChangeJob, "click");
        btnstartChangeJob.click();
//------------------------Page-1------------------------

        //Job profile details
        log.info("In Profile details page");
        workdaycommon.userWait(5000);
        btnnextChangeJob.click();
//------------------------Page-2------------------------

        //Entering Location details
        log.info("In Location details page");
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(editlocationDetailsChangeJob);
        editlocationDetailsChangeJob.click();
        log.info("Clicked on edit hours button");
        workdaycommon.userWait(2000);
        enterScheduledWeeklyHours.click();
        workdaycommon.userWait(1000);
        enterScheduledWeeklyHours.sendKeys(Keys.BACK_SPACE);
        enterScheduledWeeklyHours.sendKeys(Keys.BACK_SPACE);
        enterScheduledWeeklyHours.sendKeys(WorkHours, Keys.TAB);
        workdaycommon.userWait(2000);
        btnnextChangeJob.click();
//------------------------Page-3------------------------

        //Entering Administrative details
        log.info("In Administrative details page");
        workdaycommon.userWait(2000);
        log.info("Entering administrative details");
        workdaycommon.scrolltoElement(editadmindetailsChangeJob);
        workdaycommon.userWait(2000);
        editadmindetailsChangeJob.click();
        log.info("Clicked on edit button");

        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(timetypeChangeJob);
        timetypeChangeJob.click();
        log.info("Clicked on edit time type button");
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(TimeType, Keys.TAB);
        workdaycommon.userWait(2000);

        workdaycommon.scrolltoElement(defaultweeklyhoursChangeJob);
        defaultweeklyhoursChangeJob.click();
        log.info("Clicked on edit hours button");
        defaultweeklyhoursChangeJob.sendKeys(Keys.BACK_SPACE);
        defaultweeklyhoursChangeJob.sendKeys(Keys.BACK_SPACE);
        defaultweeklyhoursChangeJob.sendKeys(WorkHours, Keys.TAB);
        workdaycommon.userWait(2000);

        workdaycommon.scrolltoElement(btnnextChangeJob);
        btnnextChangeJob.click();
//------------------------Page-4------------------------

        //Entering Organisation details
        log.info("In Organisation details page");
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
//------------------------Page-5------------------------

        //Entering Compensation details
        log.info("In Compensation details page");
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
//------------------------Page-6------------------------


        workdaycommon.scrolltoElement(btnsubmitChangeJob);
        workdaycommon.userWait(1000);
        btnsubmitChangeJob.click();
        workdaycommon.userWait(4000);
        try {
            if (btnsubmitChangeJob.isDisplayed()) {
                btnsubmitChangeJob.click();
                workdaycommon.userWait(4000);
                log.info("Alert Available....");
            }
        } catch (Exception e) {
            log.info("Alert Not Available....");
        }

        //linkdetailsChangeJob.click();
        //   workdaycommon.userWait(3000);
        //   processTabChangeJob.click();
        workdaycommon.userWait(1000);
        processtabJCTimeType(Employee);
        log.info("Searching upto process tab....");
        try {
            int k = 10;
            while (k > 1) {
                log.info("Increased Counter--->" + k);
                Job_TimeTypeChangeawaiting_action(Employee);
                System.out.println("A part of awaiting action is done.......");
                processtabJCTimeType(Employee);
                k--;

            }
            log.info("stopped here 3--->" + k);
            //   ValidateAwaitingActionCheck(Employee);
        } catch (Exception e) {
            System.out.println("Running in Catch Block.........");
            //workdaycommon.gotoWorkdayHomepage();
            ValidateAwaitingActionCheckJCTimeType(Employee);
        }
    }


    public void processtabJCTimeType(String Employee) throws Exception {
        workdaycommon.userWait(2000);
        log.info("Checking in Process tab...RL.");
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(allOfWorkday);
        allOfWorkday.click();
        workdaycommon.userWait(3000);
        allOfWorkday.click();
        workdaycommon.userWait(3000);

//        WebElement EmployeenamerJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: " + Employee + "' and contains(text(),'Transfer: " + Employee + "')]"));
        workdaycommon.userWait(3000);
        WebElement EmployeenamerJC = driver.findElement(By.xpath("(//div[text()='Change Job'])[1]//preceding::div[@data-automation-id='promptOption' and contains(text(),'"+Employee+"')][1]"));
        WebActionsUtil.explicitWait(driver, EmployeenamerJC, "click");
        workdaycommon.scrolltoElement(EmployeenamerJC);
        workdaycommon.userWait(1000);
        EmployeenamerJC.click();
        workdaycommon.userWait(3000);
        processtabJobChange.click();
        workdaycommon.userWait(3000);
        workdaycommon.scroll();
        log.info("Clicked on Employee..RL..");
    }

    public void Job_TimeTypeChangeawaiting_action(String Employee) throws Exception {

        if (workdaycommon.labelawaitingaction.isDisplayed()) {
            log.info(".......Checking for any Awaiting Action .......");
            log.info("Awaiting Action Counting Started.......");
            List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
            int count = labelAwaitingaction.size();
            log.info("Count----->" + count);
            for (int i = 1; i <= count; i++) {
                log.info("Awaiting Action____1......." + i);

//                String Approver_name = workdaycommon.awaitingAction(i);
//                StringBuilder proxyperson = new StringBuilder(Approver_name);
//                proxyperson.delete(Approver_name.length() - 1, Approver_name.length());
//                workdaycommon.simplestartProxy(proxyperson.toString());
//                workdaycommon.userWait(4000);

                WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
                Threedots.click();
                workdaycommon.scrolltoElement(securityProfile);
                workdaycommon.mousemove(securityProfile,startProxyFromAssociateName);
                workdaycommon.userWait(1000);
                startProxyFromAssociateName.click();
                btnOKChangeJob.click();
                workdaycommon.userWait(3000);
                log.info(".......Proxy successful.......");

                log.info("Clicking on Homepage of proxy employee......");
                workdaycommon.gotoWorkdayHomepage();
                workdaycommon.userWait(3000);
                log.info(" Started to perform inbox action in proxy person.......");
                workdaycommon.inboxWD.click();
                workdaycommon.userWait(2000);
                WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Transfer: " + Employee + "')]"));
                // WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));
                workdaycommon.scrolltoElement(inboxTextJC);
                inboxTextJC.click();
                workdaycommon.userWait(2000);
                try {
                    if (workdaycommon.inboxbuttonApprove.isDisplayed()) {
                        workdaycommon.inboxbuttonApprove.click();
                        workdaycommon.userWait(2000);
                        workdaycommon.inboxbuttonSubmit.click();
                        workdaycommon.userWait(2000);
                        btndoneJC.click();
                        workdaycommon.userWait(2000);
                        log.info("Approve button available....");
                    }
                } catch (Exception e) {
                    workdaycommon.inboxbuttonSubmit.click();
                    workdaycommon.userWait(2000);
                    btndoneJC.click();
                    workdaycommon.userWait(2000);
                    log.info("Only Submit button available....");
                }
                log.info("Approval done Successfully.......");
            }
            log.info(".......Process Completed with Approval.........");
            workdaycommon.gotoWorkdayHomepage();
        }
    }

    public void ValidateAwaitingActionCheckJCTimeType(String Employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(2000);
        String overallStatus = overallStatusJobChange.getText();
        log.info("---------overallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);

        workdaycommon.scroll();
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (checkAwaitingAction.isDisplayed()) {
                    log.info("Job Change not Completed Successfully........");
                    test.fail("Job Change not Completed Successfully........");
                    driver.quit();
                }
            } catch (Exception e) {
                test.pass("Job Change Completed Successfully for Employee name :" + Employee);
                log.info("Job Change Completed Successfully........");
            }
        } else {
            log.info("Job Change not Completed Successfully........Current Status: " + overallStatus);
            test.fail("Job Change not Completed Successfully.......Current Status: " + overallStatus);
            driver.quit();
        }
    }

    public void ChangeBusinessTitle(String Employee,String jobchangedate,String ProposedBusinessTitle) throws Exception {

        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.entry();
        log.info("Starting with ChangeBusinessTitle");
        test.info("Starting with ChangeBusinessTitle of an employee");
        workdaycommon.scrolltoElement(jobChange_ChangeBusinesstitle);
        workdaycommon.Perfrom_employeeActions(Employee, jobChange_ChangeBusinesstitle, changeBusinesstitle);
        workdaycommon.userWait(3000);
        changeBusinesstitle.click();
        workdaycommon.userWait(3000);
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date1 = simpleDateFormat.format(new Date());
        if (driverWrapper.isElementPresent(effectiveDate)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(jobchangedate);//change it to date1
                elem.sendKeys(Keys.TAB);
                elem.sendKeys(Keys.TAB);
            }
        }
        changeBusinessTitleTextBox.sendKeys(ProposedBusinessTitle, Keys.TAB);
        btnsubmitChangeJob.click();


    }

    //------------------awaiting action code--------------------//

    public void Jobchange_Intern_Perm(String Employee, String JobProfile, String Amount, String EffectiveDate) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.entry();
        log.info("Starting with Jobprofile change");
        test.info("Starting job profile change for the employee.");
        workdaycommon.searchbySearchBox("Change job");
        workdaycommon.userWait(2500);
        linkchangeJob.click(); //clicking on Change job link
        log.info(("Starting with job change . . .. . . "));
        workdaycommon.userWait(4000);
        workdaycommon.scroll();
        workdaycommon.userWait(3000);
        workernameChangeJob.click(); //Entering worker's/employee name for whom the job to be changed
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Employee, Keys.ENTER);
        workdaycommon.userWait(3000);
        log.info("Entering Worker name");
        workdaycommon.userWait(3000);
        btnOKChangeJob.click();
        //Entering Start details
        log.info("Entering Job change start details");
        workdaycommon.scrolltoElement(editStartDetailsChangeJob);
        workdaycommon.userWait(3000);
        editStartDetailsChangeJob.click();
        workdaycommon.userWait(3000);
        workdaycommon.userWait(3000);

        DateChangeJob.sendKeys("06/03/2019");
        workdaycommon.userWait(3000);

        makechangeChangeJob.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Constants.JOBCHANGEREASONINTERN, Keys.ENTER);
        workdaycommon.userWait(3000);
        workdaycommon.userWait(4000);
        WebActionsUtil.explicitWait(driver, btnstartChangeJob, "click");
        btnstartChangeJob.click();


        workdaycommon.userWait(4000);
        btnnextChangeJob.click();
        log.info("job details page");
        workdaycommon.userWait(2000);
        btnnextChangeJob.click();
        log.info("location details page");
        workdaycommon.userWait(2000);

        //Administrative Details Page
        log.info("Entering administrative details");
        workdaycommon.scrolltoElement(editadmindetailsChangeJob);
        workdaycommon.userWait(2000);
        editadmindetailsChangeJob.click();
        log.info("Clicked on edit button");
        workdaycommon.userWait(2000);
//        workdaycommon.scrolltoElement(associatetypeChangeJob);
        associatetypeChangeJob.click();
        log.info("Clicked on edit associate type button");
        workdaycommon.userWait(2000);

        workdaycommon.userWait(2000);
//        workdaycommon.scrolltoElement(associatetypeChangeJob);
        associatetypeChangeJob.click();
        log.info("Clicked on edit associate type button");
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys("Regular Associate");
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Keys.ENTER);
        workdaycommon.userWait(2000);
        btnnextChangeJob.click();
        log.info("administrative details done");
        workdaycommon.userWait(2000);
        btnnextChangeJob.click();
        log.info("organisation details page");
        workdaycommon.userWait(2000);
        btnnextChangeJob.click();
        workdaycommon.userWait(2000);
        workdaycommon.scroll();
        workdaycommon.userWait(2000);
        btnsubmitChangeJob.click();
        workdaycommon.userWait(2000);

    }

    public void Jobchange_Compensation(String Employee,String EffectiveDate, String Salary)throws Exception {
        //try {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.entry();
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(allOfWorkday);
        allOfWorkday.click();
        workdaycommon.userWait(3000);
        //WebElement empName = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and text()='" + Employee + "']"));
        WebElement empName = driver.findElement(By.xpath("//div[contains(text(),'" + Employee + "')]//following::div[text()='Associate']//preceding::div[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));

        workdaycommon.scrolltoElement(empName);
        empName.click();
        workdaycommon.userWait(3000);
        //Manager proxy0
        tabJob.click();
        workdaycommon.userWait(2000);
        workdaycommon.more_dropdownbox(subTabManagerHistory);
        WebElement managerName = driver.findElement(By.xpath("//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]"));
        String ManagerName = managerName.getText();
//        workdaycommon.simplestartProxy(ManagerName);

        test.info("Proxying to Associate's Manager : "+ManagerName);
        WebElement Threedots = driver.findElement(By.xpath("//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]//following::img[1]"));
        Threedots.click();
        workdaycommon.scrolltoElement(securityProfile);
        workdaycommon.mousemove(securityProfile,startProxyFromAssociateName);
        workdaycommon.userWait(1000);
        startProxyFromAssociateName.click();
        btnOKChangeJob.click();
        workdaycommon.userWait(3000);

        test.info("Manager Proxy Successful");
        log.info("Manager Proxy Successful");
        workdaycommon.userWait(2000);


        log.info("Starting with Jobchange");
        test.info("Starting job change for the employee.");
        workdaycommon.searchbySearchBox("Change job");
        workdaycommon.userWait(2500);
        linkchangeJob.click(); //clicking on Change job link
        log.info(("Starting with job change . . .. . . "));
        workernameChangeJob.click(); //Entering worker's/employee name for whom the job to be changed
        workdaycommon.userWait(1000);

        // String name = this.FNAMECREATEPREHIRE1+ " " + this.LNAMECREATEPREHIRE1;
        // log.info("name--->" +name);

        insidesearchboxcommon.sendKeys(Employee, Keys.ENTER);
        workdaycommon.userWait(3000);
        //   workdaycommon.selectfromduplicates(Employee); // Selecting values from duplicates
        log.info("Entering Worker name");
        workdaycommon.userWait(3000);
        btnOKChangeJob.click();
        //Entering Start details
        log.info("Entering Job change start details");
        workdaycommon.scrolltoElement(editStartDetailsChangeJob);
        workdaycommon.userWait(3000);
        editStartDetailsChangeJob.click();
        workdaycommon.userWait(3000);
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date1 = simpleDateFormat.format(new Date());
        if (driverWrapper.isElementPresent(dateToChangeEffect)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(EffectiveDate);//change it to date1
                elem.sendKeys(Keys.TAB);
                elem.sendKeys(Keys.TAB);
            }
        }
        WebActionsUtil.explicitWait(driver, makechangeChangeJob, "click");
//        makechangeChangeJob.click();
        workdaycommon.userWait(3000);
        makechangesearchboxChangeJob.sendKeys(Constants.JOBCHANGEREASONCHANGEJOB, Keys.ENTER);
//        insidesearchboxcommon.sendKeys(Constants.JOBCHANGEREASONCHANGEJOB, Keys.ENTER);
        workdaycommon.scroll();
        workdaycommon.userWait(3000);
        WebActionsUtil.explicitWait(driver, btnstartChangeJob, "click");
        btnstartChangeJob.click();
//------------------------Page-1------------------------

        //Job profile details
        log.info("In Profile details page");
        workdaycommon.scrolltoElement(editpositionChangeJob);
        editpositionChangeJob.click();
        createnewpositionChangeJob.click();
        closecurrentpositionChangeJob.click();
        workdaycommon.scroll();
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
//------------------------Page-2------------------------

        //Entering Location details
        log.info("In Location details page");
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
//------------------------Page-3------------------------

        //Entering Administrative details
        log.info("In Administrative details page");
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
//------------------------Page-4------------------------

        //Entering Organisation details
        log.info("In Organisation details page");
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(editDepartmentChangeJob);
        editDepartmentChangeJob.click();
        workdaycommon.userWait(2000);
//        DepartmentChangeJob.click();
//        workdaycommon.userWait(2000);
        enterDepartmentChangeJob.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Constants.USADEPARTMENTHIREEMP,Keys.ENTER);
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
//------------------------Page-5------------------------

        //Entering Compensation details
        log.info("In Compensation details page");
        log.info("Entering Salary component");
        workdaycommon.scrolltoElement(editsalaryChangeJob);
        editsalaryChangeJob.click();
//        amountChangeJob.clear();
        amountChangeJob.sendKeys(Keys.BACK_SPACE);
        amountChangeJob.sendKeys(Keys.BACK_SPACE);
        amountChangeJob.sendKeys(Keys.BACK_SPACE);
        amountChangeJob.sendKeys(Keys.BACK_SPACE);
        amountChangeJob.sendKeys(Keys.BACK_SPACE);
        amountChangeJob.sendKeys(Keys.BACK_SPACE);
        amountChangeJob.sendKeys(Keys.BACK_SPACE);
        amountChangeJob.sendKeys(Keys.BACK_SPACE);
        amountChangeJob.sendKeys(Keys.BACK_SPACE);
        amountChangeJob.sendKeys(String.valueOf(Salary), Keys.TAB);
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
//------------------------Page-6------------------------


        workdaycommon.scrolltoElement(btnsubmitChangeJob);
        workdaycommon.userWait(1000);
        btnsubmitChangeJob.click();
        workdaycommon.userWait(4000);
        try {
            if (btnsubmitChangeJob.isDisplayed()) {
                btnsubmitChangeJob.click();
                workdaycommon.userWait(4000);
                log.info("Alert Available....");
            }
        } catch (Exception e) {
            log.info("Alert Not Available....");
        }

        //linkdetailsChangeJob.click();
        //   workdaycommon.userWait(3000);
        //   processTabChangeJob.click();
        workdaycommon.userWait(1000);
        int k=0;
        k=processtabJCCompensation(Employee);
        log.info("Searching upto process tab....");
        try {
                int counter= 1;
            while (counter<=k) {
                log.info("Increased Counter--->" + k);
                Job_CompensationChangeawaiting_action(Employee);
                System.out.println("A part of awaiting action is done.......");
               k = processtabJCCompensation(Employee);
            }
            log.info("stopped here 3--->" + k);
            //   ValidateAwaitingActionCheck(Employee);
        } catch (Exception e) {
            System.out.println("Running in Catch Block.........");
            //workdaycommon.gotoWorkdayHomepage();
            ValidateAwaitingActionCheckJCCompensation(Employee);
        }
    }


    public int processtabJCCompensation(String Employee) throws Exception {
        int count=0;
        workdaycommon.stopProxy();
        workdaycommon.startProxy(Constants.BP_Admin);
        workdaycommon.userWait(2000);
        log.info("Checking in Process tab...RL.");
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(allOfWorkday);
        allOfWorkday.click();
        workdaycommon.userWait(1000);
//         WebElement EmployeenamerJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Transfer: "+Employee+"')]"));
//        WebElement EmployeenamerJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: " + Employee + "' and contains(text(),'Transfer: " + Employee + "')]"));
        WebElement EmployeenamerJC = driver.findElement(By.xpath("(//div[text()='Change Job'])[1]//preceding::div[@data-automation-id='promptOption' and contains(text(),'"+Employee+"')][1]"));
        workdaycommon.userWait(3000);
        WebActionsUtil.explicitWait(driver, EmployeenamerJC, "click");
        workdaycommon.scrolltoElement(EmployeenamerJC);
        workdaycommon.userWait(1000);
        EmployeenamerJC.click();
        workdaycommon.userWait(3000);
        processtabJobChange.click();
        workdaycommon.userWait(3000);
        workdaycommon.scroll();
        log.info("Clicked on Employee..RL..");
        try {
//        if (workdaycommon.labelawaitingaction.isDisplayed()) {
            log.info(".......Checking for any Awaiting Action .......");
            log.info("Awaiting Action Counting Started.......");
            List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
            count = labelAwaitingaction.size();
            log.info("Count----->" + count);
//            log.info("Awaiting Action____1......." + i);
            return count;
        } catch (Exception e) {
            log.info(".... No awaiting action present ... ");
            return count;
        }
    }

    public void Job_CompensationChangeawaiting_action(String Employee) throws Exception {

//        if (workdaycommon.labelawaitingaction.isDisplayed()) {
//            log.info(".......Checking for any Awaiting Action .......");
//            log.info("Awaiting Action Counting Started.......");
//            List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
//            int count = labelAwaitingaction.size();
//            log.info("Count----->" + count);
//            for (int i = 1; i <= count; i++) {
//                log.info("Awaiting Action____1......." + i);

//                String Approver_name = workdaycommon.awaitingAction(i);
//                StringBuilder proxyperson = new StringBuilder(Approver_name);
//                proxyperson.delete(Approver_name.length() - 1, Approver_name.length());
//                workdaycommon.simplestartProxy(proxyperson.toString());
//                workdaycommon.userWait(4000);
                try {
                    WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
                    Threedots.click();
                    workdaycommon.scrolltoElement(securityProfile);
                    workdaycommon.mousemove(securityProfile, startProxyFromAssociateName);
                    workdaycommon.userWait(1000);
                    startProxyFromAssociateName.click();
                    btnOKChangeJob.click();
                    workdaycommon.userWait(2000);
                    log.info(".......Proxy successful.......");
                }catch(org.openqa.selenium.NoSuchElementException e) {
                log.info("Proxying to the same person");
                }
                workdaycommon.userWait(1000);
                log.info("Clicking on Homepage of proxy employee......");
                workdaycommon.gotoWorkdayHomepage();
                workdaycommon.userWait(3000);
                log.info(" Started to perform inbox action in proxy person.......");
                workdaycommon.inboxWD.click();
                workdaycommon.userWait(2000);

                try {
                    WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Transfer: " + Employee + "')]"));
                    // WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));
                    workdaycommon.scrolltoElement(inboxTextJC);
                    inboxTextJC.click();
                    workdaycommon.userWait(2000);
                    log.info("Email Title has transfer");

                }
                catch(Exception e) {
                    log.info("Email Title doesn't has transfer");
                }

                try {
                    WebElement inboxWagesTextJC = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Wage Theft Prevention Notice Review: "+Employee+"')]"));
                    // WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));
                    workdaycommon.scrolltoElement(inboxWagesTextJC);
                    inboxWagesTextJC.click();
                    workdaycommon.userWait(2000);
                    log.info("Selected Wages Email");

                }
                catch(Exception e) {
                    log.info("Email Title is different");
                }

                try {
                    if (CertifyCheckbox.isDisplayed()) {
                        log.info("I Certify Checkbox available....");
                        workdaycommon.scrolltoElement(CertifyCheckbox);
                        CertifyCheckbox.click();
                        workdaycommon.userWait(2000);
                    }
                } catch (Exception ex) {
                    log.info("I Certify Checkbox not available....");
                }

                try {
                    if (AgreeCheckbox.isDisplayed()) {
                        log.info("I Agree Checkbox available....");
                        workdaycommon.scrolltoElement(AgreeCheckbox);
                        AgreeCheckbox.click();
                        workdaycommon.userWait(2000);
                    }
                } catch (Exception ex) {
                    log.info("I Agree Checkbox not available....");
                }
//

                try {
                    if (workdaycommon.inboxbuttonApprove.isDisplayed()) {

                        //Job profile details
                        log.info("In Profile details page");
                        workdaycommon.scrolltoElement(editpositionChangeJob);
                        editpositionChangeJob.click();
                        createnewpositionChangeJob.click();
//                        closecurrentpositionChangeJob.click();
                        workdaycommon.scroll();

                        //Department
                        workdaycommon.scrolltoElement(deptEditProCompHire);
                        WebActionsUtil.explicitWait(driver, deptEditProCompHire, "click");
                        deptEditProCompHire.click();
                        workdaycommon.userWait(2000);
                        deptValEditProCompHire.click();
                        workdaycommon.userWait(2000);
                        compValProCompHire.sendKeys(Constants.USADEPARTMENTHIREEMP, Keys.ENTER);
                        workdaycommon.userWait(3000);

                        workdaycommon.userWait(3000);
                        workdaycommon.inboxbuttonApprove.click();
                        workdaycommon.userWait(4000);
                        workdaycommon.scrolltoElement(btndoneJC);
                        log.info("scrolled to done button");
                        btndoneJC.click();
                        workdaycommon.userWait(2000);
                        log.info("Approve button available....");
                    }
                }

                catch (org.openqa.selenium.NoSuchElementException e) {
                    log.info("The exception is "+e.getStackTrace());
                    workdaycommon.userWait(2000);
                    workdaycommon.scrolltoElement(workdaycommon.inboxbuttonSubmit);
                    workdaycommon.userWait(2000);
                    workdaycommon.inboxbuttonSubmit.click();
                    workdaycommon.userWait(2000);
                    btndoneJC.click();
                    workdaycommon.userWait(2000);
                    log.info("Only Submit button available....");
                }

                log.info("Approval done Successfully.......");
//            }
            log.info(".......Process Completed with Approval.........");
            workdaycommon.gotoWorkdayHomepage();
//        }
    }


    public void ValidateAwaitingActionCheckJCCompensation(String Employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        workdaycommon.userWait(2000);
        String overallStatus = overallStatusJobChange.getText();
        log.info("---------overallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);

        workdaycommon.scroll();
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (checkAwaitingAction.isDisplayed()) {
                    log.info("Job Change not Completed Successfully........");
                    test.fail("Job Change not Completed Successfully........");
                    driver.quit();
                }
            } catch (Exception e) {
                test.pass("Job Change Completed Successfully for Employee name :" + Employee);
                log.info("Job Change Completed Successfully........");
            }
        } else {
            log.info("Job Change not Completed Successfully........Current Status: " + overallStatus);
            test.fail("Job Change not Completed Successfully.......Current Status: " + overallStatus);
            driver.quit();
        }
    }



    public void Jobchange_Organisation(String Employee, String SUPORG, String Location, String jobchangedate, String Country) throws Exception {
        //try {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.entry();
        log.info("Starting with Jobchange");
        test.info("Starting job change for the employee.");
        if(Country.equalsIgnoreCase("Canada"))
        {
            workdaycommon.startProxy(Constants.Manager_7052);
        }
        if(Country.equalsIgnoreCase("USA")) {
            workdaycommon.startProxy(Constants.Manager_0914);
        }
        workdaycommon.searchbySearchBox("Change job");
        workdaycommon.userWait(2500);
        linkchangeJob.click(); //clicking on Change job link
        log.info(("Starting with job change . . .. . . "));
        workernameChangeJob.click(); //Entering worker's/employee name for whom the job to be changed
        workdaycommon.userWait(1000);
        // String name = this.FNAMECREATEPREHIRE1+ " " + this.LNAMECREATEPREHIRE1;
        // log.info("name--->" +name);
        insidesearchboxcommon.sendKeys(Employee, Keys.ENTER);
        workdaycommon.userWait(3000);
        //   workdaycommon.selectfromduplicates(Employee); // Selecting values from duplicates
        log.info("Entering Worker name");
        workdaycommon.userWait(3000);
        btnOKChangeJob.click();
        //Entering Start details
        log.info("Entering Job change start details");
        workdaycommon.scrolltoElement(editStartDetailsChangeJob);
        workdaycommon.userWait(3000);
        editStartDetailsChangeJob.click();
        workdaycommon.userWait(3000);
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date1 = simpleDateFormat.format(new Date());
        if (driverWrapper.isElementPresent(dateToChangeEffect)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(jobchangedate);//change it to date1
            }
        }
        WebActionsUtil.explicitWait(driver, makechangeChangeJob, "click");
        makechangeChangeJob.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Constants.JOBCHANGEREASONCHANGEJOB, Keys.ENTER);
        //workdaycommon.scroll();
        workdaycommon.userWait(3000);
        WebActionsUtil.explicitWait(driver, teamchangeChangeJob, "click");
        workdaycommon.scrolltoElement(teamchangeChangeJob);
        teamchangeChangeJob.click();
        workdaycommon.userWait(3000);
        enterteamChangeJob.click(); //uncoment only when needed
        insidesearchboxcommon.sendKeys(SUPORG, Keys.ENTER);
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Keys.TAB);
        //workdaycommon.selectfromduplicates(SUPORG);
        workdaycommon.userWait(4000);
        //  changelocationChangeJob.click();
        // workdaycommon.userWait(3000);
        //enterlocationChangeJob.click();
        // enterlocationChangeJob.click();
        insidesearchboxcommon.sendKeys(Location, Keys.ENTER);
        workdaycommon.userWait(2000);
        WebActionsUtil.explicitWait(driver, btnstartChangeJob, "click");
        btnstartChangeJob.click();

        //opening details
        try {
            if (openingChangeJob.isDisplayed()) {
                workdaycommon.scrolltoElement(editopeningChangeJob);
                editopeningChangeJob.click();
                workdaycommon.userWait(1000);
                openingdropdownChangeJob.click();
                workdaycommon.userWait(1000);
                workdaycommon.scrolltoElement(editopeningChangeJob);
                openingoptionChangeJob.click();
                workdaycommon.userWait(1000);
                btnnextChangeJob.click();
            }
        }
        catch(Exception e)
        {
            log.info("Next button is not present");
        }

        workdaycommon.scrolltoElement(btnsubmitChangeJob);
        workdaycommon.userWait(1000);
        btnsubmitChangeJob.click();
        workdaycommon.userWait(4000);
        try {
            if (btnsubmitChangeJob.isDisplayed()) {
                btnsubmitChangeJob.click();
                workdaycommon.userWait(4000);
                log.info("Alert Available....");
            }
        } catch (Exception e) {
            log.info("Alert Not Available....");
        }

        //linkdetailsChangeJob.click();
        //   workdaycommon.userWait(3000);
        //   processTabChangeJob.click();

        workdaycommon.userWait(1000);
        processtabJCOrganisation(Employee);
        log.info("Searching upto process tab....");

        try {
            int k = 10;
            while (k > 1) {
                log.info("Increased Counter--->" + k);
                Job_OrganisationChangeawaiting_action(Employee);
                System.out.println("A part of awaiting action is done.......");
                processtabJCOrganisation(Employee);
                k--;

            }
            log.info("stopped here 3--->" + k);
//               ValidateAwaitingActionCheck(Employee);
        } catch (Exception e) {
            System.out.println("Running in Catch Block.........");

            log.info("entered into validation_0");
//            workdaycommon.gotoWorkdayHomepage();
            log.info("entered into validation_1");
            ValidateAwaitingActionCheckJCOrganisation(Employee);
        }
    }


    public void processtabJCOrganisation(String Employee) throws Exception {
        workdaycommon.stopProxy();
        workdaycommon.startProxy(Constants.BP_Admin);
        workdaycommon.userWait(2000);
        log.info("Checking in Process tab...RL.");
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(allOfWorkday);
        allOfWorkday.click();
        workdaycommon.userWait(1000);
//        workdaycommon.userWait(3000);
        WebElement EmployeenamerJC = driver.findElement(By.xpath("(//div[text()='Change Job'])[1]//preceding::div[@data-automation-id='promptOption' and contains(text(),'"+Employee+"')][1]"));
        workdaycommon.scrolltoElement(EmployeenamerJC);
        workdaycommon.userWait(1000);
        EmployeenamerJC.click();
        workdaycommon.userWait(3000);
        processtabJobChange.click();
        workdaycommon.userWait(3000);
        workdaycommon.scroll();
        log.info("Clicked on Employee..RL..");
    }

    public void Job_OrganisationChangeawaiting_action(String Employee) throws Exception
    {

        if (workdaycommon.labelawaitingaction.isDisplayed()) {
            log.info(".......Checking for any Awaiting Action .......");
            log.info("Awaiting Action Counting Started.......");
            List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
            int count = labelAwaitingaction.size();
            log.info("Count----->" + count);
            for (int i = 1; i <= count; i++) {
                log.info("Awaiting Action____1......." + i);

//                String Approver_name = workdaycommon.awaitingAction(i);
//                StringBuilder proxyperson = new StringBuilder(Approver_name);
//                proxyperson.delete(Approver_name.length() - 1, Approver_name.length());
//                workdaycommon.simplestartProxy(proxyperson.toString());
//                workdaycommon.userWait(4000);

                try {
                    WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
                    Threedots.click();
                    workdaycommon.scrolltoElement(securityProfile);
                    workdaycommon.mousemove(securityProfile, startProxyFromAssociateName);
                    workdaycommon.userWait(1000);
                    startProxyFromAssociateName.click();
                    btnOKChangeJob.click();
                    workdaycommon.userWait(2000);
                    log.info(".......Proxy successful.......");
                }catch(org.openqa.selenium.NoSuchElementException e) {
                    log.info("Proxying to the same person");
                }


                log.info("Clicking on Homepage of proxy employee......");
                workdaycommon.gotoWorkdayHomepage();
                workdaycommon.userWait(3000);
                log.info(" Started to perform inbox action in proxy person.......");
                workdaycommon.inboxWD.click();
                workdaycommon.userWait(2000);

                try {
                    WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Transfer: " + Employee + "')]"));
                    // WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));
                    workdaycommon.scrolltoElement(inboxTextJC);
                    inboxTextJC.click();
                    workdaycommon.userWait(2000);
                    log.info("Email Title has transfer");

                }
                catch(Exception e) {
                    log.info("Email Title doesn't has transfer");
                }
                workdaycommon.userWait(2000);


                try {
                    WebElement inboxWagesTextJC = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Wage Theft Prevention Notice Review: "+Employee+"')]"));
                    // WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));
                    workdaycommon.scrolltoElement(inboxWagesTextJC);
                    inboxWagesTextJC.click();
                    workdaycommon.userWait(2000);
                    log.info("Selected Wages Email");

                }
                catch(Exception e) {

                    log.info("Email Title has wages");
                }

                try {
                    if (CertifyCheckbox.isDisplayed()) {
                        log.info("I Certify Checkbox available....");
                        workdaycommon.scrolltoElement(CertifyCheckbox);
                        CertifyCheckbox.click();
                        workdaycommon.userWait(2000);
                    }
                } catch (Exception ex) {
                    log.info("I Certify Checkbox not available....");
                }

                try {
                    if (AgreeCheckbox.isDisplayed()) {
                        log.info("I Agree Checkbox available....");
                        workdaycommon.scrolltoElement(AgreeCheckbox);
                        AgreeCheckbox.click();
                        workdaycommon.userWait(2000);
                    }
                } catch (Exception ex) {
                    log.info("I Agree Checkbox not available....");
                }
//

                try {
                    if (workdaycommon.inboxbuttonApprove.isDisplayed()) {

                        //Job profile details
                        log.info("In Profile details page");
                        workdaycommon.scrolltoElement(editpositionChangeJob);
                        editpositionChangeJob.click();
                        createnewpositionChangeJob.click();
//                        closecurrentpositionChangeJob.click();
                        workdaycommon.scroll();
                        //Department
                        workdaycommon.scrolltoElement(deptEditProCompHire);
                        WebActionsUtil.explicitWait(driver, deptEditProCompHire, "click");
                        deptEditProCompHire.click();
                        workdaycommon.userWait(2000);
                        deptValEditProCompHire.click();
                        workdaycommon.userWait(2000);
                        compValProCompHire.sendKeys(Constants.USADEPARTMENTHIREEMP, Keys.ENTER);
                        workdaycommon.userWait(3000);
                        workdaycommon.inboxbuttonApprove.click();
                        workdaycommon.userWait(4000);
                        workdaycommon.scrolltoElement(btndoneJC);
                        log.info("scrolled to done button");
                        btndoneJC.click();
                        workdaycommon.userWait(2000);
                        log.info("Approve button available....");
                    }
                }

                catch (org.openqa.selenium.NoSuchElementException e) {
                    log.info("The exception is "+e.getStackTrace());
                    workdaycommon.userWait(2000);
                    workdaycommon.scrolltoElement(workdaycommon.inboxbuttonSubmit);
                    workdaycommon.userWait(2000);
                    workdaycommon.inboxbuttonSubmit.click();
                    workdaycommon.userWait(2000);
                    btndoneJC.click();
                    workdaycommon.userWait(2000);
                    log.info("Only Submit button available....");
                }

                log.info("Approval done Successfully.......");
            }
            log.info(".......Process Completed with Approval.........");
            workdaycommon.gotoWorkdayHomepage();
        }
    }

    public void ValidateAwaitingActionCheckJCOrganisation(String Employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.info("entered into validation_2");
        workdaycommon.startProxy(Constants.BP_Admin);


        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        allOfWorkday.click();
        workdaycommon.userWait(1000);
          WebElement Employeename = driver.findElement(By.xpath("(//div[text()='Change Job'])[1]//preceding::div[@data-automation-id='promptOption' and contains(text(),'"+Employee+"')][1]"));
//        WebElement Employeename = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));

        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(Employeename);
        workdaycommon.userWait(1000);
        Employeename.click();
        workdaycommon.userWait(1000);
        processtabJobChange.click();

        workdaycommon.userWait(2000);
        String overallStatus = overallStatusJobChange.getText();
        log.info("---------overallStatus------>" + overallStatus);
        workdaycommon.userWait(1000);

        workdaycommon.scroll();
        if (overallStatus.equals("Successfully Completed")) {
            try {
                if (checkAwaitingAction.isDisplayed()) {
                    log.info("Job Change not Completed Successfully........");
                    test.fail("Job Change not Completed Successfully........");
                    driver.quit();
                }
            } catch (Exception e) {
                test.pass("Job Change Completed Successfully for Employee name :" + Employee);
                log.info("Job Change Completed Successfully........");
            }
        } else {
            log.info("Job Change not Completed Successfully........Current Status: " + overallStatus);
            test.fail("Job Change not Completed Successfully.......Current Status: " + overallStatus);
            driver.quit();
        }
    }

    public void Jobchange_WorkLocation(String Employee, String EffectiveDate, String Location)throws Exception {
        //try {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.entry();

        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(allOfWorkday);
        allOfWorkday.click();
        workdaycommon.userWait(3000);
        //WebElement empName = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and text()='" + Employee + "']"));
        WebElement empName = driver.findElement(By.xpath("//div[contains(text(),'" + Employee + "')]//following::div[text()='Associate']//preceding::div[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));

        workdaycommon.scrolltoElement(empName);
        empName.click();
        workdaycommon.userWait(3000);

        //Manager proxy0
        tabJob.click();
        workdaycommon.userWait(2000);
        workdaycommon.more_dropdownbox(subTabManagerHistory);
        WebElement managerName = driver.findElement(By.xpath("//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]"));
        String ManagerName = managerName.getText();
//        workdaycommon.simplestartProxy(ManagerName);

        test.info("Proxying to Associate's Manager : " + ManagerName);
        WebElement Threedots = driver.findElement(By.xpath("//span[text()='Manager']//following::div[@data-automation-id='promptOption'][2]//following::img[1]"));
        Threedots.click();
        workdaycommon.scrolltoElement(securityProfile);
        workdaycommon.mousemove(securityProfile, startProxyFromAssociateName);
        workdaycommon.userWait(1000);
        startProxyFromAssociateName.click();
        btnOKChangeJob.click();
        workdaycommon.userWait(3000);

        test.info("Manager Proxy Successful");
        log.info("Manager Proxy Successful");
        workdaycommon.userWait(2000);


        log.info("Starting with Jobchange");
        test.info("Starting job change for the employee.");
        workdaycommon.searchbySearchBox("Change job");
        workdaycommon.userWait(2500);
        linkchangeJob.click(); //clicking on Change job link
        log.info(("Starting with job change . . .. . . "));
        workernameChangeJob.click(); //Entering worker's/employee name for whom the job to be changed
        workdaycommon.userWait(1000);

        // String name = this.FNAMECREATEPREHIRE1+ " " + this.LNAMECREATEPREHIRE1;
        // log.info("name--->" +name);

        insidesearchboxcommon.sendKeys(Employee, Keys.ENTER);
        workdaycommon.userWait(3000);
        //   workdaycommon.selectfromduplicates(Employee); // Selecting values from duplicates
        log.info("Entering Worker name");
        workdaycommon.userWait(3000);
        btnOKChangeJob.click();
        //Entering Start details
        log.info("Entering Job change start details");
        workdaycommon.scrolltoElement(editStartDetailsChangeJob);
        workdaycommon.userWait(3000);
        editStartDetailsChangeJob.click();
        workdaycommon.userWait(3000);
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date1 = simpleDateFormat.format(new Date());
        if (driverWrapper.isElementPresent(dateToChangeEffect)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(EffectiveDate);//change it to date1
                elem.sendKeys(Keys.TAB);
                elem.sendKeys(Keys.TAB);
            }
        }
        WebActionsUtil.explicitWait(driver, makechangeChangeJob, "click");
//        makechangeChangeJob.click();
        workdaycommon.userWait(3000);
        makechangesearchboxChangeJob.sendKeys(Constants.JOBCHANGEREASONCHANGEJOB, Keys.ENTER);
//        insidesearchboxcommon.sendKeys(Constants.JOBCHANGEREASONCHANGEJOB, Keys.ENTER);
        log.info("Reason is entered");
        workdaycommon.scrolltoElement(changelocationChangeJob);
        log.info("Scrolled to Loaction");

        JavascriptExecutor jstChangeLoc = (JavascriptExecutor) driver;
        workdaycommon.scrolltoElement(changelocationChangeJob);
        jstChangeLoc.executeScript("arguments[0].click () ", changelocationChangeJob);
        workdaycommon.userWait(1000);

//        changelocationChangeJob.click();
        // workdaycommon.userWait(3000);
//        enterlocationChangeJob.click();
        log.info("Location field is Clicked");
        insidesearchboxcommon.sendKeys(Location, Keys.ENTER);
        workdaycommon.userWait(2000);
        WebActionsUtil.explicitWait(driver, btnstartChangeJob, "click");
        btnstartChangeJob.click();
//------------------------Page-1------------------------

        //Job profile details
        log.info("In Profile details page");
        workdaycommon.scrolltoElement(editpositionChangeJob);
        editpositionChangeJob.click();
        createnewpositionChangeJob.click();
        closecurrentpositionChangeJob.click();
        workdaycommon.scroll();
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
//------------------------Page-2------------------------

        //Entering Location details
        log.info("In Location details page");
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
//------------------------Page-3------------------------

        //Entering Administrative details
        log.info("In Administrative details page");
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
//------------------------Page-4------------------------

        //Entering Organisation details
        log.info("In Organisation details page");
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(editDepartmentChangeJob);
        editDepartmentChangeJob.click();
        workdaycommon.userWait(2000);
//        DepartmentChangeJob.click();
//        workdaycommon.userWait(2000);
        enterDepartmentChangeJob.click();
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Constants.USADEPARTMENTHIREEMP, Keys.ENTER);
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
//------------------------Page-5------------------------

        //Entering Compensation details
        log.info("In Compensation details page");
        workdaycommon.userWait(3000);
        btnnextChangeJob.click();
//------------------------Page-6------------------------


        workdaycommon.scrolltoElement(btnsubmitChangeJob);
        workdaycommon.userWait(1000);
        btnsubmitChangeJob.click();
        workdaycommon.userWait(4000);
        try {
            if (btnsubmitChangeJob.isDisplayed()) {
                btnsubmitChangeJob.click();
                workdaycommon.userWait(4000);
                log.info("Alert Available....");
            }
        } catch (Exception e) {
            log.info("Alert Not Available....");
        }
        //linkdetailsChangeJob.click();
        //   workdaycommon.userWait(3000);
        //   processTabChangeJob.click();
        workdaycommon.userWait(1000);
//        processtabJCCompensation(Employee);
        int k=0;
        k=processtabJCWorkLoc(Employee);
        log.info("Searching upto process tab....");
        try {
            int counter= 1;
            while (counter<=k) {
                log.info("Increased Counter--->" + k);
                Job_WorkLocChangeawaiting_action(Employee);
                System.out.println("A part of awaiting action is done.......");
                k = processtabJCWorkLoc(Employee);
            }
            log.info("stopped here 3--->" + k);
            //   ValidateAwaitingActionCheck(Employee);
        } catch (Exception e) {
            System.out.println("Running in Catch Block.........");
            //workdaycommon.gotoWorkdayHomepage();
            ValidateAwaitingActionCheckJCWorkLoc(Employee);
        }

    }

        public int processtabJCWorkLoc(String Employee) throws Exception {
            workdaycommon.stopProxy();
            workdaycommon.startProxy(Constants.BP_Admin);
            int count=0;
            workdaycommon.userWait(2000);
            log.info("Checking in Process tab...RL.");
            workdaycommon.searchbySearchBox(Employee);
            workdaycommon.userWait(1000);
            workdaycommon.scrolltoElement(allOfWorkday);
            allOfWorkday.click();
            workdaycommon.userWait(1000);
//            WebElement EmployeerJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'Transfer: "+Employee+"')]"));
//        WebElement EmployeenamerJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: " + Employee + "' and contains(text(),'Transfer: " + Employee + "')]"));
            WebElement EmployeerJC = driver.findElement(By.xpath("(//div[text()='Change Job'])[1]//preceding::div[@data-automation-id='promptOption' and contains(text(),'"+Employee+"')][1]"));

            workdaycommon.userWait(3000);
            WebActionsUtil.explicitWait(driver, EmployeerJC, "click");
            workdaycommon.scrolltoElement(EmployeerJC);
            workdaycommon.userWait(1000);
                EmployeerJC.click();
            workdaycommon.userWait(3000);
            processtabJobChange.click();
            workdaycommon.userWait(3000);
            workdaycommon.scroll();
            log.info("Clicked on Employee..RL..");

            try {
//        if (workdaycommon.labelawaitingaction.isDisplayed()) {
                log.info(".......Checking for any Awaiting Action .......");
                log.info("Awaiting Action Counting Started.......");
                List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
                count = labelAwaitingaction.size();
                log.info("Count----->" + count);
//            log.info("Awaiting Action____1......." + i);
                return count;
            } catch (Exception e) {
                log.info(".... No awaiting action present ... ");
                return count;
            }

        }

        public void Job_WorkLocChangeawaiting_action(String Employee) throws Exception {

//            if (workdaycommon.labelawaitingaction.isDisplayed()) {
//                log.info(".......Checking for any Awaiting Action .......");
//                log.info("Awaiting Action Counting Started.......");
//                List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
//                int count = labelAwaitingaction.size();
//                log.info("Count----->" + count);
////                for (int i = 1; i <= count; i++) +{
//                    log.info("Awaiting Action____1......." + i);

//                String Approver_name = workdaycommon.awaitingAction(i);
//                StringBuilder proxyperson = new StringBuilder(Approver_name);
//                proxyperson.delete(Approver_name.length() - 1, Approver_name.length());
//                workdaycommon.simplestartProxy(proxyperson.toString());
//                workdaycommon.userWait(4000);
                    try {
                        WebElement Threedots = driver.findElement(By.xpath("(//div[text()='Awaiting Action'])[1]//following::img[1]"));
                        Threedots.click();
                        workdaycommon.scrolltoElement(securityProfile);
                        workdaycommon.mousemove(securityProfile, startProxyFromAssociateName);
                        workdaycommon.userWait(1000);
                        startProxyFromAssociateName.click();
                        btnOKChangeJob.click();
                        workdaycommon.userWait(2000);
                        log.info(".......Proxy successful.......");
                    }catch(org.openqa.selenium.NoSuchElementException e) {
                        log.info("Proxying to the same person");
                    }
                    workdaycommon.userWait(1000);
                    log.info("Clicking on Homepage of proxy employee......");
                    workdaycommon.gotoWorkdayHomepage();
                    workdaycommon.userWait(3000);
                    log.info(" Started to perform inbox action in proxy person.......");
                    workdaycommon.inboxWD.click();
                    workdaycommon.userWait(2000);

                    try {
                        WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Transfer: " + Employee + "')]"));
                        // WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));
                        workdaycommon.scrolltoElement(inboxTextJC);
                        inboxTextJC.click();
                        workdaycommon.userWait(2000);
                        log.info("Email Title has transfer");

                    }
                    catch(Exception e) {
                        log.info("Email Title doesn't has transfer");
                    }

                    try {
                        WebElement inboxWagesTextJC = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Wage Theft Prevention Notice Review: "+Employee+"')]"));
                        // WebElement inboxTextJC = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @title='Transfer: "+Employee+"' and contains(text(),'Transfer: "+Employee+"')]"));
                        workdaycommon.scrolltoElement(inboxWagesTextJC);
                        inboxWagesTextJC.click();
                        workdaycommon.userWait(2000);
                        log.info("Selected Wages Email");

                    }
                    catch(Exception e) {
                        log.info("Email Title is different");
                    }

                    try {
                        if (CertifyCheckbox.isDisplayed()) {
                            log.info("I Certify Checkbox available....");
                            workdaycommon.scrolltoElement(CertifyCheckbox);
                            CertifyCheckbox.click();
                            workdaycommon.userWait(2000);
                        }
                    } catch (Exception ex) {
                        log.info("I Certify Checkbox not available....");
                    }

                    try {
                        if (AgreeCheckbox.isDisplayed()) {
                            log.info("I Agree Checkbox available....");
                            workdaycommon.scrolltoElement(AgreeCheckbox);
                            AgreeCheckbox.click();
                            workdaycommon.userWait(2000);
                        }
                    } catch (Exception ex) {
                        log.info("I Agree Checkbox not available....");
                    }
//

                    try {
                        if (workdaycommon.inboxbuttonApprove.isDisplayed()) {

                            //Job profile details
                            log.info("In Profile details page");
                            workdaycommon.scrolltoElement(editpositionChangeJob);
                            editpositionChangeJob.click();
                            createnewpositionChangeJob.click();
//                        closecurrentpositionChangeJob.click();
                            workdaycommon.scroll();

                            //Department
                            workdaycommon.scrolltoElement(deptEditProCompHire);
                            WebActionsUtil.explicitWait(driver, deptEditProCompHire, "click");
                            deptEditProCompHire.click();
                            workdaycommon.userWait(2000);
                            deptValEditProCompHire.click();
                            workdaycommon.userWait(2000);
                            compValProCompHire.sendKeys(Constants.USADEPARTMENTHIREEMP, Keys.ENTER);
                            workdaycommon.userWait(3000);

                            workdaycommon.userWait(3000);
                            workdaycommon.inboxbuttonApprove.click();
                            workdaycommon.userWait(4000);
                            workdaycommon.scrolltoElement(btndoneJC);
                            log.info("scrolled to done button");
                            btndoneJC.click();
                            workdaycommon.userWait(2000);
                            log.info("Approve button available....");
                        }
                    }

                    catch (org.openqa.selenium.NoSuchElementException e) {
                        log.info("The exception is "+e.getStackTrace());
                        workdaycommon.userWait(2000);
                        workdaycommon.scrolltoElement(workdaycommon.inboxbuttonSubmit);
                        workdaycommon.userWait(2000);
                        workdaycommon.inboxbuttonSubmit.click();
                        workdaycommon.userWait(2000);
                        btndoneJC.click();
                        workdaycommon.userWait(2000);
                        log.info("Only Submit button available....");
                    }

                    log.info("Approval done Successfully.......");
//                }
                log.info(".......Process Completed with Approval.........");
                workdaycommon.gotoWorkdayHomepage();
//            }
        }


        public void ValidateAwaitingActionCheckJCWorkLoc(String Employee) throws Exception {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
            workdaycommon.userWait(2000);
            String overallStatus = overallStatusJobChange.getText();
            log.info("---------overallStatus------>" + overallStatus);
            workdaycommon.userWait(1000);

            workdaycommon.scroll();
            if (overallStatus.equals("Successfully Completed")) {
                try {
                    if (checkAwaitingAction.isDisplayed()) {
                        log.info("Job Change not Completed Successfully........");
                        test.fail("Job Change not Completed Successfully........");
                        driver.quit();
                    }
                } catch (Exception e) {
                    test.pass("Job Change Completed Successfully for Employee name :" + Employee);
                    log.info("Job Change Completed Successfully........");
                }
            } else {
                log.info("Job Change not Completed Successfully........Current Status: " + overallStatus);
                test.fail("Job Change not Completed Successfully.......Current Status: " + overallStatus);
                driver.quit();
            }
        }


    }






