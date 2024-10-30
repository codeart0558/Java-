import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of integers (min-heap by default)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(5);

        // Display the elements in the priority queue
        System.out.println("Priority Queue elements:");
        System.out.println(priorityQueue); // It may not show in sorted order due to heap structure

        // Remove and print elements based on priority
        System.out.println("\nElements retrieved in priority order:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
