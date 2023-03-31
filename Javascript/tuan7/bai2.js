//Đề: câu 2

//tạo class person
class person{
    constructor(maso, name) {
        this.maso = maso;
        this.name = name;
    }

}

//class hợp đồng

class HopDong extends person {
    constructor(maso, name, tcld, snlv, sgv) {
      super(maso, name);
      this.tcld = tcld;
      this.snlv = snlv;
      this.sgv = sgv;
      this.hsvg = sgv * 40000;
    }

    Tinhluong() {
        var luong = this.tcld * this.snlv * this.hsvg;
        return luong;
    }
  }

//class biên chế

  class BienChe extends person {
    constructor(maso, name, LuongCB, HeSoLuong, PhuCap, ngayKyHD) {
      super(maso, name);
      this.LuongCB = LuongCB;
      this.HeSoLuong = HeSoLuong;
      this.PhuCap = PhuCap;
      this.ngayKyHD = ngayKyHD;
    }

    songaylamviec() {
        var hientai = new Date();
        const soGiay = new Date(hientai) - new Date(this.ngayKyHD)
        var snlv = soGiay / (1000 * 60 * 60 * 24);

      return snlv;
    }

    luongBienche() {
      if (this.songaylamviec() > 365) {
        var luong = this.LuongCB * this.HeSoLuong + this.PhuCap;
        return luong;
      } 
        return HopDong.luong();
    }
  }

  //tạo object Hợp đồng
var nv1 = new HopDong(501210710,'Hoang Minh Nhat',70000,30,40)
// console.log(nv1.Tinhluong());
  //tạo object biên chế
var nv2 = new BienChe(123,'Nguyen van a',7000,1.5,50000,new Date("07/03/2003"))
//gọi hàm tính số ngày làm việc
console.log(nv2.songaylamviec())
//gọi hàm tính lương biên chế
console.log(nv2.luongBienche())