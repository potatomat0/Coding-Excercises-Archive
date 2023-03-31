
import java.util.Scanner;

/**
 * Xoa cac phan tu le
 * 
 * @author Hoang Minh Nhat
 */
public class BT113 {
    public static Scanner scanner = new Scanner(System.in);

    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Nhap so phan tu: ");
        int n = scanner.nextInt();
        // tao mang
        int[] arr = new int[n];
        System.out.print("Nhap cac phan tu: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        // sap xep mang theo thu tu tang dan
        System.out.println("Mang co cac phan tu le: ");
        inra(arr);
    }

    /**
     * in in cac phan tu o vi tri le
     * 
     * @param arr: mảng các số nguyên
     * @param n:   số phần tử của mảng
     */
    public static void inra(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
