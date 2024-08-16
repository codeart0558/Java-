// what is method overriding ?
import java.util.Scanner;

class A{
    public void method(){
        System.out.println("i am mrthod A");
    }
}


class B extends A{
    @Override
    public void method(){
        System.out.println("i am mrthod b");
    }
}

class Overriding{
public static void main(String[] args){
   A a = new A();
   a.method();

B b = new B();
   b.method();
}
}