
    

// XÂY DỰNG MỘT CHƯƠNG TRÌNH QUẢN LÝ VẬT LIỆU TỪNG MODULE
// Module1: Giả sử cần viết chương trình quản lý việc nhập/ xuất danh sách vật liệu xây dựng dự án Chung Cư Etown, gồm:
// Lớp Vật Liệu với tham số gồm: mã loại, đơn vị tính (tấn, ký, khối), độ cứng, ngày mua, số lượng
// Lớp Sắt xây dựng : đơn giá.
// Tính Thành tiền : Nếu số lượng trên 20 thì thành tiền (số lượng * đơn giá) được giảm 20%, ngược lại không giảm
// Lớp Gạch : xuất xứ, đơn giá, khuyến mãi
// Tính Thành tiền : Nếu độ cứng trên 50 thì thành tiền= số lượng * đơn giá – khuyến mãi, ngược lạ thì số lượng * đơn giá + 100 ngàn.

 class VatLieu  {
    constructor(ma, donvi, docung, ngaymua, soluong) {
        this.ma = ma;
        this.donvi = donvi;
        this.docung = docung;
        this.ngaymua = ngaymua;
        this.soluong = soluong; 
    }

    display() {
        return `Mã vật liệu: ${this.ma}
        Đơn vị: ${this.donvi}
        Độ cứng: ${this.docung}
        Ngày mua: ${this.ngaymua}
        Số lượng: ${this.soluong} `
    }
}

//class sắt

class Sat extends VatLieu {
    constructor(ma, donvi, docung, ngaymua, soluong, dongia) {
        super(ma, donvi, docung, ngaymua, soluong)
        this.dongia = dongia
    }

    thanhTien() {
        var total = this.soluong * this.dongia * (this.soluong>=20? 0.8 : 1)
        return total
    }
    
    display() {
        return `${super.display()}   
        Đơn giá: ${this.dongia}`
    }
}

//class gạch
class Gach extends VatLieu {
    constructor(ma, donvi, docung, ngaymua, soluong, xuatxu , dongia, khuyenmai) {
        super(ma, donvi, docung, ngaymua, soluong)
        this.dongia = dongia
        this.xuatxu = xuatxu
        this.khuyenmai = khuyenmai
    }

    thanhTien() {
        var total = (this.soluong * this.dongia) + (this.soluong>=20? -this.khuyenmai : 100000)
        return total
    }
    
    display() {
        return `${super.display()}
        Đơn giá: ${this.dongia}
        Khuyến mãi: ${this.khuyenmai}
        Xuất xứ: ${this.xuatxu}`
    }
}

export {Gach as G, Sat as S};





