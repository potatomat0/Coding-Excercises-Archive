<?php 

$loaiTiec = ['tiệc sáng', 'tiệc trưa', 'tiệc tối'];
$soKhach = 1;
$hoaDon = 0;

foreach($loaiTiec as $lt) {
    if ($lt === "tiệc sáng") {
        ($soKhach <=100)? ($hoaDon += ($soKhach*50000)) : ($hoaDon += (($soKhach-100)*40000) + 3000000 );
    }
    if($lt === "tiệc trưa")
    {
        ($soKhach <=100)? ($hoaDon += ($soKhach * 60000)) : ($hoaDon += ($soKhach * 50000));
    }
    if($lt === "tiệc tối") {
        $hoaDon = $hoaDon + ($soKhach * 100000);
    }
}
//tính thuế 10% thuế:
$hoaDon *= 1.1;




?> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <p><?php  
        echo $hoaDon
    ?></p>
</body>
</html>