Feature: Validate on Add to Cart functionality

  Scenario: Verify user can add item to cart
    Given user opens the website
    Then verify user is on homepage
    When user clicks on search icon and enters the item "search.item"
    And click on search button
    And clicks on item if it shows list
    Then verify user is on the product page of "search.item"
    When user selects the color of "item.color"
    And user selects the size of "item.size"
    And clicks on add to cart button
    Then verify user can get message of added
    When user clicks on cart icon
    Then verify user is on cart page
    And verify the "verify.item" is present on cart


    Scenario: Verify user cannot add a product without selecting color
      Given user opens the website
      Then verify user is on homepage
      When user clicks on search icon and selects the shirts
      Then verify user is on the product list page
      When user is clicks on first product
      Then verify user is on the product page
      When user clicks on add to cart button
      Then verify cart icon has zero items