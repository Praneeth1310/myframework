@web
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday sandbox


  @automation_TS1ROTP
  Scenario Outline: Automation Script - Request Onetime Payment
    When Proxy as KELLY SNOW
    Then Requesting  Onetime Payment<Employee> and <Reason> and <PaymentPlan> and <Amount> and <Proxyname>

    Examples: Worker Details
      | Employee    | Reason     | PaymentPlan | Amount | Proxyname  |
      | Pivotee Raj | Spot Bonus | Stay Bonus  | 7500   | EVAN SCOTT |


  @automation_TS2
  Scenario Outline: Automation Script - Request Compensation Change
    When Proxy as KELLY SNOW
    Then Request Compensation of an employee <Reason> and <Employee> and <EffectiveDate> and <ChangeSalary>

    Examples: Compensation Details
      | Reason            | Employee                     | EffectiveDate | ChangeSalary |
      | Market Adjustment | TestKelambakam TestKarapakam | 11/11/2019    | 16           |
