<html>
  <?php 
    class image{
      private $title;
      private $src;
      private $alt;
      private $width;
      private $height;
      private $border;
      private $align;

      function __construct() {
        $this->src = ' ';
        $this->align = ' ';
        $this->title = ' ';
        $this->width = 0;
        $this->height = 0;
        $this->border = 0;
        $this->align = ' ';
        
      }

      function setTitle($title) {$this->title = $title;}
      function setSrc($src) {$this->src = $src;}
      function setAlt($alt) {$this->alt = $alt;}
      function setWidth($width) {$this->width = $width;}
      function setHeight($height) {$this->height = $height;}
      function setBorder($border) {$this->border = $border;}
      function setAlign($align) {$this->align = $align;}

      function getTitle() {
        return $this->title;
      }
      function getSrc() {
        return $this->src;
      }
      function getAlt() {
        return $this->alt;
      }
      function getWidth() {
        return $this->width;
      }
      function getHeight() {
        return $this->height;
      }
      function getBorder() {
        return $this->border;
      }
      function getAlign() {
        return $this->align;
      }

      function hien_thi_hinh_anh(){
        echo "<table align='{$this->getAlign()}'>
        <tr align='{$this->getAlign()}'>
        <td class='style13'><b>{$this->getTitle()}</b></td></tr><tr><td>";
        echo "<img src='{$this->getSrc()}'
             width='{$this->getWidth()}' 
             height='{$this->getHeight()}' 
             border='{$this->getBorder()}'
             alt='{$this->getAlt()}'>";
         echo "</td></tr></table>";
      }
    }

    $title = "";
    $src = "";
    $alt = "";
    $width = "";
    $height = "";
    $border = "";
    $align = "";
  
  ?>
<head>
<title>Hien thi hinh anh</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.style4 {
	font-family: MERcuriusScript, MYstical, NUeva;
	font-size: 20px;
	color: #CA4B00;
}
.style13 {font-family: Verdana, Arial, Helvetica, sans-serif; font-size: smaller; }

</style>
</head>

<body>
<form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="post" enctype="multipart/form-data" name="form1">
  <table width="450" border="0" align="center" cellpadding="2" cellspacing="2" bgcolor="#FFEBCA">
    <tr bgcolor="#B8C9D1">
      <td colspan="4" align="center" bgcolor="#FFCC66"><span class="style4">HIỂN THỊ HÌNH ẢNH </span></td>
    </tr>
    <tr>
      <td><span class="style13">&nbsp; Tiêu đề:</span></td>
      <td colspan="3"><input name="title" type="text" id="title" size="40"></td>
    </tr>
    <tr>
      <td width="154"><p class="style13">&nbsp;&nbsp;Đường dẫn hình:</p></td>
      <td colspan="3"><input name="src" type="text" id="src" size="40"></td>
    </tr>
    <tr>
      <td><p class="style13">&nbsp;&nbsp;Dòng ghi chú:</p></td>
      <td colspan="3"><input name="alt" type="text" id="alt" size="40"></td>
    </tr>
    <tr>
      <td><p class="style13">&nbsp;&nbsp;Chiều rộng:</p></td>
      <td width="55"><input name="width" type="text" id="width" size="8"></td>
      <td width="83"><span class="style13">Chiều cao:</span></td>
      <td width="132"><input name="height" type="text" id="height" size="8"></td>
    </tr>
    <tr>
      <td><p class="style13">&nbsp;&nbsp;Đường viền:</p></td>
      <td><input name="border" type="text" id="border" size="8"></td>
      <td><span class="style13">Canh lề:      </span></td>
      <td><span class="style13">
        <label>
        <select name="align" id="align">
          <option value="left">left</option>
          <option value="right">right</option>
          <option value="center">center</option>
        </select>
        </label>
      </span></td>
    </tr>
    <tr>
      <td height="30" colspan="4" align="center"><label></label>
      <input type="submit" name="Submit" value="Hiển thị"></td>
    </tr>
  </table>
</form>
<?php 
    if(isset($_POST['Submit'])) {
      if(isset($_POST['src']) && isset($_POST['width']) && isset($_POST['height'])) {
        $title = $_POST['title'];
        $src = $_POST['src'];
        $src = stripslashes($src);
        $alt = $_POST['alt'];
        $width = $_POST['width'];
        $height = $_POST['height'];
        $border = $_POST['border'];
        $align = $_POST['align'];

        $hinh = new image();
        $hinh-> setTitle($title);
        $hinh->setWidth($width);
        $hinh->setHeight($height);
        $hinh->setAlign($align);
        $hinh->setBorder($border);
        $hinh->setSrc($src);
        $hinh->setAlt($alt);

        $hinh->hien_thi_hinh_anh();

      } 
      else{
        echo "<script>alert('Làm ơn nhập đầy đủ thông tin 🙏🏿🙏🏻') </script>";
      }
    }
  ?>
</body>
</html>
