//tạo một class animal và 2 class chó và mèo kế thằ animal

//khi export class kế thừa không cần phải export luôn class cha

class Animal {
    constructor(name) {
      this.speed = 0;
      this.name = name;
    }
    move(speed) {
      this.speed = speed;
      console.log(`${this.name} đang chạy với vận tốc ${this.speed} km/giờ 😃 .`);
    }
    stop() {
      this.speed = 0;
      console.log(`${this.name} đang đứng yên.`);
    }
}

//class chó:
class Dog extends Animal {

    constructor(name) {
        super(name)
    }

    bark() {
      console.log(`${this.name} đang sủa gâu gâu 🐶🐶 `);
    }

    hide(speed) {
        super.move(speed) //vẫn phải ghi tham số vào, và phải ghi đúng tên tham số đặt ở trên
        console.log(`${this.name} đang trốn.` )
    }
  }
//class mèo
class Cat extends Animal {
    
    constructor(name) {
        super(name)
    }

    meow() {
      console.log(`${this.name} đang kêu meo meo 😺😺 `);
    }


}

export {Animal, Dog, Cat}
  