/*13> Print following
       Input the number: 7 
       Expected Output :                                   
             1                                                  
            212                                                 
           32123                                                
          4321234                                               
         543212345                                              
        65432123456                                             
       7654321234567                                            
        65432123456                                             
         543212345                                              
          4321234                                               
           32123                                                
            212                                                 
             1   */

package sai;
import java.util.*;
public class DiamondWithNumbers 
{
	public static void main(String args[])
	{
		int i,j,k,l,num; //i,j,k,l are for iterations;num is for diamond
		System.out.println("enter a number:");
		Scanner ref=new Scanner(System.in);
		num=ref.nextInt();   //reading number for number of lines for diamond 
		for(i=-1;i<num-1;i++)  //for upper triangle
		{
			for(l=num-i+1;l>0;l--) //loop for spaces
			{
				System.out.print(" ");
			}
			for(j=i+2;j>0;j--) //loop for printiing numbers
			{
				System.out.print(j);
				if(j==1) 
				{
					
					for(k=2;k<i+3;k++)//loop for printing numbers after the j reaches to 0;
					{
						System.out.print(k);
					}
				}
			}
			System.out.println("\n"); //to print new line
		}
		
		for(i=num-3;i>-2;i--) //for lower triangle
		{
			for(l=num-i+1;l>0;l--) //loop for spaces
			{
				System.out.print(" ");
			}
			for(j=i+2;j>0;j--)
			{
				System.out.print(j);
				if(j==1)
				{
					
					for(k=2;k<i+3;k++)//loop for printing numbers after the j reaches to 0;
					{
						System.out.print(k);
					}
				}
			}
			System.out.println("\n");
		}
		ref.close();
	}
}
