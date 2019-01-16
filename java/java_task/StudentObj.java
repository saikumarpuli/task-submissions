package practice;
import java.util.*;
public class StudentObj {
	int n,rollno,marks;
	String name;
	

	public void getDetails(String name,int rollno,int marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
		
	} 
 public String toString()
 {
	 return name +" " + rollno + " "+ marks;
 }
 
	public static void main(String args[])
	{
 		Scanner ref=new Scanner(System.in);
		String name;
		int rollno,marks,n,i,index;
		System.out.println("enter number of Students");
		n=ref.nextInt();

		StudentObj obj[]=new StudentObj[n]; 
		for(i=0;i<n;i++)
		{		
		System.out.println("enter " + (i+1) +" Student name");
		name=ref.next();
		System.out.println("enter " + (i+1) +" Student rollno"); 
		rollno=ref.nextInt();
		System.out.println("enter " + (i+1) +" Student marks"); 
		marks=ref.nextInt();
			obj[i]=new StudentObj();
			obj[i].getDetails(name, rollno, marks);
		}
		System.out.println("enter index of Students");
		index=ref.nextInt();
		System.out.println(obj[index-1]);
		
	}

}
