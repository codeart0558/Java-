import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector
        Vector<String> vector = new Vector<>();

        // Add elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        // Display the elements in the Vector
        System.out.println("Vector: " + vector);

        // Access an element by index
        System.out.println("Element at index 1: " + vector.get(1));

        // Remove an element from the Vector
        vector.remove("Banana");
        System.out.println("After removing 'Banana': " + vector);

        // Iterate over the Vector
        for (String fruit : vector) {
            System.out.println("Fruit: " + fruit);
        }

        // Check the size of the Vector
        System.out.println("Size of Vector: " + vector.size());
    }
}
