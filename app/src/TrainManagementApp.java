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
    }

    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC13 - Performance Comparison (Loops vs Streams) ");
        System.out.println("===============================================\n");

        // Initialize a larger dataset to see measurable differences
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));
        }

        // ---- 1. LOOP-BASED FILTERING ----
        long startLoop = System.nanoTime();
        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }
        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // ---- 2. STREAM-BASED FILTERING ----
        long startStream = System.nanoTime();
        List<Bogie> streamFiltered = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Display results
        System.out.println("Benchmark Results (for " + bogies.size() + " bogies):");
        System.out.println("Loop-based Time   : " + loopTime + " ns");
        System.out.println("Stream-based Time : " + streamTime + " ns");
        
        System.out.println("\nVerification:");
        System.out.println("Loop results size   : " + loopFiltered.size());
        System.out.println("Stream results size : " + streamFiltered.size());

        if (loopTime < streamTime) {
            System.out.println("\nOutcome: Loop-based processing was FASTER in this instance.");
        } else {
            System.out.println("\nOutcome: Stream-based processing was FASTER in this instance.");
        }

        System.out.println("\nUC13 performance comparison completed successfully...");
    }
}