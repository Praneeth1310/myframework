@ViewLeaveOfAbsence
Feature: Absence - View Leave Of Absence

  Background: User Logs into Workday
    Given Login to Workday p2

  @automation_VLA_TS1
  Scenario Outline: Automation Script - View Leave Of Absence
    When Proxy as Absence Admin
    Then View Leave Of Absence<Employee> and <AsOfDate> and <Type>
    #Data requirements :
    #Employee Name : AutoMark AutoJimmy - Make sure employee on leave
    #AsOfDate should current date
    #Type should be Leave Extension Request
    Examples: Worker Details
      | Employee           | AsOfDate   | Type                    |
      | AutoMark AutoJimmy | 03/14/2019 | Leave Extension Request |
