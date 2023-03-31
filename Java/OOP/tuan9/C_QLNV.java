package tuan9;

import java.util.Scanner;

/**
 * xây dựng lớp quản lý nhân viên
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 28/6/2022
 */
public class C_QLNV {
    Scanner sc = new Scanner(System.in);
    // các thuộc
    // tính------------------------------------------------------------------------------------
    private C_NHANVIEN[] DSNV;
    private int n = 100;

    // các phương
    // thức----------------------------------------------------------------------------------

    /**
     * phương thức khởi tạo khong truyền tham số
     * 
     * @hidden giới hạng mảng nhập mặc định =100
     */
    public C_QLNV() {

        this.DSNV = new C_NHANVIEN[n];
    }// end QLNV()

    /**
     * phương thức khởi tạo truyền tham số n
     * 
     * @param n giới hạn mảng
     */
    public C_QLNV(int n) {
        this.n = n;
        this.DSNV = new C_NHANVIEN[n];
    }// end QLNV(int n)

    /**
     * phương thức lấy thuộc tính n
     * 
     * @return int
     */
    public int getN() {
        return n;
    }// end getN

    /**
     * phương thức thiết lập thuộc tính n
     * 
     * @param n giới hạn mảng
     */
    public void setN(int n) {
        this.n = n;
    }// end setN

    int y = 0;// biến chạy

    /**
     * phương thức nhập
     */
    public void nhap() {

        this.DSNV[y++] = new NVKD("Hoang Minh Nhat", "Binh Thuan", "Nam", 2003, 1000000, 0.1);
        this.DSNV[y++] = new NVKD("Hoang Minh Nhat", "Binh Thuan", "Nam", 2003, 1000000, 0.1);
        this.DSNV[y++] = new NVKD("Hoang Minh Nhat", "Binh Thuan", "Nam", 2003, 1000000, 0.1);
        this.DSNV[y++] = new NVKD("Hoang Minh Nhat", "Binh Thuan", "Nam", 2003, 1000000, 0.1);

        this.DSNV[y++] = new NVVP("Hoang Minh Nhat", "Binh Thuan", "nu", 2002, 15, 1);
        this.DSNV[y++] = new NVVP("Hoang Minh Nhat", "Binh Thuan", "nu", 2002, 15, 1);
        this.DSNV[y++] = new NVVP("Hoang Minh Nhat", "Binh Thuan", "nu", 2002, 15, 1);
        this.DSNV[y++] = new NVVP("Hoang Minh Nhat", "Binh Thuan", "nu", 2002, 15, 1);

        this.DSNV[y++] = new CN("Nhat", "Binh Thuan", "nam", 2003, 1, 5);

    }// end nhap

    /**
     * phương thức xuất
     */
    public void xuat() {
        for (int j = 0; j < y; j++) {
            System.out.println(j + DSNV[j].toString());
        }
    }// end xuat

    /**
     * phương thức tìm kiếm theo tên
     */
    public void timKiemTheoTen(String fullname) {
        for (int j = 0; j < y; j++) {
            if (DSNV[j].getHoten().equals(fullname)) {
                System.out.println(DSNV[j].toString());
            }
        }

    }// end timKiemTheoTen()

    /**
     * phương thức hiển thị theo năm sinh
     */
    public void hienThiTheoNamSinh(int namsinh1) {
        for (int j = 0; j < y; j++) {
            if (DSNV[j].getNamsinh() == namsinh1) {
                System.out.println(DSNV[j].toString());
            }
        }
    }// end hienThiTheoNamSinh()

    /**
     * phương thức đếm theo năm sinh và địa chỉ
     */
    public int demSLNamsinhDiaChi(String diachi, int namsinh2) {

        int count = 0;
        for (int j = 0; j < y; j++) {
            if (DSNV[j].getNamsinh() == namsinh2 && DSNV[j].getDiachi().equals(diachi) == true) {

                count++;
            }
        }

        return count;
    }// end hienThiTheoNamSinhVaDiaChi()

    /**
     * phương thức hiển thị theo lương dưới lương yêu cầu
     */
    public void hienThiTheoLuong(double luong) {

        for (int j = 0; j < y; j++) {
            if (DSNV[j].luong() < luong) {
                System.out.println(DSNV[j].toString());
            }
        }
    }// end void hienThiTheoLuong()

}// end QLNV
