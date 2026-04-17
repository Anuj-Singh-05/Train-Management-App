import java.util.LinkedHashSet;
import java.util.Set;

public class TrainManagementApp {
    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("===============================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ---- Attaching bogies in specific order ----
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Attempting to add a duplicate (Sleeper)
        // LinkedHashSet will ignore this to prevent invalid attachments
        formation.add("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");
        
        System.out.println("\nUC5 formation setup completed...");
    }
}