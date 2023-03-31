//Đề: tạo class getter setter, thông báo trên console là tên chưa đủ độ dài khi <4 ký tự
class vidu{
    constructor(ten) {
        this.ten = ten;
    }
    set setTen(value) {
        if(value.length < 4) {
            alert('ten chua du do dai')
            return;
        }
        this.ten = value;
    }
    get getTen() { return this.ten;}
}

sinhvien = new vidu('nhat')
alert(sinhvien.ten)

sinhvien = new vidu('')