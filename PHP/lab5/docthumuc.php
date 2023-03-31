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
</style>
</head>

<body>
<form action="docthumuc.php" method="post" name="form1" id="form1">
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
  $tem_tm = "";
  if(isset($_POST["ten_tm"])) {
    $ten_tm = $_POST;
  }
    $dir0 = opendir("../../php1");
	// code tiep phan gan vao cho option
  if($dir0){
    //tiến hành đọc nội dung 
    while(($file=readdir($dir))!==false){
      //chỉ muốn hiển thị ra là thư mục
      //$chuoi = ly@itc.edu.vn
      //$a = strstr(chuỗi,"@") => $a =@itc.edu.vn
      //$a => strstr(@chuoi, "@",true) => $a = ly
      if(strstr($file,".")===false){
        echo "<option value='$file'>$file</option>";
      }
    }
  }
		?>
  
		?>
      </select></td>
  </tr>
  <tr>
    <td colspan="2" align="center">
      <input type="submit" name="Submit" value="Đọc thư mục">    </td>
    </tr>
</table>
</form>
  <?php 
    $tem_tm = "";
    if(isset($_POST["ten_tm"])) {
      $ten_tm = $_POST["ten_tm"];
      $dir=opendir($ten_tm);
      if($dir) {
        while(($file==readdir($dir))!==false){
          if($file!="."&&$file!="..") {
            if(strstr($file,".")) {
              echo "<img src='images/img1.jpg'>$file<br>";
            }
            else {
              echo "<img src='images/img2.jpg'>$file<br>";
            }
          }
        }
      }
  
    }
  
  ?>
</body>
</html>
