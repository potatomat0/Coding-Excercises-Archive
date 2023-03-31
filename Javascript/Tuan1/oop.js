//---tạo đối tượng
//cách một: 

var sinhvien = {
    ho: 'hoang',
    ten: 'nhat',
    lop: 13,
    thongtin: function() {
        return 'ten sinh vien: ' + ho + ' ' + ten; 
    }
}
console.log(sinhvien.intruong());


//cách 2
var hocsinh = new Object;
hocsinh.firstname = 'nhat';
hocsinh.dihoc = function() {console.log('toi di hoc')}

console.log(hocsinh.firstname);
hocsinh.dihoc();
