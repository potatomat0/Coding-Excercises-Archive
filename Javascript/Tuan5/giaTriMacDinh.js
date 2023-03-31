function getValue() {return value +5};
function add(first, second=getValue(first)) {return first + second}
console.log(add(3,3))//3+3 = 6
console.log(add(3));//3 + [gevalue(3+5)=8] = 11


//ví dụ 2
function multiply(a,b) {
    return a*b
}
multiply(7,7) //7*7=49
multiply(49) // 49*undefined = NaN

// ví dụ 3
function multiply1(a,b) {
    b = (typeof b !== undefined) ? b:1
    return a*b
}
multiply1(3,3) //3*3=9
multiply1(9) // 9*undefined = 9*1 = 9



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
    const tong0 = calculateTotal(100, , 20); //syntax error
    const tong
    = calculateTotal(100, undefined, 20); //127
    // Undefied: ko truyền giá trị cụ thể, lấy tax = 0.07


