
import java.util.Scanner;

/**
 * @date 18/5/2022
 * @author Hoàng Minh Nhật
 *         Đề: Tạo class nhập ngày tháng năm và các hàm normalize(), reset(),
 *         advance(), print(),
 */
public class bai6 {
    public static void main(String[] args) {
        // tạo object
        Scanner sc = new Scanner(System.in);
        c_bai6 time = new c_bai6();
        // Nhập thời gian
        System.out.println("nhap gia tri ngay: ");
        time.set_ngay(sc.nextInt());
        System.out.println("nhap gia tri thang: ");
        time.set_thang(sc.nextInt());
        System.out.println("nhap gia tri nam: ");
        time.set_nam(sc.nextInt());
        // in ra giá trị
        time.print();
        sc.close();
    }

} // end class bai6

class c_bai6 {
    private int ngay;
    private int thang;
    private int nam;

    // ==tạo constructor =================================
    /**
     * Nhập đầy đủ tham số
     * 
     * @param ngay
     * @param thang
     * @param nam
     */
    public c_bai6(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    // không có tham số truyền vào
    public c_bai6() {

    }

    // ================================================getter setter
    // =================================================
    /**
     * set giá trị ngày
     * 
     * @param ngay
     */
    public void set_ngay(int ngay) {
        this.ngay = ngay;
        // gọi hàm
        this.normalize();
    }// end set_ngay

    /**
     * return giá trị ngày
     * 
     * @return ngay
     */
    public int get_ngay() {
        return this.ngay;
    }// end get_gio

    /**
     * set gia tri cho tháng
     * 
     * @param y
     */
    public void set_thang(int thang) {
        this.thang = thang;
        this.normalize();
    }// end set_thang

    /**
     * trả giá trị tháng
     * 
     * @return thang
     */
    public int get_thang() {
        return this.thang;
    }// end get_thang

    /**
     * set giá trị năm
     * 
     * @param nam
     */
    public void set_nam(int nam) {
        this.nam = nam;
        this.normalize();
    }// end set_nam

    /**
     * trả giá trị nam
     * 
     * @return nam
     */
    public int get_nam() {
        return this.nam;
    }// end get_nam

    /**
     * hàm chuẩn hóa giá trị ngày tháng năm
     * 
     * @param ngay
     * @param thang
     * @param nam
     */
    public void normalize() {
        // nếu giá trị ngày tháng năm <0, gán giá trị cho chúng = 0
        if (this.ngay < 0)
            this.ngay = 0;
        if (this.thang < 0)
            this.thang = 0;
        if (this.nam < 0)
            this.nam = 0;

        // nếu số ngày > 30, ta cập nhập tháng tăng, ngày được chuẩn hóa
        if (this.ngay > 30) {
            this.thang = this.thang + this.ngay / 60;
            this.ngay = this.ngay % 30;
        } // end chuẩn hóa ngày
          // nếu số tháng tăng, chuẩn hóa tháng và theo đó là năm
        if (this.thang > 12) {
            this.nam = this.nam + (this.thang / 12);
            this.thang = this.thang % 12;
        } // end chuẩn hóa tháng
    }// end normalize

    public void advance(int engay, int ethang, int enam) {
        this.ngay = this.ngay + engay;
        this.thang = this.thang + ethang;
        this.nam = this.nam + enam;
        // gọi hàm
        this.normalize();
    }// end tính

    public void print() {
        System.out.println("ngay duoc nhap vao la: ");
        System.out.println(this.get_ngay() + "/" + this.get_thang() + "/" + this.get_nam());
    }
}// end class
