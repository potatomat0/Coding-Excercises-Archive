package KiemTraLyThuyet;

import java.util.Scanner;

/**
 * Đề: Hãy viết một chương trình hoàn chỉnh, thực hiện các chức
 * năng sau:
 * a) Nhập, xuất mảng 1 chiều, tối đa 50 phần tử số nguyên.
 * b) Tìm phần tử chẵn lớn nhất trong mảng.
 * c) Đếm trong mảng có bao nhiếu số chia hết cho 3.
 * d) Kiểm tra giá trị X có trong mảng hay không (X được
 * nhập từ bàn phím)
 * 
 * @date 18/1/2022
 * @author Hoang Minh Nhat
 * @id 501210710
 */

public class De2 {

    public static void main(String[] args) {
        // Khai báo biến
        Scanner sc = new Scanner(System.in);
        int[] mangInt = new int[5];
        // Câu a: Nhập, xuất mảng một chiều, tối đa 50 phần tử số nguyên
        // =====Vòng lặp for để input số nguyên
        for (int i = 0; i < mangInt.length; ++i) {
            System.out.println("Hay nhap gia tri thu " + (i + 1));
            mangInt[i] = sc.nextInt();
        }
        sc.close();
        // =====Xuất mảng sau khi nhập
        System.out.print("Mang bao gom: ");
        for (int i = 0; i < mangInt.length; i++) {
            System.out.print(", " + mangInt[i]);
        }
        // Câu b: Tìm số chẵn lớn nhất trong mảng
        // == Đặt max là giá trị thứ nhất
        int max = mangInt[1];
        for (int number : mangInt) {
            // Nếu lẻ thì bỏ qua
            if (number % 2 == 1) {
                continue;
            }
            // Nếu chẵn thì gán là max
            if (number > max) {
                max = number;
            }
        } // đóng vòng lặp for
          // ====in ra kết quả
        System.out.println("\nSo chan lon nhat trong mang la: " + max);
        // Câu c: kiểm tra giá trị x (được nhập từ bàn phím) có trong mảng hay không;
        // ==== Khai báo biến
        Scanner kiemtra = new Scanner(System.in);
        System.out.println("Hay nhap so x de kiem tra: ");
        // ==== Nhập biến từ bàn phím
        int x = kiemtra.nextInt();
        kiemtra.close(); // đóng scanner
        // ===vòng lặp for để kiểm tra
        for (int i = 0; i < mangInt.length; i++) {
            if (x == mangInt[i]) {
                System.out.printf("%d la chinh la mangInt[%d]", x, (i + 1));
                break; // nếu bằng giá trị trong mảng thì thông báo và ngừng vòng lặp
            } else {
                if (x != mangInt[mangInt.length - 1] && i == mangInt.length) {
                    System.out.printf("%d khong co trong mang.", x);
                    // nếu không bằng bất ký giá trị nào trong mảng thì thông báo.
                }
            }
        } // ngừng vòng lặp for
    } // đóng main
} // đóng class
