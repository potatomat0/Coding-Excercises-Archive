//b1: tạo class có setter với điều kiện tên truyền vào có độ dài không được nhỏ hơn 5
class User {
    constructor(fname){
        this.fname = fname;
    }
    set SetName(value){
        value.length<=5 ? alert("Your fist name is too short ❌") : this.fname = value;
    }
    get getName(){
        return this.fname;
    }
}
var u = new User ("johnn");
alert(u.GetName);

//ví dụ 2
const vd2 = ((name)=>console.log(`greetings ${name}`))("🤰🏻🤰🏻"); //greetings 🤰🏻🤰🏻 
// ví dụ 3
var diff = ((foo, bar) => {return foo-bar;})(10, 7);
console.log(diff) //3