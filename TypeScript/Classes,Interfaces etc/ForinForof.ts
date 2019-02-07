let arr:number[]= [4, 5, 6];
console.log("Array using forin loop made chance to make mistake");
for (let i in arr) {
   console.log(i); // "0", "1", "2",
}

console.log("Array using forin  loop");
for (let i in arr) {
   console.log(arr[i]); // "4", "5", "6"
}

console.log("Array using forof loop");
for (let i of arr) {
   console.log(i); // "4", "5", "6"
}

console.log("Array using forEach loop");
 arr.forEach(function (value){console.log(value);})