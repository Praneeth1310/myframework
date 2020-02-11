@web
Feature: Testing HCM

  Background: User Logs into Workday
    Given Login to Workday p2

  @automation_HCM_CSP
  Scenario Outline: Create Succession plan

    And Proxy as Succession Partner 7152
    When Create Succession Plan<Leader> and <EmployeeOne> and <EmployeeTwo> and <Readiness>

    Examples: Worker Details
      | Leader      | EmployeeOne  | EmployeeTwo  | Readiness |
     #| Ethen Jones | Glen Nicolas | Robin Albert | Ready Now |
      | DAVID BRATT | Glen Nicolas | Robin Albert | Ready Now |


  @automation_HCM_VSP
  Scenario Outline: View Succession plan

    And Proxy as Succession Partner 7152
    Then View Succession Plan<Leader>

    Examples: Worker Details
      | Leader      | EmployeeOne  | EmployeeTwo  | Readiness |
     #| Ethen Jones | Glen Nicolas | Robin Albert | Ready Now |
      | DAVID BRATT | Glen Nicolas | Robin Albert | Ready Now |


  @automation_EPos
  Scenario Outline: Get Employee Position


    And Proxy as KELLY SNOW
    Then Get Employee Position<Employee>

    Examples: Worker Details
      | Employee  |
      | Esme Chan |
