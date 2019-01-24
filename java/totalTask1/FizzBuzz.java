/*
 * Fizz Buzz
Write a method that returns 'Fizz' for multiples of three and
 'Buzz' for the multiples of five.
For numbers which are multiples of both three and five return 'FizzBuzz'.
For numbers that are neither, return the input number.
Input(i)  Actual	Expected
1	    1	           1
5	    Buzz          Buzz
15	  FizzBuzz     FizzBuzz
3	    Fizz	            Fizz
121	     121	              121
125	     Buzz	Buzz 
 */

package task;

import java.util.Scanner;

public class FizzBuzz {
	public void method()
	{
		String string1="Fizz",string2="Buzz",string3="FizzBuzz";
		int number;
		Scanner ref=new Scanner(System.in);
		System.out.println("enter a number:");
		number=ref.nextInt();
		if((number%3==0)&&(number%5==0))
				{
			System.out.println(string3);
				}
		else if((number%3==0)&&(number%5!=0))
		{
			System.out.println(string1); 
		}
		else if((number%3!=0)&&(number%5==0))
		{
			System.out.println(string2); 
		}
		else
		{
			System.out.println(number); 

		}
		ref.close();
		
	}
	public static void main(String[] args) {
		FizzBuzz object=new FizzBuzz();
		object.method();
	}

}
