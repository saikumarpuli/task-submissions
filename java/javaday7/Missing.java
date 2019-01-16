/*
 * 1)Find out the missing number in the array of length n-1 and integers in the range of 1 to n

 */
package practice;
import java.util.*;
public class Missing {
	public static void main(String args[])
	{
		Scanner ref=new Scanner(System.in);
		int n,i;  //n is for the range
		System.out.println("enter n value");
		n=ref.nextInt(); //reading range
		int arr[]=new int[n-1];
		System.out.println("enter number in the range from 1 to " + n + "number should not be repeated");
		for (i=0;i<n-1; )
		{
			
			arr[i]=ref.nextInt(); //reading array of numbers
			if(arr[i]>0&&arr[i]<n+1) //integer should be lie between 1 to n value
			{
				i++;
			}
			else 
			{
			System.out.println("enterd number should be lie between 1 to "+ n+1);	
			}
		} 
		Missing obj=new Missing(); //object creation of class Missing
		obj.findNum(arr,n);  //function calling for findNum
		ref.close();
	}
	//function to finding missing number
	public void findNum(int arr [],int n)
	{
		int num=1,i;
		//for loop from 0 to n-1
		for(i=0;i<n-1;i++)
		{
			if(arr[i]==num)//checking of number matching with integer in array
			{
				i=0;
				num++;
			}
			else
			{
				if(i>=n-2)
				{
					System.out.println("missing number is " + num);//printing missing number 
					break;
				}
				 
				
			}
			
			
		}
	}
	 
}
