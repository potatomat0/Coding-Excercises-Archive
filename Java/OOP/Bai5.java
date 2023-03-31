
import java.util.Scanner;

/**
 * @date 18/5/2022
 * @author Hoàng Minh Nhật
 *         Đề: Tạo class nhập giờ phút giây và các hàm normalize(), reset(),
 *         advance(), print(),
 */
public class Bai5 {
    public static void main(String[] args) {
        // tạo object
        Scanner sc = new Scanner(System.in);
        c_bai5 time = new c_bai5();
        // Nhập thời gian
        System.out.println("nhap gia tri gio: ");
        time.set_gio(sc.nextInt());
        System.out.println("nhap gia tri phut: ");
        time.set_phut(sc.nextInt());
        System.out.println("nhap gia tri giay: ");
        time.set_giay(sc.nextInt());
        // in ra giá trị
        time.print();
        sc.close();
    }// end main
} // end class

class c_bai5 {
    private int h;
    private int m;
    private int s;

    // ===tạo constructor===
    /**
     * Truyền đầy đủ các giá trị
     * 
     * @param h
     * @param m
     * @param s
     */
    c_bai5(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    // không có tham số truyền vào
    c_bai5() {

    }

    /**
     * set giá trị giờ
     * 
     * @param x
     */
    public void set_gio(int h) {
        this.h = h;
        // gọi hàm
        this.normalize();
    }// end set_gio

    /**
     * return giá trị giờ
     * 
     * @return x
     */
    public int get_gio() {
        return this.h;
    }// end get_gio

    /**
     * set gia tri cho y
     * 
     * @param y
     */
    public void set_phut(int m) {
        this.m = m;
        this.normalize();
    }// end set_phut

    /**
     * trả giá trị phút
     * 
     * @return m
     */
    public int get_phut() {
        return this.m;
    }// end get_phut

    /**
     * set giá trị giây
     * 
     * @param s
     */
    public void set_giay(int s) {
        this.s = s;
        this.normalize();
    }// end toa do y

    /**
     * trả giá trị giây
     * 
     * @return m
     */
    public int get_giay() {
        return this.s;
    }// end get_giay

    /**
     * hàm chuẩn hóa giá trị giờ phút giây
     * 
     * @param h
     * @param m
     * @param s
     */
    public void normalize() {
        // nếu giá trị giờ phút giây <0, gán giá trị cho chúng = 0
        if (this.h < 0)
            this.h = 0;
        if (this.m < 0)
            this.m = 0;
        if (this.s < 0)
            this.s = 0;

        // nếu số giây > 59, ta cập nhập phút tăng, giây được chuẩn hóa
        if (this.s > 60) {
            this.m = this.m + this.s / 60;
            this.s = this.s % 60;
        } // end chuẩn hóa giây

        // nếu số phút > 59, ta cập nhập phút tăng, phút được chuẩn hóa
        if (this.m > 59) {
            this.h = this.h + this.m / 60;
            this.m = this.m % 60;
        } // end chuẩn hóa phút
          // Nếu giờ tăng quá 24, chuẩn hóa chúng thành 0+số giờ tăng
        this.h = this.h % 24;
    }// end normalize

    public void advance(int eh, int em, int es) {
        this.h = this.h + eh;
        this.m = this.m + em;
        this.s = this.s + es;
        // gọi hàm
        this.normalize();
    }// end tính

    public void print() {
        System.out.println(this.get_gio() + ":" + this.get_phut() + ":" + this.get_giay());
    }
}// end class
