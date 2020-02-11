package com.thd.projectname.stepdefs;

import com.aventstack.extentreports.ExtentTest;
import com.thd.Trash.HirefunctionalityPage_testdatacreator;
import com.thd.projectname.pages.PO_HCM.Hire_withRequisition;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import com.thd.projectname.pages.PO_SuccessionPlan.SuccessionPlan;
import cucumber.api.java8.En;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class WD_SuccessionPlanStepdef implements En {

    // ExtentTest test;


    private static final Logger log = LogManager.getLogger(WD_SuccessionPlanStepdef.class);

    public WD_SuccessionPlanStepdef(ScenarioHooks hooks, WorkdayCommon workdaycommon,  HirefunctionalityPage_testdatacreator HireTest, SuccessionPlan succession_plan, Hire_withRequisition ReqHire) {

        Then("^Get Employee Position([^\"]*)$", (String Employee) -> {
            succession_plan.setDriver(hooks.getDriverWrapper());
            succession_plan.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();

            try {
                workdaycommon.gotoWorkdayHomepage();
                //succession_plan.CreateSuccessionPlan(Leader,EmployeeOne,EmployeeTwo,Readiness);
                succession_plan.GetPosition(HireTest.getWorkdayCommonObj().fetchemployee(Employee));

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();            }
        });


        Then("^Get position of Employee ([^\"]*)$", (String Employee) -> {
            succession_plan.setDriver(hooks.getDriverWrapper());
            succession_plan.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                succession_plan.GetPosition(HireTest.getWorkdayCommonObj().fetchemployee(Employee));
                //  test.pass("Step 1 : Successfully create succession plan");

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Create Succession Plan([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Leader, String EmployeeOne, String EmployeeTwo, String Readiness) -> {
            succession_plan.setDriver(hooks.getDriverWrapper());
            succession_plan.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                succession_plan.CreateSuccessionPlan(Leader, EmployeeOne, EmployeeTwo, Readiness);
                //  test.pass("Step 1 : Successfully create succession plan");

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^View Succession Plan([^\"]*)$", (String Leader) -> {
            succession_plan.setDriver(hooks.getDriverWrapper());
            succession_plan.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                succession_plan.ViewSuccessionPlan(Leader);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Manage Succession Plan ([^\"]*) and ([^\"]*)$", (String Leader, String employee) -> {
            succession_plan.setDriver(hooks.getDriverWrapper());
            succession_plan.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                succession_plan.ManageSuccessionPlan(Leader, employee);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        Then("^Check Create Succession Plan by Manager ([^\"]*)$", (String Employee) -> {
            succession_plan.setDriver(hooks.getDriverWrapper());
            succession_plan.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                succession_plan.Check_Create_Succession_Plan_By_Manager(ReqHire.getWorkdayCommonObj().fetchemployee(Employee));

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

    }


}
