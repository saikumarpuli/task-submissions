var num = 56; //globalscope
var Int = /** @class */ (function () {
    function Int() {
        this.str = "saikumar";
    }
    return Int;
}()); //class scope
function nyfun() {
    var num = 52; //block/local scope
    console.log("value in the function:" + num);
}
var obj = new Int();
console.log(obj.str);
obj.nyfun();
console.log("value from global " + num);
