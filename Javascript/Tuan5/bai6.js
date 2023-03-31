// arr = ['a', 'b', 'c', 'a', 'b', 'c']

// Xuất ra mảng kq = ['b', 'b']

let arr = ['a', 'b', 'c', 'a', 'b', 'c'];

const timb = value =>  value === 'b'
  
const filtered = arr.filter(timb);

console.log(filtered);