<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Dich vu nha khoa</title>
<style type="text/css">

.style2 {
	font-size: 20px;
	font-family: LucidaHandwriting, LucidaCalligraphy;
	font-weight: bold;
	color: #CA4B00;
}
.style17 {font-family: Verdana, Arial, Helvetica, sans-serif; font-size: smaller; }
.style18 {font-family: Verdana, Arial, Helvetica, sans-serif}

</style>
</head>

<body>
<?php
  $mangdichvu=array('tram_rang'=>500000,'nieng_rang'=>70000,'cao_voi'=>1000000,'trong_rang'=>400000);
  $mangdichvukhac=array('tay_trang_rang'=>'0', 'cay_ghep_implant'=>'0','dieu_tri_viem_tuy'=>'0',);

  $gia=0;
?>
   
<form id="form1" name="form1" method="post" action="de4.php">
  <table width="70%" border="0" align="center" cellpadding="2" cellspacing="2" bgcolor="#FFEBCA">
    <tr>
      <td colspan="4" align="center" bgcolor="#FFCC66"><span class="style2">DỊCH VỤ NHA KHOA</span></td>
    </tr>
    <!-- /* họ tên */ -->
    <tr>
      <td width="18%"><span class="style17">Họ và tên: </span></td>
      <td width="30%"><span class="style17">
        <label>
        <input name="ho_ten" type="text" id="ho_ten" size="25" value="" />
        </label>
      </span></td>
      <!-- /* dịch vụ */ -->
      <td width="24%"><span class="style17">Chọn dịch vụ: </span></td>
      <td width="28%"><span class="style17">
        <label>
        <input name="tram_rang" type="checkbox" value="" />Trám răng<br>
        <input name="nieng_rang" type="checkbox" value=""/>Niềng răng<br>
        <input name="cao_voi" type="checkbox" value=""/>Cạo vôi<br>
        <input name="trong_rang" type="checkbox" value=""/>Trồng răng<br>
        </label>
      </span></td>
    </tr>
    <!-- /* ngày sinh */ -->
    <tr>
      <td valign="middle"><span class="style17">Ngày sinh: </span></td>
      <td><span class="style17">
        <label>
        <input name="ngay_sinh" type="date" id="ngay_sinh" size="20" value=""/>
        </label>
      </span></td>
      <td><span class="style17">Số lượng: </span></td>
      <!-- /* số lượng */ -->
      <td><span class="style17">
        <label>
        <input name="so_luong" type="number" min="1" id="so_luong" size="20"/>
        </label>
      </span></td>
    </tr>
    <!-- /* giới tính */ -->
    <tr>
      <td><span class="style17">Giới tính: </span></td>
      <td valign="middle"><p class="style17">
        <label>
          <input name="gioi_tinh" type="radio" value="0" />
          Nam</label>
          <label>
          <input type="radio" name="gioi_tinh" value="1" />
          Nữ</label>
          </p>
        <span class="style17">
        <label></label>
      </span></td>
      <!-- /* các dịch vụ khác */ -->
      <td><span class="style17">Dịch vụ khác: </span></td>
      <td><span class="style17">
        <label>
        <select name="dich_vu_khac[]" id="dich_vu_khac" multiple>
                <option value="tay_trang_rang">Tẩy trắng răng</option>
                <option value="cay_ghep_implant">Cấy ghép Implant</option>
                <option value="dieu_tri_viem_tuy">Điều trị viêm tủy</option>
     
        </select>
        </label>
      </span></td>
    </tr>
    
    
    <!-- /* tổng tiền*/ -->
    <tr>
      <td colspan="4" align="center" class="style17">Tổng tiền: 
        <label>
        <input name="tong_tien" type="text" id="thuc_linh" readonly="true" value=""/>
        </label>      </td>
    </tr>
    <tr>
      <td height="25" colspan="4" align="center" bgcolor="#FFCC66">
        <input type="submit" name="Submit" value="Tổng tiền" />       
	 </td>
    </tr>
  </table>
</form>
<?php
  $hoten="";
  $ngaysinh="";
  $gioitinh="";
  $dichvu="0";
  $soluong=0;
  $dichvukhach="0";

  if(isset($_POST['ho_ten']))
  {
    $hoten=$_POST['ho_ten'];
    $ngaysinh=$_POST['ngay_sinh'];
    $gioitinh=$_POST['gioi_tinh'];
    $dichvu=$_POST['dich_vu'];
    $dichvukhac=$_POST['dich_vu_khac'];
    $diff = date_diff(date_create($ngay_sinh), date_create($today));
    $tuoi = $diff->format('%y');
    $soluong=$_POST['so_luong'];
    $thanhtien=$gia*$dichvu;
    // tạo đối tượng
    $item=array(
      'ho_ten'=>$hoten,
      'ngay_sinh'=>$ngaysinh,
      'gioi_tinh'=>$gioitinh,
      'dich_vu'=>$dichvu,
      'tuoi'=>$tuoi,
      'so_luong'=>$soluong,
      'thanh_tien'=>$thanhtien,
      'dich_vu_khac'=>$dichvukhac
     
    );
    $_SESSION['de3'][]=$item;
 
  }

?>
<?php
  if(isset($_SESSION['de3'])):
?>
<table class="table" align="center" cellspacing="0" border="1">
        <tr>
            <th>Tên khách hàng</th>
            <th>Ngày sinh</th>
            <th>Giới tính</th>
            <th>Chọn dịch vụ</th>
            <th>Tuổi</th>
            <th>Số lượng</th>
            <th>Dịch vụ khác</th>
            <th>Tổng tiền</th>
          
        </tr>
          <?php
            for($i=0;$i<count($_SESSION['de3']);$i++):
          ?>
            <tr> 
              <td>
                <?php echo $_SESSION['de3'][$i]['ho_ten'];?>
              </td>
              <td>
              <?php echo $_SESSION['de3'][$i]['ngay_sinh'];?>
              </td>
              <td>
              <?php echo $_SESSION['de3'][$i]['gioi_tinh'];?>
              </td>
              <td>
              <?php echo $_SESSION['de3'][$i]['dich_vu'];?>
              </td>
              <td>
              <?php echo $_SESSION['de3'][$i]['tuoi'];?>
              </td>
              <td>
              <?php echo $_SESSION['de3'][$i]['so_luong'];?>
              </td>
              <td>
              <?php echo $_SESSION['de3'][$i]['dich_vu_khac'];?>
              </td>
              <td>
              <?php echo $_SESSION['de3'][$i]['thanh_tien'];?>
              </td>
             
            </tr>
          <?php
            endfor;
            // session_destroy();
          ?>
    </table>
<?php
endif;
?>
</body>
</html>
