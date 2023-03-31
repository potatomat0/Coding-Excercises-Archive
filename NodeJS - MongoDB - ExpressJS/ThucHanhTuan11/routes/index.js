var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});


function SanPham (ten,gia,hinh)
{
    this.ten = ten;
    this.gia = gia;
    this.hinh =hinh;
}

var sus1 = new SanPham("gybe",12000,"pd1.png");
var sus2= new SanPham("hmm",12000,"pd2.png");
var sus3 = new SanPham("cck",12000,"pd3.png");
var sus4 = new SanPham("blls",12000,"pd4.png");
var sus5 = new SanPham("vgn",12000,"pd5.png");
var sus6 = new SanPham("bbs",12000,"pd6.png");

var arr = [sus1, sus2, sus3, sus4, sus5, sus6]

router.get("/album", function(req,res){
    res.render("pokemon", {list:arr})
})

module.exports = router;


