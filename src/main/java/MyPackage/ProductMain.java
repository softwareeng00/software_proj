package mypackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class ProductMain {
	  String id;
	
	 String type;
	 static boolean inwait=false;
	 static boolean incleaning=false;
	 static boolean completed=false;
	 private static final Logger logger = Logger.getLogger(ProductMain.class.getName());
	 String name;
	 String image;
	 String description;
	 String high;
	 String width;
	 String specialtreatment;
	 static List<ProductMain> prod =new ArrayList<>() ;
  
 public ProductMain() {
	         this.id="1";
	         this.type="carpet";
	         this.name="Textured";
	         this.description="Lint threads";
	         this.specialtreatment="yes";
	         this.image="im1";
	         this.high="40";
	         this.width="70";
	       
	 		if( prod.isEmpty())
	         prod.add(this);
		     
    }
	public void createProduct(String id,String type,String name,String des,String sp,String high,String width)
	{
		this.id=id;this.type=type;this.description=des;
		this.name=name;
		this.specialtreatment=sp;
		this.high=high;this.width=width;
		
		
		if(!prod.contains(this))
			prod.add(this);
		
		
		
	}
	public void updateProduct(String id1,String type,String name,String des,String sp,String high,String width)
	{
		this.id=id1;this.type=type;this.description=des;
		this.name=name;this.specialtreatment=sp;
		this.high=high;this.width=width;
		
		
		for(int i=0;i<prod.size();i++)
		{
			
		if(prod.get(i).id.equals(id1))
		  prod.set(i, this);
		}
	
	}
	public void deleteProduct(String id)
	{
	
		
		for(int i=0;i<prod.size();i++)
		{
			if(prod.isEmpty())
				break;
			else if(prod.get(i).id.equals(id)) {
				prod.remove(i);
				
			}
			    
			
		}
	
	}

	public static void printProduct() {
		for(int i=0;i<ProductMain.prod.size();i++)
		{
			String ayya="Product : "+ProductMain.prod.get(i).id+" "+ProductMain.prod.get(i).name+" "+ProductMain.prod.get(i).type+" "+
					ProductMain.prod.get(i).description+" " +ProductMain.prod.get(i).high+" "+ProductMain.prod.get(i).width;
			logger.info(ayya);
		}
		
	}
	public static boolean productInWaiting() {
		  
		
		  
		 CountDownLatch semaphore = new CountDownLatch(1);
	

	
		  try {
			 
			  boolean time= !semaphore.await(2, TimeUnit.SECONDS);
			  if(time)
				  inwait=true;
				
			
			
		} catch (InterruptedException e) {
		
			
			 Thread.currentThread().interrupt();
		}

		  
		  semaphore.countDown();
		
		
		  
		return inwait;
	
	}
	public static boolean productInCleaning() {
			
		 
		 if(inwait ) {
			 CountDownLatch semaphore = new CountDownLatch(1);
	

		  
		  try {
			  boolean time= !semaphore.await(2, TimeUnit.SECONDS);
			  if(time)
				  incleaning =true;
				
			
			
		} catch (InterruptedException e) {
			
			
			 Thread.currentThread().interrupt();
		}

		  
		  semaphore.countDown();
		
		 }
		return incleaning;
		}
	

		public static boolean productCompleted() {
			
			 if(inwait && incleaning) {
			 CountDownLatch semaphore = new CountDownLatch(1);
		

			  
			  try {
				  boolean time= !semaphore.await(2, TimeUnit.SECONDS);
				  if(time)
					  completed =true;
					
				
				
			} catch (InterruptedException e) {
				
				
			       Thread.currentThread().interrupt();
			}

			
			  semaphore.countDown();
			
			 }
			return completed;
		}
	public static void delivary() {
		 CountDownLatch semaphore = new CountDownLatch(1);
				for(int i=0;i<prod.size();i++)
				{Customer.addresss="Nablus";
					
						try {
							Customer.user1.get(i);
							if(Customer.addresss.equals("Nablus") ){
								boolean a= semaphore.await(1, TimeUnit.SECONDS);
								if(a)
								{
									logger.info("Reach");
								}
								}
							
						} catch (InterruptedException e) {
							
							
							  Thread.currentThread().interrupt();
						}
					}
					
				}
		
	public boolean numberOfAgentInSystem(int x) {
		boolean flagagent=false;
		if(x>=500) 
			flagagent=true;
		else
			flagagent=false;
		return flagagent;
	
		
		
	}
	public static int numberprodag() {
		
	return  (500 - 2*10);
	
	}
	public static int numberprodeq() {
	
	
		
		
		
		
		return  (120 - 2*3);
	}
	public static int proderror() {
		int exact=100;
		
		int approx=(int)(100 * 0.5);
		if(approx >=40) {
			approx-=40;
		}
	
		 
		
		return (exact-approx);
	}
	
	
	
	
}