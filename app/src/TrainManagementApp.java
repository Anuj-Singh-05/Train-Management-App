import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    // Bogie class from previous UCs
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
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
        System.out.println(" UC10 - Count Total Seats in Train (reduce) ");
        System.out.println("===============================================\n");

        // Initialize bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("Train Consist for Capacity Analysis:");
        bogies.forEach(System.out::println);

        // ---- Stream Pipeline: map to capacity, then reduce to sum ----
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)           // Extract capacity
                .reduce(0, Integer::sum);       // Identity 0, add them up

        System.out.println("\n-----------------------------------------------");
        System.out.println(" TOTAL SEATING CAPACITY : " + totalCapacity);
        System.out.println("-----------------------------------------------");

        System.out.println("\nUC10 aggregation completed successfully...");
    }
}