Feature: Editing 2016 and 2019 exams
Background: Logged In to SAM  App as Instructor
    Given Instructor user is on Dash board
Scenario: User Editing exam assignment
    When User is clicking on Edit under Actions on assignment
    When User is on Edit page and editing the info
    Then User clicks on save assignment will be created.
    Then User can view the assignment under Assignment
    