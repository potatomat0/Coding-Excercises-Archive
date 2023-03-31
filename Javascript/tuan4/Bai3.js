//đề bài: sắp xếp mảng số nguyên/thực theo thứ tự cả tăng và giảm dần:

var mang = [3,7,10,69,420,7749,650,1980,2213,6,10]
var mang1 = [1,2,3,4,5,6,7,8,9,10,11,12,13]


//hàm tăng dần
const tangdan = array => array.sort(function(a, b){return a-b});
//hàm giảm dần
const giamdan = array => array.sort(function(a, b){return b-a});

//chạy hàm
console.log(`Mảng trước khi được sắp xếp tăng dần: ${mang}
            mảng sau khi được sắp xếp tăng dần: ${tangdan(mang)}`)

console.log(`Mảng trước khi được sắp xếp giảm dần: ${mang}
            mảng sau khi được sắp xếp giảm dần: ${giamdan(mang)}`)