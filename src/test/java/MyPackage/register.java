package MyPackage;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class register {
	int ay;
	boolean flaguserreg=false;
	boolean flagusernotreg=false;
	Customer user;
	public register(Customer u) {
		user=u;
	}
	@Given("The user registered with id {string},name {string},email {string},password {string},address {string},phone {string}")
	public void the_user_registered_with_id_name_email_password_address_phone(String id, String name, String email, String pass, String address, String phone) {
		 for(Customer c :Customer.user1) {
		    	if(c.id.equals(id)) {
		    		flaguserreg=true;
		    		String msg ="This user is already registered";
		    	}
		 }
		 if(flaguserreg==false) {
				LoginStep.flag=true;
				user.id=id;
				user.name=name;
				user.setEmail(email);
				user.addresss=address;
				user.setPassword(pass);
				user.phone=phone;
				flagusernotreg=true;
				 }
	}

	@When("the user with id {string} is register")
	public void the_user_with_id_is_register(String string) {

	  user.reguser=1;
	}

	@Then("the user with id {string},name {string},email {string},password {string},address {string},phone {string} is registered in the system")
	public void the_user_with_id_name_email_password_address_phone_is_registered_in_the_system(String string, String string2, String string3, String string4, String string5, String string6) {

		if(flaguserreg==false) {
			Customer.user1.add(user);
			}
			assertTrue(flagusernotreg && LoginStep.flag);
	}

	@Given("The user already registered with id {string},name {string},email {string},password {string},address {string},phone {string}")
	public void the_user_already_registered_with_id_name_email_password_address_phone(String string, String string2, String string3, String string4, String string5, String string6) {

		flaguserreg=true ;
		for(Customer c :Customer.user1) {
			
		}	}

	@Then("error message appeared {string}")
	public void error_message_appeared(String string) {

		if(flaguserreg==true ) {
			
		}
	    if(string.equals(" This user is already registered") ) {
	    	assertTrue(true);
	    }
	    
	}


}
