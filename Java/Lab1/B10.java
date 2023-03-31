package Lab1;

/**
 * Đề bài: viết chương trình cho phép nhập vào 4 số nguyên và tính giá trị trung bình của chúng
 * @date 4/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

import java.util.Scanner; // nhập lớp Scanner

public class B10 {
    public static void main(String[] args) { // khởi động chương trình
        Scanner input = new Scanner(System.in); // tên lớp Scanner là "input"
        System.out.println("Hay nhap vao 4 so nguyen: "); // yêu cầu nhập
        int a = input.nextInt(); // gán giá trị nhập vào cho từng biến
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int x = (a + b + c + d) / 4; // tính trung bình cộng
        System.out.println("Trung binh cong cua 4 so bang: " + x); // in ra kết quả
        input.close(); // đóng lớp Scanner

    } // kết thúc chương trình

}
