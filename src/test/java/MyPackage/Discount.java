package MyPackage;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Discount {
	int ay;
	int num=0;
	int price;
	boolean flagdis=false;
	boolean flagdis10=false;
	boolean flagdis5=false;
	Customer u;
	Bill B;
	public Discount() {
		u=new Customer();
		B=new Bill();
	}
	
@Given("User login with email {string}")
public void user_login_with_email(String string) {
	if(u.checkemail(string)==1 )
	{
		LoginStep.flag=true;
		
	}
	else
		LoginStep.flag=false;
}

@Given("the user send {string} product to cleaning system")
public void the_user_send_product_to_cleaning_system(String string) {
	 if(LoginStep.flag)
     num=Integer.parseInt(string);
    
}

@Then("the user pay the price of product to {string}")
public void the_user_pay_the_price_of_product_to(String string) {
     price=Integer.parseInt(string);
     int g=B.discountInNumber(num,price);
     
     if(g==(--num)) {
    	 flagdis=true;
     }
}

@Then("the last one is free")
public void the_last_one_is_free() {
    assertTrue(flagdis);
}

@Given("the price of the user {string}")
public void the_price_of_the_user(String string) {
    int myprice=Integer.parseInt(string);
    int t=B.discountInPrice10(myprice,10);
    if(t==450) {
    	flagdis10=true;
    }
}

@Then("the user pay the price of product after discount {int}% {string}")
public void the_user_pay_the_price_of_product_after_discount(Integer int1, String string) {
    assertTrue(flagdis10);
}

@Given("the user is not login")
public void the_user_is_not_login() {
	LoginStep.flag=false;
}

@When("the user login with email {string}")
public void the_user_login_with_email(String string) {
	u.setEmail(string);
	LoginStep.flag=true;
}

@When("the price of the new user {string}")
public void the_price_of_the_new_user(String string) {
   
    int myprice=Integer.parseInt(string);
    int t=B.discountInPrice10(myprice,5);
    if(t==285) {
    	flagdis5=true;
    }
    
}
@Then("user pay the price of product after discount {int}% {string}")
public void user_pay_the_price_of_product_after_discount(Integer int1, String string) {
    assertTrue(flagdis5);
}
}
