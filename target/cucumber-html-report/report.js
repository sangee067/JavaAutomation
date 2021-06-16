$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/userjourney.feature");
formatter.feature({
  "name": "User order T-Shirt",
  "description": "  Description: Place an order and verify the order history",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ui"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Place an order for T shirt and verify the order history",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the Home page",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks on the SignIn button",
  "keyword": "When "
});
formatter.step({
  "name": "User should be navigated to the signin page",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters username \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User enters password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Sign in button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be navigated to Login Landing page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on T-Shirts button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be navigated to category page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on add to card button",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on proceed to checkout button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be navigated to order summary page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on proceed to checkout button for address",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on proceed to checkout button for shipping",
  "keyword": "And "
});
formatter.step({
  "name": "User accepts the terms and condition by clicking the check box",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on proceed to checkout button for payment",
  "keyword": "And "
});
formatter.step({
  "name": "User should be navigated to payment method page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on Pay by bank wire button",
  "keyword": "When "
});
formatter.step({
  "name": "User should be navigated to order summary page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on I confirm my order button",
  "keyword": "And "
});
formatter.step({
  "name": "User should see the order confirmation message",
  "keyword": "Then "
});
formatter.step({
  "name": "User should clicks on back to order link",
  "keyword": "When "
});
formatter.step({
  "name": "User should be navigated to order history page",
  "keyword": "Then "
});
formatter.step({
  "name": "User should able to verify the order reference number with transaction order reference number",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "Password"
      ]
    },
    {
      "cells": [
        "sangeetha067@gmail.com",
        "test1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Place an order for T shirt and verify the order history",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@ui"
    }
  ]
});
formatter.step({
  "name": "User is on the Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefs.userIsOnTheHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the SignIn button",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.userClicksOnTheSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be navigated to the signin page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.userShouldBeNavigatedToTheSigninPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username \"sangeetha067@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.userEntersUsername(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password \"test1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.userEntersPassword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.userClicksOnSignInButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be navigated to Login Landing page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.userShouldBeNavigatedToLoginLandingPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on T-Shirts button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.userClicksOnTShirtsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be navigated to category page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.userShouldBeNavigatedToCategoryPage()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: Verify CategoryPage is opened expected [true] but found [false]\r\n\tat org.testng.Assert.fail(Assert.java:96)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:776)\r\n\tat org.testng.Assert.assertTrue(Assert.java:44)\r\n\tat stepdefinitions.Stepdefs.userShouldBeNavigatedToCategoryPage(Stepdefs.java:60)\r\n\tat ✽.User should be navigated to category page(file:src/test/resources/features/userjourney.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks on add to card button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.userClicksOnAddToCardButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on proceed to checkout button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.userClicksOnProceedToCheckoutButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be navigated to order summary page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.userShouldBeNavigatedToOrderSummaryPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on proceed to checkout button for address",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.userClicksOnProceedToCheckoutButtonForAddress()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on proceed to checkout button for shipping",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.userClicksOnProceedToCheckoutButtonForShipping()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User accepts the terms and condition by clicking the check box",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.userAcceptsTheTermsAndConditionByClickingTheCheckBox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on proceed to checkout button for payment",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.userClicksOnProceedToCheckoutButtonForPayment()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be navigated to payment method page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.userShouldBeNavigatedToPaymentMethodPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on Pay by bank wire button",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.userClicksOnPayByBankWireButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be navigated to order summary page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.userShouldBeNavigatedToOrderSummaryPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on I confirm my order button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.userClicksOnIConfirmMyOrderButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see the order confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.userShouldSeeTheOrderConfirmationMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should clicks on back to order link",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefs.userShouldClicksOnBackToOrderLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be navigated to order history page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefs.userShouldBeNavigatedToOrderHistoryPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should able to verify the order reference number with transaction order reference number",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefs.userShouldAbleToVerifyTheOrderReferenceNumberWithTransactionOrderReferenceNumber()"
});
formatter.result({
  "status": "skipped"
});
});