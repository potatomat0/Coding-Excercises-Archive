// Kiểm tra xem tất cả các phần tử trong một mảng đã cho có bằng nhau hay không
// Ví dụ:
// [1, 2, 3, 4, 5, 6] => false
// [12, 12, 12] => true

arr = [1,1,1,1,1]
arr1 = [1,1,1,1,2]
const bangnhau = arr => arr.every( v => v === arr[0] )

console.log(bangnhau(arr)); //true
console.log(bangnhau(arr1)); //false
