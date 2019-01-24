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
import java.io.FileOutputStream; 
class Student 
{
	int id;
	String name;
	double percentage;
	public static void main(String args[])
	{   
		Student stu =new Student();
		stu.Dirctory();
         try
         {    
          FileOutputStream fout=new FileOutputStream("Students/Student");  
          String name="name Saikumar rollNo 22 marks 100";
          String s=name;    
          byte b[]=s.getBytes();//converting string into byte array    
          fout.write(b);    
          fout.close();    
          }
         catch(Exception e)
         {
        	 System.out.println(e);
         }  
         System.out.println("Complete");
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
