import {check_name} from './NameCheck.js'
document.getElementById('name').onchange = function () {
    document.getElementById('check_name').innerText = check_name(document.getElementById('name').value);
}