function check_name (name="") {
    if (name!="") {
        return "Tên hợp lệ";
    } else {
        return "Tên không hợp lệ";
    }
}
export {check_name};