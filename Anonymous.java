// import java.util.*;
// interface DemoAno {
//     void math1();
//     void math2();
// }

// class AnonyDemo implements DemoAno {

//     public void display() {
//         System.out.println("Hello");
//     }

//     @Override
//     public void math1() {
//         System.out.println("I am math1");
//     }

//     @Override
//     public void math2() {
//         System.out.println("I am math2");
//     }
// }

// class LambdaExpression {
//     public static void main(String[] args) {
//         AnonyDemo obj = new AnonyDemo();
//         obj.math1();
//     }
// }



// // ex 2
// import java.util.*;

// interface DemoAno {
//     void math1();
//     void math2();
// }

// class LambdaExpression {
//     public static void main(String[] args) {
//         // Using an anonymous class to implement the DemoAno interface
//         DemoAno obj = new DemoAno() {
//             @Override
//             public void math1() {
//                 System.out.println("I am math1 (from anonymous class)");
//             }

//             @Override
//             public void math2() {
//                 System.out.println("I am math2 (from anonymous class)");
//             }
//         };

//         // Calling the methods
//         obj.math1();
//         obj.math2();
//     }
// }
