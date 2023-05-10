

Feature: Cleaning system report

  Scenario: Number of cleaning agent in the system
    Given I have a number of product in the system 
    And I have Number of agent to clean product 
    When agent is more than or equal "500"
    Then No need to bring another agent 
    
  Scenario: Number of cleaning agent in the system
    Given I have a number of product in the system 
    And I have Number of agent to clean product 
    When agent is less than or equal "499"
    Then  need to bring another agent
    
  Scenario: Number of Product in system
    Given I have a number of product in the system  "60"
    When complete product clean is "34"
    Then send them to the delivary department
    
   Scenario: Number of Product in system
    Given I have a number of product in the system  "60"
    When not complete product clean is "26"
    Then send them to the cleaning department
        