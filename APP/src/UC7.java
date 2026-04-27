import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    void display() {
        System.out.println(name + " Bogie - Capacity: " + capacity);
    }
}

public class UC7{

    public static void main(String[] args) {

        System.out.println("===== UC7 : Sort Passenger Bogies by Capacity =====\n");

        // Step 1: Create List of Bogies
        List<Bogie> bogieList = new ArrayList<>();

        // Step 2: Add Passenger Bogies
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair Car", 56));
        bogieList.add(new Bogie("First Class", 24));

        System.out.println("Before Sorting:");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Step 3: Sort using Comparator (by capacity)
        bogieList.sort(Comparator.comparingInt(b -> b.capacity));

        // Step 4: Display Sorted Bogies
        System.out.println("\nAfter Sorting by Capacity (Ascending):");
        for (Bogie b : bogieList) {
            b.display();
        }

        // Step 5: Sorting in Descending order (for planning)
        bogieList.sort(Comparator.comparingInt((Bogie b) -> b.capacity).reversed());

        System.out.println("\nAfter Sorting by Capacity (Descending):");
        for (Bogie b : bogieList) {
            b.display();
        }

        System.out.println("\nProgram Completed Successfully.");
    }
}
