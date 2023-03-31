//spread
//đối với hàm: chuyển tất cả phần tử của iterableObjects thành đối số
myFunction0(...iterableObjects);
//đối với mảng: kết hợp các mảng bằng cách chèn tất cả các phần tử từ iterableObjects
myFunction1(...iterableObjects, '4', 'haha', 'sixty nine', 8209); //thêm chữ và số gì cũng được
//đối với đối tượng
let objectexample = {...obj} //truyền tất cả các cặp key:values từ một đối tượng

//ví dụ: chạy hết mảng bằng dấu ba chấm ...
function ChayMang(...elements) {
    console.log(...elements)
}

let arr = [0,1,2,3,4,5,6,7,8,9,10]
ChayMang(...arr)

//ví dụ sử dụng method cùng spread operator
let arr1 = ['one', 'two', 'three']
let arr2 = ['four', 'five', 'six']
let arr3 = [...arr1, ...arr2] 
arr3.push(4)

arr1.push(...arr2) // thêm phần từ vào cuối mảng ['one', 'two', 'three', 'four', 'five', 'six]
arr1.unshift(...arr2) //thêm phần từ vào đầu mảng ['four', 'five', 'six', 'one', 'two', 'three']


//ví dụ destructuring
const players 
= [ 'Kevin', 'Bobby', 'Nicole', 'Naomi', 'Jim', 'Sherry' ];
const [ first, second, third, ...unplaced ] 
= players;
console.log(first); // Kevin
console.log(second); // Bobby
console.log(third); // Nicole
console.log(unplaced); // ["Naomi", "Jim", "Sherry"]

const { x, y, ...z }  = { x: 1, y: 2, a: 3, b: 4 };
console.log(x); // 1
console.log(y); //2
console.log(z); // { a: 3, b: 4 }


//ví dụ spread operator với object 
const obj1 = { 
    name: 'Nguyen Van An' 
}; 
const obj2 = { 
    ...obj1, 
    age: 18 
}; 
console.log(obj2); /* ouput: {name: " Nguyen Van An ", age: 18} */
    

//================================spread để đâu cũng được vì đã biết được giới hạn, rest ngược lại thì chưa xác định được giới hạn

//hàm slice 

// slice()
// slice(start)
// slice(start, end)

const animals = ['ant', 'bison', 'camel', 'duck', 'elephant'];

console.log(animals.slice(2));
// expected output: Array ["camel", "duck", "elephant"]

console.log(animals.slice(2, 4));
// expected output: Array ["camel", "duck"]

console.log(animals.slice(1, 5));
// expected output: Array ["bison", "camel", "duck", "elephant"]

console.log(animals.slice(-2));
// expected output: Array ["duck", "elephant"]

console.log(animals.slice(2, -1));
// expected output: Array ["camel", "duck"]

console.log(animals.slice());
// expected output: Array ["ant", "bison", "camel", "duck", "elephant"]

