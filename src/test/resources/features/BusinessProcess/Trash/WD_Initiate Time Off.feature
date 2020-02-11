@InitiateTimeOff
Feature: Absence - Time Off Request

  Background: User Logs into Workday
    Given Login to Workday p2

  @automation_ITO_TS1
  Scenario Outline: Automation Script - Initiate Time Off
    When Proxy as Absence Admin
    Then Requesting Initiate Time Off<Employee> and <FromDateRange> and <ToDateRange> and <Type>
    #Data requirements :
    #Employee Name : AARON ATKINS - Make sure employee not on leave
    #FromDateRange and ToDateRage should current date
    #Type should be intermittent FMLA
    Examples: Worker Details
      | Employee     | FromDateRange | ToDateRange | Type              |
      | AARON ATKINS | 03/04/2019    | 03/15/2019  | intermittent FMLA |

