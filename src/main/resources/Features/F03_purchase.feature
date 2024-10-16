@smoke
Feature: Purchase Function

  Background:
    Given user open logged in the website

  Scenario: user  purchase products
    When user go to product page
    And user select Tshirts from men items
    And user add 2 items to cart
    And user go to cart page and apply that 2 items is displayed and price by RS
    And user go to the checkout page and makes sure the delivery address
    And user go to payment page
    And user fill payment data
    Then user payed and order placed is display