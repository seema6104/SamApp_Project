Feature: Editing 2016 and 2019 exams
Background: Logged In to SAM  App as Instructor
Scenario: User Editing exam assignment
    Given User Launch Chrome browser
    When User Launch SAM URL "https://sam.cengage.com/App/login?ReturnUrl=%2f"
    And User enters Email as "instructor_sample@swlearning.com" and Password as "Password1"
    And Clicks on login
    Then User will be on Dashboard
    When User is clicking on Edit under Actions on assignment
    And User is on Edit page and editing the info
    And User clicks on save assignment will be created.
    Then User can view the assignment under Assignment