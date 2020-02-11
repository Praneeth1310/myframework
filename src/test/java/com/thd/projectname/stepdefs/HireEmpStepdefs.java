package com.thd.projectname.stepdefs;

import com.aventstack.extentreports.ExtentTest;
import com.thd.Trash.HireUSpage;
import com.thd.Trash.HirefunctionalityPage_testdatacreator;
import com.thd.projectname.pages.PO_HCM.*;
import com.thd.projectname.pages.PO_HCM.PO_ProductionCr.Temp_Hire_withRequisition;
import com.thd.projectname.pages.PO_Others.WorkdayCommon;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.thd.projectname.pages.PO_Others.HomePage;
import cucumber.api.java8.En;


public class HireEmpStepdefs implements En {
    private static final Logger log = LogManager.getLogger(HireEmpStepdefs.class);

    public HireEmpStepdefs(ScenarioHooks hooks, HirefunctionalityPage_testdatacreator testdatagenerator, Hire_withRequisition hirerequisition, Hire_withRequisition_6Step hireMultiLineCanada, WorkdayCommon workdaycommon, HomePage homePage, HirefunctionalityPage hirePage, JobChangesBP jobchangesbp, HireUSpage hireUSPage, Temp_Hire_withRequisition tempHireWithRequisition, Hire_withRequisition ReqHire, USHire_withRequisition ReqUSHire) {
/*
		Given("^Login to Workday ([^\"]*)$", (String WDTenant) -> {
			homePage.setDriver(hooks.getDriverWrapper());
			homePage.setExtentTest(hooks.getExtentTest());
			homePage.WorkdayLogin(WDTenant);
			homePage.login();

		});

		*/

        Given("^Login to Workday (.*)$", (String tenant) -> {
            homePage.setDriver(hooks.getDriverWrapper());
            homePage.setExtentTest(hooks.getExtentTest());
            homePage.WDScreenLoad(tenant);
            homePage.login(tenant);

        });

        Then("^Step (.*) Completed$", (String stepnumber) -> {
                    try {
              workdaycommon.setDriver(hooks.getDriverWrapper());
                        workdaycommon.setExtentTest(hooks.getExtentTest());
                        workdaycommon.Testresult(stepnumber , hooks.sessionId);

                    } catch (Throwable e) {
                        log.error("Exception/Issue occurred:" + e.getMessage());

                    }
                });


        When("^Proxy as (.*)$", (String role) -> {

            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                workdaycommon.startProxy(role);
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred:" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });


        When("^Stop Proxy$",() -> {
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                workdaycommon.stopProxy();
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred:" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        When("^Fetch and proxy to (.*)$", (String role) -> {
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                workdaycommon.startProxy(role);
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred:" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        And("^View Pre Hire Names List Firstname and Lastname$", () -> {
            // Write code here that turns the phrase above into concrete actions
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                hirePage.viewPreHirenames();
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        And("^Hire Employee for the Organization Firstname and Lastname and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Position, String SSNNumber, String SUPORG, String Country, String GovID) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //  hirePage.startProxy();
                workdaycommon.gotoWorkdayHomepage();
                hirePage.Hire(Position, SUPORG, Country, GovID);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        And("^View Hired employee Firstname and Lastname$", () -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {

                workdaycommon.gotoWorkdayHomepage();
                hirePage.viewHiredEmployee();
            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });

        Then("^Closing a Position ([^\"]*)$", (String Position) -> {
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


        And("^Create position in the organization ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String Location, String JobFamily, String JobProfile, String TimeType, String WorkerType, String AvailabilityDate, String EarliestHireDate) -> {
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



        Then("^Creating Job requisition ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String Position, String WorkerType, String Reason, String WorkerSubtype, String JobProfile, String Company, String Costcenter, String PrimaryLocation) -> {
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

        Then("^Change the personal information of the employee ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Gender, String DOB, String Race) -> {

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

        Then("^Close Job requisition ([^\"]*) and ([^\"]*)$", (String JobRequisite, String Reason) -> {

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

        Then("^Terminating the Employees ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Empname, String TerminationType, String PrimaryReason, String EligibleReHire, String SearchWith, String localReason, String Termdate) -> {
            jobchangesbp.setDriver(hooks.getDriverWrapper());
            jobchangesbp.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {

                workdaycommon.gotoWorkdayHomepage();
                jobchangesbp.TerminateEmp(ReqUSHire.getWorkdayCommonObj().fetchemployee(Empname), TerminationType, PrimaryReason, EligibleReHire, SearchWith, localReason, Termdate);

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });

        And("^View associate history by category ([^\"]*)$", (String Empname) -> {
            jobchangesbp.setDriver(hooks.getDriverWrapper());
            jobchangesbp.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {

                workdaycommon.gotoWorkdayHomepage();
                jobchangesbp.AssociateHistory(ReqHire.getWorkdayCommonObj().fetchemployee(Empname));

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        And("^Review Disciplinary action in associate history by category ([^\"]*)$", (String Employee) -> {
            jobchangesbp.setDriver(hooks.getDriverWrapper());
            jobchangesbp.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                log.info("Step-1");
                jobchangesbp.ReviewDesciplinaryAction(ReqHire.getWorkdayCommonObj().fetchemployee(Employee));
                log.info("Step-2");

            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });



        Then("^Create a Contract Contingent worker([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Organization, String EmployeePreHire, String Position, String WorkerType, String JobProfile, String TimeType, String UserName_Inbox, String NewPwd_Inbox, String VerifyNewPwd_Inbox) -> {

//Create a Contract Contingent worker
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


//Original - Hire

        Then("^Propose Compensation Hire ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String Reason, String Position, String SSNNumber, String SUPORG, String Country, String GovID, String Company, String CostCenter) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                workdaycommon.gotoWorkdayHomepage();
                hirePage.ProposeCompHire(Reason, Position, SSNNumber, SUPORG, Country, GovID, Company, CostCenter);

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });


        Then("^Onboarding - Manager Confirmation([^\"]*)$", (String Employee) -> {
            hirePage.setDriver(hooks.getDriverWrapper());
            hirePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {

                hirePage.Onboarding_Manager_Confirmation(hireMultiLineCanada.getWorkdayCommonObj().fetchemployee(Employee));

            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }
        });


        And("^Logout from Application", () -> {
            homePage.setDriver(hooks.getDriverWrapper());
            homePage.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {

                workdaycommon.gotoWorkdayHomepage();
                homePage.LogoutWorkday();
            } catch (Exception e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();
            }

        });

        Then("^Hire Intern Test data Generator ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*) and ([^\"]*)$", (String SUPORG, String Country, String Hiredate, String SSNumber, String JobProfile) -> {
            tempHireWithRequisition.setDriver(hooks.getDriverWrapper());
            tempHireWithRequisition.setExtentTest(hooks.getExtentTest());
            workdaycommon.setDriver(hooks.getDriverWrapper());
            workdaycommon.setExtentTest(hooks.getExtentTest());
            ExtentTest test = hooks.getExtentTest();
            try {
                //  hirePage.startProxy();
                workdaycommon.gotoWorkdayHomepage();
                log.info("CREATING TEST DATA");
                tempHireWithRequisition.CreateJobRequisition(SUPORG, JobProfile);
                tempHireWithRequisition.HirefromRequisition();
                tempHireWithRequisition.TD_createPrehire(Country);
                tempHireWithRequisition.TD_Hire_HireAssociate(JobProfile, Hiredate);
                tempHireWithRequisition.TD_Hire_OrganizationAssignments();
                tempHireWithRequisition.TD_Hire_EditID(Country);
                tempHireWithRequisition.TD_Hire_ChangePersonalInfo(Country);
                tempHireWithRequisition.TD_Hire_ProposeCompensation(Country);
//                tempHireWithRequisition.TD_Onboarding(Country, JobProfile);
                log.info("TEST DATA CREATION COMPLETED");
            } catch (Throwable e) {
                log.error("Exception/Issue occurred:" + e.getMessage());
                test.fail("Exception/Issue occurred in this step :" + e.getMessage());
                workdaycommon.Driverclose();

            }
        });


    }
}
