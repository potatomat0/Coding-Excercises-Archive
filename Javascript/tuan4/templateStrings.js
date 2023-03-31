//template string
//---được dùng để xuất thông tin ra tiện hơn
let message = `xin chao`;
console.log(message);
//--sử dụng như một ký tự đặc biệt:
let message1 = ` \` xin\` chao`;

//mutiple string
//---để xuất ra ký tự và xuống dòng mà không cần ký tự đặc biệt
let message2 = `hang thu nhat
                va day la hang thu hai`
console.log(message2);

//ví dụ xuống dòng bằng template literals trong es6
console.log(`dong thu nhat
            dong thu hai`)
//... hoặc sử dụng hàm join("tên ký tự đặc biệt")
var message3 = [ "dong thu nhat ", 
"dong thu hai" ].join('\n');

//Template String không chỉ nhúng tên biến, mà có thể nhúng các phép tính, lệnh gọi hàm và nhiều ký tự đặc biệt khác
let soSanPham = 10, 
gia = 0.25, 
message4 = `${soSanPham} vien keo co gia ${(soSanPham * gia).toFixed(2)} VNĐ.`; //dùng toFixed() để định dạng chữ số thập phân
console.log(message4); // "10 items cost $2.50.

//biểu thức nội quy trong template strings
var b = 10;
consolelog(`5 + ${b} = ${5+b}`);

//Function trong template strings
// //Để tạo Tag: Đầu tiên, chúng ta cần tạo một hàm. Hàm 
// nhận hai đối số.
// 1.Đối số đầu tiên của hàm là mảng chuỗi mẫu 
// được phân tách bằng cách sử dụng biểu thức làm dấu 
// phân tách.
// 2.Các đối số tiếp theo: các biểu thức.
`xin chao, ${ho} ${ten}. Hoc ${monHoc} tai day`
//ở ví dụ trên, tham số đầu tiên là mảng chuỗi mẫu như 'xin chao' hoặc 'tai day'.
//còn các biểuu thức là ${ho} ${ten} va ${monHoc}

//--tạo một function bằng cách áp dụng template strings
let ho = "hoang"
let ten = "nhat"
let monHoc = "JS"

function thongbao(ho,ten,monHoc,) {
    let ketqua = strings[0] + ho + strings[1] + ten + strings[2] + monHoc + strings[3];
    return ketqua;
}

//in ra kết quả
console.log(thongbao`Xin chao, ${ho} ${ten}. Hoc ${monHoc} tai day`);

//tên của function có thể được đặt tùy ý
let person = 'Hai';
let age = 19;
function xetTuoi(strings, ten, tuoi) {
    let str0 = strings[0]; // "Ban "
    let str1 = strings[1]; // "thi"
    let str2 = strings[2]; // "."
    let nhomTuoi;
    if (tuoi <17){
    nhomTuoi = 'chua truong thanh'; }
    else {
    nhomTuoi = 'truong thanh'; }
    // Ta có thể trả giá trị của một string đã được gán giá trị bằng dấu template strings
    return `${str0}${ten}${str1}${nhomTuoi}${str2}`;
}
let output = xetTuoi`Ban nay ${ person } thi ${ age }.`; //truyền tham số vào hàm xetTuoi
console.log(output); // "Bạn hải thì đã trưởng thành"

//Sử dụng phương thức String.raw
const duongDan = String.raw`C:\xampp\htdocs\php1\Lab2\demo_array.php`;

console.log(`file duoc tai len tu duong dan: ${duongDan}`)