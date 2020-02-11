package com.thd.projectname.stepdefs;

import com.aventstack.extentreports.ExtentTest;
import com.thd.Trash.HireUSpage;
import com.thd.Trash.HirefunctionalityPage_testdatacreator;
import com.thd.projectname.pages.PO_Absence.WD_Abscence;
import com.thd.projectname.pages.PO_AdvanceComp.WD_AdvanceComp;
import com.thd.projectname.pages.PO_E2E_Scenarios.WD_E2E_Scenarios;
import com.thd.projectname.pages.PO_HCM.*;
import com.thd.projectname.pages.PO_Others.HomePage;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import com.thd.projectname.pages.PO_Talent.WD_Talent;
import cucumber.api.java8.En;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BusinessProcessStepdef implements En {
    private static final Logger log = LogManager.getLogger(BusinessProcessStepdef.class);

    public BusinessProcessStepdef(ScenarioHooks hooks, HirefunctionalityPage_testdatacreator testdatagenerator, Hire_withRequisition hirerequisition, WD_E2E_Scenarios wd_e2e_scenarios, WorkdayCommon workdaycommon, HomePage homePage, HirefunctionalityPage hirePage, JobChangesBP jobchangesbp, HireUSpage hireUSPage, USHire_withRequisition ReqUSHire, WD_Abscence absence, WD_AdvanceComp advancecomp, WD_Talent talent) {

        Then("^Business Process: Requesting Absence([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String FromDateRange, String ToDateRange, String Type) -> {

            absence.setDriver(hooks.getDriverWrapper());
            absence.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                absence.AbsenceRequest(Employee, FromDateRange, ToDateRange, Type);


            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        And("^Business Process: Return Worker from leave([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String returndate, String LastDayOfAbsence) -> {

            absence.setDriver(hooks.getDriverWrapper());
            absence.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                absence.returnfromLeave(Employee, returndate, LastDayOfAbsence);
                // abscence.sample(returndate);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        Then("^Business Process: Correct Time Off([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String EstimatedLastDatOfAbsence, String Type) -> {

            absence.setDriver(hooks.getDriverWrapper());
            absence.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                absence.CorrectTimeOff(Employee, EstimatedLastDatOfAbsence, Type);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Business Process :Requesting Initiate Time Off([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String FromDateRange, String ToDateRange, String Type) -> {

            absence.setDriver(hooks.getDriverWrapper());
            absence.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                absence.InitiateTimeOff(Employee, FromDateRange, ToDateRange, Type);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        Then("^Business Process: Requesting Leave Of Extension([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String FromDateRange, String ToDateRange, String LOEType) -> {

            absence.setDriver(hooks.getDriverWrapper());
            absence.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                absence.LeaveOfExtension(Employee, FromDateRange, ToDateRange, LOEType);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        Then("^Business Process: View Leave Of Absence([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String AsOfDate, String Type) -> {

            absence.setDriver(hooks.getDriverWrapper());
            absence.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                absence.ViewLeaveOfAbsence(Employee, AsOfDate, Type);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

//Advance Comp----------------------

        Then("^Business Process: Requesting  Onetime Payment([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Reason, String PaymentPlan, String Amount, String Proxyname) -> {

            advancecomp.setDriver(hooks.getDriverWrapper());
            advancecomp.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                advancecomp.ReqOnetimePayment(Employee, Reason, PaymentPlan, Amount, Proxyname);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Business Process: Request Compensation of an employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Reason, String Employee,  String ChangeSalary, String EffectiveDate) -> {

            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            advancecomp.setDriver(hooks.getDriverWrapper());
            advancecomp.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                advancecomp.Request_Compensation_Change(Reason, Employee, ChangeSalary, EffectiveDate);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });


//Talent------------------------

//        Then("^Business Process: Start Development Plan for employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employeename, String Plan_Start_Date, String Plan_End_Date, String Response, String Development_item, String Status_Manager, String Status_Acknowledgement, String Template_Review) -> {
//
//            talent.setDriver(hooks.getDriverWrapper());
//            talent.setExtentTest(hooks.getExtentTest());
//            workdaycommon.setDriver(hooks.getDriverWrapper());
//            workdaycommon.setExtentTest(hooks.getExtentTest());
//            ExtentTest test = hooks.getExtentTest();
//            try {
//                workdaycommon.gotoWorkdayHomepage();
//                talent.Start_Development_Plan(Employeename, Plan_Start_Date, Plan_End_Date, Response, Development_item, Status_Manager, Status_Acknowledgement, Template_Review);
//                talent.validation(Employeename, Plan_Start_Date, Plan_End_Date, Template_Review);
//
//            } catch (Exception e) {
//                log.error("Exception/Issue occurred:" + e.getMessage());
//                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
//                workdaycommon.Driverclose();
//            }
//        });

        Then("^Business Process: Start performance Review for employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Empname, String Review_Template, String Manager_Rating, String Overall_Rating, String reviewStartDate, String reviewEndDate) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.Start_Perfomance_Review(Empname, Review_Template,reviewStartDate,reviewEndDate, Manager_Rating, Overall_Rating);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Business Process: Start Talent Review for Associate ([^\"]*) and ([^\"]*)$", (String Empname, String Talent_Review_Template) -> {


            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.Start_Talent_Review(Empname, Talent_Review_Template);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Business Process: Go to ([^\"]*) Inbox and update the talent profile by adding ([^\"]*) and ([^\"]*) and submit$", (String Empname, String WorkExperience, String Experiencelevel) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.UpdateTalentProfile(Empname, WorkExperience, Experiencelevel);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        When("^Business Process: Add Goals for Employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Category, String Goalname, String status) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.AddGoalstoEmployee(Employee,Category,Goalname,status);
                //talent.AddGoalstoEmployee(HireTest.getWorkdayCommonObj().fetchemployee(Employee),Category,Goalname,status);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Business Process: Edit goals for Employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Goalname, String EditGoal, String status) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.EditGoal(Employee, Goalname, EditGoal, status);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Business Process: View goals of the employee([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Goalname, String EditGoal) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.ViewGoals(Employee, Goalname, EditGoal);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Business Process: Start Disciplinary Action ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Empname, String Review_Template, String Disciplinary_Action_Reasons, String Period_Start_Date, String Period_End_Date) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.Start_Disciplinary_Action(Empname, Review_Template, Disciplinary_Action_Reasons, Period_Start_Date,Period_End_Date);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


//        Job Requisition---------------------

        Then("^Business Process: Creating Job requisition ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String WorkerType, String Reason, String WorkerSubtype, String JobProfile, String Company, String Costcenter, String PrimaryLocation) -> {
            // Write code here that turns the phrase above into concrete actions
            jobchangesbp.setDriver(hooks.getDriverWrapper());
            jobchangesbp.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                jobchangesbp.CreateJobRequisition(SUPORG, WorkerType, Reason, WorkerSubtype, JobProfile, Company, Costcenter, PrimaryLocation);
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Business Process: Close Job requisition ([^\"]*) and ([^\"]*)$", (String JobRequisite, String Reason) -> {

            jobchangesbp.setDriver(hooks.getDriverWrapper());
            jobchangesbp.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                jobchangesbp.closeJobRequisition(JobRequisite, Reason);
            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

//      Termination---------------------

        Then("^Business Process: Terminating the Employees ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Empname, String TerminationType, String PrimaryReason, String EligibleReHire, String SearchWith, String localReason, String Termdate) -> {
            jobchangesbp.setDriver(hooks.getDriverWrapper());
            jobchangesbp.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {

                workdaycommon.gotoWorkdayHomepage();
                jobchangesbp.TerminateEmp(testdatagenerator.getWorkdayCommonObj().fetchemployee(Empname), TerminationType, PrimaryReason, EligibleReHire, SearchWith, localReason, Termdate);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

//Personal Info Change-----------------

        Then("^Business Process: Change the personal information of the employee ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Gender, String DOB, String Race) -> {

            jobchangesbp.setDriver(hooks.getDriverWrapper());
            jobchangesbp.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                jobchangesbp.ChangePersonalInfo(Gender, DOB, Race);
            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

//Edit Service Dates --------------------------------------------------------------------------------------------------------------

        Then("^Business Process: Edit Service Dates of the associate to change the hire date ([^\"]*) and ([^\"]*)$", (String Employee, String EditHireDate) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try{
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.EditHireDate(ReqUSHire.getWorkdayCommonObj().fetchemployee(Employee), EditHireDate);
            }
            catch(Exception e){
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });

//Change My Preferred Name --------------------------------------------------------------------------------------------------------------

        Then("^Business Process: Change Preferred Name of the associate ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Emp, String EffectiveDate, String Country, String PrefixPreferred, String SuffixPreferred) -> {
            wd_e2e_scenarios.setDriver(hooks.getDriverWrapper());
            wd_e2e_scenarios.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try{
                workdaycommon.gotoWorkdayHomepage();
                wd_e2e_scenarios.ChangeMyPreferredName(ReqUSHire.getWorkdayCommonObj().fetchemployee(Emp),EffectiveDate,Country,PrefixPreferred,SuffixPreferred);
            }
            catch(Exception e){
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });

//Contract Contingent worker-------------------

        Then("^Business Process: Create a Contract Contingent worker([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Organization, String EmployeePreHire, String Position, String WorkerType, String JobProfile, String TimeType, String UserName_Inbox, String NewPwd_Inbox, String VerifyNewPwd_Inbox) -> {

            jobchangesbp.setDriver(hooks.getDriverWrapper());
            jobchangesbp.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                jobchangesbp.ContractCW(Organization, testdatagenerator.getWorkdayCommonObj().fetchemployee(EmployeePreHire), Position, WorkerType, JobProfile, TimeType, UserName_Inbox, NewPwd_Inbox, VerifyNewPwd_Inbox);
            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        //Postion----------------------------------------------------

        Then("^Business Process: Create position in the organization ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String Location, String JobFamily, String JobProfile, String TimeType, String WorkerType, String AvailabilityDate, String EarliestHireDate) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                hirePage.createPosition(SUPORG, Location, JobFamily, JobProfile, TimeType, WorkerType, AvailabilityDate, EarliestHireDate);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Business Process: Closing a Position ([^\"]*)$", (String Position) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                hirePage.ClosePosition(Position);
            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });
//        Then("^Business Process: Start Development Plan for employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employeename, String Plan_Start_Date, String Plan_End_Date, String Response, String Development_item, String Status_Manager, String Template_Review) -> {
            Then("^Business Process: Start Development Plan for employee ([^\"]*) and ([^\"]*) and ([^\"]*)and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Plan_Start_Date, String Plan_End_Date, String Response, String Development_item, String Status_Manager, String Template_Review) -> {

                talent.setDriver(hooks.getDriverWrapper());
                talent.setExtentTest(hooks.getExtentTest());
                workdaycommon.setDriver(hooks.getDriverWrapper());
                workdaycommon.setExtentTest(hooks.getExtentTest());
                ExtentTest test = hooks.getExtentTest();
                try {
                    workdaycommon.gotoWorkdayHomepage();
                    talent.Start_Development_Plan(Employee, Plan_Start_Date, Plan_End_Date, Response, Development_item, Status_Manager, Template_Review);
                    talent.validation(Employee, Plan_Start_Date, Plan_End_Date, Template_Review);

                } catch (Exception e) {
                    log.error("Exception/Issue occurred:" + e.getMessage());
                    test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                    workdaycommon.Driverclose();
                }



            });
//        Then("^Business Process: Start Development Plan for employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employeename, String Plan_Start_Date, String Plan_End_Date, String Response, String Development_item, String Status_Manager, String Status_Acknowledgement, String Template_Review ) -> {
//
//            talent.setDriver(hooks.getDriverWrapper());
//            talent.setExtentTest(hooks.getExtentTest());
//            workdaycommon.setDriver(hooks.getDriverWrapper());
//            workdaycommon.setExtentTest(hooks.getExtentTest());
//            ExtentTest test = hooks.getExtentTest();
//            try {
//                workdaycommon.gotoWorkdayHomepage();
//                talent.Start_Development_Plan(Employeename, Plan_Start_Date, Plan_End_Date, Response, Development_item, Status_Manager, Status_Acknowledgement, Template_Review);
//                talent.validation(Employeename, Plan_Start_Date, Plan_End_Date, Template_Review);
//
//            } catch (Exception e) {
//                log.error("Exception/Issue occurred:" + e.getMessage());
//                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
//                workdaycommon.Driverclose();
//            }
//
//
//        });


    }
}
