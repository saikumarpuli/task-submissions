//programs on string functions 
package sai;
public class StringFunctions {
	public static void main(String args[])
	{	
/*String str1,str2;
int i;
System.out.println("enter two strings:");
Scanner ref=new Scanner(System.in);
str1=ref.next();
str2=ref.next();
System.out.println("enter index:");
i=ref.nextInt();
char character;*/
String str1=new String("saikumar");
String str2=new String("semantic_bits");
//charAt function
char character=str1.charAt(5);
System.out.println("character in " + str1 + "at index of 5 is "+character);

//compareTo
int result=str1.compareTo(str2);
System.out.println("comparing of two Strings:"+ result);
 
//compareToIgnoreCase(String str)
result=str1.compareToIgnoreCase(str2);
System.out.println("comparing of two Strings: "+ result);

//String concat(String str)
String str3=str1.concat(str2);
System.out.println("concatnation of two strings:" + str3);

//boolean contentEquals(StringBuffer sb)
StringBuffer str4 = new StringBuffer( "office");
boolean resul=str1.contentEquals(str4);
System.out.println("check content equalbuffer:" +resul);

//length
result=str1.length();
System.out.println("length of" + str1 +"is " +result);
	
//String replace(char oldChar, char newChar)
System.out.println("String replace in " +str1 + " k with K :" +str1.replace('k','K'));

//String substring(int beginIndex)
System.out.println("substring of " + str2 +" with begining index is " +str2.substring(8));

//String substring(int beginIndex, int endIndex)
System.out.println("substring of " + str2 +" with begining and ending index is " +str2.substring(8,12));

//char[] toCharArray()
String Str=new String("saikumar");
System.out.println("converting string to charecter array :" );
System.out.print(Str.toCharArray());
//String toLowerCase()
System.out.println("convert to lower case :" +(str2.toLowerCase()));

//String toUpperrCase()
System.out.println("convert to upper case :" +str2.toUpperCase());

//String trim()   It returns a copy of this string with leading and trailing white space removed, or this string if it has no leading or trailing white space.
System.out.println("trim the white spaces from strings: "+str2.trim());

	}
}
