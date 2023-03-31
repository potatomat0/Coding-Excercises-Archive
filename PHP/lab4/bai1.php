<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<?php
$kq = 0;
class pheptinh
{
  //thuộc tính
  public $num1;
  public $num2; //nếu dùng tiền tố là var hoặc private thì sẽ có 1 cặp get/set\
  //get trả về giá trị của thuộc tính
  function getn1()
  {
    return $this->num1;
  }
  function setn1($n1)
  {
    $this->num1 = $n1;
  }
  function getn2()
  {
    return $this->num2;
  }
  function setn2($n2)
  {
    $this->num2 = $n2;
  }
  //constructor
  function __construct()
  {
    $this->num1 = 1;
    $this->num2 = 2;
  }

  function sum()
  {
    return $this->getn1() + $this->getn2();
  }
  function dif()
  {
    return $this->getn1() - $this->getn2();
  }
  function pro()
  {
    return $this->getn1() * $this->getn2();
  }
  function quo()
  {
    return $this->getn1() / $this->getn2();
  }
}

?>

<head>
  <title>Phep toan</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <style type="text/css">
    .style1 {
      font-size: large;
      font-weight: bold;
      color: #990000;
    }

    .style2 {
      font-family: Arial, Helvetica, sans-serif
    }

    .style9 {
      font-size: x-large
    }

    .style12 {
      font-family: MERcuriusScript, MYstical, NUeva;
      font-size: 20px;
      color: #CA4B00;
    }

    .style20 {
      font-family: Verdana, Arial, Helvetica, sans-serif;
      color: #2A0000;
      font-size: smaller;
      font-weight: bold;
    }

    .style21 {
      font-family: Verdana, Arial, Helvetica, sans-serif;
      font-size: smaller;
    }
  </style>
</head>

<?php
if (isset($_POST['so_thu_1']) && isset($_POST['so_thu_2'])) {
  $a = $_POST['so_thu_1'];
  $b = $_POST['so_thu_2'];
  $pt = $_POST['phep_tinh'];
  $tinhtoan = new pheptinh();
  $tinhtoan->setn1($a);
  $tinhtoan->setn2($b);
  $tong = "$a+$b=" . $tinhtoan->sum();
  $hieu = "$a-$b=" . $tinhtoan->dif();
  $tich = "$a*$b=" . $tinhtoan->pro();
  if ($b == 0) {
    $thuong = 'loi chia cho 0';
  }
  if ($b <> 0) {
    $thuong = "$a/$b=" . $tinhtoan->quo();
  }
  switch ($pt):
    case '+': {
        $kq = $tong;
        break;
      }
    case '-': {
        $kq = $hieu;
        break;
      }
    case '*': {
        $kq = $tich;
        break;
      }
    case '/': {
        $kq = $thuong;
        break;
      }
  endswitch;
}
?>

<body>
  <form name="form1" method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]); ?>">
    <table width="400" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFEBCA">
      <tr bgcolor="#FFCC66">
        <td colspan="3" align="center" bgcolor="#FFCC66" class="style1 style12">PHÉP TÍNH</td>
      </tr>
      <tr>
        <td width="98"><span class="style20">&nbsp;&nbsp;Số thứ nhất:</span></td>
        <td width="202" colspan="2"><span class="style2">
            <input name="so_thu_1" type="text" id="so_thu_12" size="20">
          </span></td>
      </tr>
      <tr>
        <td><span class="style20">&nbsp;&nbsp;Số thứ hai: </span></td>
        <td colspan="2"><span class="style2">
            <input name="so_thu_2" type="text" id="so_thu_22" size="20">
          </span></td>
      </tr>
      <tr align="center">
        <td height="35" colspan="3">
          <span class="style21">
            <input name="phep_tinh" type="radio" value="+" <?php if (isset($_POST["phep_tinh"]) && $_POST['phep_tinh'] == '+') echo "checked='checked'"; ?>>
            Cộng
            <input type="radio" name="phep_tinh" value="-" <?php if (isset($_POST["phep_tinh"]) && $_POST['phep_tinh'] == '-') echo "checked='checked'"; ?>>
            Trừ
            <input type="radio" name="phep_tinh" value="*" <?php if (isset($_POST["phep_tinh"]) && $_POST['phep_tinh'] == '*') echo "checked='checked'"; ?>>
            Nhân
            <input type="radio" name="phep_tinh" value="/" <?php if (isset($_POST["phep_tinh"]) && $_POST['phep_tinh'] == '/') echo "checked='checked'"; ?>>
            Chia&nbsp; </span>
          <input type="submit" name="Submit" value="Tính">
      </tr>
    </table>
  </form>


  <table width="400" border="1" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFCC">
    <tr bgcolor="#FFCC66">
      <td align="center" class="style12">KẾT QUẢ</td>
    </tr>
    <tr>
      <td align="center" bgcolor="#FFEBCA">
        <?php echo $kq;
        unset($a, $b, $kq); ?> </td>
    </tr>
  </table>

</body>

</html>