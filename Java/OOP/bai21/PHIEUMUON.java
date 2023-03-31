package bai21;

/**
 * lớp phiếu mượn với các thuộc tính ma,bandoc, sach,ngaymuon, thangmuon,
 * nammuon, ngaytra, thangtra, namtra
 * 
 * @author Hoàng Minh Nhật
 * @id 501210710
 * @date 4/7/2022
 */
public class PHIEUMUON extends THUVIEN {

    // các thuộc
    // tính-----------------------------------------------------------------------------------------------------
    private int ngaymuon, thangmuon, nammuon, ngaytra, thangtra, namtra;
    protected BANDOC bandoc;
    protected SACH sach;

    // các phương
    // thức---------------------------------------------------------------------------------------------------

    /**
     * phương thức khởi tạo không truyền tham số
     */
    public PHIEUMUON() {
    }// end PHIEUMUON()

    /**
     * phương thức khởi tạo truyền tham số mã
     * 
     * @param ma mã phiếu mượn
     */
    public PHIEUMUON(String ma) {
        super(ma);
    }// end PHIEUMUON(String ma)

    /**
     * phương thức khởi tạo truyền tham số mã, ngày mượn,tháng mượn ,năm mượn
     * 
     * @param ma        mã phiếu mượn
     * @param ngaymuon  ngày mượn
     * @param thangmuon tháng mượn
     * @param nammuon   nam mượn
     */
    public PHIEUMUON(String ma, int ngaymuon, int thangmuon, int nammuon) {
        super(ma);
        this.ngaymuon = ngaymuon;
        this.thangmuon = thangmuon;
        this.nammuon = nammuon;
    }// end PHIEUMUON(String ma, int ngaymuon, int thangmuon, int nammuon)

    /**
     * phương thức khởi tạo truyền tham số mã, ngày mượn,tháng mượn ,năm mượn,ngày
     * trả, tháng trả, năm trả, bạn đọc,sách
     * 
     * @param ma        mã phiếu mượn
     * @param ngaymuon  ngày mượn
     * @param thangmuon tháng mượn
     * @param nammuon   nam mượn
     * @param ngaytra   ngày trả
     * @param thangtra  tháng trả
     * @param namtra    năm trả
     */
    public PHIEUMUON(String ma, int ngaymuon, int thangmuon, int nammuon, int ngaytra, int thangtra, int namtra) {
        super(ma);
        this.ngaymuon = ngaymuon;
        this.thangmuon = thangmuon;
        this.nammuon = nammuon;
        this.ngaytra = ngaytra;
        this.thangtra = thangtra;
        this.namtra = namtra;
    }// end PHIEUMUON(String ma, int ngaymuon, int thangmuon, int nammuon, int
     // ngaytra, int thangtra, int namtra)

    /**
     * phương thức khởi tạo truyền tham số mã, ngày mượn,tháng mượn ,năm mượn,ngày
     * trả, tháng trả, năm trả, bạn đọc
     * 
     * @param ngaymuon  ngày mượn
     * @param thangmuon tháng mượn
     * @param nammuon   nam mượn
     * @param ngaytra   ngày trả
     * @param thangtra  tháng trả
     * @param namtra    năm trả
     * @param bandoc    bạn đọc
     * @param sach      sách
     */
    public PHIEUMUON(String ma, int ngaymuon, int thangmuon, int nammuon, int ngaytra, int thangtra, int namtra,
            BANDOC bandoc) {
        super(ma);
        this.ngaymuon = ngaymuon;
        this.thangmuon = thangmuon;
        this.nammuon = nammuon;
        this.ngaytra = ngaytra;
        this.thangtra = thangtra;
        this.namtra = namtra;
        this.bandoc = bandoc;

    }// end PHIEUMUON(String ma, int ngaymuon, int thangmuon, int nammuon, int
     // ngaytra, int thangtra, int namtra, BANDOC bandoc,)

    /**
     * phương thức khởi tạo truyền tham số mã, ngày mượn,tháng mượn ,năm mượn,ngày
     * trả, tháng trả, năm trả, bạn đọc,sách
     * 
     * @param ma        mã phiếu mượn
     * @param ngaymuon  ngày mượn
     * @param thangmuon tháng mượn
     * @param nammuon   nam mượn
     * @param ngaytra   ngày trả
     * @param thangtra  tháng trả
     * @param namtra    năm trả
     * @param bandoc    bạn đọc
     * @param sach      sách
     */
    public PHIEUMUON(String ma, int ngaymuon, int thangmuon, int nammuon, int ngaytra, int thangtra, int namtra,
            BANDOC bandoc, SACH sach) {
        super(ma);
        this.ngaymuon = ngaymuon;
        this.thangmuon = thangmuon;
        this.nammuon = nammuon;
        this.ngaytra = ngaytra;
        this.thangtra = thangtra;
        this.namtra = namtra;
        this.bandoc = bandoc;
        this.sach = sach;
    }// end PHIEUMUON(String ma, int ngaymuon, int thangmuon, int nammuon, int
     // ngaytra, int thangtra, int namtra, BANDOC bandoc, SACH sach)

    /**
     * phương thức lấy thuộc tính bạn đọc
     * 
     * @return BANDOC
     */
    public BANDOC getBandoc() {
        return bandoc;
    }// end getBandoc

    /**
     * phương thức khởi tạo truyền tham số bạn đọc
     * 
     * @param bandoc bạn đọc
     */
    public PHIEUMUON(BANDOC bandoc) {
        this.bandoc = bandoc;
    }// end PHIEUMUON(BANDOC bandoc)

    /**
     * phương thức khởi tạo truyền tham số bạn đọc, sách
     * 
     * @param bandoc bạn đọc
     * @param sach   sách
     */
    public PHIEUMUON(BANDOC bandoc, SACH sach) {
        this.bandoc = bandoc;
        this.sach = sach;
    }// end PHIEUMUON(BANDOC bandoc, SACH sach)

    /**
     * phương thức thiết lập thuộc tính bạn đọc
     * 
     * @param bandoc bạn đọc
     */
    public void setBandoc(BANDOC bandoc) {
        this.bandoc = bandoc;
    }// end setBandoc

    /**
     * phương thức lấy thuộc tính sách
     * 
     * @return SACH
     */
    public SACH getSach() {
        return sach;
    }// end getSach

    /**
     * phương thức thiết lập thuộc tính sách
     * 
     * @param sach sách
     */
    public void setSach(SACH sach) {
        this.sach = sach;
    }// end setSach

    /**
     * phương thức lấy thuộc tính ngày mượn
     * 
     * @return int
     */
    public int getNgaymuon() {
        return ngaymuon;
    }// end getNgaymuon

    /**
     * phương thức thiết lập thuộc tính ngày mượn
     * 
     * @param ngaymuon ngày mượn
     */
    public void setNgaymuon(int ngaymuon) {
        this.ngaymuon = ngaymuon;
    }// end setNgaymuon

    /**
     * phương thức lấy thuộc tính thang mượn
     * 
     * @return int
     */
    public int getThangmuon() {
        return thangmuon;
    }// end getThangmuon

    /**
     * phương thức thiết lập thuộc tính tháng mượn
     * 
     * @param thangmuon tháng mượn
     */
    public void setThangmuon(int thangmuon) {
        this.thangmuon = thangmuon;
    }// end setThangmuon

    /**
     * phương thức lấy thuộc tính năm mượn
     * 
     * @return int
     */
    public int getNammuon() {
        return nammuon;
    }// end getNammuon

    /**
     * phương thức thiết lập thuộc tính năm mượn
     * 
     * @param nammuon năm mượn
     */
    public void setNammuon(int nammuon) {
        this.nammuon = nammuon;
    }// end setNammuon

    /**
     * phương thức lấy thuộc tính ngày trả
     * 
     * @return int
     */
    public int getNgaytra() {
        return ngaytra;
    }// end getNgaytra

    /**
     * phương thức thiết lập thuộc tính ngày trả
     * 
     * @param ngaytra ngày trả
     */
    public void setNgaytra(int ngaytra) {
        this.ngaytra = ngaytra;
    }// end setNgaytra

    /**
     * phương thức lấy thuộc tính tháng trả
     * 
     * @return int
     */
    public int getThangtra() {
        return thangtra;
    }// end getThangtra

    /**
     * phương thức thiết lập thuộc tính tháng trả
     * 
     * @param thangtra tháng trả
     */
    public void setThangtra(int thangtra) {
        this.thangtra = thangtra;
    }// end setThangtra

    /**
     * phương thức thiết lập thuộc tính namtra
     * 
     * @param namtra năm trả
     */
    public void setNamtra(int namtra) {
        this.namtra = namtra;
    }// end setNamtra

    /**
     * phương thức lấy thuộc tính năm trả
     * 
     * @return int
     */
    public int getNamtra() {
        return namtra;
    }// end getNamtra

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "MaPhieumuon: " + ma + "\t" + bandoc + "\t" + sach + "\tngay thang nam muon: " + this.ngaymuon + "/"
                + this.thangmuon + "/" + this.nammuon
                + "\tngay thang nam tra: " + this.ngaytra + "/" + this.thangtra + "/" + this.namtra;
    }

}
