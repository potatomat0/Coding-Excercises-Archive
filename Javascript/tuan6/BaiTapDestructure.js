//bài dòng 26
function dc({ x = 0, y = 0 } = {}) {
    return [x, y];
    }
    dc({ x: 3, y: 8 }) //x = 3, y = 8
    dc({ x: 3 }) //x = 3, y = 0
    dc({}) // x= y = undefined
    dc() //x = y = 0

//bài dòng 27
const arr = [];
[{tt: arr[0]} = {tt: true}] //arr = true
//bài dòng 28
// const [x, y, ...z] = ['a']; //x = 'a', y = z = undefined
//bài dòng 29;
var a,b;
 ({ a, b } = { a: 4, b: 5 }) // a=4, b=5

//bài dòng 31:
var {tt: a, tt2: [ , b]} = {tt: 5, tt2: [10,
    100]} //a=5, b=100
//Bài dòng 32
var {
    tt: x,
    tt2: {
    tt2: {
    l: [, , b]
    }
    }
    } = { tt: "hello", tt2: {tt2:{
    l: ["a", "b", "c"]
   }}} //x='hello', b= 'c'

//Bài dòng 43: 
var f = function({tt: x}) {
    console.log(x);
    }
    f({v: 1}) //1

//Bài dòng 47:
var f = function({
    tt: x,
    tt2: {
    tt2: {
    l: b
    }
    }
    }){
    console.log(x, ...b);
    }
    f({tt:"hello", tt2:{tt2: {l: ["a", "b", "c"]}}})
    //hello, a,b,c

// Bài dòng 59:
var u = [
     {u: "n1"},
     {u: "n2"},
     {u: "n3"},
     ]
     var n = u.map(({u})=>u)
     //n=[n1,n2,n3]

//Bài dòng 66:
let characters = { a: 'a', b: 'b', c: 'c' };
 let { a: d, b: e, c: f } = characters;
 console.log(d, e, f); //abc
 console.log(a);//undefined

 //Bài dòng 70:
 let obj = {};
 let [x] = obj; //error: object is not iterable 
 //Bài dòng 73:
 let und = undefined;
 let [x] = und; //error: object is not iterable 

// Bài dòng 80:
let response = null;
let[x] = response; //error: object is not iterable 

// Bài dòng 81
function foo() {
    return {
    x: 1,
    y: 2,
    z: 3
    };
    }
    let { x: a, y: b, z: c } = foo();
    console.log(a, b, c); //1,2,3
    var { x = 4, y = 5, z = 6, t=10} = foo();
    console.log(x, y, z,t); //1,2,3,10
    var { x = 4, y = 5, z = 6, t} = foo();
    console.log(x, y, z); //1,2,3, undefined
//Bài dòng 97:
function foo() {
    return 1;
    }
   
    let obj1 = { x: 2 };
    let obj2 = { x: undefined };
   
   //  let { x = foo() } = obj1;
   //  console.log(x); //x=2
   
   //  let { x = foo() } = obj2;
   //  console.log(x); //x=1

// Bài dòng 110
    const [x = y, y = 3] = [];
    //Cannot access 'y' before initialization

//bài dòng 112
function bar({ x, y }) {
    console.log(x, y);
    }
    foo({ x: 1, y: 2 }); // 1 2
    //foo is not defined
     foo({});




//bài cuối
function foo({ x = 5 } = {}, { y } = { y: 5 }) {
log(x, y);
 }

 foo({}, { y: 10 }); // 5 10
 foo({ x: 15 }, {}); // 15 undefined
 foo({}, {}); // 5 undefined
 foo({ x: 15 }, { y: 10 }); // 15 10
 foo({}, undefined); // 5 5
 foo(undefined, undefined); // 5 5
 foo({});

    