Feature: user login to the cleaning system
	

Scenario: User can login
	Given that the user is not logged in
	And the email is "ayamoinn@gmail.com"
	And the password is "useruser"
	Then the user login succeeds
	And the user is logged in
	
Scenario: User has the wrong password or email
	Given that the user is not logged in
	And the email is "ayamoinn@gmail.com"
	And the password is "user11"
	Then the user login fail
	And the user is not logged in
	
	Scenario Outline: Admin or Worker can login
	Given that the admin or worker is not logged in
	And the email is <email> and the pass <pass>
	Then the admin or worker login succeeds
	And the admin or worker is logged in
	Examples: 
      | name     | email                  | pass      | status   |
      | "ahmed"  | "ahmedmoeen@gmail.com" | "ahmed22" | Admin    |
      | "aya"    | "ayamoinn44@gmail.com" | "ayaaya1" | worker   |
      | "jad"    | "jadmohmd33@gmail.com" | "jad3333" | worker   |
      | "mohamd" | "mohmd55t44@gmail.com" | "mohmd36" | worker   |