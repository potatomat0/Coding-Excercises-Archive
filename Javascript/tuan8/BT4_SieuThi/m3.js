// Module 3: 

// Tạo 1 mảng chứa danh sách các phần tử

// numbers = [53, 4558, 4120, -2165, 2528, 4500, 3454, -4354354]

// Lấy ra giá trị lớn nhất và nhỏ nhất trong mảng

const numbers = [53, 4558, 4120, -2165, 2528, 4500, 3454, -4354354];

const MinMax = arr => {
    let min = arr.reduce((a, b) => {
        return Math.min(a, b);
    })
    let max = arr.reduce((a, b) => {
        return Math.max(a, b);
    })
    return `Số lớn nhất trong mảng là: ${max}, số nhỏ nhất trong mảng là: ${min}`
} 



export {numbers as num, MinMax}