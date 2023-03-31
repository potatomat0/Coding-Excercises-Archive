package Buoi1_NhapXuat;

import java.util.Scanner; //nhập lớp Scanner

public class BT007 {
    public static void main(String[] args) { // khởi động chương trình
        Scanner input = new Scanner(System.in);
        System.out.println("Hay nhap gio: ");
        int x = input.nextInt(); // giá trị giờ sẽ mang tên x
        System.out.println("Hay nhap phut: ");
        int y = input.nextInt(); // giá trị phút sẽ mang tên y
        System.out.println("Hay nhap giay: ");
        int z = input.nextInt(); // giá trị giây sẽ mang tên z
        int a = x * 3600 + y * 60 + z; // tổng giá trị giờ phút và giây
        System.out.println("So giay cua gio la: " + a); // in ra kết quả
        input.close(); // đóng gói Scanner mang tên "input"
    }

}
