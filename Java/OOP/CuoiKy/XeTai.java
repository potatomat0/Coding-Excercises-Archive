package CuoiKy;

public class XeTai extends Xe {
    private int trongTai;

    public XeTai() {
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
     * @param trongTai
     */
    public XeTai(String maLoai, String hangSX, int namSX, int giaBan, int soLuong, String mau, String kieuDongCo,
            int trongTai) {
        super(maLoai, hangSX, namSX, giaBan, soLuong, mau);
        trongTai = this.trongTai;
    } // end constructor

    /**
     * Trả về số trongTai
     * 
     * @return
     */
    public int gettrongTai() {
        return trongTai;
    } // end get trongTai

    /**
     * thiết lập trongTai
     * 
     * @param trongTai
     */
    public void settrongTai(int trongTai) {
        this.trongTai = trongTai;
    } // end settrongTai

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\n trongTai: " + gettrongTai();

    } // end toString()
}
