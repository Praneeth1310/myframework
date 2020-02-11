package com.thd.projectname.stepdefs;

import com.aventstack.extentreports.ExtentTest;
import com.thd.projectname.pages.PO_AdvanceComp.WD_AdvanceComp;
import com.thd.projectname.pages.PO_HCM.Hire_withRequisition;
import com.thd.Trash.HirefunctionalityPage_testdatacreator;
import com.thd.projectname.pages.PO_HCM.USHire_withRequisition;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import cucumber.api.java8.En;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class WD_AdvanceCompStepdef implements En {
    private static final Logger log = LogManager.getLogger(WD_AdvanceCompStepdef.class);

    public WD_AdvanceCompStepdef(ScenarioHooks hooks, WorkdayCommon workdaycommon, WD_AdvanceComp advancecomp, HirefunctionalityPage_testdatacreator HireTest, Hire_withRequisition ReqHire, USHire_withRequisition ReqUSHire) {

        Then("^Request Compensation of an employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Reason, String Employee, String ChangeSalary, String EffectiveDate) -> {

            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            advancecomp.setDriver(hooks.getDriverWrapper());
            advancecomp.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                advancecomp.Request_Compensation_Change(Reason, ReqUSHire.getWorkdayCommonObj().fetchemployee(Employee), ChangeSalary, EffectiveDate);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });


        Then("^Perform Merit Review ([^\"]*)$", (String employee) -> {
            advancecomp.setDriver(hooks.getDriverWrapper());
            advancecomp.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();

            try {
                workdaycommon.gotoWorkdayHomepage();
                advancecomp.MeritReview(ReqHire.getWorkdayCommonObj().fetchemployee(employee));

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        Then("^Requesting  Onetime Payment([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Reason, String PaymentPlan, String Amount, String Proxyname) -> {

            advancecomp.setDriver(hooks.getDriverWrapper());
            advancecomp.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                advancecomp.ReqOnetimePayment(HireTest.getWorkdayCommonObj().fetchemployee(Employee), Reason, PaymentPlan, Amount, Proxyname);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


    }
}
