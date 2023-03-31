
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @date 18/5/2022
 * @author Hoàng Minh Nhật
 *         Đề: Tạo một class nhập vào mảng chứa tối đa 1000 sách bao gồm tiêu đề
 *         sách và tác giả
 *         thực hiện được cáp chức năng: nhập sách, hiển thị tất cả sách, tìm
 *         sách và xóa sách
 */
public class Bai8 {
    public static void main(String[] args) {
        // tạo object và khai báo biến
        Scanner sc = new Scanner(System.in);
        ArrayList<c_bai8> arrtieude = new ArrayList<>(1000);
        ArrayList<c_bai8> arrtacgia = new ArrayList<>(1000);
        c_bai8 sach = new c_bai8();
        int sosach; // tạo biến khởi tạo kích thước arraylist
        int b; // tạo biến nhập vào từ bàn phím để lựa chọn chức năng trong menu
        boolean tat = true; // tạo biến boolean để tắt vòng lặp

        // vòng lặp hiển thị menu
        do {

            System.out.println("Chon cac chuc nang:");
            System.out.println("================================================================");
            System.out.println(
                    "1. Nhap thong tin sach \n2. Hien thi tat ca sach\n3. Tim kiem tieu de sach\n4. Xoa mot sach\n>5. Thoat chuong trinh");
            b = sc.nextInt();
            switch (b) {
                case 1: {
                    System.out.println("Ban da chon chuc nang nhap sach");
                    // Nhập số sách cần nhập vào
                    System.out.print("Nhap so sach can can tao: ");
                    sosach = sc.nextInt();
                    // nhập tiêu đề và tác giả
                    for (int i = 0; i < sosach; i++) {
                        System.out.println("------------------------");
                        System.out.println("Nhap sach thu " + (i + 1));
                        sach.nhaptieude();
                        arrtieude.add(sach);
                        sach.nhaptacgia();
                        arrtacgia.add(sach);
                    }
                    break;
                } // end case 1
                case 2: {
                    // in ra tất cả các sách
                    System.out.println("--------------------------------");
                    System.out.println("Tat ca cac sach da duoc nhap: ");
                    for (int i = 0; i < arrtieude.size(); i++) {
                        System.out.println("sach thu: " + (i + 1));
                        System.out.println(arrtieude.get(i).intieude() + " " + arrtacgia.get(i).intacgia());
                        System.out.println("----------------");
                    }
                    break;
                } // end case 2

                case 3: {
                    // tìm kiếm phần tử trong chuỗi arrsach
                    // khai báo biến cục bộ
                    System.out.println("Nhap vi tri sach can hien thi: ");
                    int vitri = sc.nextInt(); // biến nhập kiểm tra

                    if (vitri >= 0 && vitri <= arrtieude.size()) {
                        System.out.println("tieu de cua sach co vi tri " + vitri + " la:  ");
                        System.out.println(arrtieude.get((vitri - 1)).intieude());
                    } else {
                        System.out.println("vi tri sach khong ton tai");
                    }
                    break;
                } // end case 3

                case 4: {
                    System.out.println("--------------------------------");
                    System.out.println("nhap vi tri sach can xoa");
                    int r = sc.nextInt();

                    if (r >= 0 && r <= arrtieude.size()) {
                        arrtieude.remove(r - 1);
                        arrtacgia.remove(r - 1);
                        System.out.printf("da xoa phan tu thu %d thanh cong.", r);
                    } else
                        System.out.println("vi tri sach khong ton tai");

                    break;
                } // end case 4
                default: {
                    System.out.println("ket thuc chuong trinh.");
                    tat = false;
                    break;
                }
            } // end off switch
        } while (tat); // end of loop
        sc.close(); // tắt class scanner

    } // kết thúc main
} // kết thúc class

// class xử lý thông tin sách
class c_bai8 {
    private String tieude, tacgia;

    Scanner sc = new Scanner(System.in);

    // tạo constructor:
    /**
     * constructor mặc định
     */
    public c_bai8() {

    }

    /**
     * 
     * @param tieude
     * @param tacgia
     */
    public c_bai8(String tieude, String tacgia) {
        this.tieude = tieude;
        this.tacgia = tacgia;
    }

    // ============setter và getter
    /**
     * Set tiêu đề
     * 
     * @param tieude
     */
    public void set_tieude(String tieude) {
        this.tieude = tieude;
    }

    /**
     * Set tác giả
     * 
     * @param tacgia
     */
    public void set_tacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    /**
     * 
     * @return tacgia
     */
    public String get_tacgia() {
        return this.tacgia;
    }

    /**
     * 
     * @return tieude
     */
    public String get_tieude() {
        return this.tieude;
    }

    // ================================================ end setter and getter
    // =================================================
    /**
     * Hàm nhập sách từ máy
     * 
     * @param tieude
     * @param tacgia
     */
    public void nhaptieude() {
        System.out.print("Nhap tieu de:");
        tieude = sc.nextLine();
    }

    /**
     * @param tacgia
     */
    public void nhaptacgia() {
        System.out.print("Nhap tac gia: ");
        tacgia = sc.nextLine();
    }

    /**
     * return tiêu đề
     * 
     * @return tieude
     */
    public String intieude() {
        return "tieu de: " + this.tieude;
    }

    /**
     * trả về tên tác giả
     * 
     * @return tacgia
     */
    public String intacgia() {
        return "tac gia: " + this.tacgia;
    }
} // kết thúc class
