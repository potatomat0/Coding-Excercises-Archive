
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>

<body>
<!-- code tại đây -->
<?php
    $diem1=0;
    $diem2=0;
    $diemtb=0;
    $kq="";
    $xl="";
    if(isset($_POST['diem1'])&& isset($_POST['diem2']) && isset($_POST['submit'])){
        if(is_numeric($_POST['diem1'])){
            $diem1=$_POST['diem1'];
        }else{
            $diem1="bạn phải nhập số";
        }
        if(is_numeric($_POST['diem2'])){
            $diem2=$_POST['diem2'];
        }else{
            $diem2="bạn phải nhập số";
        }
        $diemtb = ($diem1+($diem2*2))/3;
        if($diemtb>=5){
            $kq = "lên lớp";
        }else{
            $kq = "ở lại lớp";
        }
        if($diemtb<5){
           $xl = "học sinh yếu";
        }elseif($diemtb >= 5 && $diemtb < 6){
            $xl = "học sinh trung bình";
        }elseif($diemtb >= 6 && $diemtb < 8){
            $xl ="Học sinh khá";
        }else{
            $xl = "học sinh giỏi";
        }
    }
?>
<form action="cau4.php"<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?> method="post" name="form1" id="form1">
  <table width="360" border="0" align="center" cellpadding="1" cellspacing="1" bgcolor="#5DC0F0">
    <tbody>
      <tr>
        <td colspan="2" align="center" style="color: #F7070B">KẾT QUẢ HỌC TẬP</td>
      </tr>
      <tr>
        <td width="110">Điểm HK1</td>
        <td width="243"><input type="text" name="diem1" id="diem1" value="<?php echo $diem1?>"></td>
      </tr>
      <tr>
        <td>Điểm HK2</td>
        <td><input type="text" name="diem2" id="diem2" value="<?php echo $diem2?>"></td>
      </tr>
      <tr>
        <td>Điểm TB</td>
        <td><input name="diemtb" type="text" id="diemtb" readonly="readonly" value="<?php echo $diemtb?>"></td>
      </tr>
      <tr>
        <td>Kết quả</td>
        <td><input name="ketqua" type="text" id="ketqua" readonly="readonly" value="<?php echo $kq?>"></td>
      </tr>
      <tr>
        <td>Xếp loại học lực</td>
        <td><input name="xeploai" type="text" id="xeploai" readonly="readonly" value="<?php echo $xl?>"></td>
      </tr>
      <tr>
        <td colspan="2" align="center"><input type="submit" name="submit" id="submit" value="Xếp loại"></td>
      </tr>
    </tbody>
  </table>
</form>
</body>
</html>