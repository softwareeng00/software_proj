package MyPackage;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CusTest {
	int ay;
	public static boolean CustomerFlag=false;
	public static boolean flagadd=false;
	public static boolean flagupdate=false;
	public static boolean flagDelete=false;

	Customer c;
	Customer user;

	public CusTest() {
		user=new Customer();
		
	}

	@Given("the user is login with the email {string}")
	public void the_user_is_login_with_the_email(String string) {
	   
		
		if(user.checkemail(string)==1 )
    	{
    	LoginStep.flag=true;
    		
    	}
    else
    	LoginStep.flag=false;
    	
	 
	}

	@Given("User enter here information  CustomerName {string},CustomerPhoneNumber {string},CustomerAddress {string},CustomerAge {string}")
	public void user_enter_here_information_customer_name_customer_phone_number_customer_address_customer_age(String string, String string2, String string3, String string4) {
	 
		Customer b=new Customer();
		b.createCustomer(string, string2, string3, string4);
		CustomerFlag=true;
		}

	@Then("Customer is created")
	public void customer_is_created() {
		
		assertTrue(CustomerFlag);
		

	}

	@Given("the Customer information empty")
	public void the_customer_information_empty() {
		
		if(LoginStep.flag==false)
		{
			CustomerFlag=false;
		}

	
	}

	@When("creating customer is failed")
	public void creating_customer_is_failed() {
		CustomerFlag=false;
	}

	@Then("customer not created")
	public void customer_not_created() {
		assertTrue(!CustomerFlag);
	}

	@Given("the user created succesflully")
	public void the_user_created_succesflully() {
		
if(CustomerFlag==true)	
{
	
		flagadd=true;
		
	}
else
{
	flagadd=!false;
}
	

	}

	@When("adding Customer is success")
	public void adding_customer_is_success() 
		  {
		
		CustomerFlag=true;
}

	@Then("added Customer")
	public void added_customer() {
		assertTrue( CustomerFlag);
	}

	
	@Given("Update the Customer with CustomerPhoneNumber {string}")
	public void update_the_customer_with_customer_phone_number(String string) {
		
	    
		for(int i=0;i<Customer.customerData.size();i++)
		{
		if(Customer.customerData.get(i).getCustomerPhoneNumber()==string)
		{
			flagupdate=true;
		}
		}

		
		
	}

	@Given("Update Customer with CustomerName {string},CustomerPhoneNumber {string},CustomerAddress {string},CustomerAge {string}")
	public void update_customer_with_customer_name_customer_phone_number_customer_address_customer_age(String string, String string2, String string3, String string4) {
	   
		
	Customer s =new Customer();
	s.updatCustomer(string, string2, string3, string4);

	}

	@When("Customer update success")
	public void customer_update_success() {
	   
		flagupdate=true;


		
		
	}

	@Then("The Customer with id {string} update")
	public void the_customer_with_id_update(String string) {
		assertTrue(flagupdate);
	}

	@Then("the new Customer is updated")
	public void the_new_customer_is_updated() {
		assertTrue(flagupdate);

	}

	@Given("Delete the product with CustomerPhoneNumber {string}")
	public void delete_the_product_with_customer_phone_number(String string) {
	  
	    Customer C=new Customer();
	    C.deleteCustomer(string);

	}

	@When("delete Customer is success")
	public void delete_customer_is_success() {
		flagDelete=true;
	}

	@Then("The Customer is deleted")
	public void the_customer_is_deleted() {
		assertTrue(flagDelete);
	}

}
