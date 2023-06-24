Feature: Ebay Advanced Search

  @regression
  Scenario: Ebay Logo on Advanced Search
    Given I am on Ebay Advanced Search Page
    When I click on Ebay Logo
    Then I am navigate to Ebay Home PAge

  @regression1
  Scenario: Search item count
    Given I am On Ebay  Home Page
    When I search for 'iphone 11'
    Then I validate atleast 1000 search item present
    
#using same senerio multifle values dont have to write stepdefination
#also any of the action in scenario if same dont have to write hard coading again just copy from diffrent scenario would be work good
  @regression2
  Scenario: Search item count2
    Given I am On Ebay  Home Page
    When I search for 'iphone 10'
    Then I validate atleast 200 search item present
#smal smal paremitar
  @regression3
  Scenario: Search an item in category
    Given I am On Ebay  Home Page
    When I search for 'soap' in 'Baby' category
#big paremitar table read row colum
  @regression4
  Scenario: Advanched search an item
    Given I am on Ebay Advanced Search Page
    When I advanced search an item
      | keyword   | exclude     | min | max  |
      | iphone 11 | refubrished | 300 | 9000 |
