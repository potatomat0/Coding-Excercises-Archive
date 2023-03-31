package Phan2_Cau_Truc_Lenh;

import java.util.Scanner; //Nhập lớp Scanner trong gói java

/**
 * Viết chương trình tính tiền cước TAXI. Biết rằng: -
 * km đầu tiên là 13000đ .
 * - Mỗi km tiếp theo là 12000đ .
 * - Nếu lớn hơn 30km thì môĩ km thêm sẽlà 11000đ
 * Hãy nhâp̣ số km sau đó
 * in ra số tiền phải trả. *
 * 
 * @date 4/12/2021
 * @author Hoang Minh Nhat
 * @id 501210710
 */
public class BT021 {
    // khởi động chương trình
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Sử dụng lớp Scanner mới có tên "Input"
        System.out.println("Nhap quang duong (km): ");
        // Khai báo biến====================
        long a;
        // Nhập dữ liệu=====================
        a = input.nextInt();
        // Xử lý và xuất kết quả============
        if (a == 1)
            System.out.println("Tien cuoc la 13000d");
        else if (a <= 30) {
            long th1 = (a - 1) * 12000 + 13000;
            System.out.println("So tien cuoc la: " + th1 + "d");
        } else {
            long th2 = (29 * 12000) + 13000 + ((a - 30) * 11000);
            System.out.println("So tien cuoc la: " + th2 + "d");
        }
        input.close(); // Đóng class
    } // Đóng main
} // Đóng chương trình
