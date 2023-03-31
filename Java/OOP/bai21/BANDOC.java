package bai21;

/**
 * xây dựng lớp bạn đọc với thuộc tính số diện thoại và các thuộc tính kế thừa
 * lớp thư viện
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 4/7/2022
 * 
 */
public class BANDOC extends THUVIEN {
    // các thuộc
    // tính---------------------------------------------------------------------------
    private String sodienthoai = "null";

    // các phương
    // thức---------------------------------------------------------------------

    /**
     * phương thức khởi tạo không truyền tham số
     */
    public BANDOC() {
        super();

    }// end bandoc()

    /**
     * phương thức khởi tạo truyền tham số ma
     * 
     * @param ma mã bạn đọc
     */
    public BANDOC(String ma) {
        super(ma);

    }// end bandoc(String ma)

    /**
     * phương thức khởi tạo truyền tham số mã và tên
     * 
     * @param ma  mã bạn đọc
     * @param ten tên bạn đọc
     */
    public BANDOC(String ma, String ten) {
        super(ma, ten);

    }// end bandoc(String ma, String ten)

    /**
     * phương thức khởi tạo truyền tham số mã, tên và số diện thoại
     * 
     * @param ma          mã bạn đọc
     * @param ten         tên bạn đọc
     * @param sodienthoai số diện thoại
     */
    public BANDOC(String ma, String ten, String sodienthoai) {
        super(ma, ten);
        this.sodienthoai = sodienthoai;
    }

    /**
     * phương thức lấy thuộc tính số diện thoại
     * 
     * @return String
     */
    public String getSodienthoai() {
        return sodienthoai;
    }// end getSodienthoai

    /**
     * phương thức thiết lập thuộc tính số điện thoại
     * 
     * @param sodienthoai số điện thoại
     */
    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }// end setSodienthoai

    /**
     * phương thức lấy tất cả thuộc tính lớp bandoc
     */
    @Override
    public String toString() {
        return "\t\tMaBandoc: " + ma + "\tTenBandoc: " + ten + "\tSoDienThoai: " + sodienthoai;
    }// end toString

}// end class
