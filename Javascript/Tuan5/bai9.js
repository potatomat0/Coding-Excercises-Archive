// Viết ctrinh cắt bớt 1 chuỗi có độ dài được chỉ định.
//  Nếu chiều dài chuỗi lớn hơn giá tri chỉ định thì lấy độ dài đc chỉ định - 3,
//  ngược lại vẫn lấy độ dài được chỉ định.
// Vd: khi gọi hàm ('boomerang', 7) =>kq: boom...

let vidu = 'hom nay di hoc javascript kho qua!'

var catChuoi = (char, num) => { 
    if (num < char.length) 
        num = num-3
    chuoiMoi = char.substring(0, num)
    return chuoiMoi
}

console.log(catChuoi(vidu, 7 ))