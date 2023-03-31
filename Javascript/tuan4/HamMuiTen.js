//cách viết hàm thông thường
function test() {
    return true;
}
//gán giá trị của biến bằng hàm
var test1 = function() {
    return true;
}
//hàm không tên
(function (a) {
    return a + 100;
  });

//cách viết hàm bằng mũi tên
//Arrow function có cú pháp ngắn gọn hơn biểu thức hàm, bằng cách bỏ
// từ khóa function và [return]. Nó được định nghĩa bằng ký hiệu suy ra =>


// parameter vs argument: tham số có thể truyền được giá trị vào còn đối số là giá trị được truyền vào tham số. ví dụ: function vidu(v) { return true}; vidu(3); ở đây v là tham số, còn 3 là đối số

//------ví dụ hàm mũi tên
    const phepcong = (num1, num2) => num1  + num2;
//hàm mũi tên không cần đối số:
    const xinchao = () => console.log('xin chao');

//so sánh các cách viết hàm tính chu vi chữ nhật:
//cách viết thông thường
    function tinhchuvi(num1, num2) {
        return (num1+num2)*2
    }

    const tinhchuvi1 = function(num1, num2) {
        chuvi = (num1+num2)*2;
        return chuvi;
    }

//cách viết bằng mũi tên
    const tinhchuvi2 =  (a = 2,b = 3) => { `(${a}+${b})*2` }

    console.log(tinhchuvi2(4,8));

//khi chỉ có một dòng return không nhất thiết phải sử dụng ngoặc {}.  khi hàm mũi tên có 1 tham số thì không cần sử dụng ngoặc () để bọc 
    const xinchaoban = ten => `xin chao ${ten}!`

    console.log(xinchaoban("nhat"))
//nhiều tham số một câu lệnh:

var tinhTich = (x, y) => x * y;
console.log(tinhTich(2, 3)); // 6


// Một tham số, Nhiều câu lệnh: phải có dấu {}
var ktDTB = dtb => {
    if (dtb >= 5) {
    console.log("Đậu");
    } else {
    console.log("Rớt");
    }
}
ktDTB(7); // Đậu


//thiết lập giá trị mặc định của hàm khi có tham số. Lưu ý khi chỉ có một tham số những có giá trị mặc định thì vẫn phải bỏ trong ngoặc ()
const viduN = (tuoi= 7749) =>  `Nam nay minh ${tuoi} tuoi`
console.log(viduN()); //"nam nay minh 7749 tuoi"

    //sử dụng getValue để gán giá trị của một biến không xác định
    function add(first, second 
        = getValue(first)) { 
        return first 
        + second; 
        }

//đối số mặc định (defalt argument) bằng dấu ||
function calculateTotal( subtotal, tax, shipping ) {
    tax 
    = tax || 0.07;
    shipping 
    = shipping || 10;
    return subtotal 
    + shipping 
    + (subtotal 
    * tax);
    }
    const total 
    = calculateTotal(100);

//truyền tham số mặc định bằng cách sử dụng từ khóa undefined
function calculateTotal( subtotal, tax = 0.07, shipping = 10 ) {
    return subtotal 
    + shipping 
    + (subtotal 
    * tax);
    }
    const tong
    = calculateTotal(100, undefined, 20); //127
    // Undefied: ko truyền giá trị cụ thể, lấy tax = 0.07
    
    

//hàm mũi tên không có giá trị this riêng nên mà thay vào đó tham chiếu giá trị từ bên ngoài nên không cần sử dụng phương thức bind()
function Person(){
    this.age = 0;
    setInterval(() => {
    this.age++; //từ khóa `this` tham chiếu đến đúng đối tượng Person.
    }, 1000); //phương thức setInterval sau 1000ms (1s) sẽ lặp lại thao tác của hàm được lồng phía trong
    }
//ví dụ phương thức bind()

    const module = {
        x: 42,
        getX: function() {
        return this.x;
        }
    };
    
    const unboundGetX = module.getX;
    console.log(unboundGetX()); // giá trị được kích hoạt trong hàm ở quy mô toàn cục
    // không biết được x là gì kết quả: undefined
    
    const boundGetX = unboundGetX.bind(module);
    console.log(boundGetX());
    // dùng hàm bind có thể truy cập được biến x ở phía trong đối tượng module: 42


//lỗi undefined cần lưu ý 
const product =(name,price) => /*{*/(
    {
        name: name,
        price: price
    }  
)/* }*/ //ở đây cần xóa dấu ngoặc {} bao quanh ngoặc () để không bị undefined


    
