<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tao - ghi va doc file</title>
<style type="text/css">
.style1 {
	color: #FFFFFF;
	font-family: LucidaHandwriting, LucidaCalligraphy;
}
.style6 {font-family: Verdana, Arial, Helvetica, sans-serif; font-size: smaller; }
</style>
</head>

<body>
<form id="form1" name="form1" method="post" action="taofile.php">
  <table width="500" border="0" align="center" cellpadding="2" cellspacing="2" bgcolor="#DB95B8">
    <tr bgcolor="#BDBAE7">
      <td colspan="2" bgcolor="#CC3366"><h2 align="center" class="style1">TẠO - GHI VÀ ĐỌC FILE VỪA TẠO</h2>      </td>
    </tr>
    <tr>
      <td width="93"><span class="style6">Tên file: </span></td>
      <td width="393"><label>
        <input name="ten_file" type="text" id="ten_file" />
      </label></td>
    </tr>
    <tr>
      <td valign="top"><span class="style6">Nội dung: </span></td>
      <td>
        <textarea name="noi_dung" cols="50" rows="4" id="noi_dung"></textarea>      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="submit" name="Submit" value="Ghi và đọc file" />      </td>
    </tr>
  </table>
</form>
<?php
    $ten_file = "";
    $noi_dung = "";
    if(isset($_POST['ten_file']) && isset($_POST['noi_dung'])){
        $ten_file = $_POST['ten_file'];	
        $noi_dung = $_POST['noi_dung'];
        //b1: tạo file
        $file=fopen($ten_file, 'w+');
        fwrite($file, $noi_dung);
        fclose($file);
        echo "<p align='center'<b>Write file success</b></p>";
        //b2
        // echo "<table border='0' align='center' bdcolor='#DB87B'cellspacing='2' cellpadding='2'<tr><td>";
        // echo "<b>Nội dung của file</b>";
        // $file=fopen($ten_file, 'r+');
        // while (!feiof($file)){
        //     $noi_dung = fgets($file,1000);
        //     echo "<br/>" .$noi_dung;
        // }
        // echo "</td></tr></table>";
        // echo "<br/><b>Đọc file success</b>";
    }
?>
</body>
</html>
