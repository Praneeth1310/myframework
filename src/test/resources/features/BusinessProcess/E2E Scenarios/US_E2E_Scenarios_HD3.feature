@E2EDemo
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday hd3



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
#    Reverting the above functionality/transactions
#    When Proxy as BP Admin
#    Then Rescind Move Workers<EmployeeOne> and <EmployeeTwo> and <EmployeeThree> and <EffectiveDate_MoveWorkers>
#    Then Rescind Absence Request of <EmployeeOne>

    Examples: Worker Details
      | EmployeeOne   | EmployeeTwo          | EmployeeThree        | Country | EffectiveDate_MoveWorkers | SupOrg             | PropSupOrg         | Company | CostCenter | FromDateRange | ToDateRange | Type                 | AsOfDate   |
      | Dein Arill    | TestBonnet TestHenry | TestBonnet TestSonal | Canada  |  12/25/2019                | SUP-00000000009400 | SUP-00000000007655 | 1001    | 19970001   | 12/20/2019    | 12/31/2019  | Medical Leave (Unpaid)  | 12/27/2019 |
#      | TestAmaravat TestKameroon | TestChoi TestPhen | TestKhim TestPen | 10/13/2019                | SUP-00000000000710 | SUP-00000000000809 | 1019    | 7152       | 09/06/2019    | 09/30/2019  | Unpaid Medical Leave | 09/30/2019 |


  #Zephyr ID: THD-8570 | Category- 3
  @automation_E2E_T265
  Scenario Outline: E2E_T265_Name Change

    When Proxy as BP Admin
#    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
   #Begining of the Scenario ....

    Then Legal name Change <Employee> and <EffectiveDate_Legalname> and <Country> and <FirstnameLegal> and <LastnameLegal>
    And Step One Completed

#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    And Step Two Completed

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Employee      | EffectiveDate_Legalname | PayComponent | Batch_ID | InputType | Hours | Value | FirstnameLegal | LastnameLegal |
      | SUP-00000000009400 | United States Of America  | 01/08/2019 | 054266270 | SRPTMG     | Dein Arill | 12/23/2019              | E0081        | 4206     | Amount    | 75.00 | 35.00 | Limoey         | Pherl         |


# Zephyr ID: THD-8596
  @automation_E2E_T210
  Scenario Outline: E2E_T210_Contingent workers - Hired in Current Pay Period - Initiate after Cycle 1 is complete after 11/21

#    When Proxy as BP Admin
#    Then Create Contract Contingent worker <Organization> and <EmployeePreHire> and <Position> and <WorkerType> and <JobProfile> and <TimeType> and <UserName> and <NewPwd> and <VerifyNewPwd>
#    Then Step One Completed

#    Then Proxy as Talent Admin
#    Then Launch Salaried Review Cycle
#    Then Verify that  cycle is Open
#    And Step Two Completed

    #  Should not be able to perform  any activity
    When Proxy as Manager_0914
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
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    And Step Six Completed

    When Proxy as BP Admin
    Then Enter Absence for Contingent Worker <EmployeePreHire>
    And Step Seven Completed

    Examples: Worker Details
      | Organization       | EmployeePreHire | Position                  | Proxyname      | WorkerType | JobProfile | TimeType  | UserName | NewPwd   | VerifyNewPwd |
      | SUP-00000000009400 | Beon Hill | Test1204 | Hongming Zhang | Vendor     | QA ASSOC   | Full Time | First27  | WDtry@03 | WDtry@03     |



#Completed
 # Zephyr THD-8594
# @stoprecording
  @Synthetic_automation_E2E_T171
  Scenario Outline: E2E_T171_Update effective date for a Change job

   ##Begining of the scenario
#    When Proxy as BP Admin
#    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the scenario
#    When Proxy as BP Admin
    Then Perform Jobchange to change Jobprofile of an employee <Employee> and <JobProfile_JC> and <Amount> and <EffectiveDate>
#    And Stop Proxy
#    And Step One Completed
    When Proxy as BP Admin
#    Then Correct Effective date of Job change process <Employee> and <EffectiveDate> and <CorrectEffectiveDate>
#    And Step Two Completed
    Then Perform Merit Review <Employee>
    And Step Three Completed
    #Reverting the above functionality/transactions
    #And Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | SUPORG             | Country                   | Hiredate   | SSNNumber | Employee               | JobProfile               | Amount | EffectiveDate | CorrectEffectiveDate | JobProfile_JC |
      | SUP-00000000009400 | United States Of America  | 01/08/2019 | 054266282 | TestRoslin TestLiril | SASM - SPECIALTY ASM     | 88000  | 01/05/2020    | 01/08/2020           | STRMGR        |



    #Zephyr ID: THD-8654
  @Synthetic_automation_E2E_T329
  Scenario Outline: E2E_T329_C2C Transfer within country different province (sent by current manager)

    When Proxy as BP Admin
#    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    ##Begining of the Scenario ....

    #    Following step is done through the manager proxy, code for the proxy is inside the method
    Then Perform Jobchange to change Organisation <Employee> and <JC_SUPORG> and <Location> and <jobchangedate> and <Country>
    And Step Two Completed

#    Then Proxy as PayRoll Admin
#    Then Review tax elections
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    And Review PaySlip
#    And Step Three Completed

#    #reverting transactions
#    Then  Delete Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    And Proxy as BP Admin
#    And Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | Employee             | SUPORG             | UPosition      | UJobProfile | jobchangedate | Location | EmpType           | TimeType  | USalary | CostCenter | JC_SUPORG          | Company | GoalName     | Category               | Status   | EditGoal                    | Emp_ID    | EmployeeN  | Position             | Reason   | SSNNumber | Country                   | JobProfile | Hiredate   |
      | TestRoslin TestLiril | SUP-00000000009400 | Workday Tester | SRPTMG      | 01/05/2020    | 0114     | Regular Associate | Full Time | 95000   | 17152000   | SUP-00000000007655 | 1019    | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 | 200000639 | TestQueeen | NEW Test Position_10 | New Hire | 054124085 | United States Of America  | SRPTMG     | 01/08/2019 |



 #Completed
  #Zephyr ID: THD-8609 | Category- 2
  @Synthetic_automation_E2E_TS262
  Scenario Outline: E2E_T262_Delete New Hire

#    When Proxy as BP Admin
#    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
#    And Step One Completed
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
      | TestBonnet TestSonal | SUP-00000000009400 | United States Of America  | 2/9/2019 | 054266270 | SASM - SPECIALTY ASM     |
   #   | TestDiaya TestFreiya | 01/02/2019 | 054124594 | SUP-00000000000710 | Canada  | SRPTMG     |


#Completed
  #Zephyr ID: THD-8566 | Category- 1
  @Synthetic_automation_E2E_T213
  Scenario Outline: E2E_T213_Confirm being on leave doesn't trigger someone to come off succession plan

#    When Proxy as Absence Admin
#    Then Requesting Absence<EmployeeOne> and <FromDateRange> and <ToDateRange> and <Type> and <country>
#    And Step One Completed
    When Proxy as Talent Admin
    Then Create Succession Plan<Leader> and <EmployeeOne> and <EmployeeTwo> and <Readiness>
#    And Step Two Completed
#    Then Manage Succession Plan <Leader> and <EmployeeOne>
#    And Step Three Completed
#    And Proxy as BP Admin
#    Then Perform Merit Review <EmployeeOne>
#    And Step Four Completed

    Examples: Worker Details
      | Leader                   | EmployeeOne           | EmployeeTwo             | Readiness | FromDateRange | ToDateRange | Type                 |
     # | TestFrida TestKofi | TestXaio TestWallace | TestMaisha TestKeegan | Ready Now | 06/04/2019    | 06/30/2019  | Unpaid Medical Leave |
      #| Annaisha xia | Akane Xia | Kimi Shim | Ready Now | 09/02/2019    | 09/13/2019  | Unpaid Medical Leave |
      | TestCherill TestBlomoe | TestChandh TestSruthi | TestChinson TestKameroon  | Ready Now | 12/23/2019    | 12/31/2019  | Unpaid Medical Leave |


    #Zephyr ID: THD-8589
  @automation_E2E_T60
  Scenario Outline: E2E_T60_Update home address in Canada - historical date(Salaried)

#    When Proxy as BP Admin
#    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
#    Begining of the Scenario ....

#    When Proxy as BP Admin
#    Then Home Contact Change <Emp_ID> and <Employee> and <Address1> and <Postal> and <City> and <StateOrProvince> and <Usage> and <effectivedate> and <MobileOnbard>
#    And Step One Completed

#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    And Step Two Completed

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
      | SUPORG             | Country                  | Hiredate   | SSNNumber | JobProfile | Emp_ID    | Employee          | Address1        | Postal  | City     | StateOrProvince | Usage                    | effectivedate | MobileOnbard | PayComponent | Batch_ID | InputType | Hours | Value |
      | SUP-00000000009400 | United States Of America | 01/08/2019 | 054266270 | SRPTMG     | 200003371 | TestDrid TestZinp | 404 CRES STREET | H3Z 2Y7 | Columbus | Ohio            | Permanent Street Address | 12/01/2019    | 9545452368   | E0081        | 4206     | Amount    | 75.00 | 35.00 |


#Zephyr ID: THD-14598
  #@stoprecording
  @Synthetic_automation_E2E_T1038
  Scenario Outline: E2E_T1038_Update manager/sup org, job, department, pay rate type, time type and compensation via job change while associate is on leave using current date

#    When Proxy as BP Admin
#    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>    When Proxy as BP Admin
    #Begining of the Scenario ....
    When Proxy as Absence Admin
    Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type> and <Country>
    And Step One Completed

    When Proxy as BP Admin
    Then Perform Job change for an associate <Employee> and <JC_SUPORG> and <Location> and <UPosition> and <JC_JobProfile> and <EmpType> and <Salary> and <CostCenter> and <jobchangedate>
    And Step Two Completed

#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    And Review PaySlip
#    And Step Three Completed

#    And Extract Workday Payroll GL File and send to Mercator
#    And Mercator processes the Workday file and generates SAP IDOCS
#    And YG Financial posting is posted as expected
#    And Step Four Completed

#    Reverting the above functionality/transactions
#    And Stop Proxy
#    When Proxy as BP Admin
#    Then Rescind Absence Request of <Employee>
#    Then Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | SUPORG             | Country                   | Hiredate   | SSNNumber | JobProfile | Employee   | FromDateRange | ToDateRange | Type                  | jobchangedate | JC_SUPORG           | JC_JobProfile        | EmpType           | Salary  | Location  | UPosition       | CostCenter                    | Company                      | TimeType  | WorkHours | AsOfDate   | TerminationType | Primary_Reason | Eligible_ReHire | SearchWith          | localReason | Termdate   | Emp_ID    | PayComponent | Batch_ID | InputType          | Value | PeriodStartDate | PeriodEndDate | Hours |
      | SUP-00000000009400 | United States Of America  | 01/08/2019 | 054266277 | SAIII      | TestCarrie TestFilan | 01/01/2019    | 12/28/2019  | Medical Leave(UnPaid) | 12/15/2019    | SUP-00000000009400  | SASM - SPECIALTY ASM | Regular Associate | 50000   | 0914      | Test1219-2  | 19615000 G&A-ISS TEAM - #0051 | 1001 HOME DEPOT U.S.A., INC. | Full Time | 20        |08/28/2019 | Involuntary     | CONDUCT/POLICY | Yes             | Terminate Associate | Other       | 09/17/2019 | 715000155 | E0081        | 4206     | Hours (unprorated) | 35.00 | 01/27/2019      | 02/09/2019    | 80    |
      #| SUP-00000000000710 | Canada  | 01/08/2019 | 054266277 | SRPTMG        | Hello Bye | 09/14/2019    | 09/28/2019  | Discretionary Leave | 10/07/2019 | Involuntary     | CONDUCT/POLICY | Yes             | Terminate Associate | Other       | 10/02/2019 | 715000155 | E0081        | 4206     | Hours (unprorated) | 35.00 | 01/27/2019      | 02/09/2019    | 80    |



# Zephyr THD-14738
  @Synthetic_automation_E2E_T378
  Scenario Outline: E2E_T378_Update job and compensation via job change for an associate on a leave of absence- Initiate after Cycle 1 is complete

#    When Proxy as BP Admin
#    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>    When Proxy as BP Admin
    #Begining of the Scenario ....

#    When Proxy as Absence Admin
#    Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type> and <country>
#    And Step One Completed
    When Proxy as BP Admin
    Then Perform Jobchange to change Compensation <Employee> and <EffectiveDate> and <Salary>
    When Request Compensation of an employee <Reason> and <Employee> and <ChangeSalary> and <EffectiveDate>
    And Step Two Completed

#    Then Proxy as PayRoll Admin
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    And Review PaySlip

#    And Extract Workday Payroll GL File and send to Mercator
#    And Mercator processes the Workday file and generates SAP IDOCS
#    And YG Financial posting is posted as expected
#    And Step Four Completed

#    Reverting the above functionality/transactions
#    And Stop Proxy
#    When Proxy as BP Admin
#    Then Rescind Absence Request of <Employee>
#    Then Rescind the job transfer for the employee <Employee>


    Examples: Worker Details
      | Employee          | Emp_ID   | FromDateRange | ToDateRange | Type                 | Salary | ChangeSalary | EffectiveDate | Reason            | Batch_ID | PayComponent  |  SUPORG             | Country                   | Hiredate   | SSNNumber | JobProfile |
      | TestDrid TestZinp | 20000156 | 01/01/2020    | 01/10/2020  | Medical Leave (Paid) | 88000  | 91000        | 01/04/2020    | Market Adjustment | 4206     | E8004         |  SUP-00000000009400 | United States Of America  | 01/08/2019 | 054266277 | SAIII      |


# Zephyr THD-14622
  @Synthetic_automation_E2E_T252
  Scenario Outline: E2E_T252_Work Location Change for Executive/ Officer, SSC to Virtual - difference state - Initiate after Cycle 1 is complete

#    When Proxy as BP Admin
#    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the Scenario ....

    When Proxy as BP Admin
    Then Perform Jobchange to change Work Location <Employee> and <EffectiveDate> and <Location>
    And Step Two Completed

#    Then Proxy as PayRoll Admin
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    And Review PaySlip

#    And Extract Workday Payroll GL File and send to Mercator
#    And Mercator processes the Workday file and generates SAP IDOCS
#    And YG Financial posting is posted as expected
#    And Step Four Completed

#    Reverting the above functionality/transactions
#    And Stop Proxy
#    When Proxy as BP Admin
#    Then Rescind Absence Request of <Employee>
#    Then Rescind the job transfer for the employee <Employee>


    Examples: Worker Details
      | Employee          | Emp_ID   | Location                     | ToDateRange | Type                 | Salary | ChangeSalary | EffectiveDate | Reason            | Batch_ID | PayComponent  |  SUPORG             | Country                   | Hiredate   | SSNNumber | JobProfile |
      | Dein Arill | 20000156 | NEW JERSEY - VIRTUAL - NJ01  | 12/22/2019  | Medical Leave (Paid) | 86000  | 90000        | 12/24/2019    | Market Adjustment | 4206     | E8004         |  SUP-00000000009400 | United States Of America  | 01/08/2019 | 054266277 | SAIII      |


# Zephyr THD-14620
  @Synthetic_automation_E2E_T245
  Scenario Outline: E2E_T245_Term- Voluntary - Salaried - Initiate after Cycle 1 is complete

#*************************Take an associate who is already having Disciplinary Actions*******
  #    When Proxy as BP Admin
    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
#    Then Start Disciplinary Action <Employee> and <Review_Template> and <Disciplinary_Action_Reasons> and <Period_Start_Date> and <Period_End_Date>
    #Begining of the scenario
    When Proxy as BP Admin
    Then Terminating the Employees <Employee> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
    And Step One Completed
#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
    And Step Two Completed
#    And Review PaySlip
#    And Extract Workday Payroll GL File and send to Mercator
#    And Mercator processes the Workday file and generates SAP IDOCS
#    And YG Financial posting is posted as expected
    And Step Three Completed
    When Proxy as HR_Partner_0914
    And Review Disciplinary action in associate history by category <Employee>
    And Step Four Completed

    Examples: Worker Details
      | SUPORG             | Emp_ID     | Country                   | Hiredate   | SSNNumber | JobProfile | Employee              | Review_Template   | Disciplinary_Action_Reasons | Period_Start_Date | Period_End_Date | TerminationType | Primary_Reason   | Eligible_ReHire | SearchWith           | localReason | Termdate    | PayComponent | Batch_ID  | InputType | Hours | Value |
      | SUP-00000000010751 | 200003144  | United States Of America  | 01/08/2019 | 054266277 | SAIII      | TestDrid TestLorin | Background Checks | Coaching                    | 12/22/2019        | 12/26/2019      | Voluntary       | PERSONAL REASONS | Yes             | Terminate Associate  | Other       | 01/04/2020  | E0081        | 4206      | Amount    | 75.00 | 35.00 |


   # Zephyr THD-14625
  @Synthetic_automation_E2E_T258
  Scenario Outline: E2E_T258_Change Termination Date Prior Pay Cycle - Initiate after Cycle 1 is complete

#    When Proxy as BP Admin
#    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
#    When Proxy as BP Admin
#    Then Terminating the Employees <Employee> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
    #Begining of the scenario

    When Proxy as BP Admin
    Then Change the Termination Date for an associate <Employee> and <ChangVoluntary_Reasn> and <ChangeTermDate>
    And Step One Completed

#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    And Step Two Completed

#    And Review PaySlip
#    And Extract Workday Payroll GL File and send to Mercator
#    And Mercator processes the Workday file and generates SAP IDOCS
#    And YG Financial posting is posted as expected
#    And Step Three Completed
#    When Proxy as HR Partner 0914
#    And View associate history by category <Employee>

##    Reverting the above functionality/transactions
#    When Proxy as BP Admin
#    Then Rescind Termination of <Employee>

    Examples: Worker Details
      | Employee               | ChangVoluntary_Reasn  | ChangeTermDate  | SUPORG             | Country                   | Hiredate   | SSNNumber | JobProfile | TerminationType | Primary_Reason | Eligible_ReHire | SearchWith          | localReason | Termdate  |
      | TestCandice TestHenry  | PERSONAL REASONS      | 12/27/2019      | SUP-00000000009400 | United States Of America  | 01/08/2019 | 054266277 | SAIII      |  Involuntary    | CONDUCT/POLICY | Yes             | Terminate Associate | Other       | 12/20/2019 |




#******************************************In Progress**********************************************

#Zephyr THD-8593
  @automation_E2E_T170
  Scenario Outline: E2E_T170_E2E_T34_Process a rehire for an associate who was terminated on leave - Initiate after Cycle 1 is complete after 11/21

#    When Proxy as Absence_Admin_Canada
#    Then Requesting Absence<Employee> and <FromDate> and <ToDate> and <Type> and <country>
#    Then View Leave Of Absence <Employee> and <AsOfDate> and <Type>
#    And Step One Completed
    When Proxy as BP Admin
    Then Terminating the Employees <Employee> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
    And Create position in the organization <SUPORG> and <Location> and <JobFamily> and <JobProfile> and <TimeType> and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>
    And ReHire - ReHire Associate <Employee> and <SUPORG> and <RehireReason> and <Position> and <RWorkerType> and <JobProfile> and <TimeType> and <Location> and <PayRateType>
    And Step Two Completed
#    Then Perform Merit Review <Employee>
#    And Step Three Completed

    Examples: Worker Details
      | Employee                 | AvailabilityDate | EarliestHireDate | FromDate   | ToDate     | Type                 | AsOfDate   | SearchWith          | Primary_Reason   | TerminationType | Eligible_ReHire | localReason | SUPORG             | Position      | Location | JobFamily  | JobProfile           | WorkerType | TimeType  | Reason       | PrimaryLocation | WorkerSubType     | Company                      | CostCenter | RehireReason | PayRateType | BusinessUnit      | Department | RWorkerType       | Termdate   |
      | TestBonnet TestGeorge | 12/19/2018       | 12/20/2018       | 11/25/2019 | 12/10/2019 | Unpaid Medical Leave | 12/04/2019 | Terminate Associate | PERSONAL REASONS | Voluntary       | Yes             | Other       | SUP-00000000009400 | WD DATA 106-6 | 0914     | Home Depot | SASM - SPECIALTY ASM | Associate  | Full time | Add to Staff | 7052            | Regular Associate | 1019 HOME DEPOT CANADA, INC. | 17152000   | Rehire       | Salary      | Canada Associates | 24 PAINT   | Regular Associate | 11/10/2019 |


 #  Zephyr ID: THD-8569
  @automation_E2E_T259
  Scenario Outline: E2E_T259_Hire Date Change - Future Date

#    When Proxy as BP Admin
    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>#  Begining of the Scenario ....
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
      | Employee               | ChangeHiredate | Country | Hiredate   | SSNNumber | AvailabilityDate | EarliestHireDate | SearchWith          | Primary_Reason   | TerminationType | Eligible_ReHire | localReason | SUPORG             | Position      | Location | JobFamily  | JobProfile | WorkerType | TimeType  | Reason       | PrimaryLocation | WorkerSubType     | Company                      | CostCenter | RehireReason | PayRateType | BusinessUnit      | Department | RWorkerType       | Termdate   |
      | TestPadur TestSiruseri | 11/21/2019     | United States Of America  | 01/24/2019 | 054266270 | 12/19/2018       | 12/20/2018       | Terminate Associate | PERSONAL REASONS | Voluntary       | Yes             | Other       | SUP-00000000009400 | WD DATA 104-1 | 7052     | Home Depot | SRPTMG     | Associate  | Full time | Add to Staff | 7052            | Regular Associate | 1019 HOME DEPOT CANADA, INC. | 17152000   | Rehire       | Salary      | Canada Associates | 24 PAINT   | Regular Associate | 05/10/2019 |


 #Zephyr ID: THD-8611 | Category- 2
  @stoprecording
  @Synthetic_automation_E2E_T294
  Scenario Outline: E2E_T294_Rehire into a different province CN
    ## Note: Employee Type:  Hourly; Ensure PROVINCE changes from province when terminated
    #Code is like hire in 7052 and term; then rehire into 7152

    When Proxy as BP Admin
    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    When Proxy as BP Admin
    Then Terminating the Employees <Employee> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
    And Step One Completed
    And Proxy as Manager
    And Re-Hire associate with job requisition <Employee> and <ReHire_SUPORG> and <Country> and <ReHire_date> and <SSNNumber> and <ReHire_JobProfile>
    And Step Two Completed
#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    And Review PaySlip
#    And Step Three Completed
#    Then Proxy as <Employee>
    Then Verify Performance tab and career tab <Employee> and <DevelopmentItem> and <Status> and <CareerPreferences> and <JobProfiles> and <WorkExperience> and <Company_JobHistory> and <Award_Type> and <Certifications>
    Then Start Disciplinary Action <Employee> and <Template> and <ReasonsSDA> and <StartDateSDA> and <EndDateSDA>
    And Step Four Completed

    Examples: Worker Details
      | Employee           | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile | Termdate   | TerminationType | Primary_Reason   | Eligible_ReHire | SearchWith          | localReason | ReHire_SUPORG      | ReHire_date | ReHire_JobProfile | Position            | Location | JobFamily             | WorkerType | TimeType  | AvailabilityDate | EarliestHireDate | Reason       | PrimaryLocation | WorkerSubType     | Company                      | CostCenter | RehireReason | PayRateType | BusinessUnit      | Department | RWorkerType       | DevelopmentItem | Status   | CareerPreferences        | JobProfiles | WorkExperience       | Company_JobHistory | Award_Type      | Certifications | Template          | ReasonsSDA     | StartDateSDA | EndDateSDA | Emp_ID     | PayComponent | Batch_ID | InputType | Value | Hours |
      | TestBella TestHari | SUP-00000000009400 | United States Of America  | 01/02/2019 | 054266270 | SAIII      | 07/26/2019 | Voluntary       | PERSONAL REASONS | Yes             | Terminate Associate | Other       | SUP-00000000000809 | 11/02/2019  | SAIII             | WD TEST DATA CAN-01 | 7152     | Home Depot Foundation | Associate  | Full time | 12/02/2019       | 12/03/2019       | Add to Staff | 7152            | Regular Associate | 1019 HOME DEPOT CANADA, INC. | 17152000   | Rehire       | Hourly      | Canada Associates | 24 PAINT   | Regular Associate | Testing         | Complete | Grow Develop Within Role | HQATEC      | Business Development | Aarons             | External Awards | CITP           | Discipline Notice | Verbal Warning | 01/02/2019   | 01/02/2019 | 2000008879 | E0081        | 4206     | Amount    | 75.00 | 35.00 |


#Zephyr ID: THD-8563 | Category- 2
  #@stoprecording
  @Synthetic_automation_E2E_T169
  Scenario Outline: E2E_T169_Process a term for an associate on leave - Hourly

#    When Proxy as BP Admin
#    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
    #Begining of the Scenario ....
    When Proxy as Absence Admin
    Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type> and <Country>
    Then Proxy as Manager_7052
    Then View Leave Of Absence <Employee> and <AsOfDate> and <Type>
    And Step One Completed

    When Proxy as BP Admin
    Then Terminating the Employees <Employee> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <Termdate>
    And Step Two Completed

#    Then Proxy as PayRoll Admin
#    Then Add Earnings and Deductions <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employee> and <PayComponent> and <Batch_ID> and <InputType> and <Value> and <Country>
#    And Step Three Completed

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
      | SUP-00000000009400 | United States Of America  | 01/08/2019 | 054266277 | CASHR - CASHIER      | TestBonnet TestSonal | 12/25/2019    | 01/05/2020  | Personal Leave | 12/27/2019 | Involuntary     | CONDUCT/POLICY | Yes             | Terminate Associate | Other       | 12/25/2019 | 715000155 | E0081        | 4206     | Hours (unprorated) | 35.00 | 01/27/2019      | 02/09/2019    | 80    |
      #| SUP-00000000000710 | Canada  | 01/08/2019 | 054266277 | SRPTMG        | Hello Bye | 09/14/2019    | 09/28/2019  | Discretionary Leave | 10/07/2019 | Involuntary     | CONDUCT/POLICY | Yes             | Terminate Associate | Other       | 10/02/2019 | 715000155 | E0081        | 4206     | Hours (unprorated) | 35.00 | 01/27/2019      | 02/09/2019    | 80    |



# Zephyr THD-
  @Synthetic_automation_E2E_TNew
  Scenario Outline: E2E_TNew_C2C transfer US to Canada (sent by current manager)- Initiate after Cycle 1 is complete after 11/21

#    When Proxy as BP Admin
#    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>
#    Then Check Start performance Review for employee <Employee>
#    Then Start Disciplinary Action <Employee> and <Template> and <ReasonsSDA> and <StartDateSDA> and <EndDateSDA>

    #Begining of the Scenario ....
#    And  Proxy as Manager_0914
#    When Proxy as BP Admin
#    Then Perform Job change for an associate <Employee> and <Pro_Suporg> and <Location> and <UPosition> and <JC_JobProfile> and <EmpType> and <Amount> and <CostCenter> and <jobchangedate>
#    And Step One Completed

    When Proxy as Talent Admin
    And Review Disciplinary action in associate history by category <Employee>
    And Step Two Completed

#    Then Proxy as PayRoll Admin
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employee> and <Batch_ID> and <PayComponent>
#    And Review PaySlip


    Examples: Worker and Comp details
      | Employee             | UPosition                  | jobchangedate | Location             | EmpType           | TimeType  | Amount | Proxyname       | CostCenter | JC_JobProfile | Pro_Suporg     | JobProfile | SUPORG             | Country | Hiredate   | SSNNumber |  Template          | ReasonsSDA     | StartDateSDA | EndDateSDA |
      | TestGersey TestQuesh | TEST_JOBCHANGE | 01/03/2020    | REGINA STORE - 7052 | Regular Associate | Full Time | 87000  | Anitha Alphonse | 17052000   | SRPTMG        | 7052 (DUSTINUPD GIBSONUPD)  | SRPTMG     | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 |  Background Checks | Coaching | 01/02/2019   | 01/02/2019 |





#----------------------------------------------------------------------------------------------------------------------------

  #Creating Job requisition
  @CreateJobRequisition
  Scenario Outline: Job Requisition
    When Proxy as BP Admin
    Then Creating Job requisition <SUPORG> and <Position> and <WorkerType> and <Reason> and <WorkerSubType> and <JobProfile> and <Company> and <CostCenter> and <PrimaryLocation>

    Examples: Worker Details
      | SUPORG             | Position                | WorkerType | Reason       | WorkerSubType     | WorkerTimetype | JobProfile                       | Company                             | CostCenter | PrimaryLocation |
      | SUP-00000000010751 | STAFF SOFTWARE ENGINEER | Associate  | Add to Staff | Regular Associate | Full time      | STFSWE - STAFF SOFTWARE ENGINEER | 1400 HOME DEPOT STORE SUPPORT, INC. | 17052000   | 9090            |


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
