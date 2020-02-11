package com.thd.projectname.stepdefs;

import com.aventstack.extentreports.ExtentTest;
import com.thd.Trash.HireUSpage;
import com.thd.Trash.HirefunctionalityPage_testdatacreator;
import com.thd.projectname.pages.PO_HCM.*;
import com.thd.projectname.pages.PO_HCM.PO_ProductionCr.*;
import com.thd.projectname.pages.PO_Others.HomePage;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import cucumber.api.java8.En;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class AllHiresStepdefs implements En {
    private static final Logger log = LogManager.getLogger(AllHiresStepdefs.class);

    public AllHiresStepdefs(ScenarioHooks hooks, HirefunctionalityPage_testdatacreator testdatagenerator, Hire_withRequisition ReqHire, Hire_withRequisition_6Step hirerequisition6step, WorkdayCommon workdaycommon, HomePage homePage, HirefunctionalityPage hirePage, JobChangesBP jobchangesbp, HireUSpage hireUSPage, ReHire_withRequisition ReqReHireCAN, USHire_withRequisition ReqUSHire, USHire_withRequisition_6Step ReqUSHire6Step) {
//      Canada test data generator (6 Steps) -----------------------------------------------

        And("^Canada Hire - Create position in an organization ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String Position, String Location, String JobFamily, String JobProfile, String TimeType, String WorkerType, String AvailabilityDate, String EarliestHireDate) -> {
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
                test.fail("Exception/Issue occurred:" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        And("^Canada Hire - Create Pre-hire with Firstname and Lastname ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Country, String Firstname, String Lastname, String Home_city, String Home_province, String Home_postalcode, String Home_type, String Work_addressline1, String Work_type) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                hirePage.createPrehire(Country, Firstname, Lastname, Home_city, Home_province, Home_postalcode, Home_type, Work_addressline1, Work_type);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Canada Hire - Hire Associate([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Reason, String SUPORG, String WorkerType, String JobProfile, String TimeType, String Location, String PayRateType, String HireDate) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                hirePage.Hire_HireAssociate(Reason, SUPORG, WorkerType, JobProfile, TimeType, Location, PayRateType, HireDate);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^Canada Hire - Organization Assignments([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Company, String CostCenter, String BusinessUnit, String Department) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //workdaycommon.gotoWorkdayHomepage();
                hirePage.Hire_OrganizationAssignments(Company, CostCenter, BusinessUnit, Department);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });

        Then("^Canada Hire - Edit ID([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Country, String GovID, String SSNNumber) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //workdaycommon.gotoWorkdayHomepage();
                hirePage.Hire_EditID(Country, GovID, SSNNumber);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();


            }
        });

        Then("^Canada Hire - Propose Compensation([^\"]*) and ([^\"]*)$", (String Amount, String Country) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
//                workdaycommon.gotoWorkdayHomepage();
                hirePage.Hire_ProposeCompensation(Amount, Country);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });

        Then("^Canada Hire - Onboarding the employee ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Country, String FNemergencyConctOnBoard, String LNemergencyConctOnBoard, String RelationShpOnB, String MailIdONB, String MobileOnbard, String JobProfile, String DOB) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                hirePage.Onboarding(Country, FNemergencyConctOnBoard, LNemergencyConctOnBoard, RelationShpOnB, MailIdONB, MobileOnbard, JobProfile, DOB);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });

//        -------------------------------------------------------------------------------


//      Canada test data generator ------------------------------------------------------------------------------------------------------

        Then("^Hire Test data Generator ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String Country, String Hiredate, String SSNumber, String JobProfile) -> {
            testdatagenerator.setDriver(hooks.getDriverWrapper());
            testdatagenerator.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //  hirePage.startProxy();
                workdaycommon.gotoWorkdayHomepage();
                log.info("CREATING TEST DATA");
                testdatagenerator.TD_createPosition(SUPORG);
                testdatagenerator.TD_createPrehire(Country);
                testdatagenerator.TD_Hire_HireAssociate(SUPORG, JobProfile, Hiredate);
                testdatagenerator.TD_Hire_OrganizationAssignments();
                testdatagenerator.TD_Hire_EditID(Country, SSNumber);
                testdatagenerator.TD_Hire_ProposeCompensation(Country);
                testdatagenerator.TD_Onboarding(Country, JobProfile);
                log.info("TEST DATA CREATION COMPLETED");
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

//      Canada test data generator with requisition ---------------------------------------------------------------------------



        //---------------------------------------------------------------------------------------------------------------------------




//         US test data generator (6 Steps) ------------------------------------------------------------------------------------------------

        And("^US Hire - Create position in an organization ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String Position, String Location, String JobFamily, String JobProfile, String TimeType, String WorkerType, String AvailabilityDate, String EarliestHireDate) -> {
            hireUSPage.setDriver(hooks.getDriverWrapper());
            hireUSPage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {

                workdaycommon.gotoWorkdayHomepage();
                hireUSPage.createPosition(SUPORG, Position, Location, JobFamily, JobProfile, TimeType, WorkerType, AvailabilityDate, EarliestHireDate);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred:" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        And("^US Hire - Create Pre-hire with Firstname and Lastname([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Country, String Firstname, String Lastname, String Home_city, String Home_province, String Home_postalcode, String Home_type, String Work_addressline1, String Work_type) -> {
            hireUSPage.setDriver(hooks.getDriverWrapper());
            hireUSPage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                hireUSPage.createPrehire(Country, Firstname, Lastname, Home_city, Home_province, Home_postalcode, Home_type, Work_addressline1, Work_type);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^US Hire - Hire Associate([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Reason, String Position, String SUPORG, String WorkerType, String JobProfile, String TimeType, String Location, String PayRateType, String HireDate) -> {
            hireUSPage.setDriver(hooks.getDriverWrapper());
            hireUSPage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                hireUSPage.Hire_HireAssociate(Reason, Position, SUPORG, WorkerType, JobProfile, TimeType, Location, PayRateType, HireDate);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        Then("^US Hire - Organization Assignments([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Company, String CostCenter, String BusinessUnit, String Department) -> {
            hireUSPage.setDriver(hooks.getDriverWrapper());
            hireUSPage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //workdaycommon.gotoWorkdayHomepage();
                hireUSPage.Hire_OrganizationAssignments(Company, CostCenter, BusinessUnit, Department);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });

        Then("^US Hire - Edit ID([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Country, String GovID, String SSNNumber) -> {
            hireUSPage.setDriver(hooks.getDriverWrapper());
            hireUSPage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //workdaycommon.gotoWorkdayHomepage();
                hireUSPage.Hire_EditID(Country, GovID, SSNNumber);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();


            }
        });

        Then("^US Hire - Propose Compensation([^\"]*) and ([^\"]*)$", (String Amount, String Country) -> {
            hireUSPage.setDriver(hooks.getDriverWrapper());
            hireUSPage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
//                workdaycommon.gotoWorkdayHomepage();
                hireUSPage.Hire_ProposeCompensation(Amount, Country);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });

        Then("^US Hire - Onboarding an employee([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Country, String FNemergencyConctOnBoard, String LNemergencyConctOnBoard, String RelationShpOnB, String MailIdONB, String MobileOnbard, String JobProfile, String DOB) -> {
            hireUSPage.setDriver(hooks.getDriverWrapper());
            hireUSPage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                hireUSPage.Onboarding(Country, FNemergencyConctOnBoard, LNemergencyConctOnBoard, RelationShpOnB, MailIdONB, MobileOnbard, JobProfile, DOB);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });


        //------------------------------------------------------------------------------------------------------------------------------


    }
}