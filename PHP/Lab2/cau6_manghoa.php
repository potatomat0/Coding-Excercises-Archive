<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<style>
    .form-login{
            width: 700px;
            height: auto;
            background: #fff1f1;
            margin: 0 auto;
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        h2{
            text-align: center;
            margin: 0 0 10px 0;
        }
        input[type="text"]{
            border-radius: 5px;
            margin-bottom: 7px;
            border: 1px solid #ddd;
            width: 372px;
            height: 35px;
        }
        .form-items{
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        input[type="submit"]{
            padding: 9px 20px;
            color: #fff;
            border-radius: 5px;
            border: 1px solid #9eb3ff;
            background: #9eb3ff;
            text-transform: uppercase;
            cursor: pointer;
        }
        .submit-button{
            display: flex;
            justify-content: flex-end;
        }
</style>
<body>
    <!-- code tai đây -->
    <?php
        $rauqua = "";
        $giorau = "";
        $ketqua="";
        function checkrau($rauqua, $mangrau){
            $n =  count($mangrau);
            $flag=0;
            //duyệt qua mảng , nếu có tên rau trung với phân tử 
            //trong mảng thì là có rồi
            for($i = 0;$i<$n;$i++){
                if(strcasecmp($rauqua,$mangrau[$i])==0){
                    $flag=1;
                }
            }
            return $flag;
        }
        if(isset($_POST['rauqua'])){
            $rauqua=$_POST['rauqua'];
            $mangrau=array();
            $mangrau = explode("--", trim($_POST['gio_rau']));
            $n = count($mangrau);
            if(checkrau($rauqua, $mangrau)==1){
                $ketqua = "đẫ có <b> trong giỏ hàng";
            }else{
                $mangrau[$n]=$rauqua;
            }
            $giorau=implode("--",$mangrau);
        }

    ?>
<div class="form-login">
        <div class="form-login-item">
            <h2>MUA RAU QUẢ</h2>
            <form action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="POST">
                <div class="form-items">
                    <label for="">Rau quả bạn chọn:</label>
                    <input type="text" name="rauqua" size="2" value="<?php echo $rauqua ?>">
                    <input type="submit" value="Thêm Vào Giỏ Hàng">
                </div>
                <div class="form-items">
                    <label for="">Giở hàng bạn chọn:</label>
                    
                   
                </div>
                <div class="form-items">
                    
                    <span><?php echo $ketqua ?>hiển thị đây</span>
                    <textarea id="ketqua" name="gio_rau" rows="4" cols="50"> <?php echo $giorau ?></textarea>
                    <span>hien thi đây</span>             
                </div>             
            </form>
        </div>
    </div>
</body>
</html>