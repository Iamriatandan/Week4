package votingsystem;
import java.util.*;
public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> candidateVotes = new HashMap<>();
        Map<String, Integer> sortedVotes = new TreeMap<>(Comparator.comparingInt(candidateVotes::get).reversed());
        Map<String, Integer> orderOfVotes = new LinkedHashMap<>();

        // Sample votes
        castVote(candidateVotes, sortedVotes, orderOfVotes, "Alice");
        castVote(candidateVotes, sortedVotes, orderOfVotes, "Bob");
        castVote(candidateVotes, sortedVotes, orderOfVotes, "Alice");

        // Display results sorted by votes
        System.out.println("Voting Results: " + sortedVotes);
    }

    public static void castVote(Map<String, Integer> candidateVotes, Map<String, Integer> sortedVotes, Map<String, Integer> orderOfVotes, String candidate) {
        candidateVotes.put(candidate, candidateVotes.getOrDefault(candidate, 0) + 1);
        orderOfVotes.put(candidate, candidateVotes.get(candidate));
        sortedVotes.clear();
        sortedVotes.putAll(orderOfVotes);
    }
}
