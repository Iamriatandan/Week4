package insurancepolicymanagementsystem;
import java.util.*;
import java.time.*;
public class InsurancePolicyManager {
    public static void main(String[] args) {
        // Sample policies
        InsurancePolicy policy1 = new InsurancePolicy("P001", "John Doe", LocalDate.of(2025, 3, 15), "Health", 500.0);
        InsurancePolicy policy2 = new InsurancePolicy("P002", "Jane Smith", LocalDate.of(2025, 2, 28), "Auto", 300.0);
        InsurancePolicy policy3 = new InsurancePolicy("P003", "Sam Wilson", LocalDate.of(2025, 6, 10), "Home", 700.0);
        InsurancePolicy policy4 = new InsurancePolicy("P004", "Mary Jane", LocalDate.of(2025, 4, 20), "Health", 450.0);

        // Using different sets
        Set<InsurancePolicy> hashSet = new HashSet<>();
        Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
        Set<InsurancePolicy> treeSet = new TreeSet<>(Comparator.comparing(policy -> policy.expiryDate));

        // Adding policies to sets
        addPolicies(hashSet, policy1, policy2, policy3, policy4);
        addPolicies(linkedHashSet, policy1, policy2, policy3, policy4);
        addPolicies(treeSet, policy1, policy2, policy3, policy4);

        // Retrieve and display policies
        System.out.println("All unique policies (HashSet): ");
        displayPolicies(hashSet);

        System.out.println("\nAll unique policies (LinkedHashSet): ");
        displayPolicies(linkedHashSet);

        System.out.println("\nAll unique policies (TreeSet): ");
        displayPolicies(treeSet);

        // Policies expiring soon
        System.out.println("\nPolicies expiring soon:");
        displayExpiringSoon(hashSet);

        // Policies with specific coverage type
        System.out.println("\nPolicies with Health coverage:");
        displayPoliciesWithCoverage(hashSet, "Health");

        // Compare performance
        System.out.println("\nPerformance Comparison:");
        comparePerformance(hashSet, linkedHashSet, treeSet);
    }

    public static void addPolicies(Set<InsurancePolicy> set, InsurancePolicy... policies) {
        for (InsurancePolicy policy : policies) {
            set.add(policy);
        }
    }

    public static void displayPolicies(Set<InsurancePolicy> set) {
        for (InsurancePolicy policy : set) {
            System.out.println(policy);
        }
    }

    public static void displayExpiringSoon(Set<InsurancePolicy> set) {
        for (InsurancePolicy policy : set) {
            if (policy.isExpiringSoon()) {
                System.out.println(policy);
            }
        }
    }

    public static void displayPoliciesWithCoverage(Set<InsurancePolicy> set, String coverage) {
        for (InsurancePolicy policy : set) {
            if (policy.coverageType.equalsIgnoreCase(coverage)) {
                System.out.println(policy);
            }
        }
    }

    public static void comparePerformance(Set<InsurancePolicy> hashSet, Set<InsurancePolicy> linkedHashSet, Set<InsurancePolicy> treeSet) {
        long startTime, endTime;

        // HashSet Performance
        startTime = System.nanoTime();
        hashSet.add(new InsurancePolicy("P005", "Peter Parker", LocalDate.of(2025, 7, 10), "Auto", 400.0));
        endTime = System.nanoTime();
        System.out.println("HashSet Add Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        hashSet.remove(new InsurancePolicy("P001", "John Doe", LocalDate.of(2025, 3, 15), "Health", 500.0));
        endTime = System.nanoTime();
        System.out.println("HashSet Remove Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        hashSet.contains(new InsurancePolicy("P003", "Sam Wilson", LocalDate.of(2025, 6, 10), "Home", 700.0));
        endTime = System.nanoTime();
        System.out.println("HashSet Contains Time: " + (endTime - startTime) + " ns");

        // LinkedHashSet Performance
        startTime = System.nanoTime();
        linkedHashSet.add(new InsurancePolicy("P005", "Peter Parker", LocalDate.of(2025, 7, 10), "Auto", 400.0));
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedHashSet.remove(new InsurancePolicy("P001", "John Doe", LocalDate.of(2025, 3, 15), "Health", 500.0));
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Remove Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedHashSet.contains(new InsurancePolicy("P003", "Sam Wilson", LocalDate.of(2025, 6, 10), "Home", 700.0));
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Contains Time: " + (endTime - startTime) + " ns");

        // TreeSet Performance
        startTime = System.nanoTime();
        treeSet.add(new InsurancePolicy("P005", "Peter Parker", LocalDate.of(2025, 7, 10), "Auto", 400.0));
        endTime = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        treeSet.remove(new InsurancePolicy("P001", "John Doe", LocalDate.of(2025, 3, 15), "Health", 500.0));
        endTime = System.nanoTime();
        System.out.println("TreeSet Remove Time: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        treeSet.contains(new InsurancePolicy("P003", "Sam Wilson", LocalDate.of(2025, 6, 10), "Home", 700.0));
        endTime = System.nanoTime();
        System.out.println("TreeSet Contains Time: " + (endTime - startTime) + " ns");
    }
}

