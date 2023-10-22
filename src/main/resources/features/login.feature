Feature: Login Web SAUCE DEMO QA
  #TCC.DEMOQA.001
  Scenario: Login Valid Test
    Given User enter url DEMOQA
    When User input valid username
    And User input valid password
    And User click button login
    Then User get text account on dashboard

    #TCC.DEMOQA.002
  Scenario: Login with Password Invalid Test
    Given User logout
    When User input valid username
    And User input invalid password
    And User click button login
    Then User get text password incorret

     #TCC.DEMOQA.003
  Scenario: Login with Empty Password Test
    Given User input empty password
    And User click button login
    Then User get text password empty