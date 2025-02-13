package queueinterface.hospitaltriagesystem;
import java.util.*;

public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.severity, p1.severity));

        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        System.out.println("Triage Order:");
        while (!pq.isEmpty()) {
            Patient patient = pq.remove();
            System.out.println(patient.name + " (Severity: " + patient.severity + ")");
        }
    }
}
