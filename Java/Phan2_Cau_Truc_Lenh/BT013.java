package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề bài: Hãy nhập 3 số nguyên, tìm max.
 * 
 * @date 11/12/2021
 * @author Hoàng Minh Nhật
 * @id 501210710
 */
public class BT013 {
    public static void main(String[] args) {
        // sử dụng class Scanner
        Scanner input = new Scanner(System.in);
        // Khai báo các biến
        int a, b, c;
        System.out.println("Hay nhap ba so nguyen: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        // Xử lý
        // Tìm số lớn nhất
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        input.close();
        // Xuất kết quả
        System.out.println(max + " La so lon nhat.");
    }
}
