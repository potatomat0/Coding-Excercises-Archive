const { response } = require('express');
var express = require('express');
var router = express.Router();
//từ folder models
var hanghoa = require('../models/hanghoa.js');

/* GET home page. */
// router.get('/', function(req, res, next) {
//   res.render('xemdshh.ejs')
// });


//====CRUD

/* GET themhh.ejs */
router.get('/them', function(req, res, next) {
  res.render('themhh.ejs');
});
// POST themhh.ejs
router.post('/them', function(req, res, next) {
  var hh = new hanghoa({
      name: req.body.txtTen,
      price: req.body.txtGia
  })
  //xử lý lỗi bằng callback
  // hh.save(function (err){
  //   if(err) {
  //     return res.send('<h1>Lỗi nè:</h1>' + err);
  //   }
  //   res.redirect('/')
  // }) //redirect thẳng đến trang chủ, nếu quay lại trang thêm, thay bằng res/redirect('/them')
  

  //xử lý lỗi bằng promise:
  hh.save()
    .then(()=> res.redirect('/'))
    .catch(err => res.send('<h1> Lỗi nè </h1>' + err))
});

//UPDATE----------------------------------
//get sửa hàng hóa 
router.get('/sua', function(req, res, next) {
  res.render('suahh.ejs');
});
router.get('/sua/:id', function(req, res, next) {
  hanghoa.findOne({ _id: req.params.id},
    (err,hh)=>{
      if(err) 
        return '<h1> error: </h1> +' +err
      res.render('suahh.ejs', {hh});
  })
});

router.post('/sua', function(req, res, next) {
  hanghoa.findOne({_id: req.body.txtId})
      .then((dulieu) => {
        dulieu.name = req.body.txtTen
        dulieu.price = req.body.txtGia
        dulieu.save()
          .then(_ => res.redirect('/'))
          .catch(err => res.send('<h1> error: </h1> +' +err))
      }
      )
});
//----------------------------------------------------------------
//get xóa hàng hóa

            router.get('/xoa', function(req, res, next) {
                    res.render('xoahh.ejs');
                });

                router.get('/xoa/:id', function(req, res, next) {
                 setTimeout( () => {hanghoa.deleteOne({_id: req.params.id}, error => res.redirect('/'))}, 2000)
              });

//---------------------------------
//get xem hàng hóa và cho trang hàng hóa là landing page
router.get('/', function(req, res, next) {
  hanghoa.find({},(error, dshh) => {
      res.render('xemdshh.ejs', {dshh});
   })
  });
    module.exports = router;
    