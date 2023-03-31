class Rectangle {
    constructor(height, width) {
      this.height = height;
      this.width = width;
    }
  }


  // unnamed
let Rectangle = class {
    constructor(height, width) {
      this.height = height;
      this.width = width;
    }
  };
  console.log(Rectangle.name);
  // output: "Rectangle"
  
  // named
  Rectangle = class Rectangle2 {
    constructor(height, width) {
      this.height = height;
      this.width = width;
    }
  };
  console.log(Rectangle.name);
  // output: "Rectangle2"


  //ví dụ sử dụng class
  class Rectangle {
    constructor(height, width) {
      this.height = height;
      this.width = width;
    }
    // Getter
    get area() {
      return this.calcArea();
    }
    // Method
    calcArea() {
      return this.height * this.width;
    }
  }
  
  const square = new Rectangle(10, 10);
  
  console.log(square.area); // 100


//ví dụ 
class person {
    constructor(ten='nguyễn văn a', tuoi='18') {
    this.ten = ten;
    this.tuoi = tuoi;
    }

    hienthi() {
        return `Tên là: ${this.ten}.
                Tuổi là: ${this.tuoi}`
    }
}

const sv1 = new person('Hoàng Minh Nh💩t', 19);
document.write(sv1.hienthi())


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
document.write(user1.display());
user1.ten = 'emoji con mèo cười'
//tên sau khi đổi
document.write(user1.display());
document.write(user1.tuoi)

