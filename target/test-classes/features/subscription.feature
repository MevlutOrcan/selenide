@subscription
Feature: Subscription

  Scenario: TC10 Verify Subscription in home page
    And Navigate to url '/'
    And Verify that home page is visible successfully
    And Scroll down to footer
    And Verify text SUBSCRIPTION
    And Verify text "SUBSCRIPTION" is visible
    And Enter email address in input and click arrow button
    And Verify text "You have been successfully subscribed!" is visible