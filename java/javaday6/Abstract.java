/*
 * 18.Parent and son abstract implementation
 */
package sai;
abstract class Parent
{
	void propertyDetails()
	{
		int home=500;
		int land=600;
		int sum=home+land;
		System.out.println(sum);
		 
	}
	abstract void calculate();
}
 
class Son extends Parent
{
	@Override
	void calculate()
	{ 
		System.out.println("son's property value is ");
		  propertyDetails(); 
	}
}
public class Abstract {
public static void main(String args[])
{
	Son obj=new Son(); 
	obj.calculate();
}
}
