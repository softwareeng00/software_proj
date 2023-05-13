Feature: Distribute the orders on the available workers

  Scenario: the worker has no task
    Given the workerdoesnt has any prduct to clean   
    And Worker enter here information  Workername "Ahmed",WorkerAddress "Nablus ",WorkerPhoneNumber 1, Workerdate "ss", Workeremail "awwad" , Workerpass "sw"
    And the worker not in a break
    When the worker with "id "can start cleaning
  
    Then the worker with "id " can start clean the product

  
  Scenario: worker has a task
    Given the worker with "id" has a work at this time
    When the worker with "id" working now
    Then the worker with "id" can not cleaning more product