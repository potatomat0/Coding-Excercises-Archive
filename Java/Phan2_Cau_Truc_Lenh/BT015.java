package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Giải và biêṇ luâṇ phương trình: ax + b = 0
 * 
 * @date 11/12/2021
 * @author Hoàng Minh Nhật
 * @id 501210710
 */

public class BT015 {
    // khởi động chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khai báo biến
        double a, b;
        System.out.println("Hay nhap gia tri a va b trong bieu thuc ax+b=0: ");
        // Nhập biến
        a = sc.nextInt();
        b = sc.nextInt();
        // Xử lý bài toán
        if (a != 0) {
            double x = -b / a;
            System.out.println("Gia tri cua x la: " + x);
        } else {
            if (b != 0) {
                System.out.println("Phuong trinh vo nghiem");
            }
            if (b == 0)
                System.out.println("phuong trinh co vo so nghiem");
        }
        sc.close(); // đóng class
    } // đóng main

} // đóng chương trình
