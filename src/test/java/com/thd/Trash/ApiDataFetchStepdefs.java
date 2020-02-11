package com.thd.Trash;

import cucumber.api.java8.En;

import static org.hamcrest.Matchers.equalTo;

import com.thd.common.utils.FileMgmtUtil;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

/**
 * Created by jason on 3/11/17.
 */
public class ApiDataFetchStepdefs implements En {
    private Response response;
    private ValidatableResponse json;
    private RequestSpecification request;
    private String endpoint = "https://dynamicfetch.apps-np.homedepot.com/v0/data/fetch";

    public ApiDataFetchStepdefs() {
        Given("^I need an STH SKU$", () -> {
            // Write code here that turns the phrase above into concrete actions
            String jsonString = FileMgmtUtil.jsonFileToString("features/ComponentA/SmallFunctionalArea/json/STH_Regular.json");
            request = RestAssured.given().contentType("application/json; charset=UTF-8").body(jsonString);
        });

        When("^I request it from Dynamic Fetch$", () ->
                // Write code here that turns the phrase above into concrete actions
                response = request.when().post(endpoint)
        );

        Then("^it should return a valid STH SKU$", () -> {
            // Write code here that turns the phrase above into concrete actions
            json = response.then().statusCode(200);
            json.body("itemType", equalTo("STH_Regular"));
        });
    }
}
