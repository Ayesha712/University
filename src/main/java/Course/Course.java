package Course;

public class Course {
    private int CourseId;
    private  String CourseName;
    private int Tec_Id;


    public Course(){
        this.CourseId=CourseId;
        this.CourseName=CourseName;

    }

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }


}
