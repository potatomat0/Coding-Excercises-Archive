package bai3;

public class TG {
    double a, b, c;

    // tạo constructors
    /**
     * Nhập vào tham số a,b,c
     * 
     * @param a
     * @param b
     * @param c
     */
    public TG(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // constructor không có tham số truyền vào
    public TG() {
    }

    // khởi tạo các biến chiều dài chiều rộng
    // =====get
    /**
     * trả về a
     * 
     * @return a
     */
    public double getA() {
        return a;
    }

    /**
     * trả về b
     * 
     * @return
     */
    public double getB() {
        return b;
    }

    /**
     * trả về c
     * 
     * @return c
     */
    public double getC() {
        return c;
    }

    // =====set
    /**
     * Gán giá trị vào a
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
     * tính diện tích
     * 
     * @return Math.sqrt(p * (p - a) * (p - b) * (p - c))
     */
    double tinhDienTich() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * tính chu vi
     * 
     * @return a+b+c
     */
    double tinhChuVi() {
        return a + b + c;
    }
} // kết thúc class
