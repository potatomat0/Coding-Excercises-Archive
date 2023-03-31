export var SoSanh = (tre,trinh) => {
    return (tre.thanhTien() < trinh.thanhTien()) ? 'Đơn giá nhạc trẻ nhỏ hơn đơn giá nhạc trịnh' : 'Đơn giá nhạc trẻ lớn hơn đơn giá nhạc trịnh'
}