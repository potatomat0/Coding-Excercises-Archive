package Buoi1_NhapXuat;

/** Bai tap 5: Viết chương trình nhập vào 2 số nguyên dương a và b, cho biết kết quả chia lấy phần 
nguyên và phần dư của a với b.
* @author Hoang Minh Nhat
* @date 4/12/2021
*/

import java.util.Scanner;

public class BT005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hay nhap mot so nguyen co hai chu so: ");
        int x = input.nextInt();
        int a = x / 10;
        int b = x % 10;
        int Tongab = a + b;
        System.out.println("Tong cua hai so don vi va hang chuc la: " + Tongab);
        input.close();
    }

}
