package Buoi1_NhapXuat;

/**
 * @date: 11/12/2021
 * @author Hoang Minh Nhat
 * Đề bài: viết chương trình tính chu vi và diện tích hình tròn hình vuông hình tam giác và hình chữ nhật từ dữ liệu nhập vào
 */
import java.util.Scanner;

class BT011 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hay nhap chieu rong tam giac:");
        double chieurong = scanner.nextDouble();
        System.out.println("Hay nhap chieu cao tam giac:");
        double chieucao = scanner.nextDouble();
        double dientich = (chieucao * chieurong) / 2;
        System.out.println("Area of Triangle is: " + dientich);
        scanner.close();
    }
}
