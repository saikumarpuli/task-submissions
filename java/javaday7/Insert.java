/*
 * 2)Given a sorted array and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 */
package practice;
import java.util.*;
public class Insert {
	public static void main(String args[])
	{
		int num,i,target;
		Scanner ref=new Scanner(System.in);
		System.out.println("enter the number of elements: ");
		num=ref.nextInt();   //reading range for the number
		System.out.println("enter the elements in the  sorted order: ");
		int arr[]=new int [num];
		for(i=0;i<num;i++)
		{
			arr[i]=ref.nextInt();
		}
		System.out.println("enter the tarrget element: ");
		target=ref.nextInt();
		for(i=0;i<num;i++)
		{
			if(arr[i]==target) //to check equal or not
			{
				System.out.println("index of the tarrget element is :" + i);
			}
			else if(arr[i]<target && i==num-1) //for end of the array
			{
				System.out.println("target insert at the index is :" +(i));
			}
			else if(arr[i]<target&& arr[i+1]>target) //lie between the a[i] and a[i+1] index 
				{
					System.out.println("target insert at the index is :" +(i+1));
				}
			else
			{
				if(target<arr[0])
				{
					System.out.println("target insert at the index is :" +(i)); //for first index
					break;

				}
				
			}
		}
		ref.close();
	}

}
