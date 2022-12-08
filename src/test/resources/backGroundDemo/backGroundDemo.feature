Feature: check home page functionality

  Background :
    Given user is on login page
    When user enters username and password
    And user clicks on login
    Then user is navigated to the homepage


  Scenario: check logout button
    When user clicks on logout button
    Then logout button is not displayed


  Scenario: verify test example is displayed
    When user clicks on dashboard link
    Then quick launch toolbar is displayed
