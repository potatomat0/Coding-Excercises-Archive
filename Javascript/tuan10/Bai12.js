// 12.	SV thực hiện yêu cầu sau:
// a)	Tạo mảng fruits gồm "apple", "orange"
// b)	Thêm 'Mango' vào cuối mảng
// c)	Thay thế giá trị ở giữa bằng 'cherry'. Nếu mảng có độ dài lẻ, code để tìm giá trị giữa.
// d)	Xóa phần tử đầu tiên của mảng
// e)	Thêm 'banana', 'pineapple' vào đầu mảng

//a
var fruits = ['apple', 'orange']

console.log(fruits)
console.log(fruits.length)
//b
fruits.push('mango')

console.log(fruits)
//c
fruits.length %2 ==0? 
        fruits[(fruits.length/2)-1]='cherry'
        : fruits[(fruits.length/2)-0.5]='cherry'

console.log(fruits)
//d
fruits.shift()

console.log(fruits)
//e
fruits.unshift('banana', 'pinapple')

console.log(fruits)