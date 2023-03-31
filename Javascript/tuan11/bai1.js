// Tạo Map, gồm tên và điểm sv

// ·  Xuất tên, điểm sv

// ·  Lấy ra mảng gồm tên sv

// ·  Lấy ra mảng gồm điểm sv

// ·  Lấy ra mảng chỉ chứa các điểm rớt của sv

// ·  Đếm xem có bao nhiêu sv đậu, rớt

// ·  Kiểm tra tên của 1 sv bất kỳ có trong ds lớp ko?

// ·  Xóa tên 1 sv ra khỏi ds
//==================
// tạo map:
const sus = new Map();

sus
    .set('a',4)
    .set('b',7)
    .set('c',9)
    .set('d',2)
    .set('e',6)
    .set('f',3)
//xuất tên, điểm
//---cách 1
// for (const [key, value] of sus) {
//     console.log(`${key} = ${value}`);
//   }
//---cách 2:
console.log([...sus.entries()]);
//xuất tên:
console.log([...sus.keys()]);
//xuất điểm
console.log([...sus.values()]);
//Lấy ra mảng chỉ chứa các điểm rớt của sv
diem = [...sus.values()];
rot = diem.filter(a => a<5)
console.log(`Những bạn bị rớt nè😅😅:${rot} `);
//Đếm xem có bao nhiêu sv đậu, rớt
dem = ([...sus.values()].filter(a=>a<5)).length
console.log(`lớp có ${dem} bạn bị rớt nha 👍🏿👍🏿👍🏿`);
//kiểm tra sinh viên bất kỳ có trong lớp không
diemDanh = 'b'
sus.has(diemDanh)? console.log(`Bạn ${diemDanh} có trong lớp`) 
                    : console.log(`Bạn ${diemDanh} không tồn tại 😿😿😿`)
//xóa một sinh viên bất kỳ
sus.delete(diemDanh)?(console.log('xóa thành công'))
                :(console.log('không tồn tại sinh viên'))

