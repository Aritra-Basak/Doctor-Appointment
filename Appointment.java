package personal;
import java.util.*;
import java.io.*;
class AppointmentBooking
{
	ArrayList<String> doctorName=new ArrayList<String>();
	ArrayList<String> doctorQualification=new ArrayList<String>();
	ArrayList<String> doctorGender=new ArrayList<String>();
	ArrayList<String> doctorPassword=new ArrayList<String>();
	ArrayList<Integer> doctorAge=new ArrayList<Integer>();
	ArrayList<String> doctorMobileNumber=new ArrayList<String>();
	ArrayList<String> doctorCity=new ArrayList<String>();

	ArrayList<Integer> patientAge=new ArrayList<Integer>();
	ArrayList<String> patientName=new ArrayList<String>();
	ArrayList<String> patientGender=new ArrayList<String>();
	ArrayList<String> patientPassword=new ArrayList<String>();
	ArrayList<String> patientConfirmPassword=new ArrayList<String>();
	ArrayList<Long> patientMobileNumber=new ArrayList<Long>();

	ArrayList<Integer> patientAgeBooking=new ArrayList<Integer>();
	ArrayList<String> patientNameBooking=new ArrayList<String>();
	ArrayList<String> patientGenderBooking=new ArrayList<String>();
	ArrayList<Byte> doctorID=new ArrayList<Byte>(); //for storing the serial number of doctor that has been appointed. 

	//method for creating PreDefined doctor list.
	void dataAdd()		
	{
		//Doctor's Name
		doctorName.add("Dipankar Debnath");
		doctorName.add("Sujit Roy");
		doctorName.add("Soumi Saha");
		doctorName.add("Ashish Gadpayle");
		doctorName.add("Riya Sadukhan");
		doctorName.add("Himanshu Pokhle");
		doctorName.add("Amit Mule");

		//Doctor's Qualification
		doctorQualification.add("MBBS Gold Medalist");
		doctorQualification.add("Er, MBBS");
		doctorQualification.add("MBBS, MD");
		doctorQualification.add("MBBS,MD");
		doctorQualification.add("BAMS");
		doctorQualification.add("MBBS, MD, Surgeon");
		doctorQualification.add("BAMS");

		//Doctor's Gender
		doctorGender.add("M");
		doctorGender.add("M");
		doctorGender.add("F");
		doctorGender.add("M");
		doctorGender.add("F");
		doctorGender.add("F");
		doctorGender.add("M");

		//Doctor's Login Passwords
		doctorPassword.add("Debnath123");
		doctorPassword.add("Sujit123");
		doctorPassword.add("Soumi123");
		doctorPassword.add("Ashish123");
		doctorPassword.add("Riya123");
		doctorPassword.add("Himanshu123");
		doctorPassword.add("Amit123");
		
		//Doctor's age
		doctorAge.add(45);
		doctorAge.add(54);
		doctorAge.add(29);
		doctorAge.add(29);
		doctorAge.add(28);
		doctorAge.add(23);
		doctorAge.add(30);

		//Doctor's Mobile Number
		doctorMobileNumber.add("9477672285");
		doctorMobileNumber.add("9447672285");
		doctorMobileNumber.add("9457672285");
		doctorMobileNumber.add("9497672285");
		doctorMobileNumber.add("9467672285");
		doctorMobileNumber.add("9407672285");
		doctorMobileNumber.add("9417672285");

		//Doctor's residential cities
		doctorCity.add("Kolkata");
		doctorCity.add("Kolkata");
		doctorCity.add("Bangalore");
		doctorCity.add("Nagpur");
		doctorCity.add("Mumbai");
		doctorCity.add("Kochi");
		doctorCity.add("Chennai");

	}

	//Admin's Method
	void admin() throws Exception //for MultiThreading (the use of Thread.sleep()) we have to throw exception
	{
		Scanner sc=new Scanner(System.in);
		byte choice;
		boolean flag=true;

		while(flag)
		{
			 Thread.sleep(1000);
	
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t |       Welcome Admin!    |");
			System.out.println("\t\t |_________________________|");
			System.out.print("\n\n1. Doctor list \t2. Registered Patients \t3.Pateints with Appointment \t4.Move Back  \n\nEnter Your Choice.");
			choice=sc.nextByte();
			switch(choice)
			{
			case 1:
				
				for(int i=0; i<=doctorName.size()-1; i++)
				{
					System.out.println("Name: \t "+doctorName.get(i));
				
				}
				byte menuCHoice;
				System.out.println("\n\n1. Main menu\t 2. Previous menu");
				menuCHoice=sc.nextByte();
				if(menuCHoice==1)
				{
					Thread.sleep(500); //After a pause or a sleep of 0.5 seconds the main thread will perform its task i.e send us back to the main menu page.
					flag=false;
					
				}
				else
				{
					Thread.sleep(500);//After a pause or a sleep of 0.5 seconds the main thread will perform its task i.e send us back to the previous menu page.
					admin();
					break;
					
				}

				break;

			case 2:
					if(patientName.isEmpty())
					{
						System.out.println("No Registered Patients yet.");
						Thread.sleep(3000);//With thread.sleep we are making the current thread (main) pause for 3sec and then after that the switch case will break and move to admin's menu page.
						break;
					}
					else 
					{
						for(int i=0; i<=patientName.size()-1; i++)
						{
							System.out.println((i+1)+". "+patientName.get(i));
						}

						System.out.println("\n\n1. Main menu\t 2. Previous menu");
						menuCHoice=sc.nextByte();
						if(menuCHoice==1)
						{
							Thread.sleep(1000);
							flag=false;
							
						}
						else
						{
							Thread.sleep(1000);
							admin();
						}
					}
					
					break;
				
			case 3:
				if(patientNameBooking.isEmpty())
				{
					System.out.println("\nNo Appointments yet.");
					Thread.sleep(3000);
					break;
				}
				
				else
				{
					for(int i=0; i<=patientNameBooking.size()-1; i++)
					{
						System.out.println((i+1)+". "+patientNameBooking.get(i)+"- The Doctor Appointed is: "+doctorName.get(doctorID.get(i)-1));
					}
					System.out.println("\n\n1. Main menu\t 2. Previous menu");
					menuCHoice=sc.nextByte();
					if(menuCHoice==1)
					{
						Thread.sleep(1000);
						flag=false;
						
					}
					else
					{
						Thread.sleep(1000);
						admin();
					}
				}
				break;
			case 4:
				System.out.println("\nYou chose to Move Back");
				flag= false;
				Thread.sleep(1000);
				break;
			

			default:
				System.out.println("\nYou entered wrong choice. enter your choice again....!!!");
				Thread.sleep(1000);
				admin();
				break;
					
			}
			break;


		}
		
	}

	//Patient Method
	void patient() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
		
			Thread.sleep(1000);
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | Welcome to Patient Page!|");
			System.out.println("\t\t |_________________________|");
			System.out.println(" ");
			System.out.println("1.Login \t 2.Registration \t 3. Exit\n");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					if(patientMobileNumber.isEmpty())
					{
						System.out.println("First register yourself then login..!");
						Thread.sleep(1000);//after the pause of 1sec the thread will lead us back to the patient's menu page
						break;
					}
					else
					{
						patientLogin();
						flag=false;
						
					}
					
					break;
					
				case 2:
					patientRegistration();
					flag=false;
					break;
					
				case 3:
					System.out.println("\nYou chose to exit");
					flag= false;
					Thread.sleep(1000);
					break;
				

				default:
					System.out.println("\nYou entered wrong choice. enter your choice again....!!!");
					flag= false;
					Thread.sleep(1000);
					break;
			}
		}
	}


	//Doctor's Method
	void doctor() throws Exception
	{
		
		
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		boolean flag=true;
		while(flag)
		{
		    Thread.sleep(1000);
	

			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | Welcome to Doctor Page! |");
			System.out.println("\t\t |_________________________|");
			System.out.println(" ");
			

			System.out.println("1. Login \t 2.Registration \t3.Exit");
			choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				if(doctorMobileNumber.isEmpty())
				{
					System.out.println("Register first...!");
					flag=false;
					Thread.sleep(500);
					break;

				}
				else
				{
					doctorLogin();
					flag=false;
				}

				break;
			case 2:
				doctorRegistration();
				flag= false;
				break;

			case 3:
				System.out.println("\nYou chose to exit");
				flag= false;
				Thread.sleep(1000);
				break;
			

			default:
				System.out.println("\nYou entered wrong choice. enter your choice again....!!!");
				Thread.sleep(1000);
				doctor();
				break;
			}
		}	

	}
	

	//Method for Patient Log in
	void patientLogin()throws Exception
	{

		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		long mobileNumber;
		byte choice;

		System.out.println("\t\t  _________________________");
		System.out.println("\t\t |                         |");
		System.out.println("\t\t |          Login          |");
		System.out.println("\t\t |_________________________|");

		

		System.out.println("\nEnter your Username(mobilenumber)");
		mobileNumber=sc.nextLong();
		System.out.println("Enter your Password");
		String password=sc.next();
	
 		
 		boolean flag1=false;
 		int j;
		for(j=0; j<=patientMobileNumber.size()-1;j++)//we are using mobile number as a key or index for storing patient because 1 or 2 patient name can be same but the mobile number will be different.
		{
			
			if((patientMobileNumber.get(j)).equals(mobileNumber)&&(patientPassword.get(j)).equals(password))//if all credentials are true then we will move forward
			{
				flag1=true;

				break;
			}
			
		}
		if(flag1==true)
		{		
			Thread.sleep(1000);
			
				System.out.println("\t\t  _________________________");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t |     Book Appointment    |");
				System.out.println("\t\t |_________________________|");
			System.out.println("\n Welcome "+patientName.get(j)+", to book appointment, choose your doctor..");
			
			for(int i=0; i<=doctorName.size()-1; i++)
			{
				System.out.println((i+1)+". "+doctorName.get(i));
			}
			choice=sc.nextByte();
			doctorID.add(choice);
			

			
			while(flag)
			{
				Thread.sleep(1000);

				
				System.out.println("\t\t  _________________________");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t |     Book Appointment    |");
				System.out.println("\t\t |_________________________|");
				
				
				
					if(choice<=doctorName.size() && choice>0)
					{
						System.out.println("\n\nName: \t "+doctorName.get(choice-1)+"\nAge: \t "+doctorAge.get(choice-1)+"\nMobile:  "+doctorMobileNumber.get(choice-1)+"\nCity: \t "+doctorCity.get(choice-1));
						System.out.println("\n Enter the patient's name: \t");
						sc.nextLine();
						patientNameBooking.add(sc.nextLine());
						System.out.println(" Enter patient's age: \t");
						patientAgeBooking.add(sc.nextInt());
						System.out.println(" Enter patient's gender: \t");
						patientGenderBooking.add(sc.next());

						System.out.println("\n Booking Successfull..");

						Thread.sleep(1000);//after 1 sec of sleep the main thread will lead us to the main menu page
						flag=false;
						break;
					}
					else 
					{
						System.out.println("\n enter correct input..");
						flag=true;
						Thread.sleep(1000);
					}
				
					
				
			}	

		}
		else 
		{
			System.out.println("Login unsuccessfull..");
			Thread.sleep(900);
			flag=false;
		}
	}

	
	//Method for Patient Registration
	void patientRegistration() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		long mobileNumber;
		System.out.println("\n");
		System.out.println("\t\t | Welcome to Patient Registration Page!|");
		System.out.println("\n");
		System.out.println("Please enter your name");
		patientName.add(sc.nextLine());
		System.out.println("enter your age: ");
		patientAge.add(sc.nextInt());
		System.out.println("Please enter your Mobile number");
		mobileNumber=sc.nextLong();
		long mno;
		
		boolean flag=true, flag1=true;
		
		if(patientMobileNumber.isEmpty())
		{
			patientMobileNumber.add((mobileNumber));
			System.out.println("Enter password");
			patientPassword.add(sc.next());
			System.out.println("Registration is Successfull.");
			
			Thread.sleep(900); //After successful registration the main thread will lead us to the main menu page.
			flag1=false;
						
		}
		else 
		{
			for(i=0;i<=patientMobileNumber.size()-1;i++)
			{
				mno=patientMobileNumber.get(i);
				
				if(mno==mobileNumber)
				{
					
					flag1=false;
					break;
				}
					
			}
			if(flag1==true)
			{
			patientMobileNumber.add(mobileNumber);
			System.out.println("Enter password");
			patientPassword.add(sc.next());
			System.out.println("Registration is Successfull.");
			Thread.sleep(900);
			}
			else 
			{
				System.out.println("same mobile numebr is not allowed\n");
				Thread.sleep(500);
			}
		}
	}
	
 
	//Method for Doctor's Registration
	void doctorRegistration() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		String mobileNumber;
		boolean flag=true, flag1=true;
					
			System.out.println("\t\t ----------------------------------");
			System.out.println("\t\t| This is doctor registration Page |");
			System.out.println("\t\t ----------------------------------");
			System.out.println("\n");
			
			System.out.println("Please enter your name");
			doctorName.add(sc.nextLine());

			System.out.println("Please enter your Mobile number");
			mobileNumber=(sc.next());
			
			String mno;

				if(doctorMobileNumber.isEmpty())
					{
						doctorMobileNumber.add((mobileNumber));
						System.out.println("Enter password");
							doctorPassword.add(sc.next());
							System.out.println("Registration is Successfull.");
							Thread.sleep(900);
							flag1=false;
				
						
					}
				else 
				{
					for(i=0;i<=doctorMobileNumber.size()-1;i++)
					{
						mno=doctorMobileNumber.get(i);
						
						if(mno.equals(mobileNumber))
						{
							
							flag1=false;
							break;
						}
							
					}
					if(flag1==true)
					{

								doctorMobileNumber.add(mobileNumber);
								System.out.println("Enter age:");
								doctorAge.add(sc.nextInt());
								System.out.println("Enter City: ");
								doctorCity.add(sc.next());
								System.out.println("Enter password");
								doctorPassword.add(sc.next());
								System.out.println("Registration is Successfull.");
								System.out.println("Details:- \n Name: "+doctorName+" \n Number:"+doctorMobileNumber +"\n Doctor's City: "+doctorCity);
								System.out.println();
								Thread.sleep(900);

					}
					else {
						System.out.println("same mobile numebr is not allowed\n");
						int index=doctorName.size()-1;
						doctorName.remove(index);
						Thread.sleep(500);

					}

				}
	}

	
	//Method for Doctor Login
	void doctorLogin() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		String mobileNumber;
		Thread.sleep(500);
		System.out.println("\t\t---------------------------------");
		System.out.println("\t\t| This is doctor login page     |");
		System.out.println("\t\t---------------------------------");
		System.out.println("Enter your Username(mobilenumber)");
		mobileNumber=sc.next();
		System.out.println("Enter your Password");
		String password=sc.next();
		int i=0;
		byte choice;
 		
 		boolean flag=false;
 		boolean flag11=true;

		for(i=0; i<=doctorMobileNumber.size()-1;i++)
		{
			
			if(((doctorMobileNumber.get(i)).equals(mobileNumber)) && ((doctorPassword.get(i)).equals(password)))
			{
				flag=true;
				break;
			}
		}
		
			if(flag==true)
			{
				while(flag11)
				{
					System.out.println("\t\t----------------------------------------");
					System.out.println("\t\t| Welcome Doctor "+doctorName.get(i)+" |");
					System.out.println("\t\t----------------------------------------");
					System.out.println("\n\nPress 1 to see your Appointments. \n");
					System.out.println("Press 2 to Log Out. \n");
					choice=sc.nextByte();
					byte j=0;
					switch(choice)
					{
					case 1:
						if((doctorID.isEmpty()!=true))
						{
							while(j<=doctorID.size()-1)
							{


								if( (i+1)== doctorID.get(j) )
								{
									System.out.println("patient name: "+patientNameBooking.get(j) );
									j++;
									
								}
							}
							System.out.println("\n\n1. Previous menu");
							Byte menuCHoice=sc.nextByte();
							if(menuCHoice==1)
							{
								Thread.sleep(1000);
								flag=false;
							}
							
							
						}
						else 
							{
								System.out.println("No Appointments...!");
								Thread.sleep(3000);
								flag11=true;
							}

						break;
					case 2:
						flag11=false;
						break;
					}
						
		
				}
				
			}	
			else
			{
				System.out.println("Login Unsuccessfull..");
				Thread.sleep(900);
			
			}
	}

	
	public static void main(String[] args) throws Exception   
	{
		AppointmentBooking ap=new AppointmentBooking();
		Scanner sc=new Scanner(System.in);
		ap.dataAdd();
		boolean flag=true;
		while(flag=true)
		{
			
		
			System.out.println("---------------------------------------------------------------------");
			System.out.println("\t\t  | Welcome to Doctor's Clinic |");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("\t\t| Have a Healthy and Better Life |\n\n");
				System.out.println("\n1. Doctor \t 2. Patient \t 3. Admin \t 4. Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				    case 1:
				    {
					ap.doctor();
					flag=true;
					break;
				    }
					case 2:
					{
					ap.patient();										
					flag=true;
					break;
					}
					case 3:
					{
					ap.admin();
					flag= true;
					//Thread.sleep(1000);
					break;
					}
					case 4:
					{
						 Thread.sleep(1000);
				    System.out.println("\t\t| Good Bye! Have a Nice Day. |\n\n");	
				    System.exit(0);
					}
					default:
				    System.out.println("\t\t| Wrong Choice. Please Enter Correct Options.|\n\n");	
		
					
					

		}	}
	}
}
