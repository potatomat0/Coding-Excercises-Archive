package tuan9;

import java.util.Scanner;

/**
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 28/6/2022
 */
public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("moi nhap so luong nhan vien toi da: ");
        int n = sc.nextInt();
        sc.nextLine();
        C_QLNV quanlinv = new C_QLNV(n);

        System.out.println("------------------------------OPITONS-------------------------------");
        System.out.println("-              0.thoat chuong trinh                                -");
        System.out.println("-              1.nhap.                                             -");
        System.out.println("-              2.xuat.                                             -");
        System.out.println("-              3.tim kiem theo ten.                                -");
        System.out.println("-              4.hien thi theo nam sinh.                           -");
        System.out.println("-              5.hien thi theo luong.                              -");
        System.out.println("-              6.Đếm theo nam sinh va dia chi.                     -");
        System.out.println("--------------------------------------------------------------------");

        do {
            System.out.print("moi nhap lua chon chuc nang: ");
            int x = sc.nextInt();
            sc.nextLine();
            switch (x) {
                case 0:
                    System.exit(0);
                case 1:
                    quanlinv.nhap();

                    break;
                case 2:
                    quanlinv.xuat();

                    break;

                case 3:
                    System.out.print("nhap ten tim kiem: ");
                    String fullname = sc.nextLine();
                    quanlinv.timKiemTheoTen(fullname);

                    break;

                case 4:
                    System.out.print("nhap nam sinh: ");
                    int namsinh = sc.nextInt();
                    sc.nextLine();
                    quanlinv.hienThiTheoNamSinh(namsinh);
                    ;

                    break;
                case 5:
                    System.out.print("nhap luong: ");
                    double luong = sc.nextDouble();
                    sc.nextLine();
                    quanlinv.hienThiTheoLuong(luong);

                    break;

                case 6:
                    System.out.print("nhap dia chi: ");
                    String diachi = sc.nextLine();
                    System.out.print("nhap nam sinh: ");
                    namsinh = sc.nextInt();
                    sc.nextLine();
                    quanlinv.demSLNamsinhDiaChi(diachi, namsinh);
                    break;

                default:
                    System.out.print("khong co chuc nang nay, xin hay nhap lai: ");

            }
        } while (true);

    }// end main
}// end class
