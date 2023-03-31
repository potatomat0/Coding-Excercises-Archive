package lab3;

import java.util.Scanner;

/**
 * Đề: Kiểm tra một số nguyên nhập vào có phải là số hoàn thiện không
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class Bai9_for {
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
        for (long i = 1; i < n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }
        // in kết quả ra màn hình
        if (sum == n)
            System.out.printf("%d la mot so hoan thien.", n);
        else
            System.out.printf("%d khong phai la mot so hoan thien", n);
    } // đóng main
} // kết thúc class
