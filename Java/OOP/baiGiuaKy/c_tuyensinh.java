package baiGiuaKy;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Lớp Tuyển sinh
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 16/7/2022
 * 
 */

public class c_tuyensinh implements i_interface {
    private ArrayList<c_thiSinh> danhsach;

    public c_tuyensinh() {
        danhsach = new ArrayList<c_thiSinh>(100);
    }

    // hàm nhập danh sách
    public void nhapDanhSach(Scanner sc) {
        String traLoi;
        int chon;
        c_thiSinh ts;

        do {
            System.out.print("Hay nhap thi sinh(1-Khoi A, 2-Khoi B, 3-Khoi C): ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    ts = new c_khoiA("Toan", "Ly", "Hoa");
                    break;
                case 2:
                    ts = new c_khoiB("Toan", "Hoa", "Sinh");
                    break;
                case 3:
                    ts = new c_khoiC("Van", "Su", "Dia");
                    break;
                default:
                    ts = new c_khoiA("Toan", "Ly", "Hoa");
                    break;
            }

            ts.nhapThongTin(sc);
            danhsach.add(ts);// thêm thí sinh vào arrayList

            System.out.print("ban co muon nhap tiep? (co/khong): ");
            traLoi = sc.nextLine();
        } while ("co".equalsIgnoreCase(traLoi));
    } // end nhapDanhSach

    // hàm in danh sách thí sinh dự thi
    public void inDanhSach() {
        for (c_thiSinh ts : danhsach) {
            ts.toString();
        }
    } // end inDanhSach

    // hàm tìm kiếm thí sinh
    public void timTS(int sbd) {
        for (c_thiSinh ts : danhsach) {
            if (sbd == ts.sbd) {
                ts.toString();
            }
        }
    } // end timTS

} // end class
