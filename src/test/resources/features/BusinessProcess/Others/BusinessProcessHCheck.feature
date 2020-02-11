@bpCheck
Feature: Login and test the hcm security policy changes

  @automation_BPCheck_TS1
  Scenario Outline: Business process change audit trail
    Given Login to Workday sandbox
    When Proxy as BP Admin
    And I select the search criteria for the audit report <from_date> and <to_date>
    Then I should not see any changes to the business process definition

    Examples: Date Range
      | from_date | to_date |
      | 07/22/2019 | 07/29/2019 |
