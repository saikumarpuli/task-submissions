/*
 * 3. Create a class Student having properties id, name, address and marks.
Create a class Address with properties doorNo, streetName and city.
Create an association between Student and Address.
Add 5 students to a collection.
Sort the students based on marks in Ascending Order - using comparator
Retrive the student based on id.
Delete the student with a given id. (Scan id of student)
Rename the student with a given id. (Scan the id of student)
 */
package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student 
{
	int id,marks;
	String name;
	Address address;
	Student(int id,int marks,String name,Address address)
	{
		this.id=id;
		this.marks=marks;
		this.name=name;
		this.address=address;
	}
	public String toString()
	{
		return id + " "+ marks +" "   + name +" " + address;
	}
	public static Comparator<Student> stu = new Comparator<Student>() {

        @Override
        public int compare(Student s1, Student s2) {
            return s1.marks-s2.marks;
        }
    };
}
class Address
{
	int doorNo;
	String streetName,city;
	Address(int doorNo,String streetName,String city)
	{
		this.doorNo=doorNo;
		this.streetName=streetName;
		this.city=city;
	}
	public String toString()
	{
		return doorNo + " "+ streetName +" "   + city;
	}
	 
}

public class Task3 
{
public static void main(String args[]) 
{
	int id; 
 	Address add[]=new Address[5];
	add[0]=new Address(20,"gandhi nagar","hydreabad");
	add[1]=new Address(21,"prashanth nagar","hydreabad");
	add[2]=new Address(22,"ashok nagar","hydreabad");
	add[3]=new Address(23,"nehru nagar","hydreabad");
	add[4]=new Address(24,"lalitha nagar","hydreabad");

	Student student[]=new Student[5]; 
	student[0]=new Student(01,100,"sai",add[0]);
	student[1]=new Student(02,500,"kumar",add[1]);
	student[2]=new Student(03,640,"puli",add[2]);
	student[3]=new Student(04,152,"sri",add[3]);
	student[4]=new Student(05,140,"shaam",add[4]);
	  

	Arrays.sort(student,Student.stu);
	
	 List <Student> al=new ArrayList();
	 al.add(student[0]);
	 al.add(student[1]);
	 al.add(student[2]);
	 al.add(student[3]);
	 al.add(student[4]);
	 System.out.println(al);
	 Scanner ref=new Scanner(System.in);
	 System.out.println("enter id ");
	 id=ref.nextInt();
	 //Retrive the student based on id. 
	 for(int i=0;i<student.length;i++)
	 {
		 if(id==student[i].id)
		 {
			 System.out.println(student[i]);
		 } 
	 }
	 //Delete the student with a given id. (Scan id of student)
	 System.out.println("enter id to delete:" );
	 id=ref.nextInt();
	 for(int i=0;i<student.length;i++)
	 {
		 if(id==student[i].id)
		 {
			 al.remove(student[i]);
		 } 
	 }
	 System.out.println("after deleting by id :" +al);

	 System.out.println("enter id for rename ");
	 id=ref.nextInt();
	 
	// Rename the student with a given id. (Scan the id of student) 
	 for(int i=0;i<student.length;i++)
	 {
		 if(id==student[i].id)
		 {
			 student[i].name="rename";
		 } 
	 }
	 System.out.println("after rename by id :" +al);
	 ref.close();
	  
}
}


