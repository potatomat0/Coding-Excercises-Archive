// Đề: dựa vào đoạn mã phía dưới, hoàn thiện lớp model kế thừa từ lớp car
// class Car{
//     constructor(brand) {

//     }
//     present() {
//         return `I have a ${this.carname}`
//     }
// }

// class Model extends Car {
//     show() {
//         return this.present() + 'this is a ' + this.model
//     }
// }

// var myCar = new Model('Lexus', 'Toyota');
// console.log(myCar.show());

//Bài làm:
class Car{
    constructor(brand) {
        this.brand = brand;
    }
    present() {
        return `I have a ${this.brand}`
    }
}

class Model extends Car {

    constructor(brand, modelName) {
        super(brand);
        this.modelName = modelName;
    }

    show() {
        return `${super.present}, this is a ${this.modelName}`
    }
}

var myCar = new Model('Audi', 'Sudan');
console.log(myCar.show());
