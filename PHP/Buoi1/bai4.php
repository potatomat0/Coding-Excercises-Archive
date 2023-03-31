<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bài tập cơ bản số 4</title>
</head>
<body>
    <?php
    $a = 7;
    $b = 10;

    //tính tổng
    function cong($a=7,$b=10) {
        $s = $a+$b;
        return $s;
    }

    //tính hiệu
    function tru($a,$b) {
        $d = $a-$b;
        return $d;
    }

    //tính tích
    function nhan($a,$b) {
        $p = $a*$b;
        return $p;
    }
    //tính thương
    function chia($a,$b) {
        $q = $a/$b;
        return $q;
    }

    echo "giá trị của biến a là ".$a." và biến b là ".$b."<br>";
    echo "giá trị của phép cộng hai biến a và b là: ".cong()."<br>"; //hàm trả giá trị mặc định
    echo "giá trị của phép 3+5 là: ".cong(3,5)."<br>";
    echo "giá trị của phép 21-9 là: ".tru(21,9)."<br>";
    echo "giá trị của phép 7*7 là: ".nhan(7,7)."<br>";
    $chia_var = 'chia'; //gán hàm thành một biến
    echo "giá trị của phép 10/5 là: ".$chia_var(10,5)."<br>";

    
    ?>
</body>
</html>