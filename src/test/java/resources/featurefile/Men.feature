@Regression
Feature: Men test

  As user I want to add a product in to shopping cart.

  @Smoke
  Scenario: User should add product successfully to shopping cart
    Given I am on home page
    When I Mouse Hover on Men Menu
    And I Mouse Hover on Bottoms
    And I click on Pants
    And I mouse hover on product name Cronus Yoga Pant and click on size
    And I mouse Hover on product name Cronus Yoga Pant and click on colour Black
    And I Mouse Hover on product name Cronus Yoga Pant and click on Add to cart button
    Then I verify the text "You added Cronus Yoga Pant to your shopping cart."
    And I click on Shopping cart link into message
    Then I verify the text of "Shopping Cart"
    Then I verify the product name "Cronus Yoga Pant"
    Then I Verify the product size "32"
    Then I verify the product colour "Black"
