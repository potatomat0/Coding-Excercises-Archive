// 3.	Viết chương trình JavaScript để loại bỏ các phần tử được chỉ định ở bên phải của một mảng phần tử đã cho 
// Vd:
// ([1, 2, 3], -2) => kq = [2, 3]

var arr = [1,2,3]

bai3 = (arr, i) => {
    return arr.slice(i)
}

console.log(bai3(arr, -2))