//cách 1
var http = require('http');
http.createServer(function(req, res) {
    res.writeHead(200, {'Content-Type': 'text/html; charset=utf-8'}); 
    if (req.url=='/')
        res.end('<h1>trang chủ😂😂😂😂 </h1>');
    else if(req.url=='/about')
        res.end('gioi thieu')
    else if (req.url=='/contact')
        res.end('lien he')
    else
        res.end('404 url not found')
}).listen(3000);


console.log('server listening...');

