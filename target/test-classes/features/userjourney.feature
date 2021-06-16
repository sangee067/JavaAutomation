@ui
Feature: User order T-Shirt
  Description: Place an order and verify the order history

  Scenario Outline: Place an order for T shirt and verify the order history
    Given User is on the Home page
    When User clicks on the SignIn button
    Then User should be navigated to the signin page
    And User enters username "<email>"
    And User enters password "<Password>"
    And User clicks on Sign in button
    Then User should be navigated to Login Landing page
    And User clicks on T-Shirts button
    Then User should be navigated to category page
    And User clicks on add to card button
    And User clicks on proceed to checkout button
    Then User should be navigated to order summary page
    And User clicks on proceed to checkout button for address
    And User clicks on proceed to checkout button for shipping
    And User accepts the terms and condition by clicking the check box
    And User clicks on proceed to checkout button for payment
    Then User should be navigated to payment method page
    When User clicks on Pay by bank wire button
    Then User should be navigated to order summary page
    And User clicks on I confirm my order button
    Then User should see the order confirmation message
    When User should clicks on back to order link
    Then User should be navigated to order history page
    And User should able to verify the order reference number with transaction order reference number




    Examples:
      | email                  | Password |
      | sangeetha067@gmail.com | test1234  |
