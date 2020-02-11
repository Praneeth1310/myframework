package com.thd.projectname.stepdefs;

import com.aventstack.extentreports.ExtentTest;
import com.thd.projectname.pages.PO_HCM.Hire_withRequisition;
import com.thd.projectname.pages.PO_HCM.HirefunctionalityPage;
import com.thd.Trash.HirefunctionalityPage_testdatacreator;
import com.thd.projectname.pages.PO_HCM.PO_ProductionCr.Temp_USHire_withRequisition;
import com.thd.projectname.pages.PO_HCM.USHire_withRequisition;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import com.thd.projectname.pages.PO_Payroll.WD_Payroll;
import com.thd.projectname.pages.PO_HCM.JobChanges_DifferentFlows;
import cucumber.api.java8.En;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class WD_JobChangeDifferentFlowsStepdef implements En {
    private static final Logger log = LogManager.getLogger(WD_JobChangeDifferentFlowsStepdef.class);

    public WD_JobChangeDifferentFlowsStepdef(ScenarioHooks hooks, WorkdayCommon workdaycommon, WD_Payroll payroll, HirefunctionalityPage hirepage, JobChanges_DifferentFlows JC_differentFlow, HirefunctionalityPage_testdatacreator HireTest, Hire_withRequisition ReqHire, USHire_withRequisition ReqUSHire, Temp_USHire_withRequisition Temp_ReqUSHire) {

        Then("^Perform Job change for an associate ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Pro_Suporg, String Location, String UPosition, String JC_JobProfile, String EmpType, String Amount, String CostCenter, String jobchangedate) -> {
            JC_differentFlow.setDriver(hooks.getDriverWrapper());
            JC_differentFlow.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                JC_differentFlow.Jobchange(ReqHire.getWorkdayCommonObj().fetchemployee(Employee), Pro_Suporg, Location, UPosition, JC_JobProfile, EmpType, Amount, CostCenter, jobchangedate);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });



        Then("^Perform Jobchange to change Jobprofile of an employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String JobProfile, String Amount, String EffectiveDate) -> {
            JC_differentFlow.setDriver(hooks.getDriverWrapper());
            JC_differentFlow.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                JC_differentFlow.Jobchange_Jobprofile(ReqHire.getWorkdayCommonObj().fetchemployee(Employee), JobProfile, Amount, EffectiveDate);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Perform Jobchange to change TimeType ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee,String jobchangedate,String TimeType,String WorkHours) -> {
            JC_differentFlow.setDriver(hooks.getDriverWrapper());
            JC_differentFlow.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {

                workdaycommon.gotoWorkdayHomepage();
                JC_differentFlow.Jobchange_Timetype(ReqHire.getWorkdayCommonObj().fetchemployee(Employee),jobchangedate,TimeType,WorkHours);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Perform Job change for Location Firstname and Lastname and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Location, String EffDateLocChange) -> {
            JC_differentFlow.setDriver(hooks.getDriverWrapper());
            JC_differentFlow.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                JC_differentFlow.JobchangeLocation(ReqHire.getWorkdayCommonObj().fetchemployee(Employee), Location, EffDateLocChange);
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

//
        Then("^Change Business Title ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee,String jobchangedate,String ProposedBusinessTitle) -> {
            JC_differentFlow.setDriver(hooks.getDriverWrapper());
            JC_differentFlow.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                JC_differentFlow.ChangeBusinessTitle(HireTest.getWorkdayCommonObj().fetchemployee(Employee),jobchangedate,ProposedBusinessTitle);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });


        Then("^Perform Jobchange to change Intern to perm employee([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String JobProfile, String Amount, String EffectiveDate) -> {
            JC_differentFlow.setDriver(hooks.getDriverWrapper());
            JC_differentFlow.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                JC_differentFlow.Jobchange_Intern_Perm(HireTest.getWorkdayCommonObj().fetchemployee(Employee), JobProfile, Amount, EffectiveDate);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });


        Then("^Perform Jobchange to change Compensation ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee,String EffectiveDate,String Salary) -> {
            JC_differentFlow.setDriver(hooks.getDriverWrapper());
            JC_differentFlow.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                JC_differentFlow.Jobchange_Compensation(ReqUSHire.getWorkdayCommonObj().fetchemployee(Employee),EffectiveDate,Salary);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });


        Then("^Perform Jobchange to change Organisation ([^\"]*) and ([^\"]*) and ([^\"]*)and ([^\"]*)and ([^\"]*)$", (String Employee,String SUPORG,String Location,String jobchangedate,String Country) -> {
            JC_differentFlow.setDriver(hooks.getDriverWrapper());
            JC_differentFlow.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                JC_differentFlow.Jobchange_Organisation(Temp_ReqUSHire.getWorkdayCommonObj().fetchemployee(Employee),SUPORG,Location,jobchangedate,Country);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });

        Then("^Perform Jobchange to change Work Location ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee,String EffectiveDate,String Location) -> {
            JC_differentFlow.setDriver(hooks.getDriverWrapper());
            JC_differentFlow.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                JC_differentFlow.Jobchange_WorkLocation(ReqUSHire.getWorkdayCommonObj().fetchemployee(Employee),EffectiveDate,Location);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });


    }
}
