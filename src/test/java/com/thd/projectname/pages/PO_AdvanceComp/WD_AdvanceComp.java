package com.thd.projectname.pages.PO_AdvanceComp;

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


public class WD_AdvanceComp extends BasePage {
    private static final Logger log = LogManager.getLogger(WD_AdvanceComp.class);
    WorkdayCommon workdaycommon = new WorkdayCommon();

    //Request Compensation change -----------------------------------------------
    @FindBy(xpath = "//*[@data-automation-id='promptOption' and @title='Request Compensation Change']")
    public WebElement linkReqChangeComp;


    @FindBy(xpath = "//label[text()='Associate']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement associateReqChangeComp;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Associate']//following::span[@data-automation-id='promptIcon']")
    public WebElement nameReqChangeComp;

    @FindBy(xpath = "(//*[@data-automation-id='actionImage'])[1]")
    public WebElement reasonReqChangeCompEdit;


    @FindBy(xpath = "//label[text()='Reason']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement reasonReqChangeComp;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Effective Date & Reason']")
    public WebElement editReasonReqChangeComp;

    @FindBy(xpath = "//label[text()='Employee']//following::*[@data-automation-id='promptIcon'][1]")
    public WebElement empnameReqChangeComp;

    @FindBy(xpath = "//*[@data-automation-id='dateWidgetInputBox']")
    public WebElement effectivedateReqChangeComp;

    @FindBy(xpath = "//button[@title='OK']")
    public WebElement btnokReqChangeComp;

    @FindBy(xpath = "//*[text()='Effective Date & Reason']//following::*[@data-automation-id='actionImage'][1]")
    public WebElement editeffectivedateChangeComp;

    @FindBy(xpath = "//div[@title='Edit Guidelines']")
    public WebElement editGuideChangeComp;

    @FindBy(xpath = "//span[@data-automation-id='promptIcon']")
    public WebElement prompIconChangeComp;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Salary']")
    public WebElement editsalaryChangeComp;

    @FindBy(xpath = "//div[@data-automation-id='actionImage' and @title='Edit Hourly']")
    public WebElement edithourlyChangeComp;



    @FindBy(xpath = "//h3[text()='Salary']//following::button[@title='Add'][1]")
    public WebElement addsalaryChangeComp;

    @FindBy(xpath = "//label[text()='Compensation Plan']//following::span[@data-automation-id='promptIcon']")
    public WebElement compensationplanChangeComp;

    @FindBy(xpath = "//label[text()='Compensation Plan']")
    public WebElement clicklabelChangeComp;

    @FindBy(xpath = "(//div[@data-automation-id='productTourStartIcon' and @role='button'])[1]")
    public WebElement popupChangeComp;

    @FindBy(xpath = "//label[text()='Amount']//following::input[@data-automation-id='numericInput'][1]")
    public WebElement amountChangeComp;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement submitChangeComp;

    @FindBy(xpath = "//span[text()='Details and Process' and @data-automation-id='fieldSetLegendLabel']")
    public WebElement detailsandprocessChangeComp;

    @FindBy(xpath = "(//div[text()='Process' and @data-automation-id='tabLabel'])[1]")
    public WebElement processtabChangeComp;

    @FindBy(xpath = "//div[text()='Awaiting Action']")
    public WebElement awaitingAction;

    @FindBy(xpath = "//button[@title='Approve']")
    public WebElement approvebtnChangeComp;

    @FindBy(xpath = "//div[text()='Awaiting Action']//following::div[@data-automation-id='promptOption']")
    public WebElement personawaitingactionChangeComp;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[@data-automation-id='textView' and text()='Successfully Completed']")
    public WebElement overallstatusChangeComp;

    @FindBy(xpath = "//div[text()='Security Profile']")
    public WebElement securityprofileActions;

    @FindBy(xpath = "//div[text()='Start Proxy']")
    public WebElement startproxyActions;

    @FindBy(xpath = "//span[@title='Done']")
    public WebElement doneChangeComp;



    //Request One Time Payment--------------------------------------------------------------------------------------

    @FindBy(xpath = "//div[text()='Request One-Time Payment']")
    public WebElement linkReqOnetimePayment;

    @FindBy(xpath = "//div[@data-automation-id='dateWidgetContainer']")
    public WebElement effectivetimeReqOnetimePayment;

    //@FindBy(xpath="//label[text()='Employee']//following::span[@data-automation-id='promptIcon']")
    @FindBy(xpath = "//label[text()='Associate']//following::span[@data-automation-id='promptIcon']")
    public WebElement employeeReqOnetimePayment;

    @FindBy(xpath = "//button[@title='OK']")
    public WebElement btnokReqOnetimePayment;

    @FindBy(xpath = "//div[@title='Edit Summary']")
    public WebElement editsummaryReqOnetimePayment;

    @FindBy(xpath = "//label[text()='Effective Date']//following::div[@data-automation-id='dateWidgetContainer'][1]")
    public WebElement effectivedateOnetimePaySummary;

    @FindBy(xpath = "//label[text()='Employee Visibility Date']//following::div[@data-automation-id='dateWidgetContainer'][1]")
    public WebElement empvisibilitydateOnetimePaySummary;

    @FindBy(xpath = "//label[text()='Reason']//following::span[@data-automation-id='promptIcon']")
    public WebElement reasonOnetimePaySummary;

    @FindBy(xpath = "//button[@title='Add']")
    public WebElement btnaddReqOnetimePayment;

    @FindBy(xpath = "//label[text()='One-Time Payment Plan']//following::span[@data-automation-id='promptIcon']")
    public WebElement onetimepayplanReqOnetimePayment;

    @FindBy(xpath = "//label[text()='Amount']//following::input[@data-automation-id='numericInput']")
    public WebElement amountReqOnetimePayment;

    @FindBy(xpath = "//label[text()='Currency']//following::span[@data-automation-id='promptIcon']")
    public WebElement currencyReqOnetimePayment;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement btnsubmitReqOnetimePayment;

    @FindBy(xpath = "//span[@title='Details and Process']")
    public WebElement clickdetailsandprocessReqOnetimePay;

    @FindBy(xpath = "(//div[text()='Process'])[1]")
    public WebElement processtabReqOnetimePayment;


    @FindBy(xpath = "//div[text()='Compensation']")
    public WebElement Compensation_optionActions;

    @FindBy(xpath = "//div[text()='View Compensation History']")
    public WebElement ViewCompHistory_optionActions;

    @FindBy(xpath = "(//div[text()='One-Time Payments'])[1]")
    public WebElement oneTimePaymentTab;

    @FindBy(xpath = "//div[@data-automation-id='promptOption' and text()='View Details']")
    public WebElement viewdetailsOneTimePayment;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[text()='Successfully Completed']")
    public WebElement overallstatusOneTimePayment;

    @FindBy(xpath = "//label[text()='Reason']//following::div[@data-automation-id='promptOption'][1]")
    public WebElement reasonOneTimePayment;

    @FindBy(xpath = "//span[text()='Amount']//following::div[@data-automation-id='numericText'][1]")
    public WebElement amountOneTimePayment;

     @FindBy(xpath = "//label[text()='All of Workday']")
    public WebElement allOfWorkday;



    @FindBy(xpath = "//*[@data-automation-id='moreLinkLabel' and contains(text(),'More')]")
    public WebElement clickMore;

    @FindBy(xpath = "//*[@data-automation-id='workerProfileMenuItemLabel' and text()='Compensation']")
    public WebElement profilePage_Compensation;

    @FindBy(xpath = "//*[@data-automation-id='textView' and text()='Merit']//following::*[@data-automation-id='promptOption'][1]")
    public WebElement meritPlan_Compensation;


   
    @FindBy(xpath = "//*[@data-automation-id='searchBox']")
    public WebElement insidesearchboxcommon;



    public void Request_Compensation_Change(String Reason, String Employee, String ChangeSalary, String EffectiveDate) {

        try {

            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
            workdaycommon.searchbySearchBox(Constants.Comp_Admin);
            workdaycommon.userWait(2000);

            WebElement namelink = driver.findElement(By.xpath("//div[@data-automation-id='promptOption']"));
            namelink.click();
            workdaycommon.userWait(2000);
            workdaycommon.clickAction.click();
            workdaycommon.userWait(1000);
            workdaycommon.mousemove(securityprofileActions, startproxyActions);
            workdaycommon.userWait(1000);
            workdaycommon.okbuttonStartProxy.click();
            workdaycommon.userWait(2000);

            workdaycommon.homepageWD.click();
            workdaycommon.userWait(2000);
            workdaycommon.searchbySearchBox(Constants.SRCHREQCOMPCHANGE);
            workdaycommon.userWait(3000);
            WebActionsUtil.explicitWait(driver, linkReqChangeComp, "click");
            linkReqChangeComp.click();

            String pattern = "MM/dd/YYYY";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String todaydate = simpleDateFormat.format(new Date());
            if (driverWrapper.isElementPresent(effectivedateReqChangeComp)) {
                for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                    elem.sendKeys(EffectiveDate);
                }
            }

            associateReqChangeComp.click();
            insidesearchboxcommon.sendKeys(Employee, Keys.ENTER);
//            workdaycommon.selectfromduplicates(Employee);
            workdaycommon.userWait(4000);
            workdaycommon.scrolltoElement(btnokReqChangeComp);
            btnokReqChangeComp.click();
            workdaycommon.userWait(3000);

            workdaycommon.scrolltoElement(editReasonReqChangeComp);
            editReasonReqChangeComp.click();
            workdaycommon.scrolltoElement(reasonReqChangeComp);
            reasonReqChangeComp.click();
            workdaycommon.userWait(2000);
            insidesearchboxcommon.sendKeys(Reason, Keys.TAB);
            workdaycommon.userWait(2000);

            try {
                workdaycommon.scrolltoElement(editsalaryChangeComp);
                editsalaryChangeComp.click();
                workdaycommon.userWait(2000);
            }
            catch(Exception e){
                workdaycommon.scrolltoElement(edithourlyChangeComp);
                edithourlyChangeComp.click();
                workdaycommon.userWait(2000);
            }

            //WebActionsUtil.explicitWait(driver,compensationplanChangeComp,"click");
   /* try
    {
        if(clicklabelChangeComp.isDisplayed())
        {
            clicklabelChangeComp.click();
            compensationplanChangeComp.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(CompensationPlan, Keys.ENTER);
            //insidesearchboxcommon.sendKeys("Severance Pay",Keys.ENTER);//Severance Pay / Salary Plan
        }
    }
    catch(Exception e)
    {
        log.info("Compensation plan is already created");
    }*/
            workdaycommon.userWait(3000);
            amountChangeComp.sendKeys(Keys.BACK_SPACE);
            amountChangeComp.sendKeys(Keys.BACK_SPACE);
            amountChangeComp.sendKeys(Keys.BACK_SPACE);
            amountChangeComp.sendKeys(Keys.BACK_SPACE);
            amountChangeComp.sendKeys(Keys.BACK_SPACE);
            amountChangeComp.sendKeys(Keys.BACK_SPACE);
            amountChangeComp.sendKeys(Keys.BACK_SPACE);
            amountChangeComp.sendKeys(Keys.BACK_SPACE);
            amountChangeComp.sendKeys(Keys.BACK_SPACE);
            //amountChangeComp.sendKeys("39000",Keys.ENTER);
            amountChangeComp.sendKeys(String.valueOf(ChangeSalary), Keys.TAB);
            workdaycommon.userWait(3000);

            workdaycommon.userWait(1000);
            submitChangeComp.click();
            workdaycommon.userWait(1000);
            detailsandprocessChangeComp.click();
            workdaycommon.userWait(1000);
            workdaycommon.scrolltoElement(processtabChangeComp);
            processtabChangeComp.click();
            workdaycommon.userWait(1000);
            try {
                workdaycommon.scrolltoElement(personawaitingactionChangeComp);
                workdaycommon.userWait(3000);
                String aprname = personawaitingactionChangeComp.getText();
                StringBuilder managerName = new StringBuilder(aprname);
                log.info("Before replacing the Aprover name :" + managerName);
                // Eliminating characters after ( and removing space before (
                managerName.delete(managerName.indexOf("(") - 1, managerName.length());
                log.info("After replacing the Aprover name :" + managerName);
                String Manager_name = managerName.toString();
                test.info("Perform proxy  to Compensation partner of " + Employee + ", Compensation Partner:" + Manager_name);
                workdaycommon.StartProxy_employee(Manager_name);
                workdaycommon.userWait(2000);
                try {
                    workdaycommon.inboxOperationPerformance(Employee);
                }
                catch(Exception e) {
                    workdaycommon.gotoWorkdayHomepage();
                    workdaycommon.inboxWD.click();
                    workdaycommon.userWait(3000);
                    WebElement emailTextOnboardingRef = driver.findElement(By.xpath("//div[@data-automation-id='inbox_row_title' and contains(text(),'Wage Theft Prevention Notice Review:')]"));
                    workdaycommon.scrolltoElement(emailTextOnboardingRef);
                    emailTextOnboardingRef.click();
                    workdaycommon.userWait(3000);
                }
                try {
                    workdaycommon.userWait(1000);
                    submitChangeComp.click();
                    log.info("Submit button is available");

                }
                catch(ElementNotFoundException e){
                    workdaycommon.userWait(1000);
                    approvebtnChangeComp.click();
                    log.info("Approve button is available");
                }
                workdaycommon.userWait(1000);
                workdaycommon.scrolltoElement(detailsandprocessChangeComp);
                detailsandprocessChangeComp.click();
                workdaycommon.userWait(1000);
                workdaycommon.scrolltoElement(processtabChangeComp);
                processtabChangeComp.click();
                workdaycommon.userWait(1000);
                workdaycommon.scrolltoElement(personawaitingactionChangeComp);
                workdaycommon.userWait(3000);
                String managers_mngrApr = personawaitingactionChangeComp.getText();
                StringBuilder mngrs_managerName = new StringBuilder(managers_mngrApr);
                log.info("Before replacing the Aprover name :" + mngrs_managerName);
                // Eliminating characters after ( and removing space before (
                mngrs_managerName.delete(mngrs_managerName.indexOf("(") - 1, mngrs_managerName.length());
                log.info("After replacing the Aprover name :" + mngrs_managerName);
                String Managers_mngrName = mngrs_managerName.toString();
                test.info("Perform proxy to manager's manager of  " + Employee + ", Manager of manager:" + Managers_mngrName);
                workdaycommon.StartProxy_employee(Managers_mngrName);
                workdaycommon.userWait(2000);
                workdaycommon.inboxOperationPerformance(Employee);
                try {
                    workdaycommon.userWait(1000);
                    approvebtnChangeComp.click();
                    log.info("Approve button is available");

                }
                catch(ElementNotFoundException e){
                    workdaycommon.userWait(1000);
                    submitChangeComp.click();
                }
            } catch (NoSuchElementException e) {
                log.info("Awaiting action is not available");
                test.info("Awaiting action is not available");
            }
            workdaycommon.userWait(3000);
            String overallStatus = "Successfully Completed";
            log.info(overallStatus);
            log.info(overallstatusChangeComp.getText());
            if (overallStatus.equals(overallstatusChangeComp.getText())) {
                workdaycommon.scrolltoElement(detailsandprocessChangeComp);
                detailsandprocessChangeComp.click();
                workdaycommon.scrolltoElement(processtabChangeComp);
                processtabChangeComp.click();
                workdaycommon.scroll();
                try {
                    if (awaitingAction.isDisplayed()) {
                        log.info("Request Compensation Change is not Completed Successfully........");
                        test.fail("Request Compensation Change is not Completed Successfully........");
                    }
                } catch (Exception e) {
                    test.pass("Request Compensation Change Completed Successfully");
                    log.info("Request Compensation Change Completed Successfully........");
                }
            } else {
                log.info("Request Compensation Change not Completed Successfully........Current Status: " + overallStatus);
                test.fail("Request Compensation Change not Completed Successfully.......Current Status: " + overallStatus);
            }
        } catch (Exception e) {
            log.error("Exception/Issue occurred:" + e.getMessage());
            test.fail("Exception/Issue occurred:" + e.getMessage());
        }
    }

    public void ReqOnetimePayment(String Employee, String Reason, String PaymentPlan, String Amount, String proxyto) throws Exception {
        log.info("Request to one time Payment ----- starts");
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);

        workdaycommon.searchbySearchBox(Constants.Comp_Admin);
        workdaycommon.userWait(2000);
        WebElement namelink = driver.findElement(By.xpath("//div[@data-automation-id='promptOption']"));
        namelink.click();
        workdaycommon.userWait(2000);
        workdaycommon.clickAction.click();
        workdaycommon.userWait(1000);
        workdaycommon.mousemove(securityprofileActions, startproxyActions);
        workdaycommon.userWait(1000);
        workdaycommon.okbuttonStartProxy.click();
        workdaycommon.userWait(1000);
        workdaycommon.homepageWD.click();
        workdaycommon.userWait(2000);


        workdaycommon.searchbySearchBox(Constants.SRCHREQONETIMEPAYMENT);
        linkReqOnetimePayment.click();
        String pattern = "MM/dd/YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String todaydate = simpleDateFormat.format(new Date());
        Calendar futuredateday = Calendar.getInstance();
        futuredateday.add(Calendar.DATE, 3);
        Date future = futuredateday.getTime();
        if (driverWrapper.isElementPresent(effectivetimeReqOnetimePayment)) {
            for (WebElement elem : driver.findElements(By.xpath("//*[@data-automation-id='dateWidgetInputBox']"))) {
                elem.sendKeys(todaydate);
            }
        }
        employeeReqOnetimePayment.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Employee, Keys.ENTER);
        workdaycommon.userWait(2000);
        btnokReqOnetimePayment.click();

        editsummaryReqOnetimePayment.click();
        workdaycommon.userWait(3000);
        log.info("Entering Effective date");
        if (driverWrapper.isElementPresent(effectivedateOnetimePaySummary)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(todaydate);
            }
        }
        workdaycommon.scrolltoElement(reasonOnetimePaySummary);
        reasonOnetimePaySummary.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Reason, Keys.ENTER);
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(btnaddReqOnetimePayment);
        btnaddReqOnetimePayment.click();
        workdaycommon.scrolltoElement(onetimepayplanReqOnetimePayment);
        onetimepayplanReqOnetimePayment.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(PaymentPlan, Keys.ENTER);
        workdaycommon.userWait(2000);
        amountReqOnetimePayment.sendKeys(Keys.BACK_SPACE);
        amountReqOnetimePayment.sendKeys(Keys.BACK_SPACE);
        amountReqOnetimePayment.sendKeys(Keys.BACK_SPACE);
        amountReqOnetimePayment.sendKeys(Keys.BACK_SPACE);
        amountReqOnetimePayment.sendKeys(Amount, Keys.ENTER);
        //For now this  currency field is prepopulated
        //and hence respective code snippet is disabled.It can be used in future
        /*currencyReqOnetimePayment.click();
        insidesearchboxcommon.sendKeys("USD",Keys.ENTER);*/
        btnsubmitReqOnetimePayment.click();
        workdaycommon.userWait(2000);
        test.pass("Request One Time payment Submitted Successfully");
        clickdetailsandprocessReqOnetimePay.click();
        workdaycommon.scrolltoElement(processtabReqOnetimePayment);
        processtabReqOnetimePayment.click();
        workdaycommon.userWait(5000);
        if (Integer.parseInt(Amount) > 500) {
            if (workdaycommon.labelawaitingaction.isDisplayed()) {
                List<WebElement> labelAwaitingaction = driver.findElements(By.xpath("//*[text()='Awaiting Action']"));
                int count = labelAwaitingaction.size();
                log.info(" Awaiting Actions Label Count----->" + count);
                for (int i = 1; i <= count; i++) {
                    String proxyname = workdaycommon.awaitingAction(i);
// Proxying to the person , as the respective person is not being able to proxy from Start proxy
                    workdaycommon.StartProxy_employee(proxyname);
                    workdaycommon.inboxOperation(Employee);
                    workdaycommon.userWait(1000);
                }
            }
        } else {
            log.info("Non Approvals required as requested One Time Payment is below 500");
            test.info("No Approvals required as requested One Time Payment is below 500");
        }

        workdaycommon.startProxy("HR Partner");
        workdaycommon.Perfrom_employeeActions(Employee, Compensation_optionActions, ViewCompHistory_optionActions);
        oneTimePaymentTab.click();
        workdaycommon.userWait(1000);
        viewdetailsOneTimePayment.click();
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(reasonOneTimePayment);
        workdaycommon.userWait(3000);
        String status = "Successfully Completed";
        String reason = "Bonus > " + Reason;
        String amount = Amount + ".00";
        String amount_edit = amountOneTimePayment.getText().replaceAll(",", "");
        log.info("The Amount after removing , is :" + amount_edit);
        if ((status.equals(overallstatusOneTimePayment.getText())) && (reason.equals(reasonOneTimePayment.getText())) && (amount.equals(amount_edit))) {
            log.info("Request one Time Payment is successfull");
            test.pass("Request one Time Payment is successfull");
            String newLine = System.getProperty("line.separator");
            test.info("One Time Payment Details:  " + newLine + "Employee Name : " + Employee + newLine + "One Time Payment Reason: " + reasonOneTimePayment.getText() + newLine + "One Time Payment Amount: " + amountOneTimePayment.getText());
            log.info("Successfull");
        } else {
            log.error("Request one Time Payment is unsuccessfull");
            test.fail("Request one Time Payment is unsuccessfull");
            log.info("unSuccessfull");
        }
    }


    public void MeritReview(String employee) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
//        workdaycommon.searchbySearchBox(Constants.Comp_Admin);
        workdaycommon.startProxy(Constants.Comp_Admin);
        workdaycommon.userWait(2000);


        //--------------------- In sandbox this xpath wont work to select Comp_Admin ----------------------------
      //  WebElement namelink = driver.findElement(By.xpath("//span[contains(text(),'ERIC STEINLIGHT')]//preceding::div[contains(text(),'EVAN SCOTT')][1]"));
//        workdaycommon.scrolltoElement(allOfWorkday);
//        allOfWorkday.click();
//        workdaycommon.userWait(1000);
//        WebElement namelink = driver.findElement(By.xpath("//*[@data-automation-id='promptOption' and text()='EVAN SCOTT [C]']"));
//        workdaycommon.userWait(1000);
////        WebActionsUtil.explicitWait(driver, namelink, "click");
//        namelink.click();
//        workdaycommon.userWait(2000);
//        workdaycommon.clickAction.click();
//        workdaycommon.userWait(1000);
//        workdaycommon.mousemove(securityprofileActions, startproxyActions);
//        workdaycommon.userWait(1000);
//        workdaycommon.okbuttonStartProxy.click();



        workdaycommon.userWait(1000);
        workdaycommon.homepageWD.click();
        workdaycommon.searchbySearchBox(employee);

//        workdaycommon.allOfWorkday.click();
        WebElement empname = driver.findElement(By.xpath("//*[contains(text(),'"+employee+"')]//following::*[text()='Associate']//preceding::*[@data-automation-id='promptOption' and contains(text(),'"+employee+"')][1]"));
        workdaycommon.userWait(2000);
        empname.click();
        workdaycommon.userWait(2000);


//        WebActionsUtil.explicitWait(driver, profilePage_Compensation, "click");
            clickMore.click();
            workdaycommon.userWait(2000);
            profilePage_Compensation.click();
            workdaycommon.userWait(2000);
            try {
                workdaycommon.scrolltoElement(meritPlan_Compensation);
                if (meritPlan_Compensation.isDisplayed()) {
                    String meritplan = meritPlan_Compensation.getText();
                    log.info("The merit plan of " + employee + "is :" + meritplan);
                    log.info(employee + " is Eligible for Merit Review");
                    test.info("The merit plan of " + employee + "is :" + meritplan);
                    test.pass(employee + " is Eligible for Merit Review");
                }
            } catch (NoSuchElementException e) {
                log.info(employee + " is not Eligible for Merit Review");
                test.pass(employee + " is not Eligible for Merit Review");
            }
        }
    }
