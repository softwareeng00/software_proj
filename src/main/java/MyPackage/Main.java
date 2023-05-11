package MyPackage;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ay;
		boolean flagintitail=false;
		int userselected=0;
		Customer C=new Customer();
		Admin A=new Admin();
		int pr1=0;
		
		Worker W=new Worker();
		Scanner scc = new Scanner(System.in);
		boolean flagadmin=false;
		String nameofprod=null;
		int height=1;int width=1;
		int countprod=0;int countprod1=0;
		boolean flagworker=false;
		boolean flaguser=false;
		boolean flagaccount=false;
		String  emails=null;
		int x2=0;
		userselected =firstMenu();
		while(userselected!=99) {
		
		
		
		if(userselected==1)
		{
			int userselected1 = 0;
			System.out.print("USERNAME : ");
			String A1=scc.next();
			System.out.print("PASSWORD : ");
			String A2=scc.next();
			if(A.checkemail(A1)==1 && A.checkpass(A2)==1)
			{
				flagadmin=true;
				
			}
			
             
			do
			{
				if(flagadmin) {
				userselected1 =AdminMenu();
				switch(userselected1)
				{
				case 1 : 
					
					Customer.printCustomer();
					
				break;
				case 2 :
					ProductMain o=new ProductMain();
					ProductMain.printProduct();
				
					break;
                case 3 :
					
					Worker.printWorker();
				
					break;
                case 4:
					System.out.print("Enter SSN of User you need to delete : ");
					String CUS=scc.next();
					Customer r=new Customer();
					r.deleteCustomer(CUS);
				
					break;
                case 5:
	
                	System.out.print("Enter id of Product you need to delete : ");
					String PRO=scc.next();
					ProductMain pr=new ProductMain();
					pr.deleteProduct(PRO);
                	break;
                case 6:
                	if(countprod1==0)
                	countprod1=1;
                	
                	System.out.println("  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
                	System.out.println("* Carpet washing with the latest equipment and using special cleaning materials,     *\n"
                			         + "* powders and materials to deal with all kinds of stains and dirt                    *");
                	int y=ProductMain.numberprodag(countprod);
                	System.out.println("* Number of cleaning agent in the system :"+y+"                                        *");
                	System.out.println("* The number of missing cleaning agent must be provided :"+ (500-y)+"                           *");
                	int z=ProductMain.numberprodeq();
                	System.out.println("* The number of cleaning equipment :"+z+"                                              *");
                	System.out.println("* The number of cleaning equipment that needs maintenance :"+(120-z)+"                         *");
                	int l=ProductMain.proderror();
                	System.out.println("* Carpet cleaning percentage  : "+(l) +"%                                                  *");
                	System.out.println("* Carpet cleaning percentage error: "+( 100 -l) +"%                                              *");
                	System.out.println("  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
					break;
                case 7:
                	Transaction a =new Transaction();
                	a.getCashPaid();
                	a.getDebtPaid();
                	a.getPrice();
                	System.out.print("The total cash offerd is 7500 \n");
                	System.out.print("The Total dept is 1500\n");
                	System.out.print("The Price for a piece is 500\n");
                	
                	break;
                
				
				
				
				}
			 }
            else
            {
           	 System.out.println("Your USERNAME or PASSWORD is incorrect");
           	 System.out.println("Please try again");
            }
				
				
			}
			while(userselected1<7);
			{
                if(flagadmin) {
				System.out.printf(" Exit\n");
				userselected =firstMenu();
                }

				

			}

			
		}
		
		if(userselected==2)
			
		 {
			int userselected2 = 0;
			
			System.out.print("USERNAME : ");
			String W1=scc.next();
			System.out.print("PASSWORD : ");
			String W2=scc.next();
			if(W.checkemail(W1)==1 && W.checkpass(W2)==1)
			{
				flagworker=true;
			}
            

			do
			{
				 if(flagworker) {
				userselected2 =Workermenu();
				switch(userselected2)
				{
				
				case 1:
					
					Worker.prodinclean();

					
					break;
				case 2:
					Worker.Workername();

					break;
				case 3:
					Worker.breakTime();
					break;
				case 4:
					userselected =firstMenu();

					break;
				}
			
			 }
			else {
           	 System.out.println("Your USERNAME or PASSWORD is incorrect");
           	 System.out.println("Please try again");
           	 break;
           	 
            }
			
		 }
            
			while(userselected2<5);
			{
				
			}
             
             
		 }
	 if(userselected==3)
	 {
		 System.out.print("1- You have an account\n");
		 System.out.println("2- Create account ");
		 System.out.print("Your option is : ");
		 int x=scc.nextInt();
		
			int userselected3 = 0;
			
            

		do
		{String C1 = null;String C2; 
			if(x==1) {
				if(!flagaccount) {
			System.out.print("USERNAME : ");
			 C1=scc.next();emails=C1;
			System.out.print("PASSWORD : ");
			 C2=scc.next();
			flagaccount=true;
			
			if(C.checkemail(C1)==1 && C.checkpass(C2)==1)
			{
				flaguser=true;
			}
				}else {
			 if(flaguser) {
			userselected3 =CustomerMenu();
			switch(userselected3)
			{
			case 1 : 
				 System.out.println("Option 1 is selected. Thank u ");
				 System.out.println("Please Enter Information of your product");
				
				
				
				ProductMain M=new ProductMain();
				Integer g= ProductMain.prod.size()+1;
				M=scan();
				nameofprod=M.name;
				height=Integer.parseInt(M.high);
				width=Integer.parseInt(M.width);
				
				if(x2==0) {
					
				}
				M.createProduct(g.toString(), M.type, nameofprod, M.image, M.description, M.specialtreatment,M.high,M.width);
				System.out.println("Your product added to the system\n");
				countprod++;countprod1++;
				flagintitail=true;
			
				
		
				
			break;
			case 2:
				
				System.out.println("Option 2 is selected. Thank u ");
				
				System.out.print("Enter name of product you need to update : ");
				
				String r= scc.next();
				Integer in=f1(r);
				
				System.out.println("Please update Information of your product");
				ProductMain M1=new ProductMain();
				M1=scan();
				height=Integer.parseInt(M1.high);
				width=Integer.parseInt(M1.width);
				nameofprod=M1.name;
				
				M1.updateProduct(in.toString(), M1.type, M1.name, M1.image, M1.description, M1.specialtreatment,M1.high,M1.width);
				System.out.println("Your product updating in the system");
				
			
				
				break;
			case 3:
				System.out.print("Enter name of product you need to delete : ");
				 
				String hh= scc.next();
				Integer i1=f1(hh);
				ProductMain o=new ProductMain();
				o.deleteProduct(i1.toString());
				
				break;
			case 4:
				
				
				for(int i=0;i<Customer.user1.size();i++) {
					
					if(Customer.user1.get(i).getEmail().equals(emails) ) {
						System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
						System.out.println("*	        SSN " + Customer.user1.get(i).id+	  "			  *");
						System.out.println("*		Name " + Customer.user1.get(i).name+	"		  *");
						System.out.println("*		Phone " + Customer.user1.get(i).phone+	"	  *");
						System.out.println("*		Address " + Customer.user1.get(i).Address+	"		  *");
						System.out.println("*		Product " + nameofprod+	"	          *");
						Bill B=new Bill();
						int BILL=B.priceProd(height,width,countprod);pr1=BILL;
						System.out.println("*		Price " +BILL+"$"+	"		  *");
						System.out.println("*		Delivary 20$" +		"		  *");
						System.out.println("*		Total Price " +B.totalPriceofproduct(height,width,countprod)+"$"+"	  *");
						System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
					}
				}
				
				System.out.println("");
				break;
			case 5:
				if(ProductMain.productInWaiting() || ProductMain.productInCleaning() || ProductMain.productCompleted())
					 System.out.println("Product finished wait state and go to cleaning state");
					else
						System.out.println("State Product in Cleaning ");
					break;
			case 6:
				int o1=0;
				Bill c=new Bill();
				if(flagintitail ) {
					flagintitail=false;
					if(!emails.equals("ayamoinn@gmail.com")){
					o1=c.discountInPrice10(pr1,5);
					System.out.println("Price before Discount : "+pr1);
					System.out.println("Price after Discount : "+o1);}
					
				}
				if(pr1>600) {
					o1=c.discountInPrice10(pr1,10);
					System.out.println("Price before Discount : "+pr1);
					System.out.println("Price after Discount : "+o1);
				}
				if(countprod>6) {
				      o1=c.discountInNumber(countprod,pr1);
				      
				      
				      
				      int y=o1*pr1;
				      System.out.println("Price before Discount : "+pr1);
					  System.out.println("Price after Discount : "+y);
				}
				break;
		
				}
			
			
			 }}
			
		}
			else {
				emails=createaccountcus();
				x=1;
				x2=1;
				flaguser=true;
				
			}
			 }
		 
		while(userselected3<7 );
		{    
			 

			userselected =firstMenu();
			

		}
             }
            
	 
	 else
	 {
			

		 
	 }
	 
		}
		 

		}
	

	public static int firstMenu()
	{
		int selection ;
		 Scanner sc = new Scanner(System.in);
		 
		    System.out.println("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★");
		    System.out.println("★        Welcome:            ★");
		    System.out.println("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★");
			System.out.println("★        Login as :          ★");
			System.out.println("★        1- Admin            ★");
			System.out.println("★        2- Worker           ★");
			System.out.println("★        3- Customer         ★");
			System.out.println("★        4- Exit             ★");
			System.out.println("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★");
			System.out.print("Select your option : ");
			selection=sc.nextInt();
			
		
	return selection;
		
		
		
	}


	public static int AdminMenu()
	{
		int selection ;
		 Scanner sc = new Scanner(System.in);
		
		    System.out.println("          Admin");
			System.out.println("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★");
			System.out.println("★	1- Show customer       ★");
			System.out.println("★	2- Show Product	       ★");
			System.out.println("★	3- Show worker         ★");
			System.out.println("★	4- Delete Customer     ★");
			System.out.println("★	5- Delete Product      ★");
			System.out.println("★	6- report              ★");
			System.out.println("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★");
			System.out.print("Select your option : ");
			selection=sc.nextInt();

	return selection;
		
		
		
	}
	public static int CustomerMenu()
	{
		int selection;
		 Scanner sc = new Scanner(System.in);
		

		    System.out.println("            Customer");
		    System.out.println("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★");
			System.out.println("★	1- Add Product		    ★");
			System.out.println("★	2- Updtate Product	    ★");
			System.out.println("★	3- Delete Product	    ★");
			System.out.println("★	4- get bill	            ★");
			System.out.println("★	5- get Order Status         ★");
			System.out.println("★	6- discount                 ★");
			System.out.println("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★");
			System.out.print("Select your option : ");
			

			selection=sc.nextInt();



	return selection;
		
	}



	public static int Workermenu()
	{
		int selection ;
		 Scanner sc = new Scanner(System.in);
		 

		    System.out.println("          Worker");
			System.out.println("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
			System.out.println("★    1- Show Products     ★");
			System.out.println("★    2- Show Worker Team     ★");
			System.out.println("★    3- Show Worker Time      ★");
			System.out.println("★    4- Main Menu      ★");


			System.out.println("★              ★");
			
			System.out.println("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
			System.out.println("Select your option : ");

			selection=sc.nextInt();
			System.out.println("Your selected option is: ");

			
		 return selection;
		
	}




	public static int  menu()
	{
		int selection ;
		 Scanner sc = new Scanner(System.in);
		 
		System.out.println("       Welcome");
		System.out.println("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
		System.out.println("★  Select your option      ★");
		System.out.println("★  1- Create customer      ★");
		System.out.println("★  2- add customer         ★");
		System.out.println("★  3- delete customer      ★");
		System.out.println("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
		System.out.println("Your selected option is: ");

		selection=sc.nextInt();
	return selection;
	}
	public static ProductMain scan()
	{
		Scanner scan = new Scanner(System.in);
		 System.out.print("Enter name of product ");
		 
		 ProductMain T = new ProductMain() ;
	     T.name = scan.next();
	     
	     
	System.out.print("Enter type of his product ");

		T.type = scan.next();
		
		System.out.print("The size of product highet and width : ");
		
		T.high=scan.next();
		T.width=scan.next();
		
		System.out.print("Enter description ");
		T.description=scan.next();
		System.out.print("Enter image of product ");
		T.image=scan.next();
		System.out.print("If you need a special treatment ");
		T.specialtreatment=scan.next();
		
		
		return T;
	}

	public static int  f1(String hh) {
		Integer index = 0;
		for(int i=0;i<=ProductMain.prod.size();i++)
		{
			
		if(ProductMain.prod.get(i).name.equals(hh))
		{
			index=i+1;break;
		}
		}
		return index;
	}
	public static String createaccountcus() {
		Customer F=new Customer();
		Scanner n=new Scanner(System.in);
		System.out.println("Welcome\nYou now in create account page\nEnter your information");
		System.out.print("SSN : ");F.id=n.next();
		System.out.print("Name : ");F.name=n.next();
		System.out.print("Adderess : ");F.Address=n.next();
		System.out.print("Phone : ");F.phone=n.next();
		System.out.print("Email : ");F.setEmail(n.next());
		System.out.print("Password : ");F.setPassword(n.next());
		System.out.print("Confirm password : ");String cpass=n.next();
		if (!Customer.pass.contains(F.getPassword()))
			Customer.pass.add(F.getPassword());
			if (!Customer.email.contains(F.getEmail()))
				Customer.email.add(F.getEmail());
			if (!Customer.user1.contains(F))
				Customer.user1.add(F);
			return F.getEmail();
		
	}
	}

