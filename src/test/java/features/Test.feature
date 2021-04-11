Feature: Google search

  Scenario Outline: Google search Verification
    Given user lands on the home page
    When page title is Google
    Then enter search string "<searchText>"
    Examples:
      | searchText |
      | Selenium   |
      | Python     |
      | Java       |