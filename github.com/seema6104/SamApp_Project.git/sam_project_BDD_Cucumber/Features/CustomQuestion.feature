Feature:  Custom Questions on Office 365 Subjects

Background: 
  
    When user can see Dashboard
     And User is on Sam Assignment page
    Then User clicks on exam tab under assignments tab
     
Scenario:  Add Custom Questions workflow
    
     And Click on Add Custom Questions tab
     And User enters all the Required Fields
     And Save and Close saves questions 
     Then message display "Your custom question has been saved successfully."
     Then Takes users to a custom questions list

Scenario:  Edit Custom Questions Workflow with value 
      When: Non student user is clicking on Edit function, under Actions, on Custom Questions List 
       And: Non student user is on Custom Question - Edit page
       And: Entering  value in  picked/selected/entered
      Then: Saved copied changes display on the Custom Questions List.

Scenario:  Edit Custom Questions Workflow without value
      When: Non student user is clicking on Edit function, under Actions, on Custom Questions List 
       And: Non student user is on Custom Question - Edit page
       And: not entering  value in  picked/selected/entered
      Then: pop-up window to open telling the user to "Please enter data....
         
Scenario: Copy Custom Question Workflow with value entered
      When: Non student user is clicking on copy function, under Actions, on Custom Questions List  of Office 365 subjects 
       And: Non student user is on Custom Question - copy page
       And: Entering  value in  picked/selected/entered
      Then: Copy custom question appears on the Custom Question List.
     
Scenario: Deactivate Custom Question Workflow
       When: Non student user is clicking on Deactivate function, under Actions, on Custom Questions List  of Office 365 subjects 
       Then: a pop-up window displaying a warning message "Do you really want to deactivate this question"
       Then: User clicks OK to deactivates the custom question.
        And: The user dont see the custom question



    #|  Email                          |  Password |
    #| instructor_sample@swlearning.com|   Password1|   

