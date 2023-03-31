<?php
session_start();
?>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
<?php
  $mangtour=array('Hà Nội'=>5500000,'Huế'=>750000,'Nha Trang'=>1000000,'Vũng Tàu'=>500000);
  $manghinh=array('Hà Nội'=>'cuoi_1.jpg','Huế'=>'cuoi_2.jpg','Nha Trang'=>'cuoi_3.jpg','Vũng Tàu'=>'cuoi_4.jpg');
  $hinh="";
  $gia=0;
?>
<form action="on2session.php" method="post" name="form1" id="form1">
  <table width="600" border="0" align="center" cellpadding="1" cellspacing="1">
    <tbody>
      <tr>
        <td colspan="2" align="center" bgcolor="#17335A" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif; color: #F5E6E7; font-weight: bold;">ĐĂNG KÝ TOUR DU LỊCH</td>
      </tr>
      <tr>
        <td width="173" bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Tên tour</td>
        <td width="420" bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">
		<select name="tour" id="tour">
		<?php
			// lấy key để hiện thị lên màn hình
      //  $manghinh=array('Hà Nội'=>'cuoi_1.jpg','Huế'=>'cuoi_2.jpg','Nha Trang'=>'cuoi_3.jpg','Vũng Tàu'=>'cuoi_8.jpg');
      // giả sử ban đầu không chọn
      $selectchon="";
      if(isset($_POST['tour']))
      {
        $selectchon=$_POST['tour'];//Nha trang
        foreach($manghinh as $key=>$value)
        {
          if($selectchon==$key)
          {
            $hinh=$value;
          }
        }
      }
      foreach($mangtour as $key=>$value):
		?>
      <option value="<?php echo $key?>"
       <?php 
       if($selectchon==$key)
       {
        $gia=$value;
        echo "selected";
       }
      ?>>
        <?php echo $key?>
      </option>
    <?php
      endforeach;
    ?>
    </select></td>
      </tr>
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Ngày khởi hành:</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input required type="date" min="<?php echo date("Y-m-d")?>" name="ngay" id="ngay"  value="<?php 
          if(isset($_POST['ngay'])) {echo $_POST['ngay'];}
        ?>" >
          
        </td>
      </tr>
      
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Số lượng đăng ký:</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input required type="number" min="1" name="soluong" 
          value="<?php if(isset($_POST['soluong'])) {echo $_POST['soluong']; }  ?>"
        id="soluong"></td>
      </tr>
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Tên khách hàng:</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input required type="text" name="tenkhach" id="tenkhach"
             value="<?php if(isset($_POST['tenkhach'])) {echo $_POST['tenkhach']; }  ?>"
        ></td>
      </tr>
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Liên hệ theo địa chỉ:</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input type="tel" required name="diachi" id="diachi"
             value="<?php if(isset($_POST['diachi'])) {echo $_POST['diachi']; }  ?>"
        ></td>
      </tr>
      <tr>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Số điện thoại</td>
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input type="text" name="dienthoai" id="dienthoai"
           value="<?php if(isset($_POST['dienthoai'])) {echo $_POST['dienthoai']; }  ?>"
        ></td>
      </tr>
      <tr>
        <td colspan="2" align="center" bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">Hiển thị hình:</td>
      </tr>
      <tr>
        <td colspan="2" align="center" bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif">
        <?php 
          $hidden = 'hidden';
          if(isset($_POST['submit'])) {
            $hidden = "";
          }
        ?>
        <img src="images2\<?php echo $hinh;?>" <?php echo $hidden ?> alt="Girl in a jacket" width="280" height="80">
		</td>
      </tr>
      <tr>
        <td colspan="2" align="center"><input type="submit" name="submit" id="submit" value="Đăng Ký Tour"></td>
      </tr>
    </tbody>
  </table>
</form>
<?php
  $tenkhach="";
  $diachi="";
  $sodt="";
  $tour="";
  $sokhach=0;
  $thanhtien=0;
  if(isset($_POST['tenkhach']))
  {
    $tenkhach=$_POST['tenkhach'];
    $diachi=$_POST['diachi'];
    $sodt=$_POST['dienthoai'];
    $tour=$_POST['tour'];
    $sokhach=$_POST['soluong'];
    $thanhtien=$gia*$sokhach;
    // tạo đối tượng
    $item=array(
      'ten_khach'=>$tenkhach,
      'dia_chi'=>$diachi,
      'so_dt'=>$sodt,
      'tour'=>$tour,
      'gia'=>$gia,
      'so_khach'=>$sokhach,
      'thanh_tien'=>$thanhtien,
      'hinh'=>$hinh
    );
    $_SESSION['thongtin'][]=$item;
    // $a[]=$tiem; $a[]=2;
  }

?>
<?php
  if(isset($_SESSION['thongtin'])):
?>
<table class="table" align="center" cellspacing="0" border="1">
        <tr>
            <th>Tên khách hàng</th>
            <th>Địa chỉ</th>
            <th>Số điện thoại</th>
            <th>Tour</th>
            <th>Giá</th>
            <th>số khách</th>
            <th>Thành tiền</th>
            <th>Hình</th>
        </tr>
          <?php
            for($i=0;$i<count($_SESSION['thongtin']);$i++):
          ?>
            <tr> 
              <td>
                <?php echo $_SESSION['thongtin'][$i]['ten_khach'];?>
              </td>
              <td>
              <?php echo $_SESSION['thongtin'][$i]['dia_chi'];?>
              </td>
              <td>
              <?php echo $_SESSION['thongtin'][$i]['so_dt'];?>
              </td>
              <td>
              <?php echo $_SESSION['thongtin'][$i]['tour'];?>
              </td>
              <td>
              <?php echo $_SESSION['thongtin'][$i]['gia'];?>
              </td>
              <td>
              <?php echo $_SESSION['thongtin'][$i]['so_khach'];?>
              </td>
              <td>
              <?php echo $_SESSION['thongtin'][$i]['thanh_tien'];?>
              </td>
              <td>
                <img src="images2/<?php echo $_SESSION['thongtin'][$i]['hinh'];?>" width="50" height="50"/>
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