<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bài tập cơ bản số 2</title>
</head>
<body>
    <?php

    $url = 'https://www.javascripttutorial.net/javascript-multidimensional-array/';
    $url = parse_url($url);

    //in ra các thành phần của url
    echo 'Scheme: '.$url['scheme']."<br>";
    echo 'Host: '.$url['host']."<br>";
    echo 'Path: '.$url['path']."<br>";

    ?>
</body>
</html>