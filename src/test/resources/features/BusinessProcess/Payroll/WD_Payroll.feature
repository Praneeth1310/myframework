@web
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday hd3


  @automation_TS_PR_ADD
  Scenario Outline: Adding  Earnings and Deductions
    When Proxy as PayRoll Admin
    Then Add Earnings and Deductions <Emp_ID> and <Employeename> and <PayComponent> and <Batch_ID> and <InputType> and <Hours> and <Value> and <Country>
#    Then Recalculate Earnings and Deductions <Emp_ID> and <Employeename> and <Batch_ID> and <PayComponent>
#    Then Validating the PayInput <Emp_ID> and <Employeename> and <PayComponent> and <Batch_ID> and <InputType> and <Value>

    Examples: Worker Details
      | Emp_ID    | Employeename       | PayComponent | Batch_ID | InputType | Hours | Value |  Country |
      | 705201835 | AHMED MUJTABA  | E0081        | 4206     | Amount    | 40.00 | 30.00 |  Canada  |
    # | 200000605 | Fiona Angus    | E0081        | 4206     | Amount    | 75.00 | 35.00 |
    # | 200000554 | Zelene Angus   | E0081        | 4206     | Amount    | 75.00 | 40.00 |
    # | 200000638 | Felicia Odette | E0081        | 4206     | Hours     | 75.00 | 75.00 |
    #200000638

  @automation_TS_PR_DEL
  Scenario Outline: Delete  Earnings and Deductions
    When Proxy as PayRoll Admin
    Then  Delete Earnings and Deductions <Emp_ID> and <Employeename> and <Batch_ID> and <PayComponent>

    Examples: Worker Details
      | Emp_ID    | Employeename       | Batch_ID | PayComponent |
    # | 100791383 | SAMUEL TORRES | 4206 | E0083        |
      | 200003728 | TestNivi TestFolas | 4206     | E0081        |

  @automation_TS_PR_RCAL
  Scenario Outline: Recalculate  Earnings and Deductions
    When Proxy as PayRoll Admin
    Then  Recalculate Earnings and Deductions <Emp_ID> and <Employeename> and <Batch_ID> and <PayComponent>

    Examples: Worker Details
      | Emp_ID    | Employeename   | Batch_ID | PayComponent |
    # | 100791383 | SAMUEL TORRES  | 4206     | E0083        |
      | 200000638 | Felicia Odette | 4206     | E0081        |

  @automation_VPSTD
  Scenario Outline: View Payslips and validate the tax detais
    When Proxy as AVETA KING
#Then  View Results <Emp_ID> and <Employeename> and <PeriodStartDate> and <PeriodEndDate>
    Then  View Payslips <Emp_ID> and <Employeename> and <PeriodStartDate> and <PeriodEndDate>

    Examples: Worker Details
      | Emp_ID    | Employeename  | PeriodStartDate | PeriodEndDate |
      | 100791383 | SAMUEL TORRES | 10/29/2018      | 11/04/2018    |
   # | 100791383 | SAMUEL TORRES | 11/12/2018      | 11/18/2018    |


  @automation_VR
  Scenario Outline: View Results for an employee
    When Proxy as AVETA KING
    Then  View Results <Emp_ID> and <Employeename> and <PeriodStartDate> and <PeriodEndDate>

    Examples: Worker Details
      | Emp_ID    | Employeename  | PeriodStartDate | PeriodEndDate |
      | 100791383 | SAMUEL TORRES | 11/05/2018      | 11/11/2018    |


  @automation_ROND
  Scenario Outline: Run On demand payment for Employee
    When Proxy as AVETA KING
    Then  Run_On_Demand <Emp_ID> and <Employeename> and <SubPeriodTargetDate> and <PaymentDate> and <Reason_PayCal> and <Priority> and <PayComponent> and <InputType> and <Value>

    Examples: Worker Details
      | Emp_ID    | Employeename   | SubPeriodTargetDate | PaymentDate | Reason_PayCal   | Priority | PayComponent | InputType | Value  |
     # | 100791383 | SAMUEL TORRES | 02/02/2019      | 11/11/2018      | Legal garn deds | 1        |
    #  | 200000581 | Jack Tracy | 01/26/2019      | 01/27/2019     | Legal garn deds | 1        | E0145 | Amount               |  200.00  |
     # | 200000541 | Wilona Zoe | 01/26/2019      | 01/27/2019     | Legal garn deds | 1        | E0148 | Amount               |  300.00  |
      | 200000539 | Cuthbert Adler | 01/29/2019          | 01/30/2019  | Legal garn deds | 1        | E0148        | Hours     | 300.00 |

  @automation_PS
  Scenario Outline: View Payslips and validate the tax detais
    When Proxy as AVETA KING
  #Then  View Results <Emp_ID> and <Employeename> and <PeriodStartDate> and <PeriodEndDate>
    Then  View Payslips <Emp_ID> and <Employeename> and <PeriodStartDate> and <PeriodEndDate>

    Examples: Worker Details
      | Emp_ID    | Employeename  | PeriodStartDate | PeriodEndDate |
      | 100791383 | SAMUEL TORRES | 10/29/2018      | 11/04/2018    |

  @automation_VR
  Scenario Outline: PayPeriod View Results for an employee
    When Proxy as AVETA KING
    Then  View Results <Emp_ID> and <Employeename> and <PeriodStartDate> and <PeriodEndDate>

    Examples: Worker Details
      | Emp_ID    | Employeename  | PeriodStartDate | PeriodEndDate |
      | 100791383 | SAMUEL TORRES | 10/29/2018      | 11/04/2018    |