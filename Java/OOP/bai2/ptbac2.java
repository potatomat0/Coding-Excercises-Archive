package bai2;

public class ptbac2 {
    public double a, b, c, d, x1, x2;

    // tạo constructors
    /**
     * 
     * @param a
     * @param b
     * @param c
     */
    public ptbac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Constructor không có tham số
     */
    public ptbac2() {

    }

    // khai báo và đặt biến
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
     * Gán giá trị a
     * 
     * @param a
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * Gán giá trị b
     * 
     * @param b
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Gán giá trị c
     * 
     * @param c
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * Gán giá trị delta
     * 
     * @param d
     */
    public void setDelta(double d) {
        d = (b * b) - (4 * a * c);
    }

    // tạo hàm tính ptb1
    public void giaiPT2() {
        // giải và biện luận nếu a = 0
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT vo nghiem");
            } else {
                System.out.println("PT co 1 nghiem "
                        + "x = " + (-c / b));
            }
            return;
        }

        // tính nghiệm nếu a khác 0
        if (d > 0) {
            x1 = ((-b + Math.sqrt(d)) / (2 * a));
            x2 = ((-b - Math.sqrt(d)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (d == 0) {
            x1 = (-b / (2 * a));
            System.out.println("PT co nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("PT vo nghiem");
        }
    }

} // kết thúc class
