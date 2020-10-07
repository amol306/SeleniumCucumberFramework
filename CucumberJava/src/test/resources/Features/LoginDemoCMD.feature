Feature: Test Login Functionality

  @Login_Valid
  Scenario: Check login functionality is working with valid credentials
    Given browser is open
    And user is on Login page
    When user enters "Amol" & "12345"
    And user clicks on login button
    Then user navigated to Home page

  @Login_invalid
  Scenario: Check login functionality is not working with invalid credentials
    Given browser is open
    And user is on Login page
    When user enter invalid credentials "Jagtap" & "8765"
    And user clicks on login button
    Then user get invalid credentials message
