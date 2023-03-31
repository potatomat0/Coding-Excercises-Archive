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
            width: 372px;
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
<div class="form-login">
        <div class="form-login-item">
            <h2>ĐỊNH DẠNG MÀU NỀN MÀU CHỮ</h2>
            <form action="cau2_mauchu.php" method="POST">
                <div class="form-items">
                    <label for="">Nội Dung:</label>
                    <input type="text" name="noidung">
                </div>
                <div class="form-items">
                    <label for="">Màu Nền:</label>
                    <input type="text" name="maunen">
                </div>
                <div class="form-items">
                    <label for="">Màu Chữ:</label>
                    <input type="text" name="mauchu">
                </div>
                <div class="submit-button">
                    <input type="submit" value="Xem Kết Quả">
                </div>
                <br>
            </form>
<!-- code tại đây -->
<?php 
    if (isset($_POST['noidung']) && isset($_POST['mauchu']) && isset($_POST['maunen'])){
        $text = $_POST['noidung'];
        $background = $_POST['maunen'];
        $color = $_POST['mauchu'];

        echo "<h2 style='color:$color; background:$background;'>$text</h2>";
    }
?>


</body>
</html>