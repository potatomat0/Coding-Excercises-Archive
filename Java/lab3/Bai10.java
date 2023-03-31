package lab3;

import java.util.Scanner;

/**
 * Đề: Kiểm tra số chính phương
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class Bai10 {
    // khởi động chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khai báo biến
        double a;
        System.out.println("Hay nhap vao mot so nguyen duong: ");
        // nhập biến
        a = sc.nextInt();
        // xử lý chương trình và in ra kết quả
        double b = Math.sqrt(a);
        if (b - Math.floor(b) == 0)
            System.out.println((long) a + " la mot so chinh phuong.");
        else
            System.out.println((long) a + " khong phai la mot so chinh phuong.");
        // đóng lớp Scanner
        sc.close(); // đóng scanner
        // Đóng main
    }
    // đóng class
}
