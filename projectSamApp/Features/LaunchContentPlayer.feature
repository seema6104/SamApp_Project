Feature: Reduce the number of retakes on launch of the content player and not on the launch of the start dialog box
Scenario: Reduce retakes on launch content player

 Given Student user launched browser
 When User Launch SAM URL "https://sam.cengage.com/App/login?ReturnUrl=%2f"
 And User enters Email as "sample_student@swlearning.com" and Password as "Password1"
 And Click on Login
 When Student user Navigates to Activity List under Activities
 And Student user clicks on SAM assignment
 And Assignment Start dialog box opens
 Then Retake of the assignment should not get reduced 
 
 
       
       