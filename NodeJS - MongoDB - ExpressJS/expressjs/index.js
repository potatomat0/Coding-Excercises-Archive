var express = require('express');
var app = express();
var port = 3000

app.get('/', function(req, res){
    res.end('xin chao haha')
})

app.get('/about', function(req, res){
    res.end('gioi thieu')
})

app.listen(port, function(){
    console.log('listening on port')
})
