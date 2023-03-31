<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="cau1_xinchao.php" method="post">
        <label for="">Hãy nhập tên của bạn: <input type="text" name="user" id=""></label>
        <button type="submit" name="submit">Xác nhận</button>
    </form>

    <?php
        if (isset($_POST['user']) && isset($_POST['submit'])) {
            $ten = $_POST['user']; //khai báo và gán $ten cho $_POST['user'] để biến được xác định
            echo "xin chào  $ten";
        }

    ?>
</body>
</html>