package bai10;

public class c_teacher extends c_person {
    private int numCourses;
    private String[] courses;

    // tạo constructor
    c_teacher(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[5];
    }

    /**
     * Hàm nhập môn học, nếu môn học đã có rồi thì return false
     * 
     * @param course
     * @return
     */

    public boolean addCourse(String course) {
        // kiểm tra nếu môn học đã tồn tại
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course))
                return false;
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    /**
     * Hàm xóa môn học
     * 
     * @param course
     * @return
     */
    public boolean removeCourse(String course) {
        boolean timthay = false;
        // Look for the course index
        int vitrimon = -1; // need to initialize
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                vitrimon = i;
                timthay = true;
                break;
            }
        }
        if (timthay) {
            // xóa môn học và sắp xếp lại mảng
            for (int i = vitrimon; i < numCourses - 1; i++) {
                courses[i] = courses[i + 1];
            }
            numCourses--;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return " ----- \n Name:" + this.getName() + " | address: " +
                this.getAddress();
    }
}
