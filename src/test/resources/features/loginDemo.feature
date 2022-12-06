# language: en

Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials

    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home

    Examples:
      | username | password |
      | Pedro | 12345 |
      | Ricardo | 12345 |
