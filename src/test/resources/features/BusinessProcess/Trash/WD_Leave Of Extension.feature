@LeaveExtensionRequest
Feature: Absence - Leave Extension Request

  Background: User Logs into Workday
    Given Login to Workday p2

  @automation_LOE_TS1
  Scenario Outline: Automation Script - Leave Extension Request
    When Proxy as Absence Admin
    Then Requesting Leave Of Extension<Employee> and <FromDateRange> and <ToDateRange> and <Type> and <LOEType>
    #Data requirements :
    #Employee Name : AutoMark AutoJimmy - Make sure employee not on leave
    #FromDateRange and ToDateRage should current date
    #Type and LOEType should be Leave Extension Request
    Examples: Worker Details
      | Employee           | FromDateRange | ToDateRange | Type                    | LOEType                 |
      | AutoMark AutoJimmy | 03/04/2019    | 03/15/2019  | Leave Extension Request | Leave Extension Request |

