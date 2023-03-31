// 18.	Cho một mảng chuỗi. Tạo một bản sao được sắp xếp tăng dần/giảm dần.
//  Mảng ban đầu không đổi.

const arr = [3,5,9,7,4,9,2,8,5,1]

const sortUp = arr => {
    var newArr = [...arr] //dùng spread overpator để mảng gốc không bị thay đổi
    return newArr.sort((a,b) => a-b)
} 
const sortDown = arr => {
    var newArr = [...arr] //dùng spread overpator để mảng gốc không bị thay đổi
    return newArr.sort((a,b) => b-a)
} 

var newArr = (sortUp(arr))
var newArr1 = (sortDown(arr))
console.log(`mảng gốc: ${arr}`)  
console.log(`mảng mới tăng dần: ${newArr}`)  
console.log(`mảng mới giảm dần dần: ${newArr1}`)  