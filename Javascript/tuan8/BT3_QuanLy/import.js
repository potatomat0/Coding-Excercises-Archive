import {S, G} from './m1.js'
import { SoSanh as ss } from "./m2.js";
import * as m3 from "./m3.js";

var muaSat = new S('03', 'Kg', '17', new Date(1997,10,11), 21, 7000)
var muaGach = new G('03', 'Kg', '17', new Date(1997,10,11), 51, 'China', 8000, 150000)

// sử dụng module 1

console.log(muaSat.display())
console.log(muaSat.thanhTien())
//--------------------------------- 
console.log(muaGach.display())
console.log(muaGach.thanhTien())

//sử dụng module 3
console.log(ss(muaSat, muaGach))

//sử dụng module 2
console.log(m3.mang)
console.log(`Tổng các số chẵn của mảng là: ${m3.f(m3.mang)} `)



