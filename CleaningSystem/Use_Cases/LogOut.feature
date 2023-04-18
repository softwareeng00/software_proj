Feature: User logout
	
	
Scenario: User logs out
	Given that the user is logged in
	When the user logs out
	Then the user is not logged in
	
	Scenario: Admin or worker logs out
	Given that the admin or worker is logged in
	When the admin or worker logs out
	Then the admin or worker is not logged in
	
		