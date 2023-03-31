import {EmailCheck} from './EmailValidateDemo.js'
document.getElementById('email').onchange = () => {
    document.getElementById('alert').innerText = EmailCheck(document.getElementById('email').value);
}