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
public class AC_Person {
    // khai bao bien
    protected String ten, diachi, gioitinh;
    protected int namsinh, namcongtac;
    protected final long luongcoban = 9500;

    // ===constructors:
    /**
     * Constructor nhập vào đầy đủ tham số
     * 
     * @param ten
     * @param diachi
     * @param gioitinh
     * @param namsinh
     * @param namcongtac
     */
    public AC_Person(String ten, String diachi, String gioitinh, int namsinh, int namcongtac) {
        this.ten = ten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
        this.namcongtac = namcongtac;
    }

    /**
     * Constructor rỗng
     */
    public AC_Person() {
    }

    // ===getter setter===
    /**
     * @return Ten
     */
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public int getNamcongtac() {
        return namcongtac;
    }

    public void setNamcongtac(int namcongtac) {
        this.namcongtac = namcongtac;
    }

    // override method

    @Override
    public String toString() {
        return "AC_Person{" + "ten=" + ten + ", diachi=" + diachi + ", gioitinh=" + gioitinh + ", namsinh=" + namsinh
                + ", namcongtac=" + namcongtac + ", luongcoban=" + luongcoban + '}';
    }

}
