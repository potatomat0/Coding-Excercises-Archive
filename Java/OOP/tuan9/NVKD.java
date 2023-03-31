package tuan9;

/**
 * xây dựng lớp nhân viên kinh doanh kế thừa các thuộc tính từ class NHANVIEN
 * thêm các thuộc tính riêng doanh thu,phần trăm hoa hồng
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 9/6/2022
 */
public class NVKD extends C_NHANVIEN {

    // các thuộc
    // tính----------------------------------------------------------------------------------------------
    private double doanhthu = 0;
    private double phantramhoahong = 0;

    // các phương
    // thức----------------------------------------------------------------------------------------

    /**
     * phương thức khởi tạo không truyền tham số
     * 
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         hoten,diachi,gioitinh,namsinh=null;doanhthu=0;phantramhoahong=0;
     */
    public NVKD() {
        super();
    }// end NVKD()

    /**
     * phương thức khởi tạo truyền tham số hoten
     * 
     * @param hoten họ và tên
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         diachi,gioitinh,namsinh=null;doanhthu=0;phantramhoahong=0;
     */
    public NVKD(String hoten) {
        super(hoten);
    }// end NVKD(String hoten)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi
     * 
     * @param hoten  họ và tên
     * @param diachi địa chỉ
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         gioitinh,namsinh=null;doanhthu=0;phantramhoahong=0;
     */
    public NVKD(String hoten, String diachi) {
        super(hoten, diachi);
    }// end NVKD(String hoten, String diachi)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi,gioitinh
     * 
     * @param hoten    họ và tên
     * @param diachi   địa chỉ
     * @param gioitinh giới tính
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         namsinh=null;doanhthu=0;phantramhoahong=0;
     */
    public NVKD(String hoten, String diachi, String gioitinh) {
        super(hoten, diachi, gioitinh);
    }// end NVKD(String hoten, String diachi, String gioitinh)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi,gioitinh, namsinh
     * 
     * @param hoten    họ và tên
     * @param diachi   địa chỉ
     * @param gioitinh giới tính
     * @param namsinh  năm sinh
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         doanhthu=0;phantramhoahong=0;
     */
    public NVKD(String hoten, String diachi, String gioitinh, int namsinh) {
        super(hoten, diachi, gioitinh, namsinh);
    }// end NVKD(String hoten, String diachi,String gioitinh, int namsinh)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi, gioitinh, namsinh, doanhthu
     * 
     * @param hoten    họ và tên
     * @param diachi   địa chỉ
     * @param gioitinh giới tính
     * @param namsinh  năm sinh
     * @param doanhthu doanh thu
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         phantramhoahong=0;
     */
    public NVKD(String hoten, String diachi, String gioitinh, int namsinh, double doanhthu) {
        super(hoten, diachi, gioitinh, namsinh);
        this.doanhthu = doanhthu;
    }// end NVKD(String hoten, String diachi, int namsinh, double doanhthu)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi,gioitinh, namsinh,
     * doanhthu,phantramhoahong
     * 
     * @param hoten           họ và tên
     * @param diachi          địa chỉ
     * @param gioitinh        giới tính
     * @param namsinh         năm sinh
     * @param doanhthu        doanh thu
     * @param phantramhoahong phần trăm hoa hồng
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         luong=0;
     */
    public NVKD(String hoten, String diachi, String gioitinh, int namsinh, double doanhthu, double phantramhoahong) {
        super(hoten, diachi, gioitinh, namsinh);
        this.doanhthu = doanhthu;
        this.phantramhoahong = phantramhoahong;
    }// end NVKD(String hoten, String diachi,String gioitinh int namsinh, double
     // doanhthu, double
     // phantramhoahong)

    /**
     * phương thức lấy thuộc tính doanh thu
     * 
     * @return double
     */
    public double getDoanhthu() {
        return this.doanhthu;
    }// end getDoanhthu

    /**
     * phương thức thiết lập thuộc tính doanh thu
     * 
     * @param doanhthu doanh thu
     */
    public void setDoanhthu(double doanhthu) {
        this.doanhthu = doanhthu;
    }// end setDoanhthu

    /**
     * phương thức lấy thuộc tính phần trăm hoa hồng
     * 
     * @return double
     */
    public double getPhantramhoahong() {
        return this.phantramhoahong;
    }// end getPhantramhoahong

    /**
     * phương thức thiết lập thuộc tính phần trăm hoa hồng
     * 
     * @param phantramhoahong phần trăm hoa hồng
     */
    public void setPhantramhoahong(double phantramhoahong) {
        this.phantramhoahong = phantramhoahong;
    }// end setPhantramhoahong

    /**
     * phương thức tính thưởng
     * 
     * @return double
     */
    private double thuong() {
        double thuong = this.doanhthu * this.phantramhoahong;
        return thuong;
    }// end thuong

    /**
     * phương thức tính lương
     * 
     * @return double
     */
    @Override
    public double luong() {
        double luong = this.luongcoban + thuong();
        return luong;
    }// end luong

    /**
     * phương thức lấy dữ liệu class NVKD
     */
    @Override
    public String toString() {
        return super.toString() + "\tdoanh thu: " + this.doanhthu + "\tphan tram hoa hong: " + this.phantramhoahong;
    }// end toString

}// end class NVKD
