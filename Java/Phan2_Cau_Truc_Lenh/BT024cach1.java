package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: Kiểm tra số nguyên tố
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 * 
 */

public class BT024cach1 {
    // khởi động chương trình
    public static void main(String[] args) {
        // khai báo biến
        long a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen can kiem tra:");
        // nhập biến
        a = scan.nextInt();
        // đóng class
        scan.close();
        // xử lý bài toán
        int u = 0;
        // vòng lặp for
        for (long i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                u = u + 1;
                break;
            }
        }
        // in kết quả ra màn hình
        if (u == 1)
            System.out.println(a + " khong phai la so nguyen to.");
        else
            System.out.println(a + " la so nguyen to.");
    }

}
