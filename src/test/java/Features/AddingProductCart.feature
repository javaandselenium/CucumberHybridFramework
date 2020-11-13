Feature: Cart

  Scenario: Adding the select product to cart
    Given Open the browser enter the valid url
    When Seraching for the product
    And  sort it according to lowest price
    Then Select the product
    And Select the quatity and color and size
    Then product should succesfully added to cart

  