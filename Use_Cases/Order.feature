
Feature: Clening system Customer  
Scenario: first tracking
Given the user add a product 
And user add the type of ProductName "Textured", ProeductID "1"  
Then Product ready to start cleaning

Scenario:  start cleaning cycle
Given the product waiting to start cleaning 
And product ready up tp treatment 
Then Product ready to treatment

Scenario: treatment product
Given the product start treatment cycle 
And the worker get the product to clean 
Then treatment cycle finished

Scenario: treatment product
Given the product start treatment cycle 
And the worker get the product to clean 
Then treatment cycle finished

Scenario: treatment product
Given the product start treatment cycle 
And the worker get the product to clean 
Then treatment cycle finished


Scenario: complete cleaning product
Given the product cleaning cycle finished 
And the worker get the product ready to hand in product
Then completed