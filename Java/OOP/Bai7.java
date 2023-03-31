
/**
 * @date 18/5/2022
 * @author Hoàng Minh Nhật
 *         Đề: Tạo một class nhập vào mssv, tensv, điểm toán, lý, hóa
 *         có chức năng hiển thị thông tin sinh viên và điểm trung bình ba môn
 */
public class Bai7 {
    public static void main(String[] args) {
        // khởi tạo object
        c_bai7 thongtin = new c_bai7(501210710, "Hoang Minh Nhat", 6, 7, 8);

        // in ra kết quả
        thongtin.view_sv();

    } // kết thúc main
} // kết thúc class

class c_bai7 {
    private float toan, ly, hoa;
    private String tensv;
    private long mssv;

    // tạo các constructors

    /**
     * lấy giá trị tensv, mặc định mssv, điểm toán lý hóa
     * 
     */
    public c_bai7() {
        this.mssv = 12345;
        this.tensv = "Nguyen Van A";
        this.toan = 5;
        this.ly = 5;
        this.hoa = 5;
    }

    /**
     * Lấy giá trị cả 3 môn, tên sv và mã sv
     * 
     * @param toan
     * @param ly
     * @param hoa
     * @param mssv
     * @param tensv
     */
    public c_bai7(long mssv, String tensv, float toan, float ly, float hoa) {
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.mssv = mssv;
        this.tensv = tensv;
    }

    /**
     * set giá trị mssv
     * 
     * @param mssv
     */
    public void set_mssv(long mssv) {
        this.mssv = mssv;
    }

    /**
     * set giá trị tensv
     * 
     * @param tensv
     */
    public void set_tensv(String tensv) {
        this.tensv = tensv;
    }

    /**
     * set giá trị toán
     * 
     * @param toan
     */
    public void set_toan(float toan) {
        this.toan = toan;
    }

    /**
     * set giá trị lý
     * 
     * @param ly
     */
    public void set_ly(float ly) {
        this.ly = ly;
    }

    /**
     * set giá trị hóa
     * 
     * @param hoa
     */
    public void set_hoa(float hoa) {
        this.hoa = hoa;
    }

    /**
     * get giá trị mssv
     * 
     * @return mssv
     */
    public long get_mssv() {
        return this.mssv;
    }// end get_nam

    /**
     * get giá trị tensv
     * 
     * @return tensv
     */
    public String get_tensv() {
        return this.tensv;
    }// end get_tensv

    /**
     * get giá trị toán
     * 
     * @return toan
     */
    public float get_toan() {
        return this.toan;
    }// end get_toan()

    /**
     * get giá trị lý
     * 
     * @return lý
     */
    public float get_ly() {
        return this.ly;
    }// end get_ly()

    /**
     * get giá trị hóa
     * 
     * @return hoa
     */
    public float get_hoa() {
        return this.toan;
    }// end get_hoa()

    /**
     * get giá trị trung bình cộng 3 điểm
     * 
     * @return toan
     */
    public float get_tbc() {
        return (this.toan + this.ly + this.hoa) / 3;
    }// end get_tbc()

    /**
     * In ra thông tin sinh viên và điểm trung bình ba môn
     * 
     * @param tbc
     * @param tensv
     * @param mssv
     * @param tensv
     * @param mssv
     */
    public void view_sv() {
        System.out.println("Ma so sinh vien la: " + get_mssv());
        System.out.println("Ten sinh vien la: " + get_tensv());
        System.out.println("Diem trung binh 3 mon la: " + "(" + get_toan() + " + " + get_ly() + " + "
                + get_hoa() + ")" + "/3" + "=" + get_tbc());
    }
} // kết thúc class