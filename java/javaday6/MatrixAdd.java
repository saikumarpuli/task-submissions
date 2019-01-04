//java program for addition of 2 matrix

package sai;
import java.util.Scanner;
public class MatrixAdd 
{
  	public static void main(String args[])
		{
  	//for memory utilization purpose i use byte data type

            byte r1,c1,r2,c2,i,j; 
           
             Scanner o=new Scanner(System.in);  //o is the reference object of scanner class
			 System.out.println("rows and coloumns for matrix1 and matrix2");
			 r1=o.nextByte();		//input of row for matrix1
			 c1=o.nextByte();		//input of column for matrix1
			 r2=o.nextByte();		//input of row for matrix2
			 c2=o.nextByte();		//input of column for matrix2
			 
			 if((r1==r2)&&(c1==c2)) //checking of possibility of matrix addition
			 {
				 byte a[][]=new byte[r1][c1]; //memory initialization of matrix1
				 byte b[][]=new byte[r2][c2]; //memory initialization of matrix2
				 byte c[][]=new byte[r1][c1]; //memory initialization of matrix3

				 System.out.println("enter elements into matrix1 "); 
				 for(i=0;i<r1;i++)
				 {
					 for(j=0;j<c1;j++)
					 {
						 a[i][j]=o.nextByte(); //reading elements for matrix1
					 }
 				 }
				 System.out.println("enter elements into matrix2 ");
				 for(i=0;i<r2;i++)
				 {
					 for(j=0;j<c2;j++)
					 {
						 b[i][j]=o.nextByte(); //reading elements for matrix2
					 }
 				 }
				 addM(a,b,c,r1,c1);    //method calling for addition of 2 matrix
			 }
			 else
			 {
				 System.out.println("addition is not possible because it both are not in same order");
				 System.exit(0);   //addition is not possible so program terminates
			 }
			 o.close();
		 }
	 public static void addM(byte a[][],byte b[][],byte c[][],byte r1,byte c1) //method to find sum of 2 matrix
		 {
		 	byte i,j;
		 	for(i=0;i<r1;i++)
		 	{
		 		for(j=0;j<c1;j++)
		 		{
		 			c[i][j]=(byte)(a[i][j]+b[i][j]); // logic c=a+b;
		 		}
		 	}
		 	printM(c,r1,c1);
		 
		 }
	 public static void printM(byte c[][],byte r1,byte c1) //method to printing addition of 2 matrix
	 {
		 byte i,j;
		 System.out.println("Sum of matrix1 and matrix2 is:");
		 for(i=0;i<r1;i++)
		 {
			 for(j=0;j<c1;j++)
			 {
				 System.out.print(c[i][j] + " ");   //printing the sum of 2 matrix
			 }
			 System.out.println("");
		 }
	 }
}

