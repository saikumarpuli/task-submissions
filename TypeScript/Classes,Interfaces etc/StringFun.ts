var string:String="saikumar puli";

var lengthofString:number=string.length;
console.log("length of the string is :" +lengthofString);  //length of the string

console.log("string.charAt(0) is:" + string.charAt(0));  // char at given position

console.log("string.charAt(0) is:" + string.charCodeAt(0)); //unicode of the charecter 

var Str:String=string.concat(" SemanticBits"); //concatntin of two strings
console.log("concatnation  of the string is :" +Str);

var index = string.indexOf( "kumar" );   //find the index of given string
console.log("indexOf found String :" + index );     

index = string.lastIndexOf( "ma" );   //find the string of lastIndex
console.log("lastIndexOf found String :" + index );

var sliced:String = string.slice(3, -2);   //slice the string
console.log("  string.slice(3, -2) is  :" + sliced);
 
 var spilt:Array<String>=string.split(" ", 2); //spilt the string by delemiter
 console.log("string.split( ,1) is :"  + spilt);
 
 var re=/saikumar/gi;
 var string3=string.replace(re,"srikumar");    //replace by the pattern of string by another string 
 console.log(string3);
 
 var sub_str=string.substr(2,8) ;   //substr( index , number of charecters)
 console.log("string.substr(2,8)is :" + sub_str);
 
 
 var sub_string=string.substring(2,8) ;   //substr( firstindex , lastindex)
 console.log("string.substring (2,8)is :" + sub_string );
 
 var student:String ="SAIKUMAR";
 var student1:String =student.toLowerCase();    //string convertion to lowercase
 console.log("student.toLowerCase() is : "  + student1);
 
 console.log("student1.toUpperCase() is : " + student1.toUpperCase());   //string conversion to upper case
 
var city:String =new String("hyderabad");
console.log("city.valueOf() is: "   + city.valueOf());   //valueOf