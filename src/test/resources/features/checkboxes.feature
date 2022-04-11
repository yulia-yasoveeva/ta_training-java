Feature: Test checkbox page

  Scenario: all 4 checkboxes are checked
    Given I am on main page
    When I check all 4 checkboxes
    Then label changes to "Uncheck All"