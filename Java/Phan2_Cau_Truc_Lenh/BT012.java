package Phan2_Cau_Truc_Lenh;

import java.util.Scanner;

public class BT012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hay nhap 2 so nguyen: ");
        int a = input.nextInt();
        int b = input.nextInt();
        if (a > b) {
            System.out.println(a + " la so lon hon");
        } else {
            System.out.println(b + " la so lon hon");
        }
        input.close();
    }
}
