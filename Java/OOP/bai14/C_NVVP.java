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
public class C_NVVP extends AC_Person {
    // var
    private float luong;
    private float phucap;
    private float hesoluong;

    // ===constructor
    // constructor đầy đủ
    public C_NVVP(String ten, String diachi, String gioitinh, int namsinh, int namcongtac, float hesoluong) {
        super(ten, diachi, gioitinh, namsinh, namcongtac);
        this.hesoluong = hesoluong;
    }

    // constructor rỗng
    public C_NVVP() {
    }

    // ===getter setter===
    /**
     * 
     * @return phucap
     */
    public float getPhucap() {
        if (this.namcongtac > 10)
            phucap = luongcoban;
        else
            phucap = (float) 1.2 * luongcoban;
        return phucap;
    }

    /**
     * 
     * @return luong
     */
    public float getLuong() {
        float phucap1 = getPhucap();
        luong = luongcoban * hesoluong + phucap1;
        return luong;
    }

    public void setHesoluong(float hesoluong) {
        this.hesoluong = hesoluong;
    }

    /**
     * 
     * @return hesoluong
     */
    public float getHesoluong() {
        return this.hesoluong;
    }

    @Override
    public String toString() {
        return "C_CN{" + "luong=" + getLuong() + ", phucap=" + getPhucap() + ", hesoluong=" + hesoluong + '}';
    }

}
