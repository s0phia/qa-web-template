Feature: Registration

  @api @registration @wip
  Scenario Outline: Should NOT be able to register with invalid registration details
    Given invalid registration details - field '<Field>' has value '<Value>'
    When a request is made to register
    Then an error response is returned
    Examples:
      | Field      | Value |
      | First Name | 2     |
      | First Name |       |
      | Email      | @.com |
      | Password   | 6     |
