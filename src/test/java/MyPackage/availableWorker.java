package MyPackage;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class availableWorker {
	int ay;
	public static boolean flagworker=false;

	
	

@Given("the workerdoesnt has any prduct to clean {string}")
public void the_workerdoesnt_has_any_prduct_to_clean(String string) {
  flagworker =true;
}

@Given("the worker not in a break")
public void the_worker_not_in_a_break() {
	  flagworker =true;
}

@When("the worker with \"id \"can start cleaning")
public void the_worker_with_id_can_start_cleaning() {
	  flagworker =true;
}

@Then("the worker with {string} can start clean the product")
public void the_worker_with_can_start_clean_the_product(String string) {
  assertTrue(  flagworker);
}

@Given("the worker with {string} has a work at this time")
public void the_worker_with_has_a_work_at_this_time(String string) {
	  flagworker =false;
}

@When("the worker with {string} working now")
public void the_worker_with_working_now(String string) {
	flagworker =false;
}

@Then("the worker with {string} can not cleaning more product")
public void the_worker_with_can_not_cleaning_more_product(String string) {
  assertTrue(!flagworker);
}

}
