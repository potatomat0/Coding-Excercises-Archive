package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: nhập vào số nguyên n, tính cap so cong s(n)
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class BT035 {

    // khởi động chương trình
    public static void main(String[] args) {
        // khai báo biến
        int n;
        Scanner sc;
        // nhập biến
        do {
            System.out.println("Hay nhap mot so nguyen duong n: ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        } while (n <= 0);
        // xử lý bài toán
        double p = 1;
        // vòng lặp for
        for (int i = 2; i <= n; i++) {
            p = p + Math.pow(i, i);
        }
        // xuất kết quả:
        System.out.println("Gia tri cua cap so cong la: " + p);
        sc.close(); // đóng scanner
    } // đóng main
} // đóng class