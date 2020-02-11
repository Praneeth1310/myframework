@web
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday PreviewTenant

  @automation_TS2
  Scenario Outline: Job requisition
    Given Proxy as HR Partner
    Then Business Process: Creating Job requisition <SUPORG> and <Position> and <WorkerType> and <Reason> and <WorkerSubType> and <JobProfile> and <Company> and <CostCenter> and <PrimaryLocation>

    Examples: Worker Details
      | SUPORG       | Position              | WorkerType | Reason       | WorkerSubType | JobProfile              | Company                | CostCenter  | Proxyname       | PrimaryLocation  |
     # | Greenfield Park | Senior Analyst-30  | Employee    | Add to Staff | Expatriate     | Human Resource Director | Home depot Canada | Toronto North |  Anitha Alphonse |  0914  |
      | Mount Laurel | Systems Analyst-WD-10 | Employee   | Add to Staff | Expatriate    | Human Resource Director | Home Depot U.S.A., INC | ATLANTA SDC | Anitha Alphonse | 0914              |

  @automation_TS3
  Scenario Outline: Close Job requisition
    Given Proxy as BP Admin
    Then Business Process: Close Job requisition <JobRequisite> and <Reason>

    Examples: Worker Details
      | JobRequisite              | Reason           | Proxyname      |
      | Req223 Systems Analyst-55 | No Longer Needed | Hongming zhang |


  #Create Position

  @automation_TS5
  Scenario Outline: Create Position
    When Proxy as HR Partner
    Then Business Process: Create position in the organization <SUPORG> and <Location> and <JobFamily> and <JobProfile> and <TimeType> and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>

    Examples: Worker Details
      | SUPORG       | Location  | JobFamily | JobProfile  | TimeType  | WorkerType  | AvailabilityDate  | EarliestHireDate |
      | Mount Laurel | 7052     | Home Depot | SRPTMG     | Full time  | Associate | 02/02/1997          | 02/01/1997       |


  @automation_TS5
  Scenario Outline: Close Position
    When Proxy as HR Partner
   # Then Business Process: Create position in the organization <SUPORG> and <Location> and <JobFamily> and <JobProfile> and <TimeType> and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>
    Then Business Process: Closing a Position <Position>
    And Logout from Application

    Examples: Worker Details
      | Proxyname       | Position                | SUPORG       | Location  | JobFamily | JobProfile  | TimeType  | WorkerType  | AvailabilityDate  | EarliestHireDate |
      | Anitha Alphonse | Systems Analyst-Test010 | Mount Laurel | 7052     | Home Depot | SRPTMG     | Full time  | Associate | 02/02/1997          | 02/01/1997       |



  @automation_TS11
  Scenario Outline: Automation Script - Terminate Employee
    When Proxy as HR Partner
    Then Business Process: Terminating the Employees <Emp_name> and <Termination_Type> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <TermDate>

    Examples: Worker Details
      | Emp_name     |  Termination_Type  | SearchWith          | Primary_Reason   | Eligible_ReHire | localReason | Proxyname       |  TermDate  |
      | Markiee jack |  Voluntary       | Terminate Associate | PERSONAL REASONS | Yes             | Other       | Anitha Alphonse | 07/26/2019         |


  @automation_TS2
  Scenario Outline: Personal info change
    Given Proxy as HR Partner
    Then Business Process: Change the personal information of the employee <Gender> and <DOB> and <Race>

    Examples: Worker Details
      | Gender | DOB        | Race               | Proxyname       |
      | Female | 11/20/1995 | Systems Analyst-13 | Anitha Alphonse |


  #Should change Employee_name, Position, Username_Inbox everytime
  @automation_TS3_CCW
  Scenario Outline: Automation Script - Contract Contingent worker
    When Proxy as BP Admin
    Then Business Process: Create a Contract Contingent worker<Organization> and <EmployeePreHire> and <Position> and <WorkerType> and <JobProfile> and <TimeType> and <UserName> and <NewPwd> and <VerifyNewPwd>

    Examples: Worker Details
      | Organization       | EmployeePreHire | Position            | Proxyname      | WorkerType | JobProfile | TimeType  | UserName | NewPwd   | VerifyNewPwd |
      | SUP-00000000000710 | Xaio Linh       | NEW Test data CCW-2 | Hongming Zhang | Vendor     | QA ASSOC   | Full Time | First27  | WDtry@03 | WDtry@03     |










