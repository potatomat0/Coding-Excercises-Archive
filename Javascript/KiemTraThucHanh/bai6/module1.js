// 6.	XÂY DỰNG MỘT CHƯƠNG TRÌNH QUẢN LÝ DANH SÁCH CÁC CD TỪNG MODULE
// Module 1: (3đ)
// Lớp CD Tổng Hợp 
// o  Tựa CD: chuỗi ký tự, 
// o Ca sỹ: chuỗi ký tự, 
// o Số bài hát: số nguyên (>0) 
// o Giá thành: số thực (>0) 

// - Viết hàm showInfo thông tin của CD tổng hợp
// Lớp CD Nhạc Trẻ có thêm thuộc tính số lượng, đơn giá.

// -Viết hàm tính Thành tiền Nếu số lượng trên 20 thì thành tiền (số lượng * đơn giá) được giảm 20%, ngược lại không giảm.

// *Lớp CD nhạc trịnh có thuộc tính năm xuất bản, số lượng, đơn giá, kế thừa từ lớp CD tổng hợp, 

// -Viết hàm tính thành tiền lớp CD nhạc trịnh bằng số lượng * đơn giá.

// -Viết hàm tính khuyến mãi, nếu năm xuất bản < 1990 khuyến mãi 10% ngược lại không khuyến mãi.
class CD {
    constructor(tieuDe, caSy, gia, soBaiHat) {
       this.tieuDe = tieuDe;
       this.caSy = caSy;
       this.gia = gia;
       this.soBaiHat = soBaiHat;
    }

    showInfo() {
        return `Tiêu Đề: ${this.tieuDe}
        Ca Sy: ${this.caSy}
        Gia: ${this.gia}
        so bai hat: ${this.soBaiHat}`
    }
}

//class nhạc trẻ

class nhacTre extends CD {
    constructor(tieuDe, caSy, soBaiHat, gia, soLuong, donGia) {
        super(tieuDe, caSy, gia, soBaiHat)
        this.donGia = donGia
        this.soLuong = soLuong
    }

    thanhTien() {
        var total = this.soLuong * this.donGia * (this.soLuong>=20? 0.8 : 1)
        return total
    }
    
    showInfo() {
        return `${super.showInfo()}   
        Đơn giá: ${this.donGia}`
    }
}

//class nhacTrinh
class nhacTrinh extends CD {
    constructor(tieuDe, caSy, soBaiHat, gia, soLuong, donGia, namXuatBan) {
        super(tieuDe, caSy, soBaiHat, gia);
        this.donGia = donGia
        this.namXuatBan = namXuatBan
        this.soLuong = soLuong
    }

    thanhTien() {
        var total;
        this.namXuatBan.getFullYear() < 1990?  total = (this.soLuong * this.donGia*0.9): total = (this.soLuong * this.donGia) 
        return total
    }
    
    showInfo() {
        return `${super.showInfo()}
        Đơn giá: ${this.donGia}
        Năm xuất bản: ${this.namXuatBan}
        Số lượng: ${this.soLuong}`
    }
}

export {nhacTre as tr, nhacTrinh as tri};





