// 10.	Lấy phần tử đầu tiên trong mảng các số có giá trị lớn/nhỏ hơn 10
var ar = [1,2,3,4,5,6,7,8,9,10,11, 12, 13]

const findLarger = arr => arr.find(score => {return score < 10}) 
const findSmaller = arr => arr.find(score => {return score > 10}) 

console.log(ar)
console.log(findLarger(ar))
console.log(findSmaller(ar))