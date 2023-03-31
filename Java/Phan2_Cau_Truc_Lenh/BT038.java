package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: nhập vào số nguyên n, tính cap so cong s(n)
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class BT038 {

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
        double f = 1, s = 0, s2 = 0;
        // vòng lặp for
        for (int i = 1; i <= n; i++) {
            s2 += i;
            f *= i;
            s += (double) s2 / f;
        }
        // xuất kết quả:
        System.out.println("Gia tri cua cap so cong la: " + s);
        sc.close(); // đóng scanner
    } // đóng main
} // đóng class