package lab3;

import java.util.Scanner;

/**
 * Đề: Liệt kê các ước số của một số nguyên dương
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */
public class Bai4_do_while {
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
        // vòng lặp do while
        do {
            i++;
            if (n % i == 0 && i % 2 != 0) {
                if (i == n || i == (n - 1))
                    System.out.print(n + ".");
                else
                    System.out.print(i + ", ");
            }
        } while (i <= n - 1);
    } // đóng main
} // đóng class