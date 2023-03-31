/**
 * Bài 2: in ra ngày và giờ hiện tại lên máy chủ ảo
 */
let ngaygio = require ('./ngaygio.js')
var http = require('http');

//tạo hàm để xử lý
function xuly(req, res){
    res.writeHead(200, {'Content-Type': 'text/html; charset=utf-8'}); //để có thể chèn thẻ html vào và viết được tiếng việt bằng bảng mã utf-8
    // res.end("<h3> Ngày và giờ hiện tại là:  </h3>  " + //in ra ngày tháng năm
    //     ngay + "/" + thang + "/" + nam + "<br>" +
    //     gio + ":" + phut + ":" + giay
    //     );
    res.end(`<h3> Ngày và giờ hiện tại là: </h3> 
        ${ngaygio.ngay}/${ngaygio.thang}/${ngaygio.nam}  <br> 
        ${ngaygio.gio}:${ngaygio.phut}:${ngaygio.giay}
        `);
    
}

var maychu = http.createServer(xuly) //gọi hàm
maychu.listen(8080); //tạo port cho máy chủ
console.log("server dang chay tai 8080") //in ra thông báo (không có cũng được)


