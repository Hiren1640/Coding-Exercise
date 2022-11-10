Feature: Nopcommerce Login

  @E2E @Regression @Login
  Scenario: Nopcommerce Login Test
    Given User click on Login Option
    And User is on login page and Verify the Login page Title
    When User Enter Username and Password and Click on Login
    Then User is on Homepage