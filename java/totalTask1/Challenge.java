/*
 * 
3. Polymorphism:- 
Create an abstract class called Book. Include a String field for the book's title and a double field for the book's price.
 Within the class, include a constructor that requires the book title and two get methods: one that returns the title and one that 
 returns the price. Also include an abstract method named setPrice(). Create two child classes of Book: Fiction and NonFiction. 
 Within the constructors for the Fiction and NonFiction classes, call setPrice so all Fiction Books cost $24.99 and all Non Fiction Books cost $37.99. 
 A main class Challenge creates an arraylist of Book variables to store references to objects of each concrete class. For each book, display the string 
 representation as shown below.

input:-
Title of fiction book:
Harry Potter
Title of non fiction book:
Calculus

output:-
Title-Harry Potter Cost-$24.99
Title-Calculus Cost-$37.99
 */
package task;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Book
{
	String title;
	double price;
	Book(String title)
	{
		this.title=title; 
	}
	Book()
	{
		
	}
	public String gettitle()
	{
		return title;
	}
	public double getprice()
	{
		return price;
	}
	abstract void setprice();
	
	public String toString()
	{
		 return "Title-" +title   +" Cost-$" + price;
	}
}
class Fiction extends Book
{
	Fiction()
	{
		 setprice();
	}
	void setprice()
	{
		this.price=24.99;
	} 
}
class NonFiction extends Book
{
	NonFiction()
	{
		 setprice();
	}
	void setprice()
	{
		this.price=37.99;
	} 
}

public class Challenge {
	public static void main(String[] args) {
		String ftitle,nftitle;
		ArrayList<Fiction> alf=new ArrayList();
		ArrayList<NonFiction> alnf=new ArrayList();
		Scanner ref=new Scanner(System.in);
		Fiction fiobj1=new Fiction();
		NonFiction nfiobj1=new NonFiction();
		System.out.println("enter title of fiction book ");
		ftitle=ref.next();
		System.out.println("enter title of non fiction book "); 
		nftitle=ref.next();  
		fiobj1.title=ftitle;
		nfiobj1.title=nftitle;
		
  		alf.add(fiobj1);
 		alnf.add(nfiobj1);
		System.out.println(alf);
		System.out.println(alnf);

	}

}
