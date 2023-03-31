package baiGiuaKy;

import java.util.Scanner;

/**
 * Lớp interface
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 16/7/2022
 * 
 */

public interface i_interface {

    /**
     * phương thức nhập thông tin
     * 
     * @param sc
     */
    public void nhapDanhSach(Scanner sc);

    /**
     * phương thức in danh sách
     */
    public void inDanhSach();

    /**
     * phương thức tìm thí sinh
     * 
     * @param sbd
     */
    public void timTS(int sbd);

    /**
     * phương thức lấy tất cả thuộc tính interface
     * 
     * @return
     */
    @Override
    String toString();
}
