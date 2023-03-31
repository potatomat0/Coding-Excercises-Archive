package bai2;

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
        ptbac2 ptbac2 = new ptbac2();
        Scanner sc = new Scanner(System.in);
        // Nhập a,b
        System.out.println("Nhap gia tri a: ");
        ptbac2.setA(sc.nextDouble());
        System.out.println("Nhap gia tri b: ");
        ptbac2.setB(sc.nextDouble());
        System.out.println("Nhap gia tri c: ");
        ptbac2.setC(sc.nextDouble());
        // giải bài toán
        ptbac2.giaiPT2();
        sc.close();
    } // kết thúc class
} // kết thúc main
