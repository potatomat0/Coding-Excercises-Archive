package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: đếm số ước số của một số nguyên dương nhập vào.
 * 
 * @date 13/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class BT026cach2 {

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
        int Dem = 0, i = 0;
        // ====Lặp while
        while (i <= n) {
            i++;
            if (n % i == 0)
                Dem++;
        }
        // in ra kết quả
        System.out.printf("%d co %d uoc so", n, Dem);
    } // end main
} // end class