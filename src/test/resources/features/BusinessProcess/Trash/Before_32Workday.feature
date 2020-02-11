@web
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday p2


  @automation_TS100
  Scenario Outline: Create position, Pre-hire,Propose Compensation Hire
   # When Proxy as HCM Partner2
    When Proxy as KELLY SNOW
    And Create position in an organization <SUPORG> and <Position> and <Location> and <JobFamily> and <JobProfile> and <TimeType>  and <WorkerType>
    And Create Pre-hire with Firstname and Lastname <Country>
    Then Propose Compensation Hire <Reason> and <Position> and <SSNNumber> and <SUPORG> and <Country> and <GovID> and <Company> and <CostCenter>
      #Then Onboarding the employee <Country>

    Examples: Worker Details
      | Position | Reason   | SSNNumber | SUPORG            | Country | GovID                   | Company    | CostCenter | Proxyname       | Location | JobFamily  | JobProfile | TimeType  | WorkerType |
      | CASA14   | New Hire | 054124975 | Canada Store 7152 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Anitha Alphonse | 7152     | Home Depot | SAIII      | Full time | Associate  |


  @automation_TS1
  Scenario Outline: Automation Script - Terminate Employee
    When Proxy as KELLY SNOW
    Then Terminating the Employees <Emp_name> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason>

    Examples: Worker Details
      | Emp_name                  | SearchWith          | Primary_Reason   | Eligible_ReHire | localReason | Proxyname       |
      | AutoFname001 TestLname001 | Terminate Associate | PERSONAL REASONS | Yes             | Other       | Anitha Alphonse |


  @automation_TS3
  Scenario Outline: Automation Script - Enter Absence
#When Proxy as Absence Admin
    When Proxy as BETHANY LOVETTE
    Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type>

    Examples: Worker Details
      | Employee             | FromDateRange | ToDateRange | Type                 |
    #| TestFname102 TestLname102 | 12/18/2018     | 12/24/2018    | Medical Leave (Paid) |
      | AutoAndrew Autojelly | 01/14/2019    | 01/24/2019  | Unpaid Medical Leave |

  @automation_TS2
  Scenario Outline: Personal info change
    Given Proxy as Lisa Amy
    Then Change the personal information of the employee <Gender> and <DOB> and <Race>

    Examples: Worker Details
      | Gender | DOB        | Race               | Proxyname       |
      | Female | 11/20/1995 | Systems Analyst-13 | Anitha Alphonse |


  @automation_TS5
  Scenario Outline: Close Position
    When Proxy as Kelly Snow
# And Create position in an organization <SUPORG> and <Position>
    Then Closing a Position <ClosePosition>
    And Logout from Application

    Examples: Worker Details
      | Position            | Proxyname       | ClosePosition           | SUPORG          |
    #| Systems Analyst-10  | Anitha Alphonse |Systems Analyst-Test010 | Mount Laurel |
      | Systems Analyst-101 | Anitha Alphonse | Senior Analyst DATA-201 | Greenfield park |


