// 6.	Viết chương trình JavaScript để tính tổng của hai số nguyên đã cho.
//  Nếu hai giá trị giống nhau, thì trả về gấp ba tổng của chúng.

const sum = (a,b) => {
    return (a==b)? (a+b)*3 : (a+b);
} 

console.log(sum(2,2))