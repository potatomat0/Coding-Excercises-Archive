package lab3;

import java.util.Scanner;

/**
 * Đề: đếm số ước số của một số nguyên dương nhập vào.
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class Bai3_do_while {

    // khởi động chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao mot so nguyen duong: ");
        // khai báo biến
        long n;
        // nhập biến
        n = sc.nextInt();
        sc.close(); // đóng class
        // xử lý bài toán
        long Dem = 0, i = 0;
        // ====Lặp do while
        do {
            i++;
            if (n % i == 0)
                Dem++;
        } while (i <= n - 1);
        // in ra kết quả
        System.out.printf("%d co %d uoc so", n, Dem);
    } // end main
} // end class