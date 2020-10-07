Feature: Feature to test Login Functionality

@smokeTest
  Scenario: Check Login is successful with valid credentials
    Given User is on Login page
    When User enter username & password
    And Click on Login button
    Then User is navigated to Home page
