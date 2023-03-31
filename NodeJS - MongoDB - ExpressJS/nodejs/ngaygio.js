let ngaygio = new Date();
module.exports = {
     //xử dụng Date() để lấy ng hiện tại
     ngay : ngaygio.getDate(), //sử dụng hàm getDate() để lấy ngày của đối tượng ngaygio
     thang : ngaygio.getMonth() +1 , //tương tự vậy với getMonth() để lấy tháng
     nam : ngaygio.getFullYear(), //...và năm
     gio : ngaygio.getHours(), //... và giờ
     phut : ngaygio.getMinutes(), //... và phút
     giay : ngaygio.getSeconds() //... và giây
}