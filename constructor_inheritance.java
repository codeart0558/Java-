
/* note:
- derived class object call aslo base class constructor
- if i want to access base class with arguments cpnstructor use super keyword
*/

// first programme to use super method
// import java.util.Scanner;
// class Base{
//     private int x;
//     public Base(){
//         System.out.println("i am base class constructor");
//     }
//     public Base(int x){
//         System.out.println("overloaded constructor value is  : " + x);
//     }
    
// }
// class Derived extends Base{
//     int y;
//     public Derived(int _y){
//         super(90);
//         y = _y;
//          System.out.println("y : " + y);
//     }
// }
// class In{
//     public static void main(String[] args){
//      Derived d = new Derived(5);
    
//     }
// }

// second way to use super method
// import java.util.Scanner;
// class Base{

//     public Base(){
//         System.out.println("i am base class constructor");
//     }
//     public Base(int x){
//         System.out.println("overloaded constructor value is  : " + x);
//     }
    
// }
// class Derived extends Base{

//     public Derived(){
//         System.out.println("i am a derived class constructor");
//     }
    
//     public Derived(int x,int y){
//         super(x);
//         System.out.println("i am a derived class overloaded constructor : " + y);
//     }
// }
// class In{
//     public static void main(String[] args){
//      Derived d = new Derived(5,10);
    
//     }
// }



// second way to use super method
// import java.util.Scanner;
// class Base{

//     public Base(){
//         System.out.println("i am base class constructor");
//     }
//     public Base(int x){
//         System.out.println("overloaded constructor value is  : " + x);
//     }
    
// }
// class Derived extends Base{

//     public Derived(){
//         System.out.println("i am a derived class constructor");
//     }
    
//     public Derived(int x,int y){
//         super(x);
//         System.out.println("i am a derived class overloaded constructor : " + y);
//     }
// }

// class Childofderived extends Derived{
//     public Childofderived(){
//         System.out.println("i am a Childofderived class constructor");
//     }
    
//     public Childofderived(int x,int y,int z){
//         super(x, y);
//         System.out.println("i am a Childofderived class overloaded constructor : " + z);
//     }
// }
// class In{
//     public static void main(String[] args){
//      Childofderived d = new Childofderived(5,10,89);
    
//     }
// }