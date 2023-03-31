package Lab1;

/**
 * Đề bài: viết chương trình kiểm tra số nhập vào có phải là số dương không 
 * @date 4/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

import java.util.Scanner; // nhập vào lớp Scanner

public class B9 {
    public static void main(String[] args) { // khởi động chương trình
        Scanner input = new Scanner(System.in); // Tên mới của lớp Scanner là "Input"
        System.out.println("Hay nhap mot so nguyen: "); // yêu cầu nhập
        int a = input.nextInt(); // gán số nhập bằng a
        if (a >= 0) { // nếu a lớn hơn hoặc bằng 0
            System.out.println(a + " La so duong"); // thì in ra a la số dương
        } else { // ngược lại
            System.out.println(a + " La so am"); // thì in ra a là số âm
        }
        input.close(); // đóng lớp Scanner
    } // kết thúc chương trình

}