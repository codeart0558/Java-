import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet of Strings
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Add elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");  // Duplicate element, will not be added

        // Display the elements in the set
        System.out.println("LinkedHashSet: " + set);

        // Check if a specific element is in the set
        System.out.println("Contains 'Banana'? " + set.contains("Banana"));

        // Remove an element from the set
        set.remove("Orange");
        System.out.println("After removing 'Orange': " + set);

        // Display the size of the set
        System.out.println("Size of LinkedHashSet: " + set.size());
    }
}
