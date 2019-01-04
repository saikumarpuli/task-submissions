//java program to print multiplication table for given number

package sai;
import java.util.Scanner;
public class MultiplyTable 
{
	 public static void main(String args[])
			{
				byte n; //for memory utilization purpose i use byte data type
				Scanner o=new Scanner(System.in);
				System.out.println("enter an integer to print multiplication table");
				n=o.nextByte();		//input of n value
				mTable(n);		//method calling to print multiplication table				
				o.close();
			}
	 	 //method to print multiplication table
			public static void mTable(byte n)
			{
				short i,k;					
				for(i=0;i<=10;i++)
				{
				k=(short)(n*i);
				System.out.println(n + "*" + i +"=" +k);
				}
			}
}
