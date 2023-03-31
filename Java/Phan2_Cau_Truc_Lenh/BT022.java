package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: nhập ba số nguyên dương, xem chúng có thể tạo thành một tam giác hay
 * không, tam giác đó là tam giác loại gì
 * 
 * @date 11/12/2021
 * @author Hoàng Minh Nhật
 * @id 501210710
 *     Phân tích:
 *     input: a,b,c là số nguyên dương
 *     process: Nếu: tổng độ dài hai cạnh lớn hơn cạnh còn lại=>> có thể tạo
 *     thành tam giác
 *     Nếu: bình phương cạnh lớn nhất bằng tổng bình phương hai cạnh còn lại=>>
 *     tạo thành tam giác vuông
 *     Nếu: trong tam giác vuông hai cạnh nhỏ hơn bằng nhau=>> tam giác vuông
 *     cân
 *     Nếu: Hai cạnh bằng nhau=>> tam giác cân
 *     Nếu: Ba cạnh bằng nhau=>> tam giác đều
 *     Output: loại tam giác
 * 
 */

public class BT022 {
    // Khởi động chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Khai báo biến
        long a, b, c;
        System.out.println("Nhap 3 so nguyen duong: ");
        // Nhập vào các biến
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        // xử lý chương trình
        if ((a + b > c) || (a + c > b) || (b + c > a))
            System.out.println("Ba so co the tao tam giac");
        long max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        long min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        long mid = a + b + c - max - min;
        if ((max * max) == (min * min) + (mid * mid))
            // in ra kết quả
            System.out.println("Ba so co the tao thanh tam giac vuong");
        if (min == max && max == mid)
            System.out.println("Ba so co the tao thanh tam giac deu");
        if (max * max == mid * mid * 2 || min == mid)
            System.out.println("Ba so co the tao thanh tam giac vuong can");
        if (mid == max & mid > min || mid == min & mid < max)

            System.out.println("Ba so co the tao thanh tam giac can");
        else
            System.out.println("Ba so khong the tao tam giac");
        // tắt class
        sc.close();

    } // tắt main
}
