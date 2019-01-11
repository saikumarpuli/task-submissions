/*
 * Java program to create a matrix and fill it with prime numbers
In this java program, we are creating a matrix and filling the matrix elements with prime numbers
 
Given number of rows and cols of a matrix and we have to fill it with the prime numbers using
java program.
Example:
Input:
Rows: 3
Cols: 3
Output:
Matrix:
2 3 5
7 11 13
17 19 23
 */

package practice;
import java.util.*;
public class Matrix {
	public static void main(String args[])
	{
		int row,col,i,j,n,c =0,k=0;
		
		Scanner ref=new Scanner(System.in);
		System.out.println("enter the row value");
		row=ref.nextInt();
		System.out.println("enter the column value");
		col=ref.nextInt();
		n=row*col;
		int a[]=new int[n];
		for(i=2;k!=n;i++)
		{c=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==0)
			{
				a[k]=i;
				k++;
			}
			 
		}
	 
			System.out.println("Matrix:");
		 
		for(i=0;i<n;i++)
		{
			if(i%col==0)
		      {
			System.out.println();
		      }
			System.out.print(a[i]+ " ");
			
		}
		ref.close();
	}

}
