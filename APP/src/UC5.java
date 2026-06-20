import java.util.LinkedHashSet;
import java.util.Set;

public class UC5 {

    public static void main(String[] args) {

        // LinkedHashSet to store train bogies
        Set<String> trainFormation = new LinkedHashSet<>();

        System.out.println("=== Train Consist Management : UC5 ===");
        System.out.println("Attaching bogies to the train...\n");

        // Adding bogies (Insertion order preserved)
        trainFormation.add("Engine");
        trainFormation.add("Sleeper Coach");
        trainFormation.add("AC Chair Coach");
        trainFormation.add("Goods Bogie - Rectangular");
        trainFormation.add("Guard Van");

        // Intentionally adding duplicate bogie
        trainFormation.add("Sleeper Coach");  // Duplicate (will be ignored)

        // Printing final formation
        System.out.println("Final Train Formation (Insertion Order Preserved):\n");

        int position = 1;
        for (String bogie : trainFormation) {
            System.out.println(position + ". " + bogie);
            position++;
        }

        // Display total count
        System.out.println("\nTotal Unique Bogies Attached: " + trainFormation.size());
    }
}