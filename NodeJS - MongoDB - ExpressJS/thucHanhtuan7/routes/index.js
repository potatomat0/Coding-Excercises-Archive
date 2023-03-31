var express = require('express');
var router = express.Router();
//từ folder models
var Nhanvien = require('../models/nhanvien.js');

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('trangchu.ejs')
});


/* GET themnv.ejs */
router.get('/them', function(req, res, next) {
  res.render('themnv.ejs');
});
// POST themnv.ejs
router.post('/them', function(req, res, next) {
  var nv = new Nhanvien({
      name: req.body.txtTen,
      age: req.body.txtTuoi
  })
  nv.save(error => res.redirect('/them'))
});

//----------------------------------
//get sửa nhân viên
router.get('/sua', function(req, res, next) {
  res.render('suanv.ejs');
});

router.post('/sua', function(req, res, next) {
  Nhanvien.findOne({name: req.body.txtTen},
      (error,nv) => {
          nv.age = req.body.txtTuoi
          nv.save(error => res.redirect('/sua'))
  })
});
//----------------------------------------------------------------
//get xóa nhân viên

            router.get('/xoa', function(req, res, next) {
                    res.render('xoanv.ejs');
                });

                router.post('/xoa', function(req, res, next) {
                    Nhanvien.deleteOne(
                        {name: req.body.txtTen},
                        error => res.redirect('/xoa')
                    )
                });

//---------------------------------
//get xem nhân viên
router.get('/xem', function(req, res, next) {
  Nhanvien.find({},(error, dsnv) => {
      res.render('xemdsnv.ejs', {dsnv});
   })
  });
//----------------------------------------------------------------
//get trang chủ
module.exports = router;
