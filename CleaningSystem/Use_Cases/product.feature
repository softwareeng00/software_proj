Feature: Clening system Product  

Scenario: Create product successfully
Given the user is login with email "ayamoinn@gmail.com"
And User enter information of product id "3",type "carpet",name "Textured ",image "pic1.jpg",description "Lint threads",special treatment "VIP", high "3",width "2"
When Creating product succes 
Then product is created

Scenario: Create product not success
Given the user is login with email "ayamoinn@gmail.com"
And there is product empty 
When creating product is failed 
Then product not created 

Scenario: Add product 
Given the user is login with email "ayamoinn@gmail.com"
And the user created product succesflully 
And need to add another product with id "4",type "carpet", name "tufted ",image "pic2.jpg",description "kototn", special treatment "VIP" , high "3",width "2"
When adding product is success
Then added product


Scenario: update product 
Given the user created product succesflully 
And Update the product with id "3"
And Update product with  id "3",type "carpet", name "Axminster carpets",image "pic1.jpg",description "Lint threads", special treatment "NOT VIP", high "3",width "2"
When Product update success
Then The Product with id "3" update
And the new product is updated 

Scenario: delete product 
Given the user created product succesflully  
And Delete the product with id "3"
When delete product is success 
Then The product is deleted 