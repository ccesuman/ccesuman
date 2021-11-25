import java.util.Scanner;
class AtmMachine 
{    
	static double totalamount=10000;
	
	public static void balanceEnqurary()
	{
		System.out.println("your total balance is: "+totalamount);
	}

// balance enquary method end
	public static void deposit(double amount) 
	{
		totalamount += amount;
        balanceEnqurary();
	}
//deposit block end

	public static void widrawl(double amount)
	{
		if(totalamount >= amount) 
		{
			totalamount -= amount;
             balanceEnqurary();
		}
		else {
			System.out.println("In Scfficient balance in your account");
		}

	}
	//widrawl method end
	public static void phoneNumber()
	{
		String phonenumber="7352689291";
		System.out.println("Your phone number is: "+phonenumber);
	}
	//phone number block end


	public static void main(String[] args) 

	{
		Scanner input= new Scanner(System.in);
		int pin=4546;
		System.out.println("Enter your 4 digit pin no and press enter key ");
		int pin1=input.nextInt();
		if(pin==pin1) {
        System.out.println("Welcome ");
		System.out.println("press 1 for balance enqurary");
		System.out.println("press 2 for Deposit");
		System.out.println("press 3 for Withdrowl");
		System.out.println("press 4 for phone number");
		int n= input.nextInt();



		switch(n)
		{
			case 1:
			balanceEnqurary();
		     break;
			 case 2:
		{ 
				 System.out.println("Enter the amount : ");
				 int amount = input.nextInt();
                 deposit( amount);
				 break;
		}
		case 3:
		{
          System.out.println("Enter the withdrawal amount: ");
		  int b= input.nextInt();
          widrawl(b);
		  break;
		}
		case 4:
			{ 
			 phoneNumber();
			 break;
		}
		default:
			System.out.println("Wrong input please try again");

		}



	}// switch block end
	
	else
		System.out.println("invalid pin number please try again");

	}
	// main block end 

}
