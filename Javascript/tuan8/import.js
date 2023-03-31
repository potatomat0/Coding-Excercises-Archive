//import module từ export.js


//cú pháp thứ nhất: không ghi đúng tên
//cú pháp thứ hai: không ghi đúng tên + as {tên mới}
//cú pháp thứ ba: import * as {name} from './export.js'; và khi gọi thì sử dụng cú pháp {name}.{module.name}
import {chuHoa as ch, haha} from './export.js';
        
console.log(`String khi chưa biến thành chữ hoa: ${haha}`)
console.log(`String khi  biến thành chữ hoa: ${ch(haha)}`)
