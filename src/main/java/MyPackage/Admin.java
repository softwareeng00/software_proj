package MyPackage;

import java.util.ArrayList;

import io.cucumber.java.it.Date;

public class Admin {
	int ayaaaa;
    public static boolean testing =false;
	int id;
	String name;
	String Address;
	static int is_admin=0;
	int phone;
	Date birthdate;
	private String Email;
	private String password;
	public static ArrayList<String> emailadmin =new ArrayList<String>() ;
	public static ArrayList<String> passadmin =new ArrayList<String>() ;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		if (!passadmin.contains(password))
			passadmin.add(password);
		
	}
	
	
	public int checkemail(String string) {
	
		if(string.equals("ahmedmoeen@gmail.com") ) {
			return 1;
		}
		
		return 0;
	}
	public int checkpass(String string2) {
		
		if(string2.equals("ahmed22")) {
			return 1;
		}
		
		return 0;
	}
	
}
