import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with Integer keys and String values
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(4, "Orange");
        treeMap.put(2, "Mango");

        // Display the elements in sorted order of keys
        System.out.println("TreeMap (Sorted by Key): " + treeMap);

        // Access a value by key
        System.out.println("Value for key 2: " + treeMap.get(2));

        // Remove a key-value pair
        treeMap.remove(3);
        System.out.println("After removing key 3: " + treeMap);

        // Retrieve the first and last entries
        System.out.println("First entry: " + treeMap.firstEntry());
        System.out.println("Last entry: " + treeMap.lastEntry());
    }
}
