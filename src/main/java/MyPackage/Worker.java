package MyPackage;

import java.util.ArrayList;

import io.cucumber.java.it.Date;

public class Worker {
	int ay;
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
		String saver=P.id;
		String saver2=W.getName();
		String WPdata=saver+saver2;	
		return WPdata;
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
	
	}
	public int checkemail(String string) {
		
		if(string.equals("jadmohmd33@gmail.com") || string.equals("ayamoinn44@gmail.com")
				|| string.equals("mohmd55t44@gmail.com")) {
			return 1;
		}
		
		return 0;
		
	}
	
	public static void printWorker() {
		System.out.println("Name         " +"Email    \n"+
				           "Aya Moin     " +"ayamoinn44@gmail.com\n"+
				           "Mohmed samer " +"mohmd55t44@gmail.com\n"+
				           "jad mohmd    " +"jadmohmd33@gmail.com\n");
	}
	
	public static void Workername()
	{
		System.out.println("Name" +
		           "Aya Moin\n"+
		           "Mohmed samer\n"+
		           "jad mohmd\n\n");
}
	
	
	public static void prodinclean() {
		System.out.println("Name         " +"    Number    \n"+
		           "Canves1     " +"      1\n"+
		           "Canves + Cover " +"   2\n"+
		           "Cover    " +"         3\n");
	}
	public static void breakTime()
	{
		System.out.println("\n Your Work Start at 8:30  to 4:00");

		System.out.println("\n Your break at 11:00 to 11:30 / break at 2:00 to 2:40");
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
	public void addOrder(ProductMain order) {
		
		
	}
	
	
	

}