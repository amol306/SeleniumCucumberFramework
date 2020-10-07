Feature: Feature to test Google Search functionality

  @GoogleSearch
  Scenario: Validate Google Search is working
    Given Browser is open
    And User is on Google Search Page
    When User enters text to search
    And User hit Enter
    Then User navigate to search results
