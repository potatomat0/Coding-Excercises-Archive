package lab3;

import java.util.Scanner;

/**
 * Đề: Kê các ước số của một số nguyên dương
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class Bai1_do_while {

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
        int i = 0;
        // in ra kết quả
        System.out.printf("Cac uoc so cua %d la: ", n);
        // ====Lặp while
        do {
            i++;
            if (n % i == 0) {
                if (i == n)
                    System.out.println(n + ".");
                else
                    System.out.print(i + ", ");
            }
        } while (i <= n - 1);
    } // end main
} // end class