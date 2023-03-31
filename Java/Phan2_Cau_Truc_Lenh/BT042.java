package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: in ra chuỗi fibonacci
 * 
 * @date 24/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class BT042 {

    // khởi động chương trình
    public static void main(String[] args) {
        // khai báo biến
        int n;
        Scanner sc;
        // nhập biến
        do {
            System.out.println("Hay nhap thu tu cua so nam trong chuoi fibonacci: ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        } while (n <= 0);
        // xử lý bài toán
        long a = 1, b = 0, c = 0;
        // vòng lặp for
        for (int i = 1; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        // xuất kết quả
        System.out.printf("f(%d)=%d", n, c);
        sc.close(); // đóng scanner
    } // đóng main
} // đóng classclass BT042 {
