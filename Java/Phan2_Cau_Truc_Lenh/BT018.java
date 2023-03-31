package Phan2_Cau_Truc_Lenh;

import java.util.Scanner; //Nhập lớp Scanner trong gói java

/**
 * Đề bài: Viết chương trình trích ra ba chữ số hàng trăm chục và đơn vị của một
 * số nhập vào và tìm số lớn nhất trong ba số đó
 * 
 * @date 4/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class BT018 {
    // khởi động chương trình
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Sử dụng lớp Scanner mới có tên "Input"
        System.out.println("Hay nhap mot so co ba chu so: ");
        // Khai báo các biến
        long a, b, c;
        // Xử lý
        // ===Xuất ra các số hàng trăm, chục và đơn vị
        long x = input.nextInt();
        a = x / 100;
        c = x % 10;
        b = (x - (a * 100 + c)) / 10;
        // ===Tìm số lớn nhất
        long max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        input.close();
        // Xuất kết quả
        if (a == max)
            System.out.println("So lon nhat thuoc hang tram");
        if (b == max)
            System.out.println("so lon nhat thuoc hang chuc");
        if (c == max)
            System.out.println("So lon nhat thuoc hang don vi");
        input.close(); // Đóng lớp
    } // end main

} // kết thúc chương trình