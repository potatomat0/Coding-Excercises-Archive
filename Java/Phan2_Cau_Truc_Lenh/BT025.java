package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: Tìm ước chung lớn nhất của hai số nguyên dương.
 * 
 * @date 13/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class BT025 {

    // khởi động chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao hai so nguyen duong: ");
        // khai báo biến
        long a, b, ucln = 1;
        // nhập dữ liệu
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close(); // đóng class
        // Xử lý chương trình
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 & b % i == 0) {
                ucln = i;
            }
        }
        // in ra kết quả
        System.out.printf("Uoc chung lon nhat cua %d va %d la %d", a, b, ucln);
    } // kết thúc main

} // kết thúc class
