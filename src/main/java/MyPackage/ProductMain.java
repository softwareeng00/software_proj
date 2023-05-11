package MyPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ProductMain {
	  String id;
	
	 String type;
	 static boolean inwait=false;
	 static boolean incleaning=false;
	 static boolean completed=false;
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
	public void createProduct(String id,String type,String name,String image,String des,String sp,String high,String width)
	{
		this.id=id;this.type=type;this.description=des;
		this.name=name;
		this.specialtreatment=sp;
		this.image=image;this.high=high;this.width=width;
		
		
		if(!prod.contains(this))
		prod.add(this);
		
		
		
	}
	public void updateProduct(String id1,String type,String name,String image,String des,String sp,String high,String width)
	{
		this.id=id1;this.type=type;this.description=des;
		this.name=name;this.specialtreatment=sp;
		this.image=image;this.high=high;this.width=width;
		
		
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
			if(prod.get(i).id.equals(id))
			prod.remove(i);
			
		}
	
	}
	public static void printProduct() {
		for(int i=0;i<ProductMain.prod.size();i++)
		{
			System.out.println("Product : "+ProductMain.prod.get(i).id+" "+ProductMain.prod.get(i).name+" "+ProductMain.prod.get(i).type+" "+
					ProductMain.prod.get(i).description+" " +ProductMain.prod.get(i).high+" "+ProductMain.prod.get(i).width);
		}
		
	}
	public static boolean productInWaiting() {
		  
		
		  
		 CountDownLatch semaphore = new CountDownLatch(1);
	

	
		  try {
			 
			  boolean time= !semaphore.await(2, TimeUnit.SECONDS);
			  if(time)
			 inwait=true;
				
			
			
		} catch (InterruptedException e) {
		
			e.printStackTrace();
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
			
			e.printStackTrace();
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
				
				e.printStackTrace();
			       Thread.currentThread().interrupt();
			}

			
			  semaphore.countDown();
			
			 }
			return completed;
		}
	public static void delivary() {
				
				for(int i=0;i<prod.size();i++)
				{
					
						try {
							if(Customer.user1.get(i).addresss.equals("Nablus")){
							TimeUnit.MINUTES.sleep(1);
								}
							
						} catch (InterruptedException e) {
							
							e.printStackTrace();
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
	public static int numberprodag(int n) {
		
	return (int) (500 - 2*Math.random());
	
	}
	public static int numberprodeq() {
	
	
		
		
		return (int) (120 - 2*Math.random());
	}
	public static int proderror() {
		int exact=100;
		int approx=(int)(100 * Math.random());
		if(approx >=40) {
			approx-=40;
		}
	
		 
		
		return (exact-approx);
	}
	
	
	
	
}
