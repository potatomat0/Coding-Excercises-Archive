package bai3;

public class Hth {
    double a, b, c, d, h;

    // tạo constructors
    /**
     * 
     * @param a
     * @param b
     * @param c
     * @param d
     * @param h
     */
    public Hth(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    // constructor không tham số
    public Hth() {

    }

    // khởi tạo các biến chiều dài chiều rộng
    // =====get
    /**
     * 
     * @return a
     */
    public double getA() {
        return a;
    }

    /**
     * 
     * @return b
     */
    public double getB() {
        return b;
    }

    /**
     * 
     * @return c
     */
    public double getC() {
        return c;
    }

    /**
     * 
     * @return d
     */
    public double getD() {
        return d;
    }

    /**
     * 
     * @return h
     */
    public double geth() {
        return h;
    }

    // =====get
    /**
     * gán giá trị vào a
     * 
     * @param a
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * gán giá trị vào b
     * 
     * @param b
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * gán giá trị vào c
     * 
     * @param c
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * gán giá trị vào d
     * 
     * @param d
     */
    public void setD(double d) {
        this.d = d;
    }

    /**
     * gán giá trị vào h
     * 
     * @param h
     */
    public void setH(double h) {
        this.h = h;
    }

    /**
     * tính diện tích
     * 
     * @return h * ((a + c) / 2)
     */
    public double tinhDienTich() {
        return h * ((a + c) / 2);
    }

    /**
     * tính chu vi
     * 
     * @return a+b+c+d
     */
    public double tinhChuVi() {
        return a + b + c + d;
    }
} // kết thúc class
