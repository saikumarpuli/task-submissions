package lasttest;

/*
 * 
2. Create a Student class having the properties of id and name. And Create a Address class having the properties of door no, street, city and state.
Now create a College class adding to the map with Student Object as key and Address Object as value.
Add this data into the file.
Read the data from file and display the data.

 */

 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

import practice.Serilize;

 
class Student implements Serializable{
	private int id;
	private String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String toString()
	{
		return "id "+ id + " name : "+ name;
		
	}
}
class Address implements Serializable{
	private int door_no;
	private String street,city,state;
	Address(int door_no,String street,String city,String state){
		this.door_no=door_no;
		this.street=street;
		this.city=city;
		this.state=state;
	}
	public int getDoorNo() {
		return this.door_no;
	}
	public String getStreet() {
		return this.street;
	}
	public String getCity() {
		return this.city;
	}
	public String getState() {
		return this.state;
	}
	public String toString()
	{
		return "DoorNo "+ door_no + " Street : "+ street + " city " +city + " State "+ state;
		
	}
}
public class College {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Student studentObject=new Student(01,"saikumar");
		Address addressObject=new Address(12,"jntu campus","kukatpelly","hyderabad");
        HashMap<Student, Address> map = new HashMap<>(); 
        map.put(studentObject, addressObject);
        String file="Student.txt";
		College.serializable(map,file);
        System.out.println(map.get(studentObject));
		System.out.println("serialize is sucess");
		HashMap mapobj1=(HashMap)College.deserialize(file);
		System.out.println(mapobj1.values());
		
	}
	public static void serializable(HashMap map,String file) throws IOException
	{
		try {
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(map);
			fos.close();
			oos.close();

		  	}
		catch(Exception e)
		{
			System.out.println(e);
		} 
	}
	
	public static HashMap deserialize(String file) throws IOException,
	ClassNotFoundException 
	{
		try {
			FileInputStream fis = new FileInputStream(file );
			ObjectInputStream ois = new ObjectInputStream(fis);
			HashMap mapobj1 = (HashMap)ois.readObject();
 			ois.close();
			fis.close();
			return mapobj1;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	
	}

}

/*
 * Output:-
 * DoorNo 12 Street : jntu campus city kukatpelly State hyderabad
serialize is sucess
[DoorNo 12 Street : jntu campus city kukatpelly State hyderabad]

 */
 
