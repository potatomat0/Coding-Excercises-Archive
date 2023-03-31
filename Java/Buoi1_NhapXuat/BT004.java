package Buoi1_NhapXuat;

/** Bai tap 4 Viết chương trình nhập vào 2 số nguyên dương a và b, cho biết kết quả chia lấy phần 
nguyên và phần dư của a với b.
* @Author Hoang Minh Nhat
* @Date Ngay 4/12/2021
*/
import java.util.Scanner;

public class BT004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        int num1 = input.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        int num2 = input.nextInt();
        int phanNg = num1 / num2;
        int phanDu = num1 % num2;
        System.out.println("Phan Nguyen la: " + phanNg);
        System.out.println("Phan du la: " + phanDu);
        input.close();
    }
}
