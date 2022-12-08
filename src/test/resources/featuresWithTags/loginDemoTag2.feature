# language: en

Feature: Test login functionality

  #Tag to direct the feature
  @strike
  Scenario Outline: Check login is successful with valid credentials

    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home

    Examples:
      | username | password |
      | Alan | 12345 |
      | Lucas | 12345 |
