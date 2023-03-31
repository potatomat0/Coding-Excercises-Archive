//Bài 8: Cho 2 mảng: [1, 2, 3], [1, 2, 4] => 
// lấy ra mảng các phần tử mà xuất hiện ở cả hai mảng kq = [1,2]
array1 = [1, 2, 3]
array2 = [1, 2, 4]
//phương thức includes để kiểm tra có tồn tại phần tử trong mảng
var kiemtra = value => array2.includes(value);
const ketqua = array1.filter(kiemtra);
console.log(ketqua);