<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
<form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="POST" name="form1" id="form1">
  <table width="500" border="0" align="center" cellpadding="1" cellspacing="1">
    <tbody>
      <tr>
        <td align="center" bgcolor="#D540E9" style="font-weight: bold; color: #F5E8E8;">ĐĂNG KÝ PHÒNG DẠY</td>
      </tr>
      <tr>
        <td align="center">Phòng số: 
          <label for="phong">Select:</label>
          <select name="phong" id="phong">
            <option value="A001">A001</option>
            <option value="B001">B001</option>
            <option value="Giảng đường 1">Giảng đường 1</option>
            <option value="Giảng đường 2">Giảng đường 2</option>
        </select></td>
      </tr>
      <tr>
        <td align="center">Giáo Sư Giảng Dạy:
        <input name="gv" type="text" id="gv" value=""></td>
      </tr>
      <tr>
        <td align="center">Ngày/ Tháng. Năm
          <label for="ngay">Select:</label>
          <select name="ngay" id="ngay">
		  <?php
           for($i=0;  $i < 13; $i++) {
            $d=explode(":",date('h:i:s:m:d:Y'));
            $time = mktime($d[0],$d[1],$d[2],$d[3],$d[4]+$i,$d[5]);
            $date = date("d/m/Y", $time);
            echo "<option value='$date'>$date </option>";
           }
			
		  ?>
        </select></td>
      </tr>
      <tr>
        <td align="center"><input type="submit" name="submit" id="submit" value="Ghi Nhận"></td>
      </tr>
    </tbody>
  </table>
</form>
<!-- hiển thị đây -->
<?php
  $phong = "";
  $gv = "";
  if(isset($_POST['phong'])&& isset($_POST['gv'])){
      $phong = $_POST['phong'];
      $gv = $_POST['gv'];
      
	echo "<table width='500' border='0' align='center' cellpadding='1' cellspacing='1' bgcolor='#FFBFAA'>";
	echo "<tr> <td align='center'>";
	echo	"Kết Quả Sau Khi Bấm Ghi Nhận </td></tr>";
	echo "<tr><td align='center'>";
	echo "	Ngày $date </br>";
	echo "	Giáo Sư $gv đã dạy phòng $phong"; 
	echo "</td></tr></table>";
  }
    ?>
<!-- end -->
</body>
</html>