package myPackage;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myPackage.ProductMain;

public class report {
	int ay;
	boolean flagprod=false;
	boolean flagagent=false;
	boolean flagcomplete=false;
	ProductMain p;
	public report() {
		p=new ProductMain();
	}
	
	@Given("I have a number of product in the system")
	public void i_have_a_number_of_product_in_the_system() {
	   
	    flagprod=true;
	}

	@Given("I have Number of agent to clean product")
	public void i_have_number_of_agent_to_clean_product() {
	   
	    flagagent=false;
	}

	@When("agent is more than or equal {string}")
	public void agent_is_more_than_or_equal(String string) {
	   
	    int t=Integer.parseInt(string);
	    boolean f=p.numberOfAgentInSystem(t);
	    if(f) {
	    flagagent=true;
	    }
	}

	@Then("No need to bring another agent")
	public void no_need_to_bring_another_agent() {
	  
	    assertTrue(flagagent);
	}

	@When("agent is less than or equal {string}")
	public void agent_is_less_than_or_equal(String string) {
	   		int t=Integer.parseInt(string);
	    boolean f=p.numberOfAgentInSystem(t);
	    if(f==false) {
	    flagagent=false;
	    }
	    
	}

	@Then("need to bring another agent")
	public void need_to_bring_another_agent() {
	  	assertTrue(!flagagent);
	}

	@Given("I have a number of product in the system  {string}")
	public void i_have_a_number_of_product_in_the_system(String string) {
	   
	    int u=Integer.parseInt(string);
	    flagcomplete=true;
	}

	@When("complete product clean is {string}")
	public void complete_product_clean_is(String string) {
	   
	    if(flagcomplete) {
	    	
	    }
	}

	@Then("send them to the delivary department")
	public void send_them_to_the_delivary_department() {
	   
	    assertTrue(flagcomplete);
	}

	@When("not complete product clean is {string}")
	public void not_complete_product_clean_is(String string) {
	   
	    flagcomplete=false;
	}

	@Then("send them to the cleaning department")
	public void send_them_to_the_cleaning_department() {
	   
		assertTrue(!flagcomplete);
	}

}




