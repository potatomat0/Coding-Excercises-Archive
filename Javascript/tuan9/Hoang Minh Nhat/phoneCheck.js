const pc = inputtxt =>
{
  var ptag = document.getElementById('alert');
  //regex lấy từ w3schools
  var phoneno = /^\d{10}$/;
  if(inputtxt.value.match(phoneno))
  {
    alert('số điện thoại hợp lệ')
    ptag.innerHTML = 'Số điện thoại hợp lệ';
    document.form2.text2.focus();
    return true
  }
  else
  {
    alert('số điện thoại không hợp lệ');
    ptag.innerHTML = 'Số điện thoại không hợp lệ, phải nhập 10 chữ số'
    document.form2.text2.focus();
    return false
  }
}

// export default pc
// module.exports.pc= pc;  