package baiGiuaKy;

import java.util.Scanner;

/**
 * Lớp Khối A
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 16/7/2022
 * 
 */

// khởi tạo lớp
public class c_khoiA extends c_thiSinh {
    protected String mon1;
    protected String mon2;
    protected String mon3;

    // constructor không tham số
    public c_khoiA() {
    }

    // constructor có tham số
    public c_khoiA(String mon1, String mon2, String mon3) {
        super();
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    /**
     * Hàm set 3 môn
     * 
     * @param mon1
     * @param mon2
     * @param mon3
     */
    public void setMon(String mon1, String mon2, String mon3) {
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    /**
     * Hàm trả về môn 1
     * 
     * @return mon1
     */
    public String getMon1() {
        return this.mon1;
    } // end getMon1

    /**
     * Hàm trả về môn 2
     * 
     * @return
     */
    public String getMon2() {
        return this.mon2;
    }// end getMon2

    /**
     * 
     * @return mon3
     */
    public String getMon3() {
        return this.mon3;
    }// end getMon3

    // hàm toString
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +
                "\nMon 1: " + this.mon1 +
                "\nMon 2: " + this.mon2 +
                "\nMon 3: " + this.mon3;
    }// end toString
}// end class
