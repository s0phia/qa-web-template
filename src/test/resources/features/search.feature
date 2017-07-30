Feature: Sample

  @ui @pageobject
  Scenario: Should be able to search for a product from the input box
    Given John is viewing the Etsy landing page
    When he searches for a product from the input box
    Then the result should be displayed

  @ui @screenplay
  Scenario: Should be able to search for a product from the input box (screenplay)
    Given John is viewing the Etsy landing page (screenplay)
    When he searches for a product from the input box (screenplay)
    Then the result should be displayed (screenplay)

  @ui @pageobject
  Scenario Outline: Should be able to search for a product from the drop-down menu
    Given John is viewing the Etsy landing page
    When he searches for a product: '<Menu Item>' from the drop-down menu
    Then the result should be displayed on page with header

    Examples:
      | Menu Item                       |
      | Weddings/Decorations/Plants     |
      | Clothing & Accessories/Clothing |

  @ui @pageobject
  Scenario: Should be able to search for a product from the icons
    Given John is viewing the Etsy landing page
    When he searches for a product 'Clothing' from the icons
    Then the result should be displayed on page with header

  @api
  Scenario: Search listings - should retrieve details for an existing listing
    Given an existing listing
    When a request is made to search for the listing by Id
    Then the listing details are returned

  @api
  Scenario: Search listings - should return an error for a listing that does not exist
    Given a non-existing listing
    When a request is made to search for the listing by Id
    Then a listing not found message is returned