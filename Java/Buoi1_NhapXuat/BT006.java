package Buoi1_NhapXuat;

import java.util.Scanner;

public class BT006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hay nhap nhiet do F can chuyen doi: ");
        double f = input.nextDouble();
        double c = (double) (f - 32) * 5 / 9;
        System.out.println("Nhiet do C la: " + c);
        input.close();
    }

}
