package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: nhập vào số nguyên n, tính cap so cong s(n)
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class BT040 {

    // khởi động chương trình
    public static void main(String[] args) {
        // khai báo biến
        int n, x;
        Scanner sc;
        // nhập biến
        do {
            System.out.println("Hay nhap mot so nguyen duong n: ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
            System.out.printf("Hay nhap so mu cua %d: ", n);
            x = sc.nextInt();
        } while (n <= 0);
        // xử lý bài toán
        for (int i = 1; i < x; i++) {
            n *= x;
        }
        // xuất kết quả:
        System.out.println("Gia tri cua cap so cong la: " + n);
        sc.close(); // đóng scanner
    } // đóng main
} // đóng class