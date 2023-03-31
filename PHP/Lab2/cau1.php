<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>So sánh chuỗi</title>
</head>
<body>
   
    <?php
        $str1 = ' ';
        $str2 = ' ';
        $thongbao = ' ';
        if(isset($_POST['submit']) && isset($_POST['str2']) && isset($_POST['str1'])) {
            $str1 = $_POST['str1'];
            $str2 = $_POST['str2'];
            if (strcmp($str1, $str2) == 0) {
                $thongbao = ' Hai chuỗi bằng nhau';
            }

            elseif (strcmp($str1, $str2) >0) {
                $thongbao = ' Chuỗi 1 lớn hơn chuỗi 2';
            }

            else $thongbao = 'Chuỗi 2 lớn hơn chuỗi 1';
        } 
            
        
    ?>

    <form action="cau1.php"<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?> method="post" name="form1" id="form1">
            <label for="str1"><input type="text" name="str1" value="">Nhập chuỗi 1</label> <br>
            <label for="str2"><input type="text" name="str2" value="">Nhập chuỗi 2</label> <br>
            <input type="submit" name="submit" id="submit" value="So sánh"> <br>
            <input type="text" readonly value="<?php echo $thongbao ?>">        
        </form>
    
</body>
</html>