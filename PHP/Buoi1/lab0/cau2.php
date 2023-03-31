<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>tìm số lớn nhất</title>
</head>
<body>
    <?php
    
    $a= rand(1,100);
    $b = rand(10,100);
    $c = rand(1,100);
    
    echo "a:".$a." b:".$b." c:".$c;
    // $max = $a;
    // if($b>$a) 
    // {
    //     $max = $b;
    // }
    // elseif ($c>$b) { $max = $c; }
    // echo "<br> số lớn nhất là: ".$max;
    echo "<br> số lớn nhất là: ".max($a,$b,$c);
    
    ?>
</body>
</html>