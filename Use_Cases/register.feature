
Feature: register user to Cleaning system
Description: a user register by id ,name ,email,address,password and phone  
  

  
  Scenario: register users successfully
    Given The user registered with id "1",name "Aya Moeen",email "ayamoin95@gmail.com",password "ayamoeen",address "nablus",phone "0598456507"
    When the user with id "1" is register
    Then the user with id "1",name "Aya Moeen",email "ayamoin95@gmail.com",password "ayamoeen",address "nablus",phone "0598456507" is registered in the system
   
    
  Scenario: register users not successfully
    Given The user already registered with id "1",name "Aya Moeen",email "ayamoin95@gmail.com",password "ayamoeen",address "nablus",phone "0598456507"
    When the user with id "1" is register
    Then error message appeared " This user is already registered" 
   
   
