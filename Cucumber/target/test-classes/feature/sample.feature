

Feature: Verify Login Functionality of Facebook
  
  
    Scenario Outline: 
    
    Given User launch the Browser
    
    When User Enters the <username> and <password>
    
    And User click the Login Button
    Then User validate the outcomes
    
    
    
    Examples:
    
    |username||password|
    |oranium||1234|
    |selenium||!@#$%^|
    |java||pass@123|
     |chrompet||java@123|
    
    
    
    
    

  