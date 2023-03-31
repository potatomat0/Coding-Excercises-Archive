package Buoi1_NhapXuat;

import java.util.Scanner; // nhập lớp Scanner

public class BT010 {
    // khởi động chương trình
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // tên lớp Scanner là "input"
        System.out.println("Hay nhap vao 4 so nguyen: "); // yêu cầu nhập
        // Nhập và xử lý biến
        int a = input.nextInt(); // gán giá trị nhập vào cho từng biến
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        double x = (double) (a + b + c + d) / 4; // tính trung bình cộng
        // In kết quả ra màn hình
        System.out.println("Trung binh cong cua 4 so bang: " + x); // in ra kết quả
        input.close(); // đóng lớp Scanner

    }
}// kết thúc chương trình
