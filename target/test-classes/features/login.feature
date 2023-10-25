@login
Feature: Login

  Scenario: TC02 Login User with correct email and password
    And Navigate to url '/'
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify text "Login to your account" is visible
    And Enter correct email address and password
    And Click Login button
    And Verify that Logged in as username is visible
#    And Click Delete Account button
#    And Verify that "Account Deleted!" is visible and click Continue button

  @loginNegative
  Scenario: TC03 Login User with incorrect email and password
    And Navigate to url "/"
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify text "Login to your account" is visible
    And Enter incorrect email address and password
    And Click Login button
    And Verify text "Your email or password is incorrect!" is visible

  @logout
  Scenario: TC04 Logout User
    And Navigate to url "/"
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify text "Login to your account" is visible
    And Enter correct email address and password
    And Click Login button
    And Verify that Logged in as username is visible
    And Click Logout button
    And Verify that user is navigated to login page







