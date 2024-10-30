import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");

        // Display the elements in the map
        System.out.println("HashMap: " + map);

        // Access a value by key
        System.out.println("Value for key 2: " + map.get(2));

        // Remove a key-value pair
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // Iterate over the map
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
