<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <a href="get.php?title=PHP1&web=PHP2">Click me daddy</a>


    //phần code sử lý
    <?php 
        //dữ liệu gửi từ get được lưu trong $_GET, đây là biến toàn cục
        //kiểu mảng $_GET=array('title'=> 'PHP1', 'web'='PHP2')
        //mảng có dạng $GET = array(key=>value), vậy muốn lấy được value phải biết key
        //lấy về kiểm tra biến có tồn tại hay không
        if (isset($_GET['title']) & isset($_GET['web'])) {
            $title = $_GET['title']; //$title = PHP1
            $web = $_GET['web']; //$web = PHP2
            echo "chào mừng bạn đến với $title và $web"; //dùng dấu nháy đôi có thể gắn chuỗi và biến mà không dùng dấu chấm
        }
    ?>
</body>
</html>