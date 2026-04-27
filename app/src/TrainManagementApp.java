import java.util.Arrays;

public class TrainManagementApp {

    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC16 - Sort Bogies by Capacity (Bubble Sort) ");
        System.out.println("===============================================\n");

        // Array of passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting: " + Arrays.toString(capacities));

        // ---- Bubble Sort Algorithm ----
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already in place, so we ignore them
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {
                    // Swap logic using a temporary variable
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("After Bubble Sort: " + Arrays.toString(capacities));
        System.out.println("\nUC16 manual sorting completed successfully...");
    }
}