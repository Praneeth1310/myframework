@web
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday p2


  @automation_TS11
  Scenario Outline: Automation Script - Terminate Employee
    When Proxy as HR Partner
    Then Terminating the Employees <Emp_name> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason>

    Examples: Worker Details
      | Emp_name     | SearchWith          | Primary_Reason   | Eligible_ReHire | localReason | Proxyname       |
      | Markiee jack | Terminate Associate | PERSONAL REASONS | Yes             | Other       | Anitha Alphonse |


  @automation_TS2
  Scenario Outline: Personal info change
    Given Proxy as HR Partner
    Then Change the personal information of the employee <Gender> and <DOB> and <Race>

    Examples: Worker Details
      | Gender | DOB        | Race               | Proxyname       |
      | Female | 11/20/1995 | Systems Analyst-13 | Anitha Alphonse |


  #Should change Employee_name, Position, Username_Inbox everytime
  @automation_TS3
  Scenario Outline: Automation Script - Contract Contingent worker
    When Proxy as BP Admin
    Then Create a Contract Contingent worker<Organization> and <EmployeePreHire> and <Position> and <WorkerType> and <JobProfile> and <TimeType> and <UserName> and <NewPwd> and <VerifyNewPwd>

    Examples: Worker Details
      | Organization | EmployeePreHire       | Position           | Proxyname      | WorkerType | JobProfile | TimeType  | UserName | NewPwd   | VerifyNewPwd |
      | Mount Laurel | TestFname3 TestLname3 | Systems Analyst-58 | Hongming Zhang | Vendor     | QA ASSOC   | Full Time | First27  | WDtry@03 | WDtry@03     |