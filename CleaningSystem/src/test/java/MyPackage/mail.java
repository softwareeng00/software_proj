package MyPackage;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class mail {
	
	int ay;
	public static boolean  flagin=false;
	Customer a = new Customer();
	public static boolean  flagmail=false;


	
	@Given("product clean finish")
	public void product_clean_finish() {
		
	   flagin=true;
		
		
	}

	@When("finished clean")
	public void finished_clean() {
		flagin=true;
	}

	@Then("product ready to give to customer")
	public void product_ready_to_give_to_customer() {
	assertTrue(flagin);
	}

	@Given("the customer with this email {string}")
	public void the_customer_with_this_email(String string) {
	 
		if(a.checkemail(string)==1 )
    	{
    	LoginStep.flag=true;
    		
    	}
    else
    {
    	LoginStep.flag=false;

    }
   
	}

	@When("the email found {string} in step")
	public void the_email_found_in_step(String string) {
	    if(LoginStep.flag)
	    {
	    	flagin=true;
	    }
	}

	@Then("send message to the email {string} in this step")
	public void send_message_to_the_email_in_this_step(String string) {
	   assertTrue(flagin);
	}

	@Given("sending message to the  {string} number in step")
	public void sending_message_to_the_number_in_step(String string) {
		
		
		if(a.checkPhone(string)==0)
		{
			flagin=false;
			
		}
		else
			flagin=true;
		
	}

	@When("the customer doesnt get the calling message in email {string} in step")
	public void the_customer_doesnt_get_the_calling_message_in_email_in_step(String string) {
	   if(a.checkPhone(string)==1)
	   
		   flagin=true;
	   
	   
		
	}

	@Then("send message to the number {string} in this step")
	public void send_message_to_the_number_in_this_step(String string) {
	    assertTrue(flagin);
		
	}

	@Given("the message sent to the {string}")
	public void the_message_sent_to_the(String string) {
		flagmail=true;
		
	}

	@When("the product ready")
	public void the_product_ready() {
		flagmail=true;
	}

	@Then("send message to the number {string} succesd")
	public void send_message_to_the_number_succesd(String string) {
	    assertTrue(flagmail);
	}


}
