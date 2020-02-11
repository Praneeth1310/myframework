@E2EDemo
Feature: Testing HCM Pre Hire and Hire Employee

  Background: User Logs into Workday
    Given Login to Workday hd3


#  Canada test data generator (6 Steps)
  @Synthetic_HireCanada_TestData
  Scenario Outline: Hire Canada test data
    When Proxy as BP Admin
    And  Canada Hire - Create position in an organization <SUPORG> and <Position> and <Location> and <JobFamily> and <JobProfile> and <TimeType>  and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>
    And  Canada Hire - Create Pre-hire with Firstname and Lastname <Country> and <Firstname> and <Lastname> and <Home_city> and <Home_province> and <Home_postalcode> and <Home_type> and <Work_addressline1> and <Work_type>
    Then Canada Hire - Hire Associate<Reason> and <Position> and <SUPORG> and <AssociateType> and <JobProfile> and <TimeType> and <Location> and <PayRateType> and <HireDate>
    Then Canada Hire - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
    Then Canada Hire - Edit ID<Country> and <GovID> and <SSNNumber>
    Then Canada Hire - Propose Compensation<Amount> and <Country>
    Then Canada Hire - Onboarding the employee <Country> and <FNemergencyConctOnBoard> and <LNemergencyConctOnBoard> and <RelationShpOnB> and <MailIdONB> and <MobileOnbard> and <JobProfile> and <DOB>

    Examples: Worker Details
      | Firstname    | Lastname  | Position                | Reason   | SSNNumber | SUPORG             | Country                  | GovID                   | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile           | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | HireDate   | AssociateType     | BusinessUnit                             | Department         | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | DOB      | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type | PayComponent | Batch_ID | InputType | Hours | Value |
#      | KRISTA MARIE | HOBBS     | NEW Test Position_105   | New Hire | 001001377 | SUP-00000000010000 | United States of America | Social Security Number  | HOME DEPOT | 13482000   | Salary      | 85000  | 3482     | Home Depot | SASM - SPECIALTY ASM | Full time | Associate  | 2/09/2012        | 2/10/2012        | 2/20/2012  | Regular Associate | NDS US NORTHERN DIVISION STORE ASSOCIATE | 001 ASSISTANT MGRS | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 603-433-8211 | 1/1/1949 | 2455 PACES        | FERRY RD          | CONCORD   | NH            | 03301           | Work      | BuildingNo:9989   | CarioStreet       | Work      | E0081 | 4206         | Hours    | 45.00     | 45.00 |
      | TestFirstN   | TestLastN | NEW Test Position_2001A | New Hire | 574253028 | SUP-00000000000710 | Canada                   | Social Insurance Number | HOME DEPOT | 17152000   | Hourly      | 13     | 7052     | Home Depot | SAIII                | Part time | Associate  | 12/20/2018       | 12/21/2018       | 01/08/2019 | Regular Associate | CWS CANADA WEST STORE ASSOCIATE          | 024 PAINT          | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | 1/1/1949 | DNo:106           | CarioStreet       | Toronto   | Alberta       | 100006          | Home      | BuildingNo:9989   | CarioStreet       | Work      | E0081 | 4206         | Hours    | 20.00     | 20.00 |


#  Canada test data generator
  @Synthetic_Testdata_Generator
  Scenario Outline: Hire Test data generator
    When Proxy as BP Admin
    And Hire Test data Generator <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile |
      | SUP-00000000000710 | Canada  | 01/08/2019 | 054266270 | SRPTMG     |


#  Canada test data generator with requisition
  @Test_Data_Generator_With_Requisition
  Scenario Outline: Canada_Test_Data_Generator with job requisition
    When Proxy as BP Admin
    And Hire associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile |
      | SUP-00000000000710 | Canada  | 2/9/2019  | 054266270 | SRPTMG |


#  Canada test data generator with requisition (6 Steps)
  @Synthetic_HireCanada_TestData_With_Requisition
  Scenario Outline: Hire Canada test data with requisition
    When Proxy as BP Admin
    Then Canada Hire With Requisition - Creating Job requisition <SUPORG> and <JobProfile> and <ReqReason> and <RecruitStartDate> and <TargetHireDate> and <Location> and <Company> and <CostCenter> and <Department>
    Then Canada Hire With Requisition - Hire from requisition
    Then Canada Hire With Requisition - Create Prehire <Country> and <EmailType> and <Home_addressline1> and <Home_addressline2> and <Home_city> and <Home_province> and <Home_state> and <Home_postalcode> and <Home_type>
    Then Canada Hire With Requisition - Hire Associate <HireDate> and <Reason>
    Then Canada Hire With Requisition - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
    Then Canada Hire With Requisition - Edit ID<Country> and <GovID>
    Then Canada Hire With Requisition - Propose Compensation<Amount> and <Country>
    Then Canada Hire With Requisition - Onboarding the employee <Country> and <FNemergencyConctOnBoard> and <LNemergencyConctOnBoard> and <RelationShpOnB> and <MailIdONB> and <MobileOnbard> and <JobProfile> and <DOB>

    Examples: Worker Details
    | SUPORG              | JobProfile  | ReqReason     | RecruitStartDate  | TargetHireDate  | Location  | Company     | CostCenter  | Department      | Country | EmailType | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_state  | Home_postalcode | Home_type | HireDate    | Reason    | BusinessUnit                    | GovID                    |  Amount  | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          |  MailIdONB                | MobileOnbard | DOB      |
    | SUP-00000000000710  | SRPTMG      | Add to Staff  | 12/01/2018        | 12/02/2018      | 7052      | HOME DEPOT  | 17152000    | 003 STORE MGRS  | Canada  | Work      | DNo:106           | CarioStreet       | Toronto   | Alberta       |  Ontario    | 100006          | Home      | 01/08/2019  | New Hire  | CWS CANADA WEST STORE ASSOCIATE | Social Insurance Number  |  85000   | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 9876542310   | 1/1/1949 |


                                #---------------------------------------------------------------------#


#  US Test data generator (6 Steps)
  @Synthetic_HireUS_TestData
  Scenario Outline: Hire US test data
    When Proxy as BP Admin
    And  US Hire - Create position in an organization <SUPORG> and <Position> and <Location> and <JobFamily> and <JobProfile> and <TimeType>  and <WorkerType> and <AvailabilityDate> and <EarliestHireDate>
    And  US Hire - Create Pre-hire with Firstname and Lastname<Country> and <Firstname> and <Lastname> and <Home_city> and <Home_province> and <Home_postalcode> and <Home_type> and <Work_addressline1> and <Work_type>
    Then US Hire - Hire Associate<Reason> and <Position> and <SUPORG> and <AssociateType> and <JobProfile> and <TimeType> and <Location> and <PayRateType> and <HireDate>
    Then US Hire - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
    Then US Hire - Edit ID<Country> and <GovID> and <SSNNumber>
    Then US Hire - Propose Compensation<Amount> and <Country>
    Then US Hire - Onboarding an employee<Country> and <FNemergencyConctOnBoard> and <LNemergencyConctOnBoard> and <RelationShpOnB> and <MailIdONB> and <MobileOnbard> and <JobProfile> and <DOB>

    Examples: Worker Details
      | Firstname    | Lastname | Position              | Reason   | SSNNumber | SUPORG             | Country                  | GovID                  | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile           | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | HireDate  | AssociateType     | BusinessUnit                             | Department         | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | DOB      | Home_addressline1 | Home_addressline2 | Home_city | Home_province | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type | PayComponent | Batch_ID | InputType | Hours | Value |
      #| TestQueeen    | NEW Test Position_65 | New Hire | 001001329 | SUP-00000000010008 | United States of America | Social Security Number | HOME DEPOT | 13482000   | Salary      | 85000  | 3482     | Home Depot | ASM - ASST STORE MANAGER | Full time | Associate  | 3/20/2004        | 3/21/2004        | 3/25/2004 | Regular Associate | NDS US NORTHERN DIVISION STORE ASSOCIATE | 001 ASSISTANT MGRS | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 603-433-8211 | 1/1/1949  | 2455 PACES        | FERRY RD          | NORTHFIELD | NH            | 03276           | Work      | BuildingNo:9989   | CarioStreet       | Work       E0081        | 4206     | Hours     | 45.00 | 45.00 |
      | KRISTA MARIE | HOBBS    | NEW Test Position_105 | New Hire | 001001377 | SUP-00000000010000 | United States of America | Social Security Number | HOME DEPOT | 13482000   | Salary      | 85000  | 3482     | Home Depot | SASM - SPECIALTY ASM | Full time | Associate  | 2/09/2012        | 2/10/2012        | 2/20/2012 | Regular Associate | NDS US NORTHERN DIVISION STORE ASSOCIATE | 001 ASSISTANT MGRS | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 603-433-8211 | 1/1/1949 | 2455 PACES        | FERRY RD          | CONCORD   | NH            | 03301           | Work      | BuildingNo:9989   | CarioStreet       | Work      | E0081        | 4206     | Hours     | 45.00 | 45.00 |


#  US Test data generator with requisition
  @US_Test_Data_Generator_WithRequisition
  Scenario Outline: US_Test_Data_Generator
    When Proxy as BP Admin
    And Hire US associate with job requisition <SUPORG> and <Country> and <Hiredate> and <SSNNumber> and <JobProfile>

    Examples: Worker Details
      | SUPORG             | Country | Hiredate   | SSNNumber | JobProfile |
      | SUP-00000000009400 | United States Of America  | 2/9/2019  | 054266270 | SASM - SPECIALTY ASM |


#  US test data generator with requisition (6 Steps)
  @Synthetic_HireUS_TestData_With_Requisition
  Scenario Outline: Hire US test data with requisition
    When Proxy as BP Admin
    Then US Hire With Requisition - Creating Job requisition <SUPORG> and <JobProfile> and <ReqReason> and <RecruitStartDate> and <TargetHireDate> and <Location> and <Company> and <CostCenter> and <Department>
    Then US Hire With Requisition - Hire from requisition
    Then US Hire With Requisition - Create Prehire <Country> and <EmailType> and <Home_addressline1> and <Home_addressline2> and <Home_city> and <Home_province> and <Home_state> and <Home_postalcode> and <Home_type>
    Then US Hire With Requisition - Hire Associate <HireDate> and <Reason>

    Then US Hire With Requisition - Organization Assignments<Company> and <CostCenter> and <BusinessUnit> and <Department>
    Then US Hire With Requisition - Edit ID<Country> and <GovID>
    Then US Hire With Requisition - Propose Compensation<Amount> and <Country>
    Then US Hire With Requisition - Onboarding an employee<Country> and <FNemergencyConctOnBoard> and <LNemergencyConctOnBoard> and <RelationShpOnB> and <MailIdONB> and <MobileOnbard> and <JobProfile> and <DOB>

    Examples: Worker Details
      | Firstname    | Lastname | Position              | RecruitStartDate  | TargetHireDate  | ReqReason     | Reason   | SSNNumber | SUPORG             | EmailType | Country                  | GovID                  | Company    | CostCenter | PayRateType | Amount | Location | JobFamily  | JobProfile           | TimeType  | WorkerType | AvailabilityDate | EarliestHireDate | HireDate   | AssociateType     | BusinessUnit                             | Department         | FNemergencyConctOnBoard | LNemergencyConctOnBoard | RelationShpOnB          | MailIdONB                 | MobileOnbard | DOB      | Home_addressline1 | Home_addressline2 | Home_city  | Home_province | Home_state | Home_postalcode | Home_type | Work_addressline1 | Work_addressline2 | Work_type | PayComponent | Batch_ID | InputType | Hours | Value |
      | KRISTA MARIE | HOBBS    | NEW Test Position_105 | 12/18/2018        | 12/19/2018      | Add to Staff  | New Hire | 001001377 | SUP-00000000009400 | Work      | United States of America | Social Security Number | HOME DEPOT | 10914000   | Salary      | 85000  | 0914     | Home Depot | SASM - SPECIALTY ASM | Full time | Associate  | 2/09/2012        | 2/10/2012        | 01/01/2019 | Regular Associate | NDS US NORTHERN DIVISION STORE ASSOCIATE | 001 ASSISTANT MGRS | john                    | ballla                  | Immediate Family Member | john_ballla@homedepot.com | 603-433-8211 | 1/1/1985 | 2455 PACES        | FERRY RD          | Anchorage |  Ontario       | Alaska     | 99501           | Home      | BuildingNo:9989   | CarioStreet       | Work      | E0081        | 4206     | Hours     | 45.00 | 45.00 |
