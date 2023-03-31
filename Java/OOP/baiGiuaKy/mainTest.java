package baiGiuaKy;

import java.util.Scanner;

/**
 * Các thí sinh dự thi đại học bao gồm các thí sinh thi khối A, thí sinh thi
 * khối B, thí sinh thi khối C
 * + Các thí sinh cần quản lý các thuộc tính: Số báo danh, họ tên, địa chỉ, ưu
 * tiên.
 * + Thí sinh thi khối A thi các môn: Toán, lý, hoá
 * + Thí sinh thi khối B thi các môn: Toán, Hoá, Sinh
 * + Thí sinh thi khối C thi các môn: văn, Sử, Địa
 * 1. Vẽ sơ đồ lớp thể hiện tính đa hình.
 * 2. Xây dựng lớp Quản lý tuyển sinh (TuyenSinh) gồm chức năng sau:
 * - Nhập thông tin về các thí sinh dự thi
 * - Xuất danh sách thí sinh theo từng khối
 * - Tìm kiếm theo số báo danh
 * - Tổng số thí sinh các khối
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 16/7/2022
 * 
 */

public class mainTest {
    public static void main(String[] args) {
        c_tuyensinh tuyensinh1 = new c_tuyensinh();

        Scanner sc = new Scanner(System.in);

        // sử dụng hàm nhập danh sách dự thi
        System.out.println("--------------------------------------------------");
        System.out.println("Hay nhap danh sach du thi cua thi sinh");
        tuyensinh1.nhapDanhSach(sc);
        System.out.println("\n");

        // sử dụng hàm tìm kiếm thí sinh
        System.out.println("------------------------------------------------");
        System.out.println("Thong tin cua so bao danh vua nhap la:");
        tuyensinh1.timTS(123);

        // sử dụng hàm in danh sách dự thi
        System.out.println("-------------------------------------------------");
        System.out.println("Nhung thi sinh du thi la");
        tuyensinh1.inDanhSach();
        System.out.println("\n");

    }
}
