@WebSearch
Feature: Web Search

  @Google
  Scenario Outline: Google search Verification
    Given user lands on the Google home page
    When page title is Google
    Then enter search string "<searchText>"
    Examples:
      | searchText |
      | Selenium   |
      | Python     |
      | Java       |
  @Bing
  Scenario Outline: Bing search Verification
    Given user lands on the Bing home page
    When page title is Bing
    Then enter search string "<searchText>" on Bing
    Examples:
      | searchText |
      | Selenium   |
      | Python     |
      | Java       |