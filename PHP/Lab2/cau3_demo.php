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
    $ngay = "";
    $thang = "";
    $nam = "";
    $chuoi = "";
    if(isset($_POST['ngay'])&& isset($_POST['thang'])&& isset($_POST['nam'])){
        $ngay = $_POST['ngay'];//13
        $thang = $_POST['thang'];//9
        $nam = $_POST['nam'];//13

        //lấy ra ngày tháng năm hiện tại
        $ngayht = date('d');
        $thanght = date('m');
        $namht = date('Y');

        $gioht = date('G');
        $phutht = date('i');
        $giayht = date('s');

        //đổi ngày hiện tại ra giây
        $ngayht = mktime($gioht,$phutht,$giayht,$thanght,$ngayht,$namht); 
        //đổi ngày sinh ra giây
        $ngayst = mktime($gioht,$phutht,$giayht,$thang,$ngay,$namht);//9
        //tìm ngày max
        $ngaymax=($ngayht>$ngayst)?$ngayht:$ngayst;//19
        //tìm ngày min  
        $ngaymin=($ngayht<$ngayst)?$ngayht:$ngayst;//9
        //trừ ra để biết khoảng cách giữa các ngày
        $diff_second=$ngaymax-$ngaymin;//10
        //đổi ra ngày 1 có 86400
        $diff_ngay=floor($diff_second/86400);//3
        if($diff_ngay==0){
            $chuoi = "chúc mừng sinh nhật thằng iem";
        }
        if($diff_ngay>0){
            if($ngaymin==$ngayst)//9==9
            {
                $chuoi = "ngày sinh nhật còn tới $diff_ngay ngày mới tới nhá iem dai";
            }
            else{
                $chuoi = "adu mé còn có $diff_ngay là tới sn chú em r";
            }
        }
        //tính tuổi
        $tuoi =$namht-$nam;
        $chuoi = "năm nay chú iem đã đc $tuoi tuổi cũng nhanh phết ".$chuoi;
    }
?>
<div class="form-login">
        <div class="form-login-item">
            <h2 >NGÀY SINH</h2>
            <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="POST">
                <div class="form-items">
                    <label for="">Ngày/Tháng/Năm:</label>
                    <input class="inp" type="text" name="ngay" size="2" value="<?php echo $ngay ?>">
                    <label for="">/</label>
                    <input class="inp" type="text" name="thang" size="2"  value="<?php echo $thang ?>">
                    <label for="">/</label>
                    <input class="inp" type="text" name="nam" size="2"  value="<?php echo $nam ?>">
                </div>
            
                <div class="form-items">
                    
                   <!-- <input type="text" size="49" width= "372px"  name="thanhtoan" readonly="true" style="background-color:#FFCCCC" value="<?php echo $chuoi;?>"> -->
                   <span>hiển thị kết quả đây : <?php echo $chuoi ?></span>
                   
                </div>
                <div class="submit-button">
                    <input type="submit" value="Thông Báo">
                </div>
            </form>


        </div>
    </div>
</body>
</html>