package baiGiuaKy;

import java.util.Scanner;

/**
 * Lớp Khối B
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 16/7/2022
 * 
 */

public class c_khoiB extends c_khoiA {
    // constructor không có tham số
    public c_khoiB() {
    }// end constructor

    /**
     * constructor có tham số đầy đủ
     * 
     * @param mon1
     * @param mon2
     * @param mon3
     */
    public c_khoiB(String mon1, String mon2, String mon3) {
        super(mon1, mon2, mon3);
    } // end constructor

    // hàm toString
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +
                "\nMon 1: " + this.mon1 +
                "\nMon 2: " + this.mon2 +
                "\nMon 3: " + this.mon3;
    }// end toString

} // end class
