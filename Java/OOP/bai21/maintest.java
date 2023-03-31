package bai21;

import java.util.Scanner;

/**
 * main test quan li thu vien
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 4/7/2022
 * 
 */

public class maintest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QLMS qlms = new QLMS();

        System.out.println("------------------------------OPITONS-------------------------------");
        System.out.println("-              0.thoat chuong trinh                                -");
        System.out.println("-              1.nhap.                                             -");
        System.out.println("-              2.xuat.                                             -");
        System.out.println("-              3.thong ke ban doc .                                -");
        System.out.println("-              4.thong ke sach         .                           -");
        System.out.println("--------------------------------------------------------------------");

        do {
            System.out.print("MOI CHON CHUC NANG: ");
            int n = sc.nextInt();
            switch (n) {

                case 0:
                    System.exit(0);

                case 1:
                    qlms.nhap();
                    break;

                case 2:
                    qlms.xuat();
                    break;

                case 3:
                    qlms.thongkebandoc(6, 12, 2022);
                    break;

                case 4:
                    qlms.thongkesach(6, 12, 2022);
                    break;

                default:
                    System.out.print("chuc năng khong ton tai! ");
                    break;

            }
        } while (true);

    }// end main

}// end class
