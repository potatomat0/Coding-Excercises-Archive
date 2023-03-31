function nameCheck1(inputtxt){
    //regex từ w3schools 
    var letters = /^[A-Za-z]+$/;
    if(inputtxt.value.match(letters)){
      return('Tên hợp lệ');
      // return true;
    }
    else{
        Return('Tên không hợp lệ');
        // return false;
    }
}

export {nameCheck1}