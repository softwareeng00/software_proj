Feature: Notify The Customer
  
 
    
  Scenario: the product ready
    Given product clean finish
    When finished clean 
    Then product ready to give to customer 
    
  Scenario:  if customer has an valid email 
    Given the customer with this email "email"
    When the email found "email" in step
    Then send message to the email "email" in this step
    
  Scenario:  if customer has not add an valid email 
    Given sending message to the  "phone" number in step
    When the customer doesnt get the calling message in email "email" in step
    Then send message to the number "phone" in this step
    
    
  Scenario: sending message 
    Given the message sent to the "email"
    When the product ready
    Then send message to the number "email" succesd
    