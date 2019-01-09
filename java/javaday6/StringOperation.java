/*
10> Write a program to find below ones from the given string
	a> the positions of substring
	b> repeated count of substring
	c> remove the occurrence of the substring from main string and print
	i/p: 
		Main string: String s = "This is my palace"
		substring: is
	o/p:sub-string: is
		indexes: 2,5
		repeated count: 2
		main string after removal: "Th  my palace"*/
package sai; 
import java.util.*;
public class StringOperation {
	String Str,Substr;
	int i=0,j=0,k=0,count=0,strlen,substrlen,index;//i and j for iterations;k is count of matching char in string and substring
	public void readStrings()    //method to reading strings and finding the lengths
	{
		Scanner ref=new Scanner(System.in);
		System.out.println("enter the String :");
		Str=ref.nextLine();  //reading string
		System.out.println("enter the substring :");
		Substr=ref.next();  //reading sub string
		strlen=Str.length();   //finding the string length
		substrlen=Substr.length(); //finding the substring length
		ref.close();
	}
	public void display()   //function to display number of substrings found and index of each substring
	{
	
		if(strlen>substrlen) //checking that substring length is must be less than the string length
		{
			while(i<strlen)
			{
				for(j=0;j<substrlen;)
				{
					if(i<strlen)
					{
					if (Str.charAt(i)==Substr.charAt(j))
					{
						k++;
						j++;
						i++;
						if(k==substrlen)
						{
							count++;
							index=i-substrlen;
							System.out.println(index);
						}
					}
					else
					{
					 
						k=0;
						j=0;
						i++;
					 
						 
					}
					}
					else
					{
						break;
					}
					
				}
			}
			
		System.out.println("the number of substrings are:"+count);
		String[] arr = Str.split(Substr);  //splitting the string using substring "is"
	      									//splitting and store in new string array
		for (int i=0;i<arr.length;i++) {  
	            System.out.print(arr[i]+"");  //printing the string after remove substrings
	        }  
		}
	else
	{
		System.out.println("string length should be greater than the sub string.");
		System.exit(0);
	}
	}
	public static void main(String args[])
	{
		StringOperation obj=new StringOperation(); //object creation for class
		obj.readStrings(); //function call for readStrings function
		obj.display();  //function call for display function
	}
}