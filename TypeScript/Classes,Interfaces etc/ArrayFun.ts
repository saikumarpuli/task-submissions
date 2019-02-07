 var num:number[]=new Array(1,2,3,4,5,6,7,8,9);
 num.forEach(function(i){ 
	 
 console.log(i);
 })
 
 function isBigEnough2(element, index, array) { 
   return (element >= 10); 
} 
var passed2 = [12, 55, 82, 130, 44].every(isBigEnough2); 
console.log("Test Value : " + passed2 );

function isBigEnough1(element, index, array) { 
   return (element >= 20); 
} 
var passed1 = [12, 5, 8, 130, 44].filter(isBigEnough1); 
console.log("Test Value : " + passed1 );

var index = [12, 5, 8, 130, 44].indexOf(8); 
console.log("index is : " + index );

var arr = new Array("First","Second","Third");          
var str = arr.join(); 
console.log("str : " + str );          
var str = arr.join(", "); 
console.log("str : " + str );        
var str = arr.join(" + "); 
console.log("str : " + str );