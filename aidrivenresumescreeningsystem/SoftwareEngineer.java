package aidrivenresumescreeningsystem;

public class SoftwareEngineer extends JobRole{
    public SoftwareEngineer(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public void requiredSkills() {
        System.out.println(getCandidateName() + " (Software Engineer) - Required Skills: Java, Python, Data Structures, Algorithms.");
    }
}
