@SmokeScenario
Feature: feature to test login functionality

  @SmokeTest
  Scenario: Check login is successful with valid credentials

    Given is on login page
    When user enters username and password
    And clicks on login button
    Then user is navegated to the home page

  Scenario Outline: Check login is successful with valid credentials

    Given is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navegated to the home page

    Examples:
      | username  | password |
      | user1    | pass1 |
      | user2 | pass2 |