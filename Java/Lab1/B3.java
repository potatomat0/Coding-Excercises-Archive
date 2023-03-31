package Lab1;

/**
 * Viết chương trình nhập một số nguyên dương N có 2 chữ số. Xuất ra màn hình tổng 
 * các chữ số của N.
 * Ví dụ: Nhập N = 48. Kết quả in ra màn hình là: 4 + 8 = 12.
 * @date 4/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

import java.util.Scanner; //nhập lớp Scanner trong gói java

public class B3 {
    public static void main(String[] args) { // khởi động chương trình
        Scanner input = new Scanner(System.in); // tạo ra một Scanner mới có tên "input"
        System.out.println("Hay nhap mot so nguyen co hai chu so: "); // in ra màn hình yêu cầu nhập số
        int x = input.nextInt(); // số sẽ được gán tên x
        int a = x / 10; // biến a có giá trị là số hàng chục
        int b = x % 10; // biến b có giá trị là số hàng đơn vị
        int Tongab = a + b; // tổng của a và b
        System.out.println("Tong cua hai so don vi va hang chuc la: " + Tongab); // in ra tongab
        input.close(); // đóng gói Scanner mang tên "input"
    }

} // kết thúc chương trình
