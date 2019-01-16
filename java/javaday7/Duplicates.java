/*
 * 3) Remove duplicates from the given array without using set
 */
package practice;
import java.util.*;
public class Duplicates {
	public static void main(String args[])
	{
		int length,i;
		Scanner ref=new Scanner(System.in);
		System.out.println("enter the length for array:");
		length=ref.nextInt();
		int arr[]=new int [length];
		System.out.println("enter elements into the array:");
		for(i=0;i<length;i++)
		{
			arr[i]=ref.nextInt(); //reading values into the array
		}
		Duplicates obj=new Duplicates();
		obj.removeDuplicates(arr,length); //function calling
		ref.close();
	}
	public void removeDuplicates(int arr[],int length) //fuction for finding non duplicate values
	{
		System.out.println("array without duplicate values:");
		int i,j,count=0;
		for(i=0;i<length;i++) //for each itearation of array value
		{
			count=0;
			for(j=i+1;j<length;j++)
			{
				if(arr[i]==arr[j]) //comparing one value with remaining other values
				{
					count++; //number of duplicate values
				}
				  
			}
				if(count==0)
				{
					System.out.print(arr[i]  +"  "); //printing non repeated vale in array
				} 
		} 
	}
}

 