package bai1;

import java.util.Scanner;

/**
 * @date 7/5/2022
 * @author Hoang Minh Nhat
 *         Đề bài: Viết một lớp giải phương trình bậc nhất cho phép người dùng
 *         nhập vào giá trị a, b.
 *         Hãy xây dựng theo hướng đối tượng lớp trên
 */
public class chinh {
    public static void main(String[] args) {
        // khởi tạo object
        Scanner sc = new Scanner(System.in);
        // Nhập hai số a và b
        System.out.println("Nhập hai số a và b: ");
        ptbac1 ptbac1 = new ptbac1(sc.nextDouble(), sc.nextDouble());
        // giải bài toán
        ptbac1.giaiPT();
        sc.close();
    } // kết thúc main
} // kết thúc class
