import {dm,ss,tp} from './m1.js'
import { SoSanh} from "./m2.js";
import * as m3 from "./m3.js";

//sử dụng module 3:
console.log(m3.num)
console.log(m3.MinMax(m3.num))
//Sử dụng module 1
const DienMay = new dm('a1', 'haha', 7,20000,12,900);
const SanhSu = new ss('b1', 'ok', 12, 20000, 'ok', new Date());
//sử dụng module 2
console.log(SoSanh(SanhSu,DienMay))