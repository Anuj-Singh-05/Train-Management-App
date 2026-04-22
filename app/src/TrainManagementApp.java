import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrainManagementApp {

    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes (Regex) ");
        System.out.println("===============================================\n");

        // ---- 1. Train ID Validation ----
        // Format: TRN- followed by exactly 4 digits
        String trainIdPattern = "TRN-\\d{4}";
        String testTrainId = "TRN-1234";

        System.out.println("Validating Train ID: " + testTrainId);
        validateFormat(testTrainId, trainIdPattern, "Train ID");

        // ---- 2. Cargo Code Validation ----
        // Format: PET- followed by exactly 2 uppercase letters
        String cargoCodePattern = "PET-[A-Z]{2}";
        String testCargoCode = "PET-AB";

        System.out.println("\nValidating Cargo Code: " + testCargoCode);
        validateFormat(testCargoCode, cargoCodePattern, "Cargo Code");

        // ---- 3. Testing Invalid Inputs ----
        System.out.println("\n--- Testing Invalid Scenarios ---");
        validateFormat("TRAIN12", trainIdPattern, "Train ID");
        validateFormat("PET-abc", cargoCodePattern, "Cargo Code");

        System.out.println("\nUC11 validation logic completed successfully...");
    }

    /**
     * Utility method to perform regex validation using Pattern and Matcher
     */
    public static void validateFormat(String input, String regex, String label) {
        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        // Create matcher for the input
        Matcher matcher = pattern.matcher(input);

        // matches() checks if the entire string conforms to the regex
        if (matcher.matches()) {
            System.out.println("[SUCCESS] " + label + " '" + input + "' is VALID.");
        } else {
            System.out.println("[ERROR] " + label + " '" + input + "' is INVALID.");
        }
    }
}