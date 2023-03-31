package Phan3_Thu_Tuc_Ham;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        tong();
    }

    public static int tong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap mot so nguyen: ");
        int a = sc.nextInt();
        sc.close();
        System.out.println("So vua nhap la: " + a);

        return a;
    }

}
