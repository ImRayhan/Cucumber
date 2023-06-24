Feature: Ebay Home page Scenarios




@smoke
  Scenario: Advanced Search Link
    Given I am on Ebay Home Page
    When I click on Advanced Link
    Then I navigate to Advanced Search
