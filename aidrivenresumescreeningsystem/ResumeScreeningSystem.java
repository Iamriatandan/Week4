package aidrivenresumescreeningsystem;
import java.util.*;
public class ResumeScreeningSystem {
    private List<Resume<? extends JobRole>> resumes; // List to store resumes dynamically

    public ResumeScreeningSystem() {
        resumes = new ArrayList<>();
    }

    // Add a resume to the screening pipeline
    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }

    // Process and display all resumes
    public void processResumes() {
        System.out.println("\n--- AI-Driven Resume Screening ---");
        for (Resume<? extends JobRole> resume : resumes) {
            resume.displayResumeDetails();
        }
    }
}
