// 5.	Viết chương trình JavaScript để tạo một chuỗi mới 
// từ một chuỗi đã cho thay đổi vị trí của các ký tự đầu tiên
//  và cuối cùng. Độ dài chuỗi phải lớn hơn hoặc bằng 1.

var Str = 'Xin chao'
var Str1 = 'X'

var Swap = str => {
    if(str.length <=1) {
        return 0
    }
    else {
        arr =  [...str];
        first = arr[0]
        last = arr[arr.length-1]
        arr[0] = last
        arr[arr.length-1] = first
        return arr.join("")
    }
}

console.log(Swap(Str1));