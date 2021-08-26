package Student;

import Teacher.Teacher;

import java.io.InputStream;
import java.util.*;
import java.util.ArrayList;
public class Student {
    private  int Stu_Id;
    private  String Stu_Name;
    private String StudentAddress;
    public List<StudentCourse> CoursesEnrolled;
    public List<Teacher>teacherEnrolled;


    public Student() {
        this.Stu_Id=Stu_Id;
        this.Stu_Name=Stu_Name;
        this.StudentAddress=StudentAddress;
        CoursesEnrolled=new ArrayList<>();
        teacherEnrolled=new ArrayList<>();
    }

    public static void add(Student stu) {
    }

    public static void remove(int stu_id) {
    }


    //Add courses
    public void addCourse(StudentCourse sc){

        CoursesEnrolled.add(sc);
    }
    //Add teacher
    public void add_Teacher(Teacher tec){

        Teacher.add(tec);
    }
    

    public int getStu_Id(InputStream i) {

        return Stu_Id;
    }

    public int setStu_Id(int stu_Id) {
        Stu_Id = stu_Id;
        return stu_Id;
    }

    public String getStu_Name() {
        return Stu_Name;
    }

    public void setStu_Name(String stu_Name) {
        Stu_Name = stu_Name;
    }
}
