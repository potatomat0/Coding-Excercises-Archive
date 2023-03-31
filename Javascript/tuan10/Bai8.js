// 8.	Viết chương trình JavaScript để xóa một ký tự tại vị trí xác định của một chuỗi đã
// cho và trả về chuỗi mới.


var str = 'Xin chao'
var str1 = '1234567'

const xoa = (str,i) => {
    arr = str.split('')
    arr.splice(i, 1)
    return arr.join('')
}
console.log(xoa(str,1));