package Buoi1_NhapXuat;

import java.util.Scanner; //nhập lớp Scanner

public class BT009 {
    public static void main(String[] args) { // khởi động chương trình
        Scanner input = new Scanner(System.in);
        System.out.println("Hay nhap so thu nhat: "); // yêu cầu nhập số
        long x = input.nextInt(); // gán giá trị
        System.out.println("Hay nhap so thu hai: ");
        long y = input.nextInt();
        long t = x + y;
        long h = x - y;
        long tx = x * y;
        double th = x / y;
        System.out.println("Tong cua hai so la: " + t);
        System.out.println("Hieu cua 2 so la: " + h);
        System.out.println("Tich cua 2 so la: " + tx);
        System.out.println("Thuong cua 2 so la: " + th);
        input.close();
    }
}