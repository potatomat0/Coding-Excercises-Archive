package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: nhập vào số nguyên n, tính n!.
 * 
 * @date 13/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class BT028 {

    // khởi động chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao mot so nguyen duong: ");
        // khai báo biến
        long a, u = 1;
        // nhập biến
        a = sc.nextInt();
        sc.close(); // đóng class
        // xử lý bài toán
        for (long i = a; i >= 1; i--) {
            u *= i;
        }
        // in kết quả ra màn hình
        System.out.printf("%d!=%d", a, u);
    } // đóng main
      // kết thúc chương trình
}