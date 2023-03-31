package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: nhập vào số nguyên n, tính cap so cong s(n)
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class BT033 {

    // khởi động chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khai báo biến
        long n;
        do {
            System.out.println("Hay nhap vao mot so nguyen n: ");
            // nhập biến
            n = sc.nextInt();
        } while (n < 0);
        sc.close();
        // xử lý bài toán
        long P = 1;
        for (int i = 2; i <= n; i++) {
            P += (i * i);
        }
        System.out.printf("Gia tri cua cap so cong la: %d", P);
    }
}