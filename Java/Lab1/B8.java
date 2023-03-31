package Lab1;

/**
 * Đề bài: viết chương trình xác định xem só nhập vào là chẵn hay lẻ
 * @date 4/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */

import java.util.Scanner; //nhập lớp Scanner

public class B8 {
    public static void main(String[] args) { // khỏi động chương trình
        Scanner input = new Scanner(System.in);
        System.out.println("Hay nhap mot so nguyen: "); // yêu cầu nhập số
        int a = input.nextInt(); // gán số được nhập là a
        if (a % 2 == 0) { // nếu a chia hết cho 0
            System.out.println(a + " La so chan"); // thì in ra a là số chẵn
        } else { // ngược lại
            System.out.println(a + " La so le"); // thì in ra a là số lẽ
        }
        input.close(); // đóng lớp input
    } // kết thúc chương trình

}
