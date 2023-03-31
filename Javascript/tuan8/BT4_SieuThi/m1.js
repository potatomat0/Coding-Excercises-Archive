// Module 1: Xây dựng class

// Hàng hóa quản lý trong kho của một siêu thị gồm có hàng thực phẩm, hàng sành sứ và hàng điện máy. 
// Lớp Hàng Hóa đều có mã hàng, tên hàng, số lượng tồn (>=0), đơn giá (>0). 
// Lớp Thực Phẩm thì cần quan tâm đến thông tin ngày sản xuất, 
    // ngày hết hạn (ngày hết hạn phải sau hoặc là ngày sản xuất) và nhà cung cấp. 	
// Viết hàm kiểm tra hàng hóa còn hạn sử dụng hay không, 
    // nếu ngày hết hạn > ngày hiện tại thì thông báo “Hàng đã hết hạn”,
    //  ngược lại thì thông báo “Hàng đáp ứng được”.
// Hàng điện máy cần biết thời gian bảo hành bao nhiêu tháng (>=0), công suất bao nhiêu KW (>0). 
// Viết hàm tính VAT từng loại hàng hóa. Biết rằng VAT của hàng điện máy 10%.
// Hàng sành sứ thì cần biết thông tin về nhà sản xuất và ngày nhập kho. 
// Viết hàm tính VAT từng loại hàng hóa. Biết rằng VAT của Hàng sành sứ là 5%.


class HangHoa {
    constructor(ma, ten, tonKho, donGia) {
        this.ma = ma
        this.ten= ten
        this.tonKho = tonKho
        this.donGia = donGia
    }

    set SetTonkho(value) {
        return (value < 0 )? alert('Tồn kho không được nhỏ hơn 0') : this.tonKho = value
    }

    set SetDonGia(value) {
        return (value <=0 )? alert('Đơn giá không được nhỏ hơn 0') : this.donGia = value
    }
}

class ThucPham extends HangHoa{
    constructor(ma, ten, tonKho, donGia, ngaySX, ngayHH, nhaCungCap) {
        super(ma,ten,tonKho,donGia)
        this.ngaySX = ngaySX
        this.ngayHH = ngayHH
        this.nhaCungCap = nhaCungCap
    }

    set setNgayHH(value) {
        const diff = new Date(this.ngayHH) - new Date(this.ngaySX)
        return (diff <=0 )? alert('Ngày hết hạn không hợp lệ') : this.ngayHH = value
    }

    checkHSD() {
        const diff = (new Date() - new Date(this.ngayHH)) / (1000 * 60 * 60 * 24)
        return (diff <=0)? `Hàng đã hết hạn được ${diff} ngày` : `Hàng còn có thể được sử dụng ${diff} ngày`
    }
    
}

// var haha = new ThucPham('03', 'haha', -2, 7, new Date(2003,7,3), new Date(2023,7,3),  'Kinh Đô')

// console.log(haha.checkHSD())

//class sành sứ
class SanhSu extends HangHoa {
    constructor(ma, ten, tonKho, donGia, nhaSX, ngayNhapKho){
        super(ma,ten,tonKho,donGia)
        this.nhaSX = nhaSX
        this.ngayNhapKho = ngayNhapKho
    }

    tinhVAT() {
        var tax = this.tonKho*this.donGia*0.05
        return tax
    }
}
//class điện máy
class DienMay extends HangHoa {
    constructor(ma, ten, tonKho, donGia, baoHanh, congSuat){
        super(ma,ten,tonKho,donGia)
        this.baoHanh = baoHanh
        this.congSuat = congSuat
    }

    set SetBaoHanh(value){
        value >= 0? this.baoHanh = value: alert('thời gian bảo hành không hợp lệ')
    }
    set SetCongSuat(value){
        value > 0? this.congSuat = value: alert('công suất không hợp lệ')
    }

    tinhVAT() {
        var tax = this.tonKho*this.donGia*0.1
        return tax
    }
}

export {DienMay as dm, SanhSu as ss, ThucPham as tp}