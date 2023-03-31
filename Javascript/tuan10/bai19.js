// 19.	Cho một mảng đối tượng người dùng gồm tên, tuổi,
//  …Viết hàm chuyển nó thành một mảng tên.

var user = [
    {name:'a', age: 1, school: 'itc'},
    {name:'c', age: 2, school: 'hutech'},
    {name:'d', age: 3, school: 'trường đời'},
    {name:'b', age: 4, school: 'havard'},
    {name:'e', age: 5, school: 'mầm non'},
]


let bt18 = arr=> arr.map(a => a.name);
//tham khảo tại: https://stackoverflow.com/questions/19590865/from-an-array-of-objects-extract-value-of-a-property-as-array

nameArr = bt18(user)
console.log(nameArr)


