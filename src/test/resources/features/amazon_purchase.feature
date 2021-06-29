Feature: Smoke test suite for purchasing items from various online retailers.

  @smoke @smk1
  Scenario Outline: Smoke tests for electrical goods purchasing.

    Given the client is on Amazon home page
    When the client searches for this <item> on the Amazon
    And it is less than <maximum budget>
    Then client will add it to their basket

    Examples:
      | item                                                   | maximum budget |
      | The Doggfather CD album by Snoop Dogg                  | 10.00          |
      | A 4th generation Amazon Echo Dot                       | 30.00          |
