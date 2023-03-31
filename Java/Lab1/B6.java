package Lab1;

/**
 * Đề bài: Viết chương trình nhập vào độ dài 2 cạnh của hình chữ nhật. Tính chu vi và diện 
 * tích hình chữ nhật.
 * @date 4/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

import java.util.Scanner; //nhập lớp Scanner

public class B6 {
    public static void main(String[] args) { // khởi động chương trình
        Scanner input = new Scanner(System.in); // tạo tên mới cho lớp Scanner
        System.out.println("Hay nhap chieu dai hinh chu nhat: "); // yêu cầu người dùng nhập số
        int x = input.nextInt(); // giá trị chiều dài mang tên x
        System.out.println("Hay nhap chieu rong hinh chu nhat: ");
        int y = input.nextInt(); // giá trị chiều rộng mang tên y
        int a = x * y; // tính diện tíhc
        int b = (x + y) * 2; // tính chu vi
        System.out.println("Dien tich hinh chu nhat bang: " + a); // in ra kết quả
        System.out.println(" Chu vi hinh chu nhat bang: " + b);
        input.close(); // Đóng lớp Scanner tên "input" lại
    }

} // kết thúc chương trình
