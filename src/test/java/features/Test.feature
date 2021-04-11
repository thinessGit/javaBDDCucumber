Feature: Google search

  Scenario Outline: Login Verification
    Given user lands on the home page
    When page title is Google
    Then enter search string
    Examples:
      | searchText |
      | Selenium   |
      | Python     |
      | Java       |