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
public class C_NVKD extends AC_Person {
    private long doanhthu;
    private float thuong;
    private float hoahong;
    private float luong;

    // constructor
    // ===constructor day du
    public C_NVKD(String ten, String diachi, String gioitinh, int namsinh, int namcongtac, long doanhthu,
            float hoahong) {
        super(ten, diachi, gioitinh, namsinh, namcongtac);
        this.doanhthu = doanhthu;
        this.hoahong = hoahong;
    }

    // ===constructor rong
    public C_NVKD() {
    }

    /**
     * 
     * @return doanhthu
     */
    public long getDoanhthu() {
        return doanhthu;
    }

    /**
     * 
     * @param doanhthu
     */
    public void setDoanhthu(long doanhthu) {
        this.doanhthu = doanhthu;
    }

    /**
     * 
     * @return hoahong
     */
    public float getHoahong() {
        return hoahong;
    }

    /**
     * 
     * @param hoahong
     */
    public void setHoahong(float hoahong) {
        this.hoahong = hoahong;
    }

    // === tính lương

    public float getThuong() {
        thuong = this.doanhthu * this.hoahong;
        return thuong;
    }

    public float getLuong() {
        this.luong = luongcoban + getThuong();
        return luong;
    }

    @Override
    public String toString() {
        return "C_NVKD{" + "doanhthu=" + doanhthu + ", thuong=" + getThuong() + ", hoahong=" + hoahong + ", luong="
                + getLuong() + '}';
    }

}
