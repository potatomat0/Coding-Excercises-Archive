//Đề bài: 4. Viết chương trình JavaScript để tạo một mảng mới 
//...trong số hai mảng được cung cấp bằng cách tạo từng cặp có thể có từ các mảng.

//tạo mảng ví dụ
var mang1 = [a,b,c,d,e]
var mang2 = [1,2,3,4,5]
//cả hai mảng cùng độ dài

//tạo hàm
const nhapmang = (keys, values) => {
    var mangmoi = {};
    for (let i = 0; i < keys.length; i++) {
    mangmoi[keys[i]] = values[i];
    return mangmoi
}
}

console.log(nhapmang(mang1,mang2))