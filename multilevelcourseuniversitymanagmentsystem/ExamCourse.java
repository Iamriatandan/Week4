package multilevelcourseuniversitymanagmentsystem;

public class ExamCourse extends CourseType{
    public ExamCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public void evaluationMethod() {
        System.out.println(getCourseName() + " (Department: " + getDepartment() + ") is evaluated through Exams.");
    }
}
