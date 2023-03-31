
/**
 * @date 18/5/2022
 * @author Hoàng Minh Nhật
 *         Đề: Tạo class nhập ký tự và điểm tọa độ ký tự đó
 */
public class Bai4 {
    public static void main(String[] args) {
        // tạo object thuộc class c_bai4
        c_bai4 TH1 = new c_bai4('A'); // trường hợp mặc định x và y
        c_bai4 TH2 = new c_bai4('B', 10); // trường hợp mặc định y
        c_bai4 TH3 = new c_bai4(20, 'C'); // trường hợp mặc định x
        c_bai4 TH4 = new c_bai4(4, 6, 'D'); // trường hợp nhập cả x,y

        // in ra các trường hợp
        System.out.println(TH1.get_KyTu() + "(" + TH1.get_x() + "," + TH1.get_y() + ")");
        System.out.println(TH2.get_KyTu() + "(" + TH2.get_x() + "," + TH2.get_y() + ")");
        System.out.println(TH3.get_KyTu() + "(" + TH3.get_x() + "," + TH3.get_y() + ")");
        System.out.println(TH4.get_KyTu() + "(" + TH4.get_x() + "," + TH4.get_y() + ")");
    }// end main
} // end class

class c_bai4 {
    private char Kytu;
    private int x, y;

    /**
     * set giá trị cho kytu
     * 
     * @param Kytu char
     */
    public void set_KyTu(char Kytu) {
        this.Kytu = Kytu;
    }// end set ky tu

    // return Kytu
    public char get_KyTu() {
        return Kytu;
    }

    /**
     * set giá trị cho x
     * 
     * @param x
     */
    public void set_x(int x) {
        this.x = x;
    }// end toa do x

    /**
     * return giá trị x
     * 
     * @return x
     */
    public int get_x() {
        return x;
    }// end return x

    /**
     * set giá trị y
     * 
     * @param y
     */
    public void set_y(int y) {
        this.y = y;
    }// end toa do y

    /**
     * return giá trị y
     * 
     * @return y
     */
    public int get_y() {
        return y;
    }// end return

    /**
     * mặc định giá trị x,y
     * 
     * @param Kytu
     */
    public c_bai4(char Kytu) {
        this.Kytu = Kytu;
        x = 0;
        y = 0;
    }// end th 1

    /**
     * nhập Kytu, nhập x, mặc định y
     * 
     * @param a
     * @param x
     */
    public c_bai4(char Kytu, int x) {
        this.Kytu = Kytu;
        this.x = x;
        this.y = 0;
    }// end th2

    /**
     * lấy giá trị Kytu và y, mặc định x
     * 
     * @param y
     * @param Kytu
     */
    public c_bai4(int y, char Kytu) {
        this.Kytu = Kytu;
        this.y = y;
        this.x = 0;

    }// end

    /**
     * lấy giá trị cho cả 3 ký tự
     * 
     * @param x
     * @param y
     * @param Kytu
     */
    public c_bai4(int x, int y, char Kytu) {
        this.Kytu = Kytu;
        this.x = x;
        this.y = y;
    }// end
}// end class
