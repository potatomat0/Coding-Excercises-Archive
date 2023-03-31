package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

/**
 * Đề: Tính cấp số cộng s(n)=((-1)^(n+1))*n
 * 
 * @date 13/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class BT031 {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap so nguyen n: ");
            n = sc.nextInt();
            sc.close();
        } while (n < 1);
        // xử lý chương trình
        int s = 0;
        // vòng lặp for
        for (int i = 1; i <= n; i++) {
            // số chẵn thì trừ
            if (i % 2 == 0) {
                s -= i;
            } else {
                // số lẻ thì cộng
                s += i;
            }
        }
        // in kết quả ra màn hình
        System.out.println("Ket qua cua cap so cong bang = " + s);
    }// end main

} // end class