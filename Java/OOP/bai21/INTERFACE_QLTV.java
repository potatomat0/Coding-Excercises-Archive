package bai21;

/**
 * interface QLMS
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 4/7/2022
 * 
 */
public interface INTERFACE_QLTV {
    /**
     * phương thức thống kê sách
     * 
     * @param tuthang  từ tháng
     * @param denthang đến tháng
     * @param nam      năm
     */
    public void thongkesach(int tuthang, int denthang, int nam);

    /**
     * phương thức thống kê bạn đọc
     * 
     * @param tuthang  từ tháng
     * @param denthang đến tháng
     * @param nam      năm
     */
    public void thongkebandoc(int tuthang, int denthang, int nam);

    /**
     * phương thức lấy tất cả thuộc tính interface
     * 
     * @return
     */
    @Override
    String toString();

}
