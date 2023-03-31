package Lab1;

/**
 * Đề bài:  Viết chương trình trích ra ba chữ số hàng trăm chục và đơn vị của một số nhập vào
 * @date 4/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

import java.util.Scanner; //Nhập lớp Scanner trong gói java

public class B2 {
    public static void main(String[] args) { // khởi động chương trình
        Scanner input = new Scanner(System.in); // Sử dụng lớp Scanner mới có tên "Input"
        System.out.println("Hay nhap mot so co ba chu so: "); // in ra màn hình yêu cầu nhập số
        int x = input.nextInt(); // số nhập tiếp theo sẽ được gán tên x
        int a = x / 100; // biến a sẽ là số hàng trăm được trích ra từ x
        int c = x % 10; // biến c sẽ là số hàng đơn vị được trích ra từ x
        int b = (x - (a * 100 + c)) / 10; // biến b sẽ là số hàng chục được trích ra từ x
        System.out.println("So hang tram la: " + a); // in ra kết quả trên màn hình
        System.out.println("So hang chuc la: " + b);
        System.out.println("So hang don vi la " + c);
        input.close();
    }

} // kết thúc chương trình
