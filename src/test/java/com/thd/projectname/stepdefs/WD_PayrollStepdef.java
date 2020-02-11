package com.thd.projectname.stepdefs;

import com.aventstack.extentreports.ExtentTest;
import com.thd.base.Constants.Constants;
import com.thd.projectname.pages.PO_HCM.Hire_withRequisition;
import com.thd.Trash.HirefunctionalityPage_testdatacreator;
import com.thd.projectname.pages.PO_HCM.PO_ProductionCr.Temp_Hire_withRequisition;
import com.thd.projectname.pages.PO_HCM.PO_ProductionCr.Temp_USHire_withRequisition;
import com.thd.projectname.pages.PO_HCM.USHire_withRequisition;
import com.thd.projectname.pages.PO_Payroll.WD_Payroll;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import com.thd.projectname.pages.PO_HCM.HirefunctionalityPage;
import cucumber.api.java8.En;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class WD_PayrollStepdef implements En {
    private static final Logger log = LogManager.getLogger(WD_PayrollStepdef.class);

    public WD_PayrollStepdef(ScenarioHooks hooks, WorkdayCommon workdaycommon, WD_Payroll payroll, HirefunctionalityPage hirepage, HirefunctionalityPage_testdatacreator HireTest, Temp_Hire_withRequisition tempHireWithRequisition, Hire_withRequisition ReqHire, Temp_USHire_withRequisition Temp_ReqUSHire, USHire_withRequisition ReqUSHire) {


        Then("^Add Earnings and Deductions ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Emp_ID, String Employee, String PayComponent, String Batch_Id, String InputType, String Hours, String Value, String Country) -> {

            payroll.setDriver(hooks.getDriverWrapper());
            payroll.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                if (Country.equalsIgnoreCase(Constants.COUNTRYCANADAHIRE))
                        {
                            payroll.Add_Earnings_Deductions(Emp_ID, tempHireWithRequisition.getWorkdayCommonObj().fetchemployee(Employee), PayComponent, Batch_Id, InputType, Hours, Value);
                        }

                    else if (Country.equalsIgnoreCase(Constants.COUNTRYUSAHIRE))
                    {
                            payroll.Add_Earnings_Deductions(Emp_ID, Temp_ReqUSHire.getWorkdayCommonObj().fetchemployee(Employee), PayComponent, Batch_Id, InputType, Hours, Value);
                        }

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });



        Then("^Validating the PayInput ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Emp_ID, String Employee, String PayComponent, String Batch_Id, String InputType, String Value, String Country) -> {

            payroll.setDriver(hooks.getDriverWrapper());
            payroll.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                if (Country.equalsIgnoreCase(Constants.COUNTRYCANADAHIRE)) {
                    payroll.validation_PayInput(Emp_ID, tempHireWithRequisition.getWorkdayCommonObj().fetchemployee(Employee), PayComponent, Batch_Id, InputType, Value);
                }
                if (Country.equalsIgnoreCase(Constants.COUNTRYUSAHIRE)) {
                    payroll.validation_PayInput(Emp_ID, Temp_ReqUSHire.getWorkdayCommonObj().fetchemployee(Employee), PayComponent, Batch_Id, InputType, Value);
                }
                //payroll.validation_PayInput(Emp_ID, HireTest.getWorkdayCommonObj().fetchemployee(Employee), PayComponent, Batch_Id, InputType, Value);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });



        Then("^Delete Earnings and Deductions ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Emp_ID, String Employeename, String Batch_Id, String PayComponent) -> {

            payroll.setDriver(hooks.getDriverWrapper());
            payroll.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                payroll.Delete_Earnings_Deductions(Emp_ID, ReqHire.getWorkdayCommonObj().fetchemployee(Employeename), Batch_Id, PayComponent);
                //payroll.Delete_Earnings_Deductions(Emp_ID, HireTest.getWorkdayCommonObj().fetchemployee(Employeename), Batch_Id, PayComponent);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        Then("^Recalculate Earnings and Deductions ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Emp_ID, String Employee, String Batch_Id, String PayComponent, String Country) -> {

            payroll.setDriver(hooks.getDriverWrapper());
            payroll.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();

                if (Country.equalsIgnoreCase(Constants.COUNTRYCANADAHIRE)) {
                    payroll.Recalculate_Payroll_Results(Emp_ID, ReqHire.getWorkdayCommonObj().fetchemployee(Employee));
                }
                if (Country.equalsIgnoreCase(Constants.COUNTRYUSAHIRE)) {
                    payroll.Recalculate_Payroll_Results(Emp_ID, ReqUSHire.getWorkdayCommonObj().fetchemployee(Employee));
                }

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        Then("^Run_On_Demand ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Emp_ID, String Employeename, String SubPeriodTargetDate, String PaymentDate, String Reason_PayCal, String Priority, String PayComponent, String InputType, String Value) -> {

            payroll.setDriver(hooks.getDriverWrapper());
            payroll.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                payroll.Run_ONDemands(Emp_ID, HireTest.getWorkdayCommonObj().fetchemployee(Employeename), SubPeriodTargetDate, PaymentDate, Reason_PayCal, Priority, PayComponent, InputType, Value);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Assign pay group for an associate ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employeename, String EffectiveDate, String PayGroup) -> {

            payroll.setDriver(hooks.getDriverWrapper());
            payroll.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                payroll.AssignPayGroup(HireTest.getWorkdayCommonObj().fetchemployee(Employeename), EffectiveDate, PayGroup);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^View Payslips ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Emp_ID, String Employeename, String PeriodStartDate, String PeriodEndDate) -> {

            payroll.setDriver(hooks.getDriverWrapper());
            payroll.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                payroll.ValidationViewPayslips(Emp_ID, HireTest.getWorkdayCommonObj().fetchemployee(Employeename), PeriodStartDate, PeriodEndDate);
            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        Then("^View Results ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Emp_ID, String Employeename, String PeriodStartDate, String PeriodEndDate) -> {

            payroll.setDriver(hooks.getDriverWrapper());
            payroll.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                payroll.ViewResults(Emp_ID, HireTest.getWorkdayCommonObj().fetchemployee(Employeename), PeriodStartDate, PeriodEndDate);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^WD_View Results and Payslips ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Emp_ID, String Employee, String PeriodStartDate, String PeriodEndDate) -> {

            payroll.setDriver(hooks.getDriverWrapper());
            payroll.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                payroll.ValidationViewPayslips(Emp_ID, HireTest.getWorkdayCommonObj().fetchemployee(Employee), PeriodStartDate, PeriodEndDate);
            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });
    }
}
