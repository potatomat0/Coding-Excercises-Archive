<?php
    class DataProvider 
    {
        public static function executeQuery($sql)
        {
            include('db.inc');
            include_once('error.inc');
            //1. Tao ket noi CSDL
            if (!($connection = mysqli_connect($hostName,$username,$password,$databaseName)))
            die ("Cound't connect to localhost");
            //2. Thiet lap font Unicode
            if(!(mysqli_query($connection,"set names `utf8`")))
            showError($connection);
            //thuc thi cau tri van
            if(!($result = mysqli_query($connection,$sql)))
            showError($sql);
            //Dong ket noi CSDL
            if(!(mysqli_close($connection)))
            showError($connection);
            return $result;
        }
    }
?>