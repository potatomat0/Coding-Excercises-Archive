// 20.	Tạo một mảng đối tượng khác gồm mssv, fullname (gồm fname, lname)
//  từ một mảng các đối tượng người dùng với mỗi đối tượng có mssv , fname, lname.

var userA = [
    {fname:'a', lname: 'nguyen', age: 1 },
    {fname:'b', lname: 'Do', age: 2 },
    {fname:'c', lname: 'chau', age: 3 },
    {fname:'d', lname: 'tran', age: 4 },
    {fname:'e', lname: 'hoang', age: 5 },
]

var userB = userA.map(element => {
    let newArr = []
    newArr.name = element.fname + ' ' + element.lname
    newArr.age = element.age
    return newArr
  })
//hiển thị
console.table(userB) 