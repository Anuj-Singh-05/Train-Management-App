import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainManagementApp {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("===============================================\n");

        // Create list of passenger bogie objects
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("Before Sorting:");
        bogies.forEach(System.out::println);

        // Sort using Comparator based on capacity
        // comparingInt provides a clear, type-safe way to define sorting rules
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting by Capacity:");
        bogies.forEach(System.out::println);

        System.out.println("\nUC7 sorting completed...");
    }
}