package lab3;

import java.util.Scanner;

/**
 * Đề: Liệt kê các ước số của một số nguyên dương
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */
public class Bai1_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Bai báo biến
        long n;
        // Nhập biến
        System.out.println("Hay nhap mot so nguyen duong: ");
        n = sc.nextInt();
        sc.close();
        // Xử lý bài toán
        long i = 1;
        // ======in ra kết quả
        System.out.printf("Cac uoc so cua %d là: ", n);
        // vòng lặp while
        while (i <= n) {
            i++;
            if (n % i == 0) {
                if (i == n)
                    System.out.print(n + ".");
                else
                    System.out.print(i + ", ");
            }
        } // Đóng lặp
    } // đóng main
} // đóng class