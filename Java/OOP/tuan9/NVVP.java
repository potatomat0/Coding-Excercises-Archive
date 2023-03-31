package tuan9;

/**
 * xây xựng lớp nhân viên văn phòng kế thừa các thuộc tính từ class NHANVIEN
 * thêm các thuộc tính riêng số năm công tắc, hệ số lương
 * 
 * @author Hoàng MInh Nhật
 * @id 501210710
 * @date 28/6/2022
 */
public class NVVP extends C_NHANVIEN {
    // các thuộc
    // tính-------------------------------------------------------------------------------------------------
    protected double hesoluong = 1;

    // các phương
    // thức-----------------------------------------------------------------------------------------------

    /**
     * phuong thức khởi tạo không truyền tham số
     * 
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         hoten,diachi,gioitinh,namsinh=null;sonamcongtac=0; hesoluong=1;
     */
    public NVVP() {
        super();

    }// end NVVP()

    /**
     * phương thức khởi tạo truyền tham số hoten
     * 
     * @param hoten họ và tên
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         diachi,gioitinh,namsinh=null;sonamcongtac=0; hesoluong=1;
     */
    public NVVP(String hoten) {
        super(hoten);

    }// end NVVP(String hoten)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi
     * 
     * @param hoten  họ và tên
     * @param diachi địa chỉ
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         gioitinh,namsinh=null;sonamcongtac=0; hesoluong=1;
     */
    public NVVP(String hoten, String diachi) {
        super(hoten, diachi);
    }// end NVVP(String hoten, String diachi)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi,gioitinh
     * 
     * @param hoten    họ và tên
     * @param diachi   đia chỉ
     * @param gioitinh giới tính
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         namsinh=null;sonamcongtac=0; hesoluong=1;
     */
    public NVVP(String hoten, String diachi, String gioitinh) {
        super(hoten, diachi, gioitinh);
    }// end NVVP(String hoten, String diachi,gioitinh)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi,gioitinh,namsinh
     * 
     * @param hoten    họ và tên
     * @param diachi   địa chỉ
     * @param gioitinh giới tính
     * @param namsinh  năm sinh
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         sonamcongtac=0; hesoluong=1;
     */
    public NVVP(String hoten, String diachi, String gioitinh, int namsinh) {
        super(hoten, diachi, gioitinh, namsinh);
    }// end NVVP(String hoten, String diachi, String gioitinh, int namsinh)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi,gioitinh, namsinh,
     * luongcoban,sonamcongtac
     * 
     * @param hoten        họ và tên
     * @param diachi       địa chỉ
     * @param gioitinh     giới tính
     * @param namsinh      năm sinh
     * @param sonamcongtac số năm công tac
     * @hidden giá trị mặc định: luongcoban=9500000
     *         ;sonamcongtac=0;
     */
    public NVVP(String hoten, String diachi, String gioitinh, int namsinh, double hesoluong) {
        super(hoten, diachi, gioitinh, namsinh);
        this.hesoluong = hesoluong;

    }// end NVVP(String hoten, String diachi,String gioitinh, int namsinh, int
     // sonamcongtac)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi, gioitinh,namsinh,
     * sonamcongtac,
     * hesoluong
     * 
     * @param hoten        họ và tên
     * @param diachi       địa chỉ
     * @param gioitinh     giới tính
     * @param namsinh      năm sinh
     * @param sonamcongtac số năm công tác
     * @param hesoluong    hệ số lương
     * @hidden giá trị mặc định: luongcoban=9500000;
     * 
     */
    public NVVP(String hoten, String diachi, String gioitinh, int namsinh, int sonamcongtac,
            double hesoluong) {
        super(hoten, diachi, gioitinh, namsinh, sonamcongtac);
        this.hesoluong = hesoluong;
    }// end NVVP(String hoten, String diachi, int namsinh, int sonamcongtac, double
     // hesoluong)

    /**
     * phương thức lấy thuộc tính hệ số lương
     * 
     * @return double
     */
    public double getHesoluong() {
        return this.hesoluong;
    }// end getHesoluong

    /**
     * phương thức thiết lập thuộc tính số hệ số lương
     * 
     * @param hesoluong hệ số lương
     */
    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }// end setHesoluong

    /**
     * phương thức tính phụ cấp
     * 
     * @return double
     */
    private double phuCap() {
        double phucap = 0;
        if (this.sonamcongtac < 10)
            phucap = this.luongcoban * 1d;
        else
            phucap = this.luongcoban * 1.2;

        return phucap;

    }// end phuCap

    /**
     * phương thức tính lương
     * 
     * @return double
     */
    @Override
    public double luong() {
        double luong = this.hesoluong * this.luongcoban + phuCap();
        return luong;

    }// end luong

    /**
     * phương thức lấy dữ liệu class NVVP
     */
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\the so luong: " + this.hesoluong;
    }// end toString

}// end class NVVP
