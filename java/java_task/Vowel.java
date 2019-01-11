/*
 * 2.Count number of vowels in a String ”Mississippi” and remove the vowels form the string
 */
package practice;
public class Vowel {
	public static void main(String args[])
	{
		 
		StringBuilder string=new StringBuilder("Mississippi ");  
		int i,count=0;
		for(i=0;i<string.length();i++)
		{
			if((string.charAt(i)=='a')||(string.charAt(i)=='e')||(string.charAt(i)=='i')||(string.charAt(i)=='o')||(string.charAt(i)=='u'))
			{
				count++;
				string =string.deleteCharAt(i);
				
			}
		} 
		 System.out.println("number of vowels are :"+  count);
		 System.out.println(string);

	}

}
