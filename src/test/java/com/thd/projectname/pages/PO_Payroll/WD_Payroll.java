package com.thd.projectname.pages.PO_Payroll;

import com.thd.base.BasePage;
import com.thd.base.Constants.Constants;
import com.thd.common.utils.WebActionsUtil;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.util.LinkedList;
import java.util.List;


public class WD_Payroll extends BasePage {
    private static final Logger log = LogManager.getLogger(WD_Payroll.class);
    WorkdayCommon workdaycommon = new WorkdayCommon();

    //common_WebElements-----------------------------------------------

    @FindBy(xpath = "//*[@data-automation-id='searchBox']")
    public WebElement insidesearchboxcommon;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_uic_okButton' and @title='OK']")
    public WebElement btn_OK;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton_uic_doneButton' and @title='Done']")
    public WebElement btn_Done;

    @FindBy(xpath = "//button[@title='Submit']")
    public WebElement btn_Submit;


    @FindBy(xpath = "//span[@data-automation-id='workerProfileMenuItemLabel' and text()='Pay']")
    public WebElement payTab;

    @FindBy(xpath = "//span[@data-automation-id='workerProfileMenuItemLabel' and text()='Compensation']")
    public WebElement compensationTab;


    @FindBy(xpath = "//span[text()='Payroll Result']//following::img[@data-automation-id='SEARCH_ICON_charm' and @aria-label='View More' and @role='button'][1]")
    public WebElement search_icon;

    @FindBy(xpath = "//span[text()='Payroll Result']//following::img[@data-automation-id='RELATED_TASK_charm' and @aria-label='Related Actions' and @role='button'][1]")
    public WebElement actionsAddEandD;

    @FindBy(xpath = "(//div[text()='Input'])[1]")
    public WebElement inputTab;

    @FindBy(xpath = "//div[@data-automation-id='errorWidgetBarMessageCountCanvas' and contains(text(),'Alert')]")
    public WebElement msgAlert;


    @FindBy(xpath = "//button[contains(@title,'Refresh')]")
    public WebElement btnRefresh;


    //Add_Earnings_Deductions-----------------------------------------

    @FindBy(xpath = "//h2[text()='Actions']//following::div[text()='Payroll Input for Associate and Period']")
    public WebElement payInputAssociateAddEandD;

    //@FindBy(xpath = "//div[text()='Payroll Input for Associate and Period']//following::div[@data-automation-id='SUBFOLDER_charm'][1]")
    @FindBy(xpath = "//h2[text()='Actions']//following::div[text()='Payroll Input for Associate and Period']//following::div[text()='Add Input']")
    public WebElement addInputAddEandD;


    //div[text()='Payroll Input for Associate and Period']//following::div[@data-automation-id='SUBFOLDER_charm'][1]

    @FindBy(xpath = "//span[text()='Input']//following::span[text()='Batch ID']//following::div[@data-automation-id='responsiveMonikerInput'][1]")
    public WebElement batchAddEandD;

    @FindBy(xpath = "//span[text()='Input']//following::span[text()='Pay Component']//following::div[@data-automation-id='responsiveMonikerInput'][2]")
    public WebElement payCompAddEandD;

    @FindBy(xpath = "//span[text()='Input']//following::div[text()='Input Details']")
    public WebElement inputdetailsAddEandD;

    @FindBy(xpath = "//span[text()='Input']//following::span[text()='Type']//following::button[@title='Add Row'][1]")
    public WebElement btnAddRowAddEandD;

    @FindBy(xpath = "//span[text()='Input']//following::span[text()='Type']//following::button[@title='Add Row'][1]//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement inputTypeAddEandD;

    @FindBy(xpath = "//span[text()='Input']//following::span[text()='Value']//following::input[@data-automation-id='numericInput']")
    public WebElement valueAddEandD;

    @FindBy(xpath = "//button[@data-automation-id='wd-CommandButton' and @title='Re-Calculate Result']")
    public WebElement btn_recal;


    //validate-----------------
    @FindBy(xpath = "(//span[text()='Batch ID'])[1]")
    public WebElement headerBatchID;

    @FindBy(xpath = "//span[text()='Batch ID']//following::label[text()='Value']//following::span[@data-automation-id='promptIcon']")
    public WebElement valueBatchID;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Value']//following::div[@data-automation-id='promptOption'][1]")
    public WebElement clickValueBatchID;

    @FindBy(xpath = "//label[@data-automation-id='formLabel' and text()='Value']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement ValueComponent;

    @FindBy(xpath = "//span[text()='Batch ID']//following::button[@data-automation-id='uic_filterButton' and @title='Filter']")
    public WebElement btnFilterBatchID;

    @FindBy(xpath = "//label[text()='Value']//following::div[contains(text(),'E0083')]")
    public WebElement ValueText;

    @FindBy(xpath = "//span[text()='Last Updated']")
    public WebElement headerLastUpdated;

    @FindBy(xpath = "//span[text()='Pay Component']")
    public WebElement headerPayComponent;

    @FindBy(xpath = "//span[text()='Last Updated']//following::div[@title='Sort Descending' and @data-automation-id='sortArrowDescending']")
    public WebElement sortDescending;

    @FindBy(xpath = "//span[contains(text(),'Result Type')]")
    public WebElement headerResultType;

    @FindBy(xpath = "//span[text()='Result Type']//following::label[text()='Value']//following::input[@data-automation-id='textInputBox']")
    public WebElement valueResultType;

    @FindBy(xpath = "//span[text()='Result Type']//following::button[@data-automation-id='uic_filterButton' and @title='Filter']")
    public WebElement btnFilterResultType;


    //----------------------
    @FindBy(xpath = "//span[text()='Payroll Input']//following::img[@data-automation-id='RELATED_TASK_charm' and @aria-label='Related Actions'][1]")
    public WebElement actionsDeleteEandD;


    @FindBy(xpath = "//h2[text()='Actions']//following::div[text()='Payroll Input'][1]")
    public WebElement payrollInputDeleteEandD;

    @FindBy(xpath = "//h2[text()='Actions']//following::div[text()='Payroll Input'][1]//following::div[text()='Delete']")
    // @FindBy(xpath = "//div[text()='Delete']")
    public WebElement deleteInputDeleteEandD;


    @FindBy(xpath = "//label[text()='Confirm']//following::div[@data-automation-id='checkboxPanel']")
    public WebElement chkboxConfirmDeleteEandD;


    @FindBy(xpath = "//span[text()='Delete Payroll Input']//following::div[contains(text(),'The task was completed successfully')]")
    public WebElement validateMsgSuccessDeleteEandD;


    //---------------------------------------------------------
    @FindBy(xpath = "//span[text()='Start Date']")
    public WebElement labelStartDate;

    @FindBy(xpath = "//span[text()='End Date']")
    public WebElement labelEndDate;

//--empPayTypeCheck-----------------------

    @FindBy(xpath = "//label[text()='Position']//following::div[@data-automation-id='promptOption' and @role='link'][1]")
    public WebElement linkPositionCheck;

    @FindBy(xpath = "//span[text()='Job Details']//following::label[text()='Pay Rate Type']//following::div[@data-automation-id='promptOption' and @role='link']")
    public WebElement payRateTypeCheck;

    @FindBy(xpath = "//span[text()='Plan Type']//following::div[@data-automation-id='textView' and contains(text(),'Hourly')][1]")
    public WebElement payRateTypeHourly;

    @FindBy(xpath = "//span[text()='Plan Type']//following::div[@data-automation-id='textView' and contains(text(),'Salary')][1]")
    public WebElement payRateTypeSalary;


    //--------PaySlip----------

    @FindBy(xpath = "(//div[text()='Payslips'])[1]")
    public WebElement idPaySlips;

    @FindBy(xpath = "//div[text()='Current']//following::td[1]")
    public WebElement GrossPayAmtPaySlips;

    @FindBy(xpath = "//div[text()='Current']//following::td[2]")
    public WebElement PreTaxPaySlips;

    @FindBy(xpath = "//div[text()='Current']//following::td[3]")
    public WebElement EmployeeTaxPaySlips;

    @FindBy(xpath = "//div[text()='Current']//following::td[4]")
    public WebElement PostTaxPaySlips;

    @FindBy(xpath = "//div[text()='Current']//following::td[5]")
    public WebElement NetPayAmtPaySlips;

    @FindBy(xpath = "//*[@data-automation-id='gridTitleLabel' and text()='Payslips']//following::*[@data-automation-id='MainContainer']")
    public WebElement mytablePayslip;


//----View Results------

    @FindBy(xpath = "(//div[text()='Results'])[1]")
    public WebElement idResults;

    @FindBy(xpath = "//h2[contains(text(),'Gross Pay: ')]")
    public WebElement GrossPayAmtResults;

    @FindBy(xpath = "//h2[contains(text(),'Net Pay: ')]")
    public WebElement NetPayAmtResults;

//-----Run-On-Demand-----

    @FindBy(xpath = "//div[text()='Payroll']")
    public WebElement payrollROD;

    @FindBy(xpath = "//div[text()='Run On Demand Payment']")
    public WebElement RunOnDemandROD;

    @FindBy(xpath = "//label[contains(@data-automation-label,'Create Additional Payment')]")
    public WebElement radBtnCreateAdditionalPayROD;

    @FindBy(xpath = "//label[text()='Reason']//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement reasonROD;

    @FindBy(xpath = "//label[text()='Sub-Period Target Date']//following::input[@data-automation-id='dateWidgetInputBox'][1]")
    public WebElement subPeroidTargetDateROD;

    @FindBy(xpath = "//label[text()='Payment Date']//following::input[@data-automation-id='dateWidgetInputBox'][1]")
    public WebElement paymentDateROD;

    @FindBy(xpath = "//label[text()='Priority']//following::input[@data-automation-id='numericInput'][1]")
    public WebElement priorityROD;

    @FindBy(xpath = "//span[text()='Input']//following::button[@data-automation-id='addRow'][1]")
    public WebElement inputAddRowROD;


    @FindBy(xpath = "//span[text()='Input']//following::span[text()='Pay Component']//following::div[@data-automation-id='responsiveMonikerInput'][1]")
    public WebElement payComponentROD;

    @FindBy(xpath = "//span[text()='Payroll Result']//following::img[@data-automation-id='RELATED_TASK_charm' and @aria-label='Related Actions']")
    public WebElement actionsOndemandROD;


    @FindBy(xpath = "//h2[text()='Actions']//following::div[contains(text(),'Pay Calculation')]")
    public WebElement actionPayCalROD;

    @FindBy(xpath = " //h2[text()='Actions']//following::div[contains(text(),'Pay Calculation')]//following::div[text()='Complete']")
    public WebElement actionPayCalCompleteROD;

    @FindBy(xpath = " //h2[text()='Actions']//following::div[contains(text(),'Pay Calculation')]//following::div[text()='Settle']")
    public WebElement actionPayCalSettleROD;

    @FindBy(xpath = "//span[text()='Input']//following::span[text()='Type']//following::button[@title='Add Row'][1]")
    public WebElement btnAddRowROD;

    @FindBy(xpath = "//span[text()='Input']//following::span[text()='Type']//following::button[@title='Add Row'][1]//following::span[@data-automation-id='promptIcon'][1]")
    public WebElement inputTypeROD;

    @FindBy(xpath = "//span[text()='Input']//following::span[text()='Value']//following::input[@data-automation-id='numericInput']")
    public WebElement valueROD;


    @FindBy(xpath = "//div[@data-automation-id='promptOption' andtext()='Requires Re-calculation']")
    public WebElement reCalStatusROD;

    @FindBy(xpath = "//div[text()='Requires Re-calculation']//preceding::img[@data-automation-id='SEARCH_ICON_charm'][1]")
    public WebElement searchReCalROD;


    //--------PaySlip----------


    @FindBy(xpath = "//span[@title='Pre_Tax_Deductions']//following::div[contains(text(),'Accrual')]//following::div[1]")
    public WebElement AccrualPaySlips;

    @FindBy(xpath = "//span[@title='Pre-Tax Deductions']//following::div[contains(text(),'Accrued')]//following::div[1]")
    public WebElement HourAccrualPaySlips;

    @FindBy(xpath = "//span[text()='Payslip Information']//following::div[@data-automation-id='textView'][1]")
    public WebElement EmpnamePaySlips;

    @FindBy(xpath = "//span[text()='Payslip Information']//following::div[@data-automation-id='textView'][2]")
    public WebElement AssIDPaySlips;

    @FindBy(xpath = "//span[text()='Payslip Information']//following::div[@data-automation-id='textView'][3]")
    public WebElement PayStartDatePaySlips;

    @FindBy(xpath = "//span[text()='Payslip Information']//following::div[@data-automation-id='textView'][4]")
    public WebElement PayEndDatePaySlips;

    @FindBy(xpath = "(//div[text()='Tax Elections'])[1]")
    public WebElement taxElectionsTXE;

    @FindBy(xpath = "(//span[@title='Taxes'])[2]//following::div[@title='Canada Pension Plan (CPP) [CAN]']//following::div[5]")
    public WebElement CPPTXE;

    @FindBy(xpath = "(//span[@title='Taxes'])[2]//following::div[@title='Employment Insurance - EI [CAN]']//following::div[5]")
    public WebElement EITXE;

    @FindBy(xpath = "//span[@title='Employee Taxes']//following::div[text()='Canada Pension Plan (CPP)']//following::td[1]")
    public WebElement CPPPaySlips;

    @FindBy(xpath = "//span[@title='Employee Taxes']//following::div[text()='Employment Insurance - EI']//following::td[1]")
    public WebElement EIPaySlips;


    // Assign Pay Group ----------------------------------------------------------------------------------------------------------------


    @FindBy(xpath = "//div[@data-automation-id='promptOption' and @title='Assign Pay Group']")
    private WebElement linkAssignPayGroup;

    @FindBy(xpath = "//label[text()='Effective Date']//following::input[@data-automation-id='dateWidgetInputBox']")
    private WebElement effectiveDateAssignPayGrp;

    @FindBy(xpath = "//label[text()='Associate']//following::div[@data-automation-id='multiselectInputContainer']")
    private WebElement enterAssociateName;

    @FindBy(xpath = "//label[text()='Proposed Pay Group']//following::span[@data-automation-id='promptIcon'][1]")
    private WebElement proposedPayGrp;

    @FindBy(xpath = "//span[text()='Details and Process']")
    private WebElement detailsandprocess;

    @FindBy(xpath = "//label[text()='Overall Status']//following::div[@data-automation-id='textView' and text()='Successfully Completed']")
    private WebElement overallstatus;

    @FindBy(xpath = "//span[text()='Details and Process']//following::div[text()='Process'][1]")
    private WebElement tabProcess;

    @FindBy(xpath = "//*[text()='Awaiting Action']")
    private WebElement chkAwaitingActions;


    //    -------------------------New xpaths added ---------------
    @FindBy(xpath = "//*[text()='Pay']")
    public WebElement PayTabLink;


//----View Results------


    //------------------------------------
    public void payRollCommon(String Emp_ID, String Employeename) throws Exception {
        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        //workdaycommon.searchbySearchBox(Emp_ID);
        workdaycommon.searchbySearchBox(Employeename);
        workdaycommon.userWait(1000);
        workdaycommon.allOfWorkday.click();
        workdaycommon.userWait(3000);
        WebElement associate_name = driver.findElement(By.xpath("(//*[contains(text(),'" + Employeename + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employeename + "')][1]"));
        WebActionsUtil.explicitWait(driver,associate_name,"click");
        workdaycommon.scrolltoElement(associate_name);
        associate_name.click();
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(payTab);
        workdaycommon.userWait(2000);
        payTab.click();
        workdaycommon.userWait(3000);
    }

//--------------------------

    public void loading(String Empname, String payratetype) throws Exception {
        JFrame wdframe = new JFrame("Employee Pay Rate Type ");
        JPanel wdpanel = new JPanel();
        JProgressBar wdbar = new JProgressBar();
        wdbar.setMinimum(0);
        JButton goButton = new JButton("Go");
        Dimension prefSize = goButton.getPreferredSize();
        prefSize.width = 450;//some width
        wdbar.setPreferredSize(prefSize);
        // b.setMaximum();

        wdbar.setStringPainted(true);
        wdpanel.add(wdbar);
        wdpanel.setBackground(Color.LIGHT_GRAY);
        wdframe.add(wdpanel);
        wdframe.setBackground(Color.BLACK);
        wdframe.setSize(600, 75);
        wdframe.setLocationRelativeTo(null);
        wdframe.setVisible(true);

        int i = 0;
        while (i <= 20) {
            // set text accoring to the level to which the bar is filled
            wdbar.setString("The Pay Rate Type of " + Empname + "is : " + payratetype);

            // fill the menu bar
            wdbar.setValue(i + 1);

            // delay the thread
            Thread.sleep(50);
            i++;
        }
        wdframe.dispatchEvent(new WindowEvent(wdframe, WindowEvent.WINDOW_CLOSING));
    }


    public void  Add_Earnings_Deductions(String Emp_ID, String Employee, String PayComponent, String Batch_Id, String InputType, String hours, String Value) throws Exception {

        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);
        log.info("Add_Earnings_Deductions Started.....");
        log.info("Employee Id received:"+Emp_ID);
        log.info("Employee name received:"+Employee);
        //workdaycommon.searchbySearchBox(Emp_ID);
        workdaycommon.searchbySearchBox(Employee);
        workdaycommon.allOfWorkday.click();
        workdaycommon.userWait(3000);
        //WebElement associate_name = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')]"));
        WebElement associate_name = driver.findElement(By.xpath("(//*[contains(text(),'" + Employee + "')]//following::*[text()='Associate'])//preceding::*[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')][1]"));
        workdaycommon.scrolltoElement(associate_name);
        associate_name.click();
        log.info("associate name clicked");
        workdaycommon.userWait(3000);

        try{
            payTab.click();// clicking Pay first cz Compensation was hidden under More option
            compensationTab.click();
            workdaycommon.userWait(2000);
            try {
                if ((payRateTypeHourly.getText().equals("Hourly"))) {
                    String payType = payRateTypeHourly.getText();
                    log.info("Pay type is: " + payType);
                    loading(Employee, payType);
                }
            } catch (NoSuchElementException e) {
                String payType = payRateTypeSalary.getText();
                log.info("Pay type is: " + payType);
                loading(Employee, payType);
            }
        }
        catch(Exception e)
        {
            linkPositionCheck.click();
            String payType = payRateTypeCheck.getText();
            log.info("Pay type is: " + payType);
            workdaycommon.userWait(2000);
            loading(Employee, payType);
            workdaycommon.userWait(2000);
            WebElement associateName = driver.findElement(By.xpath("//label[text()='Associate']//following::div[@data-automation-id='promptOption' and contains(text(),'" + Employee + "')]"));
            associateName.click();
        }


//        WebElement associateName = driver.findElement(By.xpath("(//*[text()='Associate'])//following::*[@data-automation-id='promptOption'][1]"));
//        associateName.click();
        log.info("Pay Tab Selected...1111.1...");
        //associate_name.click();
        workdaycommon.scroll();
        log.info("Pay Tab Selected...1111.2...");
        workdaycommon.scrollDOWN_height();
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(payTab);
        workdaycommon.userWait(3000);
        payTab.click();
        workdaycommon.userWait(2000);
        log.info("Pay Tab Selected....1...");

//        WebActionsUtil.explicitWait(driver,actionsAddEandD,"click");
        actionsAddEandD.click();
        workdaycommon.userWait(3000);
        log.info("Pay Tab Selected....22...");
        workdaycommon.mousemove(payInputAssociateAddEandD, addInputAddEandD);
        //addInputAddEandD.click();
        log.info("Pay Tab Selected....2...");
        workdaycommon.userWait(3000);
        log.info("Entering Batch_ID");
        workdaycommon.scrolltoElement(batchAddEandD);
        batchAddEandD.click();
        log.info("Pay Tab Selected....4...");
        workdaycommon.userWait(3000);
        insidesearchboxcommon.sendKeys(Batch_Id, Keys.ENTER);
        //WebElement batchID=driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and @data-automation-label='"+Batch_Id+"' and text()='"+Batch_Id+"']"));
        //batchID.click();
        log.info("Pay Tab Selected....5...");

        // workdaycommon.selectfromduplicates(Batch_Id);
        workdaycommon.userWait(3000);
        log.info("Entering Pay Component");
        workdaycommon.scrolltoElement(payCompAddEandD);
        payCompAddEandD.click();
        workdaycommon.userWait(3000);
        //myExecutor.executeScript("arguments[0].setAttribute('value', arguments[1])", payCompAddEandD, PayComponent);
        insidesearchboxcommon.sendKeys(PayComponent, Keys.ENTER);
        workdaycommon.userWait(3000);
        workdaycommon.scrolltoElement(inputdetailsAddEandD);
        log.info("Entering Amount");

        JavascriptExecutor myExecutor= (JavascriptExecutor)driver;
        try {
            if (inputTypeAddEandD.isDisplayed()) {
                workdaycommon.userWait(3000);
                inputTypeAddEandD.click();
                workdaycommon.userWait(4000);
                WebElement type = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(@data-automation-label,'" + InputType + "') and contains(text(),'" + InputType + "')]"));
                WebActionsUtil.explicitWait(driver, type, "click");
                type.click();
                workdaycommon.userWait(3000);
                myExecutor.executeScript("arguments[0].setAttribute('value', arguments[1])", btnAddRowAddEandD, "Amount");
                insidesearchboxcommon.sendKeys(InputType,Keys.ENTER);
                workdaycommon.userWait(3000);
                log.info(" Amount Entered");
            }
        } catch (NoSuchElementException ex) {
            log.info("....Inside Catch block for entering Input type...");

            JavascriptExecutor jstBtnAddRow = (JavascriptExecutor) driver;
            workdaycommon.scrolltoElement(btnAddRowAddEandD);
            jstBtnAddRow.executeScript("arguments[0].click () ", btnAddRowAddEandD);
            workdaycommon.userWait(1000);

            //btnAddRowAddEandD.click();
            workdaycommon.userWait(2000);
            WebActionsUtil.explicitWait(driver, inputTypeAddEandD, "click");
            inputTypeAddEandD.click();
            workdaycommon.userWait(3000);
            WebElement type = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(@data-automation-label,'" + InputType + "') and contains(text(),'" + InputType + "')]"));
            //WebActionsUtil.explicitWait(driver, type, "click");
            type.click();
            workdaycommon.userWait(3000);
            myExecutor.executeScript("arguments[0].setAttribute('value', arguments[1])", btnAddRowAddEandD, "Amount");
            insidesearchboxcommon.sendKeys(InputType,Keys.ENTER);

            workdaycommon.userWait(3000);
            log.info(" Amount Entered");
        }

        log.info("Entering Value");
        workdaycommon.scrolltoElement(valueAddEandD);
        valueAddEandD.click();
        valueAddEandD.clear();
        valueAddEandD.sendKeys(Keys.BACK_SPACE);
        valueAddEandD.sendKeys(Value, Keys.ENTER);
        // myExecutor.executeScript("arguments[0].setAttribute('value', arguments[1])", valueAddEandD, Value);
        workdaycommon.userWait(3000);
        log.info(" Value Entered");
        btn_OK.click();
        workdaycommon.userWait(2000);

       /* //uncomment only when needed
        btn_recal.click();
        workdaycommon.userWait(2000);
        btn_OK.click();
        workdaycommon.userWait(2000);
        btn_Done.click();

        validation_PayInput(Batch_Id, Value, PayComponent, InputType, Employeename);
*/
    }


    public void validation_PayInput(String Emp_ID, String Employee, String PayComponent, String Batch_Id, String InputType, String Value) throws Exception {

        // this starts after coming to the page Associate Profile --> Pay Tab
        log.info("Validating Payroll Input started.....");
        test.info("Validating Payroll Input");
        payRollCommon(Emp_ID, Employee);
//        payRollCommon(Employee, Employee); //for now using name to searching the employee
        try {
            String payPeriod = driver.findElement(By.xpath("//span[text()='Period']//following::img[@data-automation-id='SEARCH_ICON_charm'][1]//following::div[@data-automation-id='promptOption'][1]")).getText();
            log.info(payPeriod);
            String[] date = payPeriod.split("-");// Splitted the PayPeriod into StartDate and EndDate
            String start = date[0];
            String end = date[1];
            log.info("Before splitting: " + start + "" + end);
            StringBuilder StartDate = new StringBuilder(start);
            StartDate.deleteCharAt(10);
            StringBuilder EndDate = new StringBuilder(end);//Deleting space and Brackets after EndDate
            EndDate.delete(end.indexOf("(") - 1, end.length());
            EndDate.delete(0, 1);//Deleting a space before EndDate
            String startDate = StartDate.toString();
            String endDate = EndDate.toString();
            log.info("After splitting: " + startDate + " " + endDate);

            inputTab.click();
            workdaycommon.scrolltoElement(headerBatchID);
            headerBatchID.click();
            workdaycommon.userWait(2000);
            valueBatchID.click();
            workdaycommon.userWait(2000);
            insidesearchboxcommon.sendKeys(Batch_Id, Keys.ENTER);
            workdaycommon.userWait(2000);
            clickValueBatchID.click();
            workdaycommon.userWait(2000);
            btnFilterBatchID.click();
            workdaycommon.userWait(2000);
            workdaycommon.scrolltoElement(headerLastUpdated);
            headerLastUpdated.click();
            workdaycommon.userWait(2000);
            try {
                if (sortDescending.isDisplayed()) {
                    workdaycommon.userWait(2000);
                    workdaycommon.scrollUP_height();
                    sortDescending.click();
                    workdaycommon.userWait(2000);
                }
            } catch (NoSuchElementException e) {
                workdaycommon.userWait(2000);
                headerLastUpdated.click();
                log.info("Sort Descending option is not present, as we have only row in the table");
            }

            workdaycommon.userWait(2000);

            WebElement batchID_check = driver.findElement(By.xpath("//span[text()='Batch ID']//following::div[@data-automation-id='promptOption' and @data-automation-label='" + Batch_Id + "'][1]"));

            WebElement payComponent = driver.findElement(By.xpath("(//div[text()='" + Batch_Id + "'])[1]//following::div[@data-automation-id='promptOption' and contains(@title,'" + PayComponent + "')][1]"));
            workdaycommon.scrolltoElement(payComponent);
            String pay = payComponent.getText();
            String[] paySplit = pay.split("-");// Splitted the payComponent into first and second
            String first = paySplit[0];
            //String second = paySplit[1]; //uncomment if needed
            StringBuilder Component = new StringBuilder(first);
            Component.deleteCharAt(5);
            String payComponent_check = Component.toString();


            log.info("Checking BatchID and PayComponent");
            // if((Batch_Id.equals(batchID_check.getText()))&&(startDate.equals(startDate_check.getText()))&&(endDate.equals(endDate_check.getText()))&&(InputType.equals(inputType_check.getText()))&&(Value.equals(value_check.getText())))
            if ((Batch_Id.equals(batchID_check.getText())) && (PayComponent.equals(payComponent_check))) {
                log.info(" BatchID and PayComponent checked");

                WebElement startDate_check = driver.findElement(By.xpath("(//div[text()='" + Batch_Id + "'])[1]//following::div[@data-automation-id='textView'][1]"));
                workdaycommon.scrolltoElement(startDate_check);

                WebElement endDate_check = driver.findElement(By.xpath("(//div[text()='" + Batch_Id + "'])[1]//following::div[@data-automation-id='textView'][2]"));
                workdaycommon.scrolltoElement(endDate_check);
                log.info("Now Checking for StartDate and EndDate");

                if ((startDate.equals(startDate_check.getText())) && (endDate.equals(endDate_check.getText()))) {
                    log.info(" StartDate and EndDate checked");
                    WebElement inputType_check = driver.findElement(By.xpath("(//div[text()='" + Batch_Id + "'])[1]//following::div[@data-automation-id='promptOption'][5]"));
                    workdaycommon.scrolltoElement(inputType_check);

                    WebElement value_check = driver.findElement(By.xpath("(//div[text()='" + Batch_Id + "'])[1]//following::div[@data-automation-id='numericText'][1]"));
                    workdaycommon.scrolltoElement(value_check);

                    log.info("Now Checking for InputType and value");

                    log.info("Input Type captured: " + inputType_check.getText());
                    log.info("Input Type from Feature file: " + InputType);
                    log.info("value check: " + value_check.getText());
                    log.info("Value from feature file: " + Value);

                    if ((InputType.equals(inputType_check.getText())) && (Value.equals(value_check.getText()))) {
                        test.info("Validation is done successfully");
                        log.info(" InputType and Value checked");
                        test.pass("Earning/Deductions are Successfully added for the Associate : " + Employee);
                        log.info("Earning/Deductions are Successfully added for the Associate : " + Employee);
                        test.info("BP: Payroll - Add an Earning /DEduction to an Associate, Associate: " + Employee + ", Pay Period: " + payPeriod + ", Earning/Deduction added: " + PayComponent + ", Pay RateType: " + InputType + ", Value: " + Value);
                    } else {
                        log.info("InputType/Value doesn't match");
                    }
                } else {
                    log.info("Start Date/End Date not matched");
                }

            } else {
                test.fail("Failed to add an Earning/Deduction for an Associate");
                log.info("Failed to add an Earning/Deduction for an Associate");
                driver.quit();
            }
        } catch (Exception e) {
            test.error("Error message: " + e.getMessage());
            log.error("Error message: " + e.getMessage());
            driver.quit();
        }
    }

    public List<String> ViewResults(String Emp_ID, String Employee, String PeriodStartDate, String PeriodEndDate) throws Exception {
        String ReplaceGross1 = "";
        String ReplaceNetAmt1 = "";
        String CPPtax = "";
        String EItax = "";

        try {

            log.info("-----------------------View Results Started---------------------------------------");
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
            workdaycommon.searchbySearchBox(Emp_ID);
            workdaycommon.userWait(4000);
            WebElement associate_name = driver.findElement(By.xpath("(//*[text()='Associate'])//preceding::*[@data-automation-id='promptOption'][1]"));
            workdaycommon.scrolltoElement(associate_name);
            associate_name.click();
            workdaycommon.userWait(4000);
            workdaycommon.scroll();
            workdaycommon.userWait(3000);
            workdaycommon.scrolltoElement(payTab);
            payTab.click();
            workdaycommon.userWait(3000);
            workdaycommon.scrolltoElement(idResults);
            idResults.click();
            workdaycommon.userWait(5000);
            WebElement mytable = driver.findElement(By.xpath("(//div[@data-automation-id='MainContainer'])"));
            List<WebElement> rowstable = mytable.findElements(By.tagName("tr"));
            int rowscount = rowstable.size();
            log.info("Row Count--->" + rowscount);

            for (int i = 0; i < rowscount; i++) {
                List<WebElement> Columnrow = rowstable.get(i).findElements(By.tagName("td"));
                int columncount = Columnrow.size();
                log.info("Number of cells In Row " + i + " are " + columncount);
                for (int j = 0; j < columncount; j++) {
                    String celtext = Columnrow.get(j).getText();
                    if (celtext.contains(PeriodStartDate)) {
                        log.info("Period Start date Matched--->" + celtext);
                        log.info("Period Start in Data     --->" + PeriodStartDate);
                        WebElement EndDate = driver.findElement(By.xpath("//div[contains(text(),'" + PeriodStartDate + " - " + PeriodEndDate + "')]"));
                        workdaycommon.scrolltoElement(EndDate);
                        workdaycommon.userWait(3000);
                        String EndDateValue = EndDate.getText();
                        log.info("EndDateValue--->" + EndDateValue);

                        if (EndDateValue.contains(PeriodEndDate)) {
                            log.info("Period End date Matched--->" + EndDateValue);
                            log.info("Period End in data     --->" + PeriodEndDate);
                            test.info("Period Start and End Date in View Results Screen: " + celtext);
                            WebElement SearchBtn = driver.findElement(By.xpath("//div[contains(text(),'" + PeriodStartDate + " - " + PeriodEndDate + "')]//preceding::img[@data-automation-id='SEARCH_ICON_charm'][1]"));
                            SearchBtn.click();
                            workdaycommon.userWait(5000);

                            try {
                                //Gross Amount
                                workdaycommon.scrolltoElement(GrossPayAmtResults);
                                String GrossAmount = GrossPayAmtResults.getText();
                                log.info("Gross Amount--->" + GrossAmount);
                                String ReplaceGross = GrossAmount.replace("Gross Pay: ", " ");
                                ReplaceGross1 = ReplaceGross.replace("CAD", " ").trim();
                                log.info("Replace Gross Amount-->" + ReplaceGross1);

                                //Net Amount
                                workdaycommon.scrolltoElement(NetPayAmtResults);
                                String NetAmount = NetPayAmtResults.getText();
                                log.info("Net Amount--->" + NetAmount);
                                String ReplaceNetAmt = NetAmount.replace("Net Pay: ", " ");
                                ReplaceNetAmt1 = ReplaceNetAmt.replace("CAD", " ");
                                log.info("Replace NetPay Amount-->" + ReplaceNetAmt1);
                                taxElections();


                                test.info("Gross Amount:  " + ReplaceGross1 + " , " + "NetPay Amount:  " + ReplaceNetAmt1);

                                test.pass("PayPeriod details are captured Successfully");


                            } catch (Exception e) {
                                test.fail("PayPeriod details are not captured Successfully");

                            }

                        }
                    }
                }
            }
        } catch (Exception e) {
            workdaycommon.takescreenshotUI("Exception", Emp_ID);
            log.error("Exception/Issue occurred:" + e.getMessage());
            //test.fail(e.getMessage());
        }


        List<String> listStrings = new LinkedList<String>();
        listStrings.add(ReplaceGross1);
        listStrings.add(ReplaceNetAmt1);
        listStrings.add(CPPtax);
        listStrings.add(EItax);

        return listStrings;
    }

    public List<String> ViewPayslips(String Emp_ID, String Employee, String PeriodStartDate, String PeriodEndDate) throws Exception {

        String GrossPayValueValid = "";
        String NetPayCurrentValueValid = "";
        String CPPaMT = "";
        String EIaMT = "";
        try {
            log.info("-----------------------View Payslips Started---------------------------------------");

            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);
            workdaycommon.searchbySearchBox(Emp_ID);
            workdaycommon.userWait(4000);
            WebElement associate_name = driver.findElement(By.xpath("(//*[text()='Associate'])//preceding::*[@data-automation-id='promptOption'][1]"));
            workdaycommon.scrolltoElement(associate_name);
            associate_name.click();
            workdaycommon.userWait(4000);
            linkPositionCheck.click();
            workdaycommon.userWait(4000);
            String payType = payRateTypeCheck.getText();
            log.info("Pay type---->" + payType);
            loading(Employee, payType);
            WebElement associateName = driver.findElement(By.xpath("//label[text()='Associate']//following::div[@data-automation-id='promptOption']"));
            associateName.click();
            workdaycommon.userWait(3000);
            workdaycommon.scroll();
            workdaycommon.userWait(3000);
            workdaycommon.scrolltoElement(payTab);
            payTab.click();
            workdaycommon.userWait(3000);
            workdaycommon.scrolltoElement(idPaySlips);
            idPaySlips.click();
            workdaycommon.userWait(3000);
            //    WebElement mytable = driver.findElements(By.xpath("(//div[@data-automation-id='MainContainer'])[3]"));
            List<WebElement> rowstable = mytablePayslip.findElements(By.tagName("tr"));
            int rowscount = rowstable.size();
            log.info("Row Count--->" + rowscount);
            for (int i = 1; i < rowscount; i++) {
                List<WebElement> Columnrow = rowstable.get(i).findElements(By.tagName("td"));
                int columncount = Columnrow.size();
                //log.info("Number of cells In Row " + i + " are " + columncount);
                for (int j = 0; j < columncount; j++) {
                    String celtext = Columnrow.get(j).getText();
                    if (celtext.equals(PeriodStartDate)) {
                        log.info("Period Start date Matched--->" + celtext);
                        log.info("Period Start in Data     --->" + PeriodStartDate);
                        WebElement EndDate = driver.findElement(By.xpath("//div[text()='" + PeriodStartDate + "']//following::td[1]"));
                        workdaycommon.scrolltoElement(EndDate);
                        workdaycommon.userWait(3000);
                        String EndDateValue = EndDate.getText();
                        if (EndDateValue.equals(PeriodEndDate)) {
                            log.info("Period End date Matched--->" + EndDateValue);
                            log.info("Period End in data     --->" + PeriodEndDate);
                            test.info("Period Start and End Date in ViewPayslip Screen: " + celtext + "---" + EndDateValue);
                            WebElement viewBtn = driver.findElement(By.xpath("//div[text()='" + PeriodStartDate + "']//following::div[text()='" + PeriodEndDate + "']//following::td[4]"));
                            viewBtn.click();
                            workdaycommon.userWait(5000);

                            workdaycommon.scrolltoElement(EmpnamePaySlips);
                            workdaycommon.userWait(2000);
                            String EmpnamePaySlips1 = EmpnamePaySlips.getText();
                            String AssIDPaySlips1 = AssIDPaySlips.getText();
                            String PayStartDatePaySlips1 = PayStartDatePaySlips.getText();
                            String PayEndDatePaySlips1 = PayEndDatePaySlips.getText();
                            log.info("PayStartDatePaySlips1--->" + PayStartDatePaySlips1);
                            log.info("PayEndDatePaySlips--->" + PayEndDatePaySlips1);


                            // if (PayStartDatePaySlips1.equals(PeriodStartDate) && PayEndDatePaySlips1.equals(PeriodEndDate))
                            //  {
                            String GrossPayValue = GrossPayAmtPaySlips.getText();
                            //log.info("Gross pay Value--->" + GrossPayValue);

                            StringBuilder str = new StringBuilder(GrossPayValue);
                            log.info("GrossValue  string ----> " + str);
                            str.deleteCharAt(1);
                            log.info("After deletion = " + str);

                            String GrossPayValue11 = str.toString();
                            float GrossPayValue1 = Float.parseFloat(GrossPayValue11);
                            log.info("GrossPayValue1 Current Value--->" + GrossPayValue1);

                            GrossPayValueValid = String.valueOf(GrossPayValue1);
                            log.info("GrossPayValueValid Current Value--->" + GrossPayValueValid);

                            String NetPayCurrentValue = NetPayAmtPaySlips.getText();
                            log.info("NetPayAmtPaySlips Current Value--->" + NetPayCurrentValue);

                            StringBuilder str1 = new StringBuilder(NetPayCurrentValue);
                            log.info("GrossValue  string ----> " + str1);
                            str1.deleteCharAt(1);
                            log.info("After deletion = " + str1);

                            String NetPayCurrentValue11 = str1.toString();
                            float NetPayCurrentValue1 = Float.parseFloat(NetPayCurrentValue11);

                            NetPayCurrentValueValid = String.valueOf(NetPayCurrentValue1);
                            log.info("NetPayCurrentValueValid Current Value--->" + NetPayCurrentValueValid);

                            String PreTaxDeduction = PreTaxPaySlips.getText();
                            log.info("PreTaxDeduction Current Value--->" + PreTaxDeduction);
                            float PreTaxDeduction1 = Float.parseFloat(PreTaxDeduction);

                            String EmployeeTax = EmployeeTaxPaySlips.getText();
                            log.info("EmployeeTaxPaySlips Current Value--->" + EmployeeTax);
                            float EmployeeTax1 = Float.parseFloat(EmployeeTax);

                            String PostTaxDeduction = PostTaxPaySlips.getText();
                            log.info("PostTaxPaySlips Current Value--->" + PostTaxDeduction);
                            float PostTaxDeduction1 = Float.parseFloat(PostTaxDeduction);

                            workdaycommon.scrolltoElement(CPPPaySlips);
                            CPPaMT = CPPPaySlips.getText();
                            log.info("CPP: " + CPPaMT.trim());

                            EIaMT = EIPaySlips.getText();
                            log.info("EI: " + EIaMT.trim());


                            log.info("---------After converting into Float------->");
                            test.info("Employeename: " + EmpnamePaySlips1 + ", " + "AssociateID: " + AssIDPaySlips1 + ", " + "PeriodStartDate: " + PayStartDatePaySlips1 +
                                    ", " + "PeriodEndDate: " + PayEndDatePaySlips1);


                            test.info("GrossPayValue: " + GrossPayValue1 + " , " + " PreTaxDeduction: " + PreTaxDeduction1 +
                                    " , " + " EmployeeTax: " + EmployeeTax1 + " , " + " PostTaxDeduction: " + PostTaxDeduction1 +
                                    " , " + "NetPayCurrentValue1: " + NetPayCurrentValue1);

                            test.info("CPP: " + CPPaMT + " , " + "EI: " + EIaMT);
                            //test.info("PreTaxDeduction Value--->" + PreTaxDeduction1);
                            //test.info("EmployeeTax Value--->" + EmployeeTax1);
                            // test.info("PostTaxDeduction Value--->" + PostTaxDeduction1);
                            // test.info("NetPayCurrentValue1 Value--->" + NetPayCurrentValue1);

                            float TotalNetPay = GrossPayValue1 - (PreTaxDeduction1 + EmployeeTax1 + PostTaxDeduction1);
                            test.info("TotalNetPay Value:  " + TotalNetPay);

                            try {
                                log.info("Accrual Started.....");
                                workdaycommon.userWait(3000);
                                if (payType.equalsIgnoreCase("Salary")) {
                                    if (AccrualPaySlips.isDisplayed()) {
                                        String Accrual1 = AccrualPaySlips.getText();
                                        log.info("Accrual Salary--->" + Accrual1);
                                        float Accrual = Float.parseFloat(Accrual1);
                                        float AfterAddAccrual = TotalNetPay + Accrual;
                                        test.info("After Adding Accrual, Now NetPay Value is--->" + AfterAddAccrual);
                                    }
                                } else if (payType.equalsIgnoreCase("Hourly")) {
                                    if (HourAccrualPaySlips.isDisplayed()) {
                                        String HAccrual1 = HourAccrualPaySlips.getText();
                                        log.info("Accrual Hourly--->" + HAccrual1);
                                        float HAccrual = Float.parseFloat(HAccrual1);
                                        float HAfterAddAccrual = TotalNetPay + HAccrual;
                                        test.info("After Adding Hourly Accrual Value--->" + HAfterAddAccrual);
                                    }
                                }

                            } catch (Exception e) {
                                test.info("Accrual value is not Available...");
                                test.fail("PaySlip Validation not Completed Successfully");

                            }

                            //   } else {
                            //         test.fail("Pay Period Start and End Dates are mismatching");
                            //    }

                        }
                    } else {
                        log.info("Value not matched.. " + i + "---" + j + "--->" + celtext);
                        log.info("Execution Completed ");
                    }
                }
            }
        } catch (Exception e) {
            workdaycommon.takescreenshotUI("Exception", Emp_ID);
            log.error("Exception/Issue occurred:" + e.getMessage());
            //  test.fail(e.getMessage());
        }
        List<String> listStrings1 = new LinkedList<String>();
        listStrings1.add(GrossPayValueValid);
        listStrings1.add(NetPayCurrentValueValid);
        listStrings1.add(CPPaMT);
        listStrings1.add(EIaMT);
        return listStrings1;
    }


// End of New Validation Code---------------

    public void Delete_Earnings_Deductions(String Emp_ID, String Employeename, String Batch_Id, String PayComponent) throws Exception {
        payRollCommon(Emp_ID, Employeename);
        workdaycommon.userWait(3000);
        inputTab.click();
        workdaycommon.userWait(3000);
        headerBatchID.click();
        workdaycommon.userWait(2000);
        valueBatchID.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(Batch_Id, Keys.ENTER);
        workdaycommon.userWait(2000);
        clickValueBatchID.click();
        workdaycommon.userWait(2000);
        btnFilterBatchID.click();
        workdaycommon.userWait(2000);
        workdaycommon.scrolltoElement(headerPayComponent);
        headerPayComponent.click();
        workdaycommon.userWait(2000);
        ValueComponent.click();
        workdaycommon.userWait(2000);
        insidesearchboxcommon.sendKeys(PayComponent, Keys.ENTER);
        workdaycommon.userWait(2000);
        ValueText.click();
        workdaycommon.userWait(2000);
        btnFilterBatchID.click();
        workdaycommon.userWait(4000);

        workdaycommon.scrolltoElement(headerLastUpdated);
        headerLastUpdated.click();
        try {
            if (sortDescending.isDisplayed()) {
                workdaycommon.userWait(2000);
                workdaycommon.scrollUP_height();
                sortDescending.click();
                workdaycommon.userWait(2000);
            }
        } catch (NoSuchElementException e) {
            log.info("Sort Descending option is not present");
        }

        log.info(" Clicking on Current PayPeriod action ");
        workdaycommon.scrolltoElement(actionsDeleteEandD);
        actionsDeleteEandD.click();
        workdaycommon.mousemove(payrollInputDeleteEandD, deleteInputDeleteEandD);
        //deleteInputDeleteEandD.click();
        chkboxConfirmDeleteEandD.click();
        workdaycommon.userWait(2000);
        btn_OK.click();
        workdaycommon.userWait(2000);
        try {
            if (validateMsgSuccessDeleteEandD.isDisplayed()) {
                log.info("Pay Input is deleted successfully");
                btn_Done.click();
                workdaycommon.userWait(2000);
                test.pass("Pay Input is deleted successfully");

            } else {
                log.info("Pay Input is not deleted successfully");
                test.fail("Pay Input is deleted successfully");
            }
        } catch (Exception e) {
            test.error("Error message: " + e.getMessage());
            log.error("Error message: " + e.getMessage());
        }

    }


    public void Recalculate_Payroll_Results(String Emp_ID, String Employee) throws Exception {
        test.info("Re-calculating Payroll Input");
        log.info("Re-calculating Payroll Input is started");
        payRollCommon(Emp_ID, Employee); //uncomment when needed
//        payRollCommon(Employee, Employee); //for now using name to searching the employee
        payTab.click();//comment when uncommenting the previous lines
        search_icon.click();
        workdaycommon.userWait(1000);
        workdaycommon.scrolltoElement(btn_recal);
        btn_recal.click();
        workdaycommon.userWait(1000);
        btn_OK.click();
        workdaycommon.userWait(1000);
        btn_Done.click();
        workdaycommon.userWait(3000);
        log.info("Re-calculating Payroll Input is ended");
        test.info("Re-calculation is done successfully");

      /*  //back to Associate's profile page
        WebElement associateName=driver.findElement(By.xpath("//label[text()='Associate']//following::div[@data-automation-id='promptOption' and text()='"+Employeename+"']"));
        associateName.click();
*/
    }


    public void Run_ONDemands(String Emp_ID, String Employeename, String SubPeriodTargetDate, String PaymentDate, String Reason_PayCal, String Priority, String PayComponent, String InputType, String Value) throws Exception {
        try {
            workdaycommon.setDriver(driverWrapper);
            workdaycommon.setExtentTest(test);


            test.info(" Run On Demand Payment process begins");

            test.info(" Run On Demand Pay Calculation to initiate process begins ");
            //workdaycommon.searchbySearchBox(Emp_ID);
            workdaycommon.searchbySearchBox(Employeename);

            workdaycommon.userWait(4000);
            WebElement associate_name = driver.findElement(By.xpath("(//*[text()='Associate'])//preceding::*[@data-automation-id='promptOption'][1]"));
            workdaycommon.scrolltoElement(associate_name);
            associate_name.click();


            workdaycommon.clickAction.click();
            workdaycommon.userWait(1000);
            workdaycommon.mousemove(payrollROD, RunOnDemandROD);
            workdaycommon.userWait(4000);
            log.info("Clicked on Run On Demand Payment");
            radBtnCreateAdditionalPayROD.click();
            workdaycommon.userWait(4000);
            btn_OK.click();
            workdaycommon.userWait(2000);
            btn_OK.click();
            workdaycommon.userWait(2000);
            workdaycommon.userWait(4000);
            reasonROD.click();
            workdaycommon.userWait(3000);
            insidesearchboxcommon.sendKeys(Reason_PayCal, Keys.ENTER);

            workdaycommon.userWait(3000);
            //  workdaycommon.scrolltoElement(subPeroidTargetDateROD);
            workdaycommon.userWait(3000);
            if (driverWrapper.isElementPresent(subPeroidTargetDateROD)) {//datePickerButton           //dateWidgetContainer
                for (WebElement elem : driver.findElements(By.xpath("//label[text()='Sub-Period Target Date']//following::input[@data-automation-id='dateWidgetInputBox'][1]"))) {
                    log.info(" Selecting Sub Period Target Date ......." + SubPeriodTargetDate);
                    elem.sendKeys(SubPeriodTargetDate);
                }
            }
            workdaycommon.userWait(3000);
            workdaycommon.scrolltoElement(paymentDateROD);
            workdaycommon.userWait(3000);
            if (driverWrapper.isElementPresent(paymentDateROD)) {
                for (WebElement elem : driver.findElements(By.xpath("//label[text()='Payment Date']//following::input[@data-automation-id='dateWidgetInputBox'][1]"))) {
                    log.info("Selecting Payment Date ......." + PaymentDate);
                    elem.sendKeys(PaymentDate);
                }
            }

            workdaycommon.scrolltoElement(priorityROD);
            workdaycommon.userWait(1000);
            priorityROD.sendKeys(Priority, Keys.ENTER);
            workdaycommon.userWait(2000);

            workdaycommon.scrolltoElement(inputAddRowROD);
            inputAddRowROD.click();
            workdaycommon.userWait(1000);

            payComponentROD.click();
            workdaycommon.userWait(1000);
            insidesearchboxcommon.sendKeys(PayComponent, Keys.ENTER);
            workdaycommon.userWait(2000);


            log.info("Entering Amount");
            try {
                if (inputTypeROD.isDisplayed()) { //inputTypeROD
                    inputTypeROD.click();
                    workdaycommon.userWait(3000);
                    WebElement type = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(@data-automation-label,'" + InputType + "') and contains(text(),'" + InputType + "')]"));
                    type.click();
                    workdaycommon.userWait(3000);
                    log.info(" Amount Entered");
                }
            } catch (NoSuchElementException ex) {
                btnAddRowROD.click();
                inputTypeROD.click();
                workdaycommon.userWait(3000);
                WebElement type = driver.findElement(By.xpath("//div[@data-automation-id='promptOption' and contains(@data-automation-label,'" + InputType + "') and contains(text(),'" + InputType + "')]"));
                type.click();
                workdaycommon.userWait(3000);
                log.info(" Amount Entered");
            }

            valueROD.sendKeys(Value, Keys.ENTER);

            btn_OK.click();
            workdaycommon.userWait(2000);
            btn_Done.click();
            test.info(" Run On Demand Pay Calculation is intiated successfully");


            payTab.click();
            test.info(" Run On Demand Pay Calculation to Complete process begins ");
            //payRollCommon(Emp_ID,Employeename);
            log.info("clicking On Demand Action for completing the Pay Calculation ");
            actionsOndemandROD.click();
            log.info(" On Demand Action clicked");
            workdaycommon.userWait(2000);
            workdaycommon.mousemove(actionPayCalROD, actionPayCalCompleteROD);
            workdaycommon.userWait(2000);
            btn_OK.click();
            workdaycommon.userWait(2000);
            btn_Done.click();
            workdaycommon.userWait(2000);
            test.info(" Run On Demand Pay Calculation is completed successfully");

            payTab.click();
            test.info(" Run On Demand Pay Calculation to Settle process begins ");
            //payRollCommon(Emp_ID,Employeename);
            workdaycommon.userWait(2000);
            log.info("clicking On Demand Action for settling the Pay Calculation ");
            actionsOndemandROD.click();
            log.info(" On Demand Action clicked");
            workdaycommon.userWait(2000);
            workdaycommon.mousemove(actionPayCalROD, actionPayCalSettleROD);
            workdaycommon.userWait(2000);
            btn_OK.click();
            workdaycommon.userWait(2000);
            btn_Done.click();
            workdaycommon.userWait(2000);
            test.info(" Run On Demand Pay Calculation is settled successfully");

          /*  //Re-calculating the Pay roll results
            workdaycommon.scrolltoElement(reCalStatusROD);
            searchReCalROD.click();
            workdaycommon.userWait(3000);
            workdaycommon.scrolltoElement(btn_recal);
            btn_recal.click();
            workdaycommon.userWait(1000);
            btn_OK.click();
            workdaycommon.userWait(1000);
            btn_Done.click();
            workdaycommon.userWait(3000);
            log.info("Re-calculating Payroll Input is ended");
            test.info("Re-calculation is done successfully");
            WebElement associateName=driver.findElement(By.xpath("//label[text()='Associate']//following::div[@data-automation-id='promptOption']"));
            associateName.click();
*/
            //validation part starts
            payTab.click();
            workdaycommon.userWait(2000);
            headerResultType.click();
            workdaycommon.userWait(2000);
            valueResultType.sendKeys("On Demand Payment", Keys.ENTER);
            workdaycommon.userWait(2000);
            btnFilterResultType.click();
            workdaycommon.userWait(2000);

            String status = "Complete";
            WebElement paymentDate_check = driver.findElement(By.xpath("//span[text()='Result Type']//following::div[@data-automation-id='textView'][3]"));
            log.info(PaymentDate);
            log.info(paymentDate_check.getText());

            WebElement calculationStatus_check = driver.findElement(By.xpath("//span[text()='Result Type']//following::div[@data-automation-id='promptOption' and @title='" + status + "']"));
            workdaycommon.scrolltoElement(calculationStatus_check);
            log.info(status);
            log.info(calculationStatus_check.getText());

            workdaycommon.userWait(2000);
            WebElement grossPay = driver.findElement(By.xpath("//span[text()='Result Type']//following::div[@data-automation-id='numericText'][1]"));
            workdaycommon.scrolltoElement(grossPay);
            String val = grossPay.getText();
            StringBuilder value = new StringBuilder(val);
            value.deleteCharAt(0);
            String valueGrossPay_check = value.toString();
            log.info(Value);
            log.info(valueGrossPay_check);


            if ((PaymentDate.equals(paymentDate_check.getText())) && (status.equals(calculationStatus_check.getText())) && (Value.equals(valueGrossPay_check))) {
                log.info("Run On Demand Payment is done successfully");
                test.pass("Run On Demand Payment is done successfully");
                test.info("BP - Run On Demand Payment, Associate: " + Employeename + ", Gross Pay: " + Value);
            } else {
                test.fail("Failed to run on demand payment");
                log.error("Failed to run on demand payment");

            }
        } catch (Exception e) {

            workdaycommon.takescreenshotUI("Exception", Emp_ID);
            log.error("Exception/Issue occurred:" + e.getMessage());
            //test.fail(e.getMessage());

        }

    }


    public void taxElections() throws Exception {
        try {
            workdaycommon.userWait(5000);
            workdaycommon.scrolltoElement(CPPTXE);
            String CPPtax = CPPTXE.getText();
            log.info("Canada Pension Plan(CPP): " + CPPtax);

            workdaycommon.userWait(5000);
            workdaycommon.scrolltoElement(EITXE);
            String EItax = EITXE.getText();
            log.info("Employment Insurance(EI): " + EItax);

            test.info("CPP: " + CPPtax + " , " + "EI: " + EItax);

            taxElectionsTXE.click();
            workdaycommon.userWait(5000);
            WebElement totFedAmt = driver.findElement(By.xpath("(//span[@title='Federal'])[2]//following::span[text()='Total Claim Amount'][1]//following::tr[2]//td[4]"));
            String totClaimAmt = totFedAmt.getText();
            log.info("Federal Total Claim Amount: " + totClaimAmt);

            WebElement totProvinceAmt = driver.findElement(By.xpath("(//span[@title='Province'])[2]//following::span[text()='Total Claim Amount'][1]//following::tr[2]//td[5]"));
            String totProvClaimAmt = totProvinceAmt.getText();
            log.info("Province Total Claim Amount: " + totProvClaimAmt);

            test.info("Federal Total Claim Amount :" + totClaimAmt);
            test.info("Province Total Claim Amount :" + totProvClaimAmt);

        } catch (Exception e) {
            test.fail("Tax Details are not available");

        }

    }

    public void ValidationViewPayslips(String Emp_ID, String Employee, String PeriodStartDate, String PeriodEndDate) throws Exception {

        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);

        log.info("Validation Started.....");

        List<String> listStrings2 = new LinkedList<String>();
        List<String> listStrings3 = new LinkedList<String>();
        listStrings2 = ViewResults(Emp_ID, Employee, PeriodStartDate, PeriodEndDate);
        listStrings3 = ViewPayslips(Emp_ID, Employee, PeriodStartDate, PeriodEndDate);
        String GrossInPayslip = listStrings2.get(0);
        String NetInPayslip = listStrings2.get(1);
        String CPP = listStrings2.get(2);
        String EI = listStrings2.get(3);

        log.info("Validation ViewPayslips Started......");

        String GrossInPayPeriodpage = listStrings3.get(0);
        String NetInPayPeriodpage = listStrings3.get(1);
        String CPPTaxElec = listStrings3.get(2);
        String EITaxElec = listStrings3.get(3);

        log.info("GrossInPayslip--->" + GrossInPayslip);
        log.info("NetInPayslip--->" + NetInPayslip);
        log.info("GrossInPayPeriodpage--->" + GrossInPayPeriodpage);
        log.info("NetInPayPeriodpage--->" + NetInPayPeriodpage);
        log.info("CPP: " + CPP);
        log.info("EI: " + EI);
        log.info("CPPTax: " + CPPTaxElec);
        log.info("EITax: " + EITaxElec);


        if (CPP.equalsIgnoreCase(CPPTaxElec) && EI.equalsIgnoreCase(EITaxElec)) {

            test.info("CPP and EI are Matching in PaySlip");
        } else {
            test.info("CPP and EI are not Matching in PaySlip");
        }

        if (GrossInPayslip.equalsIgnoreCase(GrossInPayPeriodpage)) {
            log.info("GrossAmount are Matching in PaySlip");
            if (NetInPayslip.equalsIgnoreCase(NetInPayPeriodpage)) {
                log.info("NetPay Amount are Matching in PaySlip");
                test.pass("GrossAmount and NetPay Amount are Matching in PaySlip");
            }
        } else {
            log.info("GrossAmount and NetAmount are Not Matching in PaySlip");
            test.info("GrossAmount and NetAmount are Not Matching in PaySlip");
        }


    }

    public void AssignPayGroup(String Employee, String EffectiveDate, String PayGroup) throws Exception{

        workdaycommon.setDriver(driverWrapper);
        workdaycommon.setExtentTest(test);

        workdaycommon.searchbySearchBox(Constants.SRCHASSIGNPAYGROUP);
        workdaycommon.userWait(1000);
        linkAssignPayGroup.click();
        workdaycommon.userWait(1000);
        if (driverWrapper.isElementPresent(effectiveDateAssignPayGrp)) {
            for (WebElement elem : driver.findElements(By.xpath("(//*[@data-automation-id='dateWidgetInputBox'])[1]"))) {
                elem.sendKeys(EffectiveDate);
            }
        }
        log.info("Effective date is entered");
        enterAssociateName.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(Employee, Keys.ENTER);
        workdaycommon.userWait(1000);
        btn_OK.click();
        log.info("Ok button is clicked");

        proposedPayGrp.click();
        workdaycommon.userWait(1000);
        insidesearchboxcommon.sendKeys(PayGroup, Keys.ENTER);
        workdaycommon.userWait(1000);
        btn_Submit.click();
        log.info("Submit button is clicked");

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
                    log.info("Assign Pay Group process is not Completed Successfully; Pending with awaiting action");
                    test.fail("Assign Pay Group process is not Completed Successfully; Pending with awaiting action");
                }
            } catch (org.openqa.selenium.NoSuchElementException e) {
                log.info("Assign Pay Group process is Completed Successfully");
                test.info("Assign Pay Group process is Completed Successfully");
                test.pass(" BP: Assign Pay Group, Associate Name: " + Employee + ", Assigned Pay Group:"
                        + PayGroup);
            }
        }
        else {
            log.info("Assign Pay Group process is not Completed Successfully");
            test.fail("Assign Pay Group process is not Completed Successfully");
        }




    }

}

