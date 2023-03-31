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
            width: 500px;
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
<!-- code đây -->
<div class="form-login">
        <div class="form-login-item">
            <h2>THANH TOÁN TIỀN ĐIỆN</h2>
            <form action="cau3_thanhtoantiendien.php" method="POST">
                <div class="form-items">
                <label for="">Tên Chủ Hộ:</label>
                    <input type="text" name="user" value="">
                </div>
                <div class="form-items">
                    <label for="">Chỉ số cũ:</label>
                    <input type="number" name="chisocu" value="">
                </div>
                <div class="form-items">
                    <label for="">Chỉ số mới:</label>
                    <input type="number" name="chisomoi" value="">
                </div>
                <div class="form-items">
                    <label for="">Đơn giá:</label>
                    <input type="number" name="dongia" value="2000">
                </div>
                <div class="form-items">
                    <label for="">Số tiền thanh toán:</label>
                    <input type="text" name="thanhtoan" readonly="true" style="background-color:#FFCCCC" value="
                    
                    <?php 
                            if (isset($_POST["chisocu"]) && isset($_POST["chisomoi"]) && isset($_POST["dongia"])){
                                $cscu = $_POST["chisocu"];
                                $csmoi = $_POST["chisomoi"];
                                $dgia = $_POST["dongia"];
                                echo ($csmoi-$cscu)*$dgia;
                            }
                        ?>
                    
                    ">
                    <span>
                        (VNĐ)
                    </span>
                </div>
                <div class="submit-button">
                    <input type="submit" value="Tính">
                </div>
            </form>

        <!-- code xử lý -->
            

        </div>
    </div>
</body>
</html>