//mảng ví dụ:
var arr = [2,3,4,5,6,7,8,9,10];
//push()
arr.push(12); //chèn 12 vào cuối mảng
console.log(arr); //in toàn mảng
console.log(arr[10]); //in một mảng
//pop()
var arr0 = [2,3,4,5,6,7,8,9,10,12];

console.log(arr.pop()); //in ra 12

arr.pop(); //xóa đi 12
//shift()
const arr1 = [1, 2, 3];
const sodautien = arr1.shift(); //sodautien = 1

console.log(arr1); //in ra 2,3
console.log(sodautien); //in ra số 1

//phép boolean bằng ===
var z = 7;
if(z==7) //true vì bằng giá trị
if(z==="7") //false vì bằng giá trị nhưng không bằng kiểu dữ liệu

//object ví dụ:
const person = {
    ten: "Nhat",
    tuoi: "13",
    noiSinh: "tphcm"
}
var numbers = [4,5,6,7,8];
//vòng lặp for of
for (i of numbers) {console.log(i)}
//vòng lặp for in
for (i in numbers) {console.log(i)}
//in ra hết cả keys và value
for (value of Object.keys(person)) {
    console.log(value)
}
//forEach
numbers.forEach(function(number) {console.log(number)})
person.forEach(function(person) {console.log(person.value)}) 

//vòng lặp có let
var funcs = [],
    object = {a: true, b: true, c: true};
for (let key in object) {funcs.push(function() {console.log(key);})}

funcs.forEach(function(func) {
    funcs();
});

//khai báo biến với const: một hằng số không bị thay đổi hay đè giá trị

const a = 13;
a = 12; //bị lỗi do const không thể bị thay đổi giá trị
const haha; //bị lỗi, chưa khai báo giá trị
const mang = [1,2,3,4,5,6]
mang.push(7); //vẫn có thể thêm số 7 vào mảng


//ôn ví dụ về khai báo toàn cục và cục bộ:
var x=5;
function letVaVar() {
    var y = x+5;
    console.log(y);
}
console.log(y); // bị lỗi vì y chỉ được khai báo cục bộ trong hàm letVaVar() và khi thoát ra khỏi hàm thì đã không được nhớ
letVaVar(); // không bị lỗi vì trong hàm đã khai báo trước y rồi mới in ra sau đó

if (true)
{ const vidu = 'haha'}
console.log(vidu); //bị lỗi vì const cũng như let, chỉ được lưu trong block còn khi ra ngoài sẽ không được tham chiếu

//phần biệt var const let:

    //var là biến global còn let và const là biến block scoped
    //var có thể tham chiếu toàn bộ chương trình còn let và const chỉ có thể được tham chiếu trong cấu trúc rẽ nhánh/hàm/vòng lặp
    //var và let có thể được khai báo lại còn const thì không
    //var có thể được chèn giá trị còn let và const thì không  (trừ khi chèn vào chuỗi của một array const)

//những trường hợp thay đổi được giá trị bên trong của một const
const viduConst = {
    name: "Nhat",
    tuoi: 19
}
viduConst.name= "meo";
console.log(viduConst.name); //không bị lỗi vì chỉ đang cập nhật
Object.freeze(viduConst); //sử dụng phương thức Object.freeze(viduConst) để object không thể được cập nhật
viduConst = { name: "Hãi", tuoi: 7749} //bị lỗi vì đã khai báo lại toàn bộ object

//sự khác nhau giữa const var let trong vòng lặp

for(var i=0; i<5; i++) {console.log(i);} //chỉ hiển thị ra số 5 vì var i sẽ được đè một giá trị khác sau mỗi lần lặp thay vì let là mỗi lần lặp sẽ tạo ra một i có giá trị mới chứ không đè lên i có sẵn
console.log(i); //in ra 5
for(let i=0; i<5; i++) {console.log(i);}   //i sẽ chạy từ 0 đến 4 
console.log(i); //bị lỗi reference
for(const i=0; i<5; i++) {console.log(i);}
console.log(i); //bị lỗi, ngay từ đầu i đã =0 và không thể được thay đổi giá trị 

//const khi khai báo trong block 
const haha = 7;
{const haha = 9;} //haha ở trong block này sẽ được thay đổi giá trị thành 9

//sử dụng phương thức setTimeout
for (var i = 0; i <5; i++) {
    setTimeout(function() {console.log(i);}, 100); //100 ở đây là mỗi mili giây, sau 0,1s sẽ ra số 5
}

//ví dụ hàm có cấu trúc rẽ nhánh và có giá trị tham số mặc định
function Vidu10 (name = 'hải' ){ //giá trị tham số mặc định là hải
    var xinchao;
    if (name =='nhat')
    xinchao = 'xin chao nhat';
    else xinchao = 'chao ban';
    console.log(xinchao);
}
Vidu10('nhat')

function Vidu10 (name = 'hải' ){ //giá trị tham số mặc định là hải
    const xinchao1; //lỗi vì không được khai báo giá trị, syntax error
    if (name =='nhat')
    xinchao = 'xin chao nhat';
    else xinchao = 'chao ban'; //sai nữa vì đã thay đổi giá trị
    console.log(xinchao);
}
Vidu11('nhat')

//ví dụ let và var lần thứ bao nhiêu không biết
var avidu12 = 3;
let bvidu12 = 5;
if (a===3) {
    var avidu12=4;
    let bvidu12=6;
}
console.log(a); //4
console.log(b); //5

var amongus = 4;
let sus = amongus;
amongus = 1;
console.log(amongus) //1
console.log(sus); //4


//ví dụ gán object cho một biến mới
const vidu14 = {
    name: 'amongus'
}

let b= vidu14;  //giá trị của b cũng được gán vào cùng một địa chỉ ô nhớ của vidu14, nên khi thay đổi vidu14.name, b cũng được thay đổi theo
vidu14.name = 'sus';
console.log(b)

//trường hợp tham số và biến toàn cục trong một hàm
function ham(number) {
    number = 4;
}
const vidu15 = 5;
console.log(vidu15); //ra 5 vì số 4 là một biến block scoped còn tham số truyền vào vẫn sẽ luôn được truyền giá trị từ một biến toàn cục có thể truy cập

//trường hợp tham số là một object
function ham16(obj) {
    obj.name = 'nhat' //cập nhật lại tên đối tượng là hải
}
const vidu16 = {
    name: 'hai'
}
ham(vidu16);
console.log(vidu16.name)


