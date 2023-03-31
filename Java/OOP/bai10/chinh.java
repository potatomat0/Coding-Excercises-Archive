package bai10;

/**
 * Giả sử chúng ta phải mô hình hóa sinh viên và giáo viên trong ứng dụng của
 * chúng
 * ta. Chúng ta có thể định nghĩa một siêu lớp được gọi là Người để lưu trữ các
 * thuộc
 * tính phổ biến như tên và địa chỉ và phân lớp Học sinh và Giáo viên cho các
 * thuộc
 * tính cụ thể của chúng. Đối với sinh viên, chúng ta cần duy trì các khóa học
 * đã học
 * và các điểm tương ứng; thêm một khóa học với lớp, in tất cả các khóa học đã
 * thực
 * hiện và tính trung bình. Giả sử rằng một sinh viên mất không quá 30 khóa học
 * cho
 * toàn bộ chương trình. Đối với giáo viên, chúng ta cần phải duy trì các khóa
 * học
 * được giảng dạy hiện nay và có thể thêm hoặc xóa một khóa học được giảng dạy.
 * Giả sử rằng một giáo viên dạy không quá 5 khóa học đồng thời
 * 
 * @date 4/6/2022
 * @author Hoang Minh Nhat.
 */

public class chinh {
    public static void main(String[] args) {
        // ===================================== Sử dụng class c_student
        c_student hs1 = new c_student("Hoang Minh Nhat", "Tp.HCM");
        System.out.println(hs1); // in ra thông tin sinh viên
        // nhập môn và điểm
        hs1.addCourseGrade("Toan", 7);
        hs1.addCourseGrade("Hoa", 6);
        // in ra môn và điểm
        hs1.printGrades();
        System.out.println("\nDiem trung binh cac mon la: " + hs1.diemTB());

        // =================================== Sử dụng class c_teacher
        System.out.println("---------------Giao vien----------------");
        c_teacher gv1 = new c_teacher("John doe", "Tp.HCM");
        System.out.println(gv1); // in ra thông tin giáo viên
        // Nhập môn vào chuỗi
        String[] courses = { "Toan", "Ly", "Hoa", "Toan" };
        System.out.println("-----Nhap mon-----");
        for (String course : courses) {
            if (gv1.addCourse(course)) {
                System.out.println("mon " + course + " da duoc them vao");
            } else {
                System.out.println("mon " + course + " da ton tai, ko duoc them vao");
            }
        }
        // xóa môn trong chuỗi
        System.out.println("-----Xoa mon-----");
        for (String course : courses) {
            if (gv1.removeCourse("Ly")) {
                System.out.println("mon " + course + " da duoc xoa");
            } else {
                System.out.println("mon " + course + " khong ton tai, ko the xoa");
            }
        }
    } // end main
} // end class
