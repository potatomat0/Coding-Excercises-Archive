const vietHoaCau = str => {
    var words = str.split(" ");

    return    words.map((word) => { 
    return word[0].toUpperCase() + word.substring(1); 
    }).join(" ");

}

export default vietHoaCau

