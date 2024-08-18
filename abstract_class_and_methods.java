// what is abstract?
// existing in thougth or as an idea without concret existance
// abstract method is declared without an implementation (not implemented)
// abstarct class includes abstarct methods, then the class itself must be declared abstract
// one abstract method make  entier class abstract  

import java.util.Scanner;
abstract class Parent{
    public Parent(){
        System.out.println("i am base class constructore");
    }
    public void sayhello(){
         System.out.println("hello");
    }
    abstract public void greet();
}

class Child extends Parent{
         @Override
    public void greet(){
        System.out.println("good morning");
    }
}


// abstract class Childs extends Parent{
//     public void greet(){
//         System.out.println("Bad morning");
//     }
// } can not create object 
class Methods{
    public static void main(String[] args){
         Child c = new Child();
         c.sayhello();
    }
}