package CuoiKy;

public class XeMay extends Xe {
    private String congSuat;

    public XeMay() {
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
     * @param congSuat
     */
    public XeMay(String maLoai, String hangSX, int namSX, int giaBan, int soLuong, String mau, String kieuDongCo,
            String congSuat) {
        super(maLoai, hangSX, namSX, giaBan, soLuong, mau);
        congSuat = this.congSuat;
    } // end constructor

    /**
     * Trả về số congSuat
     * 
     * @return
     */
    public String getcongSuat() {
        return congSuat;
    } // end get congSuat

    /**
     * thiết lập congSuat
     * 
     * @param congSuat
     */
    public void setcongSuat(String congSuat) {
        this.congSuat = congSuat;
    } // end setcongSuat

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\n congSuat: " + getcongSuat();

    }
}
