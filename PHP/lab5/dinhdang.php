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

<body>
<form id="form1" name="form1" method="post" action="dinhdang.php">
  <table width="350" border="0" align="center" cellpadding="2" cellspacing="2" bgcolor="#DB95B8">
    <tr bgcolor="#BDBAE7">
      <td colspan="2" bgcolor="#CC3366"> <div align="center"><span class="style1">TẠO - GHI - ĐỌC FILE CÓ ĐỊNH DẠNG</span></div></td>
    </tr>
    <tr>
      <td><span class="style6">&nbsp;Tên file: </span></td>
      <td><input name="ten_file" type="text" id="ten_file" size="35" value="files/sp.txt"/></td>
    </tr>
    <tr>
      <td><span class="style6">&nbsp;Tên hàng </span></td>
      <td><label>
        <input name="ten_hang" type="text" id="ten_hang" size="25" />
      </label></td>
    </tr>
    <tr>
      <td><span class="style6">&nbsp;Số lượng </span></td>
      <td><input name="sl" type="text" id="sl" size="15" /></td>
    </tr>
    <tr>
      <td width="103"><span class="style6">&nbsp;Đơn giá </span></td>
      <td width="233"><label>
        <input name="dg" type="text" id="dg" size="15" />
      </label></td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="submit" name="Submit" value="Ghi và đọc file" />      </td>
    </tr>
  </table>
</form>
<?php
$ten_file = "";
$ten_hang = "";
$sl = 0;
$dg = 0;
$thanh_tien = 0;
$san_pham = "";
$mang = "";
    if(isset($_POST['ten_file'])){
        $ten_file = $_POST['ten_file'];//tap_tin/sp.txt
        $ten_hang = $_POST['ten_hang'];
        $sl = $_POST['sl'];
        $dg = $_POST['dg'];
        $thanh_tien = $sl * $dg;
        //b1 mở file
        $file = fopen($ten_file, "a+");
        //b2 ghi vào fwrite $san_pham = gao 2 1000 2000
        $san_pham = $ten_hang. "\t" .$sl . "\t". $dg. "\t" .$thanh_tien. "\n";
        fwrite($file, $san_pham);
        fclose($file);
        echo "<p align= 'center'><b>Ghi file thành công</b></p>";
        //nhiệm vị thứ 2 là đọc nội dung của file ra
        //b1: fopen-r
        //b2: while(!feof)
        //$file = 0 1000 2000
        $file = fopen($ten_file, 'r');
        
        //xuất thông tin ra 

        echo "<table width='150' border='0' cellspacing='2' cellpadding='2' class='style6' align='center'>";
        echo "<tr><td>";
        echo "<p align='center'><b>Nội dung của file </b></p>";
        echo "<table border='1' width='100$'";
        echo "<tr>";
        echo "<td>Tên hàng</td>";
        echo "<td>Số lượng</td>";
        echo "<td>Đơn giá</td>";
        echo "<td>Thành tiền</td>";
        echo "</tr>";

        //while 
        while(!feof($file)){
            echo "<tr>";
            //tạo ra mảng chuỗi $san_pham = sữa tắm 4 1000 2000
            $noi_dung=fgets($file, 1000);
            $mang = explode("\t", $noi_dung);
            if(!feof($file)){
            echo "<td> $mang[0] </td>";
            echo "<td> $mang[1] </td>";
            echo "<td> $mang[2] </td>";
            echo "<td> $mang[3] </td>";
            }
            echo "</tr>";

             echo "<tr>";
          
          $current  = fgets($file, 1000);
          $mang = explode('\t', $current); 

          if(!feof($file)) {
            echo "<td> $mang[0]</td>";
            echo "<td>$mang[1]</td>";
            echo "<td>$mang[2]</td>";
            echo "<td>$mang[3]</td>";
          }
          
          echo "</tr>";
        }
        echo "</table>";


    }
?>
</body>
</html>
