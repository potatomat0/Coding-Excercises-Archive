var congty = [
    {
        "tochuc" : [
            {"ten": "nhat", "tuoi": 19, "lop": "ct10"},
        ]
    },
    {  
        "ketoan": [
            {"ten": "Thai", "tuoi": 20, "lop": "13"},
            {"ten": "Minh", "tuoi": 19, "lop": "13"},
        ]
    },
    
    {  "hanhchinh" : [
            {"ten": "sus", "tuoi": 77, "lop": "Bỏ học"},
            {"ten": "the wok", "tuoi": 49, "lop": "wwe"},
            {"ten": "waltuh", "tuoi": 7749, "lop": "trường đời"}
        ] 
    } 
];

//truy cập một phần tử cụ thể
    //cách 1
// console.log(congty[0].tochuc[0].ten);
    //cách 2
// console.log(congty[2]["hanhchinh"][1].ten)

//sử dụng offset key
for(phongban of congty)
    console.log(phongban)
    // for (nhanvien of phongban[Object.keys(phongban)])
    //     console.log(nhanvien)



