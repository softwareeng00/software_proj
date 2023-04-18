Feature: Clening system discount  

Scenario: Discount to the customer by the number of product
Given User login with email "ayamoinn@gmail.com"
And the user send "6" product to cleaning system 
Then the user pay the price of product to "5"
And the last one is free

Scenario: Discount to the customer by the price
Given the user is login with email "ayamoinn@gmail.com"
And the price of the user "500"
Then the user pay the price of product after discount 10% "450" 


Scenario: Discount for the new customer
Given the user is not login 
When the user login with email "ayaawwad@gmail.com"
And the price of the new user "300"
Then  user pay the price of product after discount 5% "285"
