var ptag = document.getElementById('alert');
const emailCheck = inputText =>
{
    //regrex từ w3schools
    var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    
    if(inputText.value.match(mailformat)){
        alert("Email hợp lệ");
        ptag.innerHTML = 'Email không hợp lệ'
        document.form1.text1.focus();
        return true;
}
    else
        {
            alert("Email không hợp lệ");
            ptag.innerHTML = 'Email không hợp lệ'
            document.form1.text1.focus();
            return false;
        }
}

// export default emailCheck 