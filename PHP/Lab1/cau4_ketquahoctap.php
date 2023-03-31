<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
<!-- code tại đây -->
<form action="cau4_ketquahoctap.php" method="post" name="form1" id="form1">
  <table width="360" border="0" align="center" cellpadding="1" cellspacing="1" bgcolor="#5DC0F0">
    <tbody>
      <tr>
        <td colspan="2" align="center" style="color: #F7070B">KẾT QUẢ HỌC TẬP</td>
      </tr>
      <tr>
        <td width="110">Điểm HK1</td>
        <td width="243"><input type="number" name="diem1" id="diem1" value=""></td>
      </tr>
      <tr>
        <td>Điểm HK2</td>
        <td><input type="number" name="diem2" id="diem2" value=""></td>
      </tr>
      <tr>
        <td>Điểm TB</td>
        <td><input name="diemtb" type="number" id="diemtb" readonly="readonly" value="<?php echo intb() ?>"></td>
      </tr>
      <tr>
        <td>Kết quả</td>
        <td><input name="ketqua" type="text" id="ketqua" readonly="readonly" value="<?php echo inketqua() ?>"></td>
      </tr>
      <tr>
        <td>Xếp loại học lực</td>
        <td><input name="xeploai" type="text" id="xeploai" readonly="readonly" value="<?php echo inhocluc() ?>"></td>
      </tr>
      <tr>
        <td colspan="2" align="center"><input type="submit" name="submit" id="submit" value="Xếp Loại"></td>
      </tr>
    </tbody>
  </table>
</form>


  <?php 

      function check() {
        $flag = false;
        if( isset($_POST['submit']) && isset($_POST['diem1']) && isset($_POST['diem2']) ) {
          $hk1 = floatval($_POST['diem1']);
          $hk2 = floatval($_POST['diem2']);
          $dtb = ($hk1+$hk2*2)/3;
          $ketqua = ' ';
          $hocluc = ' ';
          $flag = true;
          return $flag;  
      }          
    }


    function ketquahocluc() {
      global $dtb, $ketqua, $hocluc;
      switch ($dtb) {
        case $dtb <5:
          $ketqua = 'Ở lại lớp';
          $hocluc = 'Yếu';
          break;
        case $dtb >=5:
          $ketqua = 'Được lên lớp';
          if($dtb <6.5) {$hocluc = 'Trung bình';}
          if ($dtb >=6.5 && $dtb < 8 ) {$hocluc = 'Khá';}
          else {$hocluc = 'Giỏi';}
          break;
      }
      $ketquahl = array(0=> $dtb, 1 => $ketqua, 2 =>$hocluc);
      return $ketquahl;
    }



    function intb() {
      check();
      ketquahocluc();
      global $ketquahl;
      $key = array_search(0, $ketquahl);
      return $key;}
    
    function inhocluc () {
      check();
      ketquahocluc();
      global $ketquahl;
      $key = array_search(1, $ketquahl);
      return $key;
    }

    function inketqua() {
      check();
      ketquahocluc();
      global $ketquahl;
      $key = array_search(2, $ketquahl);
      return $key;
    }

  ?>
</body>
</html>