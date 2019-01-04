//java program to check given number is even or odd

package sai;
import java.util.Scanner;

public class OddOrEven 
{
 	public static void main(String args[])
			{
				short n;  //for memory utilization i used short  data type
				Scanner o=new Scanner(System.in);
				System.out.println("enter an shorteger to check odd or even");
				n=o.nextShort();		//input of n value
				 oddeven(n);		//method calling to check even or odd
				o.close();
			}
 	//method to check odd or even number
			public static void oddeven(short n) 
			{
				System.out.print(n + " is ");
				 if(n%2==0)  //logic (number%2==0) then number is even
				 	{
					System.out.print("even number");
					}
				 else
				 {
					 System.out.print("odd number"); 
				 }
			}

}


