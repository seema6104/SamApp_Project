Feature: Sam App Student login
Scenario: Login with Student user credentials
Given User Launch Chrome browser
When User Launch SAM URL "https://sam.cengage.com/App/login?ReturnUrl=%2f"
And User enters Email as "sample_student@swlearning.com" and Password as "Password1"
And Click on Login
Then Page Title should be "SAM - Activity Calendar"
When User click on Sign out 
Then Page Title should be "SAM - Login"
And close browser



    



 


