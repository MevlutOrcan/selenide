Feature: Contact Us Form

  @contactUs
  Scenario: TC06 Contact Us Form
    And Navigate to url "/"
    And Verify that home page is visible successfully
    And Click on Contact Us button
    And Verify text "Get In Touch" is visible
    And Enter name, email, subject and message
    And Upload file
    And Click Submit button
    And Click OK button
    And Verify text "Success! Your details have been submitted successfully." is visible
#    And Click Home button and verify that landed to home page successfully