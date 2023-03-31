<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
  <?php
    $link=' ';
    if(isset($_POST['submit']) && isset($_POST['bao'])) {
      $link = $_POST['bao'];
    }
  ?>
<form id="form1" name="form1" method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
  <table width="500" border="0" align="center" cellpadding="1" cellspacing="1" >
    <tbody>
      <tr>
        <td align="center" bgcolor="#EC4007" style="font-weight: bold; color: #E8D6D7;">ĐỌC BÁO TRÊN MẠNG</td>
      </tr>
      <tr>
        <td align="center" style="font-family: Gotham, 'Helvetica Neue', Helvetica, Arial, sans-serif">Chọn Báo Muốn Đọc: 
          <label for="bao">Select:</label>
          <select name="bao" id="bao">
            <option value="http://tuoitre.com.vn">Báo Tuổi Trẻ</option>
            <option value="http://thanhnien.com.vn">Báo Thanh Niên</option>
            <option value="http://vnexpress.net">Báo Việt Nam Express</option>
        </select></td>
      </tr>
      <tr>
        <td align="center" style="font-family: Gotham, 'Helvetica Neue', Helvetica, Arial, sans-serif"><input type="submit" name="submit" id="submit" value="Đến Báo Muốn Đọc"></td>
        <td><a href="<?php echo $link; ?>"><?php echo $link; ?></a></td>
      </tr>
    </tbody>
  </table>
</form>
<!-- code tại đây -->
<?php
	
?>
</body>
</html>