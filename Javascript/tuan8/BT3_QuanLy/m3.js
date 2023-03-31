//// Module 3 : Tạo một mảng 

// mang = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20];

// Viết hàm tính tổng các số lẻ trong mảng

const mang = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16,17, 18, 19, 20];

const SumOdd = arr => {
    var filtered = arr.filter((n) => n % 2 == 1) //lọc ra các số lẻ
    return filtered.reduce((a, b) =>{
            return a + b;
    }, 0 );  //tính tổng các số lẻ
}

export {mang, SumOdd as f}