package lab3;

import java.util.Scanner;

/**
 * Đề: Xuất ra ước số lẻ lớn nhất của một số nguyên nhập vào
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class Bai7_for {

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
        long max = 0;
        // ====Lặp for
        for (int i = 1; i <= n; i++) { // lặp lại phép toán bên dưới cho đến khi i=a, i bắt đầu bằng 1, giá trị tăng
                                       // dần theo từng lần lặp
            if (n % i == 0 && i % 2 != 0)
                max = i;
        }
        // in ra kết quả
        System.out.printf("uoc so le lon nhat cua %d la %d", n, max);
    } // end main
} // end class