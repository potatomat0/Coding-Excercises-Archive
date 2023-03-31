// câu 4
var danhsach = [
    {"tensv": "nhat", "tuoi": 19, "lop": "ct10"},
    {"tensv": "hai", "tuoi": 19, "lop": "ct10"},
    {"tensv": "khuong", "tuoi": 19, "lop": "ct10"}
]

var danhsach1 = [
    {"tensv": "Thai", "tuoi": 19, "lop": "Bỏ học"},
    {"tensv": "Minh", "tuoi": 19, "lop": "HUTECH"},
    {"tensv": "Lam", "tuoi": 19, "lop": "KHÔNG BIẾT =))"}
]
var danhsach2 = [
    {"tensv": "Abc", "tuoi": 77, "lop": "Bỏ học"},
    {"tensv": "kfc", "tuoi": 49, "lop": "HUTECH"},
    {"tensv": "mcdonalds =))", "tuoi": 7749, "lop": "KHÔNG BIẾT =))"}
]
//in ra một phần tử cụ thể:
                console.log(danhsach[0]);
                console.log(danhsach[0].tensv);
// in ra các phần tử của mảng bằng các vòng lặp của java ngoài for, while, do while
    //vòng lặp for of
                for (sv of danhsach)
                    console.log(sv.ten, sv.tuoi, sv.lop);
    //--vòng lặp for in
                for (i in danhsach)
                    console.log(danhsach[i]);
    //vòng lặp foreach: tự tạo hàm phía trong (không cần đặt tên hay khai báo function) hoặc gọi một hàm đã tạo phía bên ngoài
                function xuly(sv) {console.log(sv.tensv, sv.tuoi, sv.lop);}
                //gọi hàm phía bên ngoài
                danhsach.forEach(xuly(sv));
                //hàm tự tạo trong vòng lặp
                danhsach.forEach(function (sv){console.log(sv.tensv,sv.tuoi, sv.lop); })
    //vòng lặp map
                danhsach.map(function (sv){console.log(sv.tensv,sv.tuoi, sv.lop);})


// bài 5
var sinhvien={

    "masv": "501210710",
    "tensv": "Hoang Minh Nhat",
    "Tuoi": 19,
    "MaSoXe": null,
    "monhoc": ["Node.JS", "angularjs","CMS","PHP1","Javascript"],
    "DatHocBong": false 
}

console.log(monhoc[0])
// in các môn có trong mảng monhoc của sinhvien
for (var i = 0; i <sinhvien.monhoc.length; i++) {
    console.log(sinhvien.monhoc[i])
}

//để execute, nhấn ctrl  + shift + ` để mở terminal, gõ node [tên file]
