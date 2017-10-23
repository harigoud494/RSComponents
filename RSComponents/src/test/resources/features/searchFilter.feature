@facet
Feature: Search Facets in product Listing Page


Scenario: Select the brand facet in product listing page
Given I am in HomePage
And I select brand from all brands
And I select category from brand page
When I filter with "Brand" facet
Then I should see all filter results 

Scenario: Select the Range facet in product listing page
Given I am in HomePage
And I select brand from all brands
And I select category from brand page
When I filter with "Range" facet
Then I should see all filter results 

Scenario: Select the Series facet in product listing page
Given I am in HomePage
And I select brand from all brands
And I select category from brand page
When I filter with "Series" facet
Then I should see all filter results 
