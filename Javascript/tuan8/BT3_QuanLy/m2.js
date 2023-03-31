// Module 2 : Xử lý
    // Nếu Thành Tiền của Sắt > Thành tiền của Gạch thì xuất ra thông báo « Thành tiền của Sắt lớn hơn » ngược lại « Thành Tiền của gạch lớn hơn Sắt »



export var SoSanh = (sat,gach) => {
    return (sat.thanhTien() < gach.thanhTien()) ? 'Đơn giá gạch lớn hơn đơn giá sắt' : 'Đơn giá sắt lớn hơn đơn giá gạch'
}

// console.log(SoSanh(muaSat, muaGach))

