package CuoiKy;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class quanLyPhuongTien {
    private ArrayList<Xe> ds = new ArrayList<Xe>();

    public Xe nhapOto(Scanner sc) {
        System.out.print("Nhap hang san xuat: ");
        String hangSx = sc.nextLine();

        System.out.print("Nhap nam san xuat:");
        int namSX = sc.nextInt();

        System.out.print("Nhap gia xe:");
        double gia = sc.nextDouble();
        sc.nextLine();

        System.out.print("Nhap mau xe:");
        String mau = sc.nextLine();

        System.out.print("Nhap so cho ngoi:");
        int soCho = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap kieu dong co:");
        String kdc = sc.nextLine();

        return new Oto(hangSx, namSX, gia, mau, soCho, kdc);
    }

    public Xe nhapXeMay(Scanner sc) {
        System.out.print("Nhap hang san xuat: ");
        String hangSx = sc.nextLine();

        System.out.print("Nhap nam san xuat:");
        int namSX = sc.nextInt();

        System.out.print("Nhap gia xe:");
        double gia = sc.nextDouble();
        sc.nextLine();

        System.out.print("Nhap mau xe:");
        String mau = sc.nextLine();

        System.out.print("Nhap Cong Suat:");
        double congSuat = sc.nextDouble();
        sc.nextLine();

        return new XeMay(hangSx, namSX, gia, mau, congSuat);
    }

    public Xe nhapXeTai(Scanner sc) {
        System.out.print("Nhap hang san xuat: ");
        String hangSx = sc.nextLine();

        System.out.print("Nhap nam san xuat:");
        int namSX = sc.nextInt();

        System.out.print("Nhap gia xe:");
        double gia = sc.nextDouble();
        sc.nextLine();

        System.out.print("Nhap mau xe:");
        String mau = sc.nextLine();

        System.out.print("Nhap trong tai cua xe:");
        double trongTai = sc.nextDouble();
        sc.nextLine();

        return new XeTai(hangSx, namSX, gia, mau, trongTai);
    }

    public void nhapDangKiPhuongTien(Scanner sc) {
        char c;
        int chon = 0;
        while (true) {
            System.out.print("Ban muon nhap loai xe nao (1-XeTai,2-Xemay,3-Oto):");
            chon = sc.nextInt();
            sc.nextLine();
            switch (chon) {
                case 1: {
                    ds.add(nhapXeTai(sc));
                    break;
                }
                case 2: {
                    ds.add(nhapXeMay(sc));
                    break;
                }
                case 3: {
                    ds.add(nhapOto(sc));
                    break;
                }
                default: {
                    ds.add(nhapXeTai(sc));
                    break;
                }
            }
            System.out.println("Ban co muon nhap nua khong: (Y/N)");
            c = sc.nextLine().charAt(0);
            if (c == 'N' || c == 'n')
                break;
        }
    }
}
