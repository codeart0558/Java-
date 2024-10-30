import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of Strings
        TreeSet<String> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Mango");

        // Display the elements in sorted order
        System.out.println("TreeSet (Sorted): " + treeSet);

        // Check if an element exists
        System.out.println("Contains 'Apple'? " + treeSet.contains("Apple"));

        // Remove an element
        treeSet.remove("Banana");
        System.out.println("After removing 'Banana': " + treeSet);

        // Retrieve the first and last elements
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());
    }
}
