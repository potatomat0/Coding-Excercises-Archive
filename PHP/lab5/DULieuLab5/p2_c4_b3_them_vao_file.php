<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Them vao file</title>
<style type="text/css">
<!--
.style1 {color: #FF0000}
.style2 {
	font-family: LucidaHandwriting, LucidaCalligraphy;
	font-size: 20px;
	font-weight: bold;
	color: #FFFFFF;
}
.style9 {font-family: Verdana, Arial, Helvetica, sans-serif; font-size: smaller; }
-->
</style>
</head>

<body>
<form id="form1" name="form1" method="post" action="p2_c4_b3_them_vao_file.php">
  <table width="500" border="0" align="center" cellpadding="2" cellspacing="2" bgcolor="#DB95B8">
    <tr bgcolor="#BDBAE7">
      <td colspan="2" bgcolor="#CC3366"><div align="center"><span class="style2">THÊM NỘI DUNG VÀO FILE</span></div></td>
    </tr>
    <tr>
      <td width="93"><span class="style9">Tên file: </span></td>
      <td width="393"><span class="style9">
        <label>
        <select name="ten_file" id="ten_file">
          <?php
   		
	  ?>
        </select>
        <span class="style1">(*)  </span></label>
      </span></td>
    </tr>
    <tr>
      <td valign="top"><span class="style9">Nội dung: </span></td>
      <td><span class="style9">
        <textarea name="noi_dung" cols="50" rows="4" id="noi_dung"></textarea>
      </span> </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input name="Submit" type="submit" value="Thêm nội dung" />      </td>
    </tr>
    <tr>
      <td colspan="2" align="center"><span class="style9">(*) Các tập tin này nằm trong thư mục tap_tin của ứng dụng </span></td>
    </tr>
  </table>
</form>
(code)
</body>
</html>
