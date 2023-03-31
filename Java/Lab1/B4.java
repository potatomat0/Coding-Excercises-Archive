package Lab1;

/**
 * Đề bài: Viết chương trình cho phép nhập vào giờ, phút, giây, hãy đổi sang giây và in kết 
 * quả ra màn hình. 
 * @date 4/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */
import java.util.Scanner; //nhập lớp Scanner

public class B4 {
    public static void main(String[] args) { // khởi động chương trình
        Scanner input = new Scanner(System.in);
        System.out.println("Hay nhap gio: ");
        int x = input.nextInt(); // giá trị giờ sẽ mang tên x
        System.out.println("Hay nhap phut: ");
        int y = input.nextInt(); // giá trị phút sẽ mang tên y
        System.out.println("Hay nhap giay: ");
        int z = input.nextInt(); // giá trị giây sẽ mang tên z
        int a = x * 3600 + y * 60 + z; // tổng giá trị giờ phút và giây
        System.out.println("So giay cua gio la: " + a); // in ra kết quả
        input.close(); // đóng gói Scanner mang tên "input"
    }

}
