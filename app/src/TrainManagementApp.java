import java.util.Arrays;

public class TrainManagementApp {

    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("===============================================\n");

        // Initial unsorted array
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        String searchKey = "BG205";

        // Precondition: Binary Search REQUIRES sorted data
        Arrays.sort(bogieIds);
        System.out.println("Sorted Consist IDs: " + Arrays.toString(bogieIds));
        System.out.println("Searching for: " + searchKey);

        // ---- Binary Search Logic ----
        int low = 0;
        int high = bogieIds.length - 1;
        int foundIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate middle index
            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                foundIndex = mid; // Match found
                break;
            } else if (comparison > 0) {
                low = mid + 1; // Key is in the right half
            } else {
                high = mid - 1; // Key is in the left half
            }
        }

        if (foundIndex != -1) {
            System.out.println("\n[SUCCESS] Bogie " + searchKey + " found at sorted index: " + foundIndex);
        } else {
            System.out.println("\n[NOT FOUND] Bogie " + searchKey + " does not exist.");
        }

        System.out.println("\nUC19 binary search operation completed.");
    }
}