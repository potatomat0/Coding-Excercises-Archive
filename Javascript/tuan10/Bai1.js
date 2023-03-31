// Tìm tất cả phần tử trong mảng ngoại trừ phần tử đầu tiên với chiều dài mảng lớn hơn một.
// VD: 
// [1, 2, 3] => kq = [2, 3]
// [1] =>kq = [1]

var bt1 = [1,2,3,4,5,6,7]

timPhanTu = (arr) => {
    arr.shift()
    return arr;
}

console.log(timPhanTu(bt1));


	
// Kiểm tra xem tất cả các phần tử trong một mảng đã cho có bằng nhau hay không


// Ví dụ:

// [1, 2, 3, 4, 5, 6] => false
// [12, 12, 12] => true