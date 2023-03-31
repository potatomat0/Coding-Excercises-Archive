// 9.	Tìm kiếm điểm số lớn/nhỏ hơn 3 trong mảng các điểm số.
var ar = [1,2,3,4,5,6,7,8,9,10,11, 12, 13]

const LargerThan3 = ar.filter(a => a>3 )
const SmallerThan3 = ar.filter(a => a<3)

console.log(LargerThan3)
console.log(SmallerThan3)