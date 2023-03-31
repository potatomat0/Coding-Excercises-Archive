package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề bài: Hãy nhập 3 số nguyên, tìm max.
 * 
 * @date 11/12/2021
 * @author Hoàng Minh Nhật
 * @id 501210710
 */
public class BT014 {
    public static void main(String[] args) {
        // sử dụng class Scanner
        Scanner input = new Scanner(System.in);
        // Khai báo các biến
        int a, b, c;
        System.out.println("Hay nhap ba so nguyen: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        // Xử lý bài toán
        // Tìm min mid và max:
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        int min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        int mid = a + b + c - max - min;
        input.close();
        // Xuất ra kết quả và đóng lớp Scanner
        System.out.println("Thu tu sap xep tang dan la: " + min + " " + mid + " " + max);
        input.close();
    }

}
