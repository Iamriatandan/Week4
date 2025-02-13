package insurancepolicymanagementsystem;
import java.util.*;
import java.time.*;

public class InsurancePolicy {
    String policyNumber;
    String policyholderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + ", Name: " + policyholderName + ", Expiry Date: " + expiryDate + ", Coverage: " + coverageType + ", Premium: " + premiumAmount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        InsurancePolicy policy = (InsurancePolicy) obj;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    public boolean isExpiringSoon() {
        LocalDate today = LocalDate.now();
        return !expiryDate.isBefore(today) && expiryDate.isBefore(today.plusDays(30));
    }
}
