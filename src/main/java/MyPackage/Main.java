package mypackage;





import java.util.Scanner;
import java.util.logging.Logger;



public class Main {
	
	private static final String OPT = "Select your option : ";
	private static final String TT ="\t";
	private static final String STR="  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★";
	private static final String S1=" ";
	 private static final Logger logger = Logger.getLogger(Main.class.getName());
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
		String ayam;
		int countprod=0;
		int countprod1=0;
		boolean flagworker=false;
		boolean flaguser=false;
		boolean flagaccount=false;
		String  emails=null;
	
		
	
		userselected =firstMenu();
		while(userselected!=99) {
		String ayy="USERNAME : ";
		
		String ayy1="PASSWORD : ";
		if(userselected==1)
		{
			int userselected1 = 0;
			logger.info(ayy);
			String a1=scc.next();
			logger.info(ayy1);
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
                	logger.info("Enter SSN of User you need to delete : ");
					String cuss=scc.next();
					Customer r=new Customer();
					r.deleteCustomer(cuss);
				
					break;
                case 5:
	
                	logger.info("Enter id of Product you need to delete : ");
					String proo=scc.next();
					ProductMain pr=new ProductMain();
					pr.deleteProduct(proo);
                	break;
                case 6:
                	if(countprod1==0)
                		countprod1=1;
                	
                	 ayam="  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *";
                	logger.info(ayam);
                	ayam="* Carpet washing with the latest equipment and using special cleaning materials,     *\n"
       			         + "* powders and materials to deal with all kinds of stains and dirt                    *";
                	logger.info(ayam);
                	int y=ProductMain.numberprodag();
                	ayam="* Number of cleaning agent in the system :"+y+"                                        *";
                	logger.info(ayam);
                	ayam="* The number of missing cleaning agent must be provided :"+ (500-y)+"                           *";
                	logger.info(ayam);
                	int z=ProductMain.numberprodeq();
                	ayam="* The number of cleaning equipment :"+z+"                                              *";
                	logger.info(ayam);
                	ayam="* The number of cleaning equipment that needs maintenance :"+(120-z)+"                         *";
                	logger.info(ayam);
                	int l=ProductMain.proderror();
                	ayam="* Carpet cleaning percentage  : "+(l) +"%                                                  *";
                	logger.info(ayam);
                	ayam="* Carpet cleaning percentage error: "+( 100 -l) +"%                                              *";
                	logger.info(ayam);
                	logger.info("  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
					break;
                case 7:
                	
                	logger.info("The total cash offerd is 7500 \n");
                	logger.info("The Total dept is 1500\n");
                	logger.info("The Price for a piece is 500\n");
                	
                	break;
                	default : 
                		logger.info("Thank you");
                		break;
				
				
				
				}
			 }
            else
            {
            	logger.info("Your USERNAME or PASSWORD is incorrect");
            	logger.info("Please try again");
            }
				
				
			}
			while(userselected1<7);
			{
				if(flagadmin) {
					logger.info(" Exit");
					userselected =firstMenu();
					}
					

				

			}

			
		}
		
		if(userselected==2)
			
		 {
			int userselected2 = 0;
			
			logger.info(ayy);
			String w1=scc.next();
			logger.info(ayy1);
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
					logger.info("Welcome ");
            		break;
				}
					
			
			 }
			else {
				logger.info("Your USERNAME or PASSWORD is incorrect");
				logger.info("Please try again");
           	 break;
           	 
            }
			
		 }
            
			while(userselected2<5);
			{
				logger.info("");
				
			}
             
             
		 }
	 if(userselected==3)
	 {
		 logger.info("1- You have an account\n");
		 logger.info("2- Create account ");
		 logger.info("Your option is : ");
		 int x=scc.nextInt();
		
			int userselected3 = 0;
			
            

		do
		{String cc1 = null;
		String cc2; 
			if(x==1) {
				if(!flagaccount) {
					logger.info(ayy);
			 cc1=scc.next();emails=cc1;
			 logger.info(ayy1);
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
				logger.info("Option 1 is selected. Thank u ");
				logger.info("Please Enter Information of your product");
				
				
				
				
				Integer g= ProductMain.prod.size()+1;
				ProductMain mm1=scan();
				nameofprod=mm1.name;
				height=Integer.parseInt(mm1.high);
				
				
				
				mm1.createProduct(g.toString(), mm1.type, nameofprod, mm1.description, mm1.specialtreatment,mm1.high,mm1.width);
				logger.info("Your product added to the system\n");
				countprod++;countprod1++;
				flagintitail=true;
			
				
		
				
			break;
			case 2:
				
				logger.info("Option 2 is selected. Thank u ");
				
				logger.info("Enter name of product you need to update : ");
				
				String r= scc.next();
				Integer in=f1(r);
				
				logger.info("Please update Information of your product");
				
				ProductMain mmm=scan();
				height=Integer.parseInt(mmm.high);
				
				nameofprod=mmm.name;
				
				mmm.updateProduct(in.toString(), mmm.type, mmm.name, mmm.description, mmm.specialtreatment,mmm.high,mmm.width);
				logger.info("Your product updating in the system");
				
			
				
				break;
			case 3:
				logger.info("Enter name of product you need to delete : ");
				 
				String hh= scc.next();
				Integer i1=f1(hh);
				
				ProductMain o=new ProductMain();
				o.deleteProduct(i1.toString());
				
				break;
			case 4:
					
				for(int i=0;i<Customer.user1.size();i++) {
					
					if(Customer.user1.get(i).getEmail().equals(emails) ) {
						logger.info("* * * * * * * * * * * * * * * * * * * * * *");
						ayam="*"+TT+TT+"SSN " + Customer.user1.get(i).id+	  TT+TT+"  *";
						logger.info(ayam);
						ayam="*"+TT+TT+"Name " + Customer.user1.get(i).name+	 TT+TT+"  *";
						logger.info(ayam);
						ayam="*"+TT+TT+"Phone " + Customer.user1.get(i).phone+	 TT+TT+"  *";
						logger.info(ayam);
						Customer.user1.get(i);
						ayam="*"+TT+TT+"addresss " + Customer.addresss+	 TT+TT+"  *";
						logger.info(ayam);
						ayam="*"+TT+TT+"Product " + nameofprod+	 TT+TT+"  *";
						logger.info(ayam);
						Bill b=new Bill();
						int billCus=b.priceProd(height,countprod);pr1=billCus;
						ayam="*"+TT+TT+"Price " +billCus+"$"+	 TT+TT+"  *";
						logger.info(ayam);
						ayam="*"+TT+TT+"Delivary 20$" +		 TT+TT+"  *";
						logger.info(ayam);
						ayam="*"+TT+TT+"Total Price " +b.totalPriceofproduct(height,countprod)+"$"+ TT+TT+"  *";
						logger.info(ayam);
						logger.info("* * * * * * * * * * * * * * * * * * * * * *");
					}
				}
				
				logger.info("");
				break;
			case 5:
				if(ProductMain.productInWaiting() || ProductMain.productInCleaning() || ProductMain.productCompleted())
					logger.info("Product finished wait state and go to cleaning state");
					else
						logger.info("State Product in Cleaning ");
					break;
			case 6:
				int o1=0;
				String diss="Price before Discount : ";
				Bill c=new Bill();
				if(flagintitail ) {
					flagintitail=false;
					if(!emails.equals("ayamoinn@gmail.com")){
					o1=c.discountInPrice10(pr1,5);
					ayam=diss+pr1;
					logger.info(ayam);
					ayam="Price after Discoaunt : "+o1;
					logger.info(ayam);}
					
				}
				if(pr1>600) {
					o1=c.discountInPrice10(pr1,10);
					ayam=diss+pr1;
					logger.info(ayam);
					ayam="Price after Discount : "+o1;
					logger.info(ayam);
				}
				if(countprod>6) {
				      o1=c.discountInNumber(countprod);
				      
				      
				      
				      int y=o1*pr1;
				      ayam=diss+pr1;
				      logger.info(ayam);
				      ayam="Price after Discount : "+y;
				      logger.info(ayam);
				}
				break;
			default : 
				logger.info("Hello");
        		break;
				}
			
			
			 }}
			
		}
			else {
				emails=createaccountcus();
				x=1;
	
				flaguser=true;
				
			}
			 }
		 
		while(userselected3<7 );
		{    
			 

			userselected =firstMenu();
			

		}
             }
            
	 
	 
	 
		}
		 

		}


	
	

	public static int firstMenu()
	{
		int selection ;
		 Scanner sc = new Scanner(System.in);
		 
		 logger.fine("An exception occurred with message: {}");
		 logger.info(STR);
		 
		 logger.info("★        Welcome:            ★");
		 logger.info(STR);
		 logger.info("★        Login as :          ★");
		 logger.info("★        1- Admin            ★");
		 logger.info("★        2- Worker           ★");
		 logger.info("★        3- Customer         ★");
		 logger.info("★        4- Exit             ★");
		 logger.info(STR);
		 logger.info(OPT);
			selection=sc.nextInt();
			
		
	return selection;
		
		
		
	}


	public static int adminMenue()
	{
		int selection ;
		 Scanner sc = new Scanner(System.in);
		  	
		 logger.info("          Admin");
		 logger.info(STR+" ★");
		 logger.info("★"+S1+"1-"+S1+"Show customer"+TT+"★");		
		 logger.info("★"+S1+"2-"+S1+"Show Product "+TT+"★");     
		 logger.info("★"+S1+"3-"+S1+"Show worker "+TT+TT+"★");
		 logger.info("★"+S1+"4-"+S1+"Delete Customer"+TT+"★");
		 logger.info("★"+S1+"5-"+S1+"Delete Product"+TT+"★");
		 logger.info("★"+S1+"6-"+S1+"report"+TT+TT+"★");
		 logger.info(STR+" ★");
		 logger.info(OPT);
			selection=sc.nextInt();

	return selection;
		
		
		
	}
	public static int customerMenu()
	{
		int selection;
		 Scanner sc = new Scanner(System.in);
		

		 logger.info("            Customer");
		 logger.info("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
		 logger.info("★"+S1+"1-"+S1+"Add Product"+TT+TT+"★");
		 logger.info("★"+S1+"2-"+S1+"Updtate Product"+TT+"★");
		 logger.info("★"+S1+"3-"+S1+"Delete Product"+TT+"★");
		 logger.info("★"+S1+"4- "+S1+"get bill"+TT+TT+"★");
		 logger.info("★"+S1+"5-"+S1+"get Order Status"+TT+"★");
		 logger.info("★"+S1+"6-"+S1+"discount"+TT+TT+"★");
		 logger.info("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
		 logger.info(OPT);
			

			selection=sc.nextInt();



	return selection;
		
	}



	public static int workerMenu()
	{
		int selection ;
		 Scanner sc = new Scanner(System.in);
		 

		 logger.info("          Worker");
		 logger.info("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
		 logger.info("★    1- Show Products     ★");
		 logger.info("★    2- Show Worker Team     ★");
		 logger.info("★    3- Show Worker Time      ★");
		 logger.info("★    4- Main Menu      ★");


		 logger.info("★              ★");
			
		 logger.info("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
		 logger.info(OPT);

			selection=sc.nextInt();
			logger.info("Your selected option is: ");

			
		 return selection;
		
	}




	public static int  menu()
	{
		int selection ;
		 Scanner sc = new Scanner(System.in);
		 
		 logger.info("       Welcome");
		 logger.info("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
		 logger.info("★  Select your option      ★");
		 logger.info("★  1- Create customer      ★");
		 logger.info("★  2- add customer         ★");
		 logger.info("★  3- delete customer      ★");
		 logger.info("  ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ★ ");
		 logger.info("Your selected option is: ");

		selection=sc.nextInt();
	return selection;
	}
	public static ProductMain scan()
	{
		Scanner scan = new Scanner(System.in);
		logger.info("Enter name of product ");
		 
		 ProductMain tt = new ProductMain() ;
	     tt.name = scan.next();
	     
	     
	     logger.info("Enter type of his product ");

		tt.type = scan.next();
		
		logger.info("The size of product highet and width : ");
		
		tt.high=scan.next();
		tt.width=scan.next();
		
		logger.info("Enter description ");
		tt.description=scan.next();
		logger.info("Enter image of product ");
		tt.image=scan.next();
		logger.info("If you need a special treatment ");
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
		logger.info("Welcome\nYou now in create account page\nEnter your information");
		logger.info("SSN : ");ff.id=n.next();
		logger.info("Name : ");ff.name=n.next();
		logger.info("Adderess : ");Customer.addresss=n.next();
		logger.info("Phone : ");ff.phone=n.next();
		
		logger.info("Email : ");String hh=n.next();
		ff.setEmail(hh);
		logger.info("Password : ");ff.setPassword(n.next());
		logger.info("Confirm password : ");
		if (!Customer.pass.contains(ff.getPassword()))
			Customer.pass.add(ff.getPassword());
			if (!Customer.email.contains(hh))
				Customer.email.add(ff.getEmail());
			if (!Customer.user1.contains(ff))
				Customer.user1.add(ff);
			return ff.getEmail();
		
	}
	}

