// methods also you can use 

// insert addFirst() (throw exception) or offerFirst(e) (for a special value)
// insert addLast() (throw exception) or offerLast(e) (for a special value)

// remove removeFirst() (throw exception) or pollFirst() (for a special value)
// remove removeLast() (throw exception) or pollLast() (for a special value)

// examine getFirst() (throw exception) or peekFirst()
// examine getLast() (throw exception) or peekLast()
import java.util.*;

class CollectionFrameworkArrayDeque {
    public static void main(String[] args) {
        // Create an ArrayDeque instance
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the deque
        deque.add("First");
        deque.addLast("Second");
        deque.addFirst("Zero");

        // Display the elements in the deque
        System.out.println("Deque: " + deque);

        // Access elements
        System.out.println("First Element: " + deque.getFirst());
        System.out.println("Last Element: " + deque.getLast());

        // Remove elements
        deque.removeFirst();
        deque.removeLast();

        // Display the deque after removals
        System.out.println("Deque after removals: " + deque);
    }
}
