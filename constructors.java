// constructor
 // put
// first programme of constructor
// import java.util.Scanner;
// class C{
//     int id;
//     int Salary;
//     public C(){
//         id = 20000;
//         Salary = 200000;
//         System.out.println(id +" " +  Salary);
//     }
// }
// class Const{
//     public static void main(String[] args){
//     C c = new C();
//     }
// }



// second programme of constructor
// import java.util.Scanner;
// class C{
//     int id;
//     int Salary;
//     public C(int id,int Salary){
//         this.id = id;
//         this.Salary = Salary;
//         System.out.println(id +" " +  Salary);
        
//     }
// }
// class Const{
//     public static void main(String[] args){
//     C c = new C(10,10000);
   
//     }
// }

// constructor overloading : 
// you cannot access both constructors as a single object in Java

// import java.util.Scanner;

// class S{
//     int id;
//     int salary;
//     public S(){
//         System.out.println("this is a constructor only no pass arguments or return arguments");
//         System.out.println("this is your first Constructor");
//     }
//     public S(int id,int salary){
//         this.id = id;
//         this.salary = salary;
//         System.out.println("this is your second Constuctor");
//     }
// }
// class Const{
//    public static void main(String[] args){
//     //  S s = new S(1,100);
    // S s = new S();
//    }
// }


// example 
// class S {
//     int id;
//     int salary;

//     // Default Constructor
//     public S() {
//         // Calls the parameterized constructor
//         System.out.println("This is your first Constructor");
//         this(10, 20); 
//     }

//     // Parameterized Constructor
//     public S(int id, int salary) {
//         this.id = id;
//         this.salary = salary;
//         System.out.println("This is your second Constructor");
//     }
// }

// class Const {
//     public static void main(String[] args) {
//         // S s = new S(1, 100); // Calls the parameterized constructor directly
//         S s2 = new S();      // Calls the default constructor which in turn calls the parameterized constructor
//     }
// }
