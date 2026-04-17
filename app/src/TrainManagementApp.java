import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
            return name + " (Cap: " + capacity + ")";
        }
    }

    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC9 - Group Bogies by Type (groupingBy) ");
        System.out.println("===============================================\n");

        // Initialize bogie list with some duplicates for grouping
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("Sleeper", 72)); // Second Sleeper bogie
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("AC Chair", 56)); // Second AC Chair bogie

        System.out.println("Current Train Consist (Flat List):");
        bogies.forEach(System.out::println);

        // ---- Stream Pipeline: Grouping bogies by their name/type ----
        // Key: Bogie Name (String), Value: List of Bogie objects
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("\nBogies Grouped by Type:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + " -> " + list);
        });

        System.out.println("\nUC9 grouping operation completed successfully...");
    }
}