<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    

    <?php
        $a = array('a'=> 7,'b'=> 8,'c'=> 9,'d'=> 10,'e'=> 11,'f'=> 12,'g'=> 13,'h'=> 14);
        foreach ($a as $key=>$val) {
            echo $key." = ".$val." "."<br>";

        }
    ?>
    
</body>
</html>