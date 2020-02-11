@web
Feature: Testing HCM

  Background: User Logs into Workday
    Given Login to Workday p2


  @automation_TS04_JCProfile
  Scenario Outline: Job Change
  #When Proxy as HR Partner
    When Proxy as KELLY SNOW
    Then Perform JobProfile change for an employee  Firstname and Lastname and <Employee> and <JobProfile>
    Examples: Worker Details
      | Employee     | JobProfile |
      | Jioroi Excee | SCDCGM     |
