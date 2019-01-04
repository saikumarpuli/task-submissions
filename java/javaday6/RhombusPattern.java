//java program to print diamond pattern

package sai;
import java.util.Scanner;
public class RhombusPattern 
{

	public static void main(String[] args)
	{
		int n;
		Scanner o=new Scanner(System.in);
		System.out.println("enter an integer to print Diamond pattern");
		n=o.nextByte();		//input of n value
		mTable(n);		//method calling to print Diamond pattern
		o.close();
	}
	//method to print diamond pattern
	public static void mTable(int n) 
	{
	int i,j,k;
	 for(i=1;i<=n;i++) //for upper triangle//0-n for number of lines printing 
		 {
 		 for(k=1;k<=n-i;k++)    //for printing spaces
		 System.out.print(" "); 
		 	 for(j=1;j<=i;j++)
		 	 {  
 		 		 System.out.print(" *"); //for printing *
		 	 }
	 		 System.out.println("");
		 }
	 for(i=n-1;i>0;i--)     //for lower triangle//n-1 to 1 for number of lines printing 
	 {
		 for(k=i-1;k<n;k++)    //for printing spaces
			 System.out.print(" "); 
	 	 for(j=i;j>0;j--)
	 	 {  
		 		 System.out.print("* ");  //for printing *
	 	 }
 		 System.out.println("");
	 }
						 
	}

}
