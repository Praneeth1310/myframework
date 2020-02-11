@E2EDemo
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday hd3


  #Zephyr ID: THD-8573 | Category- 1
  @Synthetic_automation_E2E_T199
  Scenario Outline: E2E_T199_Create Succession plan for a leader, Add successors to plan, Terminate Leader

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
      | Leader       | EmployeeOne | EmployeeTwo | Readiness | SearchWith          | TerminationType | Primary_Reason | Eligible_ReHire | localReason | Termdate   | Position              |
      | Bennett Nes | Denver Axe   | Bonnie Ven  | Ready Now | Terminate Associate | Involuntary     | CONDUCT/POLICY | Yes             | Other       | 05/25/2019 | Systems Tester Data-5 |
      #| Aiya Sheen | Amaya Xia   | Annaisha xia  | Ready Now | Terminate Associate | Involuntary     | CONDUCT/POLICY | Yes             | Other       | 05/25/2019 | Systems Tester Data-5 |

#Completed
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
      | Leader       | EmployeeOne | EmployeeTwo | Readiness | JobProfile | Amount | EffectiveDate |
      #| Amaya xia  | Annaisha xia | Akane Xia | Ready Now | SCDCGM     | 7500   | 06/12/2019    |
      #| Huang Shinon | Park Shiwon | Liu Gualin  | Ready Now | SCDCGM     | 7500   | 06/12/2019    |
      | TestFrida TestKnox | Bennett Nes | Denver Axe | Ready Now | SCDCGM     | 90000   | 06/12/2019    |

#Completed
  #Zephyr ID: THD-8566 | Category- 1
  @Synthetic_automation_E2E_T213
  Scenario Outline: E2E_T213_Confirm being on leave doesn't trigger someone to come off succession plan

    When Proxy as Absence_Admin_Canada
    Then Requesting Absence<EmployeeOne> and <FromDateRange> and <ToDateRange> and <Type> and <Country>
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
      | Leader                 | Country | EmployeeOne          | EmployeeTwo           | Readiness | FromDateRange | ToDateRange | Type                 |
      | TestEleysha TestBahari | Canada  | TestAmaravat TestThamaara | TestDelilah TestKeegan | Ready Now | 12/26/2019    | 01/16/2020  | Unpaid Medical Leave |

#Completed
  #Zephyr ID: THD-8562 | Category- 1
  @Synthetic_automation_E2E_T164
  Scenario Outline: E2E_T164_HR requests to update direct reporting to a new or newly appointed leader. (If direct reporting involves more than one leader in the organization, it is considered a Reorganization). Person is on leave.

    When Proxy as Absence_Admin_Canada
    Then Requesting Absence<EmployeeOne> and <FromDateRange> and <ToDateRange> and <Type> and <Country>
    Then View Leave Of Absence <EmployeeOne> and <AsOfDate> and <Type>
    And Step One Completed
    When Proxy as BP Admin
    Then Move Workers by SupOrg <EmployeeOne> and <EmployeeTwo> and <EmployeeThree> and <SupOrg> and <PropSupOrg> and <Company> and <CostCenter> and <EffectiveDate_MoveWorkers>
    And Step Two Completed
    Then Verify Moved Associates <EmployeeOne> and <EmployeeTwo> and <EmployeeThree> and <PropSupOrg> and <CostCenter> and <AsOfDate> and <Type>
    And Step Three Completed
###   #Reverting the above functionality/transactions
#    When Proxy as BP Admin
#    Then Rescind Move Workers<EmployeeOne> and <EmployeeTwo> and <EmployeeThree> and <EffectiveDate_MoveWorkers>
#    Then Rescind Absence Request of <EmployeeOne>

    Examples: Worker Details
      | EmployeeOne        | Country | EmployeeTwo         | EmployeeThree        | EffectiveDate_MoveWorkers | SupOrg             | PropSupOrg         | Company | CostCenter | FromDateRange | ToDateRange | Type                 | AsOfDate   |
      | TestAsuka TestWren | Canada  |Alice Jame | TestAmaravat TestThamaara | 01/01/2020                | SUP-00000000000710 | SUP-00000000000809 | 1019    | 7152       | 12/26/2019    | 01/06/2020 | Unpaid Medical Leave | 01/02/2020 |
#      | TestAmaravat TestKameroon | TestChoi TestPhen | TestKhim TestPen | 10/13/2019                | SUP-00000000000710 | SUP-00000000000809 | 1019    | 7152       | 09/06/2019    | 09/30/2019  | Unpaid Medical Leave | 09/30/2019 |


#Completed
  #Zephyr ID: THD-8564 | Category- 1
  @Synthetic_automation_E2E_T193
  Scenario Outline: E2E_T193_Load goals for an associate, process a job profile change and confirm goals and template do move

#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the Scenario ....
    When Proxy as BP Admin
    When Added Goals for existing Employee <Employee> and <Category> and <GoalName> and <Status>
    And Step One Completed
    #And Proxy as Manager ------------------------- manager doesn't have the change job option
    And Proxy as BP Admin
    Then Perform Job change for an associate <Employee> and <SUPORG> and <Location> and <UPosition> and <UJobProfile> and <EmpType> and <USalary> and <CostCenter> and <jobchangedate>
    And Step Two Completed
#    Then  Proxy To <Employee>
    Then View goals of the employee <Employee> and <GoalName> and <EditGoal>
    And Step Three Completed
#    #Reverting the above functionality/transactions
#    Then Delete the goals added by the employee <Employee>
#    And Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | Employee             | UPosition         | UJobProfile | jobchangedate | Location          | EmpType           | TimeType  | USalary | CostCenter | Company | GoalName     | Category               | Status   | EditGoal         | Emp_ID    | EmployeeN  | Position             | Reason   | SSNNumber | SUPORG             | Country | Location | JobProfile | Hiredate   |
      | TestNirsha TestFolas | New Test CAN DATA | SCDCGM      | 11/01/2019    | REGINA STORE-7052 | Regular Associate | Full Time | 90000   | 17052000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | THD Workday Goal | 200000639 | TestQueeen | NEW Test Position_10 | New Hire | 054124085 | SUP-00000000000710 | Canada  | 7052     | SRPTMG     | 01/08/2019 |


  #Zephyr ID: THD-8563 | Category- 2
  #@stoprecording
  @Synthetic_automation_E2E_T169
  Scenario Outline: E2E_T169_Process a term for an associate on leave - Hourly
    # #Note: emptype: Hourly; term effc date: Current date

    When Proxy as BP Admin
    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>

    #Begining of the Scenario ....
    When Proxy as Absence_Admin_Canada
    Then Requesting Absence<EmployeeOne> and <FromDateRange> and <ToDateRange> and <Type> and <Country>
    Then Proxy as Manager_7052
    Then View Leave Of Absence <Employee> and <AsOfDate> and <Type>
    And Step One Completed
    When Proxy as BP Admin
    Then Terminating the Employees <Employee> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
    And Step Two Completed
    Then Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
    And Step Three Completed
#    And Review PaySlip
#    And Extract Workday Payroll GL File and send to Mercator
#    And Mercator processes the Workday file and generates SAP IDOCS
#    And YG Financial posting is posted as expected
#    And Step Four Completed
##    Reverting the above functionality/transactions
#    When Proxy as BP Admin
#    Then Rescind Termination of <Employee>
#    And Stop Proxy
#    When Proxy as BP Admin
#    Then Rescind Absence Request of <Employee>

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Employee             | FromDateRange | ToDateRange | Type                | AsOfDate   | TerminationType | Primary_Reason | Eligible_ReHire | SearchWith          | localReason | Termdate   | Emp_ID    | PayComponent | Batch_ID | InputType          | Value | PeriodStartDate | PeriodEndDate | Hours |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266277 | SAIII      | TestLahari TestPadma | 08/14/2019    | 08/28/2019  | Discretionary Leave | 08/28/2019 | Involuntary     | CONDUCT/POLICY | Yes             | Terminate Associate | Other       | 01/09/2020 | 715000155 | E0081        | 4206     | Hours (unprorated) | 35.00 | 01/27/2019      | 02/09/2019    | 80    |
      #| SUP-00000000000710 | Canada  | 01/08/2019 | 054266277 | SRPTMG        | Hello Bye | 09/14/2019    | 09/28/2019  | Discretionary Leave | 10/07/2019 | Involuntary     | CONDUCT/POLICY | Yes             | Terminate Associate | Other       | 10/02/2019 | 715000155 | E0081        | 4206     | Hours (unprorated) | 35.00 | 01/27/2019      | 02/09/2019    | 80    |


  #Zephyr ID: THD-8552 | Category- 2
  @Synthetic_automation_E2E_TS56
  Scenario Outline: E2E_TS56-Create position, Pre-hire,Propose Compensation Hire_Hourly,Onboarding,Add Goals,Start Disciplinary Action

    When Proxy as BP Admin
#    Then Canada Hire With Requisition - Creating Job requisition <SUPORG> and <JobProfile> and <ReqReason> and <RecruitStartDate> and <TargetHireDate> and <Location> and <Company> and <CostCenter> and <Department>
#    Then Canada Hire With Requisition - Hire from requisition
#    Then Canada Hire With Requisition - Create Prehire <Country>
#    Then Canada Hire With Requisition - Hire Associate <HireDate> and <Reason>
#    Then Canada Hire With Requisition - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
#    Then Canada Hire With Requisition - Edit ID<Country> and <GovID>
#    Then Canada Hire With Requisition - Propose Compensation<Amount> and <Country>
#    And Step One Completed
#    Then Canada Hire With Requisition - Onboarding the employee <Country> and <FNameEmerCon> and <InstituteNum> and <BranchID> and <AccNum> and <BankName>
#    And Step Two Completed
    Then Onboarding - Manager Confirmation<Employee>
    And Step Three Completed
    Then Verify Performance tab and career tab <Employee> and <DevelopmentItem> and <Status> and <CareerPreferences> and <JobProfiles> and <WorkExperience> and <Company_JobHistory> and <Award_Type> and <Certifications>
    Then Add Goals for Employee <Employee> and <Category> and <GoalName> and <Goals_Status>
    Then Start Disciplinary Action <Employee> and <Template> and <ReasonsSDA> and <StartDateSDA> and <EndDateSDA>
    And Step Four Completed
    And Review PaySlip
#    And THD_INT0015_SAP internal - GL file to finance - Canada -  Outbound
#    And Extract Workday Payroll GL File and send to Mercator
#    And Mercator processes the Workday file and generates SAP IDOCS
#    And SAP process the payroll IDOCs
#    And YG Financial posting is posted as expected
#    And Test the Integrations:THD_INT0010 - Royal Bank of Canada - Bi Weekly Positive Pay Outbound,THD_INT0012 - Royal Bank of Canada - Payroll data direct deposit Outbound

    Examples: Worker Details
      | Employee     | Reason   | ReqReason    | SUPORG             | Country | GovID                   | Company    | CostCenter | Amount | Location | JobProfile | EmailType | RecruitStartDate | TargetHireDate | HireDate   | BusinessUnit                    | Department | FNameEmerCon | InstituteNum | BranchID | AccNum     | BankName             | DevelopmentItem | Status   | CareerPreferences        | JobProfiles | WorkExperience       | Company_JobHistory | Award_Type      | Certifications | GoalName     | Category               | Goals_Status | Template          | ReasonsSDA     | StartDateSDA | EndDateSDA |
      | Donna Danley | New Hire | Add to Staff | SUP-00000000000710 | Canada  | Social Insurance Number | HOME DEPOT | 17052000   | 13     | 7052     | SAIII      | Home      | 12/20/2018       | 12/21/2018     | 01/08/2019 | CWS CANADA WEST STORE ASSOCIATE | 024 PAINT  | john         | 789          | 45623    | 7853258426 | Royal bank of Canada | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Workday Goal | 2019 Performance Goals | Complete     | Discipline Notice | Verbal Warning | 01/02/2019   | 01/02/2019 |
     # | 200000639 | TestXinnia TestVaughn | Add to Staff | 12/01/2018       | 12/02/2018     | NEW Test Position_64 | New Hire | 054124187 | SUP-00000000000710 | Canada  | Social Insurance Number | HOME DEPOT | 17052000   | Hourly      | 13     | 7052     | Home Depot | SAIII      | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Regular Associate | CWS CANADA WEST STORE ASSOCIATE | 024 PAINT  | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | Work      | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | Ontario    | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Workday Goal | 2019 Performance Goals | Complete     | Discipline Notice | Verbal Warning              | 01/02/2019        | 01/02/2019      | 01/01/1990 | E0081        | 4206     | Hours     | 45.00 | 45.00 |

  #Zephyr ID: THD-8553
  @Synthetic_automation_E2E_TS57
  Scenario Outline: E2E_T57_Create position, Pre-hire,Propose Compensation Hire_Salaried,Onboarding,Add Goals,Start Disciplinary Action

    When Proxy as BP Admin
    Then Canada Hire With Requisition - Creating Job requisition <SUPORG> and <JobProfile> and <ReqReason> and <RecruitStartDate> and <TargetHireDate> and <Location> and <Company> and <CostCenter> and <Department>
    Then Canada Hire With Requisition - Hire from requisition
    Then Canada Hire With Requisition - Create Prehire <Country>
    Then Canada Hire With Requisition - Hire Associate <HireDate> and <Reason>
    Then Canada Hire With Requisition - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
    Then Canada Hire With Requisition - Edit ID<Country> and <GovID>
    Then Canada Hire With Requisition - Propose Compensation<Amount> and <Country>
    And Step One Completed
    Then Canada Hire With Requisition - Onboarding the employee <Country> and <FNameEmerCon> and <InstituteNum> and <BranchID> and <AccNum> and <BankName>
    And Step Two Completed
    Then Onboarding - Manager Confirmation<Employee>
    And Step Three Completed
    Then Verify Performance tab and career tab <Employee> and <DevelopmentItem> and <Status> and <CareerPreferences> and <JobProfiles> and <WorkExperience> and <Company_JobHistory> and <Award_Type> and <Certifications>
    Then Add Goals for Employee <Employee> and <Category> and <GoalName> and <Goals_Status>
    Then Start Disciplinary Action <Employee> and <Template> and <ReasonsSDA> and <StartDateSDA> and <EndDateSDA>

    And Step Four Completed
    And Review PaySlip
    And THD_INT0015_SAP internal - GL file to finance - Canada -  Outbound
    And Extract Workday Payroll GL File and send to Mercator
    And Mercator processes the Workday file and generates SAP IDOCS
    And SAP process the payroll IDOCs
    And YG Financial posting is posted as expected
    And Test the Integrations:THD_INT0010 - Royal Bank of Canada - Bi Weekly Positive Pay Outbound,THD_INT0012 - Royal Bank of Canada - Payroll data direct deposit Outbound

    Examples: Worker Details
      | Employee          | Reason   | ReqReason    | SUPORG             | Country | GovID                   | Company    | CostCenter | Amount | Location | JobProfile | EmailType | RecruitStartDate | TargetHireDate | HireDate   | BusinessUnit                    | Department     | FNameEmerCon | InstituteNum | BranchID | AccNum     | BankName             | DevelopmentItem | Status   | CareerPreferences        | JobProfiles | WorkExperience       | Company_JobHistory | Award_Type      | Certifications | GoalName     | Category               | Goals_Status | Template          | ReasonsSDA     | StartDateSDA | EndDateSDA |
      | TestYes TestWrong | New Hire | Add to Staff | SUP-00000000000710 | Canada  | Social Insurance Number | HOME DEPOT | 17052000   | 80000  | 7052     | SRPTMG     | Home      | 12/20/2018       | 12/21/2018     | 01/08/2019 | CWS CANADA WEST STORE ASSOCIATE | 003 STORE MGRS | john         | 789          | 45623    | 7853258426 | Royal bank of Canada | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Workday Goal | 2019 Performance Goals | Complete     | Discipline Notice | Verbal Warning | 01/02/2019   | 01/02/2019 |
     # | 200000639 | TestQueeen | Add to Staff | 12/01/2018       | 12/02/2018     | NEW Test Position_216 | New Hire | 054166236 | SUP-00000000000710 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Salary      | 80000  | 7052     | Home Depot | SRPTMG     | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Regular Associate | CWS CANADA WEST STORE ASSOCIATE | 003 STORE MGRS | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | Work      | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | Ontario    | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Workday Goal | 2019 Performance Goals | Complete     | Discipline Notice | Verbal Warning              | 01/02/2019        | 01/02/2019      | 01/01/1990 | E0081        | 4206     | Hours     | 45.00 | 45.00 |


  #Zephyr ID: THD-8643
  @automation_E2E_T61
  Scenario Outline: E2E_T61_Update home address in Canada - current date

#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the Scenario ....
    When Proxy as BP Admin
    Then Home Contact Change <Emp_ID> and <Employee> and <Address1> and <Postal> and <City> and <Province> and <Usage> and <effectivedate> and <MobileOnbard>
    And Step One Completed

    Then Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
    And Step Two Completed
#
#    And Generate and review T4s

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Emp_ID    | Employee             | Address1        | Postal  | City       | Province | Usage                    | effectivedate | MobileOnbard | PayComponent | Batch_ID | InputType | Hours | Value |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     | 200003959 | TestLilly TestFinley | 404 CRES STREET | H3Z 2Y7 | CUMBERLAND | Ontario  | Permanent Street Address | 10/07/2019    | 9586452368   | E0081        | 4206     | Amount    | 75.00 | 35.00 |


  #Zephyr THD-8593
  @automation_E2E_T170
  Scenario Outline: E2E_T170_E2E_T34_Process a rehire for an associate who was terminated on leave - Initiate after Cycle 1 is complete after 11/21

    When Proxy as Absence_Admin_Canada
    Then Requesting Absence<Employee> and <FromDate> and <ToDate> and <Type> and <Country>
    Then View Leave Of Absence <Employee> and <AsOfDate> and <Type>
    And Step One Completed
    When Proxy as BP Admin
    Then Terminating the Employees <Employee> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
    And Create position in the organization <SUPORG> and <Location> and <JobFamily> and <JobProfile> and <TimeType> and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>
    And ReHire - ReHire Associate <Employee> and <SUPORG> and <RehireReason> and <Position> and <RWorkerType> and <JobProfile> and <TimeType> and <Location> and <PayRateType>
    And Step Two Completed
    Then Perform Merit Review <Employee>
    And Step Three Completed

    Examples: Worker Details
      | Employee               | Country | AvailabilityDate | EarliestHireDate | FromDate   | ToDate     | Type                 | AsOfDate   | SearchWith          | Primary_Reason   | TerminationType | Eligible_ReHire | localReason | SUPORG             | Position      | Location | JobFamily  | JobProfile | WorkerType | TimeType  | Reason       | PrimaryLocation | WorkerSubType     | Company                      | CostCenter | RehireReason | PayRateType | BusinessUnit      | Department | RWorkerType       | Termdate   |
      |  TestNivi TestSruthi   | Canada  | 12/19/2018       | 12/20/2018       | 11/01/2019 | 11/21/2019 | Unpaid Medical Leave | 11/11/2019 | Terminate Associate | PERSONAL REASONS | Voluntary       | Yes             | Other       | SUP-00000000000710 | WD DATA 103-5 | 7052     | Home Depot | SRPTMG     | Associate  | Full time | Add to Staff | 7052            | Regular Associate | 1019 HOME DEPOT CANADA, INC. | 17152000   | Rehire       | Hourly      | Canada Associates | 24 PAINT   | Regular Associate | 11/10/2019 |

#Completed
 # Zephyr THD-8594
# @stoprecording
  @Synthetic_automation_E2E_T171
  Scenario Outline: E2E_T171_Update effective date for a Change job

   ##Begining of the scenario
#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
#    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the scenario
    When Proxy as BP Admin
    Then Perform Jobchange to change Jobprofile of an employee <Employee> and <JobProfile_JC> and <Amount> and <EffectiveDate>
#    And Stop Proxy
#    And Step One Completed
#    When Proxy as BP Admin
#    Then Correct Effective date of Job change process <Employee> and <EffectiveDate> and <CorrectEffectiveDate>
#    And Step Two Completed
    Then Perform Merit Review <Employee>
    And Step Three Completed
    #Reverting the above functionality/transactions
    #And Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | Employee  | JobProfile | Amount | EffectiveDate | CorrectEffectiveDate | JobProfile_JC |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266282 | Jill Rock | SRPTMG     | 90000  | 11/05/2019    | 11/02/2019           | SCDCGM        |

#      | SUPORG             | Country                   | Hiredate   | SSNNumber | Employee               | JobProfile               | Amount | EffectiveDate | CorrectEffectiveDate | JobProfile_JC |
#      | SUP-00000000009400 | United States Of America  | 01/08/2019 | 054266282 | TestRyanni TestBrycill | SASM - SPECIALTY ASM     | 85000  | 12/01/2019    | 12/13/2019           | STRMGR        |


#Completed
#   Zephyr THD-8595
  @automation_E2E_T175
  Scenario Outline: E2E_T175_Change job - update time type (PT to FT)-Non Quebec - Initiate after Cycle 1 is complete after 11/21

#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the Scenario ....
    When Proxy as Talent Admin
    Then Check Start performance Review for employee <Employee>
    And Proxy as BP Admin
    #Then Perform Jobchange to change TimeType of an employee <Employee> and <jobchangedate> and <TimeType> and <WorkHours>
    Then Perform Jobchange to change TimeType <Employee> and <jobchangedate> and <TimeType> and <WorkHours>
    And Step One Completed
    When Proxy as Talent Admin
    Then Check Start performance Review for employee <Employee>
    And Step Two Completed
#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    And Step Three Completed
#    #Reverting the transactions
#    Then  Delete Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    And Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Emp_ID    | Employee      | jobchangedate | TimeType  | WorkHours | PayComponent | Batch_ID | InputType          | Hours | Value |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SAIII     | 103466377 | DANY TROTTIER | 11/01/2019    | Full Time | 40        | E0081        | 4206     | Hours (unprorated) | 80    | 35.00 |
#      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SAIII      | 103466377 | Stefan Ben | 06/01/2019    | Full Time | 40        | E0081        | 4206     | Hours (unprorated) | 80    | 35.00 |


#Completed
  #Zephyr ID: THD-8609 | Category- 2
  @Synthetic_automation_E2E_TS262
  Scenario Outline: E2E_T262_Delete New Hire

    When Proxy as BP Admin
    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    And Step One Completed
    And Proxy as BP Admin
    Then Rescind an Hire Associate<Employee>
    And Step Two Completed
#    And Review PaySlip
#    And THD_INT0015_SAP internal - GL file to finance - Canada -  Outbound
#    And Extract Workday Payroll GL File and send to Mercator
#    And Mercator processes the Workday file and generates SAP IDOCS
#    And SAP process the payroll IDOCs
#    And YG Financial posting is posted as expected
#    And Test the Integrations:THD_INT0010 - Royal Bank of Canada - Bi Weekly Positive Pay Outbound,THD_INT0012 - Royal Bank of Canada - Payroll data direct deposit Outbound

    Examples: Worker Details
      | Employee             | SUPORG             | Country | Hiredate | SSNNumber | JobProfile |
      | TestYellow TestWhite | SUP-00000000000710 | Canada  | 2/9/2019 | 054266270 | SRPTMG     |
   #   | TestDiaya TestFreiya | 01/02/2019 | 054124594 | SUP-00000000000710 | Canada  | SRPTMG     |


#Completed
  #Zephyr ID: THD-8559 | Category- 2
  @Synthetic_automation_Sand_E2E_T158
  Scenario Outline: E2E_T158_Change job that doesn't complete due to in-line promotion (HR) approvals and then attempt to change comp

#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the Scenario ....
    And  Proxy as BP Admin
    Then Perform Job change for an associate <Employee> and <JC_SUPORG> and <Location> and <UPosition> and <JC_JobProfile> and <EmpType> and <Salary> and <CostCenter> and <Company>
    And Step One Completed
    Then Request Compensation of an employee <Reason> and <Employee> and <EffectiveDate_RC> and <ChangeSalary>
    And Step Two Completed
#    Then Proxy as PayRoll Admin
#    When Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    Then WD_View Results and Payslips <Emp_ID> and <Employee> and <PeriodStartDate> and <PeriodEndDate>
#    And Step Three Completed
#    Then Delete Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    And Rescind the job transfer for the employee <Employee>

    Examples: Worker and Comp details
      | Employee         | UPosition                  | JobProfile | SUPORG             | Country | Hiredate   | SSNNumber | Location               | EmpType           | TimeType  | Salary | Proxyname       | CostCenter | Company | JC_JobProfile | JC_SUPORG          | GoalName     | Category               | Status   | EditGoal                    | Reason            | EffectiveDate_RC | ChangeSalary | Emp_ID    | PayComponent | Batch_ID | InputType | Hours | Value   | PeriodStartDate | PeriodEndDate |
      | TestKith TestPen | MANAGER,PRO OPERATIONS CAN | SRPTMG     | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | GREENFIELD PARK - 7152 | Regular Associate | Full Time | 90000  | Anitha Alphonse | 17152000   | 1019    | SCDCGM        | SUP-00000000000809 | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 | Market Adjustment | 06/09/2019       | 95000        | 703000578 | E0002        | 4206     | Amount    | 75.00 | 1035.00 | 06/09/2019      | 06/22/2019    |


#Completed
  #Zephyr ID: THD-8578 | Category- 2
  @Synthetic_automation_E2E_T4
  Scenario Outline: E2E_T4_Transfer within country (sent by current manager) - Initiate after Cycle 1 is complete after 11/21
    And  Proxy as BP Admin
    Then Perform Job change for an associate <Employee> and <SUPORG> and <Location> and <UPosition> and <JobProfile> and <EmpType> and <Salary> and <CostCenter> and <Company>
    And Step One Completed
    Then Proxy as PayRoll Admin
    When Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
    Then WD_View Results and Payslips <Emp_ID> and <Employee> and <PeriodStartDate> and <PeriodEndDate>
    Then Delete Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    And Rescind the job transfer for the employee <Employee>
    And Step Two Completed

    Examples: Worker and Comp details
      | Employee          | Country | UPosition                    | JobProfile | SUPORG             | Location | EmpType           | TimeType  | Salary | Proxyname       | CostCenter | Company | GoalName     | Category               | Status   | EditGoal                    | Reason            | Empname      | CompPackage                         | Grade           | proxyname  | CompensationPlan | ChangeSalary | Emp_ID    | PayComponent | Batch_ID | InputType | Hours | Value  | PeriodStartDate | PeriodEndDate |
      | TestChoi TestPhen | Canada  |MANAGER,PRO OPERATIONS CAN-2 | SRPTMG     | SUP-00000000000809 | 7152     | Regular Associate | Full Time | 80000  | Anitha Alphonse | 17152000   | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 | Market Adjustment | JEFF BUCKLEY | The Home Depot Compensation Package | US Salaried 5.1 | EVAN SCOTT | Salary Plan      | 80000        | 716600449 | E0002        | 4206     | Amount    | 75.00 | 100.00 | 06/09/2019      | 06/22/2019    |

#Completed
  #Zephyr THD - 8560
  @automation_E2E_T159
  Scenario Outline: E2E_T159_Change job that doesn't complete due to in-line promotion (HR) approvals and then run group review
#   #Note: Hourly Associate cannot change business title
#    #When Proxy as BP Admin
#    #Then Change Business Title <Employee> and <JobChangeDate> and <ProposedBusinessTitle>

#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the Scenario ....
    When Proxy as BP Admin
    Then Perform Jobchange to change Jobprofile of an employee <Employee> and <JobProfile_JC> and <Amount> and <EffectiveDate>
    And Step One Completed
    Then Perform Merit Review <Employee>
    And Step Two Completed
    Then Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
    And Step Three Completed
#    #reverting transactions
#    Then  Delete Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    And Proxy as BP Admin
#    And Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Emp_ID    | Employee     | JobProfile_JC | Amount | EffectiveDate | JobChangeDate | ProposedBusinessTitle | PayComponent | Batch_ID | InputType          | Hours | Value |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     | 718500068 | TestLinsi TestFolas | SCDCGM        | 85000  | 05/30/2019    | 05/30/2019    | Senior Manager        | E0081        | 4206     | Hours (unprorated) | 80    | 35.00 |
   #   | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SAIII      | 718500068 | Denver Axe | SCDCGM - DC GENERAL MANAGER CANADA | 90000  | 08/28/2019    | 05/30/2019    | Senior Manager        | E0081        | 4206     | Hours (unprorated) | 80    | 35.00 |


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
#  @stoprecording
  @Synthetic_automation_E2E_T215
  Scenario Outline: E2E_T215_Confirm that change from intern to perm triggers them to have performance review

#    When Proxy as BP Admin
#    And Hire Intern Test data Generator <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
#    And Step One Completed
#    Then Proxy as Talent Admin
#    And Check Start performance Review for Intern <EmployeeN>
#    And Step Two Completed
#    And Proxy as BP Admin
    And Perform Jobchange to change Intern to perm employee <EmployeeN> and <JobProfile> and <Amount> and <EffectiveDate>
#    And Step Three Completed
    And Proxy as Talent Admin
    Then Check Start performance Review for employee <EmployeeN>
    Then Start Disciplinary Action <EmployeeN> and <Review_Template> and <Disciplinary_Action_Reasons> and <Period_Start_Date> and <Period_End_Date>
    And Step Four Completed

    Examples: Worker Details
      | EffectiveDate  | EmployeeN            | Position             | Reason   | SSNNumber | SUPORG             | Country | GovID                   | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | Hiredate   | AssociateType | BusinessUnit      | Department | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type | DevelopmentItem | Status   | CareerPreferences        | JobProfiles | WorkExperience       | Company_JobHistory | Award_Type      | Certifications | GoalName     | Category               | Goals_Status | Review_Template   | Disciplinary_Action_Reasons | Period_Start_Date | Period_End_Date | PayComponent | Batch_ID | InputType | Hours | Value |
      | 10/25/2019     | TestGreen TestPurple | NEW Test Position_63 | New Hire | 054266940 | SUP-00000000000710 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Hourly      | 13     | 7152     | Home Depot | SRPTMG     | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Intern        | Canada Associates | 24 PAINT   | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Workday Goal | 2019 Performance Goals | Complete     | Discipline Notice | Coach Counsel               | 01/02/2019        | 01/02/2019      | E0081        | 4206     | Hours     | 45.00 | 45.00 |
#      | Discipline Notice  | 10/18/2019    | TestVivianna TestKeegan | Verbal Warning              |  01/02/2019       |  01/02/2019      | 054266940 | SUP-00000000000710 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Hourly      | 13     | 7152     | Home Depot | SRPTMG     | Full time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Intern        | Canada Associates | 24 PAINT   | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Workday Goal | 2019 Performance Goals | Complete     | Discipline Notice | Verbal Warning               | 01/02/2019        | 01/02/2019      | E0081        | 4206     | Hours     | 45.00 | 45.00 |



    #Zephyr ID: THD-8600 | Category- 2
  @Synthetic_automation_E2E_T235
  Scenario Outline: E2E_T235_Hire hourly PT associate in CAN (Quebec) Pay Cycle- Cycle 2"

    When Proxy as BP Admin
    And Hire associate with job requisition <SUPORG> and <Country> and <HireDate> and <SSNNumber> and <JobProfile>
    And Step One Completed
    #For new hire pay period is not generated, once done payroll inputs can be added and validated.
#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    And Step Two Completed
    When Proxy as BP Admin
    Then Employee verifies access in Career and performance tabs <Employee> and <DevelopmentItem> and <Status> and <CareerPreferences> and <JobProfiles> and <WorkExperience> and <Company_JobHistory> and <Award_Type> and <Certifications>
    And Step Three Completed
    Then Manager verifies access in Career and performance tabs <Employee> and <DevelopmentItem> and <Status> and <CareerPreferences> and <JobProfiles> and <WorkExperience> and <Company_JobHistory> and <Award_Type> and <Certifications>
    Then Add Goals for Employee <Employee> and <Category> and <GoalName> and <Goals_Status>
    Then Start Disciplinary Action <Employee> and <Review_Template> and <Disciplinary_Action_Reasons> and <Period_Start_Date> and <Period_End_Date>
    And Step Four Completed


    Examples: Worker Details
      | mp_ID     | Employee   | Position             | Reason   | SSNNumber | SUPORG             | Country | GovID                   | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | HireDate   | AssociateType     | BusinessUnit                    | Department | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type | DevelopmentItem | Status   | CareerPreferences        | JobProfiles | WorkExperience       | Company_JobHistory | Award_Type      | Certifications | GoalName     | Category               | Goals_Status | Review_Template   | Disciplinary_Action_Reasons | Period_Start_Date | Period_End_Date | DOB        | PayComponent | Batch_ID | InputType | Hours | Value |
      | 200000639 | Steffan Benn | NEW Test Position_74 | New Hire | 054126297 | SUP-00000000000710 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Hourly      | 13     | 7052     | Home Depot | SAIII      | Part time | Associate  | 12/20/2018       | 12/21/2018       | 09/18/2019 | Regular Associate | CWS CANADA WEST STORE ASSOCIATE | 024 PAINT  | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Quebec        | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Workday Goal | 2019 Performance Goals | Complete     | Discipline Notice | Verbal Warning               | 01/02/2019        | 01/02/2019      | 01/01/1990 | E0081        | 4206     | Hours     | 45.00 | 45.00 |


  #Zephyr ID: THD-8561
  #@stoprecording
  @Synthetic_automation_E2E_T160
  Scenario Outline: E2E_T160_Terminate as part of a RIF, process through to payroll

#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
#    #Begining of the scenario
#     contact center transactional role does not have access to do the following step. So, proceeding with kelly snow
    When Proxy as BP Admin
    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
#     #Begining of the scenario
#     contact center transactional role does not have access to do the following step. So, proceeding with kelly snow
    When Proxy as BP Admin
    Then Terminating the Employees <Employee> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
    And Step One Completed
    Then Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
    And Step Two Completed
##    #reverting transactions
#    Then Delete Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    When Proxy as BP Admin
#    Then Rescind Termination of <Employee>


    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Emp_ID    | Employee   | TerminationType | Primary_Reason     | Eligible_ReHire | SearchWith          | localReason | Termdate   | PayComponent | Batch_ID | InputType | Hours | Value |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     | 200000509 | Bennett Nes | Voluntary       | REDUCTION IN FORCE | Yes             | Terminate Associate | Other       | 08/30/2019 | E0081        | 4206     | Amount    | 45.00 | 50.00  |


    #Zephyr ID: THD-8601 | Category- 2
  @Synthetic_automation_E2E_T236
  Scenario Outline: E2E_T236_Hire hourly PT associate in NON-QUEBEC CAN - Future (Next) Effective Date in the pay period - Initiate after Cycle 1 is complete after 11/21

    When Proxy as BP Admin
    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    And Step One Completed
  #For new hire pay period is not generated, once done payroll inputs can be added and validated.

#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    And Step Two Completed

    Examples: Worker Details
      | EmployeeN  |  Hiredate  | SSNNumber | SUPORG             | Country | JobProfile | PayComponent | Batch_ID | InputType | Hours | Value |
      | TestQueeen |  11/02/2019  | 574253028 | SUP-00000000000710 | Canada  | SAIII      | E0081        | 4206     | Hours     | 20.00 | 20.00 |
      #| TestQueeen | NEW Test Position_2001A | New Hire | Add to Staff          | 574253028 | SUP-00000000000710 | Canada  | Social Insurance Number | HOME DEPOT | 17152000   | Hourly      | 13     | 7052     | Home Depot | SAIII      | Part time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Regular Associate | CWS CANADA WEST STORE ASSOCIATE | 024 PAINT  | john                    | ballla                  | 01/01/1990 | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      | E0081        | 4206     | Hours     | 20.00 | 20.00 |




#Zephyr ID: THD-8570 | Category- 3
  @automation_E2E_T265
  Scenario Outline: E2E_T265_Name Change

#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
   #Begining of the Scenario ....

    Then Legal name Change <Employee> and <EffectiveDate_Legalname> and <Country> and <FirstnameLegal> and <LastnameLegal>
    And Step One Completed

    Then Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
    And Step Two Completed

    Examples: Worker Details
      | Emp_ID    | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Employee     | EffectiveDate_Legalname | PayComponent | Batch_ID | InputType | Hours | Value | FirstnameLegal | LastnameLegal |
      | 200003954 | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     | Donna Danley | 12/01/2019              | E0081        | 4206     | Amount    | 75.00 | 35.00 | Limoey         | Pherl         |


    #Zephyr ID: THD-8589
  @automation_E2E_T60
  Scenario Outline: E2E_T60_Update home address in Canada - historical date(Salaried)

#    When Proxy as BP Admin
#    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the Scenario ....

    When Proxy as BP Admin
    Then Home Contact Change <Emp_ID> and <Employee> and <Address1> and <Postal> and <City> and <StateOrProvince> and <Usage> and <effectivedate> and <MobileOnbard>
#    And Step One Completed
#
#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
    And Step Two Completed

#    Then Extract Workday Payroll GL File and send to Mercator
#    Then Mercator processes the Workday file and generates SAP IDOCS
#    Then SAP process the payroll IDOC
#    Then YG Financial posting is posted as expected
#    And Step Three Completed

    When Proxy as BP Admin
    Then Home Contact Change <Emp_ID> and <Employee> and <Address1> and <Postal> and <City> and <StateOrProvince> and <Country> and <effectivedate> and <MobileOnbard>
    And Step Four Completed

#    And Generate and review T4s
#    And Step Five Completed

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Emp_ID    | Employee    | Address1        | Postal  | City       | StateOrProvince | Usage                    | effectivedate |  MobileOnbard  | PayComponent | Batch_ID | InputType | Hours | Value |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     | 103409650 | HARSH VAGASIYA  | 404 CRES STREET | H3Z 2Y7 | CUMBERLAND | Ontario  | Permanent Street Address | 06/11/2019    |  9586452368    | E0081        | 4206     | Amount    | 75.00 | 35.00 |

#      | SUPORG             | Country                   | Hiredate   | SSNNumber | JobProfile | Emp_ID    | Employee               | Address1        | Postal  | City     | State | Usage                    | effectivedate | MobileOnbard | PayComponent | Batch_ID | InputType | Hours | Value |
#      | SUP-00000000009400 | United States Of America  | 01/08/2019 | 054266270 | SRPTMG     | 200001342 | TestRyanni TestBrycill | 404 CRES STREET | H3Z 2Y7 | Columbus | Ohio     | Permanent Street Address | 12/01/2019    | 9545452368   | E0081        | 4206     | Amount    | 75.00 | 35.00 |


    #Completed
  #Zephyr ID: THD-8570 | Category- 3
  @automation_E2E_T265
  Scenario Outline: E2E_T265_Name Change

    When Proxy as BP Admin
#    And Hire assssssociate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the Scenario ....

    Then Legal name Change <Employee> and <EffectiveDate_Legalname> and <Country> and <FirstnameLegal> and <LastnameLegal>
    And Step One Completed
    Then Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
    And Step Two Completed

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Employee         | Emp_ID    | EffectiveDate_Legalname | PayComponent | Batch_ID | InputType | Hours | Value | FirstnameLegal |  LastnameLegal  |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     | TestMaisha TestKeegan | 200000509 | 07/26/2019              | E0081        | 4206     | Amount    | 75.00 | 35.00 | Limoey           |  Pherl           |


#-----------------------------------------------------------In Progress E2E Scenarios-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

   #Zephyr ID: THD-8557
  #@stoprecording
  @Synthetic_automation_E2E_T156
  Scenario Outline: E2E_T156_Change job with comp change over 8% that doesn't process due to approvals and then attempt to change comp via standalone process

    When Proxy as BP Admin
#    When Proxy as Manager_7052
    Then Perform Jobchange to change Compensation <Employee> and <jobchangedate> and <Salary>
    And Step One Completed
#    When Proxy as BP Admin
#    Then Request Compensation of an employee <Reason> and <Employee> and <EffectiveDate> and <ChangeSalary>
#    And Step Two Completed
#    And Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | Employee             | jobchangedate | Salary  |Hiredate | SSNNumber | SUPORG             | Country | JobProfile | DevelopmentItem | Status   | CareerPreferences        | JobProfiles | WorkExperience       | Company_JobHistory | Award_Type      | Certifications | GoalName     | Category               | Goals_Status | Template          | ReasonsSDA     | StartDateSDA | EndDateSDA |
      | TestDiaya TestKeegan | 11/9/2019     | 92000      |2/9/2019 | 054126297 | SUP-00000000000710 | Canada  | SAIII      | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Workday Goal | 2019 Performance Goals | Complete     | Discipline Notice | Verbal Warning | 01/02/2019   | 01/02/2019 |


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


    #Zephyr ID: THD-8597
  @automation_E2E_T211
  Scenario Outline:E2E_T211_Confirm temps don't pull into DT, performance cycles, group review, calibration - Initiate after Cycle 1 is complete after 11/21

    When Proxy as BP Admin
    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    And Step One Completed

    When Proxy as Talent Admin
    Then Launch Hourly Review Cycle
    Then Verify Review cycle is Open
    And Step Two Completed

    When Proxy as Talent Admin
    Then Check Start performance Review for employee <Employee>
    Then Start Disciplinary Action <Employee> and <Review_Template> and <Disciplinary_Action_Reasons> and <Period_Start_Date> and <Period_End_Date>
    And Step Three Completed

    When Proxy as Comp Admin
    Then Launch Hourly Merit Cycle
    Then Verify Merit cycle is Open
    And Step Four Completed

    When Proxy as Manager
    Then Look for Merit Task
    Then Confirm Task is not present
    And Step Five Completed

#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    And Step Six Completed

    When Proxy as Absence_Admin_Canada
    Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type> and <Country>
    And Step Seven Completed

    Examples: Worker Details
      | SUPORG             | Country | Hiredate  | SSNNumber | JobProfile | FromDateRange | ToDateRange | Type                  | Associate Type |  Emp_ID  | Employee                     | Review_Template   | Disciplinary_Action_Reasons | Period_Start_Date | Period_End_Date | PayComponent | Batch_ID  | InputType | Hours | Value |
      | SUP-00000000000710 | Canada  | 2/9/2019  | 054266270 | SRPTMG     | 10/04/2019    | 10/08/2019  | Unpaid Medical Leave  | Temparary      |          | TestMaisha TestKeegan         | Discipline Notice | Verbal Warning               | 01/02/2019        | 01/02/2019      |  E0081       | 4206      | Amount    | 75.00 | 35.00 |

  @automation_E2E_T377
  Scenario Outline: E2E_T377_Update  job code/title only via job change for an associate on a leave of absence in Ontario

    When Proxy as BP Admin
    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    ###Begining of the Scenario ....
    When Proxy as Absence_Admin_Canada
    Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type> and <Country>
    And Step One Completed
    Then Proxy as PayRoll Admin
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    And Review PaySlip
    And Step Two Completed
    Then Proxy as BP Admin
    Then Perform Job change for an associate <Employee> and <SUPORG> and <Location> and <UPosition> and <UJobProfile> and <EmpType> and <USalary> and <CostCenter> and <jobchangedate>
    And Step Three Completed
#    Then Proxy as PayRoll Admin
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    And Review PaySlip
#    And Step Four Completed

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Employee           | FromDateRange | ToDateRange | Type          | Emp_ID    | Batch_ID | PayComponent | Location | UPosition | UJobProfile | EmpType           | USalary | CostCenter | jobchangedate |
      | SUP-00000000000809 | Canada  | 12/02/2019 | 054266270 | SAIII      | TestVasu TestGeorg | 12/01/2019    | 12/14/2019  | Medical Leave | 200000771 | 4206     | E0081        | 7152     | WD_Test   | SAIII       | Regular Associate | 14      | 17152000   | 12/02/2019    |


  #  Zephyr ID: THD-8612
  @automation_E2E_T301
  Scenario Outline: E2E_T301_Promotion (same work location) - Initiate after Cycle 1 is complete after 11/21

    ### Note: Change Organization and JobProfile, dont't change location

#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    ##Begining of the Scenario ....

#    Following step is done through the manager proxy, code for the proxy is inside the method
    Then  Perform Jobchange to change Organisation <Employee> and <SUPORG_JC> and <Location>and <jobchangedate> and <Country>
    And Stop Proxy
    When Proxy as Manager
    Then Perform Jobchange to change Jobprofile of an employee <Employee> and <JobProfile_JC> and <Amount> and <EffectiveDate>
    And Step One Completed

#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    Then Review PaySlip
#    And Step Two Completed

    Examples: Worker Details
      | Employee           | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | SUPORG_JC          | Location | UPosition                   | JobProfile_JC  | EmpType   | CostCenter_JC | Amount | jobchangedate | EffectiveDate | Emp_ID    | PayComponent | Batch_ID | InputType | Value | Hours |
      | TestKhim TestPaper | SUP-00000000000710 | Canada  | 02/01/2019 | 054266270 | SAIII      | SUP-00000000000809 | 7052     | MANAGER, PRO OPERATIONS CAN | SAIII          | Full Time | 17152000      | 14     | 11/05/2019    | 11/06/2019    | E0081     | 4206         | Amount   | 75.00     | 35.00 | 22    |
      #| Alice Jame   | SUP-00000000000710 | Canada  | 02/01/2019 | 054266270 | SRPTMG     | SUP-00000000000809 | 7052     | DC GENERAL MANAGER CANADA | SCDCGM        | Full Time | 17152000      | 85000  | 09/30/2019       | 200001073 | E0081        | 4206     | Amount    | 75.00 | 35.00 |
      #| Hannah Xi    | SUP-00000000000710 | Canada  | 02/01/2019 | 054266270 | SRPTMG     | SUP-00000000000809 | 7052     | DC GENERAL MANAGER CANADA | SCDCGM        | Full Time | 17152000      | 85000  | 09/30/2019       | 200001073 | E0081        | 4206     | Amount    | 75.00 | 35.00 |


  #  Zephyr ID: THD-8584
  @automation_E2E_T14
  Scenario Outline: E2E_T14_Location Change Only- Initiate after Cycle 1 is complete after 11/21
    ### Note: Location Change Only(Non Quebec location to Quebec location)
#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    ##Begining of the Scenario ....
#    When Proxy as HR_Partner_7052
    When Proxy as BP Admin
    Then Perform Job change for Location Firstname and Lastname and <Employee> and <Location_JC> and <EffectiveDate_JC>
    And Step One Completed
#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    Then Review PaySlip
#    And Step Two Completed

    Examples: Worker Details
      | Employee             | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Location_JC              | SUPORG_JC          | Location | UPosition                   | JobProfile_JC                        | EmpType   | CostCenter_JC | Amount | EffectiveDate_JC | Emp_ID     | PayComponent | Batch_ID | InputType | Value | Hours |
      | TestGreen TestBlack  | SUP-00000000000710 | Canada  | 02/01/2019 | 054266270 | SRPTMG     | QUEBEC - VIRTUAL - QC01  | SUP-00000000000710 | 7152     | MANAGER, PRO OPERATIONS CAN | SRPTMG - MANAGER, PRO OPERATIONS CAN | Full Time | 17052000      | 85000  | 10/22/2019       | 2000008879 | E0081        | 4206     | Amount    | 75.00 | 35.00 |
     # | Kwang Minnah | SUP-00000000000809 | 7052     | MANAGER, PRO OPERATIONS CAN | 03/02/2019  | SRPTMG        | Full Time | 17152000   | 85000  | 09/30/2019       |        | E0081        | 4206     | Amount    | 75.00 | 35.00 |



#  Zephyr ID: THD-8621
  @automation_E2E_T332
  Scenario Outline: E2E_T332_Location Change Only into different province - Initiate after Cycle 1 is complete after 11/21
    ## Note: Associate's payType - Salary
#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the Scenario ....
#    When Proxy as HR Partner
    When Proxy as BP Admin
    Then Perform Job change for an associate <Employee> and <SUPORG> and <Location> and <UPosition> and <UJobProfile> and <EmpType> and <USalary> and <CostCenter> and <jobchangedate>
    And Step One Completed

    Then Proxy as PayRoll Admin
    Then Review tax elections
    Then Run Retro Pay Calc
    Then Review PaySlip
    And Step Two Completed

#    Then Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
    Then Review PaySlip
    And Step Three Completed

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Employee             | FromDateRange | ToDateRange | Emp_ID    | Batch_ID | PayComponent | Location | UPosition  | UJobProfile                          | EmpType           | USalary | CostCenter | jobchangedate | InputType | Value | Hours |
      | SUP-00000000000710 | Canada  | 01/24/2019 | 054266270 | SRPTMG     | TestNirsha TestFolas | 02/24/2019    | 03/04/2019  | 200003955 | 4206     | E0081        | 7152     | New TD 332 | SRPTMG - MANAGER, PRO OPERATIONS CAN | Regular Associate | 85000   | 17152000   | 10/04/2019    | Amount    | 75.00 | 35.00 |


    #  Zephyr ID: THD-23212
  @automation_E2E_T001
  Scenario Outline: E2E_T001_Perform work contact change and emergency contact change for job change associate

#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
##    Begining of the Scenario ....
    When Proxy as BP Admin
#    Then Perform Job change for an associate <Employee> and <SUPORG> and <Location_JC> and <UPosition> and <JobProfile> and <EmpType> and <USalary> and <CostCenter> and <EffectiveDate_JC>
    Then Perform Job change for Location Firstname and Lastname and <Employee> and <Location_JC> and <EffectiveDate_JC>
    And Step One Completed
    When Proxy as BP Admin
    Then Work Contact Change <EffectiveDate> and <Employee> and <Country> and <Address1> and <Postal> and <City> and <Province/State> and <State> and <PhoneNumber>
    And Step Two Completed
    Then Change Emergency Contacts <Employee> and <Country> and <FirstName> and <LastName> and <Relationship> and <EmergencyPhoneNumber>
    And Step Three Completed
    Then View Emergency Contacts <Employee>
    And Step Four Completed
    Then View Contact Information <Employee>
    And Step Five Completed


    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | EffectiveDate_JC | Employee                 | UPosition            | SUPORG_JC          | Location_JC | EffectiveDate | CostCenter | EmpType   | USalary | Address1              | Postal  | City     | Province/State | State | MobileOnbard | EmergencyContName | FirstName | LastName | Relationship            | EmergencyPhoneNumber | PhoneNumber |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     | 03/02/2019       | TestCaroline TestGilbert | WD_AUTOMATION_TESTER | SUP-00000000000809 | 7152        | 05/24/2019    | 17052000   | Full Time | 80000   | 10-123 MAIN STREET NW | H3Z 2Y7 | MONTREAL | QC             |       | 9054266270   | William Mike      | William   | Mike     | Immediate Family Member | 8646238956           | 9812357859  |


#  Zephyr ID: THD-23213
  @automation_E2E_002
  Scenario Outline:  E2E_002_Update Hire Details Of An Associate

    When Proxy as BP Admin
    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    And Step One Completed
    When Proxy as BP Admin
    Then Edit Service Dates of the associate to change the hire date <Employee> and <EditHireDate>
    And Step Two Completed
    Then Change Preferred Name of the associate <Employee> and <EffectiveDate_Preferredname> and <Country> and <PrefixPreferred> and <SuffixPreferred>
    And Step Three Completed
    Then Legal name Change <Employee> and <EffectiveDate_Legalname> and <Country> and <FirstnameLegal> and <LastnameLegal>
    And Step Four Completed
    When Proxy as BP Admin
    Then Change passport and visa information <Employee> and <Country> and <VisaIdType> and <VisaIdentification>
    And Step Five Completed
    Then Verify Associate Details <Employee>
    And Step Six Completed

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Employee              | EditHireDate | EffectiveDate_Legalname | FirstnameLegal | LastnameLegal | EffectiveDate_Preferredname | PrefixPreferred | SuffixPreferred | VisaIdType  | VisaIdentification |
      | SUP-00000000000710 | Canada  | 01/07/2019 | 054266270 | SRPTMG     | TestGunjan TestHarish | 01/03/2019   | 07/26/2019              | Limoa          | Kun           | 10/26/2019                  | Mr.             | IV              | Work Permit | Driving License    |



#  Zephyr ID: THD-8569
  @automation_E2E_T259
  Scenario Outline: E2E_T259_Hire Date Change - Future Date

#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
#  Begining of the Scenario ....
#    Terminate and rehire the associate to change Hiredate and also to get Last Hiredate
    When Proxy as BP Admin
    Then Terminating the Employees <Employee> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
    When Proxy as BP Admin
    And Create position in the organization <SUPORG> and <Location> and <JobFamily> and <JobProfile> and <TimeType> and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>
    And ReHire - ReHire Associate <Employee> and <SUPORG> and <RehireReason> and <Position> and <RWorkerType> and <JobProfile> and <TimeType> and <Location> and <PayRateType>
    When Proxy as BP Admin
    Then Change Last Hire date of an associate into Future date <Employee> and <ChangeHiredate>
    And Step One Completed

    Examples: Worker Details
      | Employee                | ChangeHiredate | Country | Hiredate   | SSNNumber | AvailabilityDate | EarliestHireDate | SearchWith          | Primary_Reason   | TerminationType | Eligible_ReHire | localReason | SUPORG             | Position      | Location | JobFamily  | JobProfile | WorkerType | TimeType  | Reason       | PrimaryLocation | WorkerSubType     | Company                      | CostCenter | RehireReason | PayRateType | BusinessUnit      | Department | RWorkerType       | Termdate   |
      | TestPadur TestSiruseri | 11/21/2019     | Canada  | 01/24/2019 | 054266270 | 12/19/2018       | 12/20/2018       | Terminate Associate | PERSONAL REASONS | Voluntary       | Yes             | Other       | SUP-00000000000710 | WD DATA 104-1 | 7052     | Home Depot | SRPTMG     | Associate  | Full time | Add to Staff | 7052            | Regular Associate | 1019 HOME DEPOT CANADA, INC. | 17152000   | Rehire       | Salary      | Canada Associates | 24 PAINT   | Regular Associate | 05/10/2019 |


#Zephyr ID: THD-8654
  @Synthetic_automation_E2E_T329
  Scenario Outline: E2E_T329_C2C Transfer within country different province (sent by current manager)

#    When Proxy as BP Admin
#    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    ##Begining of the Scenario ....
    #    Following step is done through the manager proxy, code for the proxy is inside the method
    Then Perform Jobchange to change Organisation <Employee> and <JC_SUPORG> and <Location> and <jobchangedate> and <Country>
    And Step One, Two, Three Completed

#    Then Proxy as PayRoll Admin
#    Then Review tax elections
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value>
#    And Review PaySlip
#    And Step Four Completed

#    #reverting transactions
#    Then  Delete Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    And Proxy as BP Admin
#    And Rescind the job transfer for the employee <Employee>


    Examples: Worker Details
      | Employee               | SUPORG             | UPosition      | UJobProfile | jobchangedate | Location                | EmpType           | TimeType  | USalary | CostCenter | JC_SUPORG          | Company | GoalName     | Category               | Status   | EditGoal                    | Emp_ID    | EmployeeN  | Position             | Reason   | SSNNumber | Country                   | JobProfile | Hiredate   |
      | TestRyanni TestBrycill | SUP-00000000009400 | Workday Tester | SRPTMG      | 12/03/2019    | 0914 | Regular Associate | Full Time | 95000   | 17152000   | SUP-00000000007655 | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 | 200000639 | TestQueeen | NEW Test Position_10 | New Hire | 054124085 | United States Of America  | SRPTMG     | 01/08/2019 |



#Zephyr ID: THD-8611 | Category- 2
  @stoprecording
  @Synthetic_automation_E2E_T294
  Scenario Outline: E2E_T294_Rehire into a different province CN
    ## Note: Employee Type:  Hourly; Ensure PROVINCE changes from province when terminated
    #Code is like hire in 7052 and term; then rehire into 7152

    When Proxy as BP Admin
    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    When Proxy as BP Admin
    Then Terminating the Employees <Employee> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
    And Step One Completed
    And Proxy as Manager
    And Re-Hire associate with job requisition <Employee> and <ReHire_SUPORG> and <Country> and <ReHire_date> and <SSNNumber> and <ReHire_JobProfile>
    And Step Two Completed
    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value>
#    And Review PaySlip
#    And Step Three Completed
#    Then Proxy as <Employee>
    Then Verify Performance tab and career tab <Employee> and <DevelopmentItem> and <Status> and <CareerPreferences> and <JobProfiles> and <WorkExperience> and <Company_JobHistory> and <Award_Type> and <Certifications>
    Then Start Disciplinary Action <Employee> and <Template> and <ReasonsSDA> and <StartDateSDA> and <EndDateSDA>
    And Step Four Completed

    Examples: Worker Details
      | Employee           | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Termdate   | TerminationType | Primary_Reason   | Eligible_ReHire | SearchWith          | localReason | ReHire_SUPORG      | ReHire_date | ReHire_JobProfile | Position            | Location | JobFamily             | WorkerType | TimeType  | AvailabilityDate | EarliestHireDate | Reason       | PrimaryLocation | WorkerSubType     | Company                      | CostCenter | RehireReason | PayRateType | BusinessUnit      | Department | RWorkerType       | DevelopmentItem | Status   | CareerPreferences        | JobProfiles | WorkExperience       | Company_JobHistory | Award_Type      | Certifications | Template          | ReasonsSDA     | StartDateSDA | EndDateSDA | Emp_ID     | PayComponent | Batch_ID | InputType | Value | Hours |
      | TestBella TestHari | SUP-00000000000710 | Canada  | 01/02/2019 | 054266270 | SAIII      | 07/26/2019 | Voluntary       | PERSONAL REASONS | Yes             | Terminate Associate | Other       | SUP-00000000000809 | 11/02/2019  | SAIII             | WD TEST DATA CAN-01 | 7152     | Home Depot Foundation | Associate  | Full time | 12/02/2019       | 12/03/2019       | Add to Staff | 7152            | Regular Associate | 1019 HOME DEPOT CANADA, INC. | 17152000   | Rehire       | Hourly      | Canada Associates | 24 PAINT   | Regular Associate | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Discipline Notice | Verbal Warning | 01/02/2019   | 01/02/2019 | 2000008879 | E0081        | 4206     | Amount    | 75.00 | 35.00 |


# Zephyr ID: THD-8596
  @automation_E2E_T210
  Scenario Outline: E2E_T210_Contingent workers - Hired in Current Pay Period - Initiate after Cycle 1 is complete after 11/21

    When Proxy as BP Admin
    Then Hire Contract Contingent worker <Organization> and <EmployeePreHire> and <Position> and <WorkerType> and <JobProfile> and <TimeType> and <UserName> and <NewPwd> and <VerifyNewPwd>
    Then Step One Completed

#    Then Proxy as Talent Admin
#    Then Launch Salaried Review Cycle
#    Then Verify that  cycle is Open
#    And Step Two Completed

    #  Should not be able to perform  any activity
    When Proxy as Manager_7052
    Then Check Start performance Review,Start Disciplinary Action,Add Goals,Create Succession Plan for Contingent worker <EmployeePreHire>
    And Step Three Completed

#    When Proxy as Comp Admin
#    Then Launch Hourly Merit Cycle
#    Then Verify Cycle is Open
#    And Step Four Completed

#    When Proxy as Manager
#    Then Look for Merit Task
#    Then Confirm Task is not present
#    And Step Five Completed

#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value>
#    And Step Six Completed

    When Proxy as BP Admin
    Then Enter Absence for Contingent Worker <EmployeePreHire>
    And Step Seven Completed

    Examples: Worker Details
      | Organization       | EmployeePreHire      | Position           | Proxyname      | WorkerType | JobProfile | TimeType  | UserName | NewPwd   | VerifyNewPwd |
      | SUP-00000000000710 | Kunal Jaiswal |  New WD Test analyst125742 | Hongming Zhang | Vendor     | QA ASSOC   | Full Time | First27  | WDtry@03 | WDtry@03     |


    #Zephyr ID: THD-8598
  @automation_E2E_T212
  Scenario Outline: E2E_T212_Confirm interns don't pull into DT, performance cycles, group review, succession, calibration - Initiate after Cycle 1 is complete after 11/21

    When Proxy as BP Admin
#    And Hire Intern Test data Generator <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
#    And Step One Completed

#    When Proxy as Talent Admin
    Then Launch Hourly Review Cycle
    Then Verify Review cycle is Open
    And Step Two Completed

    When Proxy as Manager_7052
    Then Check Start performance Review by Manager <Employee>
    Then Start Disciplinary Action <Employee> and <Review_Template> and <Disciplinary_Action_Reasons> and <Period_Start_Date> and <Period_End_Date>
    Then Check Create Succession Plan by Manager <Employee>
    And Step Three Completed

#    When Proxy as Comp Admin
    Then Launch Hourly Merit Cycle
    Then Verify Merit cycle is Open
    And Step Four Completed

#    When Proxy as Manager
    Then Look for Merit Task
    Then Confirm Task is not present
    And Step Five Completed

    Then Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
    And Step Six Completed

    When Proxy as Absence_Admin_Canada
    Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type> and <Country>
    And Step Seven Completed

    Examples: Worker Details
      | SUPORG             | Country | Hiredate | SSNNumber | JobProfile | FromDateRange | ToDateRange | Type                 | Associate Type | Emp_ID    | Employee     | Review_Template   | Disciplinary_Action_Reasons | Period_Start_Date | Period_End_Date | PayComponent | Batch_ID | InputType | Hours | Value |
      | SUP-00000000000710 | Canada  | 2/9/2019 | 054266270 | SRPTMG     | 10/04/2019    | 10/08/2019  | Unpaid Medical Leave | Temparary      | 200001754 | Minn Sooyong | Discipline Notice | Verbal Warning              | 01/02/2019        | 01/02/2019      | E0081        | 4206     | Amount    | 75.00 | 35.00 |
#      | SUP-00000000000710 | Canada  | 2/9/2019 | 054266270 | SRPTMG     | 10/04/2019    | 10/08/2019  | Unpaid Medical Leave | Temparary      |        | TestVinay TestFolas | Discipline Notice | Verbal Warning              | 01/02/2019        | 01/02/2019      | E0081        | 4206     | Amount    | 75.00 | 35.00 |


#Zephyr ID: THD-23752
  @automation_E2E_T005
  Scenario Outline: E2E_T005_Verify  Contingent worker can be changed to Regular Associate
#    ### Note: Create prehire, position for CCW : apply long leave for emp
#    ## Rehire should be done by BP Admin here, chk HirefromREquisition() bfr running script

    When Proxy as BP Admin
    Then Hire Contract Contingent worker <SUPORG> and <Employee> and <Position> and <WorkerType> and <JobProfile_CCW> and <TimeType> and <UserName> and <NewPwd> and <VerifyNewPwd>
    Then Step One Completed
    Then Enter Absence for Contingent Worker <Employee>
    And Step Two Completed
    Then End Contract for a Contingent Worker <Employee> and <ContractEndDate> and <Reason_EndContract> and <LastDayOfWork>
    And Step Three Completed
    And Re-Hire associate with job requisition <Employee> and <SUPORG> and <Country> and <ReHire_date> and <SSNNumber> and <ReHire_JobProfile>
    And Step Four Completed
    When Proxy as Absence_Admin_Canada
    Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <AbsenceType> and <Country>
    And Step Five Completed

    Examples: Worker Details
      | SUPORG             | Employee    | Position            | WorkerType | JobProfile_CCW | TimeType  | UserName | NewPwd   | VerifyNewPwd | ContractEndDate | Reason_EndContract | LastDayOfWork | Country | ReHire_date | SSNNumber | ReHire_JobProfile | FromDateRange | ToDateRange | AbsenceType           |
      | SUP-00000000000710 | Neeraj Habi | NEW test data CCW-1 | Vendor     | QA ASSOC       | Full Time | First27  | WDtry@03 | WDtry@03     | 10/04/2019      | No Show            | 10/04/2019    | Canada  | 10/08/2019  | 054266270 | SAIII             | 12/08/2019    |  12/18/2019 |  Unpaid Medical Leave |


#Zephyr ID: THD-23753
  @automation_E2E_T004
  Scenario Outline: E2E_T004_Verify compensation and pay group is changed for hired associate

    When Proxy as BP Admin
    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    And Step One Completed
    When Proxy as BP Admin
    Then Request Compensation of an employee <Reason> and <Employee> and <EffectiveDate> and <Salary>
    And Step Two Completed
    Then Proxy as PayRoll Admin
    Then Assign pay group for an associate <Employee> and <PayGrp_Eff_Date> and <AssignPayGroup>
    When Proxy as BP Admin
    Then View Associate Details <Employee>


    Examples: Compensation Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Reason            | Employee         | EffectiveDate | Grade          | proxyname  | CompensationPlan | Salary | PayGrp_Eff_Date | AssignPayGroup                         |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     | Market Adjustment | TestKhim TestPen | 11/02/2019    | CA Salaried F1 | EVAN SCOTT | Salary Plan      | 85000     | 12/12/2019      | Canada Bi-weekly Salaried Paid Current |
#      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     | Market Adjustment | TestKhim TestPen | 11/02/2019    | CA Salaried F1 | EVAN SCOTT | Salary Plan      | 16     | 12/12/2019      | Canada Bi-weekly Hourly |


# Zephyr THD-8656
  @Synthetic_automation_E2E_T378
  Scenario Outline: E2E_T378_Update job and compensation via job change for an associate on a leave of absence- Initiate after Cycle 1 is complete
#     ### Note Associate PayType: Salaried, Leave type: Personal Leave


#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the Scenario ....
    When Proxy as Absence_Admin_Canada
    Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type> and <Country>
    And Step One Completed
    When Proxy as BP Admin
    Then Perform Jobchange to change Compensation <Employee> and <EffectiveDate> and <Salary>
    Then Request Compensation of an employee <Reason> and <Employee> and <EffectiveDate> and <ChangeSalary>
    And Step Two Completed
    Then Proxy as PayRoll Admin
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Review PaySlip

#    And Extract Workday Payroll GL File and send to Mercator
#    And Mercator processes the Workday file and generates SAP IDOCS
#    And YG Financial posting is posted as expected
#    And Step Four Completed

    Examples: Worker Details
      | Emp_ID    | Employee          | FromDateRange | ToDateRange | Type           | Salary | ChangeSalary | EffectiveDate | Reason            | PayComponent | Batch_ID | InputType | Hours | Value |
      | 200001537 | TestChoi TestPhen | 12/08/2019    | 12/22/2019  | Personal Leave | 86000  | 90000        | 12/13/2019    | Market Adjustment | E0081        | 4206     | Amount    | 75.00 | 35.00 |


#Zephyr ID: THD-9498
  #@stoprecording
  @Synthetic_automation_E2E_T1038
  Scenario Outline: E2E_T1038_Update manager/sup org, job, department, pay rate type, time type and compensation via job change while associate is on leave using current date
#     ### Note:  Hire with work address as Ontario location

#    When Proxy as BP Admin
#    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the Scenario ....

    When Proxy as Absence_Admin_Canada
    Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type> and <Country>
    And Step One Completed
    When Proxy as BP Admin
    Then Perform Job change for an associate <Employee> and <JC_SUPORG> and <Location> and <UPosition> and <JC_JobProfile> and <EmpType> and <Salary> and <CostCenter> and <jobchangedate>
    And Step Two Completed
    Then Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
    And Review PaySlip
    And Step Three Completed

    And Extract Workday Payroll GL File and send to Mercator
    And Mercator processes the Workday file and generates SAP IDOCS
    And YG Financial posting is posted as expected
    And Step Four Completed

#    Reverting the above functionality/transactions
#    And Stop Proxy
#    When Proxy as BP Admin
#    Then Rescind Absence Request of <Employee>
#    Then Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | SUPORG             | Country                  | Hiredate   | SSNNumber | JobProfile | Employee              | FromDateRange | ToDateRange | Type                 | jobchangedate | JC_SUPORG          | JC_JobProfile | EmpType           | Salary | Location | UPosition           | CostCenter | Company                      | TimeType  | WorkHours | AsOfDate   | TerminationType | Primary_Reason | Eligible_ReHire | SearchWith          | localReason | Termdate   | Emp_ID    | PayComponent | Batch_ID | InputType          | Value | PeriodStartDate | PeriodEndDate | Hours |
      | SUP-00000000009400 | United States Of America | 01/08/2019 | 054266277 | SAIII      | TestMaisha TestKeegan | 12/08/2019    | 12/18/2019  | Unpaid Medical Leave | 12/15/2019    | SUP-00000000000809 | SRPTMG        | Regular Associate | 85000  | 7152     | NEW test data CAN-1 | 17152000   | 1001 HOME DEPOT U.S.A., INC. | Full Time | 20        | 08/28/2019 | Involuntary     | CONDUCT/POLICY | Yes             | Terminate Associate | Other       | 09/17/2019 | 715000155 | E0081        | 4206     | Hours (unprorated) | 35.00 | 01/27/2019      | 02/09/2019    | 80    |
      #| SUP-00000000000710 | Canada  | 01/08/2019 | 054266277 | SRPTMG        | Hello Bye | 09/14/2019    | 09/28/2019  | Discretionary Leave | 10/07/2019 | Involuntary     | CONDUCT/POLICY | Yes             | Terminate Associate | Other       | 10/02/2019 | 715000155 | E0081        | 4206     | Hours (unprorated) | 35.00 | 01/27/2019      | 02/09/2019    | 80    |


#Zephyr ID: THD-8610 | Category- 2
#  @stoprecording
  @Synthetic_automation_E2E_T291
  Scenario Outline: E2E_T291_Rehire CN (Prior US associate) - Initiate after Cycle 1 is complete after 11/21
    ## Note: Employee Type:  Salaried;  Hire in US, term then Rehire in Canada, always change manager name in HirefromRequisition()


#    When Proxy as BP Admin
#    And Hire US associate with job requisition <HireSUPORG_US> and <Country_US> and <Hiredate> and <SSNNumber> and <HireJobProfile_US>
#    When Proxy as BP Admin
#    Then Terminating the Employees <Employee> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
#    And Step One Completed
    And Proxy as Manager_7052
    And Re-Hire associate to different Company with job requisition <Employee> and <ReHire_SUPORG> and <RehireCountry> and <ReHire_date> and <SINNumber> and <ReHire_JobProfile>
    And Step Two Completed
    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <RehireCountry>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent> and <RehireCountry>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <RehireCountry>
#    And Review PaySlip
#    And Step Three Completed
#    Then Proxy as <Employee>
#    Then Verify Performance tab and career tab <Employee> and <DevelopmentItem> and <Status> and <CareerPreferences> and <JobProfiles> and <WorkExperience> and <Company_JobHistory> and <Award_Type> and <Certifications>
#    Then Start Disciplinary Action <Employee> and <Template> and <ReasonsSDA> and <StartDateSDA> and <EndDateSDA>
#    And Step Four Completed
#    Then Proxy as <Employee>
#    Then Employee verifies access in Comp tabs <Employee>
#    And Step Five Completed
#    When Proxy as BP Admin
#    Then Perform Merit Review <Employee>
#    And Step Six Completed
#    And Extract Workday Payroll GL File and send to Mercator
#    And Mercator processes the Workday file and generates SAP IDOCS
#    And YG Financial posting is posted as expected
#    And Step Seven Completed


#

    Examples: Worker Details
      | Employee           | HireSUPORG_US      | Country_US               | RehireCountry | Hiredate   | SSNNumber | SINNumber | HireJobProfile_US    | Termdate   | TerminationType | Primary_Reason   | Eligible_ReHire | SearchWith          | localReason | ReHire_SUPORG      | ReHire_date | ReHire_JobProfile | DevelopmentItem | Status   | CareerPreferences        | JobProfiles | WorkExperience       | Company_JobHistory | Award_Type      | Certifications | Template          | ReasonsSDA     | StartDateSDA | EndDateSDA | Emp_ID     | PayComponent | Batch_ID | InputType | Value | Hours |
      | TestRichy TestElit | SUP-00000000009400 | United States of America | Canada        | 01/02/2019 | 054266270 | 986347607 | SASM - SPECIALTY ASM | 07/26/2019 | Voluntary       | PERSONAL REASONS | Yes             | Terminate Associate | Other       | SUP-00000000000710 | 01/02/2020  | SRPTMG            | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Discipline Notice | Verbal Warning | 01/02/2019   | 01/02/2019 | 2000008879 | E0081        | 4206     | Amount    | 75.00 | 35.00 |



#----------------------------------------------------------------------------------------------------------------------------

  #Creating Job requisition
  @CreateJobRequisition
  Scenario Outline: Job Requisition
    When Proxy as BP Admin
    Then Creating Job requisition <SUPORG> and <Position> and <WorkerType> and <Reason> and <WorkerSubType> and <JobProfile> and <Company> and <CostCenter> and <PrimaryLocation>

    Examples: Worker Details
      | SUPORG             | Position                | WorkerType | Reason       | WorkerSubType     | WorkerTimetype | JobProfile | Company    | CostCenter | PrimaryLocation |
      | SUP-00000000000710 | STAFF SOFTWARE ENGINEER | Associate  | Add to Staff | Regular Associate | Full time      | SRPTMG     | HOME DEPOT | 17052000   | 7052            |



  @Synthetic_TestdatGenerator
  Scenario Outline: Hire Test data generator

    When Proxy as BP Admin
    And Hire Test data Generator <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     |


  @Test_Data_Generator
  Scenario Outline: Test_Data_Generator with job requisition
    When Proxy as BP Admin
    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile |
      | SUP-00000000000710 | Canada  | 01/24/2019 | 054266270 | SRPTMG     |
