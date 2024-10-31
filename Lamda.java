@FunctionalInterface
interface MyFunctionalInterface {
    void display(String message);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Using lambda expression to implement display method
        MyFunctionalInterface obj = (message) -> System.out.println("Message: " + message);
        obj.display("Hello, Lambda!");
    }
}


// using runnable interface
public class LambdaRunnable {
    public static void main(String[] args) {
        // Traditional way
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running using Anonymous class");
            }
        };
        new Thread(runnable).start();

        // Using lambda expression
        Runnable lambdaRunnable = () -> System.out.println("Running using Lambda expression");
        new Thread(lambdaRunnable).start();
    }
}


// using  comparator
import java.util.Arrays;
import java.util.Comparator;

public class LambdaComparator {
    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob", "Charlie"};

        // Using lambda to define the Comparator for sorting in reverse order
        Comparator<String> comparator = (s1, s2) -> s2.compareTo(s1);
        Arrays.sort(names, comparator);

        System.out.println(Arrays.toString(names)); // Output: [John, Charlie, Bob, Alice]
    }
}
