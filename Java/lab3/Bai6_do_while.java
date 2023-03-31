package lab3;

import java.util.Scanner;

/**
 * Đề: Tính tổng các ước số nhỏ hơn số nhập vào
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class Bai6_do_while {
    // khởi động chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khai biến
        long n;
        System.out.println("Hay nhap mot so nguyen: ");
        // nhập biến
        n = sc.nextInt();
        sc.close(); // đóng class
        // xử lý bài toán
        long sum = 0, i = 0;
        // in ra kết quả
        System.out.printf("Tong cac uoc so cua %d la: ", n);
        // vòng lặp do while
        do {
            i++;
            if (n % i == 0) {
                if (n % i == 0) {
                    if (i == n)
                        System.out.print("");
                    else
                        System.out.print(i + " + ");
                }
                sum = sum + i;
            }
        } while (i < n - 1);
        // in sum ra màn hình
        System.out.print("= " + sum);
    } // đóng main
} // kết thúc class
