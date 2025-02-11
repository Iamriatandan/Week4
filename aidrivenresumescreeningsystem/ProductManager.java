package aidrivenresumescreeningsystem;

public class ProductManager extends JobRole{
    public ProductManager(String candidateName, int experience) {
        super(candidateName, experience);
    }

    @Override
    public void requiredSkills() {
        System.out.println(getCandidateName() + " (Product Manager) - Required Skills: Market Analysis, UX/UI, Agile Methodologies.");
    }
}
