import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    /**
     * Searches for a bogie ID in the list.
     * Throws IllegalStateException if the train consist is empty.
     */
    public static boolean findBogie(List<String> bogies, String searchKey) {
        // ---- State Validation (Fail-Fast) ----
        if (bogies == null || bogies.isEmpty()) {
            throw new IllegalStateException("Search Failed: No bogies available in the train consist.");
        }

        // Logic only proceeds if the state is valid
        return bogies.contains(searchKey);
    }

    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC20 - Exception Handling During Search ");
        System.out.println("===============================================\n");

        List<String> emptyConsist = new ArrayList<>();
        List<String> activeConsist = List.of("BG101", "BG205", "BG309");

        // Scenario 1: Search on empty data
        try {
            System.out.println("Attempting to search empty consist...");
            findBogie(emptyConsist, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("[CAUGHT] " + e.getMessage());
        }

        System.out.println("\n-----------------------------------------------\n");

        // Scenario 2: Search on valid data
        try {
            String target = "BG205";
            System.out.println("Attempting to search for: " + target);
            boolean isFound = findBogie(activeConsist, target);
            System.out.println("[RESULT] Bogie found: " + isFound);
        } catch (IllegalStateException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }

        System.out.println("\nUC20 state validation completed successfully.");
    }
}