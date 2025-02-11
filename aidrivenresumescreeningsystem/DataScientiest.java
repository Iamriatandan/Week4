package aidrivenresumescreeningsystem;

public class DataScientiest extends JobRole{
    public DataScientiest(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public void requiredSkills() {
        System.out.println(getCandidateName() + " (Data Scientist) - Required Skills: Machine Learning, Python, SQL, Statistics.");
    }
}
