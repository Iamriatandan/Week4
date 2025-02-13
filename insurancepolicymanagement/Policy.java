package insurancepolicymanagement;
import java.time.*;
public class Policy {
    String policyholderName;
    LocalDate expiryDate;
    double premiumAmount;

    public Policy(String policyholderName, LocalDate expiryDate, double premiumAmount) {
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.premiumAmount = premiumAmount;
    }

    public String toString() {
        return "Policyholder: " + policyholderName + ", Expiry Date: " + expiryDate + ", Premium: " + premiumAmount;
    }
}
