package Lab1;

/**
 * Đề bài: Viết chương trình nhập vào 2 số nguyên a, b. Tìm giá trị nhỏ nhất và in kết quả ra 
 * màn hình
 * @date 4/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */
import java.util.Scanner; //nhập lớp Scanner

public class B7 {
    public static void main(String[] args) { // khởi động chương trình
        Scanner input = new Scanner(System.in);
        System.out.println("Hay nhap so thu nhat: "); // yêu cầu nhập số
        int x = input.nextInt(); // gán giá trị
        System.out.println("Hay nhap so thu hai: ");
        int y = input.nextInt();
        if (x < y) { // nếu x<b
            System.out.println(x + " la so nho hon"); // thì in ra x
        } else { // còn nếu ngược lại
            System.out.println(y + " la so nho hon"); // thì in ra y
        }
        input.close(); // đóng lớp "input"
    }
} // kết thúc chương trình
