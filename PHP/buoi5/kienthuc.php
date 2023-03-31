khi hàm muốn thay đổi giá trị của biến toàn cục, phải thêm dấu & trước tham số truyền vào
ví dụ: function add(&$a) {
    $a += 34;
    echo $a;
} 
----------------------------------------------------------------
muốn sử dụng biến toàn cục bên trong hàm phải sử dụng từ khóa global
----------------------------------------------------------------
giá trị mặc định
function subtract(a=2, b=a){}
----------------------------------------------------------------
(condition)?gtr1:gtr2
----------------------------------------------------------------
func_get_args(): trả về một mảng chứa các đối số được truyền vào hàm
func_num_args(): trả về số lượng các đối số được truyền vào
func_get_arg($i): trả về tham số tại một index cụ thể. 
----------------------------------------------------------------
get_include_path(): lấy chuỗi chứa đường dẫn file chèn hiện thời
    $include_path = get_include_path();
set_include_path(): thiết lập đường dẫn file chèn
    $set_include_path($include_path, 'c:\program files\xampp\htdocs\php1\buoi5\kienthuc.php')
---------------------------------------
ở phần cài đặt php, chỉ cần kiểm tra isset những phần bắt buộc nhập vào