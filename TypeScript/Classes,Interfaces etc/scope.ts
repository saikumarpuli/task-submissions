let num : number =56 ;	   //globalscope
class Int {
	str:String ="saikumar";		//class scope
	 function nyfun(): void{
		let num :number =52;		//block/local scope
		console.log("value in the function:" + num);
	}
}
var obj=new Int();
	console.log(obj.str);
obj.nyfun();
console.log("value from global " + num);