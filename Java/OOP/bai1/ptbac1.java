package bai1;

public class ptbac1 {
    double a, b, x;

    // cạo constructor

    ptbac1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // khai báo và nhập biến a,b
    /**
     * return a
     */
    public double getA() {
        return a;
    }

    /**
     * return b
     */
    public double getB() {
        return b;
    }

    /**
     * Gán giá trị cho a
     * 
     * @param a
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * gán giá trị cho b
     * 
     * @param b
     */
    public void setB(double b) {
        this.b = b;
    }

    // tạo hàm tính ptb1
    double giaiPT() {
        if (a != 0) {
            double x = -b / a;
            System.out.println("Gia tri cua x la: " + x);
        } else {
            if (b != 0) {
                System.out.println("Phuong trinh vo nghiem");
            }
            if (b == 0)
                System.out.println("phuong trinh co vo so nghiem");
        }
        return x;
    }

} // kết thúc class
