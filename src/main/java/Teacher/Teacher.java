package Teacher;
import Student.Student;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private int Tec_Id;
    private String Tec_Name;
    private int Course_Id;
    public List<Student> studentEnrolled;
    public InputStream m;

    public Teacher() {
        this.Tec_Id = Tec_Id;
        this.Tec_Name = Tec_Name;
        this.Course_Id = Course_Id;
        studentEnrolled = new ArrayList<>();

    }

    public static void add(Teacher tec) {
    }

    public int getTec_Id() {

        return Tec_Id;
    }

    public void setTec_Id(int tec_Id) {

        Tec_Id = tec_Id;
    }

    public String getTec_Name() {
        return Tec_Name;
    }

    public String setTec_Name(String tec_Name) {
        Tec_Name = tec_Name;
        return tec_Name;
    }


    public int getCourse_Id() {

        return Course_Id;
    }

    public void setCourse_Id(int course_Id) {

        Course_Id = course_Id;
    }

    // Teacher add the students
    public void add_Student(Student stu) {
        Student.add(stu);
    }


    // Teacher can delete student
    public void delete_Student(Student stu) {
        if (m!=null) {
            Student.remove( stu.getStu_Id(m));
        }
    }
}