// 7.Chuyển 01 số thành 1 mảng các số.
// N = 473 => [4, 7, 3]

var n = 473;
 
 //phương thức Number() để chuyển dạng chuỗi thành số
 let toNum = num => Number(num);
//phương thức Array.from để copy một object thành một mảng
 var kq = Array.from(String(n), toNum);
 console.log(kq);