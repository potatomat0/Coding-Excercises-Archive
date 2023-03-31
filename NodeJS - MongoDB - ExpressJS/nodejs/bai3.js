let url = require('url');

var http = require('http');

//tạo hàm để xử lý
function xuly(req, res){
    res.writeHead(200, {'Content-Type': 'text/html'}); //để có thể chèn thẻ html vào
    let q = url.parse(req.url, true).query
    // res.end(req.url); //in ra url
    res.end(q.year + ' ' + q.month)
}

var maychu = http.createServer(xuly)
maychu.listen(8080);
console.log("server dang chay tai 8080")

//chạy trên trình dyuệt: localhost:80800/?year=2022&month=August