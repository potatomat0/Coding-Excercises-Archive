// bài 5
var dulieu={
    //"danhsach" là key và mảng là value
    "danhsach" : [
        {"tensv": "nhat", "tuoi": 19, "lop": "ct10"},
        {"tensv": "hai", "tuoi": 19, "lop": "ct10"},
        {"tensv": "khuong", "tuoi": 19, "lop": "ct10"}
    ],
    "danhsach1": [
        {"tensv": "Thai", "tuoi": 20, "lop": "13"},
        {"tensv": "Minh", "tuoi": 19, "lop": "13"},
        {"tensv": "Lam", "tuoi": 11, "lop": "6"}
    ],
    "danhsach2" : [
        {"tensv": "Abc", "tuoi": 77, "lop": "Bỏ học"},
        {"tensv": "kfc", "tuoi": 49, "lop": "HUTECH"},
        {"tensv": "mcdonalds =))", "tuoi": 7749, "lop": "trường đời"}
    ]
   
}
//truy cập cụ thể một value
    //cách 1
    console.log(dulieu.danhsach1[2].tensv);
    //cách 2, dùng ngoặc vuông như mảng và truyền giá key vào
    console.log(dulieu["danhsach2"][2].tensv);
//in ra toàn bộ dữ liệu bằng vòng lặp
console.log(dulieu)






 // "masv": "501210710",
    // "tensv": "Hoang Minh Nhat",
    // "Tuoi": 19,
    // "MaSoXe": null,
    // "monhoc": ["Node.JS", "angularjs","CMS","PHP1","Javascript"],
    // "DatHocBong": false 
