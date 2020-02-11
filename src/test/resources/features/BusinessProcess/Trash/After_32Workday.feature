@web
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday p2

#HCM Module --------------------------------------------------------------------------------------------------------------------------------------------------

  @automation_TS100
  Scenario Outline: Create position, Pre-hire,Propose Compensation Hire
   # When Proxy as HCM Partner2
    When Proxy as KELLY SNOW
    #And Create position in an organization <SUPORG> and <Position> and <Location> and <JobFamily> and <JobProfile> and <TimeType>  and <WorkerType>
    And Create Pre-hire with Firstname and Lastname <Country> and <Home_addressline1> and <Home_addressline2> and <Home_city> and <Home_province> and <Home_postalcode> and <Home_type> and <Work_addressline1> and <Work_type>
    Then Propose Compensation Hire <Reason> and <Position> and <SSNNumber> and <SUPORG> and <Country> and <GovID> and <Company> and <CostCenter>
    Then Onboarding the employee <Country> and <FNemergencyConctOnBoard> and <LNemergencyConctOnBoard> and <RelationShpOnB> and <MailIdONB> and <MobileOnbard>
      #Then Re-hiring an Employee <>

    Examples: Worker Details
      | Position | Reason   | SSNNumber | SUPORG                       | Country                  | GovID | Company          | CostCenter | Proxyname       | Location | JobFamily             | JobProfile | TimeType  | WorkerType | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type |
      | USSA28-9 | New Hire | 254718854 | USA Store 0914 (BRIAN ASKIN) | United States of America | SSN   | HOME DEPOT STORE | 19090168   | Anitha Alphonse | 0914     | Home Depot Foundation | HMCHSP     | Full time | Associate  | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | DNo:100           | CarioStreet       | Atlanta   | Georgia       | 30339           | Home      | BuildingNo:9987   | CarioStreet       | Work      |
      #| WD_CA09    | New Hire  |054124017 | Canada Store 7152   | Canada   | Social Insurance Number  | HOME DEPOT | 17152000   | Anitha Alphonse  | 7152      |  Home Depot  | SAIII        | Full time  | Associate | john                      | ballla         | Immediate Family Member| john_ballla@homedepot.com | 9876542310|  DNo:100           | CarioStreet       |Toronto    |Alberta        | 100002          | Home      | BuildingNo:9987   | CarioStreet       | Work   |

          #CASA17  , CASA19-15

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


    ##--> @Creating Job requisition
  @automation_JR
  Scenario Outline: Job requisition
    Given Proxy as HR Partner
    Then Creating Job requisition <SUPORG> and <Position> and <WorkerType> and <Reason> and <WorkerSubType> and <JobProfile> and <Company> and <CostCenter> and <PrimaryLocation>

    Examples: Worker Details
      | SUPORG                        | Position       | WorkerType | Reason       | WorkerSubType     | JobProfile | Company                  | CostCenter | PrimaryLocation |
     # | Canada Store 7152 (DONALD CRETE) | Senior ANALYSTS-5| Associate    | Add to Staff | Expatriate     | Human Resource Director | Home depot Canada | 17152000|  7152 |
      | USA Store 0914  (BRIAN ASKIN) | US TEST DATA-4 | Associate  | Add to Staff | Regular Associate | HMCHSP     | HOME DEPOT STORE SUPPORT | 19090199   | 0914            |
     # | Greenfield Park | Senior Analyst-30  | Employee    | Add to Staff | Expatriate     | Human Resource Director | Home depot Canada | Toronto North |  Anitha Alphonse |
     # | Mount Laurel | Systems Analyst-WD-10  | Employee    | Add to Staff | Expatriate     | Human Resource Director | Home Depot U.S.A., INC | ATLANTA SDC |  Anitha Alphonse |

  ##--> @Close Job requisition    ANTHONY TOCI
  @automation_CJR
  Scenario Outline: Close Job requisition
    Given Proxy as KELLY SNOW
    Then Close Job requisition <JobRequisite> and <Reason>

    Examples: Worker Details
      | JobRequisite | Reason           | Proxyname      |
      | Req251       | No Longer Needed | Hongming zhang |
      #| Req223 Systems Analyst-55 | No Longer Needed  | Hongming zhang|

  @automation_TS1T
  Scenario Outline: Automation Script - Terminate Employee
    When Proxy as KELLY SNOW
    Then Terminating the Employees <Emp_name> and <TerminationType> and <Primary_Reason> and <Eligible_ReHire> and <SearchWith> and <localReason>

    Examples: Worker Details
      | Emp_name     | SearchWith          | TerminationType | Primary_Reason | Eligible_ReHire | localReason | Proxyname       |
   #| AutoFname001 TestLname001  | Terminate Associate | Involuntary     |PERSONAL REASONS | Yes             | Other       | Anitha Alphonse |
   #| TestFname 001 TestLname 001 | Terminate Associate | Voluntarty  | PERSONAL REASONS | Yes           | Other       | Anitha Alphonse |
      # | TestFname7 Lname         | Terminate Associate |   voluntary   | PERSONAL REASONS | Yes                | Other       | Anitha Alphonse |
      #| Stacey Jack        | Terminate Associate |   Involuntary   |CONDUCT/POLICY | Yes                | Other       | Anitha Alphonse |
      | HECTOR TAPIA | Terminate Associate | Involuntary     | CONDUCT/POLICY | Yes             | Other       | Anitha Alphonse |

  @automation_TS2
  Scenario Outline: Personal info change
    Given Proxy as Lisa Amy
    Then Change the personal information of the employee <Gender> and <DOB> and <Race>

    Examples: Worker Details
      | Gender | DOB        | Race               | Proxyname       |
      | Female | 11/20/1995 | Systems Analyst-13 | Anitha Alphonse |


  @automation_TS3
  Scenario Outline: Automation Script - Contract Contingent worker
    When Proxy as KELLY SNOW
    Then Create a Contract Contingent worker<Organization> and <EmployeePreHire> and <Position> and <WorkerType> and <JobProfile> and <TimeType> and <UserName> and <NewPwd> and <VerifyNewPwd>

    Examples: Worker Details
      | Organization      | EmployeePreHire   | Position | Proxyname      | WorkerType | JobProfile | TimeType  | UserName | NewPwd   | VerifyNewPwd |
      | 7152 DONALD CRETE | TestFname11 Lname | CASA19-2 | Hongming Zhang | Vendor     | QA ASSOC   | Full Time | First27  | WDtry@03 | WDtry@03     |

  @automation_TS04_JC
  Scenario Outline: Job Change
    #When Proxy as HR Partner
    When Proxy as KELLY SNOW
    Then Perform Job change for an employee  Firstname and Lastname and <Employee> and <SUPORG> and <Location> and <UPosition> and <JobProfile> and <EmpType> and <Salary> and <CostCenter> and <Company>
#change the date and also TimeType in the code whenever running
    Examples: Worker Details
      | FName      | LName      | Employee    | UPosition                   | JobProfile | SUPORG           | Location | EmpType           | TimeType  | Salary | Proxyname       | CostCenter | Company                  |
      | TestFname1 | TestLname1 | Brown Walsh | Systems Analyst TEST DATA-4 | HMCHSP     | 0914 BRIAN ASKIN | 0914     | Regular Associate | Full Time | 16     | Anitha Alphonse | 19090424   | HOME DEPOT STORE SUPPORT |
      #| TestFname1  |  TestLname1  | Holly Gillian | System Analyst DATA Test 100-1  | 0914 BRIAN ASKIN | Regular Associate |  Full Time  | 65000  | Anitha Alphonse | 19090168 | HOME DEPOT STORE SUPPORT |

#Nikkan Chicko


  @automation_TS04_JCL
  Scenario Outline: Job Change for Location
    When Proxy as KELLY SNOW
    Then Perform Job change for Location Firstname and Lastname and <Employee> and <SUPORG>
    Examples: Worker Details
      | Employee     | SUPORG |
      | Keila Lourie | 7152   |


# Abscence Module ----------------------------------------------------------------------------------------------------------------------------------------------

  @automation_TS300
  Scenario Outline: Automation Script - Enter Absence
#When Proxy as Absence Admin
    When Proxy as Absence Admin
    Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type>

    Examples: Worker Details
      | Employee     | FromDateRange | ToDateRange | Type                 |
#| TestFname102 TestLname102 | 12/18/2018     | 12/24/2018    | Medical Leave (Paid) |
#  | AutoAndrewAutojelly        | 01/14/2019     | 01/24/2019    | Unpaid Medical Leave |
     # | Micheal Jony             | 03/14/2019     | 03/20/2019    | Unpaid Medical Leave |
      | ANTHONY TOCI | 03/23/2019    | 03/30/2019  | Unpaid Medical Leave |
      #| Brown Walsh           | 03/23/2019     | 03/30/2019    | Unpaid Medical Leave |


  @automation_AbsenceReturn
  Scenario Outline: Automation Script - Return worker from leave
   # When Proxy as BETHANY LOVETTE
    When Proxy as Absence_Admin_Canada
    #Then Requesting Absence<Employee> and <FromDateRange> and <ToDateRange> and <Type>
    And Return Worker from leave<Employee> and <Returndate> and <LastDayOfAbsence>

    Examples: Worker Details
      | Employee         | FromDateRange | ToDateRange | Type                 | Returndate | LastDayOfAbsence |
    #| TestFname102 TestLname102 | 12/18/2018     | 12/24/2018    | Medical Leave (Paid) | 12/24/2018  |12/23/2018
   # | TestFname002 LName        | 01/14/2019     | 01/24/2019    | Medical Leave (Unpaid) | 01/22/2019  | 01/21/2019      |
      | Laurely Jackison | 03/04/2019    | 03/18/2019  | Unpaid Medical Leave | 03/19/2019 | 03/18/2019       |
      # Autodavid Autokong , Autowilly Autojill, Jackson Roy

  @automation_CTO_TS1
  Scenario Outline: Automation Script - Correct Time Off
    When Proxy as Absence Admin
    Then Correct Time Off<Employee> and <EstimatedLastDayOfAbsence> and <Type>
  #Data requirements :
  #Employee Name : AutoMark AutoJimmy - Make sure employee on leave
  #EstimatedLastDayOfAbsence should current date
  #Type should be Leave Extension Request
    Examples: Worker Details
      | Employee    | EstimatedLastDayOfAbsence | Type           |
   # | AutoMark AutoJimmy | 03/14/2019| Leave Extension Request |
      | Pivotee Raj | 04/02/2019                | Domestic Leave |


  @automation_ITO_TS110
  Scenario Outline: Automation Script - Initiate Time Off
    When Proxy as Absence Admin
    Then Requesting Initiate Time Off<Employee> and <FromDateRange> and <ToDateRange> and <Type>
    #Data requirements :
    #Employee Name : AARON ATKINS - Make sure employee not on leave
    #FromDateRange and ToDateRage should current date
    #Type should be intermittent FMLA
    Examples: Worker Details
      | Employee     | FromDateRange | ToDateRange | Type              |
      | ALBERT MAZUR | 04/02/2019    | 04/02/2019  | Intermittent FMLA |
   # | Esme Brinda |    03/20/2019     | 03/20/2019  | Intermittent FMLA |
   #| Lisa Amy    |    03/12/2019     | 03/12/2019  | Intermittent FMLA |



  @automation_LOE_TS110
  Scenario Outline: Automation Script - Leave Extension Request
    When Proxy as Absence Admin
    Then Requesting Leave Of Extension<Employee> and <FromDateRange> and <ToDateRange> and <Type> and <LOEType>
    #Data requirements :
    #Employee Name : AutoMark AutoJimmy - Make sure employee not on leave
    #FromDateRange and ToDateRage should current date
    #Type and LOEType should be Leave Extension Request
    Examples: Worker Details
      | Employee    | FromDateRange | ToDateRange | Type                    | LOEType                 |
      | Elena Light | 03/07/2019    | 03/20/2019  | Leave Extension Request | Leave Extension Request |


  @automation_VLA_TS1
  Scenario Outline: Automation Script - View Leave Of Absence
    When Proxy as Absence Admin
    Then View Leave Of Absence<Employee> and <AsOfDate> and <Type>
  #Data requirements :
  #Employee Name : AutoMark AutoJimmy - Make sure employee on leave
  #AsOfDate should current date
  #Type should be Leave Extension Request
    Examples: Worker Details
      | Employee    | AsOfDate   | Type                    |
      | Pivotee Raj | 04/02/2019 | Leave Extension Request |


#----------------------------------------------------------------------------------------------------------------------------------------------------------------

  #Talent Module ------------------------------------------------------------------------------------------------------------------------------------------------

  @automation_STR
  Scenario Outline:  Automation Script - Start Talent Review for Associate
    When Proxy as Talent Admin
    Then Start Talent Review for Associate <Empname> and <Talent_Review_Template>
  #Then Proxy as <Empname>
    Then Go to <Empname> Inbox and update the talent profile by adding <WorkExperience> and <Experiencelevel> and submit

    Examples: Worker Details
      | Empname     | Talent_Review_Template | WorkExperience | Experiencelevel |
    #| AutoJoann Autojeff  | 2019 Internal Resume | Product Design   | 3 - 5 Years       |
      | DAVID AMATO | 2019 Internal Resume   | Product Design | 3 - 5 Years     |


  @automation_TS12
  Scenario Outline: Start Performance Review
    When Proxy as KELLY SNOW
    Then Start performance Review for employee <Empname> and <Review_Template> and <Manager_Rating> and <Overall_Rating>

    Examples: Worker Details
      | Empname     | Review_Template        | Manager_Rating                | Overall_Rating                                      |
     # | test 123 canada | Annual Review-Salaried | Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) |
      | Bella Patel | Annual Review-Salaried | Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) |
      # | MATTHEW HALE | Annual Review |  Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) |


  @automation_TS16
  Scenario Outline: Start Disciplinary Action
    When Proxy as Talent Admin
    Then Start Disciplinary Action <Empname> and <Review_Template> and <Disciplinary_Action_Reasons> and <Period_Start_Date> and <Period_End_Date>

    Examples: Worker Details
      | Empname      | Review_Template  | Disciplinary_Action_Reasons | Period_Start_Date | Period_End_Date |
      | SUMANT KAPIL | Asset Protection | Coaching                    | 01/02/2019        | 01/02/2019      |
 # | PETE MENOSKY    | Annual Review-Salaried | Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) |
  # | MATTHEW HALE | Annual Review |  Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) |



  @automation_TS15
  Scenario Outline: Manage Goals
    When Proxy as Talent Admin
    When Add Goals for Employee <Employee> and <Category> and <GoalName> and <Status>
    And Edit goals for Employee <Employee> and <GoalName> and <EditGoal> and <Status>
    Then View goals of the employee <Employee> and <GoalName> and <EditGoal>

    Examples: Worker Details
      | Employee      | GoalName     | Category               | Status   | EditGoal                    |
  #  |  Bella Patel | Workday Goal               | 2019 Performance Goals | Complete | WORKDAY Automation Testing1  |
      | Anderson Wang | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 |
  #Robin Stout



    ##--> @Start Development Plan for employee
  @automation_SDPFE
  Scenario Outline: Start Development Plan for employee
    When Proxy as KELLY SNOW
    Then Start Development Plan for employee <Employee_Name> and <Plan_Start_Date> and <Plan_End_Date> and <Response> and <Development_item> and <Status_Manager> and <Status_Acknowledgement> and <Template_Review>

    Examples: Worker Details
      | Employee_Name | Plan_Start_Date | Plan_End_Date | Response | Development_item           | Status_Manager | Status_Acknowledgement | Template_Review |
    #|  ROBERT ROBERTON  | 12/26/2018      | 02/27/2019     | Testing | Workday development item 1 | In Progress | Acknowledge Receipt | Initial |
    # | ALESSANDRO CARDOSO  | 12/26/2018      | 02/27/2019     | Testing | Workday development item 1 | In Progress | Acknowledge Receipt | On Going |
      | Anderson Wang | 01/26/2019      | 03/27/2019    | Testing  | Workday development item 1 | In Progress    | Acknowledge Receipt    | On Going        |

    #-------------------------------------------------------------------------------------------------------------------------------------------------------------

  #Advance Comp --------------------------------------------------------------------------------------------------------------------------------------------------

  @automation_TS1ROTP
  Scenario Outline: Automation Script - Request Onetime Payment
    When Proxy as KELLY SNOW
    Then Requesting  Onetime Payment<Employee> and <Reason> and <PaymentPlan> and <Amount> and <Proxyname>

    Examples: Worker Details
      | Employee    | Reason     | PaymentPlan | Amount | Country | Proxyname  |
      | Pivotee Raj | Spot Bonus | Stay Bonus  | 7500   | US      | EVAN SCOTT |
# | TestFname108 TestLname108 | Spot Bonus     | Retention Bonus         | 6000  | USA




  @automation_TS2RCC
  Scenario Outline: Automation Script - Request Compensation Change
    When Proxy as KELLY SNOW
    Then Request Compensation of an employee <Reason> and <Empname> and <CompPackage> and <Grade> and <proxyname> and <CompensationPlan> and <Salary>

    Examples: Compensation Details
      | Reason            | Empname     | CompPackage                         | Grade           | proxyname  | CompensationPlan | Salary |
# | Market Adjustment | Autoballa Autoapril | The Home Depot Compensation Package | US Salaried 5.1 | EVAN SCOTT | Salary Plan | 45000  |
#  | Market Adjustment | Autoballa Autojill | The Home Depot Compensation Package | US Salaried 5.1 | EVAN SCOTT | Salary Plan | 45000  |
      | Market Adjustment | Pivotee Raj | The Home Depot Compensation Package | US Salaried 5.1 | EVAN SCOTT | Salary Plan      | 17     |

    #----------------------------------------------------------------------------------------------------------------------------------------------------------------------




