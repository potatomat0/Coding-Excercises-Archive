function check_phone (phone) {
    let pattern = /\(?([0-9]{3})\)?([ .-]?)([0-9]{3})\2([0-9]{4})/;
    if (pattern.test(phone)) {
        return "Số điện thoại hợp lệ";
    } else {
        return "Số điện thoại không hợp lệ";
    }
}
export {check_phone};