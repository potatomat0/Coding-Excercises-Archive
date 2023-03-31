//lowercase to uppercase
 const chuHoa = string => {
    const uppercases = string.toUpperCase();
    return uppercases;
};

var haha = 'xin chao';

//export cú pháp số 1: ghi đúng tên hàm hoặc biến
export {haha, chuHoa};
//cú pháp số 2 thay đổi tên hàm hoặc biến
// export {haha as hh, chuHoa as ch};
//cú pháp số 3: export tại dòng khai báo
// export var haha = 'xin chao'
//cú pháp bốn: sử dụng từ khóa default
    //export default haha; mỗi file chỉ có một default module
    //tên object phải chứa trong ngoặc {} khi import
    //khi import module này sẽ sử dụng cú pháp: import ten_batky, {ten_object} from ten_module
                                                //máy sẽ tự động import module có từ khóa default (mặc định)
