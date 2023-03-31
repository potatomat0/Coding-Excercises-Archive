//Bài 4

a = [1, 2, 3, 4, 5]
b = [...a]
c = [...a]

// Xóa pt 1, 2, 3. Thêm gtri 7, 8, ta được mảng kq = [7, 8, 4, 5]
   
   a.splice(0,3); //xóa từ 1 đến 3
   a.unshift(7,8); //thêm 7 và 8 vào đầu mảng

// Hoặc xóa phần tử: 3, 4. Ta đc mảng a = [1, 2, 5]
   b.splice(2,2)

// Lấy ra phần tử ở vị trí 1, 3
    console.log(c[0] + ',' + c[2])

