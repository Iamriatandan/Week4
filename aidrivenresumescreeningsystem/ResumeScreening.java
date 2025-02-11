package aidrivenresumescreeningsystem;

public class ResumeScreening {
    public static void main(String[] args) {
        // Creating resumes for different job roles
        SoftwareEngineer seCandidate = new SoftwareEngineer("Alice Johnson", 5);
        DataScientiest dsCandidate = new DataScientiest("Bob Williams", 3);
        ProductManager pmCandidate = new ProductManager("Charlie Brown", 7);

        // Wrapping them in the generic Resume class
        Resume<SoftwareEngineer> resume1 = new Resume<>(seCandidate);
        Resume<DataScientiest> resume2 = new Resume<>(dsCandidate);
        Resume<ProductManager> resume3 = new Resume<>(pmCandidate);

        // Creating a Resume Screening System
        ResumeScreeningSystem screeningSystem = new ResumeScreeningSystem();

        // Adding resumes to the screening system
        screeningSystem.addResume(resume1);
        screeningSystem.addResume(resume2);
        screeningSystem.addResume(resume3);

        // Processing resumes dynamically
        screeningSystem.processResumes();
    }
}
