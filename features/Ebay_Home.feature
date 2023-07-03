Feature: Ebay Home page Scenarios

  @smoke @beforespecificHooks @afterspecificHooks
  Scenario: Advanced Search Link
    Given I am on Ebay Home Page
    When I click on Advanced Link
    Then I navigate to Advanced Search

  @reg
  Scenario Outline: Home page links
    Given I am on Ebay Home Page
    When I click on '<link>'
    Then I navigate that page navigates to '<url>' and title contains '<title>'

    Examples: 
      | link        | url                                                                | title                                |      |
      | Motors      | https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334     | eBay Motors: Auto Parts and Vehicles |      |
      | Fashion     | https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545 | Toys & Hobbies products for sale     |      |
      | Electronics | https://www.ebay.com/b/Electronics/bn_7000259124                   | Electronics products for sale        | eBay |
