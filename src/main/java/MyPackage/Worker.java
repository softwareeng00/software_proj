package MyPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import io.cucumber.java.it.Date;

public class Worker {
	private static final Logger logger = Logger.getLogger(Main.class.getName());
	int ay;
	int id;
	private String name;
	
	private int phone;
	private String adder;
	private String password;
	static int isWorker=0;
	
	 static List<Worker> workerList =new ArrayList<>();
	
	 static List<String> emailWorker =new ArrayList<>() ;
	 static List<String> passWorker =new ArrayList<>() ;
	
	 
	
	public void creatWorker(String name,String address,int phone,String email,String password )
	{
	this.setName(name);
	this.setAdder(address);
	this.setPhone(phone);
	
	this.setEmail(email);
	this.setPassword(password);
	if(!workerList.contains(this))
		workerList.add(this);
	}
	
	public static String workerProduct()
	{
	
		ProductMain pp=new ProductMain();
		Worker ws=new Worker();
		String saver=pp.id;
		String saver2=ws.getName();
		
		return saver+saver2;
	}
	
	
	
	public Worker() {
		this.name="aya";
	}

	public void setEmail(String email) {
	
		if (!emailWorker.contains(email))
			 emailWorker.add(email);
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		if (!passWorker.contains(password))
			passWorker.add(password);
	}
	
	
	public int checkpass(String string2) {
	
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
		logger.info("Name         " +"emmaill    \n"+
				           "Aya Moin     " +"ayamoinn44@gmail.com\n"+
				           "Mohmed samer " +"mohmd55t44@gmail.com\n"+
				           "jad mohmd    " +"jadmohmd33@gmail.com\n");
	}
	
	public static void workerName()
	{
		logger.info("Name" +
		           "Aya Moin\n"+
		           "Mohmed samer\n"+
		           "jad mohmd\n\n");
}
	
	
	public static void prodinclean() {
		logger.info("Name         " +"    Number    \n"+
		           "Canves1     " +"      1\n"+
		           "Canves + Cover " +"   2\n"+
		           "Cover    " +"         3\n");
	}
	public static void breakTime()
	{
		logger.info("\n Your Work Start at 8:30  to 4:00");

		logger.info("\n Your break at 11:00 to 11:30 / break at 2:00 to 2:40");
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	


	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAdder() {
		return adder;
	}

	public void setAdder(String adder) {
		this.adder = adder;
	}

	

	

	
	
	

}