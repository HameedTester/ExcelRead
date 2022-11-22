
Feature: Verify Login Functionality

  
  Scenario: Verify Facebook Login
    Given User Launch the Browser
    
    When User Enter "username" and "password"
    And User clicks the Login Button
    
    Then Verify the Login Page
    
    Scenario: Verify Facebook Login
    Given User Launch the Browser
    
    When User Enter "oranium" and "12345"
    And User clicks the Login Button
    
    Then Verify the Login Page
    

  