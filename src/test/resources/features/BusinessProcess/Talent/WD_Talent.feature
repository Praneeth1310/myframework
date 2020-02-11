@web
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday sandbox


  @automation_TS14
  Scenario Outline: Start Development Plan for employee
    When Proxy as KELLY SNOW
    #Then Business Process: Start Development Plan for employee <Employee_Name> and <Plan_Start_Date> and <Plan_End_Date> and <Response> and <Development_item> and <Status_Manager> and <Status_Acknowledgement> and <Template_Review>
    Then Business Process: Start Development Plan for employee <Employee> and <Response> and <Development_item> and <Status_Manager> and <Template_Review> and <Plan_Start_Date> and <Plan_End_Date>

    Examples: Worker Details
      | Employee      | Plan_Start_Date | Plan_End_Date | Response | Development_item           | Status_Manager | Status_Acknowledgement | Template_Review |
      #|  ROBERT ROBERTON  | 12/26/2018      | 02/27/2019     | Testing | Workday development item 1 | In Progress | Acknowledge Receipt | Initial |
      | ALESSANDRO CARDOSO | 12/26/2018      | 02/27/2019    | Testing  | Workday development item 1 | In Progress    | Acknowledge Receipt    | Initial         |


  @automation_TS12
  Scenario Outline: Start Performance Review
    When Proxy as Talent Admin
    Then Business Process: Start performance Review for employee <Empname> and <Review_Template> and <Manager_Rating> and <Overall_Rating> and <ReviewStartDate> and <ReviewEndDate>

    Examples: Worker Details
      | Empname                      | Review_Template | ReviewStartDate | ReviewEndDate | Manager_Rating                | Overall_Rating                                      |
      | TestKelambakam TestKarapakam | Hourly CAN      | 10/02/2019      | 11/30/2019    | Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) |
#     | TestPadur TestSiruseri       | Annual Review-Salaried | Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) |
#     | MATTHEW HALE           | Annual Review          | Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) |


  @automation_STR
  Scenario Outline:  Automation Script - Start Talent Review for Associate
    When Proxy as Talent Admin
    Then Business Process: Start Talent Review for Associate <Empname> and <Talent_Review_Template>
    #Then Proxy as <Empname>
    Then Business Process: Go to <Empname> Inbox and update the talent profile by adding <WorkExperience> and <Experiencelevel> and submit

    Examples: Worker Details
      | Empname     | Talent_Review_Template | WorkExperience | Experiencelevel |
      | Bella Patel | 2019 Internal Resume   | Product Design | 3 - 5 Years     |

  @automation_TS15
  Scenario Outline: Manage Goals
    When Proxy as Talent Admin
    When Business Process: Add Goals for Employee <Employee> and <Category> and <GoalName> and <Status>
    And Business Process: Edit goals for Employee <Employee> and <GoalName> and <EditGoal> and <Status>
    Then Business Process: View goals of the employee <Employee> and <GoalName> and <EditGoal>

    Examples: Worker Details
      | Employee                 | GoalName     | Category               | Status   | EditGoal                    |
      | Testchandhana TestGeorge | Workday Goal | 2019 Performance Goals | Complete | WORKDAY Automation Testing1 |


  @automation_TS16
  Scenario Outline: Start Disciplinary Action
    When Proxy as Talent Admin
    Then Business Process: Start Disciplinary Action <Employee> and <Review_Template> and <Discip_Action_Reasons> and <Period_Start_Date> and <Period_End_Date>

    Examples: Worker Details
      | Employee            | Review_Template   | Discip_Action_Reasons | Period_Start_Date | Period_End_Date |
      | Stefii Graaph | Discipline Notice | Verbal Warning        | 03/02/2019        | 03/02/2019      |
     # | PETE MENOSKY    | Annual Review-Salaried | Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) |
      # | MATTHEW HALE | Annual Review |  Consistently Demonstrates (+) | Exceeds Expectations/Consistently Demonstrates (E+) |

