 var year :number;
 function leapOrNot (year) : void{
	 if(((year%4==0)&&(year%100==0))||(year%400==0)) {
		 console.log("given number " + year +" is leap year");
	 }
	 else{
		 		 console.log("given number " + year +" is  not a leap year");
	 }
}
leapOrNot(1600);