package tuan9;

/**
 * xây dựng lớp công nhân kế thừa các thuộc tính từ class NHANVIEN thêm các
 * thuộc tính riêng hệ số lương, sản lượng
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 28/6/2022
 */
public class CN extends NVVP {
    // các thuôc
    // tính---------------------------------------------------------------------------------------------------
    private double sanluong = 0;

    // các phương
    // thức---------------------------------------------------------------------------------------

    /**
     * phương thức khởi tạo không truyền tham số
     * 
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         hoten,diachi,gioitinh,namsinh=null; hesoluong=1; sanluong=0;
     */
    public CN() {
        super();
    }// end CN()

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi,gioitinh namsinh, hesoluong,
     * sanluong
     * 
     * @param hoten     họ và tên
     * @param diachi    dịa chỉ
     * @param gioitinh  giới tính
     * @param namsinh   năm sinh
     * @param hesoluong hế số lương
     * @param sanluong  sản lượng
     * @hidden giá trị mặc định: luongcoban=9500000;
     * 
     */
    public CN(String hoten, String diachi, String gioitinh, int namsinh, double hesoluong, double sanluong) {
        super(hoten, diachi, gioitinh, namsinh, hesoluong);
        this.sanluong = sanluong;
    }// end CN(String hoten, String diachi, int namsinh,double hesoluong, double
     // sanluong)

    /**
     * phương thức lấy thuộc tính sản lượng
     * 
     * @return double
     */
    public double getSanluong() {
        return sanluong;
    }// end getSanluong

    /**
     * phương thức thiết lập thuộc tính sản lượng
     * 
     * @param sanluong sản lượng
     */
    public void setSanluong(double sanluong) {
        this.sanluong = sanluong;
    }// end setSanluong

    /**
     * phương thức tính thưởng
     * 
     * @return double
     */
    private double thuong() {
        double thuong = 0;
        if (this.sanluong < 1000)
            thuong = 1f * super.luongcoban;
        else
            thuong = 1.5 * super.luongcoban;
        return thuong;
    }// end thuong

    /**
     * phương thức tính lương
     * 
     * @return double
     */
    @Override
    public double luong() {
        double luong = super.hesoluong * this.luongcoban + thuong();
        return luong;
    }// end luong

    /**
     * phương thức lấy dữ liệu class CN
     */
    @Override
    public String toString() {

        return super.toString() + "\tsan luong: " + this.sanluong;
    }// end toString

}// en class CN
