var arr = [4, 5, 6];
console.log("Array using forin loop made chance to make mistake");
for (var i in arr) {
    console.log(i); // "0", "1", "2",
}
console.log("Array using forin  loop");
for (var i in arr) {
    console.log(arr[i]); // "4", "5", "6"
}
console.log("Array using forof loop");
for (var _i = 0, arr_1 = arr; _i < arr_1.length; _i++) {
    var i = arr_1[_i];
    console.log(i); // "4", "5", "6"
}
console.log("Array using forEach loop");
arr.forEach(function (value) { console.log(value); });
