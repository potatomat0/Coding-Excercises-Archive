<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Doc thu muc duoc chon</title>
<style type="text/css">
<!--
.style1 {
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 20px;
	font-weight: bold;
	color: #FFFFFF;
}
.style2 {
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: smaller;
}
-->
</style>
</head>

<body>
<form action="p2_c4_b12_doc_thu_muc_chon.php" method="post" name="form1" id="form1">
<table width="350" border="0" align="center" cellpadding="2" cellspacing="2" bgcolor="#BBEEDB">
  <tr bgcolor="#ACB3CD">
    <td colspan="2" align="center" bgcolor="#339999"><span class="style1">ĐỌC THƯ MỤC ĐƯỢC CHỌN</span></td>
    </tr>
  <tr>
    <td width="160"><span class="style2">Chọn thư mục:</span></td>
    <td width="226">
	<select name="ten_tm" id="ten_tm">
	<?php
	// mo thu muc
    $dir = opendir("...");
	// code tiep phan gan vao cho option
		?>
      </select>    </td>
  </tr>
  <tr>
    <td colspan="2" align="center">
      <input type="submit" name="Submit" value="Đọc thư mục">    </td>
    </tr>
</table>
</form>
  
</body>
</html>
