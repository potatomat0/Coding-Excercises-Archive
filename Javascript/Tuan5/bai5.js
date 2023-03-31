// Bài 5: đề  let arr = ['a', 'b', 'c', 'a', 'b', 'c'];
// Xuất ra mảng gồm ['a','c','a','c'];

let arr = ['a', 'b', 'c', 'a', 'b', 'c'];

const timb = value =>  value !== 'b'
  
const filtered = arr.filter(timb);

console.log(filtered)