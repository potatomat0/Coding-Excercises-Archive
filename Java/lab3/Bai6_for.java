package lab3;

import java.util.Scanner;

/**
 * Đề: Tính tổng các ước số chẵn
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class Bai6_for {
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
        long sum = 0;
        // in ra kết quả
        System.out.printf("Tong cac uoc so nho hon %d la: ", n);
        // vòng lặp for
        for (long i = 1; i < n; i++) {
            if (n % i == 0) {
                if (n % i == 0) {
                    if (i == n)
                        System.out.print("");
                    else
                        System.out.print(i + " + ");
                }
                sum = sum + i;
            }
        } // đóng lặp for
          // in sum ra màn hình
        System.out.printf("= %d", sum);
    } // đóng main
} // kết thúc class
