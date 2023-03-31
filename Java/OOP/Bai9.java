
import java.util.Scanner;

/**
 * @date 18/5/2022
 * @author Hoàng Minh Nhật
 *         Đề: . Xây dựng lớp phân số với hai thuộc tính riêng xác định tử số và
 *         mẫu số của phân số
 *         và xây dựng các phương thức:
 *         − Các toán tử tạo lập
 *         − Các phép toán cộng, trừ, nhân, chia các phân số
 *         − Phép kiểm tra một phân số có phải tối giản hay không
 *         − Phép tính dạng tối giản của phân số
 * 
 */
public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu va mau cua phan so thu nhat: ");
        c_bai9 ps1 = new c_bai9(sc.nextInt(), sc.nextInt());
        System.out.println("Nhap tu va mu cua phan so thu hai:");
        c_bai9 ps2 = new c_bai9(sc.nextInt(), sc.nextInt());
        sc.close();
        // tính các phân số
        ps1.cong(ps2);
        ps1.tru(ps2);
        ps1.nhan(ps2);
        ps1.chia(ps2);
        // kiểm tra phân số tối giản chưa
        System.out.println("================================================================");
        c_bai9 ps3 = new c_bai9(9, 3);
        if (ps3.toigiancheck() == true) {
            System.out.println("phan so da toi gian");
        } else {
            System.out.println("phan so" + ps3.get_tu() + "/" + ps3.get_mau() + "chua toi gian");
        }
        // xử lý tối giản phân số
        System.out.println("phan so " + ps3.get_tu() + "/" + ps3.get_mau() + "sau khi toi gian la:");
        ps3.toigian(); // gọi hàm tối giản
        System.out.print(ps3.get_tu() + "/" + ps3.get_mau()); // in ra phân số sau khi tối giản

    } // kết thúc main
} // kết thúc class

class c_bai9 {
    private int tu, mau;

    // constructor
    public c_bai9(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public c_bai9() {

    }

    // ==getter and setter
    /**
     * Set tử
     * 
     * @param tu
     */
    public void set_tu(int tu) {
        this.tu = tu;
    }

    /**
     * Set mẫu
     * 
     * @param mau
     */
    public void set_mau(int mau) {
        this.mau = mau;
    }

    /**
     * trả về mẫu
     * 
     * @return mau
     */
    public int get_mau() {
        return this.mau;
    }

    /**
     * trả về tử
     * 
     * @return tử
     */
    public int get_tu() {
        return this.tu;
    }

    // ================================================================ end getter
    // setter =================================================================
    /**
     * Tìm ước chung lớn nhất
     * 
     * @param t
     * @param m
     * @return t
     */
    public int ucln(int t, int m) {
        while (t != m) {
            if (t > m) {
                t -= m;
            } else {
                m -= t;
            }
        }
        return t;
    }

    // ================================================================hàm kiểm tra

    /**
     * Hàm tối giản phân số
     */
    public void toigian() {
        int i = ucln(this.get_tu(), this.get_mau());
        this.set_tu(this.get_tu() / i);
        this.set_mau(this.get_mau() / i);
    }

    // kiểm tra phân số tối giản================
    public boolean toigiancheck() {
        int i = ucln(this.get_tu(), this.get_mau());
        // if (i == this.get_tu())
        // System.out.println("phan so " + get_tu() + "/" + get_mau() + " da toi gian");
        // else {
        // System.out.println("phan so " + get_tu() + "/" + get_mau() + " chua toi
        // gian");
        // toigian();
        // System.out.println("dang toi gian la: " + this.get_tu() + "/" +
        // this.get_mau());
        return (i == this.get_tu());
    }

    /**
     * hàm cộng phân số
     * 
     * @param frac
     */
    public void cong(c_bai9 frac) {
        int ts = this.get_tu() * frac.get_mau() + frac.get_tu() * this.get_mau();
        int ms = this.get_mau() * frac.get_mau();
        c_bai9 frac_sum = new c_bai9(ts, ms);
        frac_sum.toigian();
        System.out.println("Tong hai phan so = " + frac_sum.tu + "/" + frac_sum.mau);
    }

    /**
     * hàm trừ phân số
     * 
     * @param frac
     */
    public void tru(c_bai9 frac) {
        int ts = this.get_tu() * frac.get_mau() - frac.get_tu() * this.get_mau();
        int ms = this.get_mau() * frac.get_mau();
        c_bai9 frac_diff = new c_bai9(ts, ms);
        frac_diff.toigian();
        System.out.println("hieu hai phan so = " + frac_diff.tu + "/" + frac_diff.mau);
    }

    /**
     * hàm nhân phân số
     * 
     * @param frac
     */
    public void nhan(c_bai9 frac) {
        int ts = this.get_tu() * frac.get_tu();
        int ms = this.get_mau() * frac.get_mau();
        c_bai9 frac_pro = new c_bai9(ts, ms);
        frac_pro.toigian();
        System.out.println("tich hai phan so = " + frac_pro.tu + "/" + frac_pro.mau);
    }

    /**
     * Hàm chia phân số
     * 
     * @param frac
     */
    public void chia(c_bai9 frac) {
        int ts = this.get_tu() * frac.get_mau();
        int ms = this.get_mau() * frac.get_tu();
        c_bai9 frac_quo = new c_bai9(ts, ms);
        frac_quo.toigian();
        System.out.println("thuong hai phan so = " + frac_quo.tu + "/" + frac_quo.mau);
    }
} // kết thúc class
