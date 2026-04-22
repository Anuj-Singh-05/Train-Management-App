import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }

        @Override
        public String toString() {
            return type + " [" + cargo + "]";
        }
    }

    public static void main(String[] args) {
        // Display banner
        System.out.println("===============================================");
        System.out.println(" UC12 - Safety Compliance Check (allMatch) ");
        System.out.println("===============================================\n");

        // Initialize list of goods bogies
        List<GoodsBogie> goodsConsist = new ArrayList<>();
        goodsConsist.add(new GoodsBogie("Open", "Coal"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsConsist.add(new GoodsBogie("Box", "Grain"));
        goodsConsist.add(new GoodsBogie("Cylindrical", "Petroleum"));

        System.out.println("Inspecting Goods Consist:");
        goodsConsist.forEach(System.out::println);

        // ---- Safety Rule: Cylindrical bogies must only carry Petroleum ----
        // allMatch returns true only if EVERY bogie passes the test
        boolean isSafe = goodsConsist.stream().allMatch(b -> {
            if (b.type.equalsIgnoreCase("Cylindrical")) {
                return b.cargo.equalsIgnoreCase("Petroleum");
            }
            return true; // Non-cylindrical bogies are safe by default here
        });

        System.out.println("\n-----------------------------------------------");
        if (isSafe) {
            System.out.println(" STATUS: COMPLIANT - Train is safe for departure.");
        } else {
            System.out.println(" STATUS: DANGER - Safety violation detected!");
        }
        System.out.println("-----------------------------------------------");

        System.out.println("\nUC12 safety validation completed successfully...");
    }
}