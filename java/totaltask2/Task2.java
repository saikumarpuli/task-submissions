/*
 * 2. Create a class BankTransaction which containing money as property and methods
withdrawMoney and, depositMoney.
Create the classes Depositer and Withdrawer which implements runnable interface, constructor
to initialize BankTransaction property of the class. Implement the run method with while loop
calling withdraw and depositeMoney methods from each thread.
Ex: run() {
int i=0 ;
while(i<10)
{
// call the respective method from the class
}
}
And also print thread name and priority.
 */
package task;
class BankTransaction extends Thread
{
	int money;
	
	void withdrawMoney()
	{
		System.out.println("withdraw ammount is " + money);
	}
	void dipositeMoney()
	{
		System.out.println("Deposite money is "+ money);

	}
}
class Depositer implements Runnable
{
	BankTransaction bt=new BankTransaction(); 
	Depositer(int money)
	{
		bt.money=money;
	}
	public void run()
	{
		int  i=0;
		while(i<10)
		{
			bt.dipositeMoney();
			i++;
		}
		System.out.println("name of the thread " +bt.getName()  + " priority of the thread is  " + bt.getPriority());
	}
}
class Withdrawer implements Runnable
{	
	BankTransaction bt=new BankTransaction(); 
	Withdrawer (int money)
	{
		bt.money=money;
	}
	public void run()
	{
		int  i=0;
		while(i<10)
		{
			bt.withdrawMoney();
			i++;
		}
		System.out.println("name of the thread " +bt.getName()  + " priority of the thread is  " + bt.getPriority());
	
		
	}
}

public class Task2 {
	public static void main(String args[])
	{
		int money=500;;
		Depositer dp=new Depositer(money);
		Thread tobj1=new Thread(dp); 
		Withdrawer wd=new Withdrawer(money);
		Thread tobj2=new Thread(wd);
		tobj1.start();
		tobj2.start();
 
	}

}
