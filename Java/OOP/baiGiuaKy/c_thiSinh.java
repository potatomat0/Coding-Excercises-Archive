package baiGiuaKy;

import java.util.Scanner;

public class c_thiSinh {
    // khai báo biến
    protected String hoTen;
    protected int sbd;
    protected String diaChi;
    protected String uuTien;

    // constructor không có tham số
    public c_thiSinh() {
    } // end constructor

    /**
     * Constructor có tham số
     * 
     * @param hoTen
     * @param sbd
     * @param diaChi
     * @param uuTien
     */
    public c_thiSinh(String hoTen, int sbd, String diaChi, String uuTien) {
        this.hoTen = hoTen;
        this.sbd = sbd;
        this.diaChi = diaChi;
        this.uuTien = uuTien;
    } // end constructor

    /**
     * Hàm set địa chỉ
     * 
     * @param diaChi
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }// end setDiaChi

    /**
     * Hàm set họ tên
     * 
     * @param hoTen
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }// end setHoTen

    /**
     * Hàm set số báo danh
     * 
     * @param sbd
     */
    public void setSbd(int sbd) {
        this.sbd = sbd;
    }

    /**
     * Hàm set ưu tiên
     * 
     * @param uuTien
     */
    public void setUuTien(String uuTien) {
        this.uuTien = uuTien;
    }

    /**
     * hàm trả về giá trị địa chỉ
     * 
     * @return diaChi
     */
    public String getDiaChi() {
        return diaChi;
    } // end getDiaChi

    /**
     * Hàm trả về giá trị họ tên
     * 
     * @return hoTen
     */
    public String getHoTen() {
        return hoTen;
    } // end getHoTen

    /**
     * Hàm trả về giá trị số báo danh
     * 
     * @return sbd
     */
    public int getSbd() {
        return sbd;
    } // end getSbd

    /**
     * Hàm trả về giá trị ưu tiên
     * 
     * @return uuTien
     */
    public String getUuTien() {
        return uuTien;
    } // end getUuTien

    /**
     * Hàm nhập bằng scanner
     * 
     * @param sc
     */
    public void nhapThongTin(Scanner sc) {
        System.out.print("vui long nhap ho va ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Vui long nhap sbd: ");
        this.sbd = sc.nextInt();
        sc.nextLine();
        System.out.print("Vui long nhap dia chi: ");
        this.diaChi = sc.nextLine();
        System.out.print("Vui long nhap uu tien: ");
        this.uuTien = sc.nextLine();
    } // end nhapThongTin

    /**
     * Hàm toString trả giá trị thông tin thí sinh
     * 
     * @return hoTen, diaChi, sbd, uuTien
     */
    public String toString() {
        return "Ho ten: " + this.hoTen +
                "\nSo bao danh: " + this.sbd +
                "\nDia chi: " + this.diaChi +
                "\nKhu vuc uu tien: " + this.uuTien;
    }
}