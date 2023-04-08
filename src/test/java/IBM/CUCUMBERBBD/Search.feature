Feature: Searching of various categories product along with product search

  Scenario: Search for product under book category products
    Given i visit website as a guest user
    When i select book option from drop down
    And i click on search icon
    Then i should see book pages is loaded
    And i should see book at Amezon as heading
    But i should not see other product

  Scenario: Search for the products under Baby category
    Given I visit the website as a guest user
    When I select the Baby option from the dropdown
    And I click on Search icon button
    Then I should see the Baby page loaded
    And I should see The baby store as heading
    But I should not see other category products
