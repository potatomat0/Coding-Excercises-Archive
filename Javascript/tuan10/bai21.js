// 21.	Giả sử chúng ta có mảng các đối tượng người dùng gồm {mssv, tên, tuổi…}
// Tạo một đối tượng từ nó với mssv là khóa, các phần tử trong mảng là giá trị
// (Chức năng này sẽ thuận lợi khi làm việc với dữ liệu máy chủ)
// Ví dụ:
// let users = [
// {mssv: “A123”, ten: “An Huynh”, tuoi: 20}, 
// { mssv: “A456”, ten: “Ha Tran”, tuoi: 19}
// ]
// •	Đối tượng mới
// usersByMssv = {
// A123: {mssv: “A123”, ten: “An Huynh”, tuoi: 20}, 
// A456: { mssv: “A456”, ten: “Ha Tran”, tuoi: 19}
// }

//tạo một object mới với mỗi key là id của userA, và value của key là giá trị tương ứng như trong mảng
var userA = [
   {id: 'A01',fname:'a', lname: 'nguyen', age: 1 },
   {id: 'A02',fname:'b', lname: 'Do', age: 2 },
   {id: 'B01',fname:'c', lname: 'chau', age: 3 },
   {id: 'C01',fname:'d', lname: 'tran', age: 4 },
   {id: 'C02',fname:'e', lname: 'hoang', age: 5 },
]

//mò hơn 1 tiếng trên stackoverflow tìm đủ mọi cách mà vẫn không làm được
// hóa ra lời giải đơn giản hơn nhiều nếu nghĩ lại một chút:
// nah i wont even try to explain this, the code itself is pretty self-explanatory
 
userB = {}
userA.forEach(
    obj => {
        userB[obj.id] = obj
    } 
)
console.log(userB)


