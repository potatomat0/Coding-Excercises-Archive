package Phan2_Cau_Truc_Lenh;

import java.util.Scanner; //Nhập lớp Scanner trong gói java

/**
 * Đề: Nhập vào giờ phút giây, kiểm tra giờ phút giây có hợp lệ không, in kết
 * quả ra màn hình
 * 
 * @date 4/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class BT020 {
    // khởi động chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Sử dụng lớp Scanner mới có tên "Input"
        System.out.println("Hay lan luot gio phut va giay: ");
        // Khai bao bien
        long h, m, s;
        h = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        // Xu ly bai toan
        if (h > 24 || h < 0) {
            // in ra ket qua
            System.out.println("So gio khong hop le");
        }
        if (m > 60 || m < 0) {
            // in ra ket qua
            System.out.println("So phut khong hop le");
        }
        if (s > 60 || s < 0)
            // in ra ket qua
            System.out.println("So giay khong hop le");
        else
            // in ra ket qua
            System.out.println("Bay gio la " + h + " Gio " + m + " phut " + s + " Giay.");
        sc.close();
    }
}