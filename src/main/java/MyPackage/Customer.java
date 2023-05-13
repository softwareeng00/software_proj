package mypackage;


import java.util.ArrayList;
import java.util.List;



public class Customer {
	
	private static String  customerN;
	private String customerPhone;
	private static String customerAddress;
	private static	String customerAge;

	 static List<Customer> customerData =new ArrayList<>();

	
	
	 static List<Customer> user1 =new ArrayList<>();
	 static List<String> email =new ArrayList<>();
	 static List<String> pass =new ArrayList<>();
	 String id;
	 String name;
	 static String addresss;
	 static List<String> phone1 =new ArrayList<>() ;

    String phone;
	private String emaill;
	private String password;
	 int reguser=0;
	 private String  aya="ayamoinn@gmail.com";
	 private String  aya1="useruser";
	public Customer()
	{
		this.id="11";
		this.name="aya";
		this.addresss="Nablus";
		this.emaill=aya;
		this.password=aya1;
		phone1.add("0687347273");
		this.phone="0687347273";
		user1.add(this);
		if (!pass.contains(aya1))
			pass.add(aya1);
		if (!email.contains(aya))
			email.add(aya);
	}
	
	public String getEmail() {
		return this.emaill;
	}
	public void setEmail(String e) {
		this.emaill = e;
		
		
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
	
		
	}
	public static void printCustomer() {
		for(int i=0;i<Customer.user1.size();i++)
		{
			Customer.user1.get(i);
			String j="Customer : "+Customer.user1.get(i).id+" "+Customer.user1.get(i).name+" "+Customer.addresss+" "+
					Customer.user1.get(i).phone;
			System.out.println(j);
		}
		
	}
	
	public int checkemail(String e) {
		if (!email.contains(aya))
			 email.add(aya);
		for(int i=0;i<email.size();i++)
		{
			if(e.equals(email.get(i)))
		    return 1;
		}
		return 0;
		
		
	}
	public int checkPhone(String num)
	{
		for(int i=0;i<phone1.size();i++)
		{
			if(num.equals(phone1.get(i)))
				return 1;
		}
	return 0;
		
	}
	
	public  String getCustomerName() {
		return customerN;
	}

	public void setCustomerName(String customerName) {
		customerN = customerName;
	}

	public String getCustomerPhoneNumber() {
		return customerPhone;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		customerPhone = customerPhoneNumber;
	}

	public  String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String s) {
		customerAddress = s;
	}

	public  String getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(String s) {
		customerAge = s;
	}
	
	
	public void createCustomer(String name,String age,String adderess,String ph)
	{
		this.setCustomerName(name);
		this.setCustomerAge(age);
		this.setCustomerAddress(adderess);
		this.setCustomerPhoneNumber(ph);
		
		if(!customerData.contains(this))
			customerData.add(this);
	}
	public void updatCustomer(String name1,String age1,String adderess1,String ph1)
	{
		this.setCustomerName(name1);
		this.setCustomerAge(age1);
		this.setCustomerAddress(adderess1);
		this.setCustomerPhoneNumber(ph1);
		
		
		
		for(int i=0;i<customerData.size();i++)
		{
			
		if(customerData.get(i).getCustomerPhoneNumber().equals(ph1))
			customerData.set(i, this);
		}
	
	}
	public void deleteCustomer(String ph1)
	{
		
		for(int i=0;i<customerData.size();i++)
		{
			if(customerData.get(i).getCustomerPhoneNumber().equals(ph1))
				customerData.remove(i);
			
		}
		}
}