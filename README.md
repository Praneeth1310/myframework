## BDD using Cucumber JVM, Selenium, Junit, and REST-assured
#### *supports web ui and api-based feature automation*

##### Prerequisites
- Java 1.8 or better
- Maven 3.1 or better
 

##### Setup
- Read the sample.feature file for instructions on how to run a basic web and api test
```gherkin
Feature: Sample
  As a BDDCucumberJVM user
  I want an example of a good feature
  so that I can write good features of my own 

  Scenario: Simple Acceptance Test
    Given I setup the BDDCucumberJVM project
    When I configure the run-config.properties with my execution details
    And I run the tests using "mvn clean install -Dtags=~@sample"
    Then the "websearch" and "apidatafetch" features should run and pass
    """
    NOTE:
    ===============
    This Sample feature has not been implemented.
    It's here to help users get started.
    """
```

##### Command-Line Options
Mandatory Parameters
    
    tags (cucumber tags speparated by commas)
    
Optional Parameters 

    app.name    (name of the application, This parameter used for generating buildID. Generated buildId used to track test suite execution on sauceLabs )
    app.env     (Environment on which test been executing. This parameter used to load environment specific properties)
    retry.count (Determines how many maximum excution has to happen. Ex : if retry.count=2 test will execute maximum 3 times)
    proxy.host  (This parameter is required when tests are executing from jenkins Or concourse)
    proxy.port  (This parameter is required when tests are executing from jenkins Or concourse)
    
Maven Profile   
    
    tunnel      (To spinup sauce HA tunnel while executing test suite)   
    
Example

    \-Dtags=@MyTag1,@MyTag2,@MyTag3,~@ExcludeMyTag4<br>
    \-Dapp.name=MyAppName<br>
    \-Dapp.env=qa<br>
    \-Dretry.count=2 (tests will always execute once + retry.count as specified)<br>
    \-Dproxy.host=thd-svr-proxy-qa.homedepot.com<br>
    \-Dproxy.port=7070<br>
    \-Ptunnel

<br>
Example:
```sh
mvn clean install -Dapp.name=THDOnline -Dtags=@Cart,@Checkout,~@MyAccount -Dretry.count=1
```

##### Supported Browsers
- Google Chrome
- Microsoft Edge and Internet Explorer
- Mozilla Firefox

##### References
- [Cucumber-JVM](https://cucumber.io/docs/reference/jvm#java "Cucumber-JVM") - An open-source tool for executable specifications (Java implementation)
- [Cucumber Reference](https://cucumber.io/docs/reference "Cucumber Reference") - General reference for all Cucumber implementations
- [Selenium](http://www.seleniumhq.org/ "Selenium") - An open-source browser automation tool
- [Selenium Documentation](http://www.seleniumhq.org/docs/ "Selenium Documentation") - General reference for Selenium
- [JUnit](http://junit.org/junit4/ "JUnit") - A simple, open-source framework to write repeatable unit tests
- [REST-assured](http://rest-assured.io/ "REST-assured") - An open-source Java DSL for simplifying testing of REST based services built on top of HTTP Builder. 
- [WireMock](http://wiremock.org/ "WireMock") - WireMock is a simulator for HTTP-based APIs. Some might consider it a service virtualization tool or a mock server.
- [WireMock Documentation](http://wiremock.org/docs/ "WireMock Documentation") - WireMock User Documentation
# WD_DEMO_HCM_SECURITY
# wd_demo_hcm_security
# wd_demo_hcm_security
"# Workday_Automation_E2E" 
