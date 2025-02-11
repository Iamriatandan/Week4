package aidrivenresumescreeningsystem;

public class Resume <T extends JobRole>{
    private T jobRole; // The specific job role

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void displayResumeDetails() {
        System.out.println("\nScreening Resume for " + jobRole.getCandidateName());
        System.out.println("Experience: " + jobRole.getExperience() + " years");
        jobRole.requiredSkills(); // Calls the required skills method of the specific job role
    }
}
