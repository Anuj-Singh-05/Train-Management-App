public class TrainManagementApp {

    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC18 - Linear Search for Bogie ID ");
        System.out.println("===============================================\n");

        // Array of unsorted Bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        String searchKey = "BG309";

        System.out.println("Consist IDs: " + String.join(", ", bogieIds));
        System.out.println("Searching for: " + searchKey);

        // ---- Linear Search Logic ----
        boolean found = false;
        int position = -1;

        for (int i = 0; i < bogieIds.length; i++) {
            // Sequential comparison
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                position = i;
                break; // Early Termination: stop once found
            }
        }

        if (found) {
            System.out.println("\n[SUCCESS] Bogie " + searchKey + " found at position: " + (position + 1));
        } else {
            System.out.println("\n[NOT FOUND] Bogie " + searchKey + " is not in the consist.");
        }

        System.out.println("\nUC18 search operation completed successfully...");
    }
}