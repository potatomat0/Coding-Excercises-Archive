//tạo một class user:
class user {
    constructor(ten='😹😹😹', tuoi) {
        this.ten = ten;
        this.tuoi = 9;
    }
    display() {
        return `Tên: ${this.ten}.`
    }
}
const user1 = new user();
//tên trước khi đổi:
console.log(user1.display());
user1.ten = 'emoji con mèo cười'
//tên sau khi đổi
console.log(user1.display());
console.log(user1.tuoi)



//viết một class cha có một set x,y
//viết một class con thừa kế set cha, x,y, mà còn có chiều rộng chiều cao
class cha {
    constructor(x=0, y =0 ) {
        this.x = x;
        this.y = y;
    }
    display() {
        return `x: ${this.x}. y: ${this.y}`
    }
}

class con extends cha() {
    constructor(x,y,width, height) {
        super(x,y)
        this.width = width;
        this.height = height;
    }
    display() { super.display(); return `width: ${this.width}. Height: ${this.height}` }
} 

var ch = new cha(2,3)
console.log(ch.display())
var c = new con(2,3,4,5)
console.log(c.display())

//Khi muốn sử dụng hàm static phải dùng tên class thay vì tên instance để gọi, nếu không sẽ bị lỗi typeError
//ví dụ var ch = new cha(2,3), thì ch là instance của class cha; giả sử nếu gọi hàm static có trong class cha thì phải sử dụng cú pháp cha.display()