/*
 * 4.Create an abstract class, called Instrument which has a property of name and an abstract
method play.
Now define a sub-class called StringedInstrument(abstract class) of parent class Instrument
class and adds an extra field called numberOfStrings.
Add two more classes that implement the functionality of a StringedIntrument, called
ElectricGuitar and ElectricBassGuitar accordingly.
Finally, create a new class called Execution that contains a single main method:
 */
package practice;

abstract class Instrument
{
	String name;
	abstract void play();
}
abstract class SringedInstrument extends Instrument
{
	int numberOfStrings;
}
class ElectricGuitar extends SringedInstrument
{
	void play()
	{
		this.name="Electric Guitar";
		this.numberOfStrings=2;

		System.out.println("play ElectricGuitar\n name is: " + this.name +"\n numberof strings are:" +this.numberOfStrings);
		
	}
}
class ElectricBassGuitar extends SringedInstrument
{ 
	void play()
	{
		this.name="ElectricBaseGuitar";
		this.numberOfStrings=3;
		System.out.println("play ElectricBassGuitar\nname is :"+ this.name +"\nnumberof strings are:" +this.numberOfStrings);
	}
}
public class Abstract {
	public static void main(String args[])
	{
		ElectricBassGuitar ebg=new ElectricBassGuitar();
		ElectricGuitar eg=new ElectricGuitar();
		ebg.play();
		eg.play();
		 
		
	}

}
