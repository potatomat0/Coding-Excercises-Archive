// 15.	Viết hàm loại bỏ tất cả các dấu gạch ngang, mỗi từ sau dấu gạch ngang chuyển sang chữ hoa.
// Ví dụ:
// a)	font-size =>fontSize
// b)	background-color => backgroundColor

//xem hướng dẫn tại stackoverflow:
// https://stackoverflow.com/questions/2970525/converting-any-string-into-camel-case

const toCamelCase = str =>
{
  var arr= str.match(/[a-z]+|\d+/gi)
  return arr.map((m,i)=>{
    let low = m.toLowerCase()
    if (i!=0){
      low = low.split('').map((s,k)=>k==0?s.toUpperCase():s).join``
    }
    return low
  }).join``
}

console.log(toCamelCase('ha_ha'))
console.log(toCamelCase('radio-head'))
console.log(toCamelCase('Xin chao tai sao van chua ngu '))
