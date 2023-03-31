//đề bài: đổi các mảng ký tự/chuỗi từ hoa thành thường và ngược lại


const arr = ['xin', 'chao', 'the gioi'];

//---hàm đổi chuỗi thường thành hoa
const toUpper = arr.map(thanhphan => {
  return thanhphan.toUpperCase();
});

console.log(toUpper);

//--hàm đổi chuỗi hoa thành thường
const toLower = arr.map(thanhphan => {
     return thanhphan.toLowerCase();
});

console.log(toLower);

