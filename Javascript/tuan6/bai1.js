//rest operator:
// === rest parameters: là tham số đại diện cho những tham số không được khai báo
var vidu = (...args) => {
    const filtered = args.filter(
        element => typeof element === 'number');
    let tong = 0
    for (const arg of filtered) {
        tong += arg}
    return tong
}
console.log(vidu('phep cong',1,2,3, 'awdawda',4,'👍🏿👍🏿'))
//10