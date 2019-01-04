/*12> Write a program to print Pascal's triangle
        Input number of rows: 5                                                          
              1                                                                          
             1 1                                                                         
            1 2 1                                                                        
           1 3 3 1                                                                       
          1 4 6 4 1 */

package sai;
import java.util.*;
public class PascalTriangle {
	 public static void main(String args[])
	{
		int i,j,k,l,rows; //i,j,k are iterators
		Scanner ref= new Scanner(System.in);
		System.out.println("enter number for row:");
		rows=ref.nextInt(); //readin number for number of rows
		for(i=1;i<=rows;i++)
		{
			l=1; //for starting of the row 
			for(k=rows-i;k>0;k--)//loop for spaces
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(l+" ");//every row starts with 1;
				l=l*(i-j)/j; //to get l value 
			}
			System.out.print ("\n"); //for new line
		}
		ref.close();
	} 
}