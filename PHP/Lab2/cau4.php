<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        label {
            text-align: center;
            margin-left: auto;
            margin-top: 15px;
            margin-right: auto;
        }
    </style>
</head>
<body>
    <?php 
        $chuoi = "";
        $thongbao = "";
        if(isset($_POST['chuoi']) && isset($_POST['tim'])) {
            $chuoi = $_POST['chuoi'];
            $tim = $_POST['tim'];
            $kq = strpos($chuoi, $tim);
            if ($kq !== false) {
                $thongbao = "tìm thấy $tim ở vị trí ".$kq;

            }
            else {
                $thongbao = "không tìm thấy trong chuỗi";
            }
        }
    
    ?>
    <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?> methodpost">
        <label for="">Chuỗi<input type="text" name="chuoi" ></label> <br>
        <label for="">Từ cần tìm<input type="text" name="tim"></label>
        <input type="submit" value="tìm">
        <br>
        <label for="">Kết quả 
        <input type="text" readonly value="<?php echo $thongbao ?>"></label>
    </form>
</body>
</html>