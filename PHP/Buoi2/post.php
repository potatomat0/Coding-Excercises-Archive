<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="post.php" method="post">
        <p>user name:</p>
        <input type="text" name="user" placeholder="type here">
        <p>password:</p>
        <input type="text" name="password" placeholder="password here">
        <button type="submit">ok</button>
    </form>

    <!-- code xử lý -->
    <?php
    //dữ liệu gửi từ postDemo thì trước đó lưu lên server
    //cụ thể là lư vào biến toàn cục $_POST = array ('user'=> nhat, 'password'=>1)
    //nếu dùng phương thức post thì thông tin được đưa vào file postDemo sẽ không được hiện ra url
    if(isset($_POST['user']) && isset($_POST['password'])){
        $user_name = $_POST['user'];
        $password = $_POST['password'];
        echo "Tên đăng nhập: ".$user_name."<br>"."Mật khẩu: ".$password;
    }

?>

</body>
</html>