// 17.	Viết một hàm lấy một mảng loại bỏ tất cả các giá trị nằm trong khoảng [a, b]. 
// Mảng ban đầu có thể thay đổi.

var arr =[1,2,3,4,5,6,7,8,9,10,11, 12, 13]

const Bt16 = (arr,a=0,b=arr.length) => {
   return arr.filter((x)=>!(x>=a && x<=b))
}
// xem hướng dẫn tại: 
// https://stackoverflow.com/questions/20148276/inverse-of-filter-in-js

console.log(Bt16(arr))
console.log(Bt16(arr,2,9))
console.log('haha')
