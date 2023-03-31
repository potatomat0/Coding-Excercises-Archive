package bai3;

public class HCN {
    double dai, rong;

    /**
     * 
     * @param dai
     * @param rong
     */
    public HCN(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    // khởi tạo phương thức constructor không có tham số
    public HCN() {
    }

    // khởi tạo các biến chiều dài chiều rộng
    /**
     * 
     * @return rong
     */
    public double getRong() {
        return rong;
    }

    /**
     * 
     * @return dai
     */
    public double getDai() {
        return dai;
    }

    /**
     * gán giá trị vào rộng
     * 
     * @param rong
     */
    public void setRong(double rong) {
        this.rong = rong;
    }

    /**
     * gán giá trị vào dài
     * 
     * @param dai
     */
    public void setDai(double dai) {
        this.dai = dai;
    }

    /**
     * tính diện tíhc
     * 
     * @return dai*rong
     */
    public double tinhDienTich() {
        return dai * rong;
    }

    /**
     * tính chu vi
     * 
     * @return (dai+rong)*2
     */
    public double tinhChuVi() {
        return ((dai + rong) * 2);
    }
} // kế thúc class
