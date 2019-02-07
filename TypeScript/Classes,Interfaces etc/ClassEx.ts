class Study{
subject : string;
 display():void{
console.log("this is the  subject  of   " + this.subject);
}
}
class Exam extends Study{
display():void{
super.display();
console.log("this is Exam class : " + this.subject);
}
}

var obj=new Exam();
obj.subject="mathematics";
obj.display();
