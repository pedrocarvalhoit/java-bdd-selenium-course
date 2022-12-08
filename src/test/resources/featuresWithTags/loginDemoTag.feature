# language: en

Feature: Test login functionality

  #Tag to direct the feature
  @smoke
  Scenario Outline: Check login is successful with valid credentials

    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home

    Examples:
      | username | password |
      | Thamires | 12345 |
      | Luisa | 12345 |
