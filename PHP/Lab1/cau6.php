<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bài 6 - Tính năm</title>
</head>
<body>
<?php
    if(isset($_POST['duong'])){
        $namdl=$_POST['duong'];
        if(is_numeric($namdl)){ 
            $namtru=$namdl - 3;
            //tinh can
            $nam = $namtru%10;
            switch($nam){
                case 0:
                    $can ="Quý";
                    break;
                case 1:
                    $can ="Giáp";
                    break;
                case 2:
                    $can ="Ất";
                    break;
                case 3:
                    $can ="Bính";  
                    break;  
                case 4:
                    $can ="Đinh";
                    break;
                case 5:
                    $can ="Mậu";
                    break;
                case 6:
                    $can ="Kỷ";
                    break;
                case 7:
                    $can ="Canh";
                    break;
                case 8:
                    $can ="Tân";
                    break;    
                case 9:
                    $can ="Nhâm";
                    break;
            }
            $nam = $namtru%12;
            switch($nam){
                case 0:
                    $chi ="Hợi";
                    break;
                case 1:
                    $chi ="Tý";
                    break;
                case 2:
                    $chi ="Sửu";
                    break;
                case 3:
                    $chi ="Dần";  
                    break;  
                case 4:
                    $chi ="Mão";
                    break;
                case 5:
                    $chi ="Thìn";
                    break;
                case 6:
                    $chi ="Tỵ";
                    break;
                case 7:
                    $chi ="Ngọ";
                    break;
                case 8:
                    $chi ="Mùi";
                    break;    
                case 9:
                    $chi ="Thân";
                    break;
                case 10:
                    $chi="Dậu";
                    break;
                case 11:
                    $chi="Tuất";
                    break;
            }
            $namal = $can . " " .$chi;
        }
    }
?>
    <form action="" method="post">
        <table width="350" border="0" align="center" cellpadding="2"> 
            <tr align="center">
                <td colspan="3"><span>Tính năm âm lịch</span></td>
            </tr>
            <tr>
                <td width="133"><p align="center"><span>Năm dương lịch</span></p></td>
                <td width="57"><span>
                        <label for="">/</label>
                </span></td>
                <td width="140" align="center">Năm âm lịch</td>
            </tr>
            <td align=""center>
                <input type="text" size="10" name="duong" value="<?php echo $namdl;?>">
            </td>
            <td>
                <input type="submit" value="=>">
            </td>
            <td align=""center>
                <input type="text" size="10" name="am" value="<?php echo $namal;?>">
            </td>
        </table>
    </form>
</body>
</html>
