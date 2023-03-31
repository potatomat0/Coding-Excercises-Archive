<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tao - ghi va doc file</title>
<style type="text/css">
.style1 {
	font-family: LucidaHandwriting, LucidaCalligraphy;
	font-size: 20px;
	font-weight: bold;
	color: #FFFFFF;
}
.style6 {font-family: Verdana, Arial, Helvetica, sans-serif; font-size: smaller; }
</style>
</head>

<?php 
session_start();
$dirname = "./images";
$images = glob($dirname."*.jpg");
$tenFile = "./text.txt";
?>

<body>
<form id="form1" name="form1" method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
  <table width="350" border="0" align="center" cellpadding="2" cellspacing="2" bgcolor="#DB95B8">
    <tr bgcolor="#BDBAE7">
      <td colspan="2" bgcolor="#CC3366"> <div align="center"><span class="style1">TẠO - GHI - ĐỌC FILE CÓ ĐỊNH DẠNG</span></div></td>
    </tr>
    <tr>
      <td><span class="style6">&nbsp;Hãy chọn hình ảnh: </span></td>
      <td>
        <select name="selectImage" id="">
          <?php 
        //   foreach($images as $image) {
        //     echo "<option value='$image'>$image</option>";
        // }
        foreach(glob('./images/*.*') as $filename){
          echo "<option value='$filename'>$filename</option>";
      }
          ?>
        </select>
      </td>
    </tr>
    <tr>
      <td><span class="style6">&nbsp;Tên hàng </span></td>
      <td><label>
        <input required name="ten_hang" type="text" id="ten_hang" size="25" />
      </label></td>
    </tr>
    <tr>
      <td><span class="style6">&nbsp;Số lượng </span></td>
      <td><input required name="sl" type="number" min="1" id="sl" size="15" /></td>
    </tr>
    <tr>
      <td width="103"><span class="style6">&nbsp;Đơn giá </span></td>
      <td width="233"><label>
        <input required name="dg" type="number" min="1" id="dg" size="15" />
      </label></td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="submit" name="Submit" value="Ghi và đọc file" />      </td>
    </tr>
  </table>
</form>
  <?php 
    $_SESSION['cart']=array(
      array(),
    ); 
    $selectImage = " ";
    $tenHang = " ";
    $soLuong = 0;
    $donGia = 0;
    $thanhTien = 0 ;
    $i = 0;
    if(isset($_POST['selectImage'])) {
      $selectImage = $_POST['selectImage'];
      $tenHang = $_POST['ten_hang'];
      $soLuong = $_POST['sl'];
      $donGia = $_POST['dg'];
      $thanhTien = floatval( $soLuong)* floatval( $donGia );
    //   "tenHang"=>"0",
    // "soLuong"=> 0,
    // "donGia"=> 0,
    // "thanhTien"=> 0
      // $b=array("tenHang"=>"$tenHang","soLuong"=>"$soLuong","donGia"=>"$donGia","thanhTien"=>"$thanhTien","selectImage"=>"$selectImage");
      // array_push($_SESSION['cart'],$b);

      // $max=sizeof($_SESSION['cart']);


      // for($i=0; $i<$max; $i++) { 
      //   foreach($_SESSION['cart'][$i] as $key) {
      //     echo "<tr>";
      //       foreach($key as $k => $v) {
      //         echo "<td>$v</td>";
      //       }
      //     echo "</tr>";
      // }
      // }
      // echo " </table>";  
                


      //bước 1: mở file
      $file = fopen($tenFile, "a+");
      //bước 2: ghi vào fwwrite
      $sanPham = $tenHang."\t".$soLuong."\t".$donGia."\t".$thanhTien."\t"."$selectImage\n";

      fwrite($file,$sanPham);

      $file = fopen($tenFile, 'r');
     

           //  in bảng
           echo "<table border='1'>
           <tr>
             <th>Tên mặt hàng</th>
             <th>Số lượng</th>
             <th>Đơn giá</th>
             <th>Thành tiền</th>
             <th>hình ảnh</th>
           </tr>";


        while (!feof($file)) { //đọc d liệu trong file
          echo "<tr>";
          
          $current  = fgets($file, 1000);
          $mang = explode( "\t", $current); //ở đây phải dùng "" thay vì '' đối với seprarator operator, không thôi sẽ chỉ dồn hết string vào một index

          if(!feof($file)) {
            echo "<td> $mang[0]</td>";
            echo "<td>$mang[1]</td>";
            echo "<td>$mang[2]</td>";
            echo "<td>$mang[3]</td>";
            echo "<td><img src='$mang[4]' width='50' height='50'></td>";
            // echo "<td> $mang[4]</td>";
          }
          
          echo "</tr>";
        }
        echo " </table>";
        
        fclose($file);

    }
  
  ?>
  <!-- <img src="./images/milos.jpg" width="50" height="50" alt=""> -->
</body>



</html>
