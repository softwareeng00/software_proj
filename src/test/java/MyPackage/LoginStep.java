package myPackage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myPackage.Admin;
import myPackage.Customer;
import myPackage.Worker;

import static org.junit.Assert.assertTrue;



public class LoginStep {
	int ay;
	Admin A;
	Worker W;
	Customer U;
	static boolean flag=false;
	static boolean flagadmin;
	static boolean flagworker;
	static boolean is_worker=false;
	static boolean is_admin=false;
	static boolean flagnotlogin=false;
	
	public LoginStep (Customer u, Admin a, Worker w ) {
		U=u;
		W=w;
		A=a;
	}
	
	@Given("that the user is not logged in")
	public void that_the_user_is_not_logged_in() {
	    flag=false;
	}
	@Given("the email is {string}")
	public void the_email_is(String string) {
		U.setEmail(string);
		if( U.checkemail(string)==1) {
			flag=true;
		}
		if( U.checkemail(string)==0) {
			flag=false;
		}
	}

	@Given("the password is {string}")
	public void the_password_is(String string) {
		 U.setPassword(string);
			if( U.checkpass(string)==1) {
				flag=true;
				if (!Customer.pass.contains(U.getPassword()))
					Customer.pass.add(U.getPassword());
			}
			if( U.checkpass(string)==0) {
				flag=false;
			
			 
			}
	}

	@Then("the user login succeeds")
	public void the_user_login_succeeds() {
	 
		 assertTrue(flag);
	}

	@Then("the user is logged in")
	public void the_user_is_logged_in() {
		
		 assertTrue(flag);
	}

	@Then("the user login fail")
	public void the_user_login_fail() {
	   
		assertTrue(!flag);
	}
	@Then("the user is not logged in")
	public void the_user_is_not_logged_in() {
	   
		assertTrue(!flag);
	}
	
	@Given("that the user is logged in")
	public void that_the_user_is_logged_in() {
	   
		flag=true;
	}

	@When("the user logs out")
	public void the_user_logs_out() {
	    
		flag=false;
	}
	
	
	@Given("that the admin or worker is not logged in")
	public void that_the_admin_or_worker_is_not_logged_in() {
	    
	    flagadmin=false;
	    flagworker=false;
	}

	@Given("the email is {string} and the pass {string}")
	public void the_email_is_and_the_pass(String string, String string2) {
	   
		if(string.equals("ahmedmoeen@gmail.com") ) {
			is_admin=true;
		 A.setPassword(string2);
		 A.setEmail(string);
			if( A.checkpass(string2)==1 && A.checkemail(string)==1 ) {
				flagadmin=true;
			}
			if( A.checkpass(string2)==0 || A.checkemail(string)==0) {
				flagadmin=false;
			}
		}
		else
		{
			is_worker=true;
			 W.setPassword(string2);
			 W.setEmail(string);
				if( W.checkpass(string2)==1 && W.checkemail(string)==1 ) {
					flagworker=true;
				}
				if( W.checkpass(string2)==0 || W.checkemail(string)==0) {
					flagworker=false;
				}
		}
			 
			
	}

	@Then("the admin or worker login succeeds")
	public void the_admin_or_worker_login_succeeds() {
	    
	    assertTrue(flagadmin || flagworker);
	}

	@Then("the admin or worker is logged in")
	public void the_admin_or_worker_is_logged_in() {
	   
		 assertTrue(flagadmin || flagworker);
	}
	@Given("that the admin or worker is logged in")
	public void that_the_admin_or_worker_is_logged_in() {
	    
		if(is_admin)
		    flagadmin=true;
		if(is_worker)
			flagworker=true;
	}

	@When("the admin or worker logs out")
	public void the_admin_or_worker_logs_out() {
	   
		if(is_admin)
		{
			flagadmin=false;
			is_admin=false;
		}
		if(is_worker)
		{
			flagworker=false;
			is_worker=false;
		}
	}

	@Then("the admin or worker is not logged in")
	public void the_admin_or_worker_is_not_logged_in() {
	    
		assertTrue(!flagadmin || !flagworker);
	}




}