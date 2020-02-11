@E2EDemo
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday sandbox


  #Zephyr ID: THD-8573 | Category- 1
  @Synthetic_automation_E2E_T199
  Scenario Outline: E2E_T199_Create Succession plan for a leader, Add successors to plan, Terminate Leader

    #Begining of the scenario
    When Proxy as BP Admin
    And Get position of Employee <Leader>
    And Proxy as Succession partner for 7052
    When Create Succession Plan<Leader> and <EmployeeOne> and <EmployeeTwo> and <Readiness>
    And Step One Completed
    When Proxy as BP Admin
    Then Terminating the Employees <Leader> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
    And Step Two Completed
    And Proxy as Talent Admin 7052
    Then View Succession Plan<Leader>
    And Step Three Completed

    Examples: Worker Details
      | Leader                | EmployeeOne          | EmployeeTwo        | Readiness | SearchWith          | TerminationType | Primary_Reason | Eligible_ReHire | localReason | Termdate   | Position              |
      | TestXue TestVaughn | TestHalima TestBahari | TestHalima TestFreiya | Ready Now | Terminate Associate | Involuntary     | CONDUCT/POLICY | Yes             | Other       | 05/25/2019 | Systems Tester Data-5 |



  #Zephyr ID: THD-8574 | Category- 1
  @Synthetic_automation_E2E_T200
  Scenario Outline: E2E_T200_Create Succession plan for a leader, Transfer Leader

    When Proxy as BP Admin
    And Get position of Employee <Leader>
    When Fetch and proxy to Succession partner for 7052
    When Create Succession Plan<Leader> and <EmployeeOne> and <EmployeeTwo> and <Readiness>
    And Step One Completed
    When Proxy as BP Admin
    Then Perform Jobchange to change Jobprofile of an employee <Leader> and <JobProfile> and <Amount> and <EffectiveDate>
    And Step Two Completed
#change the date and also TimeType in the code whenever running
    And Proxy as Talent Admin 7052
    Then View Succession Plan<Leader>
    And Step Three Completed


    Examples: Worker Details
      | Leader             | EmployeeOne          | EmployeeTwo           | Readiness | JobProfile | Amount | EffectiveDate |
#      | Horror Mohan     | Oscar Rhys  | Poiele Later | Ready Now | SCDCGM     | 7500   | 05/20/2019    |
      #Synthetic new
#      | TestFrida TestKofi    | TestXaio TestWallace  | TestMaisha TestKeegan | Ready Now | SCDCGM     | 7500   |  06/12/2019    |
      | TestXue TestQuasam | TestXaio TestWallace | TestMaisha TestKeegan | Ready Now | SCDCGM     | 7500   | 06/12/2019    |


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
      | Leader             | EmployeeOne          | EmployeeTwo           | Readiness | FromDateRange | ToDateRange | Type                 |
#      | Wilona Zoe | Walsh Lee   | Robin Albert | Ready Now | 05/24/2019    | 05/31/2019  | Unpaid Medical Leave |
    #Synthetic new
#      | Ricardo Mariadoss | Walsh Lee   | Robin Albert | Ready Now | 05/24/2019    | 05/31/2019  | Unpaid Medical Leave |
#      | Anthony Sampras | Walsh Lee   | Robin Albert | Ready Now | 05/24/2019    | 05/31/2019  | Unpaid Medical Leave |
      | TestFrida TestKofi | TestXaio TestWallace | TestMaisha TestKeegan | Ready Now | 06/04/2019    | 06/30/2019  | Unpaid Medical Leave |



    #Zephyr ID: THD-8562 | Category- 1
  @Synthetic_automation_E2E_T164
  Scenario Outline: E2E_T164_HR requests to update direct reporting to a new or newly appointed leader. (If direct reporting involves more than one leader in the organization, it is considered a Reorganization). Person is on leave.
    When Proxy as Absence_Admin_Canada
    #Then Requesting Absence<EmployeeOne> and <FromDateRange> and <ToDateRange> and <Type>
    Then Requesting for a Medical Leave <EmployeeOne> and <FromDateRange> and <ToDateRange> and <Type>
    Then View Leave Of Absence<EmployeeOne> and <AsOfDate> and <Type>
    And Step One Completed
    When Proxy as BP Admin
    Then Move Workers by SupOrg <EmployeeOne> and <EmployeeTwo> and <EmployeeThree> and <SupOrg> and <PropSupOrg> and <Company> and <CostCenter> and <EffectiveDate_MoveWorkers>
    And Step Two Completed
    Then Verify Moved Associates <EmployeeOne> and <EmployeeTwo> and <EmployeeThree> and <PropSupOrg> and <CostCenter> and <AsOfDate> and <Type>
    And Step Three Completed
    #Reverting the above functionality/transactions
#    When Proxy as BP Admin
#    Then Rescind Move Workers<EmployeeOne> and <EmployeeTwo> and <EmployeeThree> and <EffectiveDate_MoveWorkers>
 #   Then Rescind Absence Request of <EmployeeOne>

    Examples: Worker Details
      | EmployeeOne | EmployeeTwo | EmployeeThree | EffectiveDate_MoveWorkers | SupOrg             | PropSupOrg         | Company | CostCenter | FromDateRange | ToDateRange | Type                 | AsOfDate   |
    #synthetic
      | TestXinnia TestTitus | TestFrida TestTitus | TestFrida TestTaue | 06/03/2019                | SUP-00000000000809 | SUP-00000000000710 | 1019    | 7052       | 06/06/2019    | 06/30/2019  | Unpaid Medical Leave | 06/30/2019 |
#    | Karen Sheryl | Koney Roi  | Lechee Kivi | 7152 DONALD CRETE | 7052 DARYL HAGEN | 1019    | 7052       | 05/28/2019    | 06/10/2019  | Unpaid Medical Leave | 05/20/2019 |




  #Zephyr ID: THD-8564 | Category- 1
  @Synthetic_automation_E2E_T193
  Scenario Outline: E2E_T193_Load goals for an associate, process a job profile change and confirm goals and template do move
#    And  user Proxy as BP Admin
#    And Proxy as BP Admin
    When Added Goals for existing Employee <Employee> and <Category> and <GoalName> and <Status>
    And Step One Completed
#    And Proxy as Manager ------------------------- in Sandbox manager doesn't have the change job option
    And Proxy as BP Admin
    Then Perform Job profile change for an employee  Firstname and Lastname and <Employee> and <SUPORG> and <Location> and <UPosition> and <UJobProfile> and <EmpType> and <USalary> and <CostCenter> and <jobchangedate>
    And Step Two Completed
    Then  Proxy To <Employee>
    Then View goals of the employee<Employee> and <GoalName> and <EditGoal>
    And Step Three Completed
    #Reverting the above functionality/transactions
    Then Delete the goals added by the employee <Employee>
    And Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | Employee              | UPosition                   | UJobProfile | jobchangedate | Locatio n         | EmpType           | TimeType  | USalary | CostCenter | Company | GoalName     | Category               | Status   | EditGoal                    | Emp_ID    | EmployeeN  | Position             | Reason   | SSNNumber | SUPORG             | Country | GovID                   | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | HireDate   | AssociateType     | BusinessUnit      | Department | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type |
#      | TestMaisha TestKeegan | DC GENERAL MANAGER CANADA | SAIII-SALES ASSOCIATE III      | 05/31/2019        | GREENFIELD PARK - 7152 | Regular Associate | Full Time | 95000   | 17152000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 | 200000639 | TestQueeen | NEW Test Position_10 | New Hire | 054124085 | SUP-00000000000710 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Salary      | 80000  | 7152     | Home Depot | SRPTMG     | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Regular Associate | Canada Associates | 24 PAINT   | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      |
      | TestMaisha TestKeegan | MANAGER, PRO OPERATIONS CAN | SCDCGM      | 05/31/2019    | REGINA STORE-7052 | Regular Associate | Full Time | 95000   | 17152000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 | 200000639 | TestQueeen | NEW Test Position_10 | New Hire | 054124085 | SUP-00000000000710 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Salary      | 80000  | 7052     | Home Depot | SRPTMG     | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Regular Associate | Canada Associates | 24 PAINT   | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      |



 #


  #Zephyr ID: THD-8552 | Category- 2
  @Synthetic_automation_E2E_TS56
  Scenario Outline: E2E_TS56-Create position, Pre-hire,Propose Compensation Hire_Hourly,Onboarding,Add Goals,Start Disciplinary Action

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
      | Emp_ID    | EmployeeN  | Position             | Reason   | SSNNumber | SUPORG             | Country | GovID                   | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | HireDate   | AssociateType     | BusinessUnit                    | Department | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type | DevelopmentItem | Status   | CareerPreferences        | JobProfiles | WorkExperience       | Company_JobHistory | Award_Type      | Certifications | GoalName     | Category               | Goals_Status | Review_Template   | Disciplinary_Action_Reasons | Period_Start_Date | Period_End_Date | PayComponent | Batch_ID | InputType | Hours | Value |
      | 200000639 | TestQueeen | NEW Test Position_64 | New Hire | 054124187 | SUP-00000000000710 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Hourly      | 13     | 7052     | Home Depot | SAIII      | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Regular Associate | CWS CANADA WEST STORE ASSOCIATE | 024 PAINT  | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Workday Goal | 2019 Performance Goals | Complete     | Discipline Notice | Coach Counsel               | 01/02/2019        | 01/02/2019      | E0081        | 4206     | Hours     | 45.00 | 45.00 |



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
      | Emp_ID    | EmployeeN  | Position              | Reason   | SSNNumber | SUPORG             | Country | GovID                   | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | HireDate   | AssociateType     | BusinessUnit                    | Department     | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type | DevelopmentItem | Status   | CareerPreferences        | JobProfiles | WorkExperience       | Company_JobHistory | Award_Type      | Certifications | GoalName     | Category               | Goals_Status | Review_Template   | Disciplinary_Action_Reasons | Period_Start_Date | Period_End_Date | PayComponent | Batch_ID | InputType | Hours | Value |
      | 200000639 | TestQueeen | NEW Test Position_216 | New Hire | 054166236 | SUP-00000000000710 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Salary      | 80000  | 7052     | Home Depot | SRPTMG     | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Regular Associate | CWS CANADA WEST STORE ASSOCIATE | 003 STORE MGRS | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Workday Goal | 2019 Performance Goals | Complete     | Discipline Notice | Coach Counsel               | 01/02/2019        | 01/02/2019      | E0081        | 4206     | Hours     | 45.00 | 45.00 |



    #Zephyr ID: THD-8643
  @automation_E2E_T61
  Scenario Outline: E2E_T61_Update home address in Canada - current date

    When Proxy as BP Admin
    And Hire Test data Generator <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>


    When Proxy as BP Admin
    Then Home Contact Change <Emp_ID> and <Employee> and <Address1> and <Postal> and <City> and <Province> and <Usage> and <effectivedate>
    And Step One Completed

    Then Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value>

#    Then WD_View Results and Payslips <Emp_ID> and <Employee> and <PeriodStartDate> and <PeriodEndDate>
    And Generate and review T4s

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Emp_ID    | Employee         | Address1        | Postal  | City       | Province | Usage                    | effectivedate | PayComponent | Batch_ID | InputType | Hours | Value |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     | 715000155 | GABRIEL BILODEAU | 404 CRES STREET | H3Z 2Y7 | CUMBERLAND | Ontario  | Permanent Street Address | 06/11/2019    | E0081        | 4206     | Amount    | 75.00 | 35.00 |
#      | 200000449 | Jackson Roy | 404 CRES STREET | H3Z 2Y7 | CUMBERLAND | Ontario  | Permanent Street Address |  06/11/2019   | E0081        | 4206     | Amount    | 75.00 | 35.00 |




  #Zephyr ID: THD-8564 | Category- 1
  @Synthetic_automation_E2E_T193_WithTestData
  Scenario Outline: E2E_T193_Load goals for an associate, process a job profile change and confirm goals and template do move

    When Proxy as BP Admin
    And Hire Test data Generator <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    And  Proxy as BP Admin
    When Added Goals for existing Employee <Employee> and <Category> and <GoalName> and <Status>
    And Step One Completed
    And Proxy as Manager
    Then Perform Job profile change for an employee  Firstname and Lastname and <Employee> and <SUPORG> and <Location> and <UPosition> and <UJobProfile> and <EmpType> and <USalary> and <CostCenter> and <jobchangedate>
    And Step Two Completed
    Then user Proxy as <Employee>
    Then View goals of the employee<Employee> and <GoalName> and <EditGoal>
    And Step Three Completed
#   Then Delete the goals added by the employee <Employee>
#   And Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Employee   | UPosition             | UJobProfile | jobchangedate | EmpType           |  USalary | CostCenter |  GoalName     | Category               | Status   | EditGoal                    | SSNNumber | SUPORG             | Country | CostCenter | Location | JobProfile |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     | Petter hay | Systems Tester Data-8 | SCDCGM      | 05/30/2019    | Regular Associate |  95000   | 17152000   |  Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 | 054124085 | SUP-00000000009399 | Canada  | 17152000   | 7152     | SRPTMG     |



#   Zephyr THD-8593
  @automation_E2E_T170
  Scenario Outline: E2E_T170_E2E_T34_Process a rehire for an associate who was terminated on leave - Initiate after Cycle 1 is complete after 11/21

    When Proxy as Absence_Admin_Canada
    And Absence Request for the associate <Employee> and <FromDate> and <ToDate> and <Type>
    Then View the Leave Of Absence for the associate <Employee> and <AsOfDate> and <Type>
    Then Step one Completed
    When Proxy as BP Admin
    Then Terminating the Associate <Employee> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
    When Proxy as BP Admin
    And  Create position in the organization <SUPORG> and <Position> and <Location> and <JobFamily> and <JobProfile> and <TimeType> and <WorkerType>
    Then Creating a new Job requisition <SUPORG> and <Position> and <WorkerType> and <Reason> and <WorkerSubType> and <JobProfile> and <Company> and <CostCenter> and <PrimaryLocation>
    And ReHire - ReHire Associate <Employee> and <SUPORG> and <RehireReason> and <Position> and <RWorkerType> and <JobProfile> and <TimeType> and <Location> and <PayRateType>
    And Step Two Completed
    Then Perform Merit Review <Employee>
    And Step Three Completed


    Examples: Worker Details
      | Employee           | FromDate   | ToDate     | Type                 | AsOfDate   | SearchWith          | Primary_Reason   | TerminationType | Eligible_ReHire | localReason | SUPORG             | Position      | Location | JobFamily  | JobProfile | WorkerType | TimeType  | Reason       | PrimaryLocation | WorkerSubType     | Company                      | CostCenter | RehireReason | PayRateType | BusinessUnit      | Department | RWorkerType       |Termdate|
      | TestSafiya TestTitus | 05/10/2019 | 05/18/2019 | Unpaid Medical Leave | 05/10/2019 | Terminate Associate | PERSONAL REASONS | Voluntary       | Yes             | Other       | SUP-00000000000710 | WD DATA 104-1 | 7052     | Home Depot Foundation| SRPTMG     | Associate  | Full time | Add to Staff | 7052            | Regular Associate | 1019 HOME DEPOT CANADA, INC. | 17152000   | Rehire       | Hourly      | Canada Associates | 24 PAINT   | Regular Associate |05/25/2019|


# Zephyr THD-8594
# @stoprecording
  @Synthetic_automation_E2E_T171
  Scenario Outline: E2E_T171_Update effective date for a Change job

    When Proxy as BP Admin
    And Hire Test data Generator <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the scenario
    When Proxy as BP Admin
    Then Perform Jobchange to change Jobprofile of an employee <Employee> and <JobProfile> and <Amount> and <EffectiveDate>
    And Stop Proxy
    And Step One Completed
    When Proxy as BP Admin
    Then Correct Effective date of Job change process <Employee> and <EffectiveDate> and <CorrectEffectiveDate>
    And Step Two Completed
    Then Perform Merit Review <Employee>
    And Step Three Completed
    #Reverting the above functionality/transactions
    And Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | Employee   | JobProfile | Amount | EffectiveDate | CorrectEffectiveDate |
      | SUP-00000000000809 | Canada  | 01/08/2019 | 054266283 | ANNA YEE | SRPTMG     | 85000  | 05/20/2019    | 05/13/2019           |


##Zephyr ID: THD-8559 | Category- 2
#  @Synthetic_automation_E2E_T158
#  Scenario Outline: E2E_T158_Change job that doesn't complete due to in-line promotion (HR) approvals and then attempt to change comp
#    And  Proxy as BP Admin
#    Then Perform Job profile change for an employee  Firstname and Lastname and <Employee> and <SUPORG> and <Location> and <UPosition> and <JobProfile> and <EmpType> and <Salary> and <CostCenter> and <Company>
#    And Step One Completed
#    When Request Compensation of an employee <Reason> and <Empname> and <CompPackage> and <Grade> and <proxyname> and <CompensationPlan> and <ChangeSalary>
#    Then Proxy as PayRoll Admin
#    When Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value>
#    Then WD_View Results and Payslips <Emp_ID> and <Employee> and <PeriodStartDate> and <PeriodEndDate>
#    And Step Two Completed
#
#    Examples: Worker and Comp details
#      | Employee   | UPosition             | JobProfile | SUPORG  | Location               | EmpType           | TimeType  | Salary | Proxyname       | CostCenter | Company | GoalName     | Category               | Status   | EditGoal                    | Reason            | Empname            | CompPackage | Grade           | proxyname  | CompensationPlan | ChangeSalary | Emp_ID|PayComponent | Batch_ID | InputType | Hours | Value | PeriodStartDate | PeriodEndDate |
#      | AKM RAHMAN | MANAGER,PRO OPERATIONS CAN | SRPTMG | Canada Store 7152 (DONALD CRETE) | GREENFIELD PARK - 7152 | Regular Associate | Full Time | 90000 | Anitha Alphonse | 17152000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 | Market Adjustment | AKBAR KHAN | The Home Depot Compensation Package | US Salaried 5.1 | EVAN SCOTT | Salary Plan| 80000 |723900502|E0002|TestBatch| Amount | 75.00 | 35.00 | 04/07/2019| 04/20/2019 |
#    #Synthetic new
#      #| Asther Dimelo | Systems Tester Data-5 | SCDCGM     | Canada Store 7152 (DONALD CRETE) | GREENFIELD PARK - 7152 | Regular Associate | Full Time | 125000 | Anitha Alphonse | 17152000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 |
#


#   Zephyr THD-8595
  @automation_E2E_T175
  Scenario Outline: E2E_T175_Change job - update time type (PT to FT)-Non Quebec - Initiate after Cycle 1 is complete after 11/21

    When Proxy as BP Admin
    And Hire Test data Generator <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>


    When Proxy as Talent Admin
    Then Check Start performance Review for employee <Employee>

    And Proxy as BP Admin
    #Then Perform Jobchange to change TimeType of an employee <Employee> and <jobchangedate> and <TimeType> and <WorkHours>
    Then Perform Jobchange to change TimeType <Employee> and <jobchangedate> and <TimeType> and <WorkHours>
    And Step One Completed

    When Proxy as Talent Admin
    Then Check Start performance Review for employee <Employee>
    And Step Two Completed

    Then Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value>
    And Step Three Completed

    Then  Delete Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>

    And Proxy as BP Admin
    And Rescind the job transfer for the employee <Employee>


    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Emp_ID    | Employee      | jobchangedate | TimeType  | WorkHours | PayComponent | Batch_ID | InputType          | Hours | Value |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     | 103466377 | DANY TROTTIER | 06/01/2019    | Full Time | 40        | E0081        | 4206     | Hours (unprorated) | 80    | 35.00 |
    # | 200001179 | Richa Mingle | 05/30/2019  | Full Time | 40  | E0081         | 4206      | Hours (unprorated)  | 80    | 35.00 |
    # | 200001180 | Lonard Jig | 05/30/2019  | Full Time | 40  | E0081         | 4206      | Hours (unprorated)  | 80    | 35.00 |




#Zephyr ID: THD-8609 | Category- 2
  @Synthetic_automation_E2E_TS262
  Scenario Outline: E2E_T262_Delete New Hire

    When Proxy as BP Admin
    And Create position in an organization <SUPORG> and <Position> and <Location> and <JobFamily> and <JobProfile> and <TimeType>  and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>
    #And Creating Job requisition <SUPORG> and <Position> and <WorkerType> and <Reason_JobRequisition> and <AssociateType> and <JobProfile> and <Company> and <CostCenter> and <Location>

    And Create Pre-hire with Firstname and Lastname <Country> and <Home_addressline1> and <Home_addressline2> and <Home_city> and <Home_province> and <Home_postalcode> and <Home_type> and <Work_addressline1> and <Work_type>
    Then Hire - Hire Associate<Reason> and <Position> and <SUPORG> and <AssociateType> and <JobProfile> and <TimeType> and <Location> and <PayRateType> and <HireDate>
    Then Hire - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
    Then Hire - Edit ID<Country> and <GovID> and <SSNNumber>
    Then Hire - Propose Compensation<Amount> and <Country>
    Then Onboarding the employee <Country> and <FNemergencyConctOnBoard> and <LNemergencyConctOnBoard> and <RelationShpOnB> and <MailIdONB> and <MobileOnbard> and <JobProfile>
    And Step One Completed
    And Proxy as BP Admin
    Then Rescind an Hire Associate<Employee>
    And Step Two Completed

    And Review PaySlip
    And THD_INT0015_SAP internal - GL file to finance - Canada -  Outbound
    And Extract Workday Payroll GL File and send to Mercator
    And Mercator processes the Workday file and generates SAP IDOCS
    And SAP process the payroll IDOCs
    And YG Financial posting is posted as expected
    And Test the Integrations:THD_INT0010 - Royal Bank of Canada - Bi Weekly Positive Pay Outbound,THD_INT0012 - Royal Bank of Canada - Payroll data direct deposit Outbound


    Examples: Worker Details
      | EmployeeN  | Position               | Reason   | Reason_JobRequisition | SSNNumber | SUPORG             | Country | GovID                   | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | HireDate   | AssociateType     | BusinessUnit                    | Department | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type |
      | TestQueeen | NEW Test Position_1005 | New Hire | Add to Staff          | 054124594 | SUP-00000000000710 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Hourly      | 13     | 7052     | Home Depot | SAIII      | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Regular Associate | CWS CANADA WEST STORE ASSOCIATE | 024 PAINT  | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      |


  @Synthetic_TestdatGenerator
  Scenario Outline: Hire Test data generator

    When Proxy as BP Admin
    And Hire Test data Generator <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     |
    #  | SUP-00000000000710 | Canada   | 01/08/2019 |  054266257  |SRPTMG       |




    #Zephyr ID: THD-8559 | Category- 2
  @Synthetic_automation_Sand_E2E_T158
  Scenario Outline: E2E_T158_Change job that doesn't complete due to in-line promotion (HR) approvals and then attempt to change comp

    And  Proxy as BP Admin
    Then Process In Line promotion<Employee> and <SUPORG> and <Location> and <UPosition> and <JobProfile> and <EmpType> and <Salary> and <CostCenter> and <Company>
    And Step One Completed
    And Request Compensation of an employee <Reason> and <Empname> and <CompPackage> and <Grade> and <proxyname> and <CompensationPlan> and <ChangeSalary>
    And Step Two Completed
    Then Proxy as PayRoll Admin
    When Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value>
    Then WD_View Results and Payslips <Emp_ID> and <Employee> and <PeriodStartDate> and <PeriodEndDate>
    Then Delete Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    And Rescind the job transfer for the employee <Employee>
    And Step Three Completed


    Examples: Worker and Comp details
      | Employee     | UPosition                  | JobProfile | SUPORG                           | Location               | EmpType           | TimeType  | Salary | Proxyname       | CostCenter | Company | GoalName     | Category               | Status   | EditGoal                    | Reason            | Empname      | CompPackage                         | Grade           | proxyname  | CompensationPlan | ChangeSalary | Emp_ID    | PayComponent | Batch_ID | InputType | Hours | Value   | PeriodStartDate | PeriodEndDate |
      | JEFF BUCKLEY | MANAGER,PRO OPERATIONS CAN | SRPTMG     | Canada Store 7152 (DONALD CRETE) | GREENFIELD PARK - 7152 | Regular Associate | Full Time | 90000  | Anitha Alphonse | 17152000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 | Market Adjustment | JEFF BUCKLEY | The Home Depot Compensation Package | US Salaried 5.1 | AVETA KING | Salary Plan      | 90000        | 703000578 | E0002        | 4206     | Amount    | 75.00 | 1035.00 | 06/09/2019      | 06/22/2019    |
    #Synthetic new
      #| Asther Dimelo | Systems Tester Data-5 | SCDCGM     | Canada Store 7152 (DONALD CRETE) | GREENFIELD PARK - 7152 | Regular Associate | Full Time | 125000 | Anitha Alphonse | 17152000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 |



    #Zephyr ID: THD-8578 | Category- 2
  @Synthetic_automation_E2E_T4
  Scenario Outline: E2E_T4_Transfer within country (sent by current manager) - Initiate after Cycle 1 is complete after 11/21
    And  Proxy as BP Admin
    Then Process a Change Job Transaction and send associate to a new manager within Canada but ensure it’s a supervisory organization within a different company<Employee> and <SUPORG> and <Location> and <UPosition> and <JobProfile> and <EmpType> and <Salary> and <CostCenter> and <Company>
    And Step One Completed
    Then Proxy as PayRoll Admin
    When Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value>
    Then WD_View Results and Payslips <Emp_ID> and <Employee> and <PeriodStartDate> and <PeriodEndDate>
    Then Delete Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    And Rescind the job transfer for the employee <Employee>
    And Step Two Completed

    Examples: Worker and Comp details
      | Employee      | UPosition                  | JobProfile | SUPORG                           | Location               | EmpType           | TimeType  | Salary | Proxyname       | CostCenter | Company | GoalName     | Category               | Status   | EditGoal                    | Reason            | Empname      | CompPackage                         | Grade           | proxyname  | CompensationPlan | ChangeSalary | Emp_ID    | PayComponent | Batch_ID | InputType | Hours | Value  | PeriodStartDate | PeriodEndDate |
      | JAMIE HASKELL | MANAGER,PRO OPERATIONS CAN | SRPTMG     | Canada Store 7152 (DONALD CRETE) | GREENFIELD PARK - 7152 | Regular Associate | Full Time | 90000  | Anitha Alphonse | 17152000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 | Market Adjustment | JEFF BUCKLEY | The Home Depot Compensation Package | US Salaried 5.1 | EVAN SCOTT | Salary Plan      | 80000        | 716600449 | E0002        | 4206     | Amount    | 75.00 | 100.00 | 06/09/2019      | 06/22/2019    |
    #Synthetic new
      #| Asther Dimelo | Systems Tester Data-5 | SCDCGM     | Canada Store 7152 (DONALD CRETE) | GREENFIELD PARK - 7152 | Regular Associate | Full Time | 125000 | Anitha Alphonse | 17152000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 |



  #   Zephyr THD - 8560
  @automation_E2E_T159
  Scenario Outline: E2E_T159_Change job that doesn't complete due to in-line promotion (HR) approvals and then run group review

#    Hourly Associate cannot change business title
#    When Proxy as BP Admin
#    Then Change Business Title <Employee> and <JobChangeDate> and <ProposedBusinessTitle>

    When Proxy as BP Admin
    And Hire Test data Generator <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>

    When Proxy as BP Admin
    Then Perform Jobchange to change Jobprofile of an employee <Employee> and <JobProfile> and <Amount> and <EffectiveDate>
    And Step One Completed

    Then Perform Merit Review <Employee>
    And Step Two Completed

    Then Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value>
    And Step Three Completed

    Then  Delete Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>

    And Proxy as BP Admin
    And Rescind the job transfer for the employee <Employee>



    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Emp_ID    | Employee         | JobProfile | Amount | EffectiveDate | JobChangeDate | ProposedBusinessTitle | PayComponent | Batch_ID | InputType          | Hours | Value |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     | 718500068 | STEPHANIE ANCTIL | SCDCGM     | 90000  | 05/30/2019    | 05/30/2019    | Senior Manager        | E0081        | 4206     | Hours (unprorated) | 80    | 35.00 |





    #Zephyr THD - 8575
  @automation_E2E_T202
  Scenario Outline: E2E_T202_Succession partner updates, confirm they can't see old plan and new incumbent can

    When Proxy as SecurityPartner

    When Proxy as BP Admin
    And Get position of Employee <Leader>
    And Proxy as Succession Partner 7152
    Then View Succession Plan<Leader>
    And Step One Completed

    When Proxy as SecurityPartner

    When Proxy as BP Admin
    And Get position of Employee <Leader>
    And Proxy as Succession Partner 7152
    Then View Succession Plan<Leader>
    And Step Three Completed




    Examples: Worker Details
      | Leader             |
      | TestFrida TestKofi |



       #Zephyr ID: THD-8568 | Category- 2
  @stoprecording
  @Synthetic_automation_E2E_T215
  Scenario Outline: E2E_T215_Confirm that change from intern to perm triggers them to have performance review

    When Proxy as BP Admin
    And Hire Intern Test data Generator <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    And Step One Completed
    Then Proxy as Talent Admin
    And Check Start performance Review for Intern <EmployeeN>
    And Step Two Completed
    And Proxy as BP Admin
    And Perform Jobchange to change Intern to perm employee <EmployeeN> and <JobProfile> and <Amount> and <EffectiveDate>
    And Step Three Completed
    And Proxy as Talent Admin
    And Regular Check Start performance Review for employee <EmployeeN>
    And Step Four Completed

    Examples: Worker Details
      | Emp_ID    | EmployeeN               | Position             | Reason   | SSNNumber | SUPORG             | Country | GovID                   | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | Hiredate   | AssociateType | BusinessUnit      | Department | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type | DevelopmentItem | Status   | CareerPreferences        | JobProfiles | WorkExperience       | Company_JobHistory | Award_Type      | Certifications | GoalName     | Category               | Goals_Status | Review_Template   | Disciplinary_Action_Reasons | Period_Start_Date | Period_End_Date | PayComponent | Batch_ID | InputType | Hours | Value |
      | 200000639 | TestVivianna TestKeegan | NEW Test Position_63 | New Hire | 054266940 | SUP-00000000000710 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Hourly      | 13     | 7152     | Home Depot | SRPTMG     | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Intern        | Canada Associates | 24 PAINT   | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Workday Goal | 2019 Performance Goals | Complete     | Discipline Notice | Coach Counsel               | 01/02/2019        | 01/02/2019      | E0081        | 4206     | Hours     | 45.00 | 45.00 |



#  Creating Job requisition
  @CreateJobRequisition
  Scenario Outline: Job requisition
    When Proxy as BP Admin
    Then Creating Job requisition <SUPORG> and <Position> and <WorkerType> and <Reason> and <WorkerSubType> and <JobProfile> and <Company> and <CostCenter> and <PrimaryLocation>

    Examples: Worker Details
      | SUPORG                         | Position             | WorkerType | Reason       | WorkerSubType | WorkerTimetype  | JobProfile | Company           | CostCenter | PrimaryLocation |
      | Canada Store 7154 (LIAM CASEY) | WD_AUTOMATION_TESTER | Associate  | Add to Staff | Regular       | Full time       | SRPTMG     | Home depot Canada | 17152000   | 7152            |
      # | USA Store 0914  (BRIAN ASKIN) | US TEST DATA-4 | Associate  | Add to Staff | Regular Associate | HMCHSP     | HOME DEPOT STORE SUPPORT | 19090199   | 0914            |
     # | Greenfield Park | Senior Analyst-30  | Employee    | Add to Staff | Expatriate     | Human Resource Director | Home depot Canada | Toronto North |  Anitha Alphonse |
     # | Mount Laurel | Systems Analyst-WD-10  | Employee    | Add to Staff | Expatriate     | Human Resource Director | Home Depot U.S.A., INC | ATLANTA SDC |  Anitha Alphonse |

