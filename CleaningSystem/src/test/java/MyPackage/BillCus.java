package MyPackage;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillCus {
	int ay;
	public static boolean flagbill=false;
	
	public static boolean flagtrack=false;
	
	
	ProductMain p;
	Customer c;
	Bill b;
	int priceproduct;
	int totalprice;

	public static boolean flagdel=false;
	
	
	public BillCus() {
		p=new ProductMain();
		c=new Customer();
		b=new Bill();
		
	}
	
	@Given("Product with id {string} cleaning has been completed")
	public void product_with_id_cleaning_has_been_completed(String string) {
	    // Write code here that turns the phrase above into concrete actions
		p.id=string;
		for(ProductMain c :ProductMain.prod) {
	    	if(c.id.equals(string))
	    	Product.flagcreateprod=true;
		    else 
			Product.flagcreateprod=false;
		}
	   
	}

	@Given("This piece is for the customer with email {string} , adderss is {string}")
	public void this_piece_is_for_the_customer_with_email_adderss_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		c.setEmail(string);
		for(Customer c :Customer.user1) {
	    	if(c.getEmail().equals(string)) 
	    		LoginStep.flag=true;
		    else 
		    	LoginStep.flag=false;
		}
		
	   
	}

	@When("cleaning has been completed")
	public void cleaning_has_been_completed() {
	    // Write code here that turns the phrase above into concrete actions
		flagbill=true;
	    
	}
	@When("the price is {string} , Highet is {string} , Width is {string},  name of item for the custmoer {string}, count of item {string} , adderss is {string} , phone {string}")
	public void the_price_is_highet_is_width_is_name_of_item_for_the_custmoer_count_of_item_adderss_is_phone(String price, String height, String width, String prod, String countprod, String adderess, String phone) {
	
	    // Write code here that turns the phrase above into concrete actions
		int con=Integer.parseInt(countprod);
		int heig=Integer.parseInt(height);
		int widt=Integer.parseInt(width);
		
		if(flagbill && Product.flagcreateprod ) {
			priceproduct=b.priceProd(heig,widt,con);
			totalprice=b.totalPriceofproduct(heig,widt,con);
			
			
		}
	    
	}

	@When("the price for delivery is {string}")
	public void the_price_for_delivery_is(String del) {
	    // Write code here that turns the phrase above into concrete actions
		b.pricefordelivery=Integer.parseInt(del);
		
	    
	}

	@When("total price is given {string}")
	public void total_price_is_given(String total) {
	    // Write code here that turns the phrase above into concrete actions
		//totalprice=320;
		
		if(totalprice==Integer.parseInt(total) )//|| Integer.parseInt(total)==620
		{
			flagbill=true;
		}
		else
			flagbill=false;
			
	    
	}

	@Then("Create bill success")
	public void create_bill_success() {
	    // Write code here that turns the phrase above into concrete actions
	   assertTrue(flagbill);
	}

	@Given("Product with id {string} cleaning has been not completed")
	public void product_with_id_cleaning_has_been_not_completed(String string) {
	    // Write code here that turns the phrase above into concrete actions
		//flag from class Track 
		// code when make feature Track
		flagtrack=false;
	}

	@When("The product is in state clean or waiting")
	public void the_product_is_in_state_clean_or_waiting() {
	    // Write code here that turns the phrase above into concrete actions
		flagtrack=false;
	    
	}

	@Then("create bill not success")
	public void create_bill_not_success() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(!flagtrack);
	   
	}

    @Given("Create bill success for customer")
    public void create_bill_success_for_customer() {
        // Write code here that turns the phrase above into concrete actions
        flagbill=true;
    }
	@When("communicate with customer to inform him of the delivery of the product with phone {string}")
	public void communicate_with_customer_to_inform_him_of_the_delivery_of_the_product_with_phone(String phone) {
	    // Write code here that turns the phrase above into concrete actions
	    if(flagbill) {
	    	for(Customer c :Customer.user1) {
	    		if(c.phone.equals(phone)) 
		    	{
	    			//calling 
		    		String Call="callhim";
		    	}
	    	}
		    	
	    }
	}

	@When("The time to reach customer is {string}")
	public void the_time_to_reach_customer_is(String string) {
	    // Write code here that turns the phrase above into concrete actions
		if(string.equals("1 hour"))
		{
		flagdel=true;	
		}
	    
	}

	@Then("reach the product to customer success")
	public void reach_the_product_to_customer_success() {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(flagbill && flagdel);
	}



}
