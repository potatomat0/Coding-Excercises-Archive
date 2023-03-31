Mon 7:15 AM
Hải
Trần Hải
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
    <!-- code tại đây -->
    <?php
    $ngay = "";
    $thang = "";
    $nam = "";
    $xuatthu="";
        if(isset($_POST['ngay'])&& isset($_POST['thang'])&& isset($_POST['nam'])){
            $ngay = $_POST['ngay'];
            $thang = $_POST['thang'];
            $nam = $_POST['nam'];
            $jd = cal_to_jd(CAL_GREGORIAN,$thang,$ngay,$nam);
            $day=jddayofweek($jd,0);
            switch($day){
                case 0:
                    $thu="Chủ Nhật";
                    break;
                case 1:
                    $thu="Thứ high";
                    break;
                case 2:
                    $thu="Thứ bar";
                    break;
                case 3:
                    $thu="Thứ pho";
                    break;
                case 4:
                    $thu="Thứ năm";
                    break;
                case 5:
                    $thu="Thứ sáu";
                    break;
                case 6:
                    $thu="Thứ bải";
                    break;   
            }
            $xuatthu="Ngày $ngay Tháng $thang Năm $nam là $thu";
        }
    ?>
    <div class="form-login">
        <div class="form-login-item">
            <h2>TÌM THỨ TRONG TUẦN</h2>
            <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="POST">
                <div class="form-items">
                    <label for="">Ngày/Tháng/Năm:</label>
                    <input class="inp" type="text" name="ngay" size="2" value="<?php echo $ngay;?>">
                    <label for="">/</label>
                    <input class="inp" type="text" name="thang" size="2"  value="<?php echo $thang;?>">
                    <label for="">/</label>
                    <input class="inp" type="text" name="nam" size="2"  value="<?php echo $nam;?>">
                </div>
            
                <div class="form-items">
                    
                    <input type="text" size="49" width= "372px"  name="thanhtoan" readonly="true" style="background-color:#FFCCCC" value="<?php echo $xuatthu?>">
                   
                </div>
                <div class="submit-button">
                    <input type="submit" value="Tìm thứ  trong tuần">
                </div>
            </form>


        </div>
    </div>
</body>
</html>