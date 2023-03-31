package bai3;

public class HTr {
    double r;

    // tạo constructor
    /**
     * truyền vào r
     * 
     * @param r
     */
    public HTr(double r) {
        this.r = r;
    }

    // constructor không có tham số
    public HTr() {

    }

    /**
     * trả về r
     * 
     * @return r
     */
    public double getR() {
        return r;
    }

    /**
     * gán giá trị bán kính
     * 
     * @param r
     */
    public void setR(double r) {
        this.r = r;
    }

    /**
     * tính diện tích
     * 
     * @return r * r * Math.PI
     */
    double tinhDienTich() {
        return r * r * Math.PI;
    }

    /**
     * tính chu vi
     * 
     * @return 2 * Math.PI * r
     */
    double tinhChuVi() {
        return 2 * Math.PI * r;
    }
} // kết thúc class
