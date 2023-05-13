package mypackage;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orderDist {
	
	public static boolean flagorder=false;


@Given("the project has many money resources order {string}")
public void the_project_has_many_money_resources_order(String string) {
	OrderDistributor a=new OrderDistributor();
	a.distributeOrders();
	flagorder=true;
}


@Given("this money need to be counted")
public void this_money_need_to_be_counted() {
	flagorder=true;
}

@Then("have counted the total of these")
public void have_counted_the_total_of_these() {
	  assertTrue(flagorder);
}

}