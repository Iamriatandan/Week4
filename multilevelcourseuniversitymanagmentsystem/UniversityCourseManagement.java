package multilevelcourseuniversitymanagmentsystem;

public class UniversityCourseManagement {
    public static void main(String[] args) {
        // Creating different course types
        ExamCourse mathCourse = new ExamCourse("Mathematics 101", "Science");
        AssignmentCourse historyCourse = new AssignmentCourse("World History", "Arts");
        ResearchCourse aiCourse = new ResearchCourse("Artificial Intelligence", "Computer Science");

        // Wrapping them inside the generic Course class
        Course<ExamCourse> course1 = new Course<>(mathCourse);
        Course<AssignmentCourse> course2 = new Course<>(historyCourse);
        Course<ResearchCourse> course3 = new Course<>(aiCourse);

        // Creating a Course Catalog
        CourseCatalog universityCatalog = new CourseCatalog();

        // Adding courses to the catalog
        universityCatalog.addCourse(course1);
        universityCatalog.addCourse(course2);
        universityCatalog.addCourse(course3);

        // Displaying all courses dynamically
        universityCatalog.displayAllCourses();
    }
}
