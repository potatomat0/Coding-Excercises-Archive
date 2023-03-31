import java.util.Scanner;

/**
 * Đề bài: (có trong file)
 * 
 * @author Hoang Minh Nhat
 * @date 26/3/2022
 */
public class HoangMinhNhat_501210710 {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        // tạo biến mới
        int n;
        do {
            System.out.print("Nhap so phan tu mang: ");
            n = scanner.nextInt();
        } while (n <= 0); // lặp lại cho đến khi số phần tử lớn hơn 0
        int[] arr = new int[n];
        // tạo mảng mới
        taomang(arr, n);
        // gọi hàm menu
        menu(arr);
    }

    // -------------------------------------------------
    /**
     * tạo mảng số nguyên n được nhập từ bàn phím
     * 
     * @param arr: mảng các số nguyên
     * @param n:   số phần tử của mảng
     */
    public static void taomang(int[] arr, int n) {
        System.out.print("Nhap cac phan tu: \n");
        // gán giá trị được nhập từ bàn phím cho từng phần tử bằng vòng lặp for
        for (int i = 0; i <= n - 1; i++) {
            do {
                System.out.printf("a[%d] = ", i + 1);
                arr[i] = scanner.nextInt();
            } while (arr[i] <= -1);
        } // đóng vòng lặp for
    } // đóng method
      // -------------------------------------------------

    /**
     * in các phần tử lẻ của mảng từ cuối đến đầu ra màn hình
     * 
     * @param arr: mảng các số nguyên
     * @param n:   số phần tử của mảng
     */
    public static void f_phantule(int[] arr) {
        System.out.println("-------------------------");
        System.out.println("1. Cac phan tu le cua mang la theo thu tu tu cuoi den dau: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i] + " ");
            }
        } // vòng lặp in các phần tử từ cuối đến đầu
    } // đóng method

    // --------------------------------------------------

    /**
     * Tính trung bình cộng các phần tử chẵn trong mảng
     * 
     * @param arr: mảng các số nguyên
     */
    public static void f_trungbinhcong(int[] arr) {
        // tạo biến tổng và biến đếm
        double tong = 0;
        int u = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                tong = tong + arr[i];
                u = u + 1;
            }
        }
        double tbc = tong / u;
        // in kết quả
        System.out.println(" \n-------------------------");
        System.out.println("2. Trung binh cong cua tong cac phan tu chan la: " + tbc);
    } // đóng method

    // ---------------------------------------------------

    /**
     * Sắp xếp và in ra các phần tử chẵn của mảng theo thứ tự giảm dần
     * 
     * @param arr: mảng các số nguyên
     * @param n:   số phần tử của mảng
     */
    public static void f_sapxep(int[] arr) {
        // tạo biến tạm
        int bientam = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    bientam = arr[j];
                    arr[j] = arr[i];
                    arr[i] = bientam;
                }
            }
        }
        // in kết quả
        System.out.println("-------------------------");
        System.out.println("3. Cac phan tu chan cua mang theo thu tu giam dan:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.println(arr[i] + " ");
        } // đóng vòng lặp for
    } // đóng method

    // -------------------------------------
    /**
     * Kiểm tra xem mảng có chứa toàn số chẵn hay không
     * 
     * @param arr: mảng các số nguyên
     */
    public static void f_sochan(int[] arr) {
        int u = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                u = u + 1; // tìm số chẵn
            }
        }
        System.out.println(" \n-------------------------");
        // in kết quả
        if (u == arr.length) {
            System.out.println("4.toan bo phan tu trong mang la so chan");
        } else
            System.out.println("4.mang khong co toan bo phan tu la so chan");
    } // đóng method

    // ----------------------------------------------------------------
    /**
     * Đếm trong mảng xem có bao nhiêu phần tử là số chính phương
     * 
     * @param arr: mảng các số nguyên
     */
    public static void f_sochinhphuong(int[] arr) {
        int u = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            double b = Math.sqrt(arr[i]);
            if (b - Math.floor(b) == 0) {
                u = u + 1;
            }
        }
        System.out.println(" -------------------------");
        System.out.printf("5. Mang co %d phan tu la so chinh phuong \n", u);
    }

    // ---------------------------------------------------------------------
    /**
     * Xuất vị trí các phần tử là số chính phương trong mảng
     * 
     * @param arr: mảng các số nguyên
     */
    public static void f_vitri(int[] arr) {
        System.out.println(" \n -------------------------");
        System.out.printf("6. Vi tri cua cac phan tu la so chinh phuong:  \n");
        for (int i = 0; i <= arr.length - 1; i++) {
            double b = Math.sqrt(arr[i]); // sử dụng Math.sqrt và Math.floor để tìm giá trị làm tròn của căn bậc hai
                                          // phần tử
            if (b - Math.floor(b) == 0) {
                System.out.println("arr" + "[" + (i + 1) + "] " + ":" + arr[i]);
            }
        } // đóng vòng lặp for hiển thị các phần tử

    } // đóng method

    // -----------------------------------
    /**
     * Menu hiển thị chức năng
     * 
     * @param arr: mảng các số nguyên
     */
    public static void menu(int[] arr) {
        // Hiển thị các lựa chọn
        System.out.println("===========[Menu: hay chon bai toan can giai]===========");
        System.out.println("1. Xuat cac phan tu le theo thu tu tu cuoi den dau ");
        System.out.println("2. Tinh trung binh cong cac phan tu chan trong mang");
        System.out.println("3. Sap xep mang giam dan cac phan tu chan");
        System.out.println("4. Kiem tra xem mang co phai chua toan chan hay khong");
        System.out.println("5. Dem trong mang co bao nhieu phan tu la so chinh phuong");
        System.out.println("6. Xuat vi tri cac phan tu la so chinh phuong trong mang");
        System.out.println("7. Thoat chuong trinh");
        // tạo biến chọn
        int chon;
        do {
            System.out.println(" -------------------------");
            System.out.print("====> Chon bai toan can giai (nhap so >=7 de thoat chuong trinh): ");
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    f_phantule(arr);
                    break;
                case 2:
                    f_trungbinhcong(arr);
                    break;
                case 3:
                    f_sapxep(arr);
                    break;
                case 4:
                    f_sochan(arr);
                    break;
                case 5:
                    f_sochinhphuong(arr);
                    break;
                case 6:
                    f_vitri(arr);
                    break;
                default:
                    System.out.println("hen gap lai!");
                    System.exit(0);
            }
        } while (chon <= 7); // đóng vòng lặp do while lồng switch để thực hiện các bài toán
    } // đóng method
} // đóng class, kết thúc chương trình