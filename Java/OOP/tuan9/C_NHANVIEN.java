package tuan9;

/**
 * Xây dựng lớp trừu tượng nhân viên gồm các thuộc tính chung họ tên,đại chỉ,
 * năm sinh, lương cơ bản=9500000, lương
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 28/6/2022
 */
public class C_NHANVIEN implements c_interfacenhanvien {

    // các thuộc
    // tính-----------------------------------------------------------------------------
    protected String hoten;
    protected String diachi;
    protected String gioitinh;
    protected int namsinh;
    protected double luongcoban = 9500000;
    protected int sonamcongtac = 0;

    // các phương
    // thức----------------------------------------------------------------------------------

    /**
     * Phương thức khởi tạo không truyền tham số
     * 
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         sonamcongtac=0; hoten,diachi,gioitinh,namsinh=null;
     */
    public C_NHANVIEN() {

    }// end C_C_NHANVIEN()

    /**
     * phương thức khởi tạo truyền tham số họ tên
     * 
     * @param hoten họ và tên
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         sonamcongtac=0; diachi,gioitinh,namsinh=null;
     */
    public C_NHANVIEN(String hoten) {
        this.hoten = hoten;
    }// end C_C_NHANVIEN(String hoten)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi
     * 
     * @param hoten  họ và tên
     * @param diachi địa chỉ
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         sonamcongtac=0; gioitinh,namsinh=null;
     */
    public C_NHANVIEN(String hoten, String diachi) {
        this.hoten = hoten;
        this.diachi = diachi;
    }// end C_NHANVIEN(String hoten, String diachi)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi,gioitinh
     * 
     * @param hoten    họ và tên
     * @param diachi   địa chỉ
     * @param gioitinh giới tính
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         sonamcongtac=0; namsinh=null;
     */
    public C_NHANVIEN(String hoten, String diachi, String gioitinh) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }// end C_NHANVIEN(String hoten, String diachi, String gioitinh)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi, namsinh
     * 
     * @param hoten    họ và tên
     * @param diachi   địa chỉ
     * @param gioitinh giới tính
     * @param namsinh  năm sinh
     * @hidden giá trị mặc định: luongcoban=9500000;
     *         sonamcongtac=0;
     */
    public C_NHANVIEN(String hoten, String diachi, String gioitinh, int namsinh) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
    }// end C_NHANVIEN(String hoten, String diachi, int namsinh)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi, namsinh, luongcoban
     * 
     * @param hoten      họ và tên
     * @param diachi     địa chỉ
     * @param gioitinh   giới tính
     * @param namsinh    năm sinh
     * @param luongcoban lương cơ bản
     * @hidden giá trị mặc định sonamcongtac=0
     */
    public C_NHANVIEN(String hoten, String diachi, String gioitinh, int namsinh, int sonamcongtac) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
        this.sonamcongtac = sonamcongtac;
    }// end C_NHANVIEN(String hoten, String diachi, int namsinh, double luongcoban)

    /**
     * phương thức khởi tạo truyền tham số hoten,diachi, namsinh,
     * luongcoban,sonamcongtac
     * 
     * @param hoten        họ và tên
     * @param diachi       địa chỉ
     * @param gioitinh     giới tính
     * @param namsinh      năm sinh
     * @param luongcoban   lương cơ bản
     * @param sonamcongtac số năm công tác
     */
    public C_NHANVIEN(String hoten, String diachi, String gioitinh, int namsinh, int sonamcongtac, double luongcoban) {
        this.hoten = hoten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.namsinh = namsinh;
        this.luongcoban = luongcoban;
        this.sonamcongtac = sonamcongtac;
    }// end C_NHANVIEN(String hoten, String diachi, int namsinh, double luongcoban,
     // int
     // sonamcongtac)

    /**
     * phương thức thiết lập thuộc tính hoten
     * 
     * @param hoten họ và tên
     */
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }// end setHoten

    /**
     * phương thức lấy thuộc tính hoten
     * 
     * @return String
     */
    public String getHoten() {
        return this.hoten;
    }// end getHoten

    /**
     * phương thức thiết lập thuộc tính diachi
     * 
     * @param diachi địa chỉ
     */
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }// end setDiachi

    /**
     * phương thức lấy thuộc tính diachi
     * 
     * @return String
     */
    public String getDiachi() {
        return this.diachi;
    }// end getDiachi

    /**
     * phương thức lấy thuộc tính gioitinh
     * 
     * @return String
     */
    public String getGioitinh() {
        return this.gioitinh;
    }// end getGioitinh

    /**
     * phương thức thiết lập thuộc tính gioitinh
     * 
     * @param gioitinh giớ tính
     */
    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }// end setGioitinh

    /**
     * phương thức thiết lập thuộc tính namsinh
     * 
     * @param namsinh năm sinh
     */
    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }// end setNamsinh

    /**
     * phương thức lấy thuộc tính namsinh
     * 
     * @return int
     */
    public int getNamsinh() {
        return this.namsinh;
    }// end getNamsinh

    /**
     * phương thức thiết lập thuộc tính luongcoban
     * 
     * @param luongcoban lương cơ bản
     */
    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }// end setLuongcoban

    /**
     * phương thức lấy thuộc tính luongcoban
     * 
     * @return double
     */
    public double getLuongcoban() {
        return this.luongcoban;
    }// end getLuongcoban

    /**
     * phương thức lấy thuộc tính luongcoban
     * 
     * @return int
     */
    public int getSonamcongtac() {
        return this.sonamcongtac;
    }// end getSonamcongtac

    /**
     * phương thức thiết lập thuộc tính luongcoban
     * 
     * @param sonamcongtac số năm công tác
     */
    public void setSonamcongtac(int sonamcongtac) {
        this.sonamcongtac = sonamcongtac;
    }// ebd setSonamcongtac

    @Override
    public double luong() {
        return 0;
    }

    /**
     * phuong thức lấy dữ liệu lop C_NHANVIEN
     */
    @Override
    public String toString() {
        return "ho ten: " + hoten + "\t dia chi:  " + diachi + "\tgioi tinh: " + gioitinh + "\t nam sinh: " + namsinh
                + "\tluong: " + luong();
    }// end toString
}// end class C_NHANVIEN
