package MyPackage;

import java.util.ArrayList;

import io.cucumber.java.it.Date;

public class Admin {
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
		//if (!emailadmin.contains(email))
		//	 emailadmin.add(email);
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
		// TODO Auto-generated method stub
		/*for(int i=0;i<emailadmin.size();i++)
		{
			if(string.equals(emailadmin.get(i)))
			{
				is_admin=1;
		        return 1;
			}
		}
		is_admin=0;
		return 0;*/
		if(string.equals("ahmedmoeen@gmail.com") ) {
			return 1;
		}
		
		return 0;
	}
	public int checkpass(String string2) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<passadmin.size();i++)
		{
			if(string2.equals(passadmin.get(i)))
			{
				is_admin=1;
		        return 1;
			}
		}
		is_admin=0;
		return 0;*/
		if(string2.equals("ahmed22")) {
			return 1;
		}
		
		return 0;
	}
	
}

