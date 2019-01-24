/*
 * 1. Ceasar Cipher
The Ceasar cipher is a basic encryption technique used by Julius Ceasar to securely communicate with his generals. Each letter is replaced by another letter N positions down the english alphabet. For example, for a rotation of 5, the letter 'c' would be replaced by an 'h'. In case of a 'z', the alphabet rotates and it is transformed into a 'd'.
Implement a decoder for the Ceasar cipher where N = 5.
TIP: Use code.toCharArray() to get an array of characters.

Input(code)  Actual	Expected
xvm	     car	              car
evqv	    java	              java
diozmqdzr   interview	interview

 */

package task;

import java.util.Scanner;

public class Encript {

	public static void main(String[] args) {
		String string =new String();
		Scanner ref=new Scanner(System.in);
		System.out.println("enter a string to encrypt:");
		string=ref.nextLine();
		int key_to_encrypt=5,iterator;
		char arr[]=string.toCharArray();
		char duparr[]=new char[string.length()];
		
		for(iterator=0;iterator<string.length();iterator++)
		{ 
			if((arr[iterator]>='V'&&arr[iterator]<='Z')||(arr[iterator]>='u'&&arr[iterator]<='z'))
			{
				duparr[iterator]=(char)(arr[iterator]+(key_to_encrypt-26)); 
			}
			else
			{
				duparr[iterator]=(char)(arr[iterator]+(key_to_encrypt));

			}
		}
		System.out.println("encrypted String is:");
		for(iterator=0;iterator<string.length();iterator++)
		{
			System.out.print(duparr[iterator]);
		}
		ref.close();
		
	}

}
