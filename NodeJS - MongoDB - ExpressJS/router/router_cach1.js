//cách 1
var http = require('http');

//tạo biến file system
var fs = require('fs')

//tạo hàm dẫn đến file html
function docfile(tenfile, res) {
    fs.ReadStream(tenfile).pipe(res)
}

http.createServer(function(req, res) {
    res.writeHead(200, {'Content-Type': 'text/html; charset=utf-8'}); //để chèn html và ký tự đặc biệt 
    //tạo các trường hợp khi nhập url
    switch (req.url) {
        case ('/'):
            res.end('<h1>trang chủ😂😂😂😂 </h1>');
        case ('/about'):
            res.end('gioi thieu')
        case ('/contact'):
            res.end('lien he')
        //chèn file html vào
        case ('/album'):
            docfile('album.html', res)
        default:
            res.end('404 url not found')
    }
}).listen(3000);


console.log('server listening...');

