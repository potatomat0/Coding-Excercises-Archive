package CuoiKy;

public class Xe {
    // khai báo biến
    protected String maLoai;
    protected String hangSX;
    protected int namSX;
    protected int giaBan;
    protected int soLuong;
    protected String mau;

    // constructor không có tham số
    public Xe() {
    } // end constructor

    /**
     * Constructor đầy đủ
     * 
     * @param maLoai
     * @param hangSX
     * @param namSX
     * @param giaBan
     * @param soLuong
     * @param mau
     */
    public Xe(String maLoai, String hangSX, int namSX, int giaBan, int soLuong, String mau) {
        maLoai = this.maLoai;
        hangSX = this.hangSX;
        namSX = this.namSX;
        giaBan = this.giaBan;
        soLuong = this.soLuong;
        mau = this.mau;
    } // end constructor

    /// -----------------------get
    /// set----------------------------------------------------------------
    /**
     * Hàm trả về giaBan
     * 
     * @return GiaBan
     */
    public int getGiaBan() {
        return giaBan;
    } // end getGiaBan

    /**
     * Hàm trả về MaLoai
     * 
     * @return MaLoai
     */
    public String getMaLoai() {
        return maLoai;
    } // end getMaLoai

    /**
     * Hàm trả về hãng sản xuất
     * 
     * @return hangSX
     */
    public String getHangSX() {
        return hangSX;
    } // end getHangSX

    public String getMau() {
        return mau;
    } // end getMau

    public int getNamSX() {
        return namSX;
    } // end getNamSX

    public int getSoLuong() {
        return soLuong;
    } // end getSoLuong

    /**
     * Hàm thiết lập giá bán
     * 
     * @param giaBan
     */
    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    } // end setGiaBan

    /**
     * Hàm thiết lập hãng sản xuất
     * 
     * @param hangSX
     */
    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    } // end setHangSX

    /**
     * Hàm thiết lập mã loại
     * 
     * @param maLoai
     */
    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    } // end setMaLoai

    /**
     * hàm thiết lập màu
     * 
     * @param mau
     */
    public void setMau(String mau) {
        this.mau = mau;
    } // end setMau

    /**
     * hàm thiết lập năm sản xuất
     * 
     * @param namSX
     */
    public void setNamSX(int namSX) {
        this.namSX = namSX;
    } // end getNamSX

    /**
     * hàm thiết lập số lượng
     * 
     * @param soLuong
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    } // end getSoLuong

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "HangSX" + getHangSX() + "\nGia ban"
                + getGiaBan() + "\nMaLoai" + getMaLoai() + "\nMau" +
                getMau() + "\nSoLuong:" + getSoLuong() + "\nNamSX;" + getNamSX();
    }

} // end class xe