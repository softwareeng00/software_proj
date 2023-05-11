package MyPackage;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class order {

	
	int ay;
		public static boolean flag1=false;
		public static boolean flag2=false;
		public static boolean flag3=false;
		public static boolean flag4=false;
		public static boolean flag5=false;
		public static boolean flag6=false;

		@Given("the user add a product")
		public void the_user_add_a_product() {
			

		}

		@Given("user add the type of ProductName {string}, ProeductID {string}")
		public void user_add_the_type_of_product_name_proeduct_id(String string, String string2) {
		 
			ProductMain c= new ProductMain();
			if(c.id.equals(string2) && c.name.equals(string))
			{
				flag1=true;
				
			}
			
		
			
			
	    	}

		@Then("Product ready to start cleaning")
		public void product_ready_to_start_cleaning() {
			
			assertTrue(flag1);
		}
		
		

		@Given("the product waiting to start cleaning")
		public void the_product_waiting_to_start_cleaning() {
			
			flag1=ProductMain.productInWaiting();
		if(flag1)
			flag2=true;
			
		  
		   
		
		}
		
	

		@Given("product ready up tp treatment")
		public void product_ready_up_tp_treatment() {
		   ProductMain.productInCleaning();
			
		}

		@Then("Product ready to treatment")
		public void product_ready_to_treatment() {
			assertTrue(flag2);

		}

	

		@Given("the worker get the product to clean")
		public void the_worker_get_the_product_to_clean() {
			 Worker.workerproduct();

		}

		@Then("treatment cycle finished")
		public void treatment_cycle_finished() {
		assertTrue(flag1);

			
		}
		
		
		@Given("the product start treatment cycle")
		public void the_product_start_treatment_cycle() {
		    		}
		
		
		@Given("the worker get the product ready to hand in product")
		public void the_worker_get_the_product_ready_to_hand_in_product() {
			ProductMain.productInWaiting();
			ProductMain.productInCleaning();
			
			flag1=ProductMain.productCompleted();
			if(flag1)
				flag3=true;
		}


		@Given("the product cleaning cycle finished")
		public void the_product_cleaning_cycle_finished() {
		
			ProductMain.productCompleted();
		
		}

		@Then("completed")
		public void completed() {
			assertTrue(flag3);

		}
		
		
		
		
	}

