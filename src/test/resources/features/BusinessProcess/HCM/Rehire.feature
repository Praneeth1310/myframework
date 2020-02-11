@web
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday p2


  @automation_TS100
  Scenario Outline: Create position, Pre-hire,Propose Compensation Hire
   # When Proxy as HCM Partner2
    When Proxy as KELLY SNOW
      #And Create position in an organization <SUPORG> and <Position> and <Location> and <JobFamily> and <JobProfile> and <TimeType>  and <WorkerType>
    And Create Pre-hire with Firstname and Lastname <Country>
    Then Propose Compensation Hire <Reason> and <Position> and <SSNNumber> and <SUPORG> and <Country> and <GovID> and <Company> and <CostCenter>
    Then Onboarding the employee <Country> and <FNemergencyConctOnBoard> and <LNemergencyConctOnBoard> and <RelationShpOnB> and <MailIdONB> and <MobileOnbard>
      #Then Re-hiring an Employee <>

    Examples: Worker Details
      | Position | Reason   | SSNNumber | SUPORG            | Country | GovID                   | Company    | CostCenter | Proxyname       | Location | JobFamily  | JobProfile | TimeType  | WorkerType | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard |
      | WD_CA09  | New Hire | 054124017 | Canada Store 7152 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Anitha Alphonse | 7152     | Home Depot | SAIII      | Full time | Associate  | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   |

          #CASA17  , CASA19-15

  @automation_TS1T
  Scenario Outline: Automation Script - Terminate Employee
    When Proxy as KELLY SNOW
    Then Terminating the Employees <Emp_name> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason>
#Change the term date in the code whenever running
    Examples: Worker Details
      | Emp_name   | SearchWith          | TerminationType | Primary_Reason   | Eligible_ReHire | localReason | Proxyname       |
   #| AutoFname001 TestLname001  | Terminate Associate | Involuntary     |PERSONAL REASONS | Yes             | Other       | Anitha Alphonse |
   #| TestFname 001 TestLname 001 | Terminate Associate | Voluntarty  | PERSONAL REASONS | Yes           | Other       | Anitha Alphonse |
   #   | Stacey Jack        | Terminate Associate |   Involuntary   |CONDUCT/POLICY | Yes                | Other       | Anitha Alphonse |
      | Anu Emauel | Terminate Associate | voluntary       | PERSONAL REASONS | Yes             | Other       | Anitha Alphonse |


  @automation_TS100
  Scenario Outline: Rehiring Associate till onboarding
   # When Proxy as HCM Partner2
    When Proxy as KELLY SNOW
      #And Create position in an organization <SUPORG> and <Position> and <Location> and <JobFamily> and <JobProfile> and <TimeType>  and <WorkerType>
    Then Re-hiring an Employee <Employee>
    Then Propose Compensation Hire <Reason> and <Position> and <SSNNumber> and <SUPORG> and <Country> and <GovID> and <Company> and <CostCenter>
    Then Onboarding the employee <Country> and <FNemergencyConctOnBoard> and <LNemergencyConctOnBoard> and <RelationShpOnB> and <MailIdONB> and <MobileOnbard>
      #Then Re-hiring an Employee <>

    Examples: Worker Details
      | Employee   | Position | Reason   | SSNNumber | SUPORG            | Country | GovID                   | Company    | CostCenter | Proxyname       | Location | JobFamily  | JobProfile | TimeType  | WorkerType | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard |
      | Anu Emauel | WD_CA09  | New Hire | 054124017 | Canada Store 7152 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Anitha Alphonse | 7152     | Home Depot | SAIII      | Full time | Associate  | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   |


  @automation_TS_ReHire
  Scenario Outline: Automation Script - ReHire
#When Proxy as Absence Admin
    When Proxy as KELLY SNOW
    Then Re-hiring an Employee <Employee>

    Examples: Worker Details
      | Employee   | FromDateRange |
      | Watson Kom | 02/14/2019    |
     #  | John keneddy | 02/14/2019   |
  #John keneddy

