var http = require('http');

//tạo hàm để xử lý
function xuly(req, res){
    res.writeHead(200, {'Content-Type': 'text/html'}); //để có thể chèn thẻ html vào
    res.end("<h1>xin chao \n tam biet </h1>");
}

var maychu = http.createServer(xuly)
maychu.listen(8080);
console.log("server dang chay tai 8080")
//ping + www.[tentrangweb] để biết IP của trang
//node + . để chạy node hoặc node + tenfile.js để chạy
//'npm init --yes' để tạo file package.json xử dụng npm scripts để khởi động file node trên thanh chức năng NPM scripts bên trái
//thay tên file ở dòng main để khởi động file nodes mới
//ctrl + shift + l để tạo mutible cursor


//================================================================
        //cách viết ngắn gọn hơn: 
        // var http = require('http');

        // http.createServer(function (req, res) {
        //   res.writeHead(200, {'Content-Type': 'text/plain'});
        //   res.end('Hello World!');
        // }).listen(8080);
