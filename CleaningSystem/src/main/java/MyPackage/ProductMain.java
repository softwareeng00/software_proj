package MyPackage;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class ProductMain {
	public static String id;
	public String type;
	public static boolean create;
	public static boolean inwait=false;
	public static boolean incleaning=false;
	public static boolean completed=false;
	public static String name;
	public String image;
	public String description;
	public String high;
	public String width;
	public String specialtreatment;
	public int timedelivary=0;
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
	         inwait=false;
			 incleaning=false;
			 completed=false;
			 timedelivary=0;
	         prod.add(this);
		     
    }
	public void createProduct(String id,String type,String name,String image,String des,String sp,String high,String width)
	{
		this.id=id;this.type=type;this.description=des;
		this.name=name;this.specialtreatment=sp;
		this.image=image;this.high=high;this.width=width;
		 inwait=false;
		 incleaning=false;
		 completed=false;timedelivary=0;
		
		if(!prod.contains(this))
		prod.add(this);
		
	}
	public void updateProduct(String id1,String type,String name,String image,String des,String sp,String high,String width)
	{
		this.id=id1;this.type=type;this.description=des;
		this.name=name;this.specialtreatment=sp;
		this.image=image;this.high=high;this.width=width;
		///int j=prod.indexOf(this);
		 inwait=false;
		 incleaning=false;
		 completed=false;timedelivary=0;
		
		for(int i=0;i<prod.size();i++)
		{
			
		if(prod.get(i).id.equals(id1))
		  prod.set(i, this);
		}
	
	}
	public void deleteProduct(String id)
	{
		//this.id=id;
		
		for(int i=0;i<prod.size();i++)
		{
			if(prod.get(i).id.equals(id))
			prod.remove(i);
			
		}
	
	}
	public static void printProduct() {
		for(int i=0;i<ProductMain.prod.size();i++)
		{
			System.out.println("Product : "+ProductMain.prod.get(i).id+" "+ProductMain.prod.get(i).name+" "+ProductMain.prod.get(i).type+
					ProductMain.prod.get(i).description+" " +ProductMain.prod.get(i).high+" "+ProductMain.prod.get(i).width);
		}
		
	}
	public static boolean productInWaiting() {
		boolean flag=false;
		for(int i=0;i<prod.size();i++)
		{
			
			if(prod.get(i).inwait==false) {
				System.out.println("Product "+ProductMain.prod.get(i).id+" "+ProductMain.prod.get(i).name);
				//TimeUnit.MINUTES.sleep(10);
				prod.get(i).inwait=true;
				flag=true;
			}
			
		}
		return inwait;
	}
	public static boolean productInCleaning() {
			
			for(int i=0;i<prod.size();i++)
			{
				if(prod.get(i).incleaning==false || prod.get(i).inwait==true) {
					//TimeUnit.MINUTES.sleep(40);
					prod.get(i).incleaning=true;
				}
				
			}
			return incleaning;
		}
		public static boolean productCompleted() {
			ProductMain PP=new ProductMain();
			
			for(int i=0;i<prod.size();i++)
			{
				if(prod.get(i).completed==false || prod.get(i).incleaning==true || prod.get(i).inwait==true) {
					//TimeUnit.MINUTES.sleep(15);
					prod.get(i).completed=true;
					
				}
				
			}
			return completed;
		}
	public static void delivary() {
				
				for(int i=0;i<prod.size();i++)
				{
					if(prod.get(i).completed==true && prod.get(i).incleaning==true && prod.get(i).inwait==true) {
						try {
							if(Customer.user1.get(i).Address.equals("Nablus")){
							TimeUnit.MINUTES.sleep(15);}
							
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
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
	public static void main (String[] args) {
		/*
		Integer  j=1;
			Scanner scc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
		System.out.println("Please Enter Information of your product");
		 System.out.print("Enter name of product ");
		 
	     String name = scc.next();
	     
	     
	     System.out.print("Enter type of his product ");

		String type = scc.next();
		
		//System.out.print("The size of product highet and width : ");
		
		//int high=scc.nextInt();
		//int width=scc.nextInt();
		
	   System.out.print("Enter description ");
		String des=scc.next();
		System.out.print("Enter image of product ");
		String im=scc.next();
		System.out.print("If you need a special treatment ");
		String special=scc.next();
		ProductMain P=new ProductMain();
		
		P.createProduct((j++).toString(),type,name,im,des,special,"10","10");
		}
		
		for(int i=0;i<ProductMain.prod.size();i++)
		{
			System.out.println(ProductMain.prod.get(i).id+
					ProductMain.prod.get(i).description+ProductMain.prod.get(i).image+ProductMain.prod.get(i).name
					 +ProductMain.prod.get(i).specialtreatment+ProductMain.prod.get(i).type
					 +ProductMain.prod.get(i).high+ProductMain.prod.get(i).width);
		}
		
		ProductMain T=new ProductMain();
		System.out.print("Enter name of product you need to update : ");
		String hh= scc.next();Integer index = 0;
		for(int i=0;i<=ProductMain.prod.size();i++)
		{
			
		if(ProductMain.prod.get(i).name.equals(hh))
		{
			index=i+1;break;
		}
		}
		System.out.print("update product information  ");
 System.out.print("Enter name of product ");
		 
	     T.name= scc.next();
	     
	     
	     System.out.print("Enter type of his product ");

		T.type = scc.next();
		 System.out.print("Enter description ");
			T.description=scc.next();
			System.out.print("Enter image of product ");
			T.image=scc.next();
			System.out.print("If you need a special treatment ");
			T.specialtreatment=scc.next();
			Integer k= ProductMain.prod.indexOf(T);
			String k1=k.toString();
		T.updateProduct(index.toString(),T.type,T.name,T.image,T.description,T.specialtreatment,"10","10");
		for(int i=0;i<ProductMain.prod.size();i++)
		{
			System.out.println(ProductMain.prod.get(i).id+
					ProductMain.prod.get(i).description+ProductMain.prod.get(i).image+ProductMain.prod.get(i).name
					 +ProductMain.prod.get(i).specialtreatment+ProductMain.prod.get(i).type
					 +ProductMain.prod.get(i).high+ProductMain.prod.get(i).width);
		}
		/*ProductMain a=new ProductMain();
		ProductMain b=new ProductMain();
		a.id="111";a.description="AA";a.image="AW";a.name="AAA";
		a.specialtreatment="AAAA";a.type="AAAAA";
		b.id="222";b.description="BB";b.image="BW";b.name="BBB";
		b.specialtreatment="BBBB";b.type="BBBBB";
		prod.add(a);
		prod.add(b);
		for(int i=0;i<prod.size();i++)
		{
			 System.out.println(prod.get(i).id+prod.get(i).description+prod.get(i).image+prod.get(i).name
					 +prod.get(i).specialtreatment+prod.get(i).type);
		}
		ProductMain c=new ProductMain();
		c.createProduct("333", "CW", "CC", "CCC", "CCCC", "CCCCC", "CC", "CC");
		//c.deleteProduct("222");
		for(int i=0;i<prod.size();i++)
		{
			System.out.println(prod.get(i).id+prod.get(i).description+prod.get(i).image+prod.get(i).name
					 +prod.get(i).specialtreatment+prod.get(i).type);
		}
		c.deleteProduct("222");
		for(int i=0;i<prod.size();i++)
		{
			System.out.println(prod.get(i).id+prod.get(i).description+prod.get(i).image+prod.get(i).name
					 +prod.get(i).specialtreatment+prod.get(i).type);
		}
		ProductMain d=new ProductMain();
		d.updateProduct("111", "DW", "DD", "DDD", "DDDD", "DDDDD","DD","DD");
		for(int i=0;i<prod.size();i++)
		{
			System.out.println(prod.get(i).id+prod.get(i).description+prod.get(i).image+prod.get(i).name
					 +prod.get(i).specialtreatment+prod.get(i).type);
		}*/
	
	}
	
	
}
