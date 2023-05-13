package mypackage;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class availableWorker {
	
	public static boolean flagworker=false;

	
	
	
	


@Given("the workerdoesnt has any prduct to clean")
public void the_workerdoesnt_has_any_prduct_to_clean() {
  
}
@Given("Worker enter here information  Workername {string},WorkerAddress {string},WorkerPhoneNumber {int}, Workerdate {string}, Workeremail {string} , Workerpass {string}")
public void worker_enter_here_information_workername_worker_address_worker_phone_number_workerdate_workeremail_workerpass(String string, String string2, Integer int1, String string3, String string4, String string5) {
	Worker.printWorker();
	Worker.workerName();
	Worker.prodinclean();
	Worker.getPassword();
	Worker W=new Worker();
	Worker.getPhone();
	Worker.getAdder();
	
	W.creatWorker(string, string2, int1,string4,string5);
	flagworker=true;
}





@Given("the worker not in a break")
public void the_worker_not_in_a_break() {
	Worker.breakTime();

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
