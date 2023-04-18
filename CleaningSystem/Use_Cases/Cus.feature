Feature: Clening system Customer  
Scenario: Create Customer successfully
Given the user is login with the email "ayamoinn@gmail.com" 
And User enter here information  CustomerName "Ahmed",CustomerPhoneNumber "0595",CustomerAddress "Nablus ",CustomerAge "20"
Then Customer is created

Scenario: Create Customer not success
Given the user is login with the email "ayamoinn@gmail.com" 
And the Customer information empty 
When creating customer is failed 
Then customer not created 

Scenario: Add Customer 
Given the user is login with the email "ayamoinn@gmail.com" 
And User enter here information  CustomerName "Ahmed",CustomerPhoneNumber "0595",CustomerAddress "Nablus ",CustomerAge "20"
And the user created succesflully 
When adding Customer is success
Then added Customer

Scenario: update Customer 
Given the user created succesflully 
And Update the Customer with CustomerPhoneNumber "0599"
And Update Customer with CustomerName "Ahmed",CustomerPhoneNumber "0595",CustomerAddress "Nabluss ",CustomerAge "22"
When Customer update success
Then The Customer with id "3" update
And the new Customer is updated 

Scenario: delete Customer 
Given the user created succesflully  
And Delete the product with CustomerPhoneNumber "0599"
When delete Customer is success 
Then The Customer is deleted