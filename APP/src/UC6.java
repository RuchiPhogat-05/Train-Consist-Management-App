import java.util.HashMap;
import java.util.Map;

public class UC6 {

    public static void main(String[] args) {

        System.out.println("===== UC6 : Train Consist Management System =====");
        System.out.println("Mapping Bogie → Capacity using HashMap\n");

        // Step 1: Create HashMap to store Bogie and Capacity
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Step 2: Insert Passenger Bogies with seating capacity
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair Car", 78);
        bogieCapacityMap.put("First Class", 24);

        // Step 3: Insert Goods Bogies with load capacity (in tons)
        bogieCapacityMap.put("Rectangular Goods", 60);
        bogieCapacityMap.put("Cylindrical Tanker", 65);

        System.out.println("Bogie-Capacity mapping created successfully!\n");

        // Step 4: Display Map Contents using entrySet()
        System.out.println("---- Train Bogie Capacity Report ----");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogieName = entry.getKey();
            int capacity = entry.getValue();

            System.out.println("Bogie: " + bogieName + " | Capacity: " + capacity);
        }

        // Step 5: Demonstrate Fast Lookup
        System.out.println("\n---- Capacity Lookup ----");
        String searchBogie = "Sleeper";

        if (bogieCapacityMap.containsKey(searchBogie)) {
            System.out.println("Capacity of " + searchBogie + " bogie = "
                    + bogieCapacityMap.get(searchBogie));
        } else {
            System.out.println("Bogie not found!");
        }

        System.out.println("\nProgram Completed Successfully.");
    }
}
