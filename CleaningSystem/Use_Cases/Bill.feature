Feature: invoice for customer
  
  Scenario: Create bill for customer successful
    Given Product with id "3" cleaning has been completed
    And  This piece is for the customer with email "ayamoinn@gmail.com" , adderss is "Nablus"
    When cleaning has been completed
    And the price is "300" , Highet is "3" , Width is "2",  name of item for the custmoer "Textured", count of item "2" , adderss is "Nablus" , phone "0598456507"
    And the price for delivery is "20"
    And total price is given "320"
    Then Create bill success
    

  
  Scenario: Create bill for customer not successful
    Given Product with id "3" cleaning has been not completed
    When The product is in state clean or waiting
    Then create bill not success
    
    
  Scenario: Delivary to give the product to customer
  Given Product with id "3" cleaning has been completed
  And Create bill success for customer 
  When communicate with customer to inform him of the delivery of the product with phone "0598456507"
  And The time to reach customer is "1 hour" 
  And the price for delivery is "20"
  Then reach the product to customer success 
  
    

    
