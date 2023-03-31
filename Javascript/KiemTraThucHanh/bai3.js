// 3.	Tạo class Vehicle có các lớp kế thừa Hike, SemiTruck. SV tạo thêm các thuộc tính và phương thức cho chúng. (1đ)

class Vehicle {
    constructor(name) {
      this.price = 0;
      this.name = name;
    }
    move(speed) {
      this.speed = speed;
      console.log(`${this.name} đang di chuyển với vận tốc ${this.speed} km/giờ .`);
    }
    stop() {
      this.speed = 0;
      console.log(`${this.name} đang đứng yên.`);
    }
}

//class Hike
class Hike extends Vehicle {

    constructor(name) {
        super(name)
    }

    rest() {
      console.log(`${this.name} đang nghỉ ngơi `);
    }

    climb(speed) {
        super.move(speed) //vẫn phải ghi tham số vào, và phải ghi đúng tên tham số đặt ở trên
        console.log(`${this.name} đang leo núi với vận tốc ${speed} km/h .` )
    }
  }
//class SemiTruck
class SemiTruck extends Vehicle {
    
    constructor(name,price) {
        super(name)
        price = price;
    }

    Refuel() {
      console.log(`${this.name} đang đổ xăng `);
    }

    
    xem() {
        console.log(`xe ${this.name} có giá ${this.price}`)
    }

}

var xe = new SemiTruck('xe huyndai',1000000);

xe.Refuel()
xe.move(9)
xe.xem()

var nguoiDiBo = new Hike('MinhNhat')

nguoiDiBo.rest()
nguoiDiBo.climb(3)
  