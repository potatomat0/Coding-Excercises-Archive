// SV thực hiện yêu cầu sau: 
// Sử dụng ham prompt nhập các giá trị vào mảng
// Nếu giá trị nhập vào không phải là số, hay chuỗi rỗng thì nhấn “hủy” hoặc kết thúc yêu cầu
// Tính tổng các giá trị trong mảng

arr= []

var ask= prompt('Hãy nhập số vào chuỗi')
if(ask && typeof ask !== 'string') {
    arr.push(ask)
} 
else {alert(
    'vui lòng nhập số'
)}

console.log(arr)

