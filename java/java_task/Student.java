/*
 * 3. Create a student class with name, roll number, marks as properties and create a students
array  with the students.
Override toString method to display student details. And read input from user to display
student detials of at given position. Ex: If user enters 1 display the details at position one in the
array.
 */
package practice;
import java.util.*;
public class Student {
	String name;
	int rollno,marks;
	Student(String name,int rollno,int marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.marks=marks; 
		
	}

	public static void main(String args[])
	{
		  int i,n,r,m,index;
		
		String s;
		Scanner ref=new Scanner (System.in);
		System.out.println("enter number of students value:");
		n=ref.nextInt(); 
		String name []=new String[n];
		int rollno[]=new int[n];
		int marks[]=new int[n];
		
		for(i=0;i<n;i++)
		{
			System.out.println("enter "+ (i+1) +" student  name :");
			s=ref.next();	
			System.out.println("enter "+ (i+1) +" student roll no ");
 			r=ref.nextInt();
 			System.out.println("enter "+ (i+1) +" student marks:");
 			m=ref.nextInt();
 			new Student(s,r,m);
 			name[i]=s;
 			rollno[i]=r;
 			marks[i]=m;
		}
		System.out.println("enter to display record is less than "+ n);
		index=ref.nextInt();
		if(index<=n)
		{
			System.out.println(name[index-1] + " " + rollno[index-1] + " " + marks[index-1]);

		}
		else
		{
			System.out.println("number of records should be less than "+ n);

		}
		ref.close();
		
	}
}
 
 
 