package bai3;

import java.util.Scanner;

/**
 * @date 7/5/2022
 * @author Hoang Minh Nhat
 *         Đề bài: Viết một lớp giải phương trình bậc nhất cho phép người dùng
 *         nhập vào giá trị a, b.
 *         Hãy xây dựng theo hướng đối tượng lớp trên
 */
public class chinh {
    public static void main(String[] args) {

        // khởi tạo object
        Scanner sc = new Scanner(System.in);
        HCN cn = new HCN(4, 5);
        HTr tr = new HTr(3.4);
        Hth th = new Hth(3, 4, 3, 4, 5);
        TG tg = new TG(3, 4, 5);
        // gọi phương thức giải chu vi diện tích
        // ==HCN
        System.out.println("================================");
        System.out.println("Chu vi tam giac la: " + cn.tinhChuVi());
        System.out.println("Dien tich tam giac la: " + cn.tinhDienTich());
        // ===HTr
        System.out.println("================================");
        System.out.println("Chu vi hinh tron la: " + tr.tinhChuVi());
        System.out.println("Dien tich hinh tron la: " + tr.tinhDienTich());
        // ==HTh
        System.out.println("================================");
        System.out.println("Chu vi hinh thang la: " + th.tinhChuVi());
        System.out.println("Dien tich hinh thang la: " + th.tinhDienTich());
        /// ==TG
        System.out.println("================================");
        System.out.println("Chu vi hinh tam giac la: " + tg.tinhChuVi());
        System.out.println("Dien tich tam giac la: " + tg.tinhDienTich());
        sc.close();
    } // kết thúc main
} // kết thúc class
