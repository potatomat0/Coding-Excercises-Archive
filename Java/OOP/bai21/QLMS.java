package bai21;

import java.util.Arrays;
import java.util.Scanner;

/**
 * xây dựng lớp quản lý mượn sách
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 4/7/2022
 * 
 */
public class QLMS extends PHIEUMUON implements INTERFACE_QLTV {
    Scanner sc = new Scanner(System.in);
    // các thuộc
    // tính-------------------------------------------------------------------------------
    private PHIEUMUON[] qlms = new PHIEUMUON[100];
    private PHIEUMUON phieumuon;

    // các phương
    // thức-----------------------------------------------------------------------------------------------------------------------------------------
    public QLMS() {
    }// end QLMS()

    /**
     * phương thức khởi tạo truyền tham số bạn đọc
     * 
     * @param bandoc bạn đọc
     */
    public QLMS(BANDOC bandoc) {
        super(bandoc);
    }// end QLMS(BANDOC bandoc)

    /**
     * phương thức khởi tạo truyền tham số bạn đọc ,sách
     * 
     * @param bandoc bạn đọc
     * @param sach   sách
     */
    public QLMS(BANDOC bandoc, SACH sach) {
        super(bandoc, sach);
    }// end QLMS(BANDOC bandoc, SACH sach)

    /**
     * phương thức khởi tạo truyền tham số bạn đọc ,sách , phiếu mượn
     * 
     * @param bandoc    bạn đọc
     * @param sach      sách
     * @param phieumuon phiếu mượn
     */
    public QLMS(BANDOC bandoc, SACH sach, PHIEUMUON phieumuon) {
        super(bandoc, sach);
        this.phieumuon = phieumuon;
    }// end QLMS(BANDOC bandoc, SACH sach, PHIEUMUON phieumuon)

    /**
     * phương thức lấy thuộc tính phiếu mượn
     * 
     * @return PHIEUMUON
     */
    public PHIEUMUON getPhieumuon() {
        return phieumuon;
    }// end getSach

    /**
     * phương thức thiết lập thuộc tính phiếu mượn
     * 
     * @param phieumuon phiếu mượn
     */
    public void setPhiemuon(PHIEUMUON phieumuon) {
        this.phieumuon = phieumuon;
    }// end setPhieumuon

    int i = 0;

    /**
     * phương thức nhập
     */
    public void nhap() {
        bandoc = new BANDOC("BD01", "Nhat", "0338214140");
        sach = new SACH("S01", "Nhat", 1, "KIMDONG");
        this.qlms[i++] = new PHIEUMUON("PM01", 15, 6, 2022, 15, 7, 2022, bandoc, sach);
        bandoc = new BANDOC("BD01", "Minh Nhat", "0338214140");
        sach = new SACH("S02", "CONAN", 2, "KIMDONG");
        this.qlms[i++] = new PHIEUMUON("PM02", 19, 8, 2022, 19, 10, 2022, bandoc, sach);
        bandoc = new BANDOC("BD03", "Nhat", "0338214140");
        sach = new SACH("S03", "CONAN", 3, "KIMDONG");
        this.qlms[i++] = new PHIEUMUON("PM03", 1, 12, 2022, 1, 2, 2023, bandoc, sach);

    }// end nhap

    /**
     * phương thức xuất
     */
    public void xuat() {
        for (int t = 0; t < i; t++) {
            System.out.println(qlms[t].toString());
        }
    }// end xuat

    /**
     * phương thức thống kê bạ đọc
     */
    @Override
    public void thongkebandoc(int tuthang, int denthang, int nam) {

        for (int j = 0; j < i; j++) {
            if ((this.qlms[j].getThangmuon() >= tuthang && this.qlms[j].getThangtra() <= denthang)
                    && (this.qlms[j].getNammuon() == nam && this.qlms[j].getNamtra() == nam)) {
                System.out.println(this.qlms[j].getBandoc());

            }
        }

    }// end thongkebandoc

    /**
     * phương thức thống kê sách
     */
    @Override
    public void thongkesach(int tuthang, int denthang, int nam) {
        for (int j = 0; j < i; j++) {
            if ((this.qlms[j].getThangmuon() >= tuthang && this.qlms[j].getThangtra() <= denthang)
                    && (this.qlms[j].getNammuon() == nam && this.qlms[j].getNamtra() == nam)) {
                System.out.println(this.qlms[j].getSach());

            }
        }

    }// end thongkesach

    @Override
    public String toString() {
        System.out.println("====================================DANH SACH MUON SACH================================");
        return Arrays.toString(qlms);
    }

}// end class
