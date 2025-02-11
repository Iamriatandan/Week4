package multilevelcourseuniversitymanagmentsystem;
import java.util.*;
abstract class CourseType {
    private String courseName; // Name of the course
    private String department; // Department offering the course

    public CourseType(String courseName, String department) {
        this.courseName = courseName;
        this.department = department;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDepartment() {
        return department;
    }

    // Abstract method to be implemented by specific course types
    public abstract void evaluationMethod();
}
