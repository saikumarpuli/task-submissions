/*
 * 6)Search particular character in the given string 
 *  
	EX : String = "Manjusha" 
       Our Target Value  = "u" then returns Test Passed
       Our Target Value  = "K" then returns Test Failed
 */

package practice;

import java.util.Scanner;

public class Finding {
	public static void main(String args[])
	{
		String string;
		int i,count=0;
		char target;
		Scanner ref=new Scanner(System.in);
		System.out.println("enter a string :");
		string=ref.next();
		int length =string.length();
		System.out.println("enter the targget charecter: ");
		target=ref.next().charAt(0);
		for(i=0;i<length;i++)
		{
			if(string.charAt(i)==target) //comparing charecters in string with target charactor
			{
				count++;
			}
		}
		if(count>0)
		{
			System.out.println("Test Passed."); 
		}
		else
		{
			System.out.println("Test Failed.");
		}
		ref.close();
	}

}
