Feature: Sam App login
 
  Scenario: Login with user credentials
    When User Launch SAM URL 
    When User Login as Student 
    When User Login as Instructor 
    And  Clicks on login
    Then Student user can see Dashboard
    

    
   
# when we writing Secenario Outline, its for data driven testing, We will provide all set of data 
#in exmple keyword.
# if not doing data driven testing than only Secenario keyword
# Regular Exp. 
#1. \"([^\"]*)\"
#2. \"\"