// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

public class TrainManagementApp {

    static class Bogie {
        String name;
        int capacity;

        // Constructor now enforces business rules
        Bogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero (Provided: " + capacity + ")");
            }
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("===============================================\n");

        // Scenario 1: Creating a Valid Bogie
        try {
            System.out.println("Attempting to create a valid bogie...");
            Bogie validBogie = new Bogie("Sleeper", 72);
            System.out.println("[SUCCESS] Created: " + validBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("[ERROR] " + e.getMessage());
        }

        // Scenario 2: Attempting to create an Invalid Bogie (Zero Capacity)
        System.out.println("\nAttempting to create an invalid bogie (Zero)...");
        try {
            Bogie invalidBogie1 = new Bogie("AC Chair", 0);
            System.out.println("[SUCCESS] Created: " + invalidBogie1);
        } catch (InvalidCapacityException e) {
            System.out.println("[CAUGHT EXCEPTION] " + e.getMessage());
        }

        // Scenario 3: Attempting to create an Invalid Bogie (Negative Capacity)
        System.out.println("\nAttempting to create an invalid bogie (Negative)...");
        try {
            Bogie invalidBogie2 = new Bogie("First Class", -10);
            System.out.println("[SUCCESS] Created: " + invalidBogie2);
        } catch (InvalidCapacityException e) {
            System.out.println("[CAUGHT EXCEPTION] " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed successfully...");
    }
}