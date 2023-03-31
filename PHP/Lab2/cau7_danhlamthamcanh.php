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
            width: 700px;
            height: auto;
            background: #fff1f1;
            margin: 0 auto;
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            
        }
        img{
            width:300px;
            height:300px;
        }
        
</style>
<body>
    <?php
        //tạo biến chuỗi
        $chuoi = '';
        //tạo mảng
        $content = '';
        $mang_dl=array(array('ma'=>"nt",'ten'=>"Biển Nha Trang",'hinh'=>"nha_trang.jpg"),

        array('ma'=>"dl",'ten'=>"Thành Phố Đà Lạt",'hinh'=>"da_lat.jpg"),

        array('ma'=>"vt",'ten'=>"Biển Vũng Tàu",'hinh'=>"vung_tau.jpg"),

        array('ma'=>"hl",'ten'=>"Vịnh Hạ Long",'hinh'=>"ha_long.jpg"),

        array('ma'=>"pt",'ten'=>"Biển Phan Thiết",'hinh'=>"phan_thiet.jpg"),

        array('ma'=>"ht",'ten'=>"Biển Hà Tiên",'hinh'=>"ha_tien.jpg"),

        array('ma'=>"pq",'ten'=>"Đảo Phú Quốc",'hinh'=>"phu_quoc.jpg"),

        );
        //Viết hàm so sánh
        function sosanh($x,$y) {
            if ($x['ma']==$y['ma']) return 0;
            
            return ($x['ma']<$y['ma'])? -1: 1;

        }
            //phương thức usort--> nếu sắp xếp thành công --> true
        usort($mang_dl,"sosanh");
        //dùng vòng lặp lấy ra mã và tên
        foreach ($mang_dl as $mang) {
            $ten = $mang['ten'];
            $madd = $mang['ma'];
            $chuoi .= "<a  href='#$madd' ><b>$ten</b></a> <br>";
        }
        //dùng vòng lặp lấy hình và thông tin
        foreach ($mang_dl as $mang) {
            $ten = $mang['ten'];
            $mdd = $mang['ma'];
            $hinh = $mang['hinh']; //chỉ lấy ra tên hình
            $hinh_anh = "<img src='thang_canh/$hinh'/>";
            $content = $content."<div id='$mdd'><p align='center'><b>$ten</b><br>$hinh_anh<br><a href='#top'>Quay về đầu trang</a></p></div>";
        }

    ?>
    
<form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="POST" class="form-login">
    <table border="1" width="600px">
    <caption style="caption-side: top; font-size:20px; color:red"><h1><b>DANH LAM THẮNG CẢNH</b></h1></caption>
    <tr>
        <td id="top">
            <b>Danh sách địa danh</b>
            
        </td>
        <td id="" rowspan="2"><?php echo $content ?></td>
       
    </tr>
    <tr >
        <td rowspan="2" ><?php echo $chuoi; ?> </td>
        <!-- <td>Abc2</td> -->
       
    </tr>
    
</table>
    </form>
</body>
</html>