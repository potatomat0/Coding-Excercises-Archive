<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

        <form action="demo.php" <?php echo htmlspecialchars($_SERVER['PHP_SELF']); ?> method="post" name="demoo">
            <label for="">Điểm hk1:</label>
            <input type="number" name="diem1" id="diem1" value="">
            <label for="">Điểm hk2: </label>
            <input type="number" name="diem2" id="diem2" value="">
            <label for="">Điểm trung bình:</label>
            <input name="diemtb" type="number" id="diemtb" readonly="readonly" value="<?php echo $dtb; ?>">
            <input type="submit" name="submit" value="xem số phận">
        </form>
        
        
        <?php 
        $hk1 = 0; 
        $hk2 = 0;
        $dtb = 0;
        $hocluc = ' ';
        $ketqua = ' ';
        if (isset($_POST['submit'])) {
            if (isset($_POST['diem1']) && isset($_POST['diem2'])) {
                global $hk1, $hk2, $dtb, $ketqua, $hocluc;
                $hk1 = floatval($_POST['diem1']);
                $hk2 = floatval($_POST['diem2']);
                $dtb = ($hk1 + ($hk2*2))/3;
                
                }
                else echo "vui lòng nhập điểm";
        }

        function indtb() {
            global $dtb;
            echo $dtb;
        }
        ?>
</body>
</html>


