import java.util.ArrayList;
import java.util.List;

public class UC2 {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // Add passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display bogies after insertion
        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Display bogies after removal
        System.out.println("\nPassenger bogies after removal of AC Chair:");
        System.out.println(passengerBogies);

        // Check existence of a bogie
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nDoes Sleeper bogie exist? " + exists);

        // Final state of list
        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);

        // Program continues...
    }
}
