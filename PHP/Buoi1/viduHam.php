<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hàm viết phép nhân</title>
</head>
<body>

    <?php
    //biến toàn cục
    $a = 7;
    $b = 12;

    //biến tĩnh không cần tạo đối tượng mà có thể tạo đối tượng, khi ra khỏi hàm vẫn giữ nguyên giá trị


    //hàm phép nhân
    function phepnhan($num1, $num2) {
        $r = $num1 * $num2;
        return $r;
    }



    //giá trị mặc định của hàm
    function setNam($name='noname') {
        echo "Name is ".$name;
    }
    setNam('PHP');  //Name is PHP
    setNam();       //Name is noname


    echo phepnhan(3,4);


    function addFive(&$number) { //Tham chiếu
        $number += 5;
        return $number;
    }
    
    $a = 10;
    echo addFive($a);
    echo $a;
    
    //Kết quả in ra là :
    //15
    //15 (giá trị $a bị thay đổi do là tham chiếu của hàm)


     //Cách gọi thông thường:
    $a = 5;
    echo phepnhan(5,6);
    echo addFive($a);
    
    //Gọi thông qua một biến lưu tên hàm.
    
    $func1 = 'phepnhan';
    $func2 = 'addFive';
    
    
    echo $func1(5,6); // ..........tương đương gọi phepnhan(5,6)
    echo $func2($a);  
    ?>
</body>
</html>