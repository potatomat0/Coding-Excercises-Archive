var express = require('express');
var router = express.Router();

/* GET home page. */
//tất cả các url này đều dẫn đến app
  //localhost: 3000
  //localhost: 3000/
  //127.0.0.1:3000
  //127.0.0.1:3000/
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Xin chao LMAO', name: 'nguyen van a', content: {
    title: 'nghe nhạc',
    album: 'F#A# infinity',
    artist: 'Godspeed You! Black Emperor',
    year: 1997
  }
  });
  //ở đây dùng pương thức render - đọc file .ejs thay vì đọc file .html
  //phần tham số thứ hai của render() là dữ liệu, trong tươg lai sẽ liên kết với môngdb
});

module.exports = router;
