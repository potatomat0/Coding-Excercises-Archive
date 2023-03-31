package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: nhập vào số nguyên n, tính n!.
 * 
 * @date 13/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class BT030 {

    // khởi động chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khai báo biến
        long n, p = 0, u = 0;
        do {
            System.out.println("hay nhap vao mot so nguyen n: ");
            // nhập biến
            n = sc.nextInt();
        } while (n < 0);
        sc.close();
        while (u <= n) {
            p += (u * 2 + 1);
            u++;
        }
        System.out.printf("Gia tri cua cap so cong s(%d) la: %d", n, p);
    }
}