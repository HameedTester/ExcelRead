
Feature: Verify FaceBook Login Functionality
  
  Background:
  
    Given User Launch the Browser
  
    Scenario: Verify Login     
   	When User Enters "oranium@gmail.com" and "pass@123"
    And User Click the Login Button    
    Then Verify the Login Successfuly Message
    
    
    Scenario: Verify Login    
   	When User Enters "selenium" and "sel@123"
    And User Click the Login Button    
    Then Verify the Login Successfuly Message
    
  
