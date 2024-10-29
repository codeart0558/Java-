// arguments = actual value
// prameter = parameter
//-------------1. one method-------------
// syntex of by using extending thred class

// import java.util.Scanner;
// class MyThred extends Thread{
//     @override
//     public void run(){

//     }
// }
// class Multithreading{
//   public static void main(String[] args){

//   }
// }

// code : example

// import java.util.Scanner;
// // thread one
// class MyThred1 extends Thread{
//     @Override
//     public void run(){
//             int i = 1;
//            while(i<5){
//             System.out.println("my Thred 1 is running");
//             System.out.println("i am happy!!!");
//             i++;
//            }
//     }
// }
// // thread two
// class MyThred2 extends Thread{
//     @Override
//     public void run(){
//         int i=0;
//            while(i<5){
//             System.out.println("my Thred 2 is running");
//             System.out.println("i am sad!!!");
//             i++;
//            }
//     }
// }
// class Multithreading{
//   public static void main(String[] args){
//       MyThred1 t1 = new MyThred1();
//       MyThred2 t2 = new MyThred2();
//       t1.start();
//       t2.start();
//   }
// }

/* O/P:
PS D:\java_practical> javac Multithreading.java
PS D:\java_practical> java Multithreading      
my Thred 1 is running
my Thred 2 is running
i am sad!!!
my Thred 2 is running
i am sad!!!
my Thred 2 is running
i am happy!!!
my Thred 1 is running
i am sad!!!
my Thred 2 is running
i am happy!!!
my Thred 1 is running
i am sad!!!
my Thred 2 is running
i am happy!!!
my Thred 1 is running
i am happy!!!
i am sad!!!
PS D:\java_practical> */

//------------------2. method use-----
// by using implementing runnabl interface : 
// syntext with code :

// import java.util.Scanner;
// // thread1
// class MyThredRunnable1 implements Runnable{
//      public void run(){
//         int i=1;
//         while(i < 3){
//         System.out.println("this is runnable thread 1!!!");
//         i++;
//         }
//      }
// }
// // tread 2

// class MyThredRunnable2 implements Runnable{
//      public void run(){
//         int i=0;
//         while(i < 3){
//         System.out.println("this is runnable thread 2!!!");
//          i++;
//         }
//      }
// }
// class Multithreading{
//     public static void main(String[] args){
//          MyThredRunnable1 run1 = new MyThredRunnable1();
//          Thread t1 = new Thread(run1);

//          MyThredRunnable2 run2 = new MyThredRunnable2();
//          Thread t2 = new Thread(run2);

         
//          t1.start();
//          t2.start();
//     }
// }

/* O/P:
PS D:\java_practical> javac Multithreading.java
PS D:\java_practical> java Multithreading      
this is runnable thread 1!!!
this is runnable thread 1!!!
this is runnable thread 2!!!
this is runnable thread 2!!!
this is runnable thread 2!!!
PS D:\java_practical> */

//---------------------------Thread class Constructor----------------------------
// Each thread has a that own id we can also print that id
//__________________________________________________________________________________
// using extends

// import java.util.Scanner;
// class MyThred extends Thread{
//      public MyThred(String name)
//      {
//           super(name); 
//      }
//      public void run(){
//           int i=0;
//           while(i < 4){
//                System.out.println("i am a thread");
//                i++;
//           }
//      }
// }
// class Multithreading{
//      public static void main(String[] args){
//           MyThred t1 = new MyThred("drashti");
//           MyThred t2 = new MyThred("patoliya");
          
//           t1.start();
//           t2.start();
          
//           System.out.println("thread id a  : " + t1.getId());
//           System.out.println("thread name a  : " + t1.getName());
          
//           System.out.println("thread id a  : " + t2.getId());
//           System.out.println("thread name a  : " + t2.getName());
//      }
// }

// 1.  public MyThred(String name)
//      {
//           super(name); 
//      }

//      means MyThred class extends Thread class and in that thread class constructor called using super method means
//      passed value int that constrctor using super method  


// runnableimport java.util.Scanner;

// class MyThread implements Runnable {
//     private String name;

//     public MyThread(String name) {
//         this.name = name;
//     }

//     @Override
//     public void run() {
//         int i = 0;
//         while (i < 4) {
//             System.out.println("I am a thread - " + name);
//             i++;
//         }
//     }
// }

// public class Multithreading {
//     public static void main(String[] args) {
//         MyThread run1 = new MyThread("drashti");
//         Thread t1 = new Thread(run1, "drashti");

//         MyThread run2 = new MyThread("patoliya");
//         Thread t2 = new Thread(run2, "patoliya");

//         t1.start();
//         t2.start();

//         System.out.println("Thread ID for t1: " + t1.getId());
//         System.out.println("Thread name for t1: " + t1.getName());

//         System.out.println("Thread ID for t2: " + t2.getId());
//         System.out.println("Thread name for t2: " + t2.getName());
//     }
// }


//-----------------Thread priority----------------
// java.lang.Thread.MIN_PRIORITY = 1
// java.lang.Thread.NORM_PRIORITY = 5
// java.lang.Thread.MAX_PRIORITY = 10
//_____________________________________________

// class MyThred1 extends Thread{
//      public MyThred1(String name)
//      {
//           super(name); 
//      }
//      public void run(){
//           int i=0;
//           while(i < 4){
//                System.out.println(this.getName());
//                i++;
//           }
//      }
// }
// class Multithreading{
//      public static void main(String[] args){
//        MyThred1 t1 = new MyThred1("drashti");
//        MyThred1 t2 = new MyThred1("drashti1");
//        MyThred1 t3 = new MyThred1("drashti2");
//        MyThred1 t4 = new MyThred1("drashti8");
//        MyThred1 t5 = new MyThred1("most importance");
// t5.setPriority(Thread.MAX_PRIORITY);
//        t1.start();
//        t2.start();
//        t3.start();
//        t3.start();
//        t4.start();
//        t5.start();
//      }
// }

// ---------------Thread Methods---------------
//________________________________________________
// runnable method
// class MyThread implements Runnable {
//     private String name;

//     public MyThread(String name) {
//         this.name = name;
//     }

//     @Override
//     public void run() {
//         for (int i = 1; i <= 3; i++) {
//             System.out.println(name + " - Count: " + i);
//             try {
//                 Thread.sleep(500); // Pause for 500 milliseconds to simulate work
//             } catch (InterruptedException e) {
//                 // Ignoring the exception for this example
//             }
//         }
//         System.out.println(name + " has finished execution.");
//     }
// }

// public class Multithreading {
//     public static void main(String[] args) {
//         MyThread run1 = new MyThread("Thread-1");
//         MyThread run2 = new MyThread("Thread-2");

//         Thread t1 = new Thread(run1);
//         Thread t2 = new Thread(run2);

//         t1.start();
//         t2.start();

//         // Using join() without exception handling
//         t1.join();
//         System.out.println("Main thread waited for Thread-1 to finish.");

//         t2.join();
//         System.out.println("Main thread waited for Thread-2 to finish.");

//         System.out.println("Both threads have finished execution. Main thread continues...");
//     }
// }



// extends
// class MyThread extends Thread {
//     public MyThread(String name) {
//         super(name);
//     }

//     @Override
//     public void run() {
//         for (int i = 1; i <= 3; i++) {
//             System.out.println(getName() + " - Count: " + i);
//             try {
//                 Thread.sleep(500); // Pause for 500 milliseconds to simulate work
//             } catch (InterruptedException e) {
//                 System.out.println(e.getMessage());
//             }
//         }
//         System.out.println(getName() + " has finished execution.");
//     }
// }

// public class Multithreading {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread("Thread-1");
//         MyThread t2 = new MyThread("Thread-2");

//         t1.start();
//         t2.start();

//         try {
//             t1.join(); // Main thread waits for t1 to finish
//             System.out.println("Main thread waited for Thread-1 to finish.");

//             t2.join(); // Main thread waits for t2 to finish
//             System.out.println("Main thread waited for Thread-2 to finish.");
//         } catch (InterruptedException e) {
//             System.out.println(e.getMessage());
//         }

//         System.out.println("Both threads have finished execution. Main thread continues...");
//     }
// }
