package multilevelcourseuniversitymanagmentsystem;

public class AssignmentCourse extends CourseType{
    public AssignmentCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluationMethod() {
        System.out.println(getCourseName() + " (Department: " + getDepartment() + ") is evaluated through Assignments.");
    }
}
