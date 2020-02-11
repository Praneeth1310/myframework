@web
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday hd3



    #Creating Job requisition
  @CreateJobRequisition
  Scenario Outline: Job Requisition
    When Proxy as BP Admin
    Then Creating Job requisition <SUPORG> and <Position> and <WorkerType> and <Reason> and <WorkerSubType> and <JobProfile> and <Company> and <CostCenter> and <PrimaryLocation>

    Examples: Worker Details
      | SUPORG             | Position                | WorkerType | Reason       | WorkerSubType     | WorkerTimetype | JobProfile | Company    | CostCenter | PrimaryLocation |
      | SUP-00000000000710 | STAFF SOFTWARE ENGINEER | Associate  | Add to Staff | Regular Associate | Full time      | SRPTMG     | HOME DEPOT | 17052000   | 7052            |




#    // Termination -------------------------------------------------------------

  @automation_TS11
  Scenario Outline: Automation Script - Terminate Employee
    When Proxy as BP Admin
    Then Business Process: Terminating the Employees <Emp_name> and <Termination_Type> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <TermDate>

    Examples: Worker Details
      | Emp_name  | Termination_Type | SearchWith          | Primary_Reason   | Eligible_ReHire | localReason | Proxyname       | TermDate   |
      | Eloi Jane | Voluntary        | Terminate Associate | PERSONAL REASONS | Yes             | Other       | Anitha Alphonse | 12/10/2019 |


#    // Request Compensation Change ---------------------------------------------------------------------

  @automation_RCC_TS2
  Scenario Outline: Automation Script - Request Compensation Change
    When Proxy as BP Admin
    Then Business Process: Request Compensation of an employee <Reason> and <Employee> and <EffectiveDate> and <Grade> and <proxyname> and <CompensationPlan> and <Salary>

    Examples: Compensation Details
      | Reason            | Employee   | EffectiveDate | CompPackage                         | Grade          | proxyname  | CompensationPlan | Salary |
      | Market Adjustment | Dany Jones | 12/10/2019    | The Home Depot Compensation Package | CA Salaried F1 | EVAN SCOTT | Salary Plan      | 90000  |
