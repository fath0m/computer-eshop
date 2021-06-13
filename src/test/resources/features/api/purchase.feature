Feature: Purchase from eshop
  Scenario: Purchase a computer
    Given user chose a computer
      And a cart was created
      And computer is added to the cart
      And checkout is made
      And payment is made
    Then payment was successful