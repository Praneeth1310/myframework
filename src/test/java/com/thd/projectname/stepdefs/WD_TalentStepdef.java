package com.thd.projectname.stepdefs;

import com.aventstack.extentreports.ExtentTest;
import com.thd.projectname.pages.PO_HCM.Hire_withRequisition;
import com.thd.Trash.HirefunctionalityPage_testdatacreator;
import com.thd.projectname.pages.PO_HCM.Hire_withRequisition_6Step;
import com.thd.projectname.pages.PO_Talent.WD_Talent;
import com.thd.projectname.pages.PO_HCM.HirefunctionalityPage;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import cucumber.api.java8.En;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class WD_TalentStepdef implements En {
    private static final Logger log = LogManager.getLogger(WD_TalentStepdef.class);

    public WD_TalentStepdef(ScenarioHooks hooks, WorkdayCommon workdaycommon, WD_Talent talent, HirefunctionalityPage hirepage, HirefunctionalityPage_testdatacreator HireTest, Hire_withRequisition ReqHire, Hire_withRequisition_6Step hireMultiLineCanada) {

        Then("^Start performance Review for employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Empname, String Review_Template, String Manager_Rating, String Overall_Rating, String reviewStartDate, String reviewEndDate) -> {

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

        Then("^Check Start performance Review for employee ([^\"]*)$", (String Employee) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.Check_Start_Perfomance_Review(ReqHire.getWorkdayCommonObj().fetchemployee(Employee));

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Check Start performance Review by Manager ([^\"]*)$", (String Employee) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.Check_Start_Perfomance_Review_By_Manager(ReqHire.getWorkdayCommonObj().fetchemployee(Employee));

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Start Development Plan for employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employeename, String Plan_Start_Date, String Plan_End_Date, String Response, String Development_item, String Status_Manager, String Status_Acknowledgement, String Template_Review) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.Start_Development_Plan(HireTest.getWorkdayCommonObj().fetchemployee(Employeename), Plan_Start_Date, Plan_End_Date, Response, Development_item, Status_Manager, Template_Review);
                talent.validation(HireTest.getWorkdayCommonObj().fetchemployee(Employeename), Plan_Start_Date, Plan_End_Date, Template_Review);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Start Talent Review for Associate ([^\"]*) and ([^\"]*)$", (String Empname, String Talent_Review_Template) -> {


            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.Start_Talent_Review(HireTest.getWorkdayCommonObj().fetchemployee(Empname), Talent_Review_Template);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        Then("^Go to ([^\"]*) Inbox and update the talent profile by adding ([^\"]*) and ([^\"]*) and submit$", (String Empname, String WorkExperience, String Experiencelevel) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.UpdateTalentProfile(HireTest.getWorkdayCommonObj().fetchemployee(Empname), WorkExperience, Experiencelevel);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        When("^Add Goals for Employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Category, String Goalname, String status) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.AddGoalstoEmployee(hireMultiLineCanada.getWorkdayCommonObj().fetchemployee(Employee),Category,Goalname,status);
                //talent.AddGoalstoEmployee(HireTest.getWorkdayCommonObj().fetchemployee(Employee),Category,Goalname,status);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        When("^Add Goals for existing Employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Category, String Goalname, String status) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.AddGoalstoEmployee(HireTest.getWorkdayCommonObj().fetchemployee(Employee), Category, Goalname, status);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        Then("^Edit goals for Employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Goalname, String EditGoal, String status) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.EditGoal(HireTest.getWorkdayCommonObj().fetchemployee(Employee), Goalname, EditGoal, status);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^View goals of the employee ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Goalname, String EditGoal) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();

                log.info("From Stepdef - the employee nameios :"+ReqHire.getWorkdayCommonObj().fetchemployee(Employee));

                talent.ViewGoals(ReqHire.getWorkdayCommonObj().fetchemployee(Employee), Goalname, EditGoal);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


//
//        Then("^Start Disciplinary Action ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Template, String ReasonsSDA, String StartDateSDA, String EndDateSDA) -> {
//
//            talent.setDriver(hooks.getDriverWrapper());
//            talent.setExtentTest(hooks.getExtentTest());
//            workdaycommon.setDriver(hooks.getDriverWrapper());
//            workdaycommon.setExtentTest(hooks.getExtentTest());
//            ExtentTest test = hooks.getExtentTest();
//            try {
//                workdaycommon.gotoWorkdayHomepage();
//                talent.Start_Disciplinary_Action(hireMultiLineCanada.getWorkdayCommonObj().fetchemployee(Employee),Template,ReasonsSDA,StartDateSDA,EndDateSDA);
//                //talent.Start_Disciplinary_Action(HireTest.getWorkdayCommonObj().fetchemployee(Employee),Review_Template,Disciplinary_Action_Reasons,Period_Start_Date,Period_End_Date);
//
//            } catch (Exception e) {
//                log.error("Exception/Issue occurred:" + e.getMessage());
//                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
//                workdaycommon.Driverclose();
//            }
//        });

        Then("^Start Disciplinary Action ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String Template, String ReasonSDA, String StartDateSDA, String EndDateSDA) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.Start_Disciplinary_Action(ReqHire.getWorkdayCommonObj().fetchemployee(Employee), Template, ReasonSDA, StartDateSDA, EndDateSDA);
       // WD33
//                talent.Start_Disciplinary_Action(hireMultiLineCanada.getWorkdayCommonObj().fetchemployee(Employee), Template, ReasonSDA, StartDateSDA, EndDateSDA);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Regular Check Start performance Review for employee([^\"]*)$", (String Employee) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.Check_Start_Perfomance_Review_Regular(HireTest.getWorkdayCommonObj().fetchemployee(Employee));

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });

        And("^Check Start performance Review for Intern ([^\"]*)$", (String Employee) -> {

            talent.setDriver(hooks.getDriverWrapper());
            talent.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            try {
                workdaycommon.gotoWorkdayHomepage();
                talent.Check_Start_Perfomance_Review_Intern(Employee);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                ExtentTest test = hooks.getExtentTest();
                // test.fail("Exception/Issue occurred in this step :" + e.getMessage());
            }
        });


    }
}
