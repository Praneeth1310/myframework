@web1
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday hd3

#    //Position--------------------------------------------------------------------------------

  @automation_TS5
  Scenario Outline: Create Position
    When Proxy as BP Admin
    Then Business Process: Create position in the organization <SUPORG> and <Location> and <JobFamily> and <JobProfile> and <TimeType> and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>

    Examples: Worker Details
      | SUPORG       | Location  | JobFamily | JobProfile  | TimeType  | WorkerType  | AvailabilityDate  | EarliestHireDate |
      | SUP-00000000009400 | 0914     | Home Depot | SASM - SPECIALTY ASM     | Full time  | Associate | 02/02/2019          | 02/03/2019       |


  @automation_TS5A
  Scenario Outline: Close Position
    When Proxy as BP Admin
   # Then Business Process: Create position in the organization <SUPORG> and <Location> and <JobFamily> and <JobProfile> and <TimeType> and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>
    Then Business Process: Closing a Position <Position>
#    And Logout from Application

    Examples: Worker Details
      | Proxyname       | Position                | SUPORG       | Location  | JobFamily | JobProfile  | TimeType  | WorkerType  | AvailabilityDate  | EarliestHireDate |
      | Anitha Alphonse | New WD Test analyst113615 | Mount Laurel | 7052     | Home Depot | SRPTMG     | Full time  | Associate | 02/02/1997          | 02/01/1997       |
# Systems Analyst-Test010 New WD Test analyst114943, New WD Test analyst125612, New WD Test analyst010244


#  //Job Requisition ------------------------------------------------------------------

  @automation_JobReq
  Scenario Outline: Job requisition
    Given Proxy as BP Admin
    Then Business Process: Creating Job requisition <SUPORG> and <WorkerType> and <Reason> and <WorkerSubType> and <JobProfile> and <Company> and <CostCenter> and <PrimaryLocation>

    Examples: Worker Details
      | SUPORG             | WorkerType | Reason       | WorkerSubType        | JobProfile   | Company    | CostCenter  | PrimaryLocation  |
      | SUP-00000000000809 | Employee   | Add to Staff | Regular Associate    | SRPTMG       | HOME DEPOT | 17152000    | 7152             |
#      | SUP-00000000009400 | Employee   | Add to Staff | Regular Associate    | SASM - SPECIALTY ASM       | HOME DEPOT | 10914000    | 0914             |


  @automation_Close_Job_Req
  Scenario Outline: Close Job requisition
    Given Proxy as BP Admin
    Then Business Process: Close Job requisition <JobRequisite> and <Reason>

    Examples: Worker Details
      | JobRequisite              | Reason           | Proxyname      |
      | New WD Test analyst065738 | No Longer Needed | Hongming zhang |


#  // Termination -------------------------------------------------------------

  @automation_TS11
  Scenario Outline: Automation Script - Terminate Employee
    Given Proxy as BP Admin
    Then Business Process: Terminating the Employees <Emp_name> and <Termination_Type> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason> and <TermDate>

    Examples: Worker Details
      | Emp_name            | Termination_Type | SearchWith          | Primary_Reason   | Eligible_ReHire | localReason | Proxyname       | TermDate   |
      | AHMED MUJTABA  | Voluntary        | Terminate Associate | PERSONAL REASONS | Yes             | Other       | Anitha Alphonse | 01/06/2020 |



#  // Personal Info Change --------------------------------------------------------

  @automation_TS2B
  Scenario Outline: Automation Script - Personal info change
    Given Proxy as TestPadur TestSiruseri
    Then Business Process: Change the personal information of the employee <Gender> and <DOB> and <Race>

    Examples: Worker Details
      | Gender | DOB        | Race                                              | Proxyname       |
      | Male   | 11/20/1992 | WEST ASIAN(E.G. AFGHAN, ETC | Anitha Alphonse |


  @automation_E2E_ESD
  Scenario Outline:  Automation Script - Edit Service Dates Of an Associate
    Given Proxy as BP Admin
    Then Business Process: Edit Service Dates of the associate to change the hire date <Employee> and <EditHireDate>

    Examples: Worker Details
      | Employee   | EditHireDate |
      | Dein Arill | 01/05/2019   |

  @automation_E2E_CPN
  Scenario Outline:  Automation Script - Change My Preferred Name
    When Proxy as BP Admin
    Then Business Process: Change Preferred Name of the associate <Employee> and <EffectiveDate_Preferredname> and <Country> and <PrefixPreferred> and <SuffixPreferred>

    Examples: Worker Details
      | Employee   | EffectiveDate_Preferredname | Country                  | PrefixPreferred | SuffixPreferred |
      | AHMED MUJTABA | 01/05/2020                  | Canada | Mr.             | IV              |

  @automation_E2E_CPV
  Scenario Outline:  Automation Script - Change passport and visa information
    When Proxy as BP Admin
    Then Change passport and visa information <Employee> and <Country> and <VisaIdType> and <VisaIdentification>

    Examples: Worker Details
      | Employee   | VisaIdType | Country                  | VisaIdentification |
      | Dein Arill | TPS | United States of America | Driving License   |

#    Systems Analyst-13


#  // Contract Contingent worker -----------------------------------------------------------------

  #Should change Employee_name, Position, Username_Inbox everytime
  @automation_CCW
  Scenario Outline: Automation Script - Contract Contingent worker
    When Proxy as BP Admin
    Then Business Process: Create a Contract Contingent worker<Organization> and <EmployeePreHire> and <Position> and <WorkerType> and <JobProfile> and <TimeType> and <UserName> and <NewPwd> and <VerifyNewPwd>

    Examples: Worker Details
      | Organization       | EmployeePreHire | Position                | Proxyname      | WorkerType | JobProfile | TimeType  | UserName | NewPwd   | VerifyNewPwd |
      | SUP-00000000000710 | Khim Jeonghan   | New test data CAN CCW-1 | Hongming Zhang | Vendor     | SRPTMG     | Full Time | First27  | WDtry@03 | WDtry@03     |


#  // Home Contact Change -----------------------------------------------------------------
    @automation_HCChange
    Scenario Outline: Automation Script - Home Contact Change

      When Proxy as BP Admin
      Then Home Contact Change <Emp_ID> and <Employee> and <Address1> and <Postal> and <City> and <Province> and <Usage> and <effectivedate> and <MobileOnbard>

      Examples: Worker Details
        | Emp_ID    | Employee             | Address1        | Postal  | City       | Province | Usage                    | effectivedate | MobileOnbard |
        | 200003153 | TestEleysha TestBahari | 404 CRES STREET | H3Z 2Y7 | CUMBERLAND | Ontario  | Permanent Street Address | 06/11/2019    | 9586452368   |

#  // Work Contact Change ------------------------------------------------------------------------------------------------
  @automation_WCChange
  Scenario Outline: Automation Script - Work Contact Change

    When Proxy as BP Admin
    Then Work Contact Change <EffectiveDate> and <Employee> and <Country> and <Address1> and <Postal> and <City> and <Province/State> and <State> and <PhoneNumber>

    Examples: Worker Details
      | Employee              | Country | EffectiveDate | Address1              | Postal  | City     | Province/State | State | PhoneNumber |
      | TestSun TestWed | Canada  | 01/12/2020    | 10-123 MAIN STREET NW | H3Z 2Y7 | MONTREAL | QC             |       | 9812357859  |


    #  // Emergency Contact Change ------------------------------------------------------------------------------------------------
  @automation_ECChange
  Scenario Outline: Automation Script - Emergency Contact Change

    When Proxy as BP Admin
    Then Change Emergency Contacts <Employee> and <Country> and <FirstName> and <LastName> and <Relationship> and <EmergencyPhoneNumber>

    Examples: Worker Details
      | Employee            | Country | FirstName | LastName | Relationship            | EmergencyPhoneNumber |
      | TestNirsha TestFolas | Canada  | William   | Mike     | Immediate Family Member | 8646238956           |

#  //Absence------------------------------------------------------------------------------

  @automation_AbsenceReturn
  Scenario Outline: Automation Script - Return worker from leave
#    When Proxy as Absence Admin
    #Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type>
    And Business Process: Return Worker from leave<Employee> and <Returndate> and <LastDayOfAbsence>

    Examples: Worker Details
      | Employee | FromDateRange | ToDateRange | Type                 | Returndate | LastDayOfAbsence |
      | Hith Tet | 03/04/2019    | 03/15/2019  | Unpaid Medical Leave | 12/26/2019 | 12/25/2019       |
    #| TestFname102 TestLname102 | 12/18/2018     | 12/24/2018    | Medical Leave (Paid) | 12/24/2018  |12/23/2018
   # | TestFname002 LName        | 01/14/2019     | 01/24/2019    | Medical Leave (Unpaid) | 01/22/2019  | 01/21/2019      |


  @automation_TS3
  Scenario Outline: Automation Script - Enter Absence
#    When Proxy as Absence Admin
    Then Business Process: Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type>

    Examples: Worker Details
      | Employee | FromDateRange | ToDateRange | Type                   |
      | TestRichy TestElit | 01/04/2020    | 01/29/2020  | Medical Leave (Unpaid) |
    #| TestFname102 TestLname102 | 12/18/2018     | 12/24/2018    | Medical Leave (Paid) |


  @automation_CTO_TS1
  Scenario Outline: Automation Script - Correct Time Off
#    *********************AbsenceAdmin doesnot has access to correct*************
#    When Proxy as Absence Admin
    When Proxy as BP Admin
    Then Business Process: Correct Time Off<Employee> and <EstimatedLastDayOfAbsence> and <Type>
    #Data requirements :
    #Employee Name : AutoMark AutoJimmy - Make sure employee on leave
    #EstimatedLastDayOfAbsence should current date
    #Type should be Leave Extension Request
    Examples: Worker Details
      | Employee   | EstimatedLastDayOfAbsence | Type                    |
      | Preist Son | 12/30/2019                | Leave Extension Request |

  @automation_ITO_TS1
  Scenario Outline: Automation Script - Initiate Time Off
    When Proxy as Absence Admin
    Then Business Process :Requesting Initiate Time Off<Employee> and <FromDateRange> and <ToDateRange> and <Type>
    #Data requirements :
    #Employee Name : AARON ATKINS - Make sure employee not on leave
    #FromDateRange and ToDateRage should current date
    #Type should be intermittent FMLA
    Examples: Worker Details
      | Employee   | FromDateRange | ToDateRange | Type              |
      | Preist Son | 12/24/2019    | 12/24/2019  | intermittent FMLA |


  @automation_LOE_TS1
  Scenario Outline: Automation Script - Leave Extension Request
    When Proxy as Absence Admin
    Then Business Process: Requesting Leave Of Extension<Employee> and <FromDateRange> and <ToDateRange> and <LOEType>
    #Data requirements :
    #Employee Name : AutoMark AutoJimmy - Make sure employee not on leave
    #FromDateRange and ToDateRage should current date
    #Type and LOEType should be Leave Extension Request
    Examples: Worker Details
      | Employee   | FromDateRange | ToDateRange | LOEType                 |
      | Preist Son | 12/24/2019    | 12/31/2019  | Leave Extension Request |


  @automation_VLA_TS1
  Scenario Outline: Automation Script - View Leave Of Absence
    When Proxy as Absence Admin
    Then Business Process: View Leave Of Absence<Employee> and <AsOfDate> and <Type>
    #Data requirements :
    #Employee Name : AutoMark AutoJimmy - Make sure employee on leave
    #AsOfDate should current date
    #Type should be Leave Extension Request
    Examples: Worker Details
      | Employee   | AsOfDate   | Type                   |
      | Preist Son | 12/24/2019 | Medical Leave (Unpaid) |


#  //AdvanceComp----------------------------------------------------------------

  @automation_ROTP_TS1
  Scenario Outline: Automation Script - Request Onetime Payment
    When Proxy as KELLY SNOW
    Then Business Process: Requesting  Onetime Payment<Employee> and <Reason> and <PaymentPlan> and <Amount> and <Proxyname>

    Examples: Worker Details
      | Employee                       | Reason     | PaymentPlan | Amount | Country | Proxyname  |
#      | TestPadur TestSiruseri         | Spot Bonus | Stay Bonus  | 8500   | US      | EVAN SCOTT |
      | Flofru Fruflo | Spot Bonus | Stay Bonus  | 8500   | US      | EVAN SCOTT |


  @automation_RCC_TS2
  Scenario Outline: Automation Script - Request Compensation Change
    When Proxy as BP Admin
    Then Business Process: Request Compensation of an employee <Reason> and <Employee> and <ChangeSalary> and <EffectiveDate>
    Examples: Compensation Details
      | Reason            | Employee    | EffectiveDate | CompPackage                         | Grade          | proxyname  | CompensationPlan | ChangeSalary |
#      | Market Adjustment | TestSun TestWed | 01/12/2020    | The Home Depot Compensation Package | CA Salaried F1 | EVAN SCOTT | Salary Plan      | 90000     |
      | Market Adjustment | TestHameera TestKriki | 01/12/2020    | The Home Depot Compensation Package | CA Salaried F1 | EVAN SCOTT | Salary Plan      | 90000     |


#  //Talent----------------------------------------------------------------

  @automation_TS14
  Scenario Outline: Start Development Plan for employee
    When Proxy as BP Admin
#    Then Business Process: Start Development Plan for employee <Employee_Name> and <Plan_Start_Date> and <Plan_End_Date> and <Response> and <Development_item> and <Status_Manager> and <Template_Review>
    Then Business Process: Start Development Plan for employee <Employee> and <Plan_St_Date> and <Plan_End_Date> and <Response> and <Development_item> and <Status_Manager> and <Template_Review>

    Examples: Worker Details
      | Employee             | Plan_St_Date | Plan_End_Date | Response | Development_item           | Status_Manager | Template_Review |
      | TestNirsha TestFolas | 08/19/2019   | 08/23/2019    | Testing  | Workday development item 1 | In Progress    | Performance     |



  @automation_TS12
  Scenario Outline: Start Performance Review
    When Proxy as Talent Admin
    Then Business Process: Start performance Review for employee <Empname> and <Review_Template> and <Manager_Rating> and <Overall_Rating> and <reviewStartDate> and <reviewEndDate>

    Examples: Worker Details
      | Empname              | Review_Template | Manager_Rating                | Overall_Rating                                 | reviewStartDate | reviewEndDate |
      | TestKyrie TestKeegan | Hourly CAN | Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) | 01/12/2020      | 01/12/2020    |
      #| Susan Gen | Salaried Annual | Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) |
      # | MATTHEW HALE | Annual Review |  Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) |
#ALESSANDRO CARDOSO

  @automation_STR
  Scenario Outline:  Automation Script - Start Talent Review for Associate
    When Proxy as Talent Admin
    Then Business Process: Start Talent Review for Associate <Empname> and <Talent_Review_Template>
    #Then Proxy as <Empname>
    Then Business Process: Go to <Empname> Inbox and update the talent profile by adding <WorkExperience> and <Experiencelevel> and submit

    Examples: Worker Details
      | Empname     | Talent_Review_Template | WorkExperience | Experiencelevel |
      | Rina Singh  | 2019 Internal Resume   | Product Design | 3 - 5 Years     |

  @automation_TS15
  Scenario Outline: Manage Goals
    #To run view goals separately please uncomment the start proxy of employee in the function
    When Proxy as Talent Admin
    When Business Process: Add Goals for Employee <Employee> and <Category> and <GoalName> and <Status>
    And Business Process: Edit goals for Employee <Employee> and <GoalName> and <EditGoal> and <Status>
#    Then Business Process: View goals of the employee <Employee> and <GoalName> and <EditGoal>

    Examples: Worker Details
      | Employee               | GoalName     | Category               | Status   | EditGoal                |
      | TestSun TestWed  | Workday Goal | 2019 Performance Goals | Complete | Automation Workday Goal |


  @automation_TS16
  Scenario Outline: Start Disciplinary Action
    When Proxy as Talent Admin
    Then Business Process: Start Disciplinary Action <Employee> and <Review_Template> and <Disciplinary_Action_Reasons> and <Period_Start_Date> and <Period_End_Date>

    Examples: Worker Details
      | Employee              | Review_Template   |Disciplinary_Action_Reasons | Period_Start_Date | Period_End_Date |
      | TestSun TestWed | Discipline Notice | Verbal Warning | 01/02/2020        | 01/29/2020      |
#      | CLAUDIA KUTCH | Background Checks  | Coaching | 01/12/2020        | 01/29/2020      |
#      | PETE MENOSKY    | Annual Review-Salaried | Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) |
      # | MATTHEW HALE | Annual Review |  Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) |



    @automation_TS17
    Scenario Outline: Automation Script - Change job

       And  Proxy as BP Admin
      Then Perform Job change for an associate <Employee> and <SUPORG> and <Location> and <UPosition> and <JobProfile> and <EmpType> and <Salary> and <CostCenter> and <EffectiveDate>

       Examples: Worker and Comp details
         | Employee      | UPosition  | JobProfile | SUPORG             | Location | EmpType           | TimeType  | Salary | Proxyname       | CostCenter | EffectiveDate |
#         | AHMED MUJTABA | SCDCGM_10 | SCDCGM     | SUP-00000000000809 | 7152     | Regular Associate | Full Time | 90000  | Anitha Alphonse | 17152000   | 01/05/2020    |
         | TestHameera TestKriki | UStest_01 | SASM - SPECIALTY ASM  | SUP-00000000009766 | 0114     | Regular Associate | Full Time | 90000  | Anitha Alphonse | 10114000   | 01/05/2020    |

#      Canada Store 7152 (FRANCOIS GAGNE),      ANCASTER STORE - 7007             GREENFIELD PARK - 7152


  @automation_Move_Workers
  Scenario Outline: BP_Move_Workers
    When Proxy as BP Admin
    Then Move Workers by SupOrg <EmployeeOne> and <EmployeeTwo> and <EmployeeThree> and <SupOrg> and <PropSupOrg> and <Company> and <CostCenter> and <EffectiveDate_MoveWorkers>

    Examples:Worker Details
      | EmployeeOne           | EmployeeTwo           | EmployeeThree        | EffectiveDate_MoveWorkers | SupOrg             | PropSupOrg         | Company | CostCenter |
      | TestNirsha TestSruthi | TestNirsha TestGeorge | TestLinsi TestSruthi | 10/13/2019                | SUP-00000000000710 | SUP-00000000000809 | 1019    | 7152       |


  @automation_Legal_Name_Change
  Scenario Outline: BP_Legal_Name_Change
    When Proxy as BP Admin
    Then Legal name Change <Employee> and <EffectiveDate_Legalname> and <Country> and <FirstnameLegal> and <LastnameLegal>

    Examples:Worker Details
      | Employee        | EffectiveDate_Legalname | Country | FirstnameLegal | LastnameLegal |
      | TestSun TestWed | 01/16/2020              | Canada  | Phriey         | Pherl         |

#  @automation_WCChange
#  Scenario Outline: BP_Work_Contact_Change
#    When Proxy as BP Admin
#    Then Work Contact Change <EffectiveDate> and <Employee> and <Country> and <Address1> and <Postal> and <City> and <Province> and <State> and <PhoneNumber>
#
#    Examples: Worker Details
#      | Employee     | Country                  | EffectiveDate | Address1         | Postal | City         | Province | State      | PhoneNumber |
#      | Rohan Gulati | United States Of America | 05/24/2019    | 44 Rifle Camp Rd | 07424  | Little Falls |          | New Jersey | 9812357859  |
##      | Rohan Gulati | United States Of America | 05/24/2019    | 44 Rifle Camp Rd | 07424  | Little Falls |          | New Jersey | 9812357859  |


#  // Emergency Contact Change ------------------------------------------------------------------------------------------------
  @automation_ECChange
  Scenario Outline: Automation Script - Emergency Contact Change

    When Proxy as BP Admin
    Then Change Emergency Contacts <Employee> and <Country> and <FirstName> and <LastName> and <Relationship> and <EmergencyPhoneNumber>

    Examples: Worker Details
      | Employee     | Country                  | FirstName | LastName | Relationship            | EmergencyPhoneNumber |
      | Harshi Deena | United States Of America | William   | Mike     | Immediate Family Member | 8646238956           |

  @automation_Move_Workers
  Scenario Outline: BP_Move_Workers
    When Proxy as BP Admin
    Then Move Workers by SupOrg <EmployeeOne> and <EmployeeTwo> and <EmployeeThree> and <SupOrg> and <PropSupOrg> and <Company> and <CostCenter> and <EffectiveDate_MoveWorkers>

    Examples:Worker Details
      | EmployeeOne | EmployeeTwo | EmployeeThree | EffectiveDate_MoveWorkers | SupOrg             | PropSupOrg         | Company | CostCenter |
      | Renes Fin   | Kenly Han   | Rohan Gulati  | 11/13/2019                | SUP-00000000009400 | SUP-00000000007655 | 1001    | 19970001   |



  @automation_Create_Succession_Plan
  Scenario Outline: BP_Create_Succession_Plan
    When Proxy as BP Admin
    And Get position of Employee <Leader>
    And Proxy as Succession partner for 7052
    When Create Succession Plan<Leader> and <EmployeeOne> and <EmployeeTwo> and <Readiness>
#    And Proxy as Talent Admin 7052
#    Then View Succession Plan<Leader>


    Examples: Worker Details
      | Leader                   | EmployeeOne          | EmployeeTwo              | Readiness |
      | TestSun TestWed | TestSee TestSeek  | TestSelva TestHarish | Ready Now |



  @automation_View_Succession_Plan
  Scenario Outline: BP_View_Succession_Plan
    When Proxy as BP Admin
    And Get position of Employee <Leader>
    And Proxy as Talent Admin
    Then View Succession Plan<Leader>

    Examples: Worker Details
      | Leader  |
      | TestKathrine TestGilbert  |


  @automation_Rescind_Termination
  Scenario Outline: BP_Rescind_Termination
    When Proxy as BP Admin
    Then Rescind Termination of <Employee>

    Examples: Worker Details
      | Employee  |
      | TestKins TestElit |


  @automation_Rescind_Absence
  Scenario Outline: BP_Rescind_Absence
    When Proxy as BP Admin
    Then Rescind Absence Request of <Employee>

    Examples: Worker Details
      | Employee  |
      | Kenly Han |



  @automation_Rescind_Move_Workers
  Scenario Outline: BP_Rescind_Move_Workers
    When Proxy as BP Admin
    Then Rescind Move Workers<EmployeeOne> and <EmployeeTwo> and <EmployeeThree> and <EffectiveDate_MoveWorkers>

    Examples: Worker Details
      | EmployeeOne           | EmployeeTwo           | EmployeeThree        | EffectiveDate_MoveWorkers |
      | TestNirsha TestSruthi | TestNirsha TestGeorge | TestLinsi TestSruthi | 10/13/2019                |

  @automation_Rescind_Hire
  Scenario Outline: BP_Rescind_Hire
    And Proxy as BP Admin
    Then Rescind an Hire Associate<Employee>

    Examples: Worker Details
      | Employee  |
      | TestFrida TestBahari  |


  @automation_Rescind_Transfer
  Scenario Outline: BP_Rescind_Transfer
    When Proxy as BP Admin
    And Rescind the job transfer for the employee <Employee>

    Examples: Worker Details
      | Employee  |
      | Rohan Gulati  |
