Feature:  Custom Questions on Office 365 Subjects
Background: Below are the common steps for each scenario
     Given non student user Launch browser
     When User Launch SAM URL "https://sam.cengage.com/App/login?ReturnUrl=%2f"
     And User enters Email as "instructor_sample@swlearning.com" and Password as "Password1"
     Then Clicks on login take User to Dashboard
     
Scenario:  Add Custom Questions workflow
     Given Non student user is on Sam Assignment page
     When User clicks on exam tab under assignments tab
     And Click on Add Custom Questions tab
     And User enters all the Required Fields
     And Save and Close saves questions 
     Then message display "Your custom question has been saved successfully."
     Then Takes users to a custom questions list





