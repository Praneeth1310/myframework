@E2EDemo
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday hd3


#  Canada test data generator with requisition
  @Test_Data_Generator_With_Requisition
  Scenario Outline: Canada_Test_Data_Generator with requisition
    When Proxy as BP Admin
    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile |
      | SUP-00000000000710 | Canada  | 01/03/2019  | 054266270 | SRPTMG |


#  US Test data generator with requisition
  @US_Test_Data_Generator_With_Requisition
  Scenario Outline: US_Test_Data_Generator with requisition
    When Proxy as BP Admin
    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SINNumber> and <JobProfile>

    Examples: Worker Details
      | SUPORG             | Country                   | Hiredate  | SINNumber | JobProfile           |
      | SUP-00000000009400 | United States Of America  | 03/05/2019  | 054266270 | SASM - SPECIALTY ASM |


 #  Canada test data generator with requisition (8 Steps)
  @Synthetic_HireCanada_TestData_With_Requisition
  Scenario Outline: Hire Canada test data with requisition
    When Proxy as BP Admin
    Then Canada Hire With Requisition - Creating Job requisition <SUPORG> and <JobProfile> and <ReqReason> and <RecruitStartDate> and <TargetHireDate> and <Location> and <Company> and <CostCenter> and <Department>
    Then Canada Hire With Requisition - Hire from requisition
    Then Canada Hire With Requisition - Create Prehire <Country>
    Then Canada Hire With Requisition - Hire Associate <HireDate> and <Reason>
    Then Canada Hire With Requisition - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
    Then Canada Hire With Requisition - Edit ID<Country> and <GovID>
    Then Canada Hire With Requisition - Propose Compensation<Amount> and <Country>
    Then Canada Hire With Requisition - Onboarding the employee <Country> and <FNameEmerCon> and <InstituteNum> and <BranchID> and <AccNum> and <BankName>

    Examples: Worker Details
      | SUPORG              | JobProfile  | ReqReason     | RecruitStartDate  | TargetHireDate  | Location  | Company     | CostCenter  | Department      | Country | HireDate    | Reason    | BusinessUnit                    | GovID                    |  Amount  | FNameEmerCon   | InstituteNum  | BranchID  | AccNum      | BankName              |
      | SUP-00000000000710  | SRPTMG      | Add to Staff  | 12/01/2018        | 12/02/2018      | 7052      | HOME DEPOT  | 17152000    | 003 STORE MGRS  | Canada  | 01/08/2019  | New Hire  | CWS CANADA WEST STORE ASSOCIATE | Social Insurance Number  |  85000   | john           | 789           | 78521     | 7853258426  | Royal bank of Canada  |


#  US test data generator with requisition (6 Steps)
  @Synthetic_HireUS_TestData_With_Requisition
  Scenario Outline: Hire US test data with requisition
    When Proxy as BP Admin
    Then US Hire With Requisition - Creating Job requisition <SUPORG> and <JobProfile> and <ReqReason> and <RecruitStartDate> and <TargetHireDate> and <Location> and <Company> and <CostCenter> and <Department>
    Then US Hire With Requisition - Hire from requisition
    Then US Hire With Requisition - Create Prehire <Country>
    Then US Hire With Requisition - Hire Associate <HireDate> and <Reason>
    Then US Hire With Requisition - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
    Then US Hire With Requisition - Edit ID<Country> and <GovID>
    Then US Hire With Requisition - Propose Compensation<Amount> and <Country>
    Then US Hire With Requisition - Onboarding an employee<Country> and <FNemergencyConctOnBoard> and <BankName> and <RoutingNum> and <AccountNum>

    Examples: Worker Details
     | RecruitStartDate  | TargetHireDate  | ReqReason     | Reason   | SUPORG             |  Country                  | GovID                  | Company    | CostCenter | Amount | Location | JobProfile           | HireDate   | BusinessUnit                             | Department         | FNemergencyConctOnBoard | BankName          | RoutingNum | AccountNum    |
     | 12/18/2018        | 12/19/2018      | Add to Staff  | New Hire | SUP-00000000009400 |  United States of America | Social Security Number | HOME DEPOT | 10914000   | 85000  | 0914     | SASM - SPECIALTY ASM | 01/01/2019 | NDS US NORTHERN DIVISION STORE ASSOCIATE | 001 ASSISTANT MGRS | john                    | Bank Of Americaca | 051000017  |  987564213012 |




  #  *****************************Commented the below lines as the hire flow is changed*******************************

#    #  US test data generator with requisition (6 Steps)
#  @Synthetic_HireUS_TestData_With_Requisition
#  Scenario Outline: Hire US test data with requisition
#    When Proxy as BP Admin
#    Then US Hire With Requisition - Creating Job requisition <SUPORG> and <JobProfile> and <ReqReason> and <RecruitStartDate> and <TargetHireDate> and <Location> and <Company> and <CostCenter> and <Department>
#    Then US Hire With Requisition - Hire from requisition
#    Then US Hire With Requisition - Create Prehire <Country>
#    Then US Hire With Requisition - Hire Associate <HireDate> and <Reason>
#    Then US Hire With Requisition - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
#    Then US Hire With Requisition - Edit ID<Country> and <GovID>
#    Then US Hire With Requisition - Change Personal Info <Country>
#    Then US Hire With Requisition - Propose Compensation<Amount> and <Country>
#    Then US Hire With Requisition - Onboarding an employee<Country> and <JobProfile>
#
#    Examples: Worker Details
#      | RecruitStartDate  | TargetHireDate  | ReqReason     | Reason   | SUPORG             |  Country                  | GovID                  | Company    | CostCenter | Amount | Location | JobProfile           | HireDate   | BusinessUnit                             | Department         | FNemergencyConctOnBoard | BankName          | RoutingNum | AccountNum    |
#      | 12/18/2018        | 12/19/2018      | Add to Staff  | New Hire | SUP-00000000009400 |  United States of America | Social Security Number | HOME DEPOT | 10914000   | 85000  | 0914     | SASM - SPECIALTY ASM | 01/01/2019 | NDS US NORTHERN DIVISION STORE ASSOCIATE | 001 ASSISTANT MGRS | john                    | Bank Of Americaca | 051000017  |  987564213012 |
#

