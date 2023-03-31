EmailCheck =  (email) => {
    //regex lấy từ w3schools
    let check = mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/; 
        if (check.test(email)) {
        return "Email đúng định dạng";
    } else {
        return "Hãy nhập Email đúng định dạng";
    }
}
export {EmailCheck};