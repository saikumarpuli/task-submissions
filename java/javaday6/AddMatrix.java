/*16> Addition of two matrices
	> Read matrix1	-> getMatrix()
	> Read matrix2	-> getMatrix()
	> Add them 		-> findSum()
	> Display sum 	-> displaySum()
	*/
package sai;
import java.util.*;
public class AddMatrix {
int matrix1[][],matrix2[][],matrixsum[][],row1,col1,row2,col2,i,j;//row1,col1 is row,column for matrix1
Scanner ref; //Scanner class reference variable
public void getMatrix1()
{
	ref=new  Scanner(System.in);
	System.out.println("enter the values for matrix one row and column");
	row1=ref.nextInt(); //reading matrix1 row
	col1=ref.nextInt();	//reading martix1 column
	 matrix1 =new int[row1][col1]; //memory initialization
	System.out.println("enter the values into matrix one ");
	for(i=0;i<row1;i++)
	{
		for(j=0;j<col1;j++)
		{
			matrix1[i][j]=ref.nextInt(); //reading elements into matrix1
		}
	}	
}
public void getMatrix2()
{
	System.out.println("enter the values for matrix two row and column");
	row2=ref.nextInt(); //reading matrix1 row
	col2=ref.nextInt();	//reading martix1 column
	 matrix2 =new int[row2][col2];//memory initialization
	System.out.println("enter the values into matrix two ");
	for(i=0;i<row2;i++)
	{
		for(j=0;j<col2;j++)
		{
			matrix2[i][j]=ref.nextInt();//reading elements into matrix1
		}
	}	
}
public void findSum()
{
    matrixsum =new int[row1][col1];
	for(i=0;i<row1;i++)
	{
		for(j=0;j<col1;j++)
		{
			matrixsum[i][j]=matrix1[i][j]+matrix2[i][j];//sum of two matrices c=a+b;
		}
	}
	 
	 
}
public void displaySum()
{
	for(i=0;i<row1;i++)
	{
		for(j=0;j<col1;j++)
		{
			System.out.println(matrixsum[i][j] + " "); //displaying sum of matrices
		}
		System.out.println("\n");
		
	}
}
public static void main(String args[])
{
	AddMatrix obj=new AddMatrix(); //object creation for AddMatrix class
	obj.getMatrix1();  //function calling for matrix1
	obj.getMatrix2();  //function calling for matrix2
	obj.findSum(); //function calling for find sum
	obj.displaySum(); //function calling for display sum
}
}
