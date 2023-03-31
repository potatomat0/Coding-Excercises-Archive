package lab3;

import java.util.Scanner;

/**
 * Đề: Kiểm tra số nguyên tố
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 * 
 */

public class Bai8_while {
    // khởi động chương trình
    public static void main(String[] args) {
        // khai báo biến
        long n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen can kiem tra:");
        // nhập biến
        n = scan.nextInt();
        // đóng class
        scan.close();
        // xử lý bài toán
        int u = 0, i = 1;
        // vòng lặp while
        while (i <= Math.sqrt(n)) {
            i++;
            if (n % i == 0) {
                u++;
                break;
            }
        }
        // in kết quả ra màn hình
        if (u == 1)
            System.out.println(n + " khong phai la so nguyen to.");
        else
            System.out.println(n + " la so nguyen to.");
    }

}
