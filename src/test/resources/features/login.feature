Feature: Login

  @ui @pageobject @login
  Scenario: Should NOT be able to see personalised icon if not logged in
    Given John is not logged in
    When he is viewing the Etsy landing page
    Then the personalised icon is not displayed
    And the sign in button is displayed


  @ui @pageobject @login @wip
  Scenario: Should be able to see personalised icon when logged in
    Given John is logged in
    When he is viewing the Etsy landing page
    Then the personalised icon is displayed
    And the sign in button is not displayed