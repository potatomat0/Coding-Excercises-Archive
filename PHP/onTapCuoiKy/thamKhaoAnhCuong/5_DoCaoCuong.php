<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Đề 05 - Đỗ Cao Cường</title>
</head>
<body>
    <?php 
    $hoTen = '';
    $giaoVien = '';
    $lop = '';
    $thoiGian = '';
    $comment = '';
    $doClass = '';
    $doHome = '';
    if (isset($_POST['submit'])){
        $hoTen = $_POST['hoTen'];
        $giaoVien = $_POST['giaoVien'];
        $lop = $_POST['lop'];
        $thoiGian = $_POST['thoiGian'];
        $comment = $_POST['comment'];
        if (isset($_POST['doClass'])){
            $doClass = "Tại lớp";
        }
        else{
            $doClass = "";
        }
    
        if (isset($_POST['doHome'])){
            $doHome = " - Tại nhà.";
        }
        else{
            $doHome = "";
        }
    }

    
    ?>
    <form action="" method="POST">
        <div class="container">
        <div class="row" style="background-color: rgb(202, 232, 202);">
            <div class="col-12 bg-success">
                <h1 align="center" style="color:white;">THEO DÕI HỌC TẬP</h1>
            </div>
            <div class="col-8">
                <!-- Họ tên học sinh: -->
                <div class="row my-2">
                    <div class="col-4">
                        Họ tên học sinh:
                    </div>
                    <div class="col-8">
                        <input type="text" class="form-control" name="hoTen" value="<?php echo $hoTen ?>">
                    </div>
                </div>
                <!-- Giáo viên phụ trách: -->
                <div class="row mb-2">
                    <div class="col-4">
                        Giáo viên phụ trách:
                    </div>
                    <div class="col-8">
                        <input type="text" class="form-control" name="giaoVien" value="<?php echo $giaoVien ?>">
                    </div>
                </div>
                <!-- Lớp và ngày -->
                <div class="row mb-2">
                    <div class="col-6">
                        <div class="row">
                            <div class="col-2">
                                Lớp:
                            </div>
                            <div class="col-10">
                                <input type="text" class="form-control" name="lop" value="<?php echo $lop ?>">
                            </div>
                        </div>
                    </div>
                    <div class="col-6">
                        <div class="row">
                            <div class="col-2">
                                Ngày:
                            </div>
                            <div class="col-10">
                                <input type="date" class="form-control" name="thoiGian" name="lop"
                                    value="<?php echo $thoiGian ?>">
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-12 mb-2">
                    <div class="form-group">
                        <label>Những việc phân công chưa làm:</label>
                        <textarea class="form-control" rows="5" id="comment" name="comment"
                            value="<?php echo $comment ?>"></textarea>
                    </div>
                </div>
                <div class="col-12">
                <h5>Chọn hình thức hoàn thành</h5>
                <input type="checkbox" class="form-check-input" name="doClass"> Những việc chưa làm sẽ được hoàn thành
                ngay tại lớp<br>
                <input type="checkbox" class="form-check-input" name="doHome"> Sẽ hoàn thành những việc chưa làm tại nhà
                và nộp lại cho giáo viên vào ngày hôm sau
            </div>
            </div>

            <div class="col-4">
                <img src="https://image.winudf.com/v2/image/Y29tLkRyZWFtV2FsbHBhcGVycy5Cb29rMDFfc2NyZWVuc2hvdHNfMF9mNzdhNGRiNw/screen-0.jpg?fakeurl=1&type=.webp" 
                width="100%;" height="400px">
            </div>

            

            <div align="center">
                <button type="submit" name="submit" class="btn btn-danger my-3">Ghi nhận</button>
            </div>
        </div>
            <p style="color:red; text-align: center; margin: 20px 0 0 0;">Kết quả sau khi nhấn <b>Ghi nhận</b></p>

            
            <div class="row" style="background-color:#D9D9D7">
                <div class="col-12 bg-secondary">
                    <h2 align="center" style="color:white;">Thông tin phiếu theo dõi</h2>
                </div>
                <!-- Tên, lớp -->
                <div class="col-6">
                    Tên học sinh: <b><?php echo $hoTen ?></b>
                </div>
                <div class="col-6">
                    Lớp: <b><?php echo $lop ?></b>
                </div>

                <!-- Ngày đăng ký, Giáo viên -->
                <div class="col-6">
                    Ngày đăng ký: <b><?php echo $thoiGian; ?></b>
                </div>
                <div class="col-6">
                    Giáo viên phụ trách: <b><?php echo $giaoVien ?></b>
                </div>

                <!-- Import Comment -->
                <div class="col-12">
                    Những công việc đã được phân công nhưng chưa hoàn thành:
                    <b><?php echo $comment ?></b>
                </div>

                <!-- Import Checkbox -->
                <div class="col-12">
                    Cam kết sẽ hoàn thành tại:
                    <b><?php echo $doClass ?></b>
                    <b><?php echo $doHome ?></b> 
                </div>
            </div>
        </div>
    </form>
</body>
</html>