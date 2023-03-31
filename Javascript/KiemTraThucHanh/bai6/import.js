import {tr, tri} from './module1.js'
import * as m3 from "./module2.js";
import { SoSanh as ss } from "./module3.js";
// new Date(1997,10,11)
var muaNhacTre = new tr('test', 'abc', 13, 30000, 21,30000 )
var muaNhacTrinh = new tri('nhac trinh', 'trinh cong son', 19, 20000, 21, 30000, new Date(1997))

// sử dụng module 1

console.log(muaNhacTre.showInfo())
console.log(muaNhacTre.thanhTien())
//--------------------------------- 
console.log(muaNhacTrinh.showInfo())
console.log(muaNhacTrinh.thanhTien())

//sử dụng module 2
console.log(ss(muaNhacTre, muaNhacTrinh))

//sử dụng module 3
console.log(m3.mang)
console.log(`Tổng các số chẵn của mảng là: ${m3.f(m3.mang)} `)