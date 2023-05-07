package MyPackage;


import java.util.ArrayList;
import java.util.Scanner;

import io.cucumber.java.it.Date;


public class Customer {
	int ay;
	private String  CustomerName;
	private String CustomerPhoneNumber;
	private String CustomerAddress;
	private	String CustomerAge;

	public static ArrayList<Customer> CustomerData =new ArrayList<Customer>();

	
	
	public static ArrayList<Customer> user1 =new ArrayList<Customer>() ;
	public static ArrayList<String> email =new ArrayList<String>() ;
	public static ArrayList<String> pass =new ArrayList<String>() ;
	public String id;
	public String name;
	public String Address;
	public static ArrayList<String> phone1 =new ArrayList<String>() ;

public String phone;
	private String Email;
	private String password;
	public int reguser=0;
	
	public Customer()
	{
		this.id="11";
		this.name="aya";
		this.Address="Nablus";
		this.Email="ayamoinn@gmail.com";
		this.password="useruser";
		phone1.add("0687347273");
		this.phone="0687347273";
		user1.add(this);
		if (!pass.contains("useruser"))
		pass.add("useruser");
		if (!email.contains("ayamoinn@gmail.com"))
			 email.add("ayamoinn@gmail.com");
	}
	
	public String getEmail() {
		return this.Email;
	}
	public void setEmail(String e) {
		this.Email = e;
		
		
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
		
	}
	
	
	public int checkpass(String p) {
		for(int i=0;i<pass.size();i++)
		{
			if(p.equals(pass.get(i)))
		    return 1;
		}
		return 0;
		/*if(p.equals("useruser")) {
			return 1;
		}
		
		return 0;*/
		
	}
	public static void printCustomer() {
		for(int i=0;i<Customer.user1.size();i++)
		{
			System.out.println("Customer : "+Customer.user1.get(i).id+" "+Customer.user1.get(i).name+" "+Customer.user1.get(i).Address+" "+
					Customer.user1.get(i).phone);
		}
		
	}
	
	public int checkemail(String e) {
		if (!email.contains("ayamoinn@gmail.com"))
			 email.add("ayamoinn@gmail.com");
		for(int i=0;i<email.size();i++)
		{
			if(e.equals(email.get(i)))
		    return 1;
		}
		return 0;
		/*if(e.equals("ayamoinn@gmail.com")) {
			return 1;
		}
		
		return 0;*/
		
	}
	public int checkPhone(String num)
	{
		for(int i=0;i<phone1.size();i++)
		{
			if(num.equals(phone1.get(i)));
			return 1;
		}
	return 1;
		
	}
	/*public void deleteCustomer(String id)
	{
		//this.id=id;
		
		for(int i=0;i<user1.size();i++)
		{
			if(user1.get(i).id.equals(id))
			user1.remove(i);
			
		}
	}*/
	/*public static void main (String[] args) {
		email.add("AAA");
		email.add("BBB");
		email.add("CCC");
		
		/* Scanner scan = new Scanner(System.in);
		 String s = scan.nextLine();
		 User user=new User();
		 user.setEmail("BBB");
		 int x=user.checkemail(user.getEmail());
		 System.out.println(x);
		 for(int i=0;i<email.size();i++)
		 {
			 System.out.println(email.get(i));
		 }
	}*/

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerPhoneNumber() {
		return CustomerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		CustomerPhoneNumber = customerPhoneNumber;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	public String getCustomerAge() {
		return CustomerAge;
	}

	public void setCustomerAge(String customerAge) {
		CustomerAge = customerAge;
	}
	
	
	public void createCustomer(String name,String age,String adderess,String ph)
	{
		this.setCustomerName(name);
		this.setCustomerAge(age);
		this.setCustomerAddress(adderess);
		this.setCustomerPhoneNumber(ph);
		
		if(!CustomerData.contains(this))
			CustomerData.add(this);
	}
	public void updatCustomer(String name1,String age1,String adderess1,String ph1)
	{
		this.setCustomerName(name1);
		this.setCustomerAge(age1);
		this.setCustomerAddress(adderess1);
		this.setCustomerPhoneNumber(ph1);
		
		
		
		for(int i=0;i<CustomerData.size();i++)
		{
			
		if(CustomerData.get(i).getCustomerPhoneNumber()==ph1)
			CustomerData.set(i, this);
		}
	
	}
	public void deleteCustomer(String ph1)
	{
		
		for(int i=0;i<CustomerData.size();i++)
		{
			if(CustomerData.get(i).getCustomerPhoneNumber()==ph1)
				CustomerData.remove(i);
			
		}
		}
}
