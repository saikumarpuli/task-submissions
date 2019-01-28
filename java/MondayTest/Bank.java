/*
 * 
1. Write a class Account having properties Account Number, Account Holder Name, Account Holder Address, Account Holder Balance.
Create a SavingsAccount subclass having methods to addBalance, displayBalance and withDraw amount.
Now create a main class Bank
In the main class
Create list of accounts.
Perform operations on any account from the list, add balance, displayBalance, withDraw. 
Create user defined exception “Insufficient Balance”, if the Withdrawal amount is greater than balance Amount. It should throw exception
 “Insufficient Balance”.
Write the objects into a file.
 */

package lasttest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
class Account{
	int accountNumber;
	float accountHolderBalance;
	String accountHolderName,accountHolderAddress;
	Account(int accountNumber,String accountHolderName,float accountHolderBalance,String accountHolderAddress){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.accountHolderBalance=accountHolderBalance;
		this.accountHolderAddress=accountHolderAddress;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public float getAccountHolderBalance() {
		return accountHolderBalance;
	}
	public String getAccountHolderAddress() {
		return accountHolderAddress;
		
	}
	public String toString() {
		return "account number :" +accountNumber + " account Hollder name : " +accountHolderName + " account holder balance : " + accountHolderBalance 
											+ " account holder address " + accountHolderAddress;
		
	}
}

class SavingsAccount extends Account{
	SavingsAccount(int accountNumber, String accountHolderName, float accountHolderBalance,
			String accountHolderAddress) {
		super(accountNumber, accountHolderName, accountHolderBalance, accountHolderAddress);
		// TODO Auto-generated constructor stub
	}
 SavingsAccount() {
	 super();
		// TODO Auto-generated constructor stub
	}
	Scanner scan=new Scanner(System.in);
		public void addBalance() {
		float addbalance;
		System.out.println("enter amount to add balance: ");
		addbalance=scan.nextFloat();
		accountHolderBalance+=addbalance;
	}
	public void displayBalance() {
		System.out.println("Account Balance is : " + accountHolderBalance);
	}
	public void withDrawAmount() throws Exception{
		try {
			float withdrawbalance;
			System.out.println("enter amount to withdraw balance: ");
			withdrawbalance=scan.nextFloat();
			if(withdrawbalance<accountHolderBalance) {
				accountHolderBalance-=withdrawbalance;
			}
			
		}
		catch(Exception e) {
			System.out.println("insufficient balance: ");
		}
		
		
	}
}
public class Bank implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Scanner scan=new Scanner(System.in);
	List al=new ArrayList();
	public   void accounts() throws IOException {
		System.out.println("enter a number to number of accounts: ");
		int iterator,number, accountNumber;
		float accountHolderBalance;
 		String accountHolderName;
		String accountHolderAddress;
		number=scan.nextInt();
		Account []accountObject=new Account[number];
		
		for(iterator=0;iterator<number;iterator++) {
			System.out.println("enter account number:");
			accountNumber=scan.nextInt();
			System.out.println("enter account holder balance:");
			accountHolderBalance=scan.nextFloat();
			System.out.println("enter account Holder name:");
			accountHolderName=scan.nextLine();
 			System.out.println("enter account Holder address:");
			accountHolderAddress=scan.nextLine();
			accountObject[iterator]=new Account(accountNumber, accountHolderAddress, accountHolderBalance, accountHolderAddress);
			al.add(accountObject[iterator]);  
			}			
			System.out.println(al);
			String file="bank.txt";
			Bank.serializable(al,file);
			Iterator itr=al.iterator();
			while(itr.hasNext()) {

		        System.out.println(itr.next());
			}
			System.out.println("serialize is sucess");

		}
	public static void serializable(List al2,String file) throws IOException
	{
		try {
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(al2);
			fos.close();
			oos.close();

		  	}
		catch(Exception e)
		{
			System.out.println(e);
		} 
	}
	public static void main(String[] args) throws Exception {
		Bank bank=new Bank();
		bank.accounts();
		SavingsAccount savingaccountObject=new SavingsAccount();
		SavingsAccount object=new SavingsAccount(0, null, 0, null);
		savingaccountObject.addBalance();
		savingaccountObject.displayBalance();
		savingaccountObject.withDrawAmount();
		
		
	}
}
