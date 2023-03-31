<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<form action="cau1_dangky.php" method="post" name="form1" id="form1">
        <table width="500" border="0" align="center" cellpadding="1" cellspacing="1">
            <tbody>
                <tr>
                    <td colspan="3" align="center" bgcolor="#606060" style="font-weight: bold">THEO DÕI HỌC TẬP</td>
                </tr>
                <tr>
                    <td width="138">Họ tên học sinh</td>
                    <td width="228"><input type="text" name="tenhs" id="tenhs"></td>
                </tr>
                <tr>
                    <td >Giáo viên phụ trách</td>
                    <td><input type="text" name="gvpt" id="gvpt"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        Lớp <input name="lop" type="text" id="lop" maxlength="10">
                        Ngày <input type="text" name="ngay" id="ngay">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">Những công việc chưa làm</td>
                </tr>
                <tr>
                    <td colspan="2"><textarea name="congviec" id="congviec" rows="3" cols="50"></textarea></td>
                </tr>
                <tr>
                    <td colspan="3">Chọn hình thức hoàn thành</td>
                </tr>
                <tr>
                    <td colspan="3">
                        <p>
                            <input name="tailop" type="checkbox" id="tailop" value="tại lớp">
                            <label for="tailop"></label>
                            Những việc chưa làm sẽ được hoàn thành ngay tại lớp
                        </p>
                    </td>
                </tr>
                <tr>
                    <td colspan="3"><input
                            name="tainha" type="checkbox" id="tainha" value="tại nhà">
                        <label for="tainha"></label>
                        Sẽ hoàn thành những việc chưa làm tại nhà và nộp lại cho giáo viên vào ngày hôm sau
                    </td>
                </tr>
                <tr>
                    <td colspan="3" align="center"><input type="submit" name="submit" id="submit" value="Ghi Nhận"></td>
                </tr>
            </tbody>
        </table>
    </form>
    <!-- code tại đây -->
    <?php
    $tenhs="";
    $lop="";
    $ngay="";
    $gvpt="";
    $congviec="";
    $tailop="";
    $tainha="";
    $chuoi="";
    if(isset($_POST['tenhs']) && isset($_POST['lop']) && isset($_POST['ngay']) && isset($_POST['gvpt']) && isset($_POST['congviec'])){
        $tenhs=$_POST['tenhs'];
        $lop=$_POST['lop'];
        $ngay=$_POST['ngay'];
        $gvpt=$_POST['gvpt'];
        $congviec=$_POST['congviec'];
        $tailop=$_POST['tailop'];
        $tainha=$_POST['tainha'];
        if($tailop!=""){
            $chuoi=$tailop;
        }
        if($tainha!=""){
            $chuoi=$chuoi."-".$tainha;
        }
    }
	?>
    <table width="500" border="0" align="center" cellpadding="1" cellspacing="1" bgcolor="#BD73DD">
        <tbody>
            <tr>
                <td align="center" style="font-weight: bold; color: #EDDEDE;">THÔNG TIN PHIẾU THEO DÕI</td>
            </tr>
            <tr>
                <td style="color: #DDD6D6">Tên học sinh: <?php echo $tenhs;?> - Lớp: <?php echo $lop;?></td>
            </tr>
            <tr>
                <td style="color: #DDD6D6">Ngày đăng Ký: <?php echo $ngay;?> - Giáo viên phụ trách: <?php echo $gvpt;?></td>
            </tr>
            <tr>
                <td style="color: #DDD6D6">Những công việc đã được phân công nhưng chưa hoàn thành: 
                <?php echo $congviec;?></td>
            </tr>
            <tr>
                <td style="color: #DDD6D6">&nbsp;</td>
            </tr>
            <tr>
                <td style="color: #DDD6D6">Cam kết sẽ hoàn thành: <?php echo $tailop;?> - <?php echo $tainha;?></td>
            </tr>
        </tbody>
    </table>
</body>
</html>