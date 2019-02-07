

function sumOfNum(...nums:number[]){
let sum:number =0;
var index : number =0;
for(index =0;index<nums.length;index++){
sum+=nums[index];
}
console.log(sum);
}
sumOfNum(1,5,6,2,8,9,5,6,3,2,3,4,7);
sumOfNum(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
