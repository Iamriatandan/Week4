package multilevelcourseuniversitymanagmentsystem;
import java.util.*;
public class CourseCatalog {
    private List<Course<? extends CourseType>> courses; // List of courses with wildcard

    public CourseCatalog() {
        courses = new ArrayList<>();
    }

    // Add a course to the catalog
    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    // Display all courses dynamically using wildcards
    public void displayAllCourses() {
        System.out.println("\n--- University Course List ---");
        for (Course<? extends CourseType> course : courses) {
            course.displayCourseDetails();
        }
    }
}
