// const person = {
    //  name: 'John',
    //   getName : () => this.name}
// const p2 = new person()
// console.log(p2.getName())

// //lỗi undefined cần lưu ý 
// const product =(name,price) => /*{*/(
//     {
//         name: name,
//         price: price
//     }  
// )/* }*/ //ở đây cần xóa dấu ngoặc {} bao quanh ngoặc () để không bị undefined


//object có constructor không được thể hiện bằng dấu mũi tên

const person = function(fname, lname) {
    this.fname = fname;
    this.lname = lname;
    getName : () => { this.fname + this.lname}

}

const p2 = new Person("Nguyen", "A")
console.log(`${p2.fname} ${p2.lname}`)
console.log(p1.getName())