<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="#" method="post">
        <p>Những ngôn ngữ lập trình mà bạn biết là:</p>
        <input type="checkbox" name="check_list[]" value="C/C++"><label>C/C++</label><br/>
        <input type="checkbox" name="check_list[]" value="Java"><label>Java</label><br/>
        <input type="checkbox" name="check_list[]" value="PHP"><label>PHP</label><br/>
        <input type="checkbox" name="check_list[]" value="Python"><label>Python</label><br/>
        <input type="checkbox" name="check_list[]" value="Javascript"><label>Javascript</label><br/>
        <input type="submit" name="submit" value="Submit"/>
    </form>
    <?php
        if(isset($_POST['submit'])){//Chỉ chạy khi được submit
            if(!empty($_POST['check_list'])){
            // Sử dụng vòng lặp foreach
            foreach($_POST['check_list'] as $selected){
                echo $selected."</br>";
            }
            }
        }
        else{echo "Làm ơn chọn những phương án";}
    ?>
</body>
</html>