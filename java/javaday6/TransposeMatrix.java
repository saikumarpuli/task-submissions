// java program for transpose matrix 
//transpose matrix means exchanging of rowns and columns
package sai;
import java.util.Scanner;
public class TransposeMatrix {
	public static void main(String args[])
	{
	byte row,col,i,j;
	System.out.println("ener row and col values:");
	Scanner ref=new Scanner(System.in);  //reff is the reference object of Scanner class
	row=ref.nextByte();					//reading row value
	col=ref.nextByte();					//reading column value
	byte matrix[][]=new byte[row][col];
	System.out.println("Enter elements into the matrix");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			matrix[i][j]=ref.nextByte(); //reading matrix elements.
		}
	}
	PrintMatrix(row,col,matrix); //function calling for print matrix
	PrintTransposeMatrix(row,col,matrix);//functio calling for print transpose matrix
	ref.close();
	}

	public static void PrintMatrix(byte row,byte col,byte matrix[][]) //function for printing entered matrix
	{
		int i,j;
		System.out.println("enterd matrix:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(matrix[i][j] + " "); //to print entered matrix
			}
			System.out.println("");
		}
	}

	public static void PrintTransposeMatrix(byte row,byte col,byte matrix[][]) //function for printing transpose matrix
	{
		int i,j;
		System.out.println("transpose matrix:");
		for(i=0;i<col;i++)
		{
			for(j=0;j<row;j++)     
			{
				System.out.print(matrix[j][i] + " "); //to print transpose matrix
			}
			System.out.println("");
		}
	}
	
}


	
