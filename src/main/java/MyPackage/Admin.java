package mypackage;

import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.it.Date;

public class Admin {
	int ayaaaa;
	int id;
	String name;
	String address;
		int phone;
	Date birthdate;
	 String email;
	 String password;
	 static List<String> emailAdmin =new ArrayList<>() ;
	 static List<String> passAdmin =new ArrayList<>() ;
	
	public String getEmail() {
		
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		if (!passAdmin.contains(password))
			passAdmin.add(password);
		
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
