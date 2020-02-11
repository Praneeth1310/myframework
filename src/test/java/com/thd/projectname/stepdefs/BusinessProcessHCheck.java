package com.thd.projectname.stepdefs;

import com.thd.projectname.pages.PO_Others.HomePage;
import cucumber.api.java8.En;
import org.junit.Assert;

public class BusinessProcessHCheck implements En {

    public BusinessProcessHCheck(ScenarioHooks hooks, HomePage homePage) {


        Given("^I access the workday audit page", (String tenant) -> {
            homePage.setDriver(hooks.getDriverWrapper());
            homePage.loadAuditTrailPage();
            homePage.login(tenant);
            homePage.verifyPageLoad();
        });

        And("I select the search criteria for the audit report ([^\"]*) and ([^\"]*)", (String from_date, String to_date) -> {
            homePage.setDriver(hooks.getDriverWrapper());
            try {
                homePage.loadAuditReport(from_date,to_date);
            } catch (Exception e) {
                e.printStackTrace();
            }

        });


        Then("^I should not see any changes to the business process definition", () -> {
            Assert.assertTrue(homePage.verifyReportResult());

        });


    }
}
