<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <!-- đọc file: readfile: đọc nội dung của .txt files😳💀💨💃🏿🕺🏿🧑🏼‍🤝‍🧑🏿🧑🏻‍🤝‍🧑🏿👯‍♀️👯‍♂️👯--> 
    <?php
        // $file = "kienthuc.txt";
        // //sử dụng readfile sẽ bị bỏ qua ký tự xuống dòng 
        
        // // echo readfile($file);
        
        // //đọc file fopen(tên file, option)
        // /* 
        //     Trong option có r (read only), w (write only), a (add only)
        // */ 

        // //ví dụ:
        // $my_file = fopen($file, 'r');
        // //  echo fread($my_file, 1000);
        
        // while (!feof($my_file)) { //đọc d liệu trong file
        //     echo fgets($my_file, 1000)."<br>"; //chỉ hiển thị một dòng
        // }
        
        // //Để đọc file có độ dài không xác định: feof
        // //để kiểm tra file có còn dữ liệu không: !feof
        // fclose($my_file); //luôn đóng biến lại để tăng performance
    ?>
    <!-- 
        tạo file chưa tồn tại:
        B1: tạo file cũng dùng fopen nhưng option là w
        B2: ghi nội dung vào trong file fwrite(têm file, nội dung)
     -->
     <?php 
        $file = fopen("kienthuc.txt","w+"); //đặt vào dấu + sẽ không báo lỗi: fgets():errno=9 Bad file descriptor
        $sanPham = "balls in yo gaping jaws 
                    \n amongus amongus amongus amongus 
                    \n amongus amongus amongus amongus 
                    \n amongus amongus 
                    \n the voices wont stop
                    \n 😆😆😆😆😆😆 ";
        fwrite($file,$content);
        while (!feof($file)) { //đọc d liệu trong file
            echo fgets($file, 1000)."<br>"; //chỉ hiển thị một dòng
        }
        fclose($file);


     ?>
</body>
</html>