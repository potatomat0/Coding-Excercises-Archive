var db = require("mongoose")

db.connect("mongodb://127.0.0.1:27017/csdlnv");

var nhanvienSchema = db.Schema({
    name: String,
    age: Number
})

var Nhanvien = db.model('Nhanvien', nhanvienSchema)
module.exports = Nhanvien