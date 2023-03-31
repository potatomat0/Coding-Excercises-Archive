const first = 'Nhat';
const last = 'Hoang';
const age = 19;

//cách làm cũ
const sv = {
    first: first,
    last: last,
    age:age
};
//cách làm nhanh:
const sv1= {
    first,
    last,
    age
}


//cài đặt giá trị thuộc tính trong object:
const sv3= {
    firstName: first,
    lastName: last,
    age: age
};

//cài đặt hàm trong object
var obj = {
    foo: function() {
    console.log('foo');},
    
    bar: function() {
    console.log('bar');}
}
//--- cú pháp gọn hơn:
const obj2 = {
    foo() {
    console.log('🍆🍆');},
    
    bar() {
    console.log('🍳🍳');}
};

//tên biến với giá trị tự tăng dần ngay trong định nghĩa đối tượng:
let i =
0;
const a = {
['foo' + ++i]: i,
['foo' + ++i]: i,
['foo' + ++i]: i
};
console.log(a.foo1); // 1
console.log(a.foo2); //2
console.log(a.foo3); //3





