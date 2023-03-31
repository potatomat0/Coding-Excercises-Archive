var http= require('http');

var app = require('demo7_Cach2app.js');

http.createServer(app.load_router).listen(3000);