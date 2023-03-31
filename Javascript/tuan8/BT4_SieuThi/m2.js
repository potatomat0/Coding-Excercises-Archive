// Module 2: Xử lý

// Nếu VAT của hàng điện máy > VAT của hàng sành sứ thì xuất ra
//  thông báo “Thuế của hàng hóa lớn hơn sành sứ” 
// ngược lại thì “Thuế của sành sứ lớn hơn hàng hóa”

export var SoSanh = (su,dien) => {
    return (su.tinhVAT() < dien.tinhVAT()) ? `Thuế VAT hàng hóa sứ: ${su.tinhVAT()}VNĐ < thuế hàng hóa điện ${dien.tinhVAT()}VNĐ ` 
                                            : `Thuế VAT hàng hóa sứ: ${su.tinhVAT()}VNĐ > thuế hàng hóa điện ${dien.tinhVAT()}VNĐ `
}
