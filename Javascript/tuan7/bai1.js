//Đề: cho một mảng sinh viên gồm nhiều đối tượng có họ, tên, tuổi, ngày sinh
//Yêu cầu: Hiển thị đầy đủ họ tên, tuổi, ngày sinh
//sắp xếp tuổi sinh viên giảm dần
//lọc ra sinh viên có tuổi >19
//tính tuổi của các sinh viên
//------------- -----------------------------------


// Làm
var sinhvien = [
    {ho: 'hoang', ten: 'nhat', tuoi: '19', ngaysinh: new Date("07/03/2003")},
    {ho: 'nguyen', ten: 'thai', tuoi: '17', ngaysinh: new Date("08/14/2005")},
    {ho: 'tran', ten: 'hai', tuoi: '23', ngaysinh: new Date("02/09/2007")},
    {ho: 'do', ten: 'hao', tuoi: '25', ngaysinh: new Date("12/27/1997")},
    {ho: 'chu', ten: 'nguyen', tuoi: '24', ngaysinh: new Date("11/08/1998")},
    {ho: 'truong', ten: 'chi', tuoi: '29', ngaysinh: new Date("05/19/1993")},
]


// hiển thị đầy đủ thông tin array
console.table(sinhvien)
// hiển thị bằng vòng lặp:
sinhvien.forEach(sv => {
  for (let key in sv) {
    console.log(`${key}: ${sv[key]}`)
  }
})

//sắp xếp tuổi sinh viên giảm dần
tuoiTangDan = sinhvien.sort(function(a, b) {
    var keyA = a.tuoi,
      keyB = b.tuoi;
    if (keyA < keyB) return -1;
    if (keyA > keyB) return 1;
    return 0;
  });
  
//hiển thị
//   console.table(tuoiTangDan);

//sắp xếp tên sinh viên tăng dần
var tenGiamDan = sinhvien.sort(function(a, b) {
    var keyA = a.ten,
      keyB = b.ten;
    if (keyA < keyB) return 1;
    if (keyA > keyB) return -1;
    return 0;
  });

//   console.table(tenGiamDan);

//lọc các sinh viên có tuổi nhỏ hơn 23
var LocSinhVien = sinhvien.filter(sv=>{
  return sv.tuoi >23 
})
// console.table(LocSinhVien)



//tính tuổi của các sinh viên:
sinhvien.forEach(sv => {
  for (let key in sv) {
    const Mdiff = Date.now() - new Date(sv[key.ngaysinh]).getTime();
    const ageDate = new Date(Mdiff);
    sv[key].ngaysinh= Math.abs(ageDate.getUTCFullYear() - 1970);
  }
})


