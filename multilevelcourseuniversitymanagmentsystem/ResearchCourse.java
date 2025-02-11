package multilevelcourseuniversitymanagmentsystem;

public class ResearchCourse extends CourseType{
    public ResearchCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluationMethod() {
        System.out.println(getCourseName() + " (Department: " + getDepartment() + ") is evaluated through Research Papers.");
    }
}
