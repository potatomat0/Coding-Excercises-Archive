<?php
require 'DataProvider.php';

if (isset($_GET['del_id'])){
    $sql = "DELETE FROM tbook WHERE BOOK_ID=" .$_GET['del_id'];
    DataProvider::executeQuery($sql);
}
$sql ="SELECT * FROM tbook";
$result = DataProvider::executeQuery($sql);

//hien thi ket qua
echo '<table width="600" align="center" border="1" cellspacing="0" cellpadding="5" style="border-collapse: collapse" bordercolor="#111111"';
    echo "<tr>";
    echo "<th>STT</th>";
    echo "<th>Tựa sách</th>";
    echo "<th>Mô tả</th>";
    echo "<th>Tác giả</th>";
    echo "<th>NXB</th>";
    echo "<th>Đơn giá</th>";
    echo "<th>Ảnh bìa</th>";
    echo "</tr>";
    $i = 1;
    while($row = mysqli_fetch_array($result)){
        echo "<tr>";
        echo "<td>" . $i . "</td>";
        echo "<td>" . $row['BOOK_TITLE'] . "</td>";
        echo "<td>" . $row['BOOK_DESC'] . "</td>";
        echo "<td>" . $row['BOOK_AUTHOR'] . "</td>";
        echo "<td>" . $row['BOOK_YEAR'] . "</td>";
        echo "<td>" . $row['BOOK_PRICE'] . "</td>";
        echo "<td><img style='width: 100%;' src='img/".$row["BOOK_PIC"] ."'></td>";

        echo "<td>";
        echo "<form method='get' action='deletebook.php'>";
        echo "<input type='text' name='del_id' value='".$row["BOOK_ID"] ."'>";
        echo "<input type='submit' value='Xoá'>";
        echo "</form>";
        echo "</td>";

        echo "</tr>";
        $i++;
        
    }
    echo "</table>";
?>


