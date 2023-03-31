package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: Giải và biện luận phương trình bậc 2 một ẩn
 * 
 * @date 11/12/2021
 * @author Hoàng Minh Nhật
 * @id 501210710
 */

public class BT016 {
    // Khởi động chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khai báo biến
        double a, b, c;
        System.out.println("Nhap gia tri a b va c cho phuong trinh bac 2: ");
        // Nhập vào các biến
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        // Xử lý bài toán
        // =============giải và biện luận pt bậc 1 nếu a=0===============
        if (a == 0) {
            if (b != 0) {
                double x = -c / b;
                System.out.println("Gia tri cua x la: " + x);
            } else {
                if (c != 0) {
                    System.out.println("Phuong trinh vo nghiem");
                }
                if (c == 0)
                    System.out.println("phuong trinh co vo so nghiem");
            }
        } // ============giải và biện luận pt bậc 2 nếu a khác 0=======================
        else {
            double d = (b * b) - (4 * a * c);
            if (d < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (d == 0) {
                double x = -b / a * 2;
                System.out.println("Phuong ttrinh co mot nghiem kep la: " + x);
            } else {
                double x = (-b + Math.sqrt(d)) / 2 * a;
                double y = (-b - Math.sqrt(d)) / 2 * a;
                System.out.println("Nghiem cua phuong trinh la: " + x + "va " + y);
            }

        }
        // Đóng class
        sc.close();
        // Đóng main
    }
    // Đóng chương trình
}
