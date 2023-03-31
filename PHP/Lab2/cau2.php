<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body class="text-center container">
    <?php 
        $hoten = ' ';
        $ho = ' ';
        $tendem = ' ';
        $ten = ' ';

        if(isset($_POST['submit']) && isset($_POST['hoten']))
        if ($_POST['hoten'] == '') echo "chưa nhập tên kìa:D ??? ";
        else
        {
            $hoten = trim($_POST['hoten']);

            //cách 1: tự nghĩ

                // $i = strpos($hoten, ' '); //vị trí đầu tiên của dấu cách

                // $ho = trim(substr($hoten, 0, $i ));

                // $j = (strlen($hoten)-strlen($ho)) - ($i); //vị trí thứ hai của dấu cách

                // $tendem = trim(substr($hoten, $i , $j ));

                // $ten = trim(substr($hoten, ($j+$i) , strlen($hoten)+1));

            //cách 2: cô bày + chỉnh lại một xíu
                $hoten = explode(' ', $hoten); //chuyển tên thành một mảng
               $dem = count($hoten); //tính độ dài của mảng
               $ho = $hoten[0]; //họ sẽ bằng element thứ 0
               $ten = $hoten[$dem-1]; //tên sẽ bằng element cuối 
               $tendem = array_slice($hoten , 1,-1);



                

                



        }
    ?>

        <form action="cau2.php <?php echo htmlspecialchars($_SERVER['PHP_SELF']); ?>" method="post">
        <div class="mb-1">
            <label for="exampleInputEmail1" class="form-label">Họ tên: <input type="text" name="hoten" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"></label>
        </div>

        <button type="submit" name="submit" class="btn btn-primary">Nhập</button>

        <div class="mb-1">
            <label for="exampleInputPassword1" class="form-label">Họ <input type="text" value="<?php echo $ho ?>" name="ho" readonly class="form-control" id="lastname"></label>
        </div>
        
        <div class="mb-1">
            <label for="exampleInputPassword1" class="form-label">Tên đệm <input type="text" value="<?php echo $tendem ?> " name="tendem" readonly class="form-control" id="midname"></label>
        </div>
        
        <div class="mb-1">
            <label for="exampleInputPassword1" class="form-label">Tên <input type="text" value="<?php echo $ten ?>" name="ten" readonly class="form-control" id="name"></label>
        </div>
        
        </form>
        

</body>
</html>