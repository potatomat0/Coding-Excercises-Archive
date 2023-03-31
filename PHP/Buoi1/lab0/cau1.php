<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>so sánh hai số</title>
</head>
<body>
    <?php
    
    $firstnumber = rand(1,100);
    $secondnumber = rand(10,100);
    
    if ($firstnumber>$secondnumber) {echo $firstnumber." > ".$secondnumber;}
    else  {echo $firstnumber." < ".$secondnumber;}
    ?>
</body>
</html>