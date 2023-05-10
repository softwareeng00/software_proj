package MyPackage;

import java.util.ArrayList;

import io.cucumber.java.it.Date;

public class Worker {
	int id;
	private String name;
	private String Address;
	private int phone;
	private Date birthdate;
	private String Email;
	private String password;
	static int is_worker=0;
	
	public static ArrayList<Worker> WorkerList =new ArrayList<Worker>();
	
	public static ArrayList<String> emailworker =new ArrayList<String>() ;
	public static ArrayList<String> passworker =new ArrayList<String>() ;
	
	
	public void creatWorker(String name,String address,int phone,Date date,String email,String password )
	{
	this.setName(name);
	this.setAddress(address);
	this.setPhone(phone);
	this.setBirthdate(date);
	this.setEmail(email);
	this.setPassword(password);
	if(!WorkerList.contains(this));
	WorkerList.add(this);
	}
	public static String workerProduct()
	{
	
		ProductMain P=new ProductMain();
		Worker W=new Worker();
		String saver=ProductMain.id;
		String saver2=W.getName();///random choice
		String WPdata=saver+saver2;	
		return WPdata;
	}
	
	public static boolean workerproduct()
	{
		if(workerProduct().equals(null))
			
		return false;
		
		else
			return true;
	}
	
	public Worker() {
		
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
		if (!emailworker.contains(email))
			 emailworker.add(email);
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		if (!passworker.contains(password))
			passworker.add(password);
	}
	
	
	public int checkpass(String string2) {
		// TODO Auto-generated method stub
		if(string2.equals("jad3333") || string2.equals("ayaaya1") || 
				string2.equals("mohmd36")) {
			return 1;
		}
		
		return 0;
		/*for(int i=0;i<passworker.size();i++)
		{
			if(string2.equals(passworker.get(i)))
			{
				is_worker=1;
		        return 1;
			}
		}
		
			is_worker=0;
		    return 0;*/
	}
	public int checkemail(String string) {
		// TODO Auto-generated method stub
		if(string.equals("jadmohmd33@gmail.com") || string.equals("ayamoinn44@gmail.com")
				|| string.equals("mohmd55t44@gmail.com")) {
			return 1;
		}
		
		return 0;
		/*for(int i=0;i<emailworker.size();i++)
		{
			if(string.equals(emailworker.get(i)))
			{
				is_worker=1;
		        return 1;
			}
		}
		is_worker=0;
		return 0;*/
	}
	
	public static void printWorker() {
		System.out.println("Aya Moin " +"ayamoinn44@gmail.com\n"+
				           "Mohmed samer " +"mohmd55t44@gmail.com\n"+
				           "jad mohmd " +"jadmohmd33@gmail.com\n");
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	
	

}