package bai10;

public class c_student extends c_person {
    // khai báo biến
    private int numCourses = 0;
    private String[] courses;
    private int[] grades;

    // Khơi tạo constructor
    c_student(String name, String address) {
        super(name, address);
        courses = new String[30];

        grades = new int[30];

    }

    // constructor không có tham số truyền vào
    c_student() {

    }

    /**
     * hàm truyền điểm và môn vào arraylist
     * 
     * @param course
     * @param grade
     */
    public void addCourseGrade(String course, int grade) {

        courses[numCourses] = course;

        grades[numCourses] = grade;

        ++numCourses;

    }

    /**
     * Hàm in ra điểm và môn
     */
    public void printGrades() {
        System.out.println("Mon hoc va diem cua mon hoc:");
        System.out.println("-----");
        for (int i = 0; i < numCourses; ++i) {

            System.out.print(" " + courses[i] + ":" + grades[i]);

        }

    }

    /**
     * Hàm tính điểm trung bình
     * 
     * @return
     */
    public float diemTB() {
        int sum = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
        }
        return (float) sum / numCourses;
    }

    /**
     * Hàm trả về chuỗi
     */
    public String toString() {
        return " ----- \n Name:" + this.getName() + " | address: " +
                this.getAddress();
    }
}
