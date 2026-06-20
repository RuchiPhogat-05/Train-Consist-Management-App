import java.util.LinkedList;

public class UC4 {

    public static void main(String[] args) {

        // Step 1: Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("=== Train Consist Management System (UC4) ===");

        // Step 2: Add bogies in order
        trainConsist.addFirst("Engine");      // Add at beginning
        trainConsist.addLast("Sleeper");      // Add at end
        trainConsist.addLast("AC Coach");
        trainConsist.addLast("Cargo Bogie");
        trainConsist.addLast("Guard Coach");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Step 3: Insert Pantry Car at position 2 (index 2)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Adding Pantry Car at Position 2:");
        System.out.println(trainConsist);

        // Step 4: Remove first and last bogie
        trainConsist.removeFirst();   // remove Engine
        trainConsist.removeLast();    // remove Guard Coach

        // Step 5: Display final consist
        System.out.println("\nFinal Ordered Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println("-> " + bogie);
        }
    }
}