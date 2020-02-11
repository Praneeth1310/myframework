@web
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday hd3


  @automation_AbsenceReturn
  Scenario Outline: Automation Script - Return worker from leave
#When Proxy as Absence Admin
    When Proxy as Absence_Admin_Canada
    #Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type>
    And Business Process: Return Worker from leave<Employee> and <Returndate> and <LastDayOfAbsence>

    Examples: Worker Details
      | Employee             | FromDateRange | ToDateRange | Type                 | Returndate | LastDayOfAbsence |
    #| TestFname102 TestLname102 | 12/18/2018     | 12/24/2018    | Medical Leave (Paid) | 12/24/2018  |12/23/2018
   # | TestFname002 LName        | 01/14/2019     | 01/24/2019    | Medical Leave (Unpaid) | 01/22/2019  | 01/21/2019      |
      | AutoAndrew Autojelly | 03/04/2019    | 03/15/2019  | Unpaid Medical Leave | 03/14/2019 | 03/13/2019       |


  @automation_TS3
  Scenario Outline: Automation Script - Enter Absence
#When Proxy as Absence Admin
    When Proxy as Absence_Admin_Canada
    Then Business Process: Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type>

    Examples: Worker Details
      | Employee             | FromDateRange | ToDateRange | Type                 |
    #| TestFname102 TestLname102 | 12/18/2018     | 12/24/2018    | Medical Leave (Paid) |
      | AutoAndrew Autojelly | 01/14/2019    | 01/24/2019  | Unpaid Medical Leave |

  @automation_CTO_TS1
  Scenario Outline: Automation Script - Correct Time Off
    When Proxy as Absence Admin
    Then Business Process: Correct Time Off<Employee> and <EstimatedLastDayOfAbsence> and <Type>
    #Data requirements :
    #Employee Name : AutoMark AutoJimmy - Make sure employee on leave
    #EstimatedLastDayOfAbsence should current date
    #Type should be Leave Extension Request
    Examples: Worker Details
      | Employee           | EstimatedLastDayOfAbsence | Type                    |
      | AutoMark AutoJimmy | 03/14/2019                | Leave Extension Request |

  @automation_ITO_TS1
  Scenario Outline: Automation Script - Initiate Time Off
    When Proxy as Absence Admin
    Then Business Process :Requesting Initiate Time Off<Employee> and <FromDateRange> and <ToDateRange> and <Type>
    #Data requirements :
    #Employee Name : AARON ATKINS - Make sure employee not on leave
    #FromDateRange and ToDateRage should current date
    #Type should be intermittent FMLA
    Examples: Worker Details
      | Employee     | FromDateRange | ToDateRange | Type              |
      | AARON ATKINS | 03/04/2019    | 03/15/2019  | intermittent FMLA |


  @automation_LOE_TS1
  Scenario Outline: Automation Script - Leave Extension Request
    When Proxy as Absence Admin
    Then Business Process: Requesting Leave Of Extension<Employee> and <FromDateRange> and <ToDateRange> and <LOEType>
    #Data requirements :
    #Employee Name : AutoMark AutoJimmy - Make sure employee not on leave
    #FromDateRange and ToDateRage should current date
    #Type and LOEType should be Leave Extension Request
    Examples: Worker Details
      | Employee           | FromDateRange | ToDateRange | LOEType                 |
      | AutoMark AutoJimmy | 03/04/2019    | 03/15/2019  | Leave Extension Request |

  @automation_VLA_TS1
  Scenario Outline: Automation Script - View Leave Of Absence
    When Proxy as Absence Admin
    Then Business Process: View Leave Of Absence<Employee> and <AsOfDate> and <Type>
    #Data requirements :
    #Employee Name : AutoMark AutoJimmy - Make sure employee on leave
    #AsOfDate should current date
    #Type should be Leave Extension Request
    Examples: Worker Details
      | Employee           | AsOfDate   | Type                    |
      | AutoMark AutoJimmy | 03/14/2019 | Leave Extension Request |
