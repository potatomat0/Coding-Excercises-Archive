package bai21;

/**
 * xây dựng lớp thư viện với các thuộc tính mã và tên
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 4/7/2022
 * 
 */
public class THUVIEN {
    // các thuộc tính--------------------------------------
    protected String ma = "null";
    protected String ten = "null";

    // các phương thức--------------------------------------------

    /**
     * phương thức khởi tạo không truyền tham số
     */
    public THUVIEN() {
    }// end THUVIEN()

    /**
     * phương thức khởi tạo truyền tham số mã thư viện
     * 
     * @param ma mã thư viện
     */
    public THUVIEN(String ma) {
        this.ma = ma;
    }// end THUVIEN(String ma)

    /**
     * phương thức khởi tạo truyền tham số mã thư viện và tên thư viện
     * 
     * @param ma  mã thư viện
     * @param ten tên tên thư viện
     */
    public THUVIEN(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }// end THUVIEN(String ma, String ten)

    /**
     * phương thức lấy thuộc tính mã
     * 
     * @return String
     */
    public String getMa() {
        return ma;
    }// end getMa

    /**
     * phương thức thiết lập thuộc tính mã
     * 
     * @param ma mã
     */
    public void setMa(String ma) {
        this.ma = ma;
    }// end setMa

    /**
     * phương thức lấy thuộc tính tên
     * 
     * @return Sting
     */
    public String getTen() {
        return ten;
    }// end getTen

    /**
     * phương thức thiết lập thuộc tính tên
     * 
     * @param ten tên
     */
    public void setTen(String ten) {
        this.ten = ten;
    }// end setTen

    /**
     * phương thức lấy thuộc tính lớp thư viện
     */
    @Override
    public String toString() {
        return "\t\tMaThuvien: " + ma + "TenThuvien: " + ten;
    }

}// end class
