//đề bài: đổi 01 chuỗi chữ hoa thành chữ thường và ngược lại
var myString = "Bai Tap Mot";

//--tạo hàm đổi chữ thường thành chữ hoa:
    const toUpper = string => string.toUpperCase();

//--tạo hàm đổi chữ hoa thành chữ thường:
    const toLowerCase = string => string.toLowerCase();

//--chạy hàm: 
var chuhoa = toUpper(myString);
console.log(`chuỗi ký tự được chuyển thành chữ hoa là: ${chuhoa}`)

var chuthuong = toLower(myString);
console.log(`chuỗi ký tự được chuyển thành chữ thường là: ${chuthuong}`)
