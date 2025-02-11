package aidrivenresumescreeningsystem;
import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
        private String candidateName; // Candidate's name
        private int experience; // Years of experience

        public JobRole(String candidateName, int experience) {
            this.candidateName = candidateName;
            this.experience = experience;
        }

        public String getCandidateName() {
            return candidateName;
        }

        public int getExperience() {
            return experience;
        }

        // Abstract method to define required skills
        public abstract void requiredSkills();
}
