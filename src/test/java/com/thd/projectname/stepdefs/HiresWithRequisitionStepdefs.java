package com.thd.projectname.stepdefs;

import com.aventstack.extentreports.ExtentTest;
import com.thd.Trash.HireUSpage;
import com.thd.Trash.HirefunctionalityPage_testdatacreator;
import com.thd.projectname.pages.PO_HCM.*;
import com.thd.projectname.pages.PO_HCM.PO_ProductionCr.Temp_Hire_withRequisition;
import com.thd.projectname.pages.PO_HCM.PO_ProductionCr.Temp_ReHire_withRequisition;
import com.thd.projectname.pages.PO_HCM.PO_ProductionCr.Temp_USHire_withRequisition;
import com.thd.projectname.pages.PO_HCM.PO_ProductionCr.Temp_USHire_withRequisition_6Step;
import com.thd.projectname.pages.PO_Others.HomePage;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import cucumber.api.java8.En;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class HiresWithRequisitionStepdefs implements En {
    private static final Logger log = LogManager.getLogger(HiresWithRequisitionStepdefs.class);

    public HiresWithRequisitionStepdefs(ScenarioHooks hooks, HirefunctionalityPage_testdatacreator testdatagenerator, Hire_withRequisition hirerequisition, Hire_withRequisition_6Step hirerequisition6step, WorkdayCommon workdaycommon, HomePage homePage, HirefunctionalityPage hirePage, JobChangesBP jobchangesbp, HireUSpage hireUSPage, Temp_Hire_withRequisition tempHireWithRequisition, Temp_ReHire_withRequisition tempReHireCAN, USHire_withRequisition ReqUSHire, USHire_withRequisition_6Step ReqUSHire6Step, Temp_USHire_withRequisition Temp_ReqUSHire, Temp_USHire_withRequisition_6Step Temp_ReqUSHire6Step, ReHire_withRequisition ReqReHireCAN) {

//      Canada test data generator with requisition -------------------------------------------------------------------------------

        Then("^Hire associate with job requisition ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String Country, String Hiredate, String SSN, String JobProfile) -> {
            hirerequisition.setDriver(hooks.getDriverWrapper());
            hirerequisition.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //  hirePage.startProxy();
                workdaycommon.gotoWorkdayHomepage();
                log.info("CREATING TEST DATA");
                hirerequisition.CreateJobRequisition(SUPORG, JobProfile);
                hirerequisition.HirefromRequisition();
                hirerequisition.TD_createPrehire(Country);
                hirerequisition.TD_Hire_HireAssociate(JobProfile, Hiredate);
                hirerequisition.TD_Hire_OrganizationAssignments();
                hirerequisition.TD_Hire_EditID(Country);
                hirerequisition.TD_Hire_ProposeCompensation(Country);
                hirerequisition.TD_Onboarding(Country, JobProfile);
                log.info("Associate Hired with Job Requisition");
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        //commenting the following cz hire functionality is changed

//        Then("^Hire associate with job requisition ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String Country, String Hiredate, String SSN, String JobProfile) -> {
//            tempHireWithRequisition.setDriver(hooks.getDriverWrapper());
//            tempHireWithRequisition.setExtentTest(hooks.getExtentTest());
//            workdaycommon.setDriver(hooks.getDriverWrapper());
//            workdaycommon.setExtentTest(hooks.getExtentTest());
//            ExtentTest test = hooks.getExtentTest();
//            try {
//                //  hirePage.startProxy();
//                workdaycommon.gotoWorkdayHomepage();
//                log.info("CREATING TEST DATA");
//                tempHireWithRequisition.CreateJobRequisition(SUPORG, JobProfile);
//                tempHireWithRequisition.HirefromRequisition();
//                tempHireWithRequisition.TD_createPrehire(Country);
//                tempHireWithRequisition.TD_Hire_HireAssociate(JobProfile, Hiredate);
//                tempHireWithRequisition.TD_Hire_OrganizationAssignments();
//                tempHireWithRequisition.TD_Hire_EditID(Country);
//                tempHireWithRequisition.TD_Hire_ChangePersonalInfo(Country);
//                tempHireWithRequisition.TD_Hire_ProposeCompensation(Country);
////                tempHireWithRequisition.TD_Onboarding(Country, JobProfile);
//                log.info("Associate Hired with Job Requisition");
//            } catch (Throwable e) {
//                log.error("Exception/Issue occurred:" + e.getMessage());
//                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
//                workdaycommon.Driverclose();
//            }
//        });

//       ----------------------------------------------------------------------------------------------------------------------------

//        US test data generator with requisition------------------------------------------------------------------------------------

        Then("^Hire US associate with job requisition ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String Country, String Hiredate, String Position, String JobProfile) -> {
            ReqUSHire.setDriver(hooks.getDriverWrapper());
            ReqUSHire.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //  hirePage.startProxy();
                workdaycommon.gotoWorkdayHomepage();
                log.info("CREATING TEST DATA");
                ReqUSHire.CreateJobRequisition(SUPORG, JobProfile);
                ReqUSHire.HirefromRequisition();
                ReqUSHire.TD_createPrehire(Country);
                ReqUSHire.TD_Hire_HireAssociate(JobProfile, Hiredate);
                ReqUSHire.TD_Hire_OrganizationAssignments();
                ReqUSHire.TD_Hire_EditID(Country);
                ReqUSHire.TD_Hire_ProposeCompensation(Country);
                ReqUSHire.TD_Onboarding(Country, JobProfile);
                log.info("Associate Hired with Job Requisition");
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


//        --------------------------------------------------------------------------------------------------------------------------

        //*****************************Commented the below lines as the hire flow is changed*******************************

//        //    Temp    US test data generator with requisition------------------------------------------------------------------------------------
//
//        Then("^Hire US associate with job requisition ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String Country, String Hiredate, String Position, String JobProfile) -> {
//            Temp_ReqUSHire.setDriver(hooks.getDriverWrapper());
//            Temp_ReqUSHire.setExtentTest(hooks.getExtentTest());
//            workdaycommon.setDriver(hooks.getDriverWrapper());
//            workdaycommon.setExtentTest(hooks.getExtentTest());
//            ExtentTest test = hooks.getExtentTest();
//            try {
//                //  hirePage.startProxy();
//                workdaycommon.gotoWorkdayHomepage();
//                log.info("CREATING TEST DATA");
//                Temp_ReqUSHire.CreateJobRequisition(SUPORG, JobProfile);
//                Temp_ReqUSHire.HirefromRequisition();
//                Temp_ReqUSHire.TD_createPrehire(Country);
//                Temp_ReqUSHire.TD_Hire_HireAssociate(JobProfile, Hiredate);
//                Temp_ReqUSHire.TD_Hire_OrganizationAssignments();
//                Temp_ReqUSHire.TD_Hire_EditID(Country);
//                Temp_ReqUSHire.TD_Hire_ChangePersonalInfo(Country);
//                Temp_ReqUSHire.TD_Hire_ProposeCompensation(Country);
//                Temp_ReqUSHire.TD_Onboarding(Country, JobProfile);
//                log.info("Associate Hired with Job Requisition");
//            } catch (Throwable e) {
//                log.error("Exception/Issue occurred:" + e.getMessage());
//                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
//                workdaycommon.Driverclose();
//            }
//        });
//
//
////        --------------------------------------------------------------------------------------------------------------------------



//      Canada test data generator with requisition (6 Steps)-----------------------------------------------------------------------

        Then("^Canada Hire With Requisition - Creating Job requisition ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String JobProfile, String ReqReason, String RecruitStartDate, String TargetHireDate, String Location, String Company, String CostCenter, String Department) -> {
            hirerequisition6step.setDriver(hooks.getDriverWrapper());
            hirerequisition6step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                hirerequisition6step.CreateJobRequisition(SUPORG, JobProfile, ReqReason, RecruitStartDate, TargetHireDate, Location, Company, CostCenter, Department);
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Canada Hire With Requisition - Hire from requisition$", () -> {
            hirerequisition6step.setDriver(hooks.getDriverWrapper());
            hirerequisition6step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
//                workdaycommon.gotoWorkdayHomepage();
                hirerequisition6step.HirefromRequisition();
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Canada Hire With Requisition - Create Prehire ([^\"]*)$", (String Country) -> {
            hirerequisition6step.setDriver(hooks.getDriverWrapper());
            hirerequisition6step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
//                workdaycommon.gotoWorkdayHomepage();
                hirerequisition6step.CreatePrehire(Country);
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Canada Hire With Requisition - Hire Associate([^\"]*) and ([^\"]*)$", (String HireDate, String Reason) -> {
            hirerequisition6step.setDriver(hooks.getDriverWrapper());
            hirerequisition6step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
//                workdaycommon.gotoWorkdayHomepage();
                hirerequisition6step.HireAssociate(HireDate, Reason);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Canada Hire With Requisition - Organization Assignments([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Company, String CostCenter, String BusinessUnit, String Department) -> {
            hirerequisition6step.setDriver(hooks.getDriverWrapper());
            hirerequisition6step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //workdaycommon.gotoWorkdayHomepage();
                hirerequisition6step.Hire_OrganizationAssignments(Company, CostCenter, BusinessUnit, Department);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });

        Then("^Canada Hire With Requisition - Edit ID([^\"]*)and ([^\"]*)$", (String Country, String GovID) -> {
            hirerequisition6step.setDriver(hooks.getDriverWrapper());
            hirerequisition6step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //workdaycommon.gotoWorkdayHomepage();
                hirerequisition6step.Hire_EditID(Country, GovID);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();


            }
        });

        Then("^Canada Hire With Requisition - Propose Compensation([^\"]*) and ([^\"]*)$", (String Amount, String Country) -> {
            hirerequisition6step.setDriver(hooks.getDriverWrapper());
            hirerequisition6step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
//                workdaycommon.gotoWorkdayHomepage();
                hirerequisition6step.Hire_ProposeCompensation(Amount, Country);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });

        Then("^Canada Hire With Requisition - Onboarding the employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Country, String FNameEmerCon, String InstituteNum ,String BranchID, String AccNum, String BankName) -> {
            hirerequisition6step.setDriver(hooks.getDriverWrapper());
            hirerequisition6step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                hirerequisition6step.Onboarding(Country, FNameEmerCon, InstituteNum, BranchID, AccNum, BankName);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });

//        ---------------------------------------------------------------------------------------------------------------------------




//        US test data generator with requisition (6 Steps)--------------------------------------------------------------------------

        Then("^US Hire With Requisition - Creating Job requisition ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String JobProfile, String ReqReason, String RecruitStartDate, String TargetHireDate, String Location, String Company, String CostCenter, String Department) -> {
            ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
            ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                ReqUSHire6Step.CreateJobRequisition(SUPORG, JobProfile, ReqReason, RecruitStartDate, TargetHireDate, Location, Company, CostCenter, Department);
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^US Hire With Requisition - Hire from requisition$", () -> {
            ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
            ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
//                workdaycommon.gotoWorkdayHomepage();
                ReqUSHire6Step.HirefromRequisition();
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^US Hire With Requisition - Create Prehire ([^\"]*)$", (String Country) -> {
            ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
            ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
//                workdaycommon.gotoWorkdayHomepage();
                ReqUSHire6Step.CreatePrehire(Country);
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^US Hire With Requisition - Hire Associate([^\"]*) and ([^\"]*)$", (String HireDate, String Reason) -> {
            ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
            ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
//                workdaycommon.gotoWorkdayHomepage();
                ReqUSHire6Step.HireAssociate(HireDate, Reason);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^US Hire With Requisition - Organization Assignments([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Company, String CostCenter, String BusinessUnit, String Department) -> {
            ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
            ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //workdaycommon.gotoWorkdayHomepage();
                ReqUSHire6Step.Hire_OrganizationAssignments(Company, CostCenter, BusinessUnit, Department);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });

        Then("^US Hire With Requisition - Edit ID([^\"]*) and ([^\"]*)$", (String Country, String GovID) -> {
            ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
            ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //workdaycommon.gotoWorkdayHomepage();
                ReqUSHire6Step.Hire_EditID(Country, GovID);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();


            }
        });

        Then("^US Hire With Requisition - Propose Compensation([^\"]*) and ([^\"]*)$", (String Amount, String Country) -> {
            ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
            ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
//                workdaycommon.gotoWorkdayHomepage();
                ReqUSHire6Step.Hire_ProposeCompensation(Amount, Country);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });

        Then("^US Hire With Requisition - Onboarding an employee([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Country, String FNemergencyConctOnBoard, String BankName, String RoutingNum, String AccountNum) -> {
            ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
            ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                ReqUSHire6Step.Onboarding(Country, FNemergencyConctOnBoard, BankName, RoutingNum, AccountNum);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });


        //*****************************Commented the below lines as the hire flow is changed*******************************

////-------------------------------------------Temparary Hire--------------------------------------------------------------------
//
////        US test data generator with requisition (6 Steps)--------------------------------------------------------------------------
//
//        Then("^US Hire With Requisition - Creating Job requisition ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String JobProfile, String ReqReason, String RecruitStartDate, String TargetHireDate, String Location, String Company, String CostCenter, String Department) -> {
//            Temp_ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
//            Temp_ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
//            workdaycommon.setDriver(hooks.getDriverWrapper());
//            workdaycommon.setExtentTest(hooks.getExtentTest());
//            ExtentTest test = hooks.getExtentTest();
//            try {
//                workdaycommon.gotoWorkdayHomepage();
//                Temp_ReqUSHire6Step.CreateJobRequisition(SUPORG, JobProfile, ReqReason, RecruitStartDate, TargetHireDate, Location, Company, CostCenter, Department);
//            } catch (Throwable e) {
//                log.error("Exception/Issue occurred:" + e.getMessage());
//                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
//                workdaycommon.Driverclose();
//            }
//        });
//
//        Then("^US Hire With Requisition - Hire from requisition$", () -> {
//            Temp_ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
//            Temp_ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
//            workdaycommon.setDriver(hooks.getDriverWrapper());
//            workdaycommon.setExtentTest(hooks.getExtentTest());
//            ExtentTest test = hooks.getExtentTest();
//            try {
////                workdaycommon.gotoWorkdayHomepage();
//                Temp_ReqUSHire6Step.HirefromRequisition();
//            } catch (Throwable e) {
//                log.error("Exception/Issue occurred:" + e.getMessage());
//                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
//                workdaycommon.Driverclose();
//            }
//        });
//
//        Then("^US Hire With Requisition - Create Prehire ([^\"]*)$", (String Country) -> {
//            Temp_ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
//            Temp_ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
//            workdaycommon.setDriver(hooks.getDriverWrapper());
//            workdaycommon.setExtentTest(hooks.getExtentTest());
//            ExtentTest test = hooks.getExtentTest();
//            try {
////                workdaycommon.gotoWorkdayHomepage();
//                Temp_ReqUSHire6Step.CreatePrehire(Country);
//            } catch (Throwable e) {
//                log.error("Exception/Issue occurred:" + e.getMessage());
//                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
//                workdaycommon.Driverclose();
//            }
//        });
//
//        Then("^US Hire With Requisition - Hire Associate([^\"]*) and ([^\"]*)$", (String HireDate, String Reason) -> {
//            Temp_ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
//            Temp_ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
//            workdaycommon.setDriver(hooks.getDriverWrapper());
//            workdaycommon.setExtentTest(hooks.getExtentTest());
//            ExtentTest test = hooks.getExtentTest();
//            try {
////                workdaycommon.gotoWorkdayHomepage();
//                Temp_ReqUSHire6Step.HireAssociate(HireDate, Reason);
//
//            } catch (Throwable e) {
//                log.error("Exception/Issue occurred:" + e.getMessage());
//                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
//                workdaycommon.Driverclose();
//            }
//        });
//
//        Then("^US Hire With Requisition - Organization Assignments([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Company, String CostCenter, String BusinessUnit, String Department) -> {
//            Temp_ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
//            Temp_ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
//            workdaycommon.setDriver(hooks.getDriverWrapper());
//            workdaycommon.setExtentTest(hooks.getExtentTest());
//            ExtentTest test = hooks.getExtentTest();
//            try {
//                //workdaycommon.gotoWorkdayHomepage();
//                Temp_ReqUSHire6Step.Hire_OrganizationAssignments(Company, CostCenter, BusinessUnit, Department);
//
//            } catch (Throwable e) {
//                log.error("Exception/Issue occurred:" + e.getMessage());
//                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
//                workdaycommon.Driverclose();
//
//            }
//        });
//
//        Then("^US Hire With Requisition - Edit ID([^\"]*) and ([^\"]*)$", (String Country, String GovID) -> {
//            Temp_ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
//            Temp_ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
//            workdaycommon.setDriver(hooks.getDriverWrapper());
//            workdaycommon.setExtentTest(hooks.getExtentTest());
//            ExtentTest test = hooks.getExtentTest();
//            try {
//                //workdaycommon.gotoWorkdayHomepage();
//                Temp_ReqUSHire6Step.Hire_EditID(Country, GovID);
//
//            } catch (Throwable e) {
//                log.error("Exception/Issue occurred:" + e.getMessage());
//                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
//                workdaycommon.Driverclose();
//
//
//            }
//        });
//
//        Then("^US Hire With Requisition - Propose Compensation([^\"]*) and ([^\"]*)$", (String Amount, String Country) -> {
//            Temp_ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
//            Temp_ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
//            workdaycommon.setDriver(hooks.getDriverWrapper());
//            workdaycommon.setExtentTest(hooks.getExtentTest());
//            ExtentTest test = hooks.getExtentTest();
//            try {
////                workdaycommon.gotoWorkdayHomepage();
//                Temp_ReqUSHire6Step.Hire_ProposeCompensation(Amount, Country);
//
//            } catch (Throwable e) {
//                log.error("Exception/Issue occurred:" + e.getMessage());
//                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
//                workdaycommon.Driverclose();
//
//            }
//        });
//
//
//        Then("^US Hire With Requisition - Change Personal Info([^\"]*)$", (String Country) -> {
//            Temp_ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
//            Temp_ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
//            workdaycommon.setDriver(hooks.getDriverWrapper());
//            workdaycommon.setExtentTest(hooks.getExtentTest());
//            ExtentTest test = hooks.getExtentTest();
//            try {
//                //workdaycommon.gotoWorkdayHomepage();
//                Temp_ReqUSHire6Step.TD_Hire_ChangePersonalInfo(Country);
//
//            } catch (Throwable e) {
//                log.error("Exception/Issue occurred:" + e.getMessage());
//                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
//                workdaycommon.Driverclose();
//
//            }
//        });
//
//
//        Then("^US Hire With Requisition - Onboarding an employee([^\"]*) and ([^\"])*$", (String Country, String JobProfile) -> {
//            Temp_ReqUSHire6Step.setDriver(hooks.getDriverWrapper());
//            Temp_ReqUSHire6Step.setExtentTest(hooks.getExtentTest());
//            workdaycommon.setDriver(hooks.getDriverWrapper());
//            workdaycommon.setExtentTest(hooks.getExtentTest());
//            ExtentTest test = hooks.getExtentTest();
//            try {
//                Temp_ReqUSHire6Step.TD_Onboarding(Country, JobProfile);
//
//            } catch (Throwable e) {
//                log.error("Exception/Issue occurred:" + e.getMessage());
//                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
//                workdaycommon.Driverclose();
//
//            }
//        });
//
//
//        //----------------------------------------------------------------------------------------------------------------------------



        //commented the below cz ReHire/Hire had functionality changes
        /*Then("^Re-Hire associate with job requisition ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String SUPORG, String Country, String Hiredate, String SSN, String JobProfile) -> {
            ReqReHireCAN.setDriver(hooks.getDriverWrapper());
            ReqReHireCAN.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //  hirePage.startProxy();
                workdaycommon.gotoWorkdayHomepage();
                log.info("CREATING TEST DATA");
                ReqReHireCAN.CreateJobRequisition(SUPORG, JobProfile);
                ReqReHireCAN.HirefromRequisition(ReqHire.getWorkdayCommonObj().fetchemployee(Employee));
//                ReqReHireCAN.TD_createPrehire(Country);
                ReqReHireCAN.TD_Hire_HireAssociate(JobProfile, Hiredate);
                ReqReHireCAN.TD_Hire_OrganizationAssignments();
                ReqReHireCAN.TD_Hire_EditID(Country);
                ReqReHireCAN.TD_Hire_ProposeCompensation(ReqHire.getWorkdayCommonObj().fetchemployee(Employee),Country);
                ReqReHireCAN.TD_Onboarding(ReqHire.getWorkdayCommonObj().fetchemployee(Employee),Country, JobProfile);
                log.info("Associate Hired with Job Requisition");
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });
*/


        Then("^Re-Hire associate with job requisition ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String SUPORG, String Country, String Hiredate, String SSN, String JobProfile) -> {
            ReqReHireCAN.setDriver(hooks.getDriverWrapper());
            ReqReHireCAN.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //  hirePage.startProxy();
                workdaycommon.gotoWorkdayHomepage();
                log.info("CREATING TEST DATA");
                ReqReHireCAN.CreateJobRequisition(SUPORG, JobProfile);
                ReqReHireCAN.HirefromRequisition(ReqReHireCAN.getWorkdayCommonObj().fetchemployee(Employee));
//                ReqReHireCAN.TD_createPrehire(Country);
                ReqReHireCAN.TD_Hire_HireAssociate(JobProfile, Hiredate);
                ReqReHireCAN.TD_Hire_OrganizationAssignments();
                ReqReHireCAN.TD_Hire_EditID(Country);
                ReqReHireCAN.TD_Hire_ProposeCompensation(ReqReHireCAN.getWorkdayCommonObj().fetchemployee(Employee),Country);
                ReqReHireCAN.TD_Onboarding(ReqReHireCAN.getWorkdayCommonObj().fetchemployee(Employee),Country, JobProfile);
                log.info("Associate Hired with Job Requisition");
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Re-Hire associate to different Company with job requisition ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Employee, String SUPORG, String Country, String Hiredate, String SSN, String JobProfile) -> {
            ReqReHireCAN.setDriver(hooks.getDriverWrapper());
            ReqReHireCAN.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //  hirePage.startProxy();
                workdaycommon.gotoWorkdayHomepage();
                log.info("CREATING TEST DATA");
//                ReqReHireCAN.CreateJobRequisition(SUPORG, JobProfile);
                ReqReHireCAN.HirefromRequisition(ReqReHireCAN.getWorkdayCommonObj().fetchemployee(Employee));
//                ReqReHireCAN.TD_createPrehire(Country);
                ReqReHireCAN.TD_Hire_HireAssociate(JobProfile, Hiredate);
                ReqReHireCAN.TD_Hire_OrganizationAssignments();
                ReqReHireCAN.TD_Hire_EditID_DiffCountry(Country);
                ReqReHireCAN.TD_Hire_ProposeCompensation_DiffCountry(ReqReHireCAN.getWorkdayCommonObj().fetchemployee(Employee),Country);
                ReqReHireCAN.TD_Onboarding(ReqReHireCAN.getWorkdayCommonObj().fetchemployee(Employee),Country, JobProfile);
                log.info("Associate Hired with Job Requisition");
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        //------------------------------------------------------------------------------------------------------------



    }
}