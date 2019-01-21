/*
 * 7)find the first repetative letter from the given string String input="abcddeff". return 'd'
 */

package practice;
import java.util.*;
public class Repeated {
	public static void main(String[] args) {
		String string;
		Scanner ref=new Scanner(System.in);
		System.out.println("enter the String:");
		string=ref.next();
		int length=string.length();
		int i,j,count=0;
		for(i=0;i<length;i++) //for each itearation of array value
		{
			for(j=i+1;j<length;j++)
			{
				if(string.charAt(i) ==string.charAt(j))  
				{
					count++; 
					System.out.println("first repeatative letter is:" + string.charAt(i)) ;
					break;
				} 
			}
			if(count>0)
			{
				break;
			} 
		}  
		ref.close();
	}

}
