
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Đăng ký tour du lịch</title>
</head>

<body>
<?php
  $mangtour=array('Hà Nội'=>5500000,'Huế'=>750000,'Nha Trang'=>1000000,'Vũng Tàu'=>500000);
  $manghinh=array('Hà Nội'=>'cuoi_1.jpg','Huế'=>'cuoi_2.jpg','Nha Trang'=>'cuoi_3.jpg','Vũng Tàu'=>'cuoi_4.jpg');
  $hinh="";
  $gia=0;
  $today =date("Y-m-d") ;
    // tạo ra file muốn lưu
    $ten_file="on2file.txt";
    $file=fopen($ten_file,"a");
    // echo $today;
?>
<form action="on2file.php" method="post" name="form1" id="form1">
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
        <td bgcolor="#A8C8F5" style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif"><input required type="date" min="<?php echo $today?>" name="ngay" id="ngay"  value="<?php 
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
  $mang=array();
  if(isset($_POST['tenkhach']))
  {
    $tenkhach=$_POST['tenkhach'];
    $diachi=$_POST['diachi'];
    $sodt=$_POST['dienthoai'];
    $tour=$_POST['tour'];
    $sokhach=$_POST['soluong'];
    $thanhtien=$gia*$sokhach;
  
    // tạo nội dung để lưu file
    $noidung= $tenkhach."\t".$diachi."\t".$sodt."\t".$tour."\t".$gia."\t".$sokhach."\t".$thanhtien."\t".$hinh."\n";
    fwrite($file,$noidung);
    fclose($file);

    // lấy thông tin ra
   
  }

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
         $file_open=fopen($ten_file,"r");
        //  echo $file_open;
          while(!feof($file_open)):
            $noi_dung=fgets($file_open,1000);
            $mang=explode("\t",$noi_dung);
            if(!feof($file_open)):
        ?>
            <tr> 
              <td>
                <?php echo $mang[0];?>
              </td>
              <td>
              <?php echo $mang[1];?>
              </td>
              <td>
              <?php echo $mang[2];?>
              </td>
              <td>
              <?php echo $mang[3];?>
              </td>
              <td>
              <?php echo $mang[4];?>
              </td>
              <td>
              <?php echo $mang[5];?>
              </td>
              <td>
              <?php echo $mang[6];?>
              </td>
              <td>
                <img height="50" width="50" src="images/<?php echo $mang[7];?>"/>
              </td>
            </tr>
         <?php
            endif;
          endwhile;
          // fclose($file);
         ?>
    </table>

</body>
</html>