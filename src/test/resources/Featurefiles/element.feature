Feature: admin login

  Scenario: user login with valid credentials
    Given navigate to application
    When i enters the valid input
    And hits on the login button
    Then home page should be displayed
