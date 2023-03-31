
import java.util.Scanner;

/**
 * Chương trình sắp xếp mảng số nguyên theo thứ tự tăng dần.
 * 
 * @author Hoang Minh Nhat
 */
public class Bait109 {
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
        sapxep(arr);
        System.out.println("Mang tang dan: ");
        inra(arr);
    }

    /**
     * sap xep mang so nguyen theo thu tu tang dan
     * 
     * @param arr: mảng các số nguyên
     * @param n:   số phần tử của mảng
     */
    public static void sapxep(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    /**
     * in các phần tử của mảng ra màn hình
     * 
     * @param arr: mảng các số nguyên
     * @param n:   số phần tử của mảng
     */
    public static void inra(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}