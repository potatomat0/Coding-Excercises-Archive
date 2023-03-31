package Lab1;

/**
 * Đề bài: Viết chương trình cho phép nhập vào thời gian của một công việc nào đó tính bằng 
 * giây. Hãy chuyển đổi và in ra màn hình thời gian trên dưới dạng bao nhiêu giờ, bao 
 * nhiêu phút, bao nhiêu giây.
 * @date 4/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

import java.util.Scanner; //nhập lớp Scanner trong gói java

public class B5 {
    public static void main(String[] args) { // khởi động chương trình
        Scanner input = new Scanner(System.in); // tên của Scanner mới là "input"
        System.out.println("Hay nhap so giay: ");
        int x = input.nextInt(); // giá trị được nhập sẽ mang tên x
        int a = x / 3600; // trích số giờ
        int b = a / 60; // trích số phút
        int c = x % 60; // trích số giây
        System.out.print("Bay gio la: " + a); // in kết quả ra màn hình
        System.out.print(" Gio " + b);
        System.out.print(" phut " + c);
        System.out.print(" Giay ");
        input.close(); // đóng gói Scanner
    }

} // kết thúc chương trình
