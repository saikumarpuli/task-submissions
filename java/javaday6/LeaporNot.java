/*15> Write a method to accept a year number, test and display whether the given number is leap year or not*/
/* leap year means the year should be divisible by 400 or it is devisible by 4 but not 100*/
package sai;
import java.util.*;
public class LeaporNot {
	int year;  //variable to read year
	Scanner ref; //Scanner reference variable

	public void reading()  //function to read year
	{
		ref=new Scanner(System.in);
		System.out.println("enter the year to check leap year or not:");
		year=ref.nextInt();  //reading of year
		
	}
public void checkLeaporNot()   //function to checking the year is leap year or not
{
	if((year%4==0)&&(year%100!=0)||(year%400==0)) //logic for the leap year
	{
		System.out.println("entered year is leap year:");
	}
	else
	{
		System.out.println("entered year is not a leap year:");

	}
}
public static void main(String args[])
{
	LeaporNot obj=new LeaporNot(); //object creation for class
	obj.reading();   //function calling for reading function
	obj.checkLeaporNot(); //function calling for checkingleaporNot function
}

}
