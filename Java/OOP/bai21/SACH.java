package bai21;

/**
 * xây dựng lớp sach có thuộc tính số lượng, nhà xuất bản và các thuộc tính kế
 * thừa từ lớp thuvien
 */
public class SACH extends THUVIEN {

    // các thuộc tính----------------------------------------------
    private int soluong;
    private String nxb;

    /**
     * phương thức khởi tạo khong truyen tham so
     */
    public SACH() {
    }// end SACH()

    /**
     * phương thức khởi tạo truyền tham số mã sách
     * 
     * @param ma mã sách
     */
    public SACH(String ma) {
        super(ma);
    }// end SACH(String ma)

    /**
     * phương thức khởi tạo truyền tham số mã sách, tên sách
     * 
     * @param ma  mã sách
     * @param ten tên sách
     */
    public SACH(String ma, String ten) {
        super(ma, ten);
    }// end SACH(String ma, String ten)

    /**
     * phương thức khởi tạo truyền tham số mã sách, tên sách, số lượng
     * 
     * @param ma      mã sách
     * @param ten     tên sách
     * @param soluong số lượng
     */
    public SACH(String ma, String ten, int soluong) {
        super(ma, ten);
        this.soluong = soluong;
    }// end SACH(String ma, String ten, int soluong)

    /**
     * phương thức khởi tạo truyền tham số mã sách, tên sách, số lượng, nhà xuất bản
     * 
     * @param ma      mã sách
     * @param ten     tên sách
     * @param soluong số lượng
     * @param nxb     nhà xuất bản
     */
    public SACH(String ma, String ten, int soluong, String nxb) {
        super(ma, ten);
        this.soluong = soluong;
        this.nxb = nxb;
    } // end SACH(String ma, String ten, int soluong, String nxb)

    /**
     * phương thức lấy thuộc tính số lượng
     * 
     * @return int
     */
    public int getSoluong() {
        return soluong;
    }// end getSoluong

    /**
     * phương thức thiết lập thuộc tính so luong
     * 
     * @param soluong
     */
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }// end setSoluong

    /**
     * phương thức lấy thuộc tính nhà xuất bản
     * 
     * @return String
     */
    public String getNxb() {
        return nxb;
    }// end getNxb

    /**
     * phương thức thiết lập thuộc tính nhà xuất bản
     * 
     * @param nxb nhà xuất bản
     */
    public void setNxb(String nxb) {
        this.nxb = nxb;
    }// end setNxb

    /**
     * phương thức lấy thuộc tính lớp sach
     */
    @Override
    public String toString() {
        return "\t\tMaSach: " + ma + "\tTenSach: " + ten + "\tSoLuong: " + this.soluong + "\tNhaXuatBan: " + this.nxb;
    }// end toString

}// end class
