<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
	<?php
		$tour = "";
        $ngay ="";
        $phuongtien ="";
        $soluong = "";
        $tenkhach = "";
        $diachi = "";
        $dienthoai = "";
        $yeucau= "";
        function tientour($tour){
            $sotien="0";
            switch($tour){
                case"Hà Nội - Hạ Long - Sapa";
                $sotien = 6000000;
                break;
                case"Hà Nội - Hải Phòng";
                $sotien = 5500000;
                break;
                case"Hà Nội - Điện Biên";
                $sotien = 5500000;
                break;
                case"Huế - Bạch Mã - Đà Nẵng";
                $sotien = 5000000;
                break;
                case"Nha Trang - Đà Lạt";
                $sotien = 3000000;
                break;
                case"Buôn mê thuộc - Gia lai - Komtum";
                $sotien = 3500000;
                break;
                case"TP HCM - Phú Quốc";
                $sotien = 4000000;
                break;
                case"TP HCM - Cần Thơ";
                $sotien = 4500000;
                break;
                case"TP HCM - Mỹ Tho";
                $sotien = 3000000;    
                break;        
            }
            return $sotien;
        }
        if(isset($_POST['tour'])&&isset($_POST['ngay'])&&isset($_POST['phuongtien'])&&isset($_POST['soluong'])&&isset($_POST['tenkhach'])&&isset($_POST['diachi'])&&isset($_POST['dienthoai'])&&isset($_POST['yeucau'])){
            $tour = $_POST['tour'];
            $ngay = $_POST['ngay'];
            $phuongtien = $_POST['phuongtien'];
            $soluong = $_POST['soluong'];
            $tenkhach = $_POST['tenkhach'];
            $diachi = $_POST['diachi'];
            $dienthoai = $_POST['dienthoai'];
            $yeucau = $_POST['yeucau'];
        }
	?>
<form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="post" name="form1" id="form1">
  <table width="600" border="0" align="center" cellpadding="1" cellspacing="1">
    <tbody>
      <tr>
        <td colspan="2" align="center" bgcolor="#17335A" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif; color: #F5E6E7; font-weight: bold;">ĐĂNG KÝ TOUR DU LỊCH</td>
      </tr>
      <tr>
        <td width="173" bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Tên tour</td>
        <td width="420" bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><select name="tour" id="tour">
			<optgroup label="Miền Bắc">
				<option value="Hà Nội - Hạ Long - Sapa" 
						<?php
							if(isset($_POST['tour'])=="Hà Nội - Hạ Long - Sapa"){
                                echo "selected";
                            }
						?>>
						Hà Nội - Hạ Long - Sapa</option>
				<option value="Hà Nội - Hải Phòng"
						<?php
							if(isset($_POST['tour'])=="Hà Nội - Hải Phòng"){
                                echo "selected";
                            }
						?>>
						Hà Nội - Hải Phòng</option>
				<option value="Hà Nội - Điện Biên"
						<?php
							if(isset($_POST['tour'])=="Hà Nội - Điện Biên"){
                                echo "selected";
                            }
						?>>
						Hà Nội - Điện Biên</option>
			</optgroup>
			<optgroup label="Miền Trung">
				<option value="Huế - Bạch Mã - Đà Nẵng"
						<?php
							if(isset($_POST['tour'])=="Huế - Bạch Mã - Đà Nẵng"){
                                echo "selected";
                            }
						?>>
						Huế - Bạch Mã - Đà Nẵng</option>
				<option value="Nha Trang - Đà Lạt"
						<?php
							if(isset($_POST['tour'])=="Nha Trang - Đà Lạt"){
                                echo "selected";
                            }
						?>>
						Nha Trang - Đà Lạt</option>
				<option value="Buôn mê thuộc - Gia lai - Komtum"
						<?php
							if(isset($_POST['tour'])=="Buôn mê thuộc - Gia lai - Komtum"){
                                echo "selected";
                            }
						?>>
						Buôn mê thuộc - Gia lai - Komtum</option>
			</optgroup>
			<optgroup label="Miền Nam">
				<option value="TP HCM - Phú Quốc"
						<?php
							if(isset($_POST['tour'])=="TP HCM - Phú Quốc"){
                                echo "selected";
                            }
						?>>
						TP HCM - Phú Quốc</option>
				<option value="TP HCM - Cần Thơ"
						<?php
							if(isset($_POST['tour'])=="TP HCM - Cần Thơ"){
                                echo "selected";
                            }
						?>>
						TP HCM - Cần Thơ</option>
				<option value="TP HCM - Mỹ Tho"
						<?php
							if(isset($_POST['tour'])=="TP HCM - Mỹ Tho"){
                                echo "selected";
                            }
						?>>
						TP HCM - Mỹ Tho</option>
			</optgroup>
        </select></td>
      </tr>
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Ngày khởi hành:</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input type="text" name="ngay" id="ngay" value="<?php echo $ngay;?>"></td>
      </tr>
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Phương tiện di chuyển</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><select name="phuongtien" id="phuongtien">
          <option value="Máy bay"
				  <?php
				  	if(isset($_POST['phuongtien'])=="Máy bay"){
              echo "selected";
            }
				  ?>
				  >Máy bay</option>
          <option value="Tàu hỏa"
				  <?php
				  	if(isset($_POST["phuongtien"])=="Máy bay"){
              echo "selected";
            }
				  ?>
				  >Tàu hỏa</option>
          <option value="Xe hơi"
				  <?php
				  	if(isset($_POST["phuongtien"])=="Xe hơi"){
              echo "selected";
            }
				  ?>
				  >Xe hơi</option>
          <option value="Tàu thủy"
				  <?php
				  	if(isset($_POST["phuongtien"])=="Tàu thủy"){
              echo "selected";
            }
				  ?>
				  >Tàu thủy</option>
          <option value="Xe máy"
				  <?php
				  	if(isset($_POST["phuongtien"])=="Xe máy"){
              echo "selected";
            }
				  ?>
				  >Xe máy</option>
        </select></td>
      </tr>
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Số lượng đăng ký:</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input type="text" name="soluong" id="soluong" value=<?php echo $soluong?>></td>
      </tr>
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Tên khách hàng:</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input type="text" name="tenkhach" id="tenkhach" value=<?php echo $tenkhach?>></td>
      </tr>
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Liên hệ theo địa chỉ:</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input type="text" name="diachi" id="diachi" value=<?php echo $diachi?>></td>
      </tr>
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Số điện thoại</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input type="text" name="dienthoai" id="dienthoai" value=<?php echo $dienthoai?>></td>
      </tr>
      <tr>
        <td colspan="2" align="center" bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Những yêu cầu kèm theo</td>
      </tr>
      <tr>
        <td colspan="2" align="center" bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><textarea name="yeucau" cols="60" rows="2" id="yeucau"><?php echo $yeucau;?></textarea></td>
      </tr>
      <tr>
        <td colspan="2" align="center"><input type="submit" name="submit" id="submit" value="Đăng Ký Tour"></td>
      </tr>
    </tbody>
  </table>
</form>
<?php
if(!empty($_REQUEST['tenkhach'])&& !empty($_REQUEST['diachi'])){
  $tentour = $_REQUEST['tour'];
  $ngay = $_REQUEST['ngay'];
  $phuongtien = $_REQUEST['phuongtien'];
  $soluong = $_REQUEST['soluong'];
  $tenkhach = $_REQUEST['tenkhach'];
  $diachi = $_REQUEST['diachi'];
  $dienthoai = $_REQUEST['dienthoai'];
  $yeucau = $_REQUEST['yeucau'];
  $soluong = $_POST['soluong'];  

    switch($phuongtien){
      case "Máy bay":
        $sotien1nguoi = 1*tientour($tour);
        break;
      case "Tàu hỏa":
          $sotien1nguoi = 0.95*tientour($tour);
          break;
      case "Xe hơi":
          $sotien1nguoi = 0.9*tientour($tour);
          break;
      case "Tàu thủy":
          $sotien1nguoi = 0.9*tientour($tour);
          break;
      case "Xe máy":
          $sotien1nguoi = 0.8*tientour($tour);
          break;  
    }
    //tinh tiền
    if($soluong<10)
      $tongtien = $sotien1nguoi*$soluong;
    elseif($soluong>=10 &&  $soluong<20)
      $tongtien = 0.95*($sotien1nguoi*$soluong);
    elseif($soluong>=20 && $soluong<50)
      $tongtien = 0.9*($sotien1nguoi*$soluong);
    elseif($soluong>=50)
      $tongtien = 0.8*($sotien1nguoi*$soluong);
    	echo "<table width='600' border='0' align='center' cellpadding='1' cellspacing='1' bgcolor='##A8C8F5' >
    		 <tr align='center' ><td><b><font color='#FF0000'>THÔNG TIN ĐẶT CHỔ</font></b></td></tr>";

    	echo "<tr align='left'><td>
    			Khách hàng đã chọn Tour:<b><i>$tour</i></b></br>
    			Ngày khởi hành: $ngay</br>
    			Phương tiện: $phuongtien</br>";

    	echo"<tr align='left'><td>
    			Số lượng đăng kýr:<b><i>$soluong Khách</i></b></br>
    			Giá tour/khách: $sotien1nguoi</br>
    			Tổng tiền cho $soluong khách:$tongtien </br>";

    	echo"<tr align='left'><td>
    			Thông tin khách hàng:</br>
    			Họ tên:<b><i>$tenkhach</i></b> - Địa chỉ: $diachi</br>
    			Số điện thoại: $dienthoai</br>";

    	echo"<tr align='left'><td>
    			Các yêu cầu kèm theo:</br>".nl2br(ucfirst($yeucau))."";
}
  else
{

	echo"<p align='center'><font color='#FF0000'>
		<i><strong>Cần phải có thông tin của khách hàng khi đăng ký đặt tour!</i></strong></font></p>";
}	
?>
</body>
</html>