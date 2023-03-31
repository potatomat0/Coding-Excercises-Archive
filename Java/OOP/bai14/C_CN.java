/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

/**
 *
 * @author B602
 */
public class C_CN extends AC_Person {
    // var
    private float luong;
    private long sanluong;
    private float hesoluong;
    private float thuong;

    // ===constructor
    // constructor đầy đủ
    public C_CN(String ten, String diachi, String gioitinh, int namsinh, int namcongtac, float hesoluong,
            long sanluong) {
        super(ten, diachi, gioitinh, namsinh, namcongtac);
        this.hesoluong = hesoluong;
        this.sanluong = sanluong;
    }

    // constructor rỗng
    public C_CN() {
    }

    // ===getter setter===

    public long getSanluong() {
        return sanluong;
    }

    public void setSanluong(long sanluong) {
        this.sanluong = sanluong;
    }

    /**
     * 
     * @return phucap
     */
    public float getThuong() {
        if (this.sanluong > 1000)
            thuong = luongcoban;
        else
            thuong = (float) 1.5 * luongcoban;
        return thuong;
    }

    /**
     * 
     * @return luong
     */
    public float getLuong() {
        float thuong1 = getThuong();
        luong = luongcoban * hesoluong + thuong1;
        return luong;
    }

    public void setHesoluong(float hesoluong) {
        this.hesoluong = hesoluong;
    }

    public float getHesoluong() {
        return hesoluong;
    }

    @Override
    public String toString() {
        return "C_CN{" + "luong=" + getLuong() + ", sanluong=" + sanluong + ", hesoluong=" + hesoluong + ", thuong="
                + getThuong() + '}';
    }

} // end class
