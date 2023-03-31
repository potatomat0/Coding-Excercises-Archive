<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
<!-- code tại đây -->
<form action="KetQuaHocTap.php" method="post" name="form1" id="form1">
  <table width="360" border="0" align="center" cellpadding="1" cellspacing="1" bgcolor="#5DC0F0">
    <tbody>
      <tr>
        <td colspan="2" align="center" style="color: #F7070B">KẾT QUẢ HỌC TẬP</td>
      </tr>
      <tr>
        <td width="110">Điểm HK1</td>
        <td width="243"><input type="text" name="diem1" id="diem1" value=""></td>
      </tr>
      <tr>
        <td>Điểm HK2</td>
        <td><input type="text" name="diem2" id="diem2" value=""></td>
      </tr>
      <tr>
        <td>Điểm TB</td>
        <td><input name="diemtb" type="text" id="diemtb" readonly="readonly" value="<?php indtb() ?>"></td>
      </tr>
      <tr>
        <td>Kết quả</td>
        <td><input name="ketqua" type="text" id="ketqua" readonly="readonly" value=""></td>
      </tr>
      <tr>
        <td>Xếp loại học lực</td>
        <td><input name="xeploai" type="text" id="xeploai" readonly="readonly" value=""></td>
      </tr>
      <tr>
        <td colspan="2" align="center"><input type="submit" name="submit" id="submit" value="Xếp Loại"></td>
      </tr>
    </tbody>
  </table>


  <?php
      $hk1 = 0; 
      $hk2 = 0;
      if (isset($_POST['diem1']) && isset($_POST['diem2']) && isset($_POST['submit'])) {
        global $hk1, $hk2, $dtb;
        $hk1 = floatval($_POST['diem1']);
        $hk2 = floatval($_POST['diem2']);
      }
      else echo "vui lòng nhập điểm";

      $dtb = ($hk1 + ($hk2*2)/3);

      function indtb() {
        global $dtb;
        echo $dtb;
      }

  ?>
</form>
</body>
</html>