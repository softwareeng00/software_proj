package MyPackage;


import java.util.Scanner;

public class Main {

	private static final String opt = "Select your option : ";
	private static final String t ="\t";
	private static final String str="  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★";
	public static void main(String[] args) {
		
		boolean flagintitail=false;
		int userselected=0;
		Customer cc=new Customer();
		Admin aa=new Admin();
		int pr1=0;
		
		Worker w=new Worker();
		Scanner scc = new Scanner(System.in);
		boolean flagadmin=false;
		String nameofprod=null;
		int height=1;
		int width=1;
		int countprod=0;
		int countprod1=0;
		boolean flagworker=false;
		boolean flaguser=false;
		boolean flagaccount=false;
		String  emails=null;
		int x2=0;
		
	
		userselected =firstMenu();
		while(userselected!=99) {
		String ayy="USERNAME : ";
		
		String ayy1="PASSWORD : ";
		if(userselected==1)
		{
			int userselected1 = 0;
			System.out.print(ayy);
			String a1=scc.next();
			System.out.print(ayy1);
			String a2=scc.next();
			if(aa.checkemail(a1)==1 && aa.checkpass(a2)==1)
			{
				flagadmin=true;
				
			}
			
             
			do
			{
				if(flagadmin) {
				userselected1 =adminMenue();
				switch(userselected1)
				{
				case 1 : 
					
					Customer.printCustomer();
					
				break;
				case 2 :
					
					ProductMain.printProduct();
				
					break;
                case 3 :
					
					Worker.printWorker();
				
					break;
                case 4:
					System.out.print("Enter SSN of User you need to delete : ");
					String cuss=scc.next();
					Customer r=new Customer();
					r.deleteCustomer(cuss);
				
					break;
                case 5:
	
                	System.out.print("Enter id of Product you need to delete : ");
					String proo=scc.next();
					ProductMain pr=new ProductMain();
					pr.deleteProduct(proo);
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
                	
                	System.out.print("The total cash offerd is 7500 \n");
                	System.out.print("The Total dept is 1500\n");
                	System.out.print("The Price for a piece is 500\n");
                	
                	break;
                	default : 
                		System.out.print("Thank you");
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
			
			System.out.print(ayy);
			String w1=scc.next();
			System.out.print(ayy1);
			String w2=scc.next();
			if(w.checkemail(w1)==1 && w.checkpass(w2)==1)
			{
				flagworker=true;
			}
            

			do
			{
				 if(flagworker) {
				userselected2 =workerMenu();
				switch(userselected2)
				{
				
				case 1:
					
					Worker.prodinclean();

					
					break;
				case 2:
					Worker.workerName();

					break;
				case 3:
					Worker.breakTime();
					break;
				case 4:
					userselected =firstMenu();

					break;
					
				default : 
            		System.out.print("Welcome ");
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
		{String cc1 = null;
		String cc2; 
			if(x==1) {
				if(!flagaccount) {
			System.out.print(ayy);
			 cc1=scc.next();emails=cc1;
			System.out.print(ayy1);
			 cc2=scc.next();
			flagaccount=true;
			
			if(cc.checkemail(cc1)==1 && cc.checkpass(cc2)==1)
			{
				flaguser=true;
			}
				}else {
			 if(flaguser) {
			userselected3 =customerMenu();
			switch(userselected3)
			{
			case 1 : 
				 System.out.println("Option 1 is selected. Thank u ");
				 System.out.println("Please Enter Information of your product");
				
				
				
				ProductMain mm1=new ProductMain();
				Integer g= ProductMain.prod.size()+1;
				mm1=scan();
				nameofprod=mm1.name;
				height=Integer.parseInt(mm1.high);
				width=Integer.parseInt(mm1.width);
				
				if(x2==0) {
					
				}
				mm1.createProduct(g.toString(), mm1.type, nameofprod, mm1.image, mm1.description, mm1.specialtreatment,mm1.high,mm1.width);
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
				ProductMain mmm=new ProductMain();
				mmm=scan();
				height=Integer.parseInt(mmm.high);
				width=Integer.parseInt(mmm.width);
				nameofprod=mmm.name;
				
				mmm.updateProduct(in.toString(), mmm.type, mmm.name, mmm.image, mmm.description, mmm.specialtreatment,mmm.high,mmm.width);
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
						System.out.println("*"+t+t+"SSN " + Customer.user1.get(i).id+	  t+t+"  *");
						System.out.println("*"+t+t+"Name " + Customer.user1.get(i).name+	 t+t+"  *");
						System.out.println("*"+t+t+"Phone " + Customer.user1.get(i).phone+	 t+t+"  *");
						Customer.user1.get(i);
						System.out.println("*"+t+t+"addresss " + Customer.addresss+	 t+t+"  *");
						System.out.println("*"+t+t+"Product " + nameofprod+	 t+t+"  *");
						Bill b=new Bill();
						int billCus=b.priceProd(height,width,countprod);pr1=billCus;
						System.out.println("*"+t+t+"Price " +billCus+"$"+	 t+t+"  *");
						System.out.println("*"+t+t+"Delivary 20$" +		 t+t+"  *");
						System.out.println("*"+t+t+"Total Price " +b.totalPriceofproduct(height,width,countprod)+"$"+ t+t+"  *");
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
				String diss="Price before Discount : ";
				Bill c=new Bill();
				if(flagintitail ) {
					flagintitail=false;
					if(!emails.equals("ayamoinn@gmail.com")){
					o1=c.discountInPrice10(pr1,5);
					
					System.out.println(diss+pr1);
					System.out.println("Price after Discoaunt : "+o1);}
					
				}
				if(pr1>600) {
					o1=c.discountInPrice10(pr1,10);
					System.out.println(diss+pr1);
					System.out.println("Price after Discount : "+o1);
				}
				if(countprod>6) {
				      o1=c.discountInNumber(countprod,pr1);
				      
				      
				      
				      int y=o1*pr1;
				      System.out.println(diss+pr1);
					  System.out.println("Price after Discount : "+y);
				}
				break;
			default : 
        		System.out.print("Hello");
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
		 
		    System.out.println(str);
		    System.out.println("★        Welcome:            ★");
		    System.out.println(str);
			System.out.println("★        Login as :          ★");
			System.out.println("★        1- Admin            ★");
			System.out.println("★        2- Worker           ★");
			System.out.println("★        3- Customer         ★");
			System.out.println("★        4- Exit             ★");
			System.out.println(str);
			System.out.print(opt);
			selection=sc.nextInt();
			
		
	return selection;
		
		
		
	}


	public static int adminMenue()
	{
		int selection ;
		 Scanner sc = new Scanner(System.in);
		  	
		    System.out.println("          Admin");
			System.out.println(str+" ★");
			System.out.println("★	1- Show customer"+t+"★");		
			System.out.println("★	2- Show Product "+t+"★");     
			System.out.println("★	3- Show worker "+t+t+"★");
			System.out.println("★	4- Delete Customer"+t+"★");
			System.out.println("★	5- Delete Product"+t+"★");
			System.out.println("★	6- report"+t+t+"★");
			System.out.println(str+" ★");
			System.out.print(opt);
			selection=sc.nextInt();

	return selection;
		
		
		
	}
	public static int customerMenu()
	{
		int selection;
		 Scanner sc = new Scanner(System.in);
		

		    System.out.println("            Customer");
		    System.out.println("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
			System.out.println("★	1- Add Product"+t+t+"★");
			System.out.println("★	2- Updtate Product"+t+"★");
			System.out.println("★	3- Delete Product"+t+"★");
			System.out.println("★	4- get bill"+t+t+"★");
			System.out.println("★	5- get Order Status"+t+"★");
			System.out.println("★	6- discount"+t+t+"★");
			System.out.println("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
			System.out.print(opt);
			

			selection=sc.nextInt();



	return selection;
		
	}



	public static int workerMenu()
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
			System.out.println(opt);

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
		 
		 ProductMain tt = new ProductMain() ;
	     tt.name = scan.next();
	     
	     
	System.out.print("Enter type of his product ");

		tt.type = scan.next();
		
		System.out.print("The size of product highet and width : ");
		
		tt.high=scan.next();
		tt.width=scan.next();
		
		System.out.print("Enter description ");
		tt.description=scan.next();
		System.out.print("Enter image of product ");
		tt.image=scan.next();
		System.out.print("If you need a special treatment ");
		tt.specialtreatment=scan.next();
		
		
		return tt;
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
		Customer ff=new Customer();
		Scanner n=new Scanner(System.in);
		System.out.println("Welcome\nYou now in create account page\nEnter your information");
		System.out.print("SSN : ");ff.id=n.next();
		System.out.print("Name : ");ff.name=n.next();
		System.out.print("Adderess : ");ff.addresss=n.next();
		System.out.print("Phone : ");ff.phone=n.next();
		System.out.print("Email : ");ff.setEmail(n.next());
		System.out.print("Password : ");ff.setPassword(n.next());
		System.out.print("Confirm password : ");
		if (!Customer.pass.contains(ff.getPassword()))
			Customer.pass.add(ff.getPassword());
			if (!Customer.email.contains(ff.getEmail()))
				Customer.email.add(ff.getEmail());
			if (!Customer.user1.contains(ff))
				Customer.user1.add(ff);
			return ff.getEmail();
		
	}
	}

