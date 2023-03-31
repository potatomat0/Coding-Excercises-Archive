<?php
$ngay = 3;
$thang = 7;
$nam = 2003;
$date1 = new DateTime(date("$nam/$thang/$ngay"));
$date2 = new DateTime(date("Y/m/d"));
$interval = $date1->diff($date2);
echo "difference " . $interval->y . " years, " . $interval->m." months, ".$interval->d." days "; 

// shows the total amount of days (not divided into years, months and days like above)
// echo "difference " . $interval->days . " days ";


// $ngay = 13;
// $thang = 9;
// $nam = 2022;
//     //tạo biến ngày sinh, hôm nay và tuổi
//     $ngaysinh = new DateTime(date("$ngay/$thang/$nam"));
//     $homnay = new DateTime(date("Y/m/d"));
//     $tuoi = $ngaysinh->diff($homnay);


//         //xết điều kiện sinh nhật
//         if (($homnay->m = $ngaysinh ->m) && ($homnay ->d = $ngaysinh->d))
//             $sinhnhat = 'Hôm nay là sinh nhật bạn!';
//         else $sinhnhat = '.';

//         $ketqua = "Tuổi của bạn là ".$tuoi->y." ".$tuoi->m." tháng và ".$tuoi->d." ngày".$sinhnhat;

//         echo $ketqua


?>