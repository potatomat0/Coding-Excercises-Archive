<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<style>
    .form-login{
            width: 500px;
            height: auto;
            background: #fff1f1;
            margin: 0 auto;
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        h2{
            text-align: center;
            margin: 0 0 10px 0;
        }
        input[type="text"]{
            border-radius: 5px;
            margin-bottom: 7px;
            border: 1px solid #ddd;
            
        }
        .inp{
            width: 72px;
            height: 35px;
        }
        .form-items{
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        input[type="submit"]{
            padding: 9px 20px;
            color: #fff;
            border-radius: 5px;
            border: 1px solid #9eb3ff;
            background: #9eb3ff;
            text-transform: uppercase;
            cursor: pointer;
        }
        .submit-button{
            display: flex;
            justify-content: flex-end;
        }
</style>
<body>
    

<?php 
    $ngay = ' ';
    $thang = ' ';
    $nam = ' ';
    $ketqua = ' ';
    if(isset($_POST['submit']) && isset($_POST['ngay']) && isset($_POST['thang']) && isset($_POST['nam'])) {
        
        $ngay = $_POST['ngay'];
        $thang = $_POST['thang'];
        $nam = $_POST['nam'];
        //lấy ra ngày tháng năm hiện tại
        $ngay_ht = date('d');
        $thang_ht = date('m');
        $nam_ht = date('Y');
        //lấy giờ hiện tại
        $gio_ht = date('G');
        $phut_ht = date('i');
        $giay_ht = date('s');
        //đổi ngày hiện tai ra giây
        $ngay_ht = mktime($gio_ht, $phut_ht, $giay_ht, $thang_ht, $ngay_ht,$nam_ht);
        //đổi ngày sinh ra giây
        $ngay_sn = mktime($gio_ht, $phut_ht, $giay_ht, $thang, $ngay, $nam_ht);
        //tìm ngày max
        $ngay_max = ($ngay_sn < $ngay_ht) ? $ngay_sn : $ngay_ht;
        //tìm ngày min
        $ngay_max = ($ngay_sn > $ngay_ht) ? $ngay_sn : $ngay_ht;
        //trừ ra để biết khoảng cách giữa các ngày
        $diff_second = $ngay_max - $ngay_min;
        //đổi ra ngày, 1 ngày có 86400s
        $diff_ngay = floor ($diff_second/86400);
        if ($diff_ngay==0) {
            $ketqua = "Chúc mừng sinh nhật! 🎂🎂";
        }
        if ($diff_ngay>0) {
            if($ngay_min==$ngay_sn) {
                $ketqua = "ngày sinh nhật của bạn đã qua $diff_ngay ngày";
            }
            else {
                $ketqua = "còn $diff_ngay ngày nữa là đến sinh nhật của bạn";
            }
        }
        //tính tuổi
        $tuoi = $nam_ht-$nam;
        $ketqua= "Năm nay bạn $tuoi tuổi".$ketqua;

    }
?>

<div class="form-login">
        <div class="form-login-item">
            <h2 >NGÀY SINH</h2>
            <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="POST">
                <div class="form-items">
                    <label for="">Ngày/Tháng/Năm:</label>
                    <input class="inp" type="text" name="ngay" size="2" value="">
                    <label for="">/</label>
                    <input class="inp" type="text" name="thang" size="2"  value="">
                    <label for="">/</label>
                    <input class="inp" type="text" name="nam" size="2"  value="">
                </div>
            
                <div class="form-items">
                    
                   <!-- <input type="text" size="49" width= "372px"  name="thanhtoan" readonly="true" style="background-color:#FFCCCC" value="<?php echo $chuoi;?>"> -->
                   <span><?php echo $ketqua ?></span>
                   
                </div>
                <div class="submit-button">
                    <input type="submit" value="Thông Báo">
                </div>
            </form>


        </div>
    </div>
</body>
</html>