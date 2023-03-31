package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: Giải và biện luận phương trình ax^4+bx^2+c
 * 
 * @date 11/12/2021
 * @author Hoàng Minh Nhật
 * @id 501210710
 */

public class BT017 {
    // Khởi động chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khai báo biến
        double a, b, c;
        System.out.println("Nhap gia tri a b va c cho phuong trinh bac 4: ");
        // Nhập vào các biến
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        // Xử lý bài toán
        double d = (b * b) - (4 * a * c);
        if (d > 0) {
            double x = (-b + Math.sqrt(d)) / (2 * a);
            double y = (-b - Math.sqrt(d)) / (2 * a);
            if (x >= 0) {
                System.out.println("Nghiem cua phuong trinh la: " + Math.sqrt(x) + ", " + -Math.sqrt(x));
            }
            if (y >= 0) {
                System.out.print("Nghiem cua phuong trinh la: " + Math.sqrt(y) + ", " + -Math.sqrt(y));
            }
            if (x < 0 && y < 0)
                System.out.println("Phuong trinh vo nghiem");
        } else {
            if (d == 0) {
                double x = -b / a * 2;

                if (x >= 0) {
                    double t = Math.sqrt(x);
                    System.out.println("Nghiem cua phuong trinh la: " + t + " va " + -t);
                } else
                    System.out.println("Phuong trinh vo nghiem");
            } else
                System.out.println("phuong trinh vo nghiem");
        }
        // Đóng class
        sc.close();
        // Đóng main
    }
    // Đóng chương trình
}
