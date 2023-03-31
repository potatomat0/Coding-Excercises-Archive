
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Thong tin nhan vien</title>
<style type="text/css">

.style2 {
	font-size: 20px;
	font-family: LucidaHandwriting, LucidaCalligraphy;
	font-weight: bold;
	color: #CA4B00;
}
.style17 {font-family: Verdana, Arial, Helvetica, sans-serif; font-size: smaller; }
.style18 {font-family: Verdana, Arial, Helvetica, sans-serif}

</style>
</head>

<?php 
$dirname = "./images";
$images = glob($dirname."*.jpg");
$tenFile = "de5.txt";
date_default_timezone_set("Asia/Ho_Chi_Minh");
//đảm bảo người đăng ký lớn hơn 18 tuổi
$time = new DateTime('now');
$max = $time->modify('-18 year')->format('Y-m-d');
$today =date("Y-m-d");
?>

<body>

<form id="form1" name="form1" method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
  <table width="70%" border="0" align="center" cellpadding="2" cellspacing="2" bgcolor="#FFEBCA">
    <tr>
      <td colspan="4" align="center" bgcolor="#FFCC66"><span class="style2">THÔNG TIN ĐĂNG KÝ KHÁCH HÀNG</span></td>
    </tr>
    <!-- /* họ tên */ -->
    <tr>
      <td width="18%"><span class="style17">Họ và tên: </span></td>
      <td width="30%"><span class="style17">
        <label>
        <input name="ho_ten" 
        value="<?php 
          if(isset($_POST['ho_ten'])) {echo $_POST['ho_ten'];} ?>"
        required type="text" id="ho_ten" size="25" value="" />
        </label>
      </span></td>
      <!-- /* hình ảnh */ -->
      <td width="24%"><span class="style17">Chọn hình: </span>
      </td>
      <td width="28%"><span class="style17">
        <label>
        <select required name="selectImage" id="selectImage">
        <option value=" ">Hãy chọn một ảnh:</option>
        <?php 
        foreach(glob('./images/*.*') as $filename){
          echo "<option value='$filename'>";
          echo substr($filename,9,strlen($filename)-13);
          echo "</option>";
      }
          ?>
        </select>
        </label>
      </span></td>
    </tr>
    <!-- /* ngày sinh */ -->
    <tr>
      <td valign="middle"><span class="style17">Ngày sinh: </span></td>
      <td><span class="style17">
        <label>
        <input name="ngay_sinh"
        required type="date" id="ngay_sinh" 
        max="<?php echo $max; ?>"
        value="<?php 
          if(isset($_POST['ngay_sinh'])) {echo $_POST['ngay_sinh'];}
        ?>"

        />
        </label>
      </span></td>
      
    </tr>
    <!-- /* giới tính */ -->
    <tr>
      <td><span class="style17">Giới tính: </span></td>
      <td valign="middle"><p class="style17">
        <label>
          <input name="gioi_tinh"
          <?php if(isset($_POST['ngay_sinh'])) {echo "checked='checked'";} ?>
          required  type="radio" value="Nam" />
          Nam </label>
          <label>
          <input type="radio" name="gioi_tinh"
          <?php if(isset($_POST['ngay_sinh'])) {echo "checked='checked'";} ?>
           value="Nữ" 
          />
          Nữ</label>
          </p>
        <span class="style17">
        <label></label>
      </span></td>
      <!-- /* SỞ THÍCH */ -->
      <td><span class="style17">Sở thích: <i>(Nhấn nút ctrl+chuột phải để chọn nhiều) </i></span></td>
      <td><span class="style17">
        <label>
        <select name="so_thich[]" id="so_thich" multiple>
            <option value="Django">Django</option>
            <option value="PHP">PHP</option>
            <option value="Java">Javaspring</option>
            <option value="NodeJS">NodeJS</option>
        </select>
        </label>
      </span></td>
    </tr>
    
    
    <tr>
      <td height="25" colspan="4" align="center" bgcolor="#FFCC66">
        <input type="submit" name="Submit" value="Đăng ký" />       
	 </td>
    </tr>
  </table>
</form>

<?php 
    $selectImage = " ";
    $ho_ten = " ";
    $gioi_tinh = 0;
    $donGia = 0;
    $thanhTien = 0 ;
    $i = 0;
    if(isset($_POST['Submit'])) {
      if($_POST['selectImage']!==" "  && isset($_POST['ho_ten']) && isset($_POST['gioi_tinh']) && isset($_POST['ngay_sinh'])) {
        $selectImage = $_POST['selectImage'];
        $ho_ten = $_POST['ho_ten'];
        $gioi_tinh = $_POST['gioi_tinh'];
        $ngay_sinh = $_POST['ngay_sinh'];
        $diff = date_diff(date_create($ngay_sinh), date_create($today));
        $tuoi = $diff->format('%y');
        if(isset($_POST['so_thich'])==false) {
          $so_thich = 'Bạn không chọn sở thích';
        }
        else{
          $so_thich = implode(" ",$_POST['so_thich'] );
        }
        //bước 1: mở file
        $file = fopen($tenFile, "a+");
        //bước 2: ghi vào fwwrite
        $sanPham = $ho_ten."\t".$ngay_sinh."\t".$tuoi."\t".$gioi_tinh."\t".$so_thich."\t"."$selectImage\n";
  
        fwrite($file,$sanPham);
  
        $file = fopen($tenFile, 'r');
       
  
             //  in bảng
             echo "<br> <center> <table border='1'>
             <tr>
               <th>Họ tên</th>
               <th>Ngày sinh</th>
               <th>Tuổi</th>
               <th>Giới tính</th>
               <th>Sở thích</th>
               <th>hình</th>
             </tr>";
  
  
          while (!feof($file)) { //đọc d liệu trong file
            echo "<tr>";
            
            $current  = fgets($file, 1000);
            $mang = explode( "\t", $current); //ở đây phải dùng "" thay vì '' đối với seprarator operator, không thôi sẽ chỉ dồn hết string vào một index
  
            if(!feof($file)) {
              echo "<td> $mang[0]</td>";
              echo "<td>$mang[1]</td>";
              echo "<td>$mang[2]</td>";
              echo "<td>$mang[3]</td>";
              echo "<td>$mang[4]</td>";
              echo "<td><img src='$mang[5]' width='50' height='50'></td>";
            }
            
            echo "</tr>";
          }
          echo " </table> </center>";
          
          fclose($file);
  
      }
  
      else{
        echo "<script>
        alert('Bạn chưa chọn ảnh kìa')
        </script>";
      }
    }
    
  
  ?>
  
  
</body>
</html>
