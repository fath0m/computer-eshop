Feature: Create a new computer
  Scenario: new computer
    Given user wants to create a new computer
    When user submits a post request
    Then computer is created