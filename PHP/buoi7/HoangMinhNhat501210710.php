<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body {
            padding: 30px;
            background: beige;
            text-align: center;
        }

        form {
            border: solid 1px darkblue;
            padding: 3px;
        }
    </style>
</head>

<?php 
    class KhachHang{
        private $hoTen;
        private $doTuoi;
        private $diaChi;
        private $gioiTinh;
  
        function __construct() {
          $this->hoTen = ' ';
          $this->doTuoi = 0;
          $this->diaChi = ' ';
          $this->gioiTinh = ' ';
          
        }
  
        function setHoTen($value) {$this->hoTen = $value;}
        function setDoTuoi($value) {$this->doTuoi = $value;}
        function setDiaChi($value) {$this->diaChi = $value;}
        function setGioiTinh($value) {$this->gioiTinh = $value;}
  
        function getHoTen() {
          return $this->hoTen;
        }
        function getDoTuoi() {
          return $this->doTuoi;
        }
        function getDiaChi() {
          return $this->diaChi;
        }
        function getGioiTinh() {
          return $this->gioiTinh;
        }

        function thongTinKH() {
            echo "<b>Thông tin khách hàng</b> <br>";
            echo "<p> Họ tên: {$this->getHoTen()} -
            Độ tuổi: {$this->getDoTuoi()}  /
            Giới tính: {$this->getGioiTinh()} <br>
            Địa chỉ: {$this->getDiaChi()}
            </p>";
        }
    }
    $KH = new KhachHang();
    $hoTen = ' ';
    $diaChi = ' ';
    $doTuoi = ' ';
    $gioiTinh = ' ';

    $soKhach = 0;
    $ngayDat =  date(2022-01-01);
    $loaiTiec = [];
    $diaDiem = ' ';
    $khaoSat = [];
    $yeuCau = ' ';

    //cài đặt múi giờ việt nam:
    date_default_timezone_set("Asia/Ho_Chi_Minh");
    $xacNhan = date('d-m-y h:i:s');
    //khai báo biến hóa đơn và thuế
    $thue = 1.1;
    $hoaDon = 0;


?>

<body>
    <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="post">
        <h1>THÔNG TIN ĐẶT CHỖ</h1>
        <label for="">Số khách tham dự buổi tiệc của quý khách: <input min="1" max="250" type="number" required name="soKhach"></label>
    <br><br>
        <label for="">Ngày diễn ra: <input min="2022-10-5" max="2022-12-31" type="date" name="ngayDat" required></label> <br>
        <p>Loại tiệc: </p>
        <label for="">
                <input type="checkbox" name="loaiTiec[]" value="tiệc sáng"> Tiệc sáng
        </label>
        <label for="">
                <input type="checkbox" name="loaiTiec[]" value="tiệc trưa"> Tiệc trưa
        </label>
        <label for="">
                <input type="checkbox" name="loaiTiec[]" value="tiệc tối"> Tiệc tối
        </label>
    <br>
        <p>Địa điểm: </p>
        <label for="">
                <input type="radio" name="diaDiem" value="trong nhà"> Trong nhà
        </label>
        <label for="">
                <input type="radio" name="diaDiem" value="ngoài trời"> ngoài trời
        </label>
    <br>
    <br>
        <label for="">Tên quý khách: <input required type="text" name="hoTen"></label> <br> <br>
        <label for="">Địa chỉ liên lạc: <input required type="text" name="diaChi"></label>
        <label for="">Độ tuổi: 
            <select name="doTuoi" id="">
                <option value="Nhỏ hơn 19">Nhỏ hơn 19</option>
                <option value="19 đến 34">19 đến 34</option>
                <option value="Trên 34">Trên 34</option>
            </select>
        </label>
    <br>
        <p>Giới tính: </p>
        <label for="">
                <input type="radio" name="gioiTinh" value="Nam"> Nam
        </label>
        <label for="">
                <input type="radio" name="gioiTinh" value="Nữ"> Nữ
        </label>
    <br><br>
        <label for="">Quý khách biết đến chúng tôi thông qua:
            <label for="">
                <input type="checkbox" name="khaoSat[]" value="người quen"> Người quen
        </label>
        <label for="">
                <input type="checkbox" name="khaoSat[]" value="báo đài"> Báo đài
        </label>
        <label for="">
                <input type="checkbox" name="khaoSat[]" value="Tivi"> Tivi
        </label>
        </label>
    <br><br>
        <label for="" >Các yêu cầu kèm theo:
            <textarea name="yeuCau" id="" cols="20" rows="2"></textarea>
            
        </label>
        <br>
        <input type="submit" name="submit" value="Đặt chỗ">
    </form>
    
    <!-- xuất thông tin -->
    <div style="background: powderblue; margin-top: 10px;">
    <?php 
    if(isset($_POST['submit'])) {
      if(isset($_POST['hoTen']) && isset($_POST['doTuoi']) && isset($_POST['gioiTinh'])
      && isset($_POST['diaChi']) && isset($_POST['ngayDat']) && isset($_POST['diaDiem']) 
      && isset($_POST['loaiTiec']) && isset($_POST['soKhach']) ) {

        $hoTen = $_POST['hoTen'];
        $doTuoi = $_POST['doTuoi'];
        $diaChi = $_POST['diaChi'];
        $gioiTinh = $_POST['gioiTinh'];
        //---------------------------------
        $diaDiem = $_POST['diaDiem'];
        $soKhach = $_POST['soKhach'];
        $loaiTiec = $_POST['loaiTiec'];
        $ngayDat = (new DateTime($_POST['ngayDat']))->format('Y-m-d');
        
        //kiểm tra yêu cầu có empty không
        empty($_POST['yeuCau']) ? ($yeuCau = 'Quý khách không có yêu cầu kèm thêm nào')  : ($yeuCau = $_POST['yeuCau']) ;
        
        //kiểm tra khảo sát có empty không 

        empty($_POST['khaoSat']) ? ($khaoSat = ['chưa', 'thực', 'hiện', 'khảo', 'sát']) : ($khaoSat = $_POST['khaoSat']);

        //tính hóa đơn
        foreach($loaiTiec as $lt) {

            if ($lt === "tiệc sáng") {
                ($soKhach <=100)? ($hoaDon += ($soKhach*50000)) : ($hoaDon += (($soKhach-100)*40000) + 3000000 );
            }
            if($lt === "tiệc trưa")
            {
                ($soKhach <=100)? ($hoaDon += ($soKhach * 60000)) : ($hoaDon += ($soKhach * 50000));
            }
            if($lt === "tiệc tối") {
                $hoaDon = $hoaDon + ($soKhach * 100000);
            }
        }
        //thuế vat
        $hoaDon *= $thue;
        

        // ------------------------gán giá trị vào KH--------------------------------
        $KH-> setHoTen($hoTen);
        $KH->setDoTuoi($doTuoi);
        $KH->setDiaChi($diaChi);
        $KH->setGioiTinh($gioiTinh);
        // ------------------------In ra thông tin--------------------------------
        $KH->thongTinKH();

        echo "<hr><b>Thông tin đặt chỗ:</b> 
          <br> Số khách tham dự: $soKhach - Ngày đặt tiệc: $ngayDat
          
          <br> Loại tiệc: ".implode("|",$loaiTiec); echo " / Địa điểm: $diaDiem
        
          <br> <p><b>Các yêu cầu kèm theo:</b> </p><i>$yeuCau</i>";

        echo "<hr><i>Quý khách biết đến chúng tôi thông qua: ".implode(" ",$khaoSat);; echo "<br>
        <i>Chúng tôi đã nhận được thông tin đặt hàng của quý khách vào lúc :</i> <b>$xacNhan</b>
        <br> <h4> Tổng hóa đơn của quý khách là $hoaDon VNĐ </h4>";
      } 
      else{
        //trường hợp đã submit nhưng vẫn chưa điền các thông tin cần thiết
        echo "<script>alert('Làm ơn nhập đầy đủ và hợp lệ thông tin 🙏🏿🙏🏻') </script>";
      }
    }
  ?>
    </div> 
    
   


</body>
</html>