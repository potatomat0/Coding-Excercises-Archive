package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: Kiểm tra số chính phương
 * 
 * @date 4/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 *     Phân tích:
 *     input: a
 *     process: nếu hiệu căn bậc 2 của a với số làm tròn gần nhất của nó =0 thì
 *     a là số chính phương, nếu không thì a không phải.
 *     output: loại số của a (chính phương/không chính phương)
 */

public class BT023 {
    // khởi động chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khai báo biến
        double a;
        System.out.println("Hay nhap vao mot so nguyen duong: ");
        // nhập biến
        a = sc.nextInt();
        // xử lý chương trình và in ra kết quả
        double b = Math.sqrt(a);
        if (b - Math.floor(b) == 0)
            System.out.println((long) a + " la mot so chinh phuong.");
        else
            System.out.println((long) a + " khong phai la mot so chinh phuong.");
        // đóng lớp Scanner
        sc.close();
        // Đóng main
    }
    // đóng chương trình
}
