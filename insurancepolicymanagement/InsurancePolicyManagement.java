package insurancepolicymanagement;
import java.util.*;
import java.time.*;
public class InsurancePolicyManagement {
    // Storing policies
    static Map<String, Policy> policiesByNumber = new HashMap<>();
    static Map<String, Policy> policiesByInsertionOrder = new LinkedHashMap<>();
    static Map<LocalDate, Policy> policiesByExpiryDate = new TreeMap<>();

    public static void main(String[] args) {
        // Sample Policies
        Policy policy1 = new Policy("Alice", LocalDate.of(2025, 3, 15), 1500.00);
        Policy policy2 = new Policy("Bob", LocalDate.of(2025, 2, 20), 1200.00);
        Policy policy3 = new Policy("Alice", LocalDate.of(2025, 3, 10), 1300.00);

        // Adding policies
        addPolicy("P001", policy1);
        addPolicy("P002", policy2);
        addPolicy("P003", policy3);

        // Retrieve a policy by number
        System.out.println("Retrieve Policy P002: " + getPolicyByNumber("P002"));

        // List policies expiring within the next 30 days
        System.out.println("Policies expiring soon: " + listExpiringSoon());

        // List policies by specific policyholder
        System.out.println("Policies for Alice: " + listPoliciesByPolicyholder("Alice"));

        // Remove expired policies (if any)
        removeExpiredPolicies();
    }

    // Add a policy
    public static void addPolicy(String policyNumber, Policy policy) {
        policiesByNumber.put(policyNumber, policy);
        policiesByInsertionOrder.put(policyNumber, policy);
        policiesByExpiryDate.put(policy.expiryDate, policy);
    }

    // Retrieve a policy by number
    public static Policy getPolicyByNumber(String policyNumber) {
        return policiesByNumber.get(policyNumber);
    }

    // List policies expiring within the next 30 days
    public static List<Policy> listExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate thirtyDaysFromNow = today.plusDays(30);
        List<Policy> expiringPolicies = new ArrayList<>();

        for (Policy policy : policiesByExpiryDate.values()) {
            if (!policy.expiryDate.isBefore(today) && policy.expiryDate.isBefore(thirtyDaysFromNow)) {
                expiringPolicies.add(policy);
            }
        }
        return expiringPolicies;
    }

    // List policies by a specific policyholder
    public static List<Policy> listPoliciesByPolicyholder(String name) {
        List<Policy> result = new ArrayList<>();
        for (Policy policy : policiesByNumber.values()) {
            if (policy.policyholderName.equals(name)) {
                result.add(policy);
            }
        }
        return result;
    }

    // Remove expired policies
    public static void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        policiesByExpiryDate.entrySet().removeIf(entry -> entry.getKey().isBefore(today));
        policiesByNumber.entrySet().removeIf(entry -> entry.getValue().expiryDate.isBefore(today));
        policiesByInsertionOrder.entrySet().removeIf(entry -> entry.getValue().expiryDate.isBefore(today));
    }
}
