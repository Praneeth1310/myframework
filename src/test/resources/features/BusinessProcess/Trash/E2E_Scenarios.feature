@E2EDemo
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday p2


    #Zephyr ID: THD-8573 | Category- 1
  @Synthetic_automation_E2E_T199
  Scenario Outline: E2E_T199_Create Succession plan for a leader, Add successors to plan, Terminate Leader
    And Proxy as Succession Partner 7152
    When Create Succession Plan<Leader> and <EmployeeOne> and <EmployeeTwo> and <Readiness>
    And Step One Completed
    When Proxy as BP Admin
    Then Terminating the Employees <Leader> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
    And Step Two Completed
    Then Proxy as Talent Admin
    Then View Succession Plan<Leader>
    And Step Three Completed

    Examples: Worker Details
      | Leader      | EmployeeOne  | EmployeeTwo  | Readiness | SearchWith          | TerminationType | Primary_Reason | Eligible_ReHire | localReason | Termdate   | Position              |
      | Ciaz Devark | Glen Nicolas | Robin Albert | Ready Now | Terminate Associate | Involuntary     | CONDUCT/POLICY | Yes             | Other       | 05/22/2019 | Systems Tester Data-5 |
    #Synthetic new
      | Uoni King | Glen Nicolas | Robin Albert | Ready Now | Terminate Associate | Involuntary     | CONDUCT/POLICY | Yes             | Other       | 05/25/2019 | Systems Tester Data-5 |
      | Engore Inn | Glen Nicolas | Robin Albert | Ready Now | Terminate Associate | Involuntary     | CONDUCT/POLICY | Yes             | Other       | 05/25/2019 | Systems Tester Data-5 |



  #Zephyr ID: THD-8574 | Category- 1
  @Synthetic_automation_E2E_T200
  Scenario Outline: E2E_T200_Create Succession plan for a leader, Transfer Leader

    When Fetch and proxy to Succession Partner 7152
    When Create Succession Plan<Leader> and <EmployeeOne> and <EmployeeTwo> and <Readiness>
    And Step One Completed
    When Proxy as BP Admin
    Then Perform Jobchange to change Jobprofile of an employee <Leader> and <JobProfile> and <Amount> and <EffectiveDate>
    And Step Two Completed
#change the date and also TimeType in the code whenever running
    And Proxy as Talent Admin
    Then View Succession Plan<Leader>
    And Step Three Completed


    Examples: Worker Details
      | Leader           | EmployeeOne | EmployeeTwo  | Position   | Readiness | JobProfile | Amount | EffectiveDate |
      | Horror Mohan     | Oscar Rhys  | Poiele Later | 01/14/2019 | Ready Now | SCDCGM     | 7500   | 05/20/2019    |
      #Synthetic new
      | Pager Drown     | Oscar Rhys  | Poiele Later | 01/14/2019 | Ready Now | SCDCGM     | 7500   |  05/20/2019    |
      | Marg Jione     | Oscar Rhys  | Poiele Later | 01/14/2019 | Ready Now | SCDCGM     | 7500   | 05/20/2019    |



    #Zephyr ID: THD-8566 | Category- 1
  @Synthetic_automation_E2E_T213
  Scenario Outline: E2E_T213_Confirm being on leave doesn't trigger someone to come off succession plan

    When Proxy as Absence_Admin_Canada
    Then Requesting Absence<EmployeeOne> and <FromDateRange> and <ToDateRange> and <Type>
    And Step One Completed
    When Proxy as Talent Admin
    Then Create Succession Plan<Leader> and <EmployeeOne> and <EmployeeTwo> and <Readiness>
    And Step Two Completed
    Then Manage Succession Plan <Leader> and <EmployeeOne>
    And Step Three Completed
    And Proxy as BP Admin
    Then Perform Merit Review <EmployeeOne>
    And Step Four Completed

    Examples: Worker Details
      | Leader     | EmployeeOne | EmployeeTwo  | Readiness | FromDateRange | ToDateRange | Type                 |
      | Wilona Zoe | Walsh Lee   | Robin Albert | Ready Now | 05/24/2019    | 05/31/2019  | Unpaid Medical Leave |
    #Synthetic new
      | Ricardo Mariadoss | Walsh Lee   | Robin Albert | Ready Now | 05/24/2019    | 05/31/2019  | Unpaid Medical Leave |
      | Anthony Sampras | Walsh Lee   | Robin Albert | Ready Now | 05/24/2019    | 05/31/2019  | Unpaid Medical Leave |


    #Zephyr ID: THD-8562 | Category- 1
  @Synthetic_automation_E2E_T164
  Scenario Outline: E2E_T164_HR requests to update direct reporting to a new or newly appointed leader. (If direct reporting involves more than one leader in the organization, it is considered a Reorganization). Person is on leave.
    When Proxy as Absence_Admin_Canada
    Then Requesting Absence<EmployeeOne> and <FromDateRange> and <ToDateRange> and <Type>
    Then View Leave Of Absence<EmployeeOne> and <AsOfDate> and <Type>
    And Step One Completed
    When Proxy as BP Admin
    Then Move Workers<EmployeeOne> and <EmployeeTwo> and <EmployeeThree> and <SupOrg> and <PropSupOrg> and <Company> and <CostCenter>
    And Step Two Completed
    Then Verify Moved Associates <EmployeeOne> and <EmployeeTwo> and <EmployeeThree> and <PropSupOrg> and <CostCenter> and <AsOfDate> and <Type>
    And Step Three Completed

    Examples: Worker Details
      | EmployeeOne    | EmployeeTwo | EmployeeThree  | SupOrg            | PropSupOrg       | Company | CostCenter | FromDateRange | ToDateRange | Type                 | AsOfDate   |
      #synthetic
      | Enrique Aquayo | Jack Amber  | JohnAntony Jim | 7152 DONALD CRETE | 7052 DARYL HAGEN | 1019    | 7052       | 05/06/2019    | 05/20/2019  | Unpaid Medical Leave | 05/20/2019 |
  #    | Karen Sheryl | Koney Roi  | Lechee Kivi | 7152 DONALD CRETE | 7052 DARYL HAGEN | 1019    | 7052       | 05/28/2019    | 06/10/2019  | Unpaid Medical Leave | 05/20/2019 |


  #Zephyr ID: THD-8564 | Category- 1
  @Synthetic_automation_E2E_T193
  Scenario Outline: E2E_T193_Load goals for an associate, process a job profile change and confirm goals and template do move
    And  user Proxy as BP Admin
    When Added Goals for existing Employee <Employee> and <Category> and <GoalName> and <Status>
    And Step One Completed
    And Proxy as Manager
    Then Perform Job profile change for an employee  Firstname and Lastname and <Employee> and <SUPORG> and <Location> and <UPosition> and <JobProfile> and <EmpType> and <Salary> and <CostCenter> and <Company>
    And Step Two Completed
    Then  Proxy To <Employee>
    Then View goals of the employee<Employee> and <GoalName> and <EditGoal>
    And Step Three Completed
#    Then Delete the goals added by the employee <Employee>
#    And Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | Employee   | UPosition             | JobProfile | SUPORG                           | Location               | EmpType           | TimeType  | Salary | Proxyname       | CostCenter | Company | GoalName     | Category               | Status   | EditGoal                    |
      | Petter hay | Systems Tester Data-5 | SCDCGM     | Canada Store 7152 (DONALD CRETE) | GREENFIELD PARK - 7152 | Regular Associate | Full Time | 125000 | Anitha Alphonse | 17152000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 |
    #Synthetic new
      | Asther Dimelo | Systems Tester Data-5 | SCDCGM     | Canada Store 7152 (DONALD CRETE) | GREENFIELD PARK - 7152 | Regular Associate | Full Time | 125000 | Anitha Alphonse | 17152000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 |


  #  Zephyr ID: THD-8563 | Category- 2
  @Synthetic_automation_E2E_T169
  Scenario Outline: E2E_T169_Process a term for an associate on leave - Hourly

    When Proxy as Absence_Admin_Canada
    Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type>
    Then View Leave Of Absence<Employee> and <AsOfDate> and <Type>
    When Proxy as BP Admin
    And Step One Completed
    Then Terminating the Employees <Employee> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
    And Step Two Completed
    Then Proxy as PayRoll Admin
    Then For terminated employee Add Earnings and Deductions  <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value>
    And Step Three Completed
    And Review PaySlip
    And Extract Workday Payroll GL File and send to Mercator
    And Mercator processes the Workday file and generates SAP IDOCS
    And YG Financial posting is posted as expected

    Examples: Worker Details
      | Employee        | FromDateRange | ToDateRange | Type                | AsOfDate   | TerminationType | Primary_Reason | Eligible_ReHire | SearchWith          | localReason | Termdate   | Emp_ID    | PayComponent | Batch_ID | InputType          | Value | PeriodStartDate | PeriodEndDate | Hours |
    #Synthetic
      | Rupali Majumdar | 05/23/2019    | 06/20/2019  | Discretionary Leave | 06/20/2019 | Involuntary     | CONDUCT/POLICY | Yes             | Terminate Associate | Other       | 05/27/2019 | 200001056 | E0081        | 4206     | Hours (unprorated) | 35.00 | 01/27/2019      | 02/09/2019    | 80    |



  #Zephyr ID: THD-8552 | Category- 2
  @Synthetic_automation_E2E_TS56
  Scenario Outline: E2E_TS56-Create position, Pre-hire,Propose Compensation Hire_Hourly,Onboarding,Add Goals,Start Disciplinary Action

    When Proxy as BP Admin
#    And Create position in an organization <SUPORG> and <Position> and <Location> and <JobFamily> and <JobProfile> and <TimeType>  and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>
    #And Create Pre-hire with Firstname and Lastname <Country> and <Home_addressline1> and <Home_addressline2> and <Home_city> and <Home_province> and <Home_postalcode> and <Home_type> and <Work_addressline1> and <Work_type>
    Then Hire - Hire Associate<Reason> and <Position> and <SUPORG> and <AssociateType> and <JobProfile> and <TimeType> and <Location> and <PayRateType> and <HireDate>
    Then Hire - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
    Then Hire - Edit ID<Country> and <GovID> and <SSNNumber>
    Then Hire - Propose Compensation<Amount> and <Country>
    And Step One Completed
    Then Onboarding the employee <Country> and <FNemergencyConctOnBoard> and <LNemergencyConctOnBoard> and <RelationShpOnB> and <MailIdONB> and <MobileOnbard> and <JobProfile>
    And Step Two Completed
    Then Onboarding - Manager Confirmation<JobProfile>
    And Step Three Completed
    Then Verify Performance tab and career tab <EmployeeN> and <DevelopmentItem> and <Status> and <CareerPreferences> and <JobProfiles> and <WorkExperience> and <Company_JobHistory> and <Award_Type> and <Certifications>
    Then Add Goals for Employee <Employee> and <Category> and <GoalName> and <Goals_Status>
    Then Start Disciplinary Action <Employee> and <Review_Template> and <Disciplinary_Action_Reasons> and <Period_Start_Date> and <Period_End_Date>
    And Step Four Completed
    #And Review PaySlip
    #And THD_INT0015_SAP internal - GL file to finance - Canada -  Outbound
    #And Extract Workday Payroll GL File and send to Mercator
    #And Mercator processes the Workday file and generates SAP IDOCS
    #And SAP process the payroll IDOCs
    #And YG Financial posting is posted as expected
    #And Test the Integrations:THD_INT0010 - Royal Bank of Canada - Bi Weekly Positive Pay Outbound,THD_INT0012 - Royal Bank of Canada - Payroll data direct deposit Outbound


    Examples: Worker Details
      | Emp_ID    | EmployeeN  | Position            | Reason   | SSNNumber | SUPORG             | Country | GovID                   | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile         | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | HireDate   | AssociateType     | BusinessUnit      | Department | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type | DevelopmentItem | Status   | CareerPreferences        | JobProfiles | WorkExperience       | Company_JobHistory | Award_Type      | Certifications | GoalName     | Category               | Goals_Status | Review_Template   | Disciplinary_Action_Reasons | Period_Start_Date | Period_End_Date | PayComponent | Batch_ID | InputType | Hours | Value |
      | 200000639 | TestQueeen | NEW Test Position_63 | New Hire | 054124183 | SUP-00000000009399 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Hourly      | 13     | 7152     | Home Depot | Sales Associate IV | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Regular Associate | Canada Associates | 24 PAINT   | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Workday Goal | 2019 Performance Goals | Complete     | Discipline Notice | Coach Counsel               | 01/02/2019        | 01/02/2019      | E0081        | 4206     | Hours     | 45.00 | 45.00 |



    #-------------------------------------------------------------------------------------------------------------------------------------------------------

  #Zephyr ID: THD-8553
  @Synthetic_automation_E2E_TS57
  Scenario Outline: E2E_T57_Create position, Pre-hire,Propose Compensation Hire_Salaried,Onboarding,Add Goals,Start Disciplinary Action

    When Proxy as BP Admin
    And Create position in an organization <SUPORG> and <Position> and <Location> and <JobFamily> and <JobProfile> and <TimeType>  and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>
    And Create Pre-hire with Firstname and Lastname <Country> and <Home_addressline1> and <Home_addressline2> and <Home_city> and <Home_province> and <Home_postalcode> and <Home_type> and <Work_addressline1> and <Work_type>
    Then Hire - Hire Associate<Reason> and <Position> and <SUPORG> and <AssociateType> and <JobProfile> and <TimeType> and <Location> and <PayRateType> and <HireDate>
    Then Hire - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
    Then Hire - Edit ID<Country> and <GovID> and <SSNNumber>
    Then Hire - Propose Compensation<Amount> and <Country>
    And Step One Completed
    Then Onboarding the employee <Country> and <FNemergencyConctOnBoard> and <LNemergencyConctOnBoard> and <RelationShpOnB> and <MailIdONB> and <MobileOnbard> and <JobProfile>
    And Step Two Completed
    Then Onboarding - Manager Confirmation<JobProfile>
    And Step Three Completed
    Then Verify Performance tab and career tab <EmployeeN> and <DevelopmentItem> and <Status> and <CareerPreferences> and <JobProfiles> and <WorkExperience> and <Company_JobHistory> and <Award_Type> and <Certifications>
    Then Add Goals for Employee <Employee> and <Category> and <GoalName> and <Goals_Status>
    Then Start Disciplinary Action <Employee> and <Review_Template> and <Disciplinary_Action_Reasons> and <Period_Start_Date> and <Period_End_Date>
    And Step Four Completed
    And Review PaySlip
    And THD_INT0015_SAP internal - GL file to finance - Canada -  Outbound
    And Extract Workday Payroll GL File and send to Mercator
    And Mercator processes the Workday file and generates SAP IDOCS
    And SAP process the payroll IDOCs
    And YG Financial posting is posted as expected
    And Test the Integrations:THD_INT0010 - Royal Bank of Canada - Bi Weekly Positive Pay Outbound,THD_INT0012 - Royal Bank of Canada - Payroll data direct deposit Outbound

    Examples: Worker Details
      | Emp_ID    | EmployeeN  | Position            | Reason   | SSNNumber | SUPORG             | Country | GovID                   | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile         | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | HireDate   | AssociateType     | BusinessUnit      | Department | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type | DevelopmentItem | Status   | CareerPreferences        | JobProfiles | WorkExperience       | Company_JobHistory | Award_Type      | Certifications | GoalName     | Category               | Goals_Status | Review_Template   | Disciplinary_Action_Reasons | Period_Start_Date | Period_End_Date | PayComponent | Batch_ID | InputType | Hours | Value |
      | 200000639 | TestQueeen | NEW Test Position_203 | New Hire | 054124605 | SUP-00000000009399 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Salary      | 80000     | 7152     | Home Depot | SRPTMG | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Regular Associate | Canada Associates | 24 PAINT   | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Workday Goal | 2019 Performance Goals | Complete     | Discipline Notice | Coach Counsel               | 01/02/2019        | 01/02/2019      | E0081        | 4206     | Hours     | 45.00 | 45.00 |


    #Zephyr ID: THD-8643
  @automation_E2E_T61
  Scenario Outline: E2E_T61_Update home address in Canada - current date

    When Proxy as BP Admin
    And Create position in an organization <SUPORG> and <Position> and <Location> and <JobFamily> and <JobProfile> and <TimeType>  and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>
    And Create Pre-hire with Firstname and Lastname <Country> and <Home_addressline1> and <Home_addressline2> and <Home_city> and <Home_province> and <Home_postalcode> and <Home_type> and <Work_addressline1> and <Work_type>
    Then Hire - Hire Associate<Reason> and <Position> and <SUPORG> and <AssociateType> and <JobProfile> and <TimeType> and <Location> and <PayRateType> and <HireDate>
    Then Hire - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
    Then Hire - Edit ID<Country> and <GovID> and <SSNNumber>
    Then Hire - Propose Compensation<Amount> and <Country>
    Then Onboarding the employee <Country> and <FNemergencyConctOnBoard> and <LNemergencyConctOnBoard> and <RelationShpOnB> and <MailIdONB> and <MobileOnbard> and <JobProfile>
    When Proxy as BP Admin
    Then Home Contact Change <Emp_ID> and <Employee> and <Address1> and <Postal> and <City> and <Province> and <Usage> and <effectivedate>
    And Step One- Completed
    Then Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value>
#    Then WD_View Results and Payslips <Emp_ID> and <Employee> and <PeriodStartDate> and <PeriodEndDate>
    And Generate and review T4s

    Examples: Worker Details
      | Emp_ID    | Employee    | Address1        | Postal  | City       | Province | Usage                    | effectivedate | PayComponent | Batch_ID | InputType | Hours | Value | PeriodStartDate | PeriodEndDate | UPosition             | UJobProfile | jobchangedate                          | Locatio n              | EmpType           | TimeType  | USalary | CostCenter | Company |   Position            | Reason   | SSNNumber | SUPORG             | Country | GovID                   | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | HireDate   | AssociateType     | BusinessUnit      | Department | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type |
     #| 103015598 | JACK BARBIER | 404 CRES STREET | 7152   | CUMBERLAND | Ontario  | Permanent Street Address | E0081        | 4206     | Amount    | 75.00 | 35.00 | 01/27/2019      | 02/09/2019    |
#     | 200000407   | JOY LUCAS    | 404 CRES STREET | 7152   | CUMBERLAND | Ontario  | Permanent Street Address |  E0081        | 4206      | Amount    | 75.00 | 35.00 |  01/27/2019      | 02/09/2019    |
      | 200000449 | Jackson Roy | 404 CRES STREET | H3Z 2Y7 | CUMBERLAND | Ontario  | Permanent Street Address |  06/11/2019| E0081        | 4206     | Amount    | 75.00 | 35.00 | 03/03/2019      | 03/16/2019    | Systems Tester Data-8 | SCDCGM      | 05/30/2019        | GREENFIELD PARK - 7152 | Regular Associate | Full Time | 95000   | 17152000   | 1019    |   NEW Test Position_10 | New Hire | 054124085 | SUP-00000000009399 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Salary      | 80000  | 7152     | Home Depot | SRPTMG     | Full time | Associate  | 11/21/2017       | 11/22/2017       | 01/25/2018 | Regular Associate | Canada Associates | 24 PAINT   | Romesh                    | Sarwan                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      |


  #Zephyr ID: THD-8564 | Category- 1
  @Synthetic_automation_E2E_T193_WithTestData
  Scenario Outline: E2E_T193_Load goals for an associate, process a job profile change and confirm goals and template do move
    When Proxy as BP Admin
    And Create position in an organization <SUPORG> and <Position> and <Location> and <JobFamily> and <JobProfile> and <TimeType>  and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>
    And Create Pre-hire with Firstname and Lastname <Country> and <Home_addressline1> and <Home_addressline2> and <Home_city> and <Home_province> and <Home_postalcode> and <Home_type> and <Work_addressline1> and <Work_type>
    Then Hire - Hire Associate<Reason> and <Position> and <SUPORG> and <AssociateType> and <JobProfile> and <TimeType> and <Location> and <PayRateType> and <HireDate>
    Then Hire - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
    Then Hire - Edit ID<Country> and <GovID> and <SSNNumber>
    Then Hire - Propose Compensation<Amount> and <Country>
    And Step One Completed
    Then Onboarding the employee <Country> and <FNemergencyConctOnBoard> and <LNemergencyConctOnBoard> and <RelationShpOnB> and <MailIdONB> and <MobileOnbard> and <JobProfile>
    And  Proxy as BP Admin
    When Added Goals for existing Employee <Employee> and <Category> and <GoalName> and <Status>
    And Step One Completed
    And Proxy as Manager
    Then Perform Job profile change for an employee  Firstname and Lastname and <Employee> and <SUPORG> and <Location> and <UPosition> and <UJobProfile> and <EmpType> and <USalary> and <CostCenter> and <jobchangedate>
    And Step Two Completed
    Then user Proxy as <Employee>
    Then View goals of the employee<Employee> and <GoalName> and <EditGoal>
    And Step Three Completed
#    Then Delete the goals added by the employee <Employee>
#    And Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | Employee   | UPosition             | UJobProfile | jobchangedate                          | Locatio n              | EmpType           | TimeType  | USalary | CostCenter | Company | GoalName     | Category               | Status   | EditGoal                    | Emp_ID    | EmployeeN  | Position            | Reason   | SSNNumber | SUPORG             | Country | GovID                   | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | HireDate   | AssociateType     | BusinessUnit      | Department | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type |
      | Petter hay | Systems Tester Data-8 | SCDCGM      | 05/30/2019        | GREENFIELD PARK - 7152 | Regular Associate | Full Time | 95000   | 17152000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 | 200000639 | TestQueeen | NEW Test Position_10 | New Hire | 054124085 | SUP-00000000009399 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Salary      | 80000  | 7152     | Home Depot | SRPTMG     | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Regular Associate | Canada Associates | 24 PAINT   | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      |

#   Zephyr THD-8593
  @automation_E2E_T170
  Scenario Outline: E2E_T170_E2E_T34_Process a rehire for an associate who was terminated on leave - Initiate after Cycle 1 is complete after 11/21


    When Proxy as Absence_Admin_Canada
    Then Absence Request for the associate <Employee> and <FromDate> and <ToDate> and <Type>
    Then View the Leave Of Absence for the associate <Employee> and <AsOfDate> and <Type>
    And Step One Completed
    When Proxy as HR Partner
    Then Terminating the Associate <Employee> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason>
    And Step Two Completed
    When Proxy as BP Admin
    And  Create position in the organization <SUPORG> and <Position> and <Location> and <JobFamily> and <JobProfile> and <TimeType> and <WorkerType>
    Then Creating a new Job requisition <SUPORG> and <Position> and <WorkerType> and <Reason> and <WorkerSubType> and <JobProfile> and <Company> and <CostCenter> and <PrimaryLocation>
    And Re-Hire Employee for the Organization: <Employee> and <RehireReason> and <Position>  and <SUPORG> and <RWorkerType> and <JobProfile> and <TimeType> and <Location> and <PayRateType>
    Then ReHire - Organization Assignments <Employee> and <Company> and <CostCenter> and <BusinessUnit> and <Department>
    And Step Two Completed
    And Proxy as BP Admin
    Then Perform Merit Review <Employee>
    And Step Three Completed


    Examples: Worker Details
      | Employee            | FromDate     | ToDate       | Type                 |  AsOfDate   | SearchWith          | Primary_Reason   |TerminationType |Eligible_ReHire | localReason |SUPORG             |Position        | Location|JobFamily   |JobProfile  |WorkerType  |TimeType   |Reason       |PrimaryLocation|WorkerSubType    |Company                     |CostCenter|RehireReason| PayRateType|BusinessUnit     |Department|RWorkerType         |
      |Autojerry Autojon    | 03/20/2019   | 03/23/2019   | Unpaid Medical Leave | 03/20/2019  | Terminate Associate | PERSONAL REASONS |  Voluntary     |Yes             | Other       | 7152 DONALD CRETE | WD DATA 101-2  |  7152   | Home Depot | SAIII      |  Associate | Full time | Add to Staff|7152           |Regular Associate|1019 HOME DEPOT CANADA, INC.| 17152000 |  Rehire    |   Hourly   |Canada Associates| 24 PAINT |   Regular Associate|



#   Zephyr THD-8594
  @Synthetic_automation_E2E_T171
  Scenario Outline: E2E_T171_Update effective date for a Change job
    When Proxy as BP Admin
    Then Perform Jobchange to change Jobprofile of an employee <Employee> and <JobProfile> and <Amount> and <EffectiveDate>
    And Stop Proxy
    And Step One Completed
    When Proxy as BP Admin
    Then Correct Effective date of Job change process<Employee> and <EffectiveDate> and <CorrectEffectiveDate>
    And Step Two Completed
    Then Perform Merit Review <Employee>
    And Step Three Completed


    Examples: Worker Details
      | Employee        | JobProfile | Amount | EffectiveDate | CorrectEffectiveDate |
      | Niamh Ethan     |  SRPTMG    | 85000  | 05/20/2019    | 05/13/2019           |
  #| Lechee Kivi  |  SRPTMG    | 85000  | 05/20/2019    | 05/13/2019           |




#Zephyr ID: THD-8559 | Category- 2
  @Synthetic_automation_E2E_T158
  Scenario Outline: E2E_T158_Change job that doesn't complete due to in-line promotion (HR) approvals and then attempt to change comp
    And  Proxy as BP Admin
    Then Perform Job profile change for an employee  Firstname and Lastname and <Employee> and <SUPORG> and <Location> and <UPosition> and <JobProfile> and <EmpType> and <Salary> and <CostCenter> and <Company>
    And Step One Completed
    When Request Compensation of an employee <Reason> and <Empname> and <CompPackage> and <Grade> and <proxyname> and <CompensationPlan> and <ChangeSalary>
    Then Proxy as PayRoll Admin
    When Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value>
    Then WD_View Results and Payslips <Emp_ID> and <Employee> and <PeriodStartDate> and <PeriodEndDate>
    And Step Two Completed

    Examples: Worker and Comp details
      | Employee   | UPosition             | JobProfile | SUPORG  | Location               | EmpType           | TimeType  | Salary | Proxyname       | CostCenter | Company | GoalName     | Category               | Status   | EditGoal                    | Reason            | Empname            | CompPackage | Grade           | proxyname  | CompensationPlan | ChangeSalary | Emp_ID|PayComponent | Batch_ID | InputType | Hours | Value | PeriodStartDate | PeriodEndDate |
      | AKM RAHMAN | MANAGER,PRO OPERATIONS CAN | SRPTMG | Canada Store 7152 (DONALD CRETE) | GREENFIELD PARK - 7152 | Regular Associate | Full Time | 90000 | Anitha Alphonse | 17152000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 | Market Adjustment | AKBAR KHAN | The Home Depot Compensation Package | US Salaried 5.1 | EVAN SCOTT | Salary Plan| 80000 |723900502|E0002|TestBatch| Amount | 75.00 | 35.00 | 04/07/2019| 04/20/2019 |
    #Synthetic new
      #| Asther Dimelo | Systems Tester Data-5 | SCDCGM     | Canada Store 7152 (DONALD CRETE) | GREENFIELD PARK - 7152 | Regular Associate | Full Time | 125000 | Anitha Alphonse | 17152000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 |



#   Zephyr THD-8595
  @automation_E2E_T175
  Scenario Outline: E2E_T175_Change job - update time type (PT to FT)-Non Quebec - Initiate after Cycle 1 is complete after 11/21

    When Proxy as Talent Admin
    Then Check Start performance Review for employee <Employee>

    And Proxy as BP Admin
    Then Perform Jobchange to change TimeType of an employee <Employee> and <jobchangedate> and <TimeType> and <WorkHours>
    And Step One Completed

    When Proxy as Talent Admin
    Then Check Start performance Review for employee <Employee>
    And Step Two Completed

    Then Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value>
    And Step Three Completed


    Examples: Worker Details
      | Emp_ID    | Employee    | jobchangedate | TimeType  | WorkHours  | PayComponent  | Batch_ID  | InputType           | Hours | Value |
      | 200001171 | Kile Rozard | 05/30/2019    | Full Time | 40         | E0081         | 4206      | Hours (unprorated)  | 80    | 35.00 |
    # | 200001179 | Richa Mingle | 05/30/2019  | Full Time | 40  | E0081         | 4206      | Hours (unprorated)  | 80    | 35.00 |
    # | 200001180 | Lonard Jig | 05/30/2019  | Full Time | 40  | E0081         | 4206      | Hours (unprorated)  | 80    | 35.00 |




#Zephyr ID: THD-8609 | Category- 2
  @Synthetic_automation_E2E_TS262
  Scenario Outline: E2E_T262_Delete New Hire

    When Proxy as BP Admin
    And Create position in an organization <SUPORG> and <Position> and <Location> and <JobFamily> and <JobProfile> and <TimeType>  and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>
    And Creating Job requisition <SUPORG> and <Position> and <WorkerType> and <Reason_JobRequisition> and <AssociateType> and <JobProfile> and <Company> and <CostCenter> and <Location>
    And Create Pre-hire with Firstname and Lastname <Country> and <Home_addressline1> and <Home_addressline2> and <Home_city> and <Home_province> and <Home_postalcode> and <Home_type> and <Work_addressline1> and <Work_type>
    Then Hire - Hire Associate<Reason> and <Position> and <SUPORG> and <AssociateType> and <JobProfile> and <TimeType> and <Location> and <PayRateType> and <HireDate>
    Then Hire - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
    Then Hire - Edit ID<Country> and <GovID> and <SSNNumber>
    Then Hire - Propose Compensation<Amount> and <Country>
    Then Onboarding the employee <Country> and <FNemergencyConctOnBoard> and <LNemergencyConctOnBoard> and <RelationShpOnB> and <MailIdONB> and <MobileOnbard> and <JobProfile>
    And Step One Completed
    Then Rescind an Hire Associate<Employee>
    And Step Two Completed

    #And Review PaySlip
    #And THD_INT0015_SAP internal - GL file to finance - Canada -  Outbound
    #And Extract Workday Payroll GL File and send to Mercator
    #And Mercator processes the Workday file and generates SAP IDOCS
    #And SAP process the payroll IDOCs
    #And YG Financial posting is posted as expected
    #And Test the Integrations:THD_INT0010 - Royal Bank of Canada - Bi Weekly Positive Pay Outbound,THD_INT0012 - Royal Bank of Canada - Payroll data direct deposit Outbound


    Examples: Worker Details
       | EmployeeN  | Position            | Reason   |  Reason_JobRequisition  | SSNNumber | SUPORG             | Country | GovID                   | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile         | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | HireDate   | AssociateType     | BusinessUnit      | Department | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type |
       | TestQueeen | NEW Test Position_1001 | New Hire |  Add to Staff  |054124586 | SUP-00000000009399 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Hourly      | 13     | 7152     | Home Depot | Sales Associate IV | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Regular Associate | Canada Associates | 24 PAINT   | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      |

#Zephyr ID: THD-8568 | Category- 2
  @Synthetic_automation_E2E_T215
  Scenario Outline: E2E_T215_Confirm that change from intern to perm triggers them to have performance review and be eligible for discipline

    When Proxy as Talent Admin
    And Check Start performance Review for Intern <Employee>
    And Proxy as BP Admin
    And Perform Jobchange to change Intern to perm employee <Employee> and <JobProfile> and <Amount> and <EffectiveDate>
    And Proxy as Talent Admin
    And Check Start performance Review for employee <Employee>

    Examples: Worker Details
      | Emp_ID    | Employee              | Position            | Reason   | SSNNumber | SUPORG             | Country | GovID                   | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile         | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | HireDate   | AssociateType     | BusinessUnit      | Department | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type | DevelopmentItem | Status   | CareerPreferences        | JobProfiles | WorkExperience       | Company_JobHistory | Award_Type      | Certifications | GoalName     | Category               | Goals_Status | Review_Template   | Disciplinary_Action_Reasons | Period_Start_Date | Period_End_Date | PayComponent | Batch_ID | InputType | Hours | Value |
      | 200000639 | TestXinnia TestBlaine | NEW Test Position_61 | New Hire | 054124182 | SUP-00000000009399 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Hourly      | 13     | 7152     | Home Depot | Sales Associate IV | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Intern | Canada Associates | 24 PAINT   | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Workday Goal | 2019 Performance Goals | Complete     | Discipline Notice | Coach Counsel               | 01/02/2019        | 01/02/2019      | E0081        | 4206     | Hours     | 45.00 | 45.00 |




