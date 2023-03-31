package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: Tìm ước chung lớn nhất của hai số nguyên dương.
 * 
 * @date 13/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 *     Phân tích:
 *     input: a,b
 *     process: while a=!b
 *     if a>b, a=a-b
 *     else b=b-a
 *     output: a or b
 */

public class BT025_cach2 {

    // khởi động chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao hai so nguyen duong: ");
        // khai báo biến
        long a, b;
        // nhập biến
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close(); // đóng class
        // Xử lý chương trình
        while (a != b) { // lặp lại các câu lệnh bên trong cho đến khi giá trị a = b
            if (a > b) // nếu a>b, a=a-b
                a = a - b;
            else // nếu b>a, b=b-a
                b = b - a;
        }
        // in ra kết quả
        System.out.printf("Uoc chung lon nhat la %d", a);
    }// đóng main

}// đóng class
