import {check_phone} from './export2.js'
document.getElementById('phonenumber').onchange = function () {
    document.getElementById('check_phone_number').innerText = check_phone(document.getElementById('phonenumber').value);
}