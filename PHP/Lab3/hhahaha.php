<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
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
							
						?>>
						Hà Nội - Hạ Long - Sapa</option>
				<option value="Hà Nội - Hải Phòng"
						<?php
							
						?>>
						Hà Nội - Hải Phòng</option>
				<option value="Hà Nội - Điện Biên"
						<?php
							
						?>>
						Hà Nội - Điện Biên</option>
			</optgroup>
			<optgroup label="Miền Trung">
				<option value="Huế - Bạch Mã - Đà Nẵng"
						<?php
							
						?>>
						Huế - Bạch Mã - Đà Nẵng</option>
				<option value="Nha Trang - Đà Lạt"
						<?php
							
						?>>
						Nha Trang - Đà Lạt</option>
				<option value="Buôn mê thuộc - Gia lai - Komtum"
						<?php
							
						?>>
						Buôn mê thuộc - Gia lai - Komtum</option>
			</optgroup>
			<optgroup label="Miền Nam">
				<option value="TP HCM - Phú Quốc"
						<?php
							
						?>>
						TP HCM - Phú Quốc</option>
				<option value="TP HCM - Cần Thơ"
						<?php
							
						?>>
						TP HCM - Cần Thơ</option>
				<option value="TP HCM - Mỹ Tho"
						<?php
							
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
				  	
				  ?>
				  >Máy bay</option>
          <option value="Tàu hỏa"
				  <?php
				  	
				  ?>
				  >Tàu hỏa</option>
          <option value="Xe hơi"
				  <?php
				  	
				  ?>
				  >Xe hơi</option>
          <option value="Tàu thủy"
				  <?php
				  	
				  ?>
				  >Tàu thủy</option>
          <option value="Xe máy"
				  <?php
				  	
				  ?>
				  >Xe máy</option>
        </select></td>
      </tr>
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Số lượng đăng ký:</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input type="text" name="soluong" id="soluong"></td>
      </tr>
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Tên khách hàng:</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input type="text" name="tenkhach" id="tenkhach"></td>
      </tr>
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Liên hệ theo địa chỉ:</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input type="text" name="diachi" id="diachi"></td>
      </tr>
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Số điện thoại</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input type="text" name="dienthoai" id="dienthoai"></td>
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
<!-- <?php
	
		
		// <table width='600' border='0' align='center' cellpadding='1' cellspacing='1' bgcolor='##A8C8F5' >
		// 	 <tr align='center' ><td><b><font color='#FF0000'>THÔNG TIN ĐẶT CHỔ</font></b></td></tr>
		
		// <tr align='left'><td>
		// 		Khách hàng đã chọn Tour:<b><i>$tour</i></b></br>
		// 		Ngày khởi hành: $ngay</br>
		// 		Phương tiện: $phuongtien</br>
		
		// <tr align='left'><td>
		// 		Số lượng đăng kýr:<b><i>$soluong Khách</i></b></br>
		// 		Giá tour/khách: $sotien1nguoi</br>
		// 		Tổng tiền cho $soluong khách:$tongtien </br>
	
		// <tr align='left'><td>
		// 		Thông tin khách hàng:</br>
		// 		Họ tên:<b><i>$tenkhach</i></b> - Địa chỉ: $diachi</br>
		// 		Số điện thoại: $dienthoai</br>
		
		// <tr align='left'><td>
		// 		Các yêu cầu kèm theo:</br>".nl2br($yeucau)."
		
	
		// <p align='center'><font color='#FF0000'>
		// 	<i><strong>Cần phải có thông tin của khách hàng khi đăng ký đặt tour!</i></strong></font></p>
			
	
?> -->
</body>
</html>