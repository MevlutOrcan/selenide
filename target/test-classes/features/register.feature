@register
Feature: Register

  @registerAndDelete
  Scenario: Register
    Given Navigate to url "/"
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify text "New User Signup!" is visible
    And Enter name and email address
    And Click Signup button
    And Verify text ENTER ACCOUNT INFORMATION is visible
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox Sign up for our newsletter!
    And Select checkbox Receive special offers from our partners!
    And Fill details: First name, Last name, Company, Address, AddressTwo, Country, State, City, Zipcode, Mobile Number
    And Click Create Account button
    And Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    And Verify that Logged in as username is visible
    And Click Delete Account button
    And Verify that "Account Deleted!" is visible and click Continue button

  @registerWithExistingEmail
  Scenario: Register User with existing email
    Given Navigate to url "/"
    And Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify text "New User Signup!" is visible
    And Enter name and already registered email address
    And Click Signup button
    And Verify text "Email Address already exist!" is visible
#    And Verify error 'Email Address already exist!' is visible