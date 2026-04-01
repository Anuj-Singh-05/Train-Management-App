import java.util.HashSet;
import java.util.Set;

public class TrainManagementApp {
    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("===============================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet automatically handles uniqueness
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        
        // Attempting to add duplicates - HashSet will ignore these
        bogies.add("BG101"); 
        bogies.add("BG102"); 

        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        
        System.out.println("\nUC3 uniqueness validation completed...");
    }
}