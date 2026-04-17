import java.util.LinkedList;
import java.util.List;

public class TrainManagementApp {
    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("===============================================\n");

        // Use LinkedList to model the physical chaining of bogies
        LinkedList<String> trainConsist = new LinkedList<>();

        // ---- ADD bogies in sequence ----
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // ---- INSERT at specific position ----
        // Inserting 'Pantry Car' at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // ---- REMOVE from front and rear ----
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}