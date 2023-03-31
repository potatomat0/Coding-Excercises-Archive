// 7.	Viết chương trình JavaScript để tạo một chuỗi mới thêm "Py" vào trước một chuỗi
// đã cho. Nếu chuỗi đã cho bắt đầu bằng "Py" thì trả về chuỗi ban đầu

var str = 'py'
var str1 = 'thon'

var add = str => {
    arr = str.split(' ')
    if (arr[0] !== 'py') {
        arr.unshift('py')
    } 
    return arr.join('')
}

console.log(add(str));

