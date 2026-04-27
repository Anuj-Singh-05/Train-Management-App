import java.util.Arrays;

public class TrainManagementApp {

    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC17 - Sort Bogie Names Using Arrays.sort() ");
        System.out.println("===============================================\n");

        // Array of bogie type names in unsorted order
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("Bogie Names Before Sorting:");
        System.out.println(Arrays.toString(bogieTypes));

        // ---- Using Java's Built-in Utility ----
        // This replaces the nested loops and swap logic from UC16
        Arrays.sort(bogieTypes);

        System.out.println("\nBogie Names After Alphabetical Sorting:");
        System.out.println(Arrays.toString(bogieTypes));

        System.out.println("\nUC17 library-based sorting completed successfully...");
    }
}