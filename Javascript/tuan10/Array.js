//kiểm tra xem biến có phải là mảng không
var haha = [1,2,3]
console.log(typeof(haha)); //object
console.log(Array.isArray(haha));  //true
console.log(haha instanceof Array); //true
console.log(haha.constructor === Array); //true
//
myArray = []
myArray[0] = Date.now();
console.log(myArray[0])
