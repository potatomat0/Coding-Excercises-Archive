<?php 
$flag = 0;
if(isset($_POST['name']) && isset($_POST['submit'])) {
    $_SESSION['name'] = $_POST['name'];
    $_SESSION['email'] = $_POST['email'];
    $_SESSION['username'] = $_POST['username'];
    $_SESSION['password'] = $_POST['password'];
}
?> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="demosession.php" method="post">
        Tên: <input type="text" name="name"> <br>
        Email: <input type="mail" name="email"> <br>
        Username: <input type="text" name="username"> <br>
        password: <input type="password" name="password">
        <input type="submit" name="submit">
    </form>
</body>
</html>