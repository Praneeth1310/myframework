@CorrectTimeOff
Feature: Absence - Correct Time Off

  Background: User Logs into Workday
    Given Login to Workday p2

  @automation_CTO_TS1
  Scenario Outline: Automation Script - Correct Time Off
    When Proxy as Absence Admin
    Then Correct Time Off<Employee> and <EstimatedLastDayOfAbsence> and <Type>
    #Data requirements :
    #Employee Name : AutoMark AutoJimmy - Make sure employee on leave
    #EstimatedLastDayOfAbsence should current date
    #Type should be Leave Extension Request
    Examples: Worker Details
      | Employee           | EstimatedLastDayOfAbsence | Type                    |
      | AutoMark AutoJimmy | 03/14/2019                | Leave Extension Request |
