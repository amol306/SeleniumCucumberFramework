Feature: Test Login Functionality

  @Login_Simple
  Scenario: Check login functionality is working with valid credentials
    Given browser is open
    And user is on Login page
    When user enters username & password
    And user clicks on login button
    Then user navigated to Home page

  @Login_Outline
  Scenario Outline: Check login functionality is working with valid credentials
    Given browser is open
    And user is on Login page
    When user enters <username> & <password>
    And user clicks on login button
    Then user navigated to Home page

    Examples: 
      | username | password |
      | Amol     |    12345 |
      | Wrong    | fault    |

  @Login_POM
  Scenario Outline: Check POM login functionality is working with valid credentials
    Given POM browser is open
    And POM user is on Login page
    When POM user enters <username> & <password>
    And POM user clicks on login button
    Then POM user navigated to Home page

    Examples: 
      | username | password |
      | Amol     |    12345 |

  @Login_PF
  Scenario Outline: Check POM login functionality is working with valid credentials
    Given PF browser is open
    And PF user is on Login page
    When PF user enters <username> & <password>
    And PF user clicks on login button
    Then PF user navigated to Home page

    Examples: 
      | username | password |
      | Amol     |    12345 |
      | Jagtap   | wrong    |
