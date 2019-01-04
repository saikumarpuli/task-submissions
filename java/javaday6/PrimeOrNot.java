//java program to check given number is prime number or not

package sai;
import java.util.Scanner;
public class PrimeOrNot 
{
	 	public static void main(String args[])
				{
					short n; //for memory utilization i used short  data type
					Scanner o=new Scanner(System.in);
					System.out.println("enter an shorteger to check Prime number or not");
					n=o.nextShort();		//input of n value
					 prime(n);		//method calling to check prime or not
					o.close();
				}
	 	//method to check prime or not
				public static void prime(short n) 
				{
					short i,count=0;
					if(n==0||n==1)  //0 and 1 are not a prime numbers 
					{
						System.out.println(n + " is a not prime number");
					}
					else
					{
						for(i=2;i<n/2;i++) //it is enough to check up to n/2  number 
						{
							if(n%i==0)
								{
									count++; //count is for count number of successful division
								}
						}
						if(count==0)
							System.out.println(n + " is a prime number");
						else
							System.out.println(n + " is a not prime number");
					}
				}
 
}
