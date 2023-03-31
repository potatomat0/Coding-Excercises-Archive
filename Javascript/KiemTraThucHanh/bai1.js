//Đề: Thời gian: 60’
// 1.	Tạo mảng các đối tượng nhân viên gồm mã số nhân viên, lương. Tìm nhân viên có lương lớn hơn 5000000(1đ)
const nhanVien = [
    {msnv: 1, luong: 7000000},
    {msnv: 2, luong: 5000000},
    {msnv: 3, luong: 9000000},
    {msnv: 4, luong: 11000000},
    {msnv: 5, luong: 3000000},
    {msnv: 6, luong: 4000000},
]

var nhanVienLoc = nhanVien.filter(nv => nv.luong>=5000000)
// console.log(nhanVienLoc)
nhanVienLoc.forEach(nv => {
    for (let key in nv) {
      console.log(`${key}: ${nv[key]}`)
    }
  })
