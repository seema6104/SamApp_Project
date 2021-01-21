Feature: Reports link on the LPN launch the instructor reports.
Background: Below are the common steps for each scenario
     Given student user Launch browser
     When User Launch SAM URL "https://sam.cengage.com/App/login?ReturnUrl=%2f"
     And User enters Email as "sample_student@swlearning.com" and Password as "Password1"
     Then Clicks on login take User to Dashboard

Scenario: launch the instructor reports.
     When Student Clicking on the report under reports link 
     And launch the instructor reports screen 
     Then Screen reader support enabled.