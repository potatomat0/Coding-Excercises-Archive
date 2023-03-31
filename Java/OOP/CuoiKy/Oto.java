package CuoiKy;

public class Oto extends Xe {
    private String kieuDongCo;
    private String soChoNgoi;

    public Oto() {
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
     * @param kieuDongCo
     * @param soChoNgoi
     */
    public Oto(String maLoai, String hangSX, int namSX, int giaBan, int soLuong, String mau, String kieuDongCo,
            String soChoNgoi) {
        super(maLoai, hangSX, namSX, giaBan, soLuong, mau);
        kieuDongCo = this.kieuDongCo;
        soChoNgoi = this.soChoNgoi;
    } // end constructor

    /**
     * Trả về số chỗ ngồi
     * 
     * @return
     */
    public String getSoChoNgoi() {
        return soChoNgoi;
    } // end get soChoNgoi

    /**
     * Trả về kiểu động cơ
     * 
     * @return
     */
    public String getKieuDongCo() {
        return kieuDongCo;
    } // end getKieuDongCo

    /**
     * Thiết lập kieuDongCo
     * 
     * @param kieuDongCo
     */
    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    } // end setKieuDongCo

    /**
     * thiết lập soChoNgoi
     * 
     * @param soChoNgoi
     */
    public void setSoChoNgoi(String soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    } // end setSoChoNgoi

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "So cho ngoi: " + getSoChoNgoi() + "\nKieu dong co: " + getKieuDongCo();

    }
}
