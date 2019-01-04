//java program to print odd numbers up to given number

package sai;
import java.util.Scanner;
public class Oddnumbers {
	public static void main(String args[])
	{
		short n;  //for memory utilization i used short  data type
		Scanner o=new Scanner(System.in);
		System.out.println("enter n value to get odd numbers upto n");
		n=o.nextShort();		//input of n value
	    nOddnumbers(n);    //method calling to get odd numbers
		o.close();
	}
	//method to return odd numbers
	public static void nOddnumbers(short n) 
	{
		short i;
		System.out.println("Odd numbers from 1 to " + n +" are: ");
		for(i=0;i<=n;i++)
		{
			if(i%2==1)     //logic (number%2==1) then number is odd
			{
			System.out.print(i + "   ");
			}
		}
	}

}
