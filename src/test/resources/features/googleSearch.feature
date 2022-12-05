Feature: Check google search functionality
  Scenario: Validate google search is working

    Given  browser is open

    When user is on google search page
    And user clicks on search botton

    Then user is navegated to the Search Results Page
