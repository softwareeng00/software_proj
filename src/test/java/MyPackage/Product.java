package MyPackage;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Product {
	int ay;
	static boolean flagcreateprod=false;
	static boolean flagproduct=false;
	static boolean deleteflag= false;
	static boolean flagadd= false;
	static boolean flagupdate= false;
	ProductMain product;
	ProductMain p;
	Customer user;
	public Product() {
		user=new Customer();
		product=new ProductMain();
		p=new ProductMain();
	}
   

    @Given("the user is login with email {string}")
    public void the_user_is_login_with_email(String string) {
	   
    	if(user.checkemail(string)==1 )
    	{
    		LoginStep.flag=true;
    		
    	}
    	
    	
	    
	}
    @Given("User enter information of product id {string},type {string},name {string},image {string},description {string},special treatment {string}, high {string},width {string} ,flagprod {string}")
    public void user_enter_information_of_product_id_type_name_image_description_special_treatment_high_width_flagprod(String id1, String type, String name, String image, String description, String specialtreatment, String high, String width, String string9) {
     
    	  
        
    		if(LoginStep.flag==true) {
    		for(ProductMain c :ProductMain.prod) {
    			if(c.id.equals(id1)) {
    	    		flagproduct=true;
    	    		
    	    		
    	    		String msg ="This user is already registered";
    	    	}
    	 }
    		
    	  if(flagproduct==string9.equals("false")) {
    		  
    		  
    		    product.id=id1;
    	    	product.type=type;
    	    	product.name=name;
    	    	product.image=image;
    	    	product.description=description;
    	    	product.specialtreatment=specialtreatment;
    	    	product.high=high;
    	    	product.width=width;
    	    	
    	    	
    	    	
    	  }
    		}
    }



		

@When("Creating product succes flagproduct {string}")
public void creating_product_succes_flagproduct(String string) {
 
	 if(flagproduct==string.equals("false")) {
		   flagcreateprod=true;
			product.createProduct(product.id,product.type , product.name,  product.description, product.specialtreatment,product.high,product.width);
			}
}
		
		
		
	
	  
	

	@Then("product is created")
	public void product_is_created() {
	   
		
			assertTrue(flagcreateprod);
	}
	@Given("there is product empty")
	public void there_is_product_empty() {
	   
		flagproduct=false;
		flagcreateprod=false;
		
	}

	@When("creating product is failed")
	public void creating_product_is_failed() {
	    
		
	}

	@Then("product not created")
	public void product_not_created() {
	   
		assertTrue(!flagproduct && !flagcreateprod);
	  
	}

	@Given("the user created product succesflully")
	public void the_user_created_product_succesflully() {
	    
		if(flagcreateprod) {
			flagadd=true;
		}
		else
			flagadd=false;
	}

	@Given("need to add another product with id {string},type {string}, name {string},image {string},description {string}, special treatment {string} , high {string},width {string}")
	public void need_to_add_another_product_with_id_type_name_image_description_special_treatment_high_width(String id, String type, String name, String im, String des, String sp, String high, String width) {
	   
		
		if(flagadd==false) {
			p.id=id;
	    	p.type=type;
	    	p.name=name;
	    	p.image=im;
	    	p.description=des;
	    	p.specialtreatment=sp;
	    	p.high=high;
	    	p.width=width;
	    	flagadd=true;
		}
		

	}

	@When("adding product is success")
	public void adding_product_is_success() {
	 
		if(flagadd==true) {
			flagcreateprod=true;
			p.createProduct(p.id,p.type , p.name,  p.description, p.specialtreatment,p.high,p.width);

		}
	   
	}

	@Then("added product")
	public void added_product() {
	    
		assertTrue(flagadd && flagcreateprod);
	    
	}

	@Given("Update the product with id {string}")
	public void update_the_product_with_id(String id1) {
	   
		for(int i=0;i<ProductMain.prod.size();i++)
		{
		if(ProductMain.prod.get(i).id.equals(id1))
		{
			flagupdate=true;
		}
		}
	}


@Given("Update product with  id {string},type {string}, name {string},image {string},description {string}, special treatment {string}, high {string},width {string} ,flagprodupdate {string}")
public void update_product_with_id_type_name_image_description_special_treatment_high_width_flagprodupdate(String id, String type, String name, String im, String des, String sp, String high, String width, String string9) {
   
		if(flagupdate==string9.equals("true")) {
			p.id=id;
	    	p.type=type;
	    	p.name=name;
	    	p.image=im;
	    	p.description=des;
	    	p.high=high;
	    	p.width=width;
	    	p.specialtreatment=sp;
	    	
		}
	    
	}
		
	
	    
	

@When("Product update success string {string}")
public void product_update_success_string(String string) {
  

		
		if(flagupdate==string.equals("false")) {
			flagupdate=true;
			p.updateProduct(p.id,p.type, p.name,  p.description, p.specialtreatment,p.high,p.width);

		}
}
	   
	

	@Then("The Product with id {string} update")
	public void the_product_with_id_update(String string) {
	
		assertTrue(flagupdate);
	 
	}

	@Then("the new product is updated")
	public void the_new_product_is_updated() {
	   
		assertTrue(flagupdate);
	}

	@Given("Delete the product with id {string}")
	public void delete_the_product_with_id(String id1) {
	   
	    ProductMain p=new ProductMain();
	    p.deleteProduct(id1);
	}

	@When("delete product is success")
	public void delete_product_is_success() {
	   
	    deleteflag=true;
	}

	@Then("The product is deleted")
	public void the_product_is_deleted() {
	  
		assertTrue(deleteflag);
	    
	}

}