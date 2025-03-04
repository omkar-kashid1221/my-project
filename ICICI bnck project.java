Skip to main content
Google Classroom
Classroom
E9- Java- Varun Sir
Home
Calendar
Enrolled
To do
E
E9- Java- Varun Sir
Archived classes
Settings
Announcement
Varun GR
•
19:23
Enjoy

ICICI.java
Java
Class comments

Add class comment…

import java.util.Scanner;
import java.lang.Thread;
class ICICI 
{
	public static void main(String[] args) 
	{
		Scanner bank = new Scanner(System.in);

        // internet -account -details //
		String name="";
		long phoneNo=0;
		int pwd=0;

		// bank-account-details//
		long accountNo=0;
		String ifsc="";
		String address="";
		String upiId="";

		// transaction-details //
		double balance=0.0;
		double withdrawAmt=0.0;
		double depositAmt=0.0;



		System.out.println("Want To Create Account ?    Y- Yes |    N- No");
		char result=bank.next().charAt(0);

		if(result=='y' || result=='Y')
		{
			System.out.println("Enter You Beautiful Name: ");
			name = bank.nextLine();
			name = bank.nextLine();
			System.out.println("Enter Your Magical Phone Number: ");
			phoneNo = bank.nextLong();
			System.out.println("Enter Your Un-hackable Amazing Password: ");
			pwd = bank.nextInt();

			System.out.println("Successfully Created Account "+name);

			try
			{
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("===============================");
			System.out.println("Name: "+name);
			System.out.println("Contact: "+phoneNo);
			System.out.println("===============================");

			try
			{
				Thread.sleep(2000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			System.out.println("Generating Bank Account Please Wait.......");
			accountNo = 3872945297863l;
			ifsc="ICIC00540457";
			address="Deccan-Pune";
			System.out.println("Enter Your New UPI ID To Proceed Further: ");
			upiId=bank.next();
			balance=50000.0d;

			try
			{
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			System.out.println("Account Creation Successful");

			try
			{
				Thread.sleep(2000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			System.out.println("===============================");
			System.out.println("Account Number: "+accountNo);
			System.out.println("IFSC: "+ifsc);
			System.out.println("Branch Address: "+address);
			System.out.println("UPI ID: "+upiId);
			System.out.println("FREE BALANCE- :)"+balance);
			System.out.println("===============================");

			try
			{
				Thread.sleep(2000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			System.out.println("ATM Interface Loading........");

			try
			{
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			System.out.println("Choose Your Options: ");
			System.out.println("1.Withdraw Funds");
			System.out.println("2.Deposit Funds");
			System.out.println("3.Exit");

			int options=bank.nextInt();

			switch(options)
			{
				case 1:
				{
					System.out.println("Enter Your Phone Number and Password To Withdraw Funds: ");
					long userInputtedPhoneNo=bank.nextLong();
					int userInputtedPwd=bank.nextInt();

					if(userInputtedPhoneNo==phoneNo && userInputtedPwd==pwd)
					{
						System.out.println("Enter Money To Withdraw: ");
						withdrawAmt=bank.nextDouble();
						
						if(balance<withdrawAmt)
						{.
							System.out.println("Insufficent Balance!");
						}
						else
						{
							balance-=withdrawAmt;
						    System.out.println("Successfully Withdrawn "+withdrawAmt+" Rupees");
						}

						System.out.println("Enter Password To Fetch Balance: ");
						int userInputtedPwd2=bank.nextInt();
						if(pwd==userInputtedPwd2)
						{
							System.out.println("Balance: "+balance);
						}
						else
						{
							System.out.println("Password Mismatch! Cannot Display Balance");
						}
					}
					else
					{
						System.out.println("Invalid Credentials! Try Again Later");
					}



				}
				break;

				case 2:
				{
					System.out.println("Enter Your Phone Number and Password To Deposit Funds: ");
					long userInputtedPhoneNo=bank.nextLong();
					int userInputtedPwd=bank.nextInt();

					if(userInputtedPhoneNo==phoneNo && userInputtedPwd==pwd)
					{
						System.out.println("Enter Money To Deposit: ");
						depositAmt=bank.nextDouble();
						balance+=depositAmt;
						System.out.println("Successfully Deposited "+depositAmt+" Rupees");

						System.out.println("Enter Password To Fetch Balance: ");
						int userInputtedPwd2=bank.nextInt();
						if(pwd==userInputtedPwd2)
						{
							System.out.println("Balance: "+balance);
						}
						else
						{
							System.out.println("Password Mismatch! Cannot Display Balance");
						}

					}
					else
					{
						System.out.println("Invalid Credentials! Try Again Later");
					}
				}
				break;

				case 3:
				{
					System.out.println("Thank You For Using This Dummy Banking Application :)");
				}
				break;

				default:
				{
					System.out.println("Invalid Options! Try Again Later");
				}
			}
		}
		else
		{
			try
			{
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			System.out.println("YOU ARE MISSING THIS AMAZING OPPORTUNITY :(");

			try
			{
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}

			System.out.println("YOUR LOSSS :)");
		}


	}
}
ICICI.java
Displaying ICICI.java.
