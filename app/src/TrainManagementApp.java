import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrainManagementApp {

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
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams ");
        System.out.println("===============================================\n");

        // Initialize bogie list
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("All Bogies in Consist:");
        bogies.forEach(System.out::println);

        // ---- Stream Pipeline: Filter bogies with capacity > 60 ----
        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.capacity > 60) // Predicate logic
                .collect(Collectors.toList()); // Terminal operation

        System.out.println("\nHigh Capacity Bogies (Capacity > 60):");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            highCapacityBogies.forEach(System.out::println);
        }

        // Verify original list integrity
        System.out.println("\nTotal bogies in original list: " + bogies.size());
        System.out.println("UC8 filtering completed successfully...");
    }
}