//Đề: sắp xếp ngày tháng năm giảm:

var array = [
    new Date(1995,10,03),
    new Date(1992,10,12),
    new Date(1999,10,19),
    new Date(1992,10,11),
    new Date(1999,12,18),
];

// var locTang =  array.sort((a,b)=>a.getTime()-b.getTime());

giam = (arr) => {
     return  arr.sort((a,b)=> b.getTime()-a.getTime());
}
locGiam = giam(array)
console.log(`Lọc ngày tháng tăng:`)
// console.log(locTang.map(ngay=> ngay.toLocaleDateString("en-US")));
// console.log(`Lọc ngày tháng giảm:`)
console.log(locGiam.map(ngay=> ngay.toLocaleDateString("en-US")));

