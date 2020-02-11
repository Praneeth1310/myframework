package com.thd.projectname.stepdefs;

import com.aventstack.extentreports.ExtentTest;
import com.thd.projectname.pages.PO_HCM.Hire_withRequisition;
import com.thd.projectname.pages.PO_HCM.Hire_withRequisition_6Step;
import com.thd.projectname.pages.PO_HCM.HirefunctionalityPage;
import com.thd.Trash.HirefunctionalityPage_testdatacreator;
import com.thd.projectname.pages.PO_HCM.*;
import com.thd.projectname.pages.PO_HCM.PO_ProductionCr.Temp_Hire_withRequisition;
import com.thd.projectname.pages.PO_Others.DeleteGoal;
import com.thd.projectname.pages.PO_Others.RescindPO;
import com.thd.projectname.pages.PO_SuccessionPlan.SuccessionPlan;
import com.thd.projectname.pages.PO_Talent.WD_Talent;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import com.thd.projectname.pages.PO_E2E_Scenarios.WD_E2E_Scenarios;
import cucumber.api.java8.En;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.thd.projectname.pages.PO_Absence.WD_Abscence;
import com.thd.Trash.E2E_T170;


public class WD_E2E_Stepdef implements En {
    private static final Logger log = LogManager.getLogger(WD_E2E_Stepdef.class);


    public WD_E2E_Stepdef(ScenarioHooks hooks, WorkdayCommon workdaycommon, WD_Talent talent, HirefunctionalityPage hirePage, WD_E2E_Scenarios wd_e2e_scenarios, SuccessionPlan succession_plan, DeleteGoal deleteGoal, RescindPO rescindPO, JobChangesBP jobchangesbp, WD_Abscence absence, E2E_T170 T170, HirefunctionalityPage_testdatacreator HireTest, Hire_withRequisition ReqHire, Hire_withRequisition_6Step hireMultiLineCanada, USHire_withRequisition ReqUSHire, JobChanges_DifferentFlows JC_differentFlow,Temp_Hire_withRequisition tempHireWithRequisition) {


        Then("^Home Contact Change ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$$", (String AssociateID, String Employee, String Address1, String Postal, String City, String StateOrProvince, String Country, String effectivedate,String MobileOnbard) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                hirePage.HomeAddressChange(AssociateID, ReqHire.getWorkdayCommonObj().fetchemployee(Employee), Address1, Postal, City, StateOrProvince, Country,effectivedate,MobileOnbard);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        Then("^Work Contact Change ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$$", (String EffectiveDate, String Employee, String Country, String Address1, String Postal, String City, String Province, String State, String MobileOnbard) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                hirePage.WorkAddressChange(EffectiveDate,ReqHire.getWorkdayCommonObj().fetchemployee(Employee), Country, Address1, Postal, City, Province, State, MobileOnbard);
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^View Contact Information ([^\"]*)$$", (String Employee) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                hirePage.ViewContactInformation(ReqHire.getWorkdayCommonObj().fetchemployee(Employee));
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });
//

        Then("^Change Emergency Contacts ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$$", (String Employee, String Country, String FirstName, String LastName, String Relationship, String PhoneNumber) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                hirePage.EmergencyContactChange(ReqHire.getWorkdayCommonObj().fetchemployee(Employee),Country,FirstName,LastName,Relationship,PhoneNumber);
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

//
        Then("^View Emergency Contacts ([^\"]*)$$", (String Employee) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                hirePage.ViewEmergencyContacts(ReqHire.getWorkdayCommonObj().fetchemployee(Employee));
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Generate and review T(\\d+)s$", (Integer arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("T4s validation can not be done now.");
            log.info("T4s validation can not be done now.");
        });


        Then("^Verify Performance tab and career tab ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String DevelopmentItem, String Status, String CareerPreferences, String JobProfiles, String WorkExperience, String Company_JobHistory, String Award_Type, String Certifications) -> {

            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.View_Performance_and_Career_Tab(hireMultiLineCanada.getWorkdayCommonObj().fetchemployee(Employee), DevelopmentItem, Status, CareerPreferences, JobProfiles, WorkExperience, Company_JobHistory, Award_Type, Certifications);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Employee verifies access in Comp tabs ([^\"]*)$", (String Employee) -> {

            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {

                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.AssociateVerify_Comp_Tab(ReqHire.getWorkdayCommonObj().fetchemployee(Employee));

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Employee verifies access in Career and performance tabs ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String DevelopmentItem, String Status, String CareerPreferences, String JobProfiles, String WorkExperience, String Company_JobHistory, String Award_Type, String Certifications) -> {

            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {

                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.AssociateVerify_Performance_and_Career_Tab(ReqHire.getWorkdayCommonObj().fetchemployee(Employee), DevelopmentItem, Status, CareerPreferences, JobProfiles, WorkExperience, Company_JobHistory, Award_Type, Certifications);
                //wd_e2e_scenarios.AssociateVerify_Performance_and_Career_Tab(HireTest.getWorkdayCommonObj().fetchemployee(Employee), DevelopmentItem, Status, CareerPreferences, JobProfiles, WorkExperience, Company_JobHistory, Award_Type, Certifications);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        Then("^Manager verifies access in Career and performance tabs ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String DevelopmentItem, String Status, String CareerPreferences, String JobProfiles, String WorkExperience, String Company_JobHistory, String Award_Type, String Certifications) -> {

            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.ManagerVerify_Performance_and_Career_Tab(ReqHire.getWorkdayCommonObj().fetchemployee(Employee), DevelopmentItem, Status, CareerPreferences, JobProfiles, WorkExperience, Company_JobHistory, Award_Type, Certifications);
                //wd_e2e_scenarios.ManagerVerify_Performance_and_Career_Tab(HireTest.getWorkdayCommonObj().fetchemployee(Employee), DevelopmentItem, Status, CareerPreferences, JobProfiles, WorkExperience, Company_JobHistory, Award_Type, Certifications);
            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Verify associate is On Leave ([^\"]*)$", (String Employee) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.Verify_Associate_OnLeave(HireTest.getWorkdayCommonObj().fetchemployee(Employee));

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Correct Effective date of Job change process([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String EffectiveDate, String CorrectEffectiveDate) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.Correct_JobChange_EffectiveDate(ReqHire.getWorkdayCommonObj().fetchemployee(Employee),EffectiveDate,CorrectEffectiveDate);
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });




        Then("^Move Workers by SupOrg ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String EmployeeOne, String EmployeeTwo, String EmployeeThree, String SupOrg, String PropSupOrg, String Company, String CostCenter, String EffectiveDate_MoveWorkers) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.MoveWorkers(EmployeeOne, EmployeeTwo, EmployeeThree, SupOrg, PropSupOrg, Company, CostCenter, EffectiveDate_MoveWorkers);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Verify Moved Associates ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String EmployeeOne, String EmployeeTwo, String EmployeeThree, String PropSupOrg, String CostCenter, String AsOfDate, String Type) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {

                wd_e2e_scenarios.Verify_Moved_Associates(EmployeeOne, EmployeeTwo, EmployeeThree, PropSupOrg, CostCenter, AsOfDate, Type);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

//        ---------------E2E Step Def for direct proxy --------------
        When("^user Proxy as (.*)$", (String role) -> {
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                workdaycommon.StartProxy_employee(HireTest.getWorkdayCommonObj().fetchemployee(role));
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        When("^Proxy To (.*)$", (String role) -> {
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                workdaycommon.StartProxy_employee(ReqHire.getWorkdayCommonObj().fetchemployee(role));
                } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


//        ---------------E2E Step Def for Add Goals------------------
        When("^Added Goals for existing Employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Category, String Goalname, String status) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.AddGoalstoEmployee(ReqHire.getWorkdayCommonObj().fetchemployee(Employee), Category, Goalname, status);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

//        ---------------E2E Step Def for View Goal-----------------------

        Then("^Delete the goals added by the employee ([^\"]*)$", (String Employee) -> {
            // Write code here that turns the phrase above into concrete actions
            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            deleteGoal.setDriver(hooks.getDriverWrapper());
            deleteGoal.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                deleteGoal.DeleteGoals(ReqHire.getWorkdayCommonObj().fetchemployee(Employee));
            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        And("^Review tax elections$", () -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("Review tax elections - can not be automated/ Harnessing automation script");
            log.info("Review tax elections - can not be automated/ Harnessing automation script");
        });

        And("^Run Retro Pay Calc$", () -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("Run Retro Pay Calc - can not be automated/ Harnessing automation script");
            log.info("Run Retro Pay Calc - can not be automated/ Harnessing automation script");
        });

        And("^Review PaySlip$", () -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("Review Pay Slip - can not be automated/ Harnessing automation script");
            log.info("Review Pay Slip - can not be automated/ Harnessing automation script");
        });

        And("^Extract Workday Payroll GL File and send to Mercator$", () -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("Extract Workday Payroll GL File and send to Mercator- can not be automated/ Harnessing automation script");
            log.info("Extract Workday Payroll GL File and send to Mercator- can not be automated/ Harnessing automation script");
        });

        And("^Mercator processes the Workday file and generates SAP IDOCS$", () -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("Mercator processes the Workday file and generates SAP IDOC- can not be automated/ Harnessing automation script");
            log.info("Mercator processes the Workday file and generates SAP IDOC- can not be automated/ Harnessing automation script");
        });


        And("^YG Financial posting is posted as expected$", () -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("YG Financial posting is posted as expected - can not be automated/ Harnessing automation script");
            log.info("YG Financial posting is posted as expected - can not be automated/ Harnessing automation script");
        });

        And("^THD_INT(\\d+)_SAP internal - GL file to finance - Canada -  Outbound$", (Integer arg1) -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("THD_INT0015_SAP internal - GL file to finance - Canada -  Outbound - can not be automated/ Harnessing automation script");
            log.info("THD_INT0015_SAP internal - GL file to finance - Canada -  Outbound - can not be automated/ Harnessing automation script");
        });

        And("^SAP process the payroll IDOCs$", () -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("SAP process the payroll IDOCs - can not be automated/ Harnessing automation script");
            log.info("SAP process the payroll IDOCs - can not be automated/ Harnessing automation script");
        });

        And("^Test the Integrations:THD_INT(\\d+) - Royal Bank of Canada - Bi Weekly Positive Pay Outbound,THD_INT(\\d+) - Royal Bank of Canada - Payroll data direct deposit Outbound$", (Integer arg1, Integer arg2) -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("STest the Integrations:THD_INT0010 - Royal Bank of Canada - Bi Weekly Positive Pay Outbound,THD_INT0012 - Royal Bank of Canada - Payroll data direct deposit Outbound - can not be automated/ Harnessing automation script");
            log.info("Test the Integrations:THD_INT0010 - Royal Bank of Canada - Bi Weekly Positive Pay Outbound,THD_INT0012 - Royal Bank of Canada - Payroll data direct deposit Outbound - can not be automated/ Harnessing automation script");
        });

        And("^Launch Hourly Review Cycle$", () -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("Launch Hourly Review Cycle - can not be automated/ Harnessing automation script");
            log.info("Launch Hourly Review Cycle - can not be automated/ Harnessing automation script");
        });

        And("^Verify Review cycle is Open$", () -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("Verify Review cycle is Open - can not be automated/ Harnessing automation script");
            log.info("Verify Review cycle is Open - can not be automated/ Harnessing automation script");
        });

        And("^Launch Hourly Merit Cycle$", () -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("Launch Hourly Merit Cycle- can not be automated/ Harnessing automation script");
            log.info("Launch Hourly Merit Cycle - can not be automated/ Harnessing automation script");
        });

        And("^Verify Merit cycle is Open$", () -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("Verify Merit cycle is Open - can not be automated/ Harnessing automation script");
            log.info("Verify Merit cycle is Open - can not be automated/ Harnessing automation script");
        });

        And("^Look for Merit Task$", () -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("Look for Merit Task - can not be automated/ Harnessing automation script");
            log.info("Look for Merit Task - can not be automated/ Harnessing automation script");
        });

        And("^Confirm Task is not present$", () -> {
            // Write code here that turns the phrase above into concrete actions
            ExtentTest test = hooks.getExtentTest();
            test.info("Confirm Task is not present- can not be automated/ Harnessing automation script");
            log.info("Confirm Task is not present - can not be automated/ Harnessing automation script");
        });


        //---------------E2E_T170-THD-8593 Process a rehire for an associate who was terminated on leave-----------------------


        Then("^Terminating the Associate ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Empname, String TerminationType, String PrimaryReason, String EligibleReHire, String SearchWith, String localReason, String Termdate) -> {
            T170.setDriver(hooks.getDriverWrapper());
            T170.setExtentTest(hooks.getExtentTest());
            T170.setDriver(hooks.getDriverWrapper());
            T170.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                T170.TerminateEmp(HireTest.getWorkdayCommonObj().fetchemployee(Empname), TerminationType, PrimaryReason, EligibleReHire, SearchWith, localReason, Termdate);
            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        And("^Create position in the organization ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String Location, String JobFamily, String JobProfile, String TimeType, String WorkerType, String AvailabilityDate, String EarliestHireDate) -> {
            T170.setDriver(hooks.getDriverWrapper());
            T170.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                T170.createPosition(SUPORG,Location,JobFamily,JobProfile,TimeType,WorkerType,AvailabilityDate,EarliestHireDate);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });
        Then("^Creating a new Job requisition ([^\"]*) and ([^\"]*)$", (String SUPORG, String JobProfile) -> {
            // Write code here that turns the phrase above into concrete actions
            T170.setDriver(hooks.getDriverWrapper());
            T170.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
//                T170.CreateJobRequisition(SUPORG, Position, WorkerType, Reason, WorkerSubtype, JobProfile, Company, Costcenter, PrimaryLocation);
                T170.CreateJobRequisition(SUPORG, JobProfile);
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^ReHire - ReHire Associate([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String SUPORG, String RehireReason,String Position, String RWorkerType, String JobProfile, String TimeType, String Location, String PayRateType) -> {
            T170.setDriver(hooks.getDriverWrapper());
            T170.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //  hirePage.startProxy();
                workdaycommon.gotoWorkdayHomepage();
                T170.Re_HireAssociate(HireTest.getWorkdayCommonObj().fetchemployee(Employee), SUPORG, RehireReason, Position,  RWorkerType, JobProfile, TimeType, Location, PayRateType);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


//       ALL RESCIND PROCESS-----------------------------------------


        Then("^Rescind the job transfer for the employee ([^\"]*)$", (String employee) -> {
            // Write code here that turns the phrase above into concrete actions
            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            rescindPO.setDriver(hooks.getDriverWrapper());
            rescindPO.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                rescindPO.RescindJob(ReqHire.getWorkdayCommonObj().fetchemployee(employee));

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Rescind Move Workers([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String EmployeeOne, String EmployeeTwo, String EmployeeThree, String EffectiveDate_MoveWorkers) -> {
            rescindPO.setDriver(hooks.getDriverWrapper());
            rescindPO.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                rescindPO.Rescind_MoveWorkers(EmployeeOne, EmployeeTwo, EmployeeThree, EffectiveDate_MoveWorkers);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Rescind an Hire Associate([^\"]*)$", (String Employee) -> {
            rescindPO.setDriver(hooks.getDriverWrapper());
            rescindPO.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                rescindPO.RescindNewHire(ReqUSHire.getWorkdayCommonObj().fetchemployee(Employee));

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Rescind Absence Request of ([^\"]*)$", (String Emp) -> {
            rescindPO.setDriver(hooks.getDriverWrapper());
            rescindPO.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try{
                workdaycommon.gotoWorkdayHomepage();
                rescindPO.RescindAbsence(ReqHire.getWorkdayCommonObj().fetchemployee(Emp));
            }
            catch(Exception e){
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });

        Then("^Rescind Termination of ([^\"]*)$", (String Emp) -> {
            rescindPO.setDriver(hooks.getDriverWrapper());
            rescindPO.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try{
                workdaycommon.gotoWorkdayHomepage();
                rescindPO.RescindTermination(ReqHire.getWorkdayCommonObj().fetchemployee(Emp));
            }
            catch(Exception e){
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });




// E2E - Legal name change --------------------------------------------------------------------------------------------------------------

        Then("^Legal name Change ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Emp, String EffectiveDate, String Country, String FirstnameLegal,String LastnameLegal) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try{
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.LegalNameChange(tempHireWithRequisition.getWorkdayCommonObj().fetchemployee(Emp), EffectiveDate, Country,FirstnameLegal,LastnameLegal);
            }
            catch(Exception e){
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });

        // E2E - Change My Preferred Name --------------------------------------------------------------------------------------------------------------

        Then("^Change Preferred Name of the associate ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Emp, String EffectiveDate, String Country, String PrefixPreferred, String SuffixPreferred) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try{
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.ChangeMyPreferredName(tempHireWithRequisition.getWorkdayCommonObj().fetchemployee(Emp),EffectiveDate,Country,PrefixPreferred,SuffixPreferred);
            }
            catch(Exception e){
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });

//E2E - Edit Service Dates of the associate to change the hire date --------------------------------------------------------------------------------------------------------------

        Then("^Edit Service Dates of the associate to change the hire date ([^\"]*) and ([^\"]*)$", (String Employee, String EditHireDate) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try{
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.EditHireDate(tempHireWithRequisition.getWorkdayCommonObj().fetchemployee(Employee), EditHireDate);
            }
            catch(Exception e){
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });

//E2E - Change passport and visa information --------------------------------------------------------------------------------------------------------------

        Then("^Change passport and visa information ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Country, String VisaIdType, String VisaIdentification) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try{
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.ChangePassportVisaInfo(tempHireWithRequisition.getWorkdayCommonObj().fetchemployee(Employee), Country, VisaIdType, VisaIdentification);
            }
            catch(Exception e){
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });


//E2E - Verify Associate Details --------------------------------------------------------------------------------------------------------------

        Then("^Verify Associate Details ([^\"]*)$", (String Employee) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try{
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.VerifyAssociateDetails(tempHireWithRequisition.getWorkdayCommonObj().fetchemployee(Employee));
            }
            catch(Exception e){
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });


//E2E -  Then Change Last Hire date of the associate into Future date --------------------------------------------------------------------------------------------------------------

        Then("^Change Last Hire date of an associate into Future date ([^\"]*) and ([^\"]*)$", (String Employee, String ChangeHiredate) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.ChangeLastHireDateIntoFutureDate(ReqHire.getWorkdayCommonObj().fetchemployee(Employee), ChangeHiredate);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

//Contract Contingent worker-------------------

        Then("^Hire Contract Contingent worker([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Organization, String EmployeePreHire, String Position, String WorkerType, String JobProfile, String TimeType, String UserName_Inbox, String NewPwd_Inbox, String VerifyNewPwd_Inbox) -> {

            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.ContractContingentWorker(Organization, ReqHire.getWorkdayCommonObj().fetchemployee(EmployeePreHire), Position, WorkerType, JobProfile, TimeType, UserName_Inbox, NewPwd_Inbox, VerifyNewPwd_Inbox);
            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        //E2E -Enter Absence for Contingent Worker -------------------------------------------------------------------------------------------------------------------------------

        Then("^Enter Absence for Contingent Worker ([^\"]*)$", (String EmployeePreHire) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.EnterAbsenceContingentWorker(ReqHire.getWorkdayCommonObj().fetchemployee(EmployeePreHire));

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^End Contract for a Contingent Worker ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String EmployeePreHire, String ContractEndDate, String ReasonEndContract, String LastDayOfWork) -> {

            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.EndContingentWorkerContract(ReqHire.getWorkdayCommonObj().fetchemployee(EmployeePreHire), ContractEndDate, ReasonEndContract, LastDayOfWork);
            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });




//E2E -Check Start performance Review,Start Disciplinary Action,Add Goals,Create Succession Plan for Contingent worker --------------------------------------------------------------------------------------------------------------

        Then("^Check Start performance Review,Start Disciplinary Action,Add Goals,Create Succession Plan for Contingent worker ([^\"]*)$", (String EmployeePreHire) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.CheckContingentWorkerActivities(ReqHire.getWorkdayCommonObj().fetchemployee(EmployeePreHire));

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });




        Then("^View Associate Details ([^\"]*)$", (String Employee) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.ViewAssociateDetails(ReqHire.getWorkdayCommonObj().fetchemployee(Employee));

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

//E2E -  Change the Termination Date--------------------------------------------------------------------------------------------------------------

        Then("^Change the Termination Date for an associate ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String ChangVoluntary_Reasn, String ChangeTermDate) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.ChangeTerminationDate(ReqUSHire.getWorkdayCommonObj().fetchemployee(Employee), ChangVoluntary_Reasn, ChangeTermDate);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

    }
}