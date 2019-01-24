package taskk;

/*
 * Write a program for following functionalities
1.Create a class Student having properties id, name and percentage
2. Creating a Directory named Students in that directory create a file.
3. Add students data into the file. Add at least 4 students
4. Read the file and display student data.
5. Add one more student into the file.
6. Delete the student data of id 2.
 */
import java.io.File;
import java.io.FileInputStream;
 import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
 import java.io.Serializable;
import java.util.ArrayList; 
 class Student  implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	double percentage;
	Student (int id,String name, double percentage)
	{
		this.id=id;
		this.name=name;
		this.percentage=percentage;
		
	}
	public int getid()
	{
		return this.id;
	}
	public String getname()
	{
		return this.name;
	}
	public double getpercentage()
	{
		return this.percentage;
	}
	
	public String toString()
	{
		return "id is " + this.id + " name is " +this.name  + " percentage is " + this.percentage;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{   
		Student stu =new Student();
		String file="Students/Student.txt";
		Student stud[] =new Student[4];
		stud[0]=new Student(01,"sai",92.6);
		stud[1]=new Student(02,"kumar",93.2);
		stud[2]=new Student(03,"puli",88.76);
		stud[3]=new Student(04,"sri",79.8); 
		ArrayList <Student> al=new ArrayList<Student>();
		al.add(stud[0]);
		al.add(stud[1]);
		al.add(stud[2]);
		al.add(stud[3]);
 		stu.Dirctory();
 		//serialization of Student data
		Student.serializable(al,file);
		System.out.println(al.toString());
		System.out.println("suceesfully student data write into file:");
		//deserialization of student data to display
		ArrayList obj1=(ArrayList)Student.deserialize(file);
		System.out.println(obj1);
		//creating one more student data and write into the file
		Student stu2=new Student(05,"shaam",89);
		al.add(stu2);
		System.out.println("after inserting one more Student :" + al.toString());
		//delete the student data from the file
		System.out.println("deleting student by id 2" );
		{
			for(int i=0;i<al.size();i++)
			{
				if(stud[i].id==02)
				{
					al.remove(i);
				}
			}
		}
		//display the student data after remove by id
		System.out.println(al);

	}
	public static void serializable(ArrayList al,String file) throws IOException
	{
		try {
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();

		  	}
		catch(Exception e)
		{
			System.out.println(e);
		} 
	}
	public static ArrayList deserialize(String file) throws IOException,
	ClassNotFoundException 
	{
		FileInputStream fis = new FileInputStream(file );
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList obj1 = (ArrayList) ois.readObject();
		ois.close();
		fis.close();
		return obj1;
	}
	public void Dirctory()
	{
		File directory = new File("Students"); 
		if (!directory.exists()) 
		{
		    System.out.println("creating directory: " + directory.getName());
		    boolean result = false;

		    try{
		    	directory.mkdir();
		        result = true;
		    	} 
		    catch(Exception e)
		    {
		        System.out.println(e);
		    }        
		    if(result) 
		    {    
		        System.out.println("Directory is created created");  
		    }
		}
	}
	
 
}
