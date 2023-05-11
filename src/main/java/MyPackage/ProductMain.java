package MyPackage;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class ProductMain {
	public  String id;
	int ay;
	public String type;
	public static boolean inwait=false;
	public static boolean incleaning=false;
	public static boolean completed=false;
	public String name;
	public String image;
	public String description;
	public String high;
	public String width;
	public String specialtreatment;
	public static ArrayList<ProductMain> prod =new ArrayList<ProductMain>() ;
  
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
		  
		  boolean timeout=false;
		 CountDownLatch semaphore = new CountDownLatch(1);
	

	
		  try {
			  
			 timeout = !semaphore.await(2, TimeUnit.SECONDS);
			 inwait=true;
				
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}

		  
		  semaphore.countDown();
		
		
		return inwait;
	
	}
	public static boolean productInCleaning() {
			
		 boolean timeout=false;
		 if(inwait ) {
		 CountDownLatch semaphore = new CountDownLatch(1);
	

		  
		  try {
			 timeout = !semaphore.await(2, TimeUnit.SECONDS);
			 incleaning =true;
				
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

		  
		  semaphore.countDown();
		
		 }
		return incleaning;
		}
	

		public static boolean productCompleted() {
			boolean timeout=false;
			 if(inwait && incleaning) {
			 CountDownLatch semaphore = new CountDownLatch(1);
		

			  
			  try {
				 timeout = !semaphore.await(2, TimeUnit.SECONDS);
				 completed =true;
					
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}

			
			  semaphore.countDown();
			
			 }
			return completed;
		}
	public static void delivary() {
				
				for(int i=0;i<prod.size();i++)
				{
					
						try {
							if(Customer.user1.get(i).Address.equals("Nablus")){
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
		int k=500;
	
		int j= (int) (500 - 2*Math.random());
		
		return j;
	}
	public static int numberprodeq() {
		int k=120;
	
		int j=(int) (120 - 2*Math.random());
		
		return j;
	}
	public static int proderror() {
		int exact=100;
		int approx=(int)(100 * Math.random());
		if(approx >=40) {
			approx-=40;
		}
	    int j=(int) (exact-approx);
		 
		
		return j;
	}
	
	public String getID() {
		
		// TODO Auto-generated method stub
		return id;
	}
	
	
}
