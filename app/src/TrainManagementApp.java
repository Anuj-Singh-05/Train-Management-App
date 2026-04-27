// Custom Runtime Exception for operational safety
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

public class TrainManagementApp {

    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
            this.cargo = "Empty";
        }

        // Method to assign cargo with safety checks
        public void assignCargo(String newCargo) {
            System.out.println("Initiating assignment: " + newCargo + " to " + shape + " bogie.");
            
            try {
                // Safety Rule: Petroleum MUST be in a Cylindrical bogie
                if (newCargo.equalsIgnoreCase("Petroleum") && !shape.equalsIgnoreCase("Cylindrical")) {
                    throw new CargoSafetyException("SAFETY ALERT: Petroleum cannot be carried in a " + shape + " bogie!");
                }
                
                this.cargo = newCargo;
                System.out.println("[SUCCESS] Cargo assigned: " + this.cargo);

            } catch (CargoSafetyException e) {
                System.out.println("[HANDLED ERROR] " + e.getMessage());
            } finally {
                // This block always runs, ideal for logging or resource cleanup
                System.out.println("[SYSTEM LOG] Safety inspection complete for this assignment.");
            }
        }

        @Override
        public String toString() {
            return shape + " Bogie (Cargo: " + cargo + ")";
        }
    }

    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC15 - Safe Cargo Assignment (try-catch-finally) ");
        System.out.println("===============================================\n");

        // Scenario 1: Safe Assignment
        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        cylindrical.assignCargo("Petroleum");
        System.out.println(cylindrical);

        System.out.println("\n-----------------------------------------------\n");

        // Scenario 2: Unsafe Assignment
        GoodsBogie rectangular = new GoodsBogie("Rectangular");
        rectangular.assignCargo("Petroleum"); // This should trigger the exception
        System.out.println(rectangular);

        System.out.println("\nUC15 structured exception handling completed.");
    }
}