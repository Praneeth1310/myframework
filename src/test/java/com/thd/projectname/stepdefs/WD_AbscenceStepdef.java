package com.thd.projectname.stepdefs;

import com.aventstack.extentreports.ExtentTest;
import com.thd.base.Constants.Constants;
import com.thd.projectname.pages.PO_Absence.WD_Abscence;
import com.thd.projectname.pages.PO_HCM.Hire_withRequisition;
import com.thd.projectname.pages.PO_HCM.HirefunctionalityPage;
import com.thd.Trash.HirefunctionalityPage_testdatacreator;
import com.thd.projectname.pages.PO_HCM.PO_ProductionCr.Temp_Hire_withRequisition;
import com.thd.projectname.pages.PO_HCM.USHire_withRequisition;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import cucumber.api.java8.En;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class WD_AbscenceStepdef implements En {
    private static final Logger log = LogManager.getLogger(WD_AbscenceStepdef.class);

    public WD_AbscenceStepdef(ScenarioHooks hooks, WorkdayCommon workdaycommon, WD_Abscence abscence, HirefunctionalityPage hirepage, HirefunctionalityPage_testdatacreator HireTest, Temp_Hire_withRequisition tempHireWithRequisition, Hire_withRequisition ReqHire,USHire_withRequisition ReqUSHire) {

        Then("^Requesting Absence([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String FromDateRange, String ToDateRange, String Type, String Country) -> {

            abscence.setDriver(hooks.getDriverWrapper());
            abscence.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                if (Country.equalsIgnoreCase(Constants.COUNTRYCANADAHIRE)) {
                    abscence.AbsenceRequest(tempHireWithRequisition.getWorkdayCommonObj().fetchemployee(Employee), FromDateRange, ToDateRange, Type);
                }
                else if (Country.equalsIgnoreCase(Constants.COUNTRYUSAHIRE)) {
                    abscence.AbsenceRequest(ReqUSHire.getWorkdayCommonObj().fetchemployee(Employee), FromDateRange, ToDateRange, Type);
                }

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        And("^Return Worker from leave([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String returndate, String LastDayOfAbsence) -> {

            abscence.setDriver(hooks.getDriverWrapper());
            abscence.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                abscence.returnfromLeave(HireTest.getWorkdayCommonObj().fetchemployee(Employee), returndate, LastDayOfAbsence);
                // abscence.sample(returndate);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Requesting Leave Of Extension([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String FromDateRange, String ToDateRange, String LOEType) -> {

            abscence.setDriver(hooks.getDriverWrapper());
            abscence.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                abscence.LeaveOfExtension(HireTest.getWorkdayCommonObj().fetchemployee(Employee), FromDateRange, ToDateRange, LOEType);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

    //    Then("^View Leave Of Absence([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String AsOfDate, String Type) -> {
            Then("^View Leave Of Absence ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee,String AsOfDate,String Type) -> {
            abscence.setDriver(hooks.getDriverWrapper());
            abscence.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                abscence.ViewLeaveOfAbsence(tempHireWithRequisition.getWorkdayCommonObj().fetchemployee(Employee), AsOfDate, Type);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Correct Time Off([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String EstimatedLastDatOfAbsence, String Type) -> {

            abscence.setDriver(hooks.getDriverWrapper());
            abscence.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                abscence.CorrectTimeOff(HireTest.getWorkdayCommonObj().fetchemployee(Employee), EstimatedLastDatOfAbsence, Type);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Requesting Initiate Time Off([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String FromDateRange, String ToDateRange, String Type) -> {

            abscence.setDriver(hooks.getDriverWrapper());
            abscence.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                abscence.InitiateTimeOff(HireTest.getWorkdayCommonObj().fetchemployee(Employee), FromDateRange, ToDateRange, Type);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });
    }
}
