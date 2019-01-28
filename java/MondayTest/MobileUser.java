/*
 * 
.Create an interface Sim that contains method sendSMS() parameters message and mobileNumber, dialACall() with parameter mobile number. 
Create classes Airtel, BSNL and Vodafone which implement Sim.
Create a Class Mobile contains insertSim() along with sendSms() and dialACall()
Now Create MobileUser where he can insert sim and the functionality sendSms or dialACall.  
In mobile use class(main class) Create a mobile instance 
Mobile micromax = new Mobile();
micromax.insertSim .......

Give options fot the use to choose a sim.
1 for airtel
2 for bsnl
3 for vodafone ...

based on the users option from the main class call insert the sim(send sim object to mobile class) and 
1. to make calls and 
2. send sms. 
from the mobile
from the mobile class based on the users choice from main class.

 */

package friday;

import java.util.Scanner;
import java.math.*;
interface Sim{
 void sendSMS();
 void dialACall();
}
class Airtel implements Sim{
	Scanner scan=new Scanner(System.in);

	public void sendSMS() {
 	String message;
 	BigInteger mobileNumber;
 	System.out.println("Enter Message to send SMS in Airtel: ");
 	message=scan.next();
 	System.out.println("Enter the mobile number to send SMS in Airtel: ");
	mobileNumber=scan.nextBigInteger();
 	System.out.println("The mobile number is : "+ mobileNumber  + " Message is : "  + message);
 	}

 	public void dialACall() {
 	 	BigInteger mobileNumber;
  	 	System.out.println("Enter the mobile number to dial a call in Airtel: ");
 	 	mobileNumber=scan.nextBigInteger();
 	 	System.out.println("The mobile number is : "+ mobileNumber);
	}

	
}
class BSNL implements Sim{
	Scanner scan=new Scanner(System.in);

	public void sendSMS() {
	 	String message;
	 	BigInteger mobileNumber;
		System.out.println("Enter Message to send SMS in BSNL: ");
	 	message=scan.nextLine();
	 	System.out.println("Enter the mobile number to send SMS in BSNL: ");
 	 	mobileNumber=scan.nextBigInteger();
	 	System.out.println("The mobile number is : "+ mobileNumber  + " Message is : "  + message);
 		}

	 	public void dialACall() {
	 	 	BigInteger mobileNumber;
 	 	 	System.out.println("Enter the mobile number to dial a call in BSNL: ");
	 	 	mobileNumber=scan.nextBigInteger();
	 	 	System.out.println("The mobile number is : "+ mobileNumber);
 		}
	
}
class Vodafone implements Sim{
		Scanner scan=new Scanner(System.in);

	public void sendSMS() {
	 	String message;
	 	BigInteger mobileNumber;
 		System.out.println("Enter Message to send SMS in Vodafone: ");
	 	message=scan.nextLine();
	 	System.out.println("Enter the mobile number to send SMS in Vodafone: ");
 	 	mobileNumber=scan.nextBigInteger();	 	
	 	System.out.println("The mobile number is : "+ mobileNumber  + " Message is : "  + message);
 		}

	 	public void dialACall() {
	 	 	BigInteger mobileNumber;
	 	 	System.out.println("Enter the mobile number to dial a call in Vodafone: ");
	 	 	mobileNumber=scan.nextBigInteger();
	 	 	System.out.println("The mobile number is : "+ mobileNumber);
 		}
	
}
class Mobile{
	Scanner scan=new Scanner(System.in);
	public void insertSim()
	{
		System.out.println("Insert the sim into the mobile to make SMS and calls");
	}
	 	 	public void mobileOperations() {
			System.out.println("Give options for the use to choose a sim.");
			System.out.println("enter 1 for Airtel:");
			System.out.println("enter 2 for bsnl:");
			System.out.println("enter 3 for Vodafone:");
			System.out.println("enter 4 to exit");
			int option=scan.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Send SMS and dial call from Airtel: ");
				Airtel airtelObject=new Airtel();
				System.out.println("choose option to make calls or send sms " );
				System.out.println("enter 1 for SMS:");
				System.out.println("enter 2 for Calls:");
				int number=scan.nextInt();
				switch(number) {
				case 1:
					airtelObject.sendSMS();
					break;
				case 2:
					airtelObject.dialACall();
					break;
					}
				break;
			
			case 2:
				System.out.println("Send SMS and dial call from BSNL: ");
				BSNL bsnlObject =new BSNL();
				System.out.println("choose option to make calls or send sms " );
				System.out.println("enter 1 for SMS:");
				System.out.println("enter 2 for Calls:");
				number=scan.nextInt();
				switch(number) {
				case 1:
					bsnlObject.sendSMS();
					break;
				case 2:
					bsnlObject.dialACall();
					break;

				}
				break;
 			
			case 3:
				System.out.println("Send SMS and dial call from Vodafone: ");
				Vodafone vodafoneObject =new Vodafone();
				System.out.println("choose option to make calls or send sms " );
				System.out.println("enter 1 for SMS:");
				System.out.println("enter 2 for Calls:");
				number=scan.nextInt();
				switch(number) {
				case 1:
					vodafoneObject.sendSMS();
					break;
				case 2:
					vodafoneObject.dialACall();
					break;

				}
				break;
 				
			case 4:
				System.exit(0);
				break;
			}
			 
		}

}
 
public class MobileUser {
	public static void main(String[] args) {
		Mobile Nokia=new Mobile();
		Nokia.insertSim();
 		Nokia.mobileOperations();
		}
}

/*Output:-
 *Insert the sim into the mobile to make SMS and calls
Give options for the use to choose a sim.
enter 1 for Airtel:
enter 2 for bsnl:
enter 3 for Vodafone:
enter 4 to exit
1
Send SMS and dial call from Airtel: 
choose option to make calls or send sms 
enter 1 for SMS:
enter 2 for Calls:
2
Enter the mobile number to dial a call in Airtel: 
9989289323
The mobile number is : 9989289323
*/
