//java program for checking given string is palindrome or not
package sai;
import java.util.Scanner;
public class StringPolindrom
{
	public static void main(String args[])
	{
		String word;
		int count=0,i,j;
		System.out.println("enter a string:");
		Scanner ref=new Scanner(System.in);
		word=ref.next();  //reading a string
		char array[]=new char[word.length()];  //initialization of  new array with string length
		array=word.toCharArray();  //string to character array 
 		for(i=0,j=word.length()-1;i<=word.length()/2;i++,j--)//comparing of first and last characters in given string
		{
			if(array[i]!=array[j]) 
			{ 
				count++; //if characters are not same then count will increase 
			}
		} 
 		if(count==0)
 		{
 			System.out.println("given string is palindrome");
 		}
 		else
 		{
 			System.out.println("given string is not a palindrome");
 		}
 		ref.close();
 
	    }
	
	}

