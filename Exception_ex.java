// three types of error in java

//1. syntext error :
/*
 class Exception_ex{
    public static void main(String[] args){
       System.out.println("i am the best")  // here is a error of ;
    }
 } */

//2. logical error
// prime number : dived by self or 1
/*
class Exception_ex{
    public static void main(String[] args){
       for(int i=0;i<5;i++){
        System.out.println(2*i*1);  //  9 is not a prime number even that print here thir is logcal error 
       }
    }
}
*/

// runtime error --> also called exceptions!
/* 
//example 2
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}

// example 1
public class ExceptionExample {
    public static void main(String[] args) {
        String text = null;
        
        try {
            System.out.println(text.length()); // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access an object that is null.");
        }
    }
}

//example 3
ArrayIndexOutOfBoundsException - Accessing an invalid array index

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]); // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Index out of bounds.");
        }
    }
}

//example 4   Invalid conversion from a string to a number
public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String str = "abc";
        try {
            int number = Integer.parseInt(str); // This will cause NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid string-to-integer conversion.");
        }
    }
}

// example 5 File not found on reading  

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            Scanner scanner = new Scanner(file); // This will cause FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: File not found.");
        }
    }
}


example of nested try catch

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Outer try block started.");

            // Outer operation that may throw an exception
            try {
                System.out.println("Inner try block started.");
                
                // This will cause ArithmeticException
                int result = 10 / 0; 
                System.out.println("Result: " + result);

                // This line won't be reached due to exception above
                System.out.println(numbers[5]); // This will cause ArrayIndexOutOfBoundsException

            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            }
            
            // Outer operation that might throw a different exception
            System.out.println(numbers[5]); // This will cause ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException in outer catch: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}


*/

