<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="radioDemo.php" method="post">
    Favorite drink:
    <label for=""><input type="radio" name="food" id="" value="Pepsi">Pepsi</label>
    <label for=""><input type="radio" name="food" id="" value="Coca">Coke</label>
    <label for=""><input type="radio" name="food" id="" value="Marijuana">Marijuana</label>
    <button type="submit">submit</button>
    </form>


    <!-- code xử lý -->
    <?php 
    if(isset($_POST['food'])){
        $favorite = $_POST['food']; 
        echo "your favorite food is $favorite";
    }
?>
</body>
</html>