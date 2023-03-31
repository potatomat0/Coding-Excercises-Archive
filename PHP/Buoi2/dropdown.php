<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="dropdown.php" method="post">
        <p>hãy chọn trái cây yêu thích</p>
        <select name="traicay[]" multiple>
            <option value="Tao">Táo</option>
            <option value="Chuoi">Chuối </option>
            <option value="Dua">Dừa</option>
            <option value="DauTay">Dâu tằm</option>
            <option value="DauTay">Dâu tây</option>
        </select>
        <br>
        <button type="submit" name="submit">Xác nhận</button>
    </form>

    <!-- code xử lý  -->
    <?php
  if(isset($_POST['submit'])){
    if(!empty($_POST['traicay'])) {
        echo "<br> Trái cây bạn yêu thích là: <br>";
      foreach($_POST['traicay'] as $selected){
        echo '  ' . $selected;
      }          
    } else {
      echo 'làm ơn hãy nhập lựa chọn';
    }
  }
?>
</body>
</html>