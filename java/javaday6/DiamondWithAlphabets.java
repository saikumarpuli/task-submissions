/*
14> Print following
      Input the number: 7 
      Expected Output :               
            A                                                  
           ABA                                                 
          ABCBA                                                
         ABCDCBA                                               
        ABCDEDCBA                                              
       ABCDEFEDCBA                                             
      ABCDEFGFEDCBA                                            
       ABCDEFEDCBA                                             
        ABCDEDCBA                                              
         ABCDCBA                                               
          ABCBA                                                
           ABA                                                 
            A    
 */
package sai;
import java.util.*;
public class DiamondWithAlphabets {
	public static void main(String args[])
	{
		int i,j,k,l,num;
		Scanner ref=new Scanner(System.in);
		System.out.println("enter row vale:");
		num=ref.nextInt(); //reading num for number of lines
		num=num+65;    
		for(i=65;i<num;i++) //for upper triangle   //A ascii value 65 so loop starts from 65
		{
			for(l=num-i;l>0;l--) //for spaces //n-i gives number of lines
			{
				
				System.out.print(" ");
			}
			for(j=65;j<i+1;j++) //to print alphabets
			{
				System.out.print((char)j);
				if(j==i) //check the loop termination occur or not
				{
					for(k=j-1;k>64;k--)
					{
						System.out.print((char)k);//type cast for integer to character
					}
				}
			}
			System.out.print("\n");
		}
		for(i=num-1;i>64;i--)  // for lower  triangle    
		{
			for(l=num-i+1;l>0;l--) //for spaces
			{
				
				System.out.print(" ");
			}
			for(j=65;j<i;j++)
			{
				System.out.print((char)j); 
				if(j==i-1) //check the loop termination occur or not
				{
					for(k=j-1;k>64;k--)
					{
						System.out.print((char)k);
					}
				}
			}
			System.out.print("\n"); //for newline
		}
		ref.close();
	}

}
