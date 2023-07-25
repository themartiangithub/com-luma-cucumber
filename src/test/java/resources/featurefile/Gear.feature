@Regression
Feature: Gear Test

  As a user I want to add an overnight duffle bag into shopping cart

  @Smoke
  Scenario: User should add product successfully to shopping cart
    Given I am on home page
    When I mouse hover on gear menu
    And I click on bags
    And I click on product name Overnight Duffle
    And I change the quantity "3"
    And I click on Add to cart button
    Then I verify the text of the product "You added Overnight Duffle to your shopping cart."
    And I click on shopping cart link into messae
    Then I verify the produt name "Overnight Duffle"
    Then I verify the quantity "3"
    Then I Verify the product price "$135.00"
    And I Change quantity to "5"
    And I click on update shopping cart button
    Then I Verify the price of the product "$225.00"