import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Orange");

        // Display the elements in the Hashtable
        System.out.println("Hashtable: " + hashtable);

        // Access a value by key
        System.out.println("Value for key 2: " + hashtable.get(2));

        // Remove a key-value pair
        hashtable.remove(3);
        System.out.println("After removing key 3: " + hashtable);

        // Iterate over the Hashtable
        for (Integer key : hashtable.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }
    }
}
