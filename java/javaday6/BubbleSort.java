package sai;
import java.util.*;
public class BubbleSort {
	public static void main(String args[])
	{
		int num,i,j;
		System.out.println("enter number of strings to read:");
		Scanner ref= new Scanner(System.in);
		num =ref.nextInt(); //reading number of strings
		String strings[]=new String[num];
		System.out.println("Reading of the Strings: ");
		for(i=0;i<num;i++)
		{
			strings[i]=ref.next(); //reading strings
		}
		 for(i=0;i<num;i++)
		 {
			 for(j=1;j<(num-i);j++)
			 {
				 if(strings[j-1].compareTo(strings[j])>0) //comparing two strings
				 {
					 String temp=strings[j-1];    //swapping of two strings
					 strings[j-1]=strings[j];
					 strings[j]=temp;
				 }
			 }
		 }
		 System.out.println("sorted list of arrays: ");
		 for(i=0;i<num;i++)
		 {
			 System.out.println(strings[i]);  //printing of strings
		 }
		ref.close();
	}
}
