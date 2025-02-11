package multilevelcourseuniversitymanagmentsystem;

public class Course <T extends CourseType>{
    private T courseType; // The type of course

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public void displayCourseDetails() {
        courseType.evaluationMethod(); // Calls the evaluation method of the specific course type
    }
}
