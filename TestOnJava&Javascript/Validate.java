/*using org.json library
 * http://json.org/
Download the ZIP file from this URL(http://www.java2s.com/Code/JarDownload/java/java-json.jar.zip)
and extract it to get the Jar. Add the Jar to your build path.
To check the available classes in this Jar use this URL.
To Add this Jar to your build path Right click the Project > Build Path > Configure build path
>Select Libraries tab > Click Add External Libraries > Select the Jar file Download 
*/
package friday;
import java.util.Scanner;

import org.json.*;

public class Validate {

	public boolean isJSONValid(String test) {
	    try {
	        new JSONObject(test);
	    } catch (JSONException ex) {
	   System.err.println(ex);
	        try {
	            new JSONArray(test);
	        } catch (JSONException ex1) {
	            return false;
	        }
	    }
	    return true;
	}
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter string to validate with json pattern:");
	String input=scan.nextLine();
	Validate obj=new Validate();
	boolean result=obj.isJSONValid(input);
	if(result==true)
	{
		System.out.println("1");
	}
	else {
		System.out.println("-1");
	}
	scan.close();
}
}










